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

                ControllerGetMoney cgm = new ControllerGetMoney(bank); // the new get money view
                ViewGetMoney vgm = new ViewGetMoney(bank, cgm);
                bank.addListener(vgm);

                ControllerWithdraw cw = new ControllerWithdraw(bank); // new withdraw view
                ViewWithdraw vw = new ViewWithdraw(bank, cw);
                bank.addListener(vw);

                ControllerCreate cc = new ControllerCreate(bank); // new create view
                ViewCreate vc = new ViewCreate(bank, cc);
                bank.addListener(vc);

                ControllerHistory ch = new ControllerHistory(bank);
                ViewHistory vh = new ViewHistory(bank, ch);
                bank.addListener(vh);
            }
        });
    }
}
