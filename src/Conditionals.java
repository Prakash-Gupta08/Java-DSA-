import java.util.Scanner;

public class Conditionals {
    public static void main()
    {

//        int dailyPractice = 12;
//        if(dailyPractice >= 12)
//        {
//            System.out.println("Good consistency");
//        }


//        int number = 65;
//        if(number >= 60)
//        {
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }


//        int accuracy = 78;
//        if(accuracy >= 90)
//        {
//            System.out.println("Excellent");
//        } else if (accuracy >=75) {
//            System.out.println("Good");
//
//        } else if (accuracy >= 60) {
//            System.out.println("Average");
//
//        }
//        else {
//            System.out.println("needs improvement");
//        }


//        int day = 6;
//        if(day == 1)
//        {
//            System.out.println("Monday");
//        }else if(day == 2)
//        {
//            System.out.println("Tuesday");
//        }else if(day == 3)
//        {
//            System.out.println("Wednesday");
//        }else if(day == 4)
//        {
//            System.out.println("Thursday");
//        }else if(day == 5)
//        {
//            System.out.println("Friday");
//        }else if(day == 6)
//        {
//            System.out.println("Saturday");
//        }else if(day == 7)
//        {
//            System.out.println("Sunday");
//        }


        //Switch Statement =========================
        System.out.println("Enter the value of day:");
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");



        }


    }
}
