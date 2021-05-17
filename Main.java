public class Main {
    public static void main(String[] args) {

        int balanceСlient = 300;
        int payment = 1300;
        int bonusPayment = 1000;
        int bonus = 1;
        int bonusRule = 200;
        int total = balanceСlient + payment;
        if (payment < bonusPayment) {
            System.out.println(total);
        } else {
            System.out.println(total + (total / bonusRule) * bonus);
        }
    }

}
