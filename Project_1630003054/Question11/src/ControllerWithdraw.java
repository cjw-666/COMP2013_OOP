public class ControllerWithdraw extends Controller {
    public ControllerWithdraw(Bank m) {
        super(m);
    }
    public String withdraw(String name, String amount){
        try{
            m.withdraw(name, Integer.parseInt(amount));
            return ""; // no exception: return empty string
        }catch (UnknownCustomerException e){
            return e.getMessage();
        }catch (NotEnoughMoneyException e){
            return e.getMessage();
        }catch (NumberFormatException e){
            return e.getMessage();
        }
    }
}
