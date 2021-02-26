public class Fever extends Patient{
    private boolean rheumatoidArthritis;
    private boolean strepThroat;
    private boolean dehydration;

    public Fever(){}

    public Fever(boolean rheumatoidArthritis, boolean strepThroat, boolean dehydration){
        this.rheumatoidArthritis = rheumatoidArthritis;
        this.strepThroat = strepThroat;
        this.dehydration = dehydration;
    }

    /*---------------------GETTER---------------------*/

    public boolean getRheumatoidArthritis(){
        System.out.println("--MEDICINE : Delta cortril(steroid)--");
        return rheumatoidArthritis;
    }
    public boolean getStrepThroat() {
        System.out.println("--MEDICINE : Strepsils--");
        return strepThroat;
    }
    public boolean getDehydration() {
        System.out.println("--MEDICINE : ORS--");
        return dehydration;
    }

    /*---------------------SETTER---------------------*/

    public void setRheumatoidArthritis(boolean rheumatoidArthritis) {
        this.rheumatoidArthritis = rheumatoidArthritis;
    }
    public void setStrepThroat(boolean strepThroat) {
        this.strepThroat = strepThroat;
    }
    public void setDehydration(boolean dehydration) {
        this.dehydration = dehydration;
    }

    /*---------------------Display--------------------*/

}
