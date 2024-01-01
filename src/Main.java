import entities.Contract;
import services.ContractService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Type the contract's number ahead: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Type the contract's start date: ");
            String stringDate = sc.nextLine();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(stringDate,df);
            System.out.println("Type the total value of the contract: ");
            Double totalValue = sc.nextDouble();
            Contract contract = new Contract(number,date,totalValue);
            ContractService.processContract(contract,3);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}