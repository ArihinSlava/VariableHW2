public class fourthTask {
    public static void main(String[] args) {

        int carTwoMinutes = 16;
        int allWorkCar = 20;
        int carOneMinutes = carTwoMinutes / 2;
        int carTwentyMinutes = carOneMinutes * 20;
        System.out.println("За " + allWorkCar +" минут машины произвела бутылок " + carTwentyMinutes + " штук");

        int oneDay = 1;
        int allDayWork = 1440;
        int carAllDay = carOneMinutes * allDayWork;
        System.out.println("За " + oneDay + " сутки машины произвела " + carAllDay + " штук");

        int threeDay = 3;
        int workThreeDay = carAllDay * threeDay;
        System.out.println("За " + threeDay + " дня машины произвела бутылок " + workThreeDay + " штук");

        int oneMouth = oneDay * 30;
        int workOneMouth = oneMouth * carAllDay;
        System.out.println("За " + oneMouth + " дней машины произвела бутылок " + workOneMouth + " штук");

    }
}
