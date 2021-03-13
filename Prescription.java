public class Prescription {
    private String drugName;
    private String dose;

    public Prescription() {
    }

    public Prescription(Drug drug) {
        this.drugName = drug.getName();
        this.dose = drug.getStrength() + " " + drug.getUnits();
        System.out.println(this.drugName + " " + this.dose);
    }
    
}