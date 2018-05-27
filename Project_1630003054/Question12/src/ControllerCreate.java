public class ControllerCreate extends Controller {
    public ControllerCreate(Bank m) {
        super(m);
    }

    public String create(String name, String amount, int type){
        try{
            if (type == 0){
                m.addAccount(new CreditAccount(name, Integer.parseInt(amount)));
            }else if(type == 1) {
                m.addAccount(new StudentAccount(name, Integer.parseInt(amount)));
            }
        } catch (NotEnoughMoneyException e){
            return e.getMessage();
        } catch (NumberFormatException e){
            return e.getMessage();
        }
        return "";
    }
}
