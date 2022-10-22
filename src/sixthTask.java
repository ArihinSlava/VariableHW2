public class sixthTask {
    public static void main(String[] args) {
        int bananas = 5;
        int weightbananas = 80;
        int allWeightBananas = bananas * weightbananas;
        int milk  = 2;
        int weihgtMilk = 105;
        int allWeihgtMilk = milk * weihgtMilk;
        int ice = 2;
        int weightIce = 100;
        int allweihgtIce = ice * weightIce;
        int egg = 4;
        int weightEgg = 70;
        int allWeightEgg = egg * weightEgg;
        int allWeihgtProduct = allWeightBananas + allWeihgtMilk + allweihgtIce + allWeightEgg;
        System.out.println(allWeihgtProduct + " грамма");

        float oneKilo = 1000;
        float allWeightKg = allWeihgtProduct / oneKilo;
        System.out.println(allWeightKg + " кг");


    }
}
