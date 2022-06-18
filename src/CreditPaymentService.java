public class CreditPaymentService {
    public double calculate(double rate, double summa, double years) {
        double payMonth = rate/12/100; // Ставка по кредиту в месяц
        double k = (double) (Math.pow((payMonth+1), 12*years)*payMonth)/(Math.pow((1+payMonth), 12*years)-1);; // коэффициент аннуитета
        double pay = summa*k; // ежемесячный платеж
        return pay;
    }

}
