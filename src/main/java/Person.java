public class Person {
    private String name;
    private Mobile mobile;
    public Person(String name,Mobile mobile) {
        this.name = name;
        this.mobile=mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void useMobile(String para){
        System.out.println("Message : "+para);
    }
}
