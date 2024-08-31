public class Main {
    public static void main(String[] args) {
        // Task #1
        System.out.println("Task #1");
        int age = 22; // age>=23=3x; age<23=2x
        int wages = 40_000; // wages >=50_000 q=1,2; wages>=80_000 q=1,5
        double creditCardLimit = 0;
        if (age >= 23) {
            creditCardLimit = wages * 3;
        } else if (age >= 18 && age < 23) {
            creditCardLimit = wages * 2;
        } else {
            System.out.println("Вы не достигли совершеннолетия.");
        }
        if (wages >= 50_000 && wages < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "
                    + creditCardLimit * 1.2 + " рублей");
        } else if (wages >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "
                    + creditCardLimit * 1.5 + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом "
                    + creditCardLimit * 1.0 + " рублей");
        }
        System.out.println();
        // Task #2
        /*Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
        Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.
        Если возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.*/
        System.out.println("Task #2");
        int age1 = 25;
        int salary = 90_000;
        int wantedSum = 330_000;
        double customerRate = 10;
        double maxPayment = salary / 2;
        if (age1 < 23) {
            customerRate = customerRate + 1;
        } else if (age1 < 30) {
            customerRate = customerRate + 0.5;
        }
        if (salary > 80_000) {
            customerRate = customerRate - 0.7;
        }
        double paymentPerMonth =(wantedSum +  (wantedSum * customerRate / 100)) / 12;
        if (maxPayment < paymentPerMonth) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "
                    + maxPayment + " рублей. Платеж по кредиту" +
                    +paymentPerMonth + "  рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен "
                    + maxPayment + " рублей. Платеж по кредиту" +
                    +paymentPerMonth + "  рублей. Одобрено");
        }


    }
}