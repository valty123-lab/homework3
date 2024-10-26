public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1.
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше " + age + " он не достиг совершенолетия");
        }

        //Задание 2.
        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " можно идти без шапки");

        }


        //Задание 3.

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость" + speed + " то придется заплатить штраф");
        }
        else   {
            System.out.println("Если скорость" + speed + "можно ездить спокойно");
        }
        //Задача 4.
        age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");

        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");

        }

        //Задача 5.
        age = 10;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься в сопровождении взрослых");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься одному");
        }

        //Задача 6.
        int places = 102;
        int sitPlaces = 60;
        int people = 70;
        if (people < sitPlaces) {
            System.out.println("Если в поезде " + people + " то в вагоне есть сидячие места");

        }
        if (people >= sitPlaces && people < places) {
            System.out.println("В вагоне есть стоячие места");

        }
        if (people == places) {
            System.out.println("В вагоне нет свободных мест");

        }

        //Задача 7.
        int one = 10;
        int two = 5;
        int three = 30;
        if (one >= two && one >= three) {
            System.out.println("Число one больше остальных и равно" + one);
        } else if (two >=  three) {
            System.out.println("Число two больше остальных и равно" + two);
        } else {
            System.out.println("Число three больше остальных");
        }


    }
}










