public class Drug {
    private String name, units, strength, ndc;

    public Drug() {   
    }

    public Drug(String name, String units, String strength, String ndc) {
        this.name = name;
        this.units = units;
        this.strength = strength;
        this.ndc = ndc;
    }

    public String getName() {
        return this.name;
    }
    public String getUnits() {
        return this.units;
    }
    public String getStrength() {
        return this.strength;
    }
    public String getNDC() {
        return this.ndc;
    }

}