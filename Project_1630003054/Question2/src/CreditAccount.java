public class CreditAccount extends Account {
    public CreditAccount(String name, int money) {
        super(name, money);
    }

    @Override
    public void withdraw(int amount) {
        this.setMoney(getMoney() - amount); // negative amount of money is allow
    }

    public static void testCreditAccount(){
        CreditAccount testCA = new CreditAccount("Test Account", 100);
        System.out.println(testCA.getName().equals("Test Account"));
        System.out.println(testCA.getMoney() == 100);
        testCA.setMoney(500);
        System.out.println(testCA.getMoney() == 500);
        testCA.withdraw(100);
        System.out.println(testCA.getMoney() == 400);
    }
}