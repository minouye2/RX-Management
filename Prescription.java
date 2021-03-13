import java.time.LocalDate;

public class Prescription {
    private String drugName, dose;
    private LocalDate fillDate;
    private LocalDate writtenDate;

    public Prescription() {
    }

    public Prescription(Drug drug, LocalDate writtenDate) {
        this.writtenDate = writtenDate;
        this.drugName = drug.getName();
        this.dose = drug.getStrength() + " " + drug.getUnits();
        this.fillDate = LocalDate.now();
        System.out.println("Medication: " + this.drugName + " " + this.dose +
         "\nFill date: " + fillDate +
         "\nWritten date: " + writtenDate);
    }
    
}