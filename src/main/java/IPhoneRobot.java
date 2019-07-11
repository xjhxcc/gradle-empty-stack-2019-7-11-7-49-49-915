public class IPhoneRobot{
    public IPhoneRobot() {
    }
    public void useIphone(Mobile obj,String para){
        if(obj.getClass()!=IPhone.class){
            System.err.println("error");
        }else{
            obj.makeACall(para);
        }
    }
    public void useIphone2(IPhone obj,String para){
            obj.makeACall(para);
    }
}
