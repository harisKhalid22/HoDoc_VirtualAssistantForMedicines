public interface DesiTips {

    /*---------------------STATIC---------------------*/

    static void rheumatoidArthritisTip(){
        System.out.println("Regular exercise is one of the first steps you need to take to fight rheumatoid arthritis symptoms.");
    }
    static void strepThroatTip(){
        System.out.println("Throat lozenges can sometimes provide temporary relief for a minor sore throat.");
    }
    static void dehydrationTip(){
        System.out.println("Drink a rehydration drink, water, juice, or sports drink to replace fluids and minerals.");
        System.out.println("Drink 2 qt (2 L) of cool liquids over the next 2 to 4 hours.");
        System.out.println("You should drink at least 10 glasses of liquid a day to replace lost fluids.");
        System.out.println("You can make an inexpensive rehydration drink at home.");
    }

    /*---------------------DEFAULT---------------------*/

    default void migraineTip(){
        System.out.println("Put an ice pack on your forehead, scalp, or neck to get pain relief.");
    }
    default void hypertensionTip(){
        System.out.println("Lose extra pounds and watch your waistline. Blood pressure often increases as weight increases.");
    }
}