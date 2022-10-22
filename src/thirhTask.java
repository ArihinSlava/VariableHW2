public class thirhTask {
    public static void main(String[] args) {
        byte firstClassePupils = 23;
        byte secondClassePupils = 27;
        byte thirdClassePupils = 30;
        int allPupils = firstClassePupils + secondClassePupils +thirdClassePupils;
        int allPaper = 480;
        int onePaperOnePupil = allPaper / allPupils;
        System.out.println("На каждого ученика рассчитано " + onePaperOnePupil + " листов бумаги");

    }
}
