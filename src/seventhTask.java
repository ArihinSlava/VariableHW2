public class seventhTask {
    public static void main(String[] args) {
        int weight1 = 250;
        int weight2 = 500;
        int allWeight = 7000;
        int loseWeight1 = allWeight / weight1;
        System.out.println("Если спортсмент будет терять " + weight1 + " грамм , то на похудение уйдет " + loseWeight1 +  " дней");
        int loseWeight2 = allWeight / weight2;
        System.out.println("Если спортсмен будет терять " + weight2 + " грамм , то на похудение уйдет " + loseWeight2 + " дней");
        float mediumWeight = ((weight1+weight2)/2);
        System.out.println(mediumWeight);
        float mediumDay = allWeight / mediumWeight;
        System.out.println(Math.round(mediumDay));
    }
}
