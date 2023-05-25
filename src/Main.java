public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("task 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("task 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);

    }

    public static void task3 () {
        System.out.println("task 3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("task 4");
        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);
    }
    public static void task5 () {
        System.out.println("task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("task 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var allWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("all weight boxers " + allWeightBoxers + " kg");
        var diferensWeightBoxers = weightBoxer2 - weightBoxer1;
        System.out.println("differens in weight between our boxers " + diferensWeightBoxers + " kg");
    }
    public static void task7 () {
        System.out.println("task 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var diferensWeightBoxers = weightBoxer2 - weightBoxer1;
        System.out.println("differens in weight between our boxers " + diferensWeightBoxers + " kg");
        var diferens = weightBoxer2 % weightBoxer1;
        System.out.println("differens in weight between our boxers " + diferens + " kg");

    }
    public static void task8 () {
        System.out.println("task 8");
        var staffHour = 640;
        var oneEmployeeHour = 8;
        var numberOfEmployees = staffHour / oneEmployeeHour;
        System.out.println("number of employees " + numberOfEmployees + " people");
        var newNumberOfEmployees = 94;
        var allStaff = numberOfEmployees + newNumberOfEmployees;
        var newStaffHour = allStaff * oneEmployeeHour;
        System.out.println("if the company works " + allStaff + " people,that's all " + newStaffHour + " hours of work can be divided between employees");
        

    }
}







