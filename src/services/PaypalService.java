package services;

public class PaypalService implements OnlinePaymentService{
    @Override
    public Double paymentFee(Double amount) {

        return amount + (amount * 0.02);
    }

    @Override
    public Double interest(Double amount, Integer months) {
        double doubleMonth = months.doubleValue();
        Double resultInterest =  amount * (doubleMonth / 100);
        return resultInterest + amount;
    }
}
