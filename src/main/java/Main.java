public class Main {

    public static void main(String[] args) {
        Mobile mobile=new Mobile("phone","blue","oppo");
        System.out.println(mobile);
        mobile.makeACall("use a mobile");
        System.out.println("----------------------------");
        IPhone iphone=new IPhone("phone","black","iphone");
        System.out.println(iphone);
        iphone.makeACall("use a iphone");
        System.out.println("----------------------------");
        Android android=new Android("andriod","white","vivo");
        System.out.println(android);
        android.makeACall("use a android mobile");
        System.out.println("----------------------------");
        Person person = new Person("lin",iphone);
        person.useMobile("use a mobile");
        System.out.println("----------------------------");
        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        //iPhoneRobot.useIphone(android,"I want a android");
        iPhoneRobot.useIphone(iphone,"use a iphone ");

        person.setMobile(new Mobile("iphone2","pink","honor"));
        person.useMobile("change phone");

    }
}
