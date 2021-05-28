public class NightStudent extends Student {
    private double paid_money;
    private double debt_money;

    NightStudent(String fl_name, String mjr) {
        super(fl_name, mjr);
    }

    // setter
    void set_acounting(double pd_money, double db_money) {
        paid_money = pd_money;
        debt_money = db_money;
    }

    // getter
    String show_accounting() {
        String template = "Paid Money -> %d\n\rDebt Money -> %d";
        return String.format(template, paid_money, debt_money);
    }
}