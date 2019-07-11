public class IPhone extends Mobile{

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String para) {
        if(para.length()>20){
            System.err.println("<iPhone> Message cannot be sent");
        }else{
            System.out.println("<iPhone>Message : "+para);

        }
    }
}
