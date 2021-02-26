public class Patient {
    private String name;
    private int age;
    private double weight;
    private String gender;
    private Fever fever;
    private Headache headache;
    private StomachPain stomachPain;
    private Cough cough;

    public Patient(){}

    public Patient(String name, int age, double weight, String gender, Fever fever, Headache headache, StomachPain stomachPain, Cough cough){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.fever = fever;
        this.headache = headache;
        this.stomachPain = stomachPain;
        this.cough = cough;
    }

    /*---------------------GETTER---------------------*/

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public String getGender() {
        return gender;
    }
    public Fever getFever() {
        return fever;
    }
    public Headache getHeadache() {
        return headache;
    }
    public StomachPain getStomachPain() {
        return stomachPain;
    }
    public Cough getCough() {
        return cough;
    }

    /*---------------------SETTER---------------------*/

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setFever(Fever fever) {
        this.fever = fever;
    }
    public void setHeadache(Headache headache) {
        this.headache = headache;
    }
    public void setStomachPain(StomachPain stomachPain) {
        this.stomachPain = stomachPain;
    }
    public void setCough(Cough cough) {
        this.cough = cough;
    }

    /*---------------------Display--------------------*/

    public double doseCalculation(){
        return ((age * weight / 150)); //Original Formula : Adult Dose * weight / 150
    }

    public void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Weight : " +weight);
        System.out.println("Gender : " +gender);
        System.out.println("Dose per medicine : " +doseCalculation()+ "gm");
    }
}
