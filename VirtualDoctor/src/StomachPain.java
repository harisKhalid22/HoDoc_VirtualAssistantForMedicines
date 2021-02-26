public class StomachPain extends Patient {
    private boolean malnutrition;
    private boolean acidity;
    private boolean bloating;

    public StomachPain(){}

    public StomachPain(boolean malnutrition, boolean acidity, boolean bloating){
        this.malnutrition = malnutrition;
        this.acidity = acidity;
        this.bloating = bloating;
    }

    /*---------------------GETTER---------------------*/

    public boolean getMalnutrition() {
        System.out.println("--MEDICINE : Vitamin & Mineral supplements--");
        return malnutrition;
    }
    public boolean getAcidity() {
        System.out.println("--MEDICINE : Risek--");
        return acidity;
    }
    public boolean getBloating() {
        System.out.println("--MEDICINE : Alpha-D-galactosidase--");
        return bloating;
    }

    /*---------------------SETTER---------------------*/

    public void setMalnutrition(boolean malnutrition) {
        this.malnutrition = malnutrition;
    }
    public void setAcidity(boolean acidity) {
        this.acidity = acidity;
    }
    public void setBloating(boolean bloating) {
        this.bloating = bloating;
    }

    /*---------------------Display--------------------*/


}
