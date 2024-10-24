public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1.
        int Age = 18;
        if (Age >= 18) {
            System.out.println("Если возраст человека равен " + Age + " он совершеннолетний");
        }
        int age1 = 17;
        if (Age < 18) {
            System.out.println("Если возраст человека меньше " + Age + " он не достиг совершенолетия");
        }

        //Задание 2.
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " нужно надеть шапку");
        }
        else if(temperature>5) {System.out.println("На улице " + temperature + " можно идти без шапки");

        }


        //Задание 3.

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость" + speed + " то придется заплатить штраф");
        }

        else if (speed < 60) {
            System.out.println("Если скорость" + speed + "можно ездить спокойно");
        }
        //Задача 4.
        int age2 = 15;
        if (age2 > 2 && age2 < 6) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нужно ходить в детский сад");
        }
         else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нужно ходить в школу");
        }
          else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2+ " то ему нужно ходить в университет");

        }
          else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить на работу");

        }

        //Задача 5.
         int age3 = 5;
          if (age3 <= 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему нельзя кататься на аттракционе");
        }
        if (age3 > 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему можно кататься в сопровождении взрослых");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему можно кататься одному");
        }

        //Задача 6.
        int trainCapasity = 120;
        int seatindPlaces = 60;
        int standingPlaces = trainCapasity - seatindPlaces;
        if (trainCapasity >= 120) {
            System.out.println("Если в поезде " + trainCapasity + " то вагон полностью забит");

        } else {
            System.out.println("Если заняты " + seatindPlaces + " cидячих мест" + "то осталось" + standingPlaces + "стоячих мест");

        }

        //Задача 7.
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }


    }
}










