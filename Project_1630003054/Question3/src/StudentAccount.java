public class StudentAccount extends Account{
    public StudentAccount(String name, int money) throws NotEnoughMoneyException{
        if (money >= 0){
            super(name, money);
        }else{
            throw new NotEnoughMoneyException("Cannot create student account with negative amount of money.");
        }
        //TODO
    }

    @Override
    public void withdraw(int amount) {

    }
}
