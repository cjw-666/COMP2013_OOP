public class StudentAccount extends Account {
    public StudentAccount(String name, int money) throws NotEnoughMoneyException {
        super(name, money);
        if (money < 0) {
            throw new NotEnoughMoneyException("Cannot create student account with negative amount of money");
        }
    }

    @Override
    public void withdraw(int amount) throws NotEnoughMoneyException {
        if (getMoney() - amount < 0) {
            throw new NotEnoughMoneyException("Cannot withdraw " + amount + " yuan from account, only " + getMoney() + " yuan is available");
        } else {
            setMoney(getMoney() - amount);
        }

    }

    public static void testStudentAccount(){
        try{
            // try to create a student account with a negative amount of money
            StudentAccount testSA1 = new StudentAccount("Test Student Account", -10);
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }

        try{
            StudentAccount testSA2 = new StudentAccount("Test Student Account", 100);
            System.out.println(testSA2.getMoney() == 100);
            testSA2.withdraw(50);
            System.out.println(testSA2.getMoney() == 50);
            // try to withdraw a huge amount of money
            testSA2.withdraw(120);
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }
    }
}
