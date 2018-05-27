import java.util.ArrayList;

public class Bank {

    private String name;

    private ArrayList<IAccount> accounts;

    private ArrayList<ModelListener> listeners;

    private ArrayList<Integer> history;

    public Bank(String name) {
        this.name = name;
        // an arraylist was create when bank is created
        this.accounts = new ArrayList<IAccount>();
        // arraylist use to store listeners
        listeners = new ArrayList<ModelListener>();
        history = new ArrayList<Integer>(); // Arraylist for Integer
        history.add(new Integer(0)); // init status of a bank with 0 money
    }

    public void addListener(ModelListener listener){
        listeners.add(listener);
    }

    public ArrayList<Integer> getHistory(){
        return history;
    }

    private void notifyListeners(){
        for(ModelListener listener: listeners){
            listener.update(); // update every listeners
        }
    }

    public void addAccount(IAccount account){
        accounts.add(account);
        history.add(totalMoney());
        notifyListeners();
    }

    public int totalMoney(){
        int allMoney = 0;
        for (IAccount account: accounts){
            allMoney += account.getMoney();
        }
        return allMoney;
    }

    public int getMoney(String name) throws UnknownCustomerException{
        for (IAccount account: accounts){
            if(account.getName().equals(name)){
                return account.getMoney();
            }
        }
        throw new UnknownCustomerException("Customer " + name + " unknown");
    }

    public void withdraw(String name, int amount) throws UnknownCustomerException, NotEnoughMoneyException{
        for (IAccount account: accounts){
            if(account.getName().equals(name)){
                account.withdraw(amount);
                history.add(totalMoney());
                notifyListeners();
                return; // do not throws exception after match
            }
        }
        throw new UnknownCustomerException("Customer " + name + " unknown");
    }

    public static void testBank(){
        CreditAccount testA1 = new CreditAccount("testAccount1", 100);
        CreditAccount testA2 = new CreditAccount("testAccount2", 200);
        Bank bank1 = new Bank("ICBC");
        bank1.addAccount(testA1);
        bank1.addAccount(testA2);

        System.out.println(bank1.totalMoney() == 300);
        try {
            System.out.println(bank1.getMoney("testAccount1") == 100);
            System.out.println(bank1.getMoney("testAccount2") == 200);
            System.out.println(bank1.getMoney("testAccount3") == 0); // unknown customer
        }catch (UnknownCustomerException e){
            System.out.println(e.getMessage());
        }
        try{
            bank1.withdraw("testAccount1", 100);
            System.out.println(bank1.getMoney("testAccount1") == 0);
            bank1.withdraw("testAccount2", 100);
            System.out.println(bank1.getMoney("testAccount2") == 100);
            bank1.withdraw("testAccount3", 100); // unknown customer
        }catch (UnknownCustomerException | NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }
    }
}
