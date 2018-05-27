public class GUI {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Bank bank = new Bank("UICBank");
                /*try {
                    StudentAccount sa = new StudentAccount("AAA", 500); // add test account
                    bank.addAccount(sa);
                }catch (NotEnoughMoneyException e){
                    System.out.println(e.getMessage());
                }*/
                ControllerSimple cs = new ControllerSimple(bank);
                ViewSimple vs = new ViewSimple(bank,cs);
                bank.addListener(vs);
            }
        });
    }
}
