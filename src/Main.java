import java.util.Scanner;

public class Main {
    public static void addition(double a, double b){
        System.out.println("Addition: "+ (a+b));
    }
    public static void subtraction(double a, double b){
        System.out.println("Subtraction: "+ (a-b));
    }
    public static void multiplication(double a, double b){
        System.out.println("Multiplication: "+ (a*b));
    }
    public static void division(double a, double b){
        System.out.println("Division: "+ (a/b));
    }
    public static void modulo(double a, double b){
        System.out.println("Modulo: "+ (a%b));
    }
    public static void power(double a, double b){
        System.out.println("Power: "+ Math.pow(a,b));
    }
    public static void squareRoot(double n){
        System.out.println("Square Root: "+ Math.sqrt(n));
    }
    public static void absolute(double n){
        System.out.println("Absolute: "+ Math.abs(n));
    }
    public static void round(double n){
        System.out.println("Round: "+ Math.round(n));
    }
    public static void ceil(double n){
        System.out.println("Ceil: "+ Math.ceil(n));
    }
    public static void floor(double n){
        System.out.println("Floor: "+ Math.floor(n));
    }
    public static void factorial(double n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
    public static void evenOddCheck(double n){
        System.out.println((n%2 ==0)? "Even Number": "Odd Number");
    }
    public static void maximum(double a, double b){
        System.out.println("Maximum: "+ Math.max(a,b));
    }
    public static void minimum(double a, double b){
        System.out.println("Minimum: "+ Math.min(a,b));
    }
    public static void percentage(double a, double b){
        System.out.println("Percentage: "+((a/b)*100) +"%");
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("------------------Welcome to CLI Calculator------------------");
        int choice;
        while(true){
            System.out.println("-----------------Please Select Operation : ------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Absolute");
            System.out.println("9. Round");
            System.out.println("10. Ceil");
            System.out.println("11. Floor");
            System.out.println("12. Factorial");
            System.out.println("13. Even/Odd Checker");
            System.out.println("14. Maximum");
            System.out.println("15. Minimum");
            System.out.println("16. Percentage");
            System.out.println("17. Exit");

            choice = scn.nextInt();
            double a,b,n;
            switch(choice){
                case 1:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    addition(a,b);
                    break;
                case 2:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    subtraction(a,b);
                    break;
                case 3:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    multiplication(a,b);
                    break;
                case 4:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    division(a,b);
                    break;
                case 5:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    modulo(a,b);
                    break;
                case 6:
                    System.out.println("Enter Base Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter Power Number: ");
                    b = scn.nextInt();
                    power(a,b);
                    break;
                case 7:
                    System.out.println("Enter Number: ");
                    n = scn.nextInt();
                    squareRoot(n);
                    break;
                case 8:
                    System.out.println("Enter Number: ");
                    n = scn.nextInt();
                    absolute(n);
                    break;
                case 9:
                    System.out.println("Enter Number: ");
                    n = scn.nextDouble();
                    round(n);
                    break;
                case 10:
                    System.out.println("Enter Number: ");
                    n = scn.nextDouble();
                    ceil(n);
                    break;
                case 11:
                    System.out.println("Enter Number: ");
                    n = scn.nextDouble();
                    floor(n);
                    break;
                case 12:
                    System.out.println("Enter Number: ");
                    n = scn.nextInt();
                    factorial(n);
                    break;
                case 13:
                    System.out.println("Enter Number: ");
                    n = scn.nextInt();
                    evenOddCheck(n);
                    break;
                case 14:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    maximum(a,b);
                    break;
                case 15:
                    System.out.println("Enter 1st Number: ");
                    a = scn.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = scn.nextInt();
                    minimum(a,b);
                    break;
                case 16:
                    System.out.println("Enter Obtained: ");
                    a = scn.nextInt();
                    System.out.println("Enter Total: ");
                    b = scn.nextInt();
                    percentage(a,b);
                    break;
                case 17:
                    System.out.println("Thank you for using Calculator .\nGood Bye !");
                    return;
                default:
                    System.out.println("Invalid Cloice! \nPlease Enter a number between 1 - 17");
            }
        }
    }
}
