public class CreditPaymentService {
    public double calculate(double rate, double summa, double years) {
        double k = (double) Math.pow((rate/100 +1), 1.0/12); // коэффициент аннуитета
        double pay = (summa*(double) Math.pow(k, years*12)*(k-1))/(double) (Math.pow(k, years*12)-1); //размер платежа
        return pay;
    }

}
