public class Main {
    public static void main(String[] args) {
System.out.println("Задача 1");
        int a = 5;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 10;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 15;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 20;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 30f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 40;
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задача 2");
        double j = 27.12;
        System.out.println("Значение переменной h с типом double равно " + j);
        long k = 987678965549L;
        System.out.println("Значение переменной h с типом long равно " + k);
        double l = 2.782;
        System.out.println("Значение переменной h с типом double равно " + l);
        boolean m = false;
        System.out.println("Значение переменной h с типом boolean равно " + m);
        byte g = 67;
            System.out.println("Значение переменной g с типом byte равно " + g);
        short h = 569;
        System.out.println("Значение переменной h с типом short равно " + h);
        int i = -159;
        System.out.println("Значение переменной h с типом int равно " + i);
        short o = 27897;
        System.out.println("Значение переменной h с типом short равно " + o);

        System.out.println("Задача 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short totalList = 480;
        int listOneStudent = totalList / (classLP + classAS + classEA);
        System.out.println("На каждого ученика рассчитано " + listOneStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte performance = 16;
        byte time = 2;
        int performanceOneMinute = performance / time;
        int performance20Min = performanceOneMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + performance20Min + " штук");
        int perfomanceDay = performanceOneMinute * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + perfomanceDay + " штук");
        int perfomanceThreeDays = perfomanceDay * 3;
        System.out.println("За 3 суток машина произвела бутылок " + perfomanceThreeDays + " штук");
        int perfomanceMonth = perfomanceDay * 30;
        System.out.println("За месяц машина произвела бутылок " + perfomanceMonth + " штук");

        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteDyeOneClass = 2;
        byte brownDyeOneClass = 4;
        int totalClass = totalCans / (whiteDyeOneClass + brownDyeOneClass);
        int totalWhiteDye = totalClass * whiteDyeOneClass;
        int totalBrownDye = totalClass * brownDyeOneClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteDye + " банок белой краски и " + totalBrownDye + " банок коричневой краски");

        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int totalCoctel = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println("Вес спорт-коктеля " + totalCoctel + " граммов");
        float totalCoctelKg = totalCoctel / 1000f;
        System.out.println("Вес спорт-коктеля " + totalCoctelKg + " кг");

        System.out.println("Задача 7");
        byte totalMinusWeight = 7;
        short minusGrOneDay = 250;
        short minusGrOneDay2 = 500;
        int totalDays1 = totalMinusWeight * 1000 / minusGrOneDay;
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + totalDays1 + " дней");
        int totalDays2 = totalMinusWeight * 1000 / minusGrOneDay2;
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + totalDays2 + " дней");
        int mean = ( totalMinusWeight * 1000 )/ ((minusGrOneDay + minusGrOneDay2)/2);
        System.out.println("В среднем спортсмену может понадобится " + mean + " для достижения результата");

        System.out.println("Задача 8");
        int mageMasha = 67760;
        int mageDenis = 83690;
        int mageKristina = 76230;
        double newMageMasha = mageMasha + mageMasha * 0.1;
        double newMageDenis = mageDenis + mageDenis * 0.1;
        double newMageKristina = mageKristina + mageKristina * 0.1;
        double differenceMageMashaYear = newMageMasha * 12 - mageMasha * 12;
        double differenceMageDenuisYear = newMageDenis * 12 - mageDenis * 12;
        double differenceMageKristinaYear = newMageKristina * 12 - mageKristina * 12;
        System.out.println("Маша теперь получает " + newMageMasha + " рублей. Годовой доход вырос на " + differenceMageMashaYear + " рублей");
        System.out.println("Денис теперь получает " + newMageDenis + " рублей. Годовой доход вырос на " + differenceMageDenuisYear + " рублей");
        System.out.println("Кристина теперь получает " + newMageKristina + " рублей. Годовой доход вырос на " + differenceMageKristinaYear + " рублей");


    }
}