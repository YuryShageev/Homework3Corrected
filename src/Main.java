public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Task 1");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом int равно " + applesCount);
        byte orangeCount = 4;
        System.out.println("Значение переменной applesCount с типом byte равно " + orangeCount);
        short catCount = 3;
        System.out.println("Значение переменной applesCount с типом short равно " + catCount);
        long peopleCount = 7_500_000_000L;
        System.out.println("Значение переменной applesCount с типом long равно " + peopleCount);
        float pi = 3.141592f;
        System.out.println("Значение переменной applesCount с типом float равно " + pi);
        double e = 2.8; //основание натурального логарифма
        System.out.println("Значение переменной applesCount с типом double равно " + e);

        //Задача 2
        System.out.println("Task 2");
        float variable1 = 27.12f;
        long variable2 = 987678965549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        //Задача 3
        System.out.println("Task 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupil = papersCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        //Задача 4
        System.out.println("Task 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles/minutes;
        int twentyMinutes = 20;
        System.out.println("За "+ twentyMinutes +" минут машина произвела бутылок "+ productivityPerMinute * twentyMinutes +" штук ");
        int minutesInDay = 24 * 60;
        System.out.println("За "+ minutesInDay +" минут машина произвела бутылок "+ productivityPerMinute * minutesInDay +" штук ");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За "+ minutesInThreeDays +" минут машина произвела бутылок "+ productivityPerMinute * minutesInThreeDays +" штук ");
        int minutesInMonth = 30 * minutesInDay; // В месяце 30 дней
        System.out.println("За "+ minutesInMonth +" минут машина произвела бутылок "+ productivityPerMinute * minutesInMonth +" штук ");

        //Задача 5
        System.out.println("Task 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans/(whiteCansPerClass+brownCansPerClass);
        int totalWhiteCans = totalClasses*whiteCansPerClass;
        int totalBrownCans = totalClasses*brownCansPerClass;
        System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");
    }
}