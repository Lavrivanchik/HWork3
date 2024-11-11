public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Задание 1.


        int age = 30;
        System.out.println(" Если возраст человека равен " + age + " то ");
        if (age >= 18) {
            System.out.println(" Он совершеннолетний ");
        } else {
            System.out.println(" Он не достиг совершеннолетия, нужно немного подождать ");
        }

        //Задание 2.


        int temperature = 10;
        System.out.println(" На улице " + temperature + " градусов, ");
        if (temperature >= 5) {
            System.out.println(" можно идти без шапки ");
        } else {
            System.out.println(" нужно надеть шапку ");
        }

        //Задание 3.


        int speed = 60;
        System.out.println(" Если скорость " + speed + " то ");
        if (speed > 60) {
            System.out.println(" придется заплатить штраф ");
        } else {
            System.out.println(" можно ездить спокойно ");
        }

        //Задание 4.


        int years = 23;
        System.out.println(" Если возраст человека равен " + years + " то ");
        if (years >= 2 && years <= 6)
            System.out.println(" ему нужно ходить в детский сад ");

        if (years >= 7 && years <= 17)
            System.out.println(" ему нужно ходить в школу ");

        if (years >= 18 && years <= 24)
            System.out.println(" ему нужно ходить в университет ");

        if (years >= 25)
            System.out.println(" ему нужно ходить на работу ");

        //Задание 5.


        int yearsOld = 15;
        System.out.println(" Если возраст ребенка равен " + yearsOld + " то ему ");
        if (yearsOld < 5)
            System.out.println(" нельзя кататься на аттракционе ");

        if (yearsOld >= 5 && yearsOld < 14)
            System.out.println(" можно кататься на аттракционе в сопровождении взрослого ");

        if (yearsOld >= 14)
            System.out.println(" можно кататься на аттракционе без сопровождения взрослого ");

        //Задание 6.


        int seatOnTheTrain = 99;
        System.out.println(" Если количество человек в поезде " + seatOnTheTrain + " то ");
        if (seatOnTheTrain >= 1 && seatOnTheTrain <= 59)
            System.out.println(" в вагоне есть свободное сидячее место ");
        if (seatOnTheTrain >= 60 && seatOnTheTrain <= 101)
            System.out.println(" в вагоне есть свободное стоячее место ");
        if (seatOnTheTrain >= 102)
            System.out.println(" вагон заполнен, свободных мест нет ");

        //Задание 7.

        int one = 1;
        int two = 2;
        int three = 3;
        System.out.println(" Извините пожалуйста, данное задание не понял ");


    }
}
