import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("A", 200.0f, 5.0f, 20.0f));
        products.add(new Product("B", 300.0f, 6.0f, 25.0f));
        products.add(new Product("C", 400.0f, 8.0f, 30.0f));

        Order o1 = new Order("LiXiang", new Date(), products);
        Order o2 = deepClone(o1);

        o2.getPruducts().get(0).setName("D");
        o2.getPruducts().get(1).setName("E");
        o2.getPruducts().get(2).setName("F");

        System.out.println("products of o1:");
        printProducts(o1.getPruducts());

        System.out.println("products of o2:");
        printProducts(o2.getPruducts());
    }

    private static void printProducts(List<Product> products) {
        for (Product p : products) {
            System.out.println(p.toString());
        }

    }

    // TODO: 这里实现深拷贝实现方法
    public static <T> T deepClone(T obj) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        序列化
//        Gson gson = new Gson();
//        String s = gson.toJson(obj);
//        return (T) gson.fromJson(s, Class.forName(obj.getClass().getName()));


        //文件流,需要序列化接口
//        ByteArrayOutputStream bo = new ByteArrayOutputStream();
//        ObjectOutputStream oo = new ObjectOutputStream(bo);
//        oo.writeObject(obj);
//        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
//        ObjectInputStream oi = new ObjectInputStream(bi);
//        return (T) oi.readObject();


        //反射方案,需要无参构造
        Object target = obj.getClass().newInstance();
        Class sourceClazz = obj.getClass();
        Class targetClazz = target.getClass();
        Field[] sourceFields = getAllFields(sourceClazz);
        Field[] targetFields = getAllFields(targetClazz);
        for (Field sourceField : sourceFields) {
            //抑制访问检查
            sourceField.setAccessible(true);
            for (Field targetField : targetFields) {
                if (targetField.getName().equals(sourceField.getName()) && targetField.getType() == sourceField.getType()) {
                    int mod = targetField.getModifiers();
                    //静态变量和final变量不进行复制
                    if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                        continue;
                    }
                    targetField.setAccessible(true);
                    targetField.set(target, sourceField.get(obj));
                    break;
                }
            }
        }
        return (T) target;
    }

    public static Field[] getAllFields(final Class<?> cls) {
        final List<Field> allFieldsList = getAllFieldsList(cls);
        return allFieldsList.toArray(new Field[allFieldsList.size()]);
    }

    public static List<Field> getAllFieldsList(final Class<?> cls) {
        final List<Field> allFields = new ArrayList<Field>();
        Class<?> currentClass = cls;
        while (currentClass != null) {
            final Field[] declaredFields = currentClass.getDeclaredFields();
            Collections.addAll(allFields, declaredFields);
            //也需要获取父类的属性
            currentClass = currentClass.getSuperclass();
        }
        return allFields;
    }

}