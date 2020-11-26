public class money2 {

    public static void main(String[] args) {
        int currentAccount = 220;
        int bonus;
        int amount = 1550;

        if (amount > 1000) {
            bonus = amount / 100;

        } else {

            bonus = 0;
        }

        int totalAccount = bonus + currentAccount + amount;

        System.out.println(bonus);

    }
}
