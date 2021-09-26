import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
    public Order() {
    }

    public Order(String owner, Date createTime, List<Product> products) {
        this.owner = owner;
        this.createTime = createTime;
        this.pruducts = products;
    }

    private String owner;
    private Date createTime;
    private String state;
    private List<Product> pruducts;
    private String mailCompony;
    private String mailOrderNo;
    private String mailAddr;

    public Order(String owner, Date time) {
        this.owner = owner;
        this.createTime = time;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Product> getPruducts() {
        return pruducts;
    }

    public void setPruducts(List<Product> pruducts) {
        this.pruducts = pruducts;
    }

    public String getMailCompony() {
        return mailCompony;
    }

    public void setMailCompony(String mailCompony) {
        this.mailCompony = mailCompony;
    }

    public String getMailOrderNo() {
        return mailOrderNo;
    }

    public void setMailOrderNo(String mailOrderNo) {
        this.mailOrderNo = mailOrderNo;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

}