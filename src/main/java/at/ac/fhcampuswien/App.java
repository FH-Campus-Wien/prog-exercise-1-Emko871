package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner a = new Scanner(System.in);
    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");



    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char zet = 'Z';
        int face = 0xface;
        int octal = 012;
        long eighty = 80L;
        float four = 44e-1f;
        float five = 5.5f;
        double eight = 8.88e1;
        double nine = 99.9;

        int result = (int)zet + face + octal + (int)eighty + (int)four + (int)five + (int) eight + (int)nine;

        System.out.println(result);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int first = a.nextInt();
        int second = a.nextInt();
        int result = first + second;
        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = a.nextInt();
        System.out.print("y: ");
        int y = a.nextInt();
        System.out.println("After Swap:");
        System.out.println("x: " + y);
        System.out.println("y: " + x);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        System.out.print("n1: ");
        int n1 = a.nextInt();
        System.out.print("n2: ");
        int n2 = a.nextInt();
        if(n1>n2){
            System.out.println("n1 > n2");
        }
        if(n1<n2){
            System.out.println("n2 > n1");
        }
        if(n1==n2){
            System.out.println("n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        int annual = a.nextInt();
        if(annual < 0 || annual >= 100000)
        {
            System.out.println("Invalid Revenue");
        }
        if(annual >= 0 && annual < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }
        if(annual >= 20000 && annual < 50000)
        {
            System.out.println("Average Sales Revenue");
        }
        if(annual >= 50000 && annual < 80000)
        {
            System.out.println("Good Sales Revenue");
        }
        if(annual >= 80000 && annual < 100000)
        {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        int cc = a.nextInt();
        String cr = new String();
        /*if(cc==1){
            cr = "0.01";
        }
        else if(cc==2){
            cr = "0.02";
        }
        else if(cc==3){
            cr = "0.03";
        }
        else if(cc==4){
            cr = "0.04";
        }
        else {
            cr = "0.0";
        }*/
        switch(cc) {
            case 1:
                cr = "0.01";
                break;
            case 2:
                cr = "0.02";
                break;
            case 3:
                cr = "0.03";
                break;
            case 4:
                cr = "0.04";
                break;
            default:
                cr ="0.0";
                break;
        }
        System.out.println("Your Commission Rate was set to " + cr);


    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.print("Year: ");
        int year = a.nextInt();
        if(year%4==0){
            if(year%100==0 && year%400!=0)
                System.out.println("Not a Leapyear");
            else
                System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        System.out.print("Number: ");
        int number = a.nextInt();
        int interimresult = 0;
        int counter = 0;
        int factor = 1;
        int reverse = 0;
        interimresult = number;

        while(interimresult!=0){
            interimresult=interimresult/10;
            counter++;
        }
        for(int i = 1; i<counter; i++){
            factor=factor*10;
        }
        interimresult=number;
        while(interimresult!=0){
            reverse=(interimresult%10)*factor+reverse;
            interimresult=interimresult/10;
            factor=factor/10;
        }
        System.out.println(reverse);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}