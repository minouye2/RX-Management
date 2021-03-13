import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate writtenDate = LocalDate.of(2021, 1, 1);

        Drug prednisone = new Drug("Prednisone", "mg", "20", "5974617506");
        Prescription rx1 = new Prescription(prednisone, writtenDate);

    }
    
}