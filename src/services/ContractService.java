package services;

import entities.Contract;
import entities.Installment;

public class ContractService {

    public static void processContract(Contract contract, Integer months){
        if (months == 0){
            throw new RuntimeException("You can't hire a person for 0 months");
        }else {
            Double valueOfEachInstallment = contract.getTotalValue()/months;
            OnlinePaymentService service = new PaypalService();
            System.out.println("Parcelas");
            for (int i = 1; i<=months; i++ ){
                Installment installment = new Installment(contract.getDate().plusMonths(i),service.paymentFee(service.interest(valueOfEachInstallment,i)));
                System.out.println(installment.getDueDate() + " - " + installment.getAmount());



            }

        }


    }
}
