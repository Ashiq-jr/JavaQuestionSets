import java.util.*;
import java.lang.*;

public class Question2V2
{
    public static void main (String args[])
    {
        // Question 01
        // int number1 = GetInteger("Enter the Number :");
        // System.out.println("The Number Is " + IsPositiveOrNegativeOrZero(number1));

        // Question 02
        // int number1 = GetInteger("Enter the First Number : ");
        // int number2 = GetInteger("Enter the Second Number : ");
        // System.out.println("The Numbers Are " + IsEqualOrNot(number1, number2));

        // Question 03
        // float number1 = GetFloat("Enter The First Number : ");
        // float number2 = GetFloat("Enter The Second Number : ");
        // System.out.println("The Two Floating Point Numbers Are " + ToCompareFloats(number1, number2));

        // Question 04
        // int number1 = GetInteger("Enter The Number : ");
        // IsOddOrEven(number1);

        // Question 05
        // int year = GetInteger("Enter The Year : ");
        // System.out.println(IsLeapYear(year));

        //Question 06
        // int age = GetInteger("Enter Yor Age : ");
        // System.out.println("You Are " + IsMajor(age));

        // Question 07
        // float height = GetFloat("Enter Your Height in Centimetre : ");
        // System.out.println("Your Height is : " + height + " cm And" +ToCompareHeight(height));

        // Question 08
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // System.out.println("The Largest Number is : " + GetLargestAmongThree(number1, number2, number3));

        // Question 09
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // System.out.println("The Smallest Number is : " + GetSmallestAmongThree(number1, number2, number3));

        // Question 10
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // int number4 = GetInteger("Enter The Fourth Number : ");
        // System.out.println("The Largest Number is : " + GetLargestAmongFour(number1, number2, number3, number4));

        // Question 11
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // System.out.println(GetClosestPair(number1, number2, number3));

        // Question 12
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // System.out.println(GetFarthestPair(number1, number2, number3));

        // Question 13





        // Question 14
        // float angle1 = GetFloat("Enter the Value Of The First Angle");
        // float angle2 = GetFloat("Enter the Value Of The Second Angle");
        // float angle3 = GetFloat("Enter the Value Of The Third Angle");
        // System.out.println("The Given Angles " + IsTriangle(angle1, angle2, angle3));

        // Question 15
        // float coordinate1 = GetFloat("Enter The First Co-Ordinate : ");
        // float coordinate2 = GetFloat("Enter The Second Co-Ordinate : ");
        // System.out.println(ToKnowTheQuadrant(coordinate1,coordinate2));

        // Question 16
        // char alphabet = GetChar("Enter the Alphabet : ");
        // System.out.println( alphabet + IsVowelOrConsonant(alphabet));

        // Question 17
        // int sides = GetInteger("Enter the Number Of Sides : ");
        // ToGetTheShape(sides);

        // Question 18
        // String month = GetString("Enter The Name Of The Month : ");
        // ToGetNumberOfDaysInAMonth(month);

        // Question 19
        // int date = GetInteger("Enter The Date (1-31) :");
        // ToKnowTheDayOfTheWeek(date);

        // Question 20
         





















    }
    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        return temp;
    }
    public static float GetFloat(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        return temp;
    }
    public static long GetLong(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        long temp = sc.nextLong();
        return temp;
    }
    public static double GetDouble(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        return temp;
    }
    public static String GetString(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return temp;
    }
    public static char GetChar(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        char temp = sc.next().charAt(0);
        return temp;
    }
    public static String IsPositiveOrNegativeOrZero(int number)
    {
       return number >= 0 ? (number > 0 ? "Positive" : "Zero") : "Negative";
    }
    public static String IsEqualOrNot(int number1, int number2)
    {
        return number1 == number2 ? "Equal" : "Not Equal";
    }
    public static String ToCompareFloats(float number1, float number2)
    {
        double Epsilon = 0.001;
        float difference = Math.abs(number1 - number2);
        return Epsilon > difference ? "Equal" : "Not Equal";
    }
    public static void IsOddOrEven(int number)
    {
        switch ( number % 2 )
        {
            default :
            {
                System.out.println("The Number Is Odd .. ");
                break;
            }
            case 0 :
            {
                System.out.println("The Number Is Even .. ");
                break;
            }
        }
    }
    public static boolean IsTypicalLeapYear(int year)
    {
        return year % 4 == 0;
    }
    public static boolean IsATypicalCommonYear(int year)
    {
        return year % 100 == 0 && year % 400 != 0;
    }
    public static String IsLeapYear(int year)
    { 
        String temp = "";
        if ( IsTypicalLeapYear(year) && !(IsATypicalCommonYear(year)) ) 
        {
            temp = year + " Is A Leap Year";
        }
        else 
        {
            temp = year + " Is Not A Leap Year";
        }
        return temp;
    }
    public static String IsMajor(int age)
    {
        final int major = 18;
        if(age >= 1)
        {
        return age >= major ? "Eligible" : "Not Eligible";
        }
        else
        {
            return "Enter Valid Data";
        }
    }
    public static String ToCompareHeight(float height)
    {
        final float tall = 178; // Minimum 5 ft 10 inch
        final float medium = 153; // Minimum 5 ft
        if(height >= tall)
        {
            return " You Are Tall ";
        }
        else if(height > 0 && height < medium)
        {
            return " You Are Short ";
        }
        else if (height >= medium && height != tall)
        {
            return " Your Height Is Medium ";
        }
        else 
        {
            return " Invalid Input";
        }

    }
    public static int GetLargestAmongThree(int number1, int number2, int number3)
    {
        int largest = number1;
        if(number2 > largest)
        {
            largest = number2;
        }
        if(number3 > largest)
        {
            largest = number3;
        }   
        return largest;     
    }  
    public static int GetSmallestAmongThree(int number1, int number2, int number3)
    {
        int smallest = number1;
        if(number2 < smallest)
        {
            smallest = number2;
        }
        if(number3 < smallest)
        {
            smallest = number3;
        }   
        return smallest;     
    }  
    public static int GetLargestAmongFour(int number1, int number2, int number3, int number4)
    {
        int largest = number1;
        if(number2 > largest)
        {
            largest = number2;
        }
        if(number3 > largest)
        {
            largest = number3;
        }  
        if(number4 > largest)
        {
            largest = number4;
        } 
        return largest;     
    } 
    public static String GetClosestPair(int number1, int number2, int number3)
    {
        int closest = Math.abs(number1 - number2);
        int temp1 = number1;
        int temp2 = number2;
        if( Math.abs(number2 - number3) < closest )
        {
            closest = Math.abs(number2 - number3);
            temp1 = number2;
            temp2 = number3;
        }
        if(Math.abs(number3 - number1) < closest)
        {
            closest = Math.abs(number3 - number1);
            temp1 = number3;
            temp2 = number1;
        }  
        return + temp1 + " and " + temp2 + " Are Closer To Each Other .";
    } 
    public static String GetFarthestPair(int number1, int number2, int number3)
    {
        int farthest = Math.abs(number1 - number2);
        int temp1 = number1; 
        int temp2 = number2;
        if( Math.abs(number2 - number3) > farthest )
        {
            farthest = Math.abs(number2 - number3);
            temp1 = number2;
            temp2 = number3;
        }
        if( Math.abs(number3 - number1) > farthest)
        {
            farthest = Math.abs(number3 - number1);
            temp1 = number3;
            temp2 = number1;
        }  
        return + temp1 + " and " + temp2 + " Are Farthest From Each Other .";
    }
    public static String IsTriangle(float angle1, float angle2, float angle3)
    {
        double angleoftriangle = angle1 + angle2 + angle3;
        return angleoftriangle == 180 ? "Represent A Triangle" : "Does Not Represent A Triangle";
    }
    public static boolean IsPositiveFloat(float number1)
    {
        return number1 > 0;
    }
    public static boolean IsNegativeFloat(float number1)
    {
        return number1 < 0;
    }
    public static boolean IsZeroFloat(float number1)
    {
        return number1 == 0;
    }
    public static String ToKnowTheQuadrant(float number1, float number2)
    {
        if(IsPositiveFloat(number1) && IsPositiveFloat(number2))
        {
            return "The Coordinates Lie Inthe First Quadrant .";
        }
        else if(IsNegativeFloat(number1) && IsPositiveFloat(number2))
        {
            return "The Coordinates Lie Inthe Second Quadrant .";
        }
        else if(IsNegativeFloat(number1) && IsNegativeFloat(number2))
        {
            return "The Coordinates Lie Inthe Third Quadrant .";
        }
        else if(IsPositiveFloat(number1) && IsNegativeFloat(number2))
        {
            return "The Coordinates Lie Inthe Fourth Quadrant .";
        }
        else if(IsZeroFloat(number1) && IsZeroFloat(number2))
        {
            return "The Coordinates Lie Inthe Origin .";
        }
        else
        {
            return "Enter Valid Input .";
        }
    }
    public static String IsVowelOrConsonant(char alphabet)
    {
        String result = "";
        char temp = Character.toUpperCase(alphabet);
        switch (temp)
        {
            default :
            {
                result = " Is A Consonant.";
                break;
            }
            case 'A':
            {

            }
            case 'E':
            {

            }
            case 'I':
            {

            }
            case 'O':
            {
             
            }
            case 'U':
            {      
                result = " Is A Vowel.";
                break;
            }
        }
        return result;
    }
    public static void ToGetTheShape(int sides)
    {
        switch(sides)
        {
            case 3:
            {
                System.out.println(sides + " Sides Represents a Triangle");
                break;
            }
            case 4:
            {
                System.out.println(sides + " Sides Represents a Square");
                break;
            }
            case 5:
            {
                System.out.println(sides + " Sides Represents a Pentagon");
                break;
            }
            case 6:
            {
                System.out.println(sides + " Sides Represents a Hexagon");
                break;
            }
            case 7:
            {
                System.out.println(sides + " Sides Represents a Heptagon");
                break;
            }
            case 8:
            {
                System.out.println(sides + " Sides Represents a Octagon");
                break;
            }
            case 9:
            {
                System.out.println(sides + " Sides Represents a Nonagon");
                break;
            }
            case 10:
            {
                System.out.println(sides + " Sides Represents a Decagon ");
                break;
            }
        }
    }
     public static void ToGetNumberOfDaysInAMonth(String month)
        {
            switch(month.toLowerCase())
            {
                default :
                {
                    System.out.println(" Enter Valid Data.");
                    break;
                }
                case "january" :
                {

                }
                case "march" :
                {

                }
                case "may" :
                {

                }
                case "july" :
                {

                }
                case "august" :
                {

                }
                case "october" :
                {

                }
                case "december" :
                {
                    System.out.println(month.toLowerCase() + " Consists Of 31 Days.");
                    break;
                }
                case "april" :
                {

                }
                case "june" :
                {

                }
                case "september":
                {

                }
                case "november" :
                {
                    System.out.println(month.toLowerCase() + " Consists Of 30 Days.");
                    break;
                }
                case "february" :
                {
                    System.out.println(month.toLowerCase() + " Consists Of 28 Days.");
                    break;
                }   

            }

        }
        public static void ToKnowTheDayOfTheWeek(int date)
        {
            switch (date % 7)
            {
                default :
                {
                    System.out.println("Enter Valid Data . ");
                    break;
                }
                case 0:
                {
                    System.out.println("Date " + date + " : Is Sunday.");
                    break;
                }
                case 1:
                {
                    System.out.println("Date " + date + " : Is Monday.");
                    break;
                }
                case 2:
                {
                    System.out.println("Date " + date + " : Is Tuesday.");
                    break;
                }
                case 3:
                {
                    System.out.println("Date " + date + " : Is Wednesday.");
                    break;
                }
                case 4:
                {
                    System.out.println("Date " + date + " : Is Thursday.");
                    break;
                }
                case 5:
                {
                    System.out.println("Date " + date + " : Is Friday.");
                    break;
                }
                case 6:
                {
                    System.out.println("Date " + date + " : Is Saturday.");
                    break;
                }

            }
        }
}
