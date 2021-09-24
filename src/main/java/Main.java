import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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
    public static <T> T deepClone(T obj) throws IOException, ClassNotFoundException {
        //序列化
        Gson gson = new Gson();
        String s = gson.toJson(obj);
        return (T) gson.fromJson(s, Class.forName(obj.getClass().getName()));



        // //文件流
//        ByteArrayOutputStream bo=new ByteArrayOutputStream();
//        ObjectOutputStream oo=new ObjectOutputStream(bo);
//        oo.writeObject(obj);
//        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
//        ObjectInputStream oi=new ObjectInputStream(bi);
//        return (T) oi.readObject();

    }
}