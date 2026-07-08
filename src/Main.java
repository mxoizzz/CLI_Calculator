import java.util.Scanner;

public class Main {
    public static double getNumber(Scanner scn){
        System.out.println("Enter Number: ");
        return scn.nextDouble();
    }

    public static double[] get2Numbers(Scanner scn){
        double[] numbers = new double[2];

        System.out.println("Enter 1st Number: ");
        numbers[0] = scn.nextDouble();
        
        System.out.println("Enter 2nd Number: ");
        numbers[1] = scn.nextDouble();

        return numbers;
    }
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
        if(b!=0){
            System.out.println("Division: "+ (a/b));
        }
        else{
            System.out.println("Please Enter a Non-Zero Number.");
        }
    }
    public static void modulo(double a, double b){
        if(b!=0){
            System.out.println("Modulo: "+ (a%b));
        }
        else{
            System.out.println("Please Enter a Non-Zero Number.");
        }
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
    public static void factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
    public static void evenOddCheck(int n){
        System.out.println((n%2 ==0)? "Even Number": "Odd Number");
    }
    public static void maximum(double a, double b){
        System.out.println("Maximum: "+ Math.max(a,b));
    }
    public static void minimum(double a, double b){
        System.out.println("Minimum: "+ Math.min(a,b));
    }
    public static void percentage(double a, double b){
        if(b!=0){
            System.out.println("Percentage: "+((a/b)*100) +"%");
        }
        else{
            System.out.println("Please Enter a Non-Zero Number.");
        }
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
            double[] numbers = new double[2];
            double n;
            switch(choice){
                case 1:
                    numbers = get2Numbers(scn);
                    addition(numbers[0],numbers[1]);
                    break;
                case 2:
                    numbers = get2Numbers(scn);
                    subtraction(numbers[0],numbers[1]);
                    break;
                case 3:
                    numbers = get2Numbers(scn);
                    multiplication(numbers[0],numbers[1]);
                    break;
                case 4:
                    numbers = get2Numbers(scn);
                    division(numbers[0],numbers[1]);
                    break;
                case 5:
                    numbers = get2Numbers(scn);
                    modulo(numbers[0],numbers[1]);
                    break;
                case 6:
                    numbers = get2Numbers(scn);
                    power(numbers[0],numbers[1]);
                    break;
                case 7:
                    n = getNumber(scn);
                    squareRoot(n);
                    break;
                case 8:
                    n = getNumber(scn);
                    absolute(n);
                    break;
                case 9:
                    n = getNumber(scn);
                    round(n);
                    break;
                case 10:
                    n = getNumber(scn);
                    ceil(n);
                    break;
                case 11:
                    n = getNumber(scn);
                    floor(n);
                    break;
                case 12:
                    n = getNumber(scn);
                    factorial((int)n);
                    break;
                case 13:
                    n = getNumber(scn);
                    evenOddCheck((int)n);
                    break;
                case 14:
                    numbers = get2Numbers(scn);
                    maximum(numbers[0],numbers[1]);
                    break;
                case 15:
                    numbers = get2Numbers(scn);
                    minimum(numbers[0],numbers[1]);
                    break;
                case 16:
                    numbers = get2Numbers(scn);
                    percentage(numbers[0],numbers[1]);
                    break;
                case 17:
                    System.out.println("Thank you for using Calculator .\nGood Bye !");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid Choice! \nPlease Enter a number between 1 - 17");
            }
        }
    }
}
