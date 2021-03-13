import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter drug name: ");
        String drugName = input.next();
        System.out.print("Enter drug strength: ");
        String drugStrength = input.next();
        System.out.print("Enter drug units: ");
        String drugUnits = input.next();
        System.out.print("Enter drug NDC: ");
        String drugNDC = input.next();
        input.close();

        LocalDate writtenDate = LocalDate.of(2021, 1, 1);

        Drug inputDrug = new Drug(drugName, drugUnits, drugStrength, drugNDC);
        Prescription inputRx = new Prescription(inputDrug, writtenDate);

    }
    
}