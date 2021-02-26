public class Cough extends Patient {
    private boolean coldFlu;
    private boolean viralInfection;
    private boolean bacterialInfection;

    public Cough(){}

    public Cough(boolean coldFlu, boolean viralInfection, boolean bacterialInfection){
        this.coldFlu = coldFlu;
        this.viralInfection = viralInfection;
        this.bacterialInfection = bacterialInfection;
    }

    /*---------------------GETTER---------------------*/

    public boolean getColdFlu() {
        System.out.println("--MEDICINE : Panadol CF--");
        return coldFlu;
    }
    public boolean getViralInfection() {
        System.out.println("--MEDICINE : Augmentin--");
        return viralInfection;
    }
    public boolean getBacterialInfection() {
        System.out.println("--MEDICINE : levofloxacin--");
        return bacterialInfection;
    }

    /*---------------------SETTER---------------------*/

    public void setColdFlu(boolean coldFlu) {
        this.coldFlu = coldFlu;
    }
    public void setViralInfection(boolean viralInfection) {
        this.viralInfection = viralInfection;
    }
    public void setBacterialInfection(boolean bacterialInfection) {
        this.bacterialInfection = bacterialInfection;
    }

    /*---------------------Display--------------------*/

}
