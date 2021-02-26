public class Headache extends Patient implements DesiTips{
    private boolean migraine;
    private boolean hypertension;
    private boolean stress;
    private boolean depression;

    public Headache(){}

    public Headache(boolean migraine, boolean hypertension, boolean stress, boolean depression){
        this.migraine = migraine;
        this.hypertension = hypertension;
        this.stress = stress;
        this.depression = depression;
    }

    /*---------------------GETTER---------------------*/

    public boolean getMigraine(){
        System.out.println("--MEDICINE : Delta Cortril--");
        return migraine;
    }
    public boolean getHypertension(){
        System.out.println("--MEDICINE : Capoten--");
        return hypertension;
    }
    public boolean getStress(){
        System.out.println("----NO MEDICINE----\n--PHYSICAL WORKOUT ONLY--");
        return stress;
    }
    public boolean getDepression(){
        System.out.println("--MEDICINE : Fluoxetine(Prosac)--");
        return depression;
    }

    /*---------------------SETTER---------------------*/

    public void setMigraine(boolean migraine) {
        this.migraine = migraine;
    }
    public void setHypertension(boolean hypertension) {
        this.hypertension = hypertension;
    }
    public void setStress(boolean stress) {
        this.stress = stress;
    }
    public void setDepression(boolean depression) {
        this.depression = depression;
    }

    /*---------------------Display--------------------*/


}
