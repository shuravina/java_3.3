public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту при ставке 9.99%, сумме кредита 1000 000 сроком на 1 год составит: ");
        System.out.println(service.calculate(9.99, 1_000_000, 1));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту при ставке 9.99% и сумме кредита 1000 000 сроком на 2 года составит:");
        System.out.println(service.calculate(9.99, 1_000_000, 2));

        System.out.println();
        System.out.println("Ежемесячный платеж по кредиту при ставке 9.99% и сумме кредита 1000 000 сроком на 3 года составит:");
        System.out.println(service.calculate(9.99, 1_000_000, 3));





    }
}
