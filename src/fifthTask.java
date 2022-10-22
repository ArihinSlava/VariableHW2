public class fifthTask {
    public static void main(String[] args) {
        int allCan = 120;
        int whiteCanClass = 2;
        int brownCanClass = 4;
        int oneClass = whiteCanClass + brownCanClass;
        int workOneClass = allCan / oneClass;
        int allWhiteColour = workOneClass * whiteCanClass;
        int allBrownColour = workOneClass * brownCanClass;
        System.out.println("В школе , где " + workOneClass + " классов , нужно " + allWhiteColour + " банок белой краски и " + allBrownColour +  " банок кориченевой краски");

    }
}
