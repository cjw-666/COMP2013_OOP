public class ControllerGetMoney extends Controller {
    public ControllerGetMoney(Bank m) {
        super(m);
    }

    public String getMoney(String name){
        try{
            String money = Integer.toString(m.getMoney(name)); // convert the int to string
            return money;
        }catch (UnknownCustomerException e){
            return e.getMessage(); // return as result
        }
    }
}
