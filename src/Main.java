public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание 1.
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        int age1 = 17;
        if (age < 18) {
            System.out.println("Если возраст человека меньше " + age + " он не достиг совершенолетия");
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
        int ageChildUnderToSchool = 3;
        int ageSchoolBoy = 11;
        int ageStudent = 19;
        int ageWorker = 25;
        if (ageChildUnderToSchool > 2 && ageChildUnderToSchool < 6) {
            System.out.println("Если возраст ребенка равен " + ageChildUnderToSchool + " то ему нужно ходить в детский сад");
        }
        if (ageSchoolBoy > 7 && ageSchoolBoy < 17) {
            System.out.println("Если возраст ребенка равен " + ageSchoolBoy + " то ему нужно ходить в школу");
        }
        if (ageStudent >= 18 && ageStudent <= 24) {
            System.out.println("Если возраст человека равен " + ageStudent + " то ему нужно ходить в университет");

        }
        if (ageWorker > 24) {
            System.out.println("Если возраст человека равен " + ageWorker + " то ему нужно ходить на работу");

        }

        //Задача 5.
        int ageChild1 = 4;
        int ageChild2 = 6;
        int ageChild3 = 15;

        if (ageChild1 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild1 + " то ему нельзя кататься на аттракционе");
        }
        if (ageChild2 > 5 && ageChild2 < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild2 + " то ему можно кататься в сопровождении взрослых");
        }
        if (ageChild3 > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + " то ему можно кататься одному");
        }

        //Задача 6.
        int trainCapasity = 120;
        int seatindPlaces = 60;
        int standingPlaces = trainCapasity - seatindPlaces;
        if (trainCapasity > 120) {
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










