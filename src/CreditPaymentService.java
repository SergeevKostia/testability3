public class CreditPaymentService {
    public int calculate(int amount, double percent, int time) {
        double t = time;
        double pc = percent / (100 * 12);
        double mp = Math.pow(1 + pc, -t);
        double factor1 = (int) amount * pc;
        double factor2 = 1 - mp;
        int index;
        index = (int) ((int) factor1 / factor2);
        return index;
    }
}
