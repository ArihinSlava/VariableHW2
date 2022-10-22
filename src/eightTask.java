public class eightTask {
    public static void main(String[] args) {
        double salaryMasha = 67760;
        double newSalaryMasha = salaryMasha * 1.1;
        double differenceSalaryMasha = ((newSalaryMasha - salaryMasha)*12);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей");

        int salaryDenis = 83690;
        double newSalaryDenis = salaryDenis * 0.1 + salaryDenis;
        double differenceSalaryDenis = newSalaryDenis - salaryDenis;
        double yearDifferenceSalaryDenis = differenceSalaryDenis * 12;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearDifferenceSalaryDenis + " рублей");

        int salaryKristina = 76320;
        double newSalaryKristina = salaryKristina * 0.1 + salaryKristina;
        double differenceSalaryKristina = newSalaryKristina - salaryKristina;
        double yearDifferenceSalaryKristina = differenceSalaryKristina * 12;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " Рублейю Годовой доход вырос на " + yearDifferenceSalaryKristina+ " рублей");
        }
}
