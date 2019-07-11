public class Android extends Mobile{
    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String para) {
        if(para.length()>15){
            System.err.println("<Andriod> Message cannot be sent");
        }else{
            System.out.println("<Andriod>Message : "+para);

        }
    }
}
