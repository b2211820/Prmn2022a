package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.existsAccount("西澤晴翔", "123456");
        atm.registerAccount("西澤晴翔", "123456");
        atm.existsAccount("西澤晴翔", "123456");
        atm.deposit("123456", 1000);
        atm.withdraw("123456", 2000);
        atm.withdraw("123456", 500);
    }
}
