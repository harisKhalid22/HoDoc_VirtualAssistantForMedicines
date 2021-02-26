import java.util.Scanner;
public class Test {
    public static void main(String [] ar) {
        Scanner input = new Scanner(System.in);

        /*----------------------------------*/

        Fever f1 = new Fever(true,true,true);
        Headache h1 = new Headache(true,true,true,true);
        StomachPain s1 = new StomachPain(true,true,true);
        Cough c1 = new Cough(true,true,true);

        System.out.print("Enter patient name : ");
        String name = input.nextLine();
        System.out.print("Enter patient age : ");
        int age = input.nextInt();
        System.out.print("Enter patient weight : ");
        double weight = input.nextDouble();
        System.out.print("Enter patient gender : ");
        String gender = input.next();

        Patient patient1 = new Patient(name,age,weight,gender,f1,h1,s1,c1);
        patient1.display();

        /*----------------------------------*/

        System.out.println("\n-----CHOOSE A DISEASE FROM BELOW:-------\n");
        System.out.println("1.---FEVER----------\t2.---HEAD_ACH---\n3.---STOMACH_PAIN---\t4.---COUGH------");
        int disease = input.nextInt();
        switch (disease){
            case 1:
                System.out.println("-------FEVER-----------");
                System.out.println("--CHOOSE A DISEASE-----");
                System.out.println("1.RHEUMATOID_ARTHRITIS-");
                System.out.println("2.STREP_THROAT---------");
                System.out.println("3.DEHYDRATION----------");

                Fever fever = new Fever();
                int symptomFever = input.nextInt();
                switch (symptomFever) {
                    case 1:
                        System.out.println("---RHEUMATOID_ARTHRITIS---");
                        fever.getRheumatoidArthritis();

                        System.out.println("\nWANT SOME DESI TIPS :");
                        System.out.println("1.YES \t2.NO");
                        int tipsRheumatoidArthritis = input.nextInt();
                        switch(tipsRheumatoidArthritis){
                            case 1:
                                DesiTips.rheumatoidArthritisTip();

                            default:
                                System.out.println("THANKS FOR COMING!");
                        }
                        break;

                    case 2:
                        System.out.println("---STREP_THROAT---");
                        fever.getStrepThroat();

                        System.out.println("\nWANT SOME DESI TIPS :");
                        System.out.println("1.YES \t2.NO");
                        int tipsStrepThroat = input.nextInt();
                        switch(tipsStrepThroat){
                            case 1:
                                DesiTips.strepThroatTip();

                            default:
                                System.out.println("THANKS FOR COMING!");
                        }
                        break;

                    case 3:
                        System.out.println("---DEHYDRATION---");
                        fever.getDehydration();

                        System.out.println("\nWANT SOME DESI TIPS :");
                        System.out.println("1.YES \t2.NO");
                        int tipsDehydration = input.nextInt();
                        switch(tipsDehydration){
                            case 1:
                                DesiTips.dehydrationTip();

                            default:
                                System.out.println("THANKS FOR COMING!");
                        }
                        break;

                    default:
                        System.out.println("INVALID SELECTION OF SYMPTOM");
                        break;
                }
                break;

            case 2:
                System.out.println("-----HEAD_ACH------");
                System.out.println("--CHOOSE A SYMPTOM-");
                System.out.println("1.MIGRAINE---------");
                System.out.println("2.HYPERTENSION-----");
                System.out.println("3.STRESS-----------");
                System.out.println("4.DEPRESSION-------");

                Headache headache = new Headache();
                DesiTips desiTips = new Headache();
                int symptomHeadAche = input.nextInt();
                switch (symptomHeadAche) {
                    case 1:
                        System.out.println("---MIGRAINE---");
                        headache.getMigraine();

                        System.out.println("\nWANT SOME DESI TIPS :");
                        System.out.println("1.YES \t2.NO");
                        int tipsMigraine = input.nextInt();
                        switch(tipsMigraine){
                            case 1:
                                desiTips.migraineTip();

                            default:
                                System.out.println("THANKS FOR COMING!");
                        }
                        break;

                    case 2:
                        System.out.println("---HYPERTENSION----");
                        headache.getHypertension();

                        System.out.println("\nWANT SOME DESI TIPS :");
                        System.out.println("1.YES \t2.NO");
                        int tipsHypertension = input.nextInt();
                        switch(tipsHypertension){
                            case 1:
                                desiTips.hypertensionTip();

                            default:
                                System.out.println("THANKS FOR COMING!");
                        }
                        break;

                    case 3:
                        System.out.println("---STRESS-----");
                        headache.getStress();
                        break;

                    case 4:
                        System.out.println("---DEPRESSION--");
                        headache.getDepression();
                        break;

                    default:
                        System.out.println("INVALID SELECTION OF SYMPTOM");
                        break;
                }
                break;

            case 3:
                System.out.println("----STOMACH_PAIN---");
                System.out.println("--CHOOSE A SYMPTOM-");
                System.out.println("1.MALNUTRITION-----");
                System.out.println("2.ACIDITY----------");
                System.out.println("3.BLOATING---------");

                StomachPain stomachPain = new StomachPain();
                int symptomStomachPain = input.nextInt();
                switch (symptomStomachPain) {
                    case 1:
                        System.out.println("--MALNUTRITION--");
                        stomachPain.getMalnutrition();
                        break;

                    case 2:
                        System.out.println("---ACIDITY---");
                        stomachPain.getAcidity();
                        break;

                    case 3:
                        System.out.println("---BLOATING----");
                        stomachPain.getBloating();
                        break;

                    default:
                        System.out.println("INVALID SELECTION OF SYMPTOM");
                        break;
                }
                break;

            case 4:
                System.out.println("-------COUGH----------");
                System.out.println("--CHOOSE A SYMPTOM----");
                System.out.println("1.COLD_FLU------------");
                System.out.println("2.VIRAL_INFECTION-----");
                System.out.println("3.BACTERIAL_INFECTION-");

                Cough cough = new Cough();
                int symptomCough = input.nextInt();
                switch (symptomCough) {
                    case 1:
                        System.out.println("---COLD_FLU---");
                        cough.getColdFlu();
                        break;

                    case 2:
                        System.out.println("---VIRAL_INFECTION---");
                        cough.getViralInfection();
                        break;

                    case 3:
                        System.out.println("---BACTERIAL_INFECTION---");
                        cough.getBacterialInfection();
                        break;

                    default:
                        System.out.println("INVALID SELECTION OF SYMPTOM");
                        break;
                }
                break;

            default:
                System.out.println("INVALID SELECTION OF DISEASE");
                break;
        }
    }
}
