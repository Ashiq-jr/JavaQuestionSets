import java.util.*; 
import java.lang.*; 

public class Question2
{
    public static void main (String args[])
    {
        //Question1
        // int number = GetInteger("Enter the Number : ");
        // if( IsPositive(number) )
        // {
        //     System.out.println("The Number is Positive .. ");
        // }
        // else if( IsNegative(number) )
        // {
        //     System.out.println("The Number is Negative .. ");
        // }
        // else if( IsZero(number) )
        // {
        //     System.out.println("The Number is Zero .. ");
        // }

        //Question2
        // int number1 = GetInteger("Enter the First Number : ");
        // int number2 = GetInteger("Enter the Second Number : ");
        // if( IsEqual(number1 , number2) )
        // {
        //     System.out.println("The Numbers Are Equal .. ");
        // }
        // else if( IsUnEqual(number1 , number2) )
        // {
        //     System.out.println("The Numbers Are Not Equal .. ");
        // }

        //Question3
        // float number1 = GetFloat("Enter the First Number : ");
        // float number2 = GetFloat("Enter the Second Number : ");
        // final double EPointILON = 0.0001;
        // if( Math.abs(number1 - number2) < EPointILON )
        // {
        //     System.out.println("The Numbers Are Equal .. ");
        // }
        // else if( Math.abs(number1 - number2) > EPointILON )
        // {
        //     System.out.println("The Numbers Are Not Equal .. ");
        // }

        //Question4
        // int number = GetInteger("Enter the Number : ");
        // if( IsOdd(number) )
        // {
        //     System.out.println("The Number is an Odd Number .. ");
        // }
        // else if( IsEven(number) )
        // {
        //     System.out.println("The Number is an Even Number .. ");
        // }

        //Question5
        // int year = GetInteger("Enter the Year : ");
        // if ( year % 4 == 0 )
        // {
        //     if( year % 100 != 0  )
        //     {
        //         System.out.println("The Given Year is a Leap Year .. ");
        //     }
        //     else if ( year % 100 == 0 )
        //     {
        //         if ( year % 400 == 0 )
        //         {
        //             System.out.println("The Given Year is a Leap Year .. ");
        //         }
        //         else if ( year % 400 != 0 )
        //         {
        //             System.out.println("The Given Year is Not a Leap Year .. ");
        //         }
        //     }
        // }
        // else if ( year % 4 != 0 )
        // {
        //     System.out.println("The Given Year Is Not A Leap Year .. ");
        // }

        // Question6
        // int age = GetInteger("Enter Your Age : ");
        // final int major = 18;
        // if(  age > 0 && age >=  major )
        // {
        //     System.out.println("You Can Vote .. ");
        // }
        // else if( age > 0 && age < major )
        // {
        //     System.out.println("You Can't Vote .. ");
        // }
        // else if( age <= 0 )
        // {
        //     System.out.println("Enter Proper Age .. ");
        // }

        //Question7
        // int height = GetInteger("Enter Your Height in Centimetre : ");
        // if( height > 0 && IsTall(height) )
        // {
        //     System.out.println("You are a Tall Person .. ");
        // }
        // else if( height > 0 && IsShort(height) )
        // {
        //     System.out.println("You are a Short Person .. ");
        // }
        // else if ( height <= 0 )
        // {
        //     System.out.println("Enter Valid Data .. ");
        // }

        //Question8
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // System.out.println("The Biggest Number Is : " + GetLargestAmongThree(number1, number2, number3));

        //Question9
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // System.out.println("The Smallest Number Is : " + GetSmallestAmongThree(number1, number2, number3));

        //Question10
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // int number4 = GetInteger("Enter The Fourth Number : ");
        // System.out.println("The Biggest Number Is : " + GetLargestAmongFour(number1, number2, number3, number4));

        //Question11
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // int diff1 = CalculateDifference(number1 , number2);
        // int diff2 = CalculateDifference(number2 , number3);
        // int diff3 = CalculateDifference(number3 , number1);
        // if ( IsSmaller(diff1, diff2) )
        // {
        //     if ( IsSmaller(diff1 , diff3 ) )
        //     {
        //         System.out.println("First and Second Numbers Are Closer to each Other .. ");
        //     }
        //     else if ( IsBigger(diff1 , diff3) )
        //     {
        //         System.out.println("The First And Third Numbers Are Closer to Each Other .. ");
        //     }
        //     else if ( IsEqual(diff1 , diff3) )
        //     {
        //         System.out.println("The (First, Second) and (Third, First) Numbers Are Closer to Each Other .. ");
        //     }
        // }
        // else if ( IsBigger(diff1 , diff2 ) )
        // {
        //     if ( IsSmaller(diff2 , diff3 ) )
        //     {
        //         System.out.println("The Sceond And Third Numbers Are Closer To Each Other .. ");
        //     }
        //     else if ( IsBigger(diff2 , diff3) )
        //     {
        //         System.out.println("The First and Third Numbers Are Closer To Each Other .. ");
        //     }
        //     else if ( IsEqual(diff2 , diff3) )
        //     {
        //         System.out.println("The (Second, Third) and (Third, First) Numbers Are Closer To Each Other .. ");
        //     }
        // }
        // else if ( IsEqual(diff1 , diff2 ) )
        // {
        //     if ( IsBigger(diff2 , diff3 ) )
        //     {
        //         System.out.println("The First And The Third Numbers Are Closer To Each Other .. ");
        //     }
        //     else if  ( IsSmaller(diff2 , diff3 ) )
        //     {
        //         System.out.println("The (First, Second) and (Sceond, Third) Numbers Are Closer To Each Other ..");
        //     }
        //     else if ( IsEqual(diff2 , diff3 ) )
        //     {
        //     System.out.println("The First, Second And Third Numbers Are Closer To Each Other .. ");
        //     }
        // }
       
       //Question12
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int number3 = GetInteger("Enter The Third Number : ");
        // int diff1 = CalculateDifference(number1 , number2);
        // int diff2 = CalculateDifference(number2 , number3);
        // int diff3 = CalculateDifference(number3 , number1);
        // if ( IsBigger(diff1, diff2) )
        // {
        //     if ( IsBigger(diff1 , diff3 ) )
        //     {
        //         System.out.println("First and Second Number Are Farthest From each Other .. ");
        //     }
        //     else if ( IsSmaller(diff1 , diff3) )
        //     {
        //         System.out.println("The First And Third Number Are Farthest From Each Other .. ");
        //     }
        //     else if ( IsEqual(diff1 , diff3) )
        //     {
        //         System.out.println("The (First, Second) and (Third, First) Numbers Are Farthest From Each Other .. ");
        //     }
        // }
        // else if ( IsSmaller(diff1 , diff2 ) )
        // {
        //     if ( IsBigger(diff2 , diff3 ) )
        //     {
        //         System.out.println("The Sceond And Third Number Are Farthest From Each Other .. ");
        //     }
        //     else if ( IsSmaller(diff2 , diff3) )
        //     {
        //         System.out.println("The First and Third Number Are Farthest From Each Other .. ");
        //     }
        //     else if ( IsEqual(diff2 , diff3) )
        //     {
        //         System.out.println("The (Second, Third) and (Third, First) Numbers Are Farthest From Each Other .. ");
        //     }
        // }
        // else if ( IsEqual(diff1 , diff2 ) )
        // {
        //     if ( IsSmaller(diff2 , diff3 ) )
        //     {
        //         System.out.println("The First And The Third Number Are Farthest From Each Other .. ");
        //     }
        //     else if  ( IsBigger(diff2 , diff3 ) )
        //     {
        //         System.out.println("The (First, Second) and (Sceond, Third) Numbers Are Farthest From Each Other ..");
        //     }
        //     else if ( IsEqual(diff2 , diff3 ) )
        //     {
        //     System.out.println("The First, Second And Third Number Are Farthest From Each Other .. ");
        //     }
        // }

        //Question13
        // int number1 = GetInteger("Enter the First Number : ");
        // int number2 = GetInteger("Enter the Second Number : ");
        // int number3 = GetInteger("Enter the Third Number : ");
        // System.out.println("Numbers Before Sorting : " + number1 + " , " + number2 + " , " + number3 );
        // if( IsSmaller(number1 , number2) )
        // {
        //     if( IsSmaller(number2 , number3) )
        //     {
        //         System.out.println("Numbers After Sorting : " + number1 + " , " + number2 + " , " + number3 );
        //     }
        //     else if( IsBigger(number2 , number3) )
        //     {
        //         if( IsSmaller(number1 , number3))
        //         {
        //         System.out.println("Numbers After Sorting : " + number1 + " , " + number3 + " , " + number2 );
        //         }
        //         else if( IsBigger(number1 , number3))
        //         {
        //         System.out.println("Numbers After Sorting : " + number3 + " , " + number1 + " , " + number2 );
        //         }
        //         else if (IsEqual(number1 , number3))
        //         {
        //         System.out.println("Numbers After Sorting : " + number1 + " , " + number3 + " , " + number2 );
        //         }
        //     }
        //     else if ( IsEqual (number2 , number3) )
        //     {
        //         System.out.println("Numbers After Sorting : " + number1 + " , " + number3 + " , " + number2);
        //     }
        // }
        // else if( IsBigger(number1 , number2) )
        // {
        //     if( IsBigger(number2 , number3) )
        //     {
        //         System.out.println("Numbers After Sorting : " + number3 + " , " + number2 + " , " + number1 );
        //     }
        //     else if( IsSmaller(number2 , number3) )
        //     {
        //         if( IsSmaller(number1 , number3) )
        //         {
        //             System.out.println("Numbers After Sorting : " + number2 + " , " + number1 + " , " + number3 );
        //         }
        //         else if( IsBigger(number1 , number3) )
        //         {
        //             System.out.println("Numbers After Sorting : " + number2 + " , " + number3 + " , " + number1 );
        //         }
        //         else if( IsEqual(number1 , number3) )
        //         {
        //             System.out.println("Numbers After Sorting : " + number2 + " , " + number3 + " , " + number1 );
        //         }
        //     }
        //     else if( IsEqual(number2 , number3) )
        //     {
        //         System.out.println("Numbers After Sorting : " + number2 + " , " + number3 + " , " + number1 );
        //     }
        // }
        // else if( IsEqual(number1 , number2) )
        // {
        //     if (IsBigger(number2 , number3))
        //     {
        //         System.out.println("Numbers After Sorting : " + number3 + " , " + number2 + " , " + number1 );
        //     }
        //     else if (IsSmaller(number2 , number3))
        //     {
        //         System.out.println("Numbers After Sorting : " + number1 + " , " + number2 + " , " + number3 );
        //     }
        //     else if (IsEqual(number2 , number3))
        //     {
        //         System.out.println("Numbers After Sorting : " + number1 + " , " + number2 + " , " + number3 );
        //     }
        // }

        //Question14
        // int angle1 = GetInteger("Enter The Value for The First Angle : ");
        // int angle2 = GetInteger("Enter The Value for The Second Angle : ");
        // int angle3 = GetInteger("Enter The Value for The Third Angle : ");
        // if( IsPositive(angle1) && IsPositive(angle2) && IsPositive(angle3) && IsATriangle(angle1, angle2, angle3) )
        // {
        //     System.out.println("The Given Angle's Represent a Triangle .. ");
        // }
        // else if( IsNegative(angle1) || IsNegative(angle2) || IsNegative(angle3) )
        // {
        //     System.out.println("The Angle's Cannot be A Negative Value .. ");
        // }
        // else if( IsPositive(angle1) && IsPositive(angle2) && IsPositive(angle3) && IsNotATriangle(angle1, angle2, angle3) )
        // {
        //     System.out.println("The Given Angle's Does Not Represent a Triangle .. ");
        // }    
        // }

        //Question15
        // double p1 = GetDouble("Enter the Vale Of the Co-Ordinate X : ");
        // double p2 = GetDouble("Enter the Vale Of the Co-Ordinate y : ");
        // if ( IsAPositiveDouble(p1) && IsAPositiveDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe First Quadrant .. ");
        // }
        // else if ( IsANegativeDouble(p1) && IsAPositiveDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe Second Quadrant .. ");
        // }
        // else if ( IsANegativeDouble(p1) && IsANegativeDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe Third Quadrant .. ");
        // }
        // else if ( IsAPositiveDouble(p1) && IsANegativeDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe Fourth Quadrant .. ");
        // }
        // else if ( IsAZeroDouble(p1) && IsAZeroDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies At The Origin .. ");
        // }
        // else if ( IsAZeroDouble(p1) && IsAPositiveDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe First Quadrant .. ");
        // }
        // else if ( IsAPositiveDouble(p1) && IsAZeroDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe First Quadrant .. ");
        // }
        // else if ( IsANegativeDouble(p1) && IsAZeroDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe Second Quadrant .. ");
        // }
        // else if ( IsAZeroDouble(p1) && IsANegativeDouble(p2) )
        // {
        //     System.out.println("The Co-Ordinate Point Lies inthe Fourth Quadrant .. ");
        // }

        //Question16
        // char letter = GetCharacter("Enter An Alphabet (a-z) : ");
        // if(IsVowel(Character.toLowerCase(letter)))
        // {
        //     System.out.println(letter + " is a Vowel");
        // }
        // else
        // {
        //     System.out.println(letter + " is a Consonant");
        // }

        //Question17
        // int sides  = GetInteger("Enter the Number of Sides Of The Shape You Want : " + " ( Between 3 To 10 ) ");
        // System.out.printf("%s", GetShape(sides));

        //Question18 
        // String month = GetString("Enter The Month : ");
        // System.out.println(GetNumberOfDays(month));

        //Question19
        // int date = GetInteger("Enter The Date Of the Month : ");
        // System.out.printf("%s", GetTheDay(date));

        //Question20 
        // float side1 = GetFloat("Enter The Length Of The First Side Of The Triangle : ");
        // float side2 = GetFloat("Enter The Length Of The Second Side Of The Triangle : ");
        // float side3 = GetFloat("Enter The Length Of The Third Side Of The Triangle : ");
        // System.out.printf("%s", GetTriangleName(side1, side2, side3));

        //Question21
        // int Point = GetInteger("Enter Your Grade Point : ");
        // System.out.printf("%s", ToGetGradeRanks(Point));

        //Question22
        // int row1 = GetInteger("Enter The Row Of The Chess Board : ");
        // char column1 = GetCharacter("Enter The Column Of The Chess Board : ");
        // System.out.printf("%s", GetColorOfTheSquareInBoard(row1,column1));

        //Question23
        // double a = GetDouble("Enter The Value Of 'a'  : ");
        // double b = GetDouble("Enter The Value Of 'b'  : ");
        // double c = GetDouble("Enter The Value Of 'c'  : ");
        // GetRootsOfQuadraticEquation(a, b, c);

        //Question24
        // double bought = GetDouble("Enter The Amount For which You Bought The Product : ");
        // double sold = GetDouble("Enter The Amount For which You Sold The Product : ");
        // if(bought > 0 && sold > 0 && IsProfit(bought, sold))
        // {
        //     System.out.println("You Bought The Product For : " + " Rs." + bought);
        //     System.out.println("You Sold The Product For Rs. : " + " Rs." + sold);
        //     System.out.println("Your Profit Percentage is : " + ToCalcProfitOrLossPercent(bought, sold) + " %");
        //     System.out.println("The Amount You Gained From This Transaction Is :" + " Rs." + ToCalcProfitOrLossAmount(bought, sold));
        // }
        // else if(bought > 0 && sold > 0 && IsLoss(bought, sold))
        // {
        //     System.out.println("You Bought The Product For : " + " Rs." + bought);
        //     System.out.println("You Sold The Product For Rs. : " + " Rs." + sold);
        //     System.out.println("Your Loss Percentage is : " + ToCalcProfitOrLossPercent(bought, sold) + " %");
        //     System.out.println("The Amount You Lost In This Transaction Is :" + " Rs." + ToCalcProfitOrLossAmount(bought, sold));
        // }
        // else if(bought <= 0 || sold <= 0)
        // {
        //     System.out.println("Enter Valid Data");
        // }

        //Question25
        // int number1 = GetInteger("Enter The First number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // int choice = GetInteger("Enter To Perfrom Addition : 1" + "\nEnter To Perfrom Subtraction : 2" + "\nEnter To Perfrom Multiplication : 3" + "\nEnter To Perfrom Division : 4");
        // if(choice == 1)
        // {
        //     System.out.printf("The Sum of %d and %d is : %d" , number1 , number2, CalculateSum(number1, number2));
        // }
        // else if(choice == 2)
        // {
        //     System.out.printf("The Difference of %d and %d is : %d" , number1 , number2, CalculateDifference(number1, number2));
        // }
        // else if(choice == 3)
        // {
        //     System.out.printf("The Product of %d and %d is : %.0f" , number1 , number2, CalculateProduct(number1, number2));
        // }
        // else if(choice == 4)
        // {
        //     System.out.printf("The Product of %d and %d is : %.0f" , number1 , number2, CalculateDivision(number1, number2));
        // }
        // else if (choice <= 0 || choice > 4)
        // {
        //     System.out.println("Invalid Choice");
        // }

        //Question26
        int userchoise = GetInteger("Enter for Rock : 1" + "\nEnter For Paper : 2" + "\nEnter For Scissors : 3" + "\nEnter Your Choise : " );
        Random r = new Random();
        int computerchoise = r.nextInt(1, 4);
        if(IsRock(userchoise))
        {
            if(IsRock(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Rock).... Hence A draw !" , userchoise, computerchoise);
            }
            else if(IsPaper(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Paper).... Paper Wraps the Rock, Computer wins!" , userchoise, computerchoise);
            }
            else if(IsScissors(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Scissors).... Rock Blunts the Scissors, You win!" , userchoise, computerchoise);
            }
        }
        else if(IsPaper(userchoise))
        {
            if(IsRock(computerchoise)) 
            {
                System.out.printf("\nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Rock)....  Paper Wraps the Rock, You win!" , userchoise, computerchoise);
            }
            else if(IsPaper(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Paper).... Hence A Draw!" , userchoise, computerchoise);
            }
            else if(IsScissors(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Scissors).... Scissors Cuts The Paper, Computer wins!" , userchoise, computerchoise);
            }
        }
        else if(IsScissors(userchoise))
        {
            if(IsRock(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Rock).... Rock Blunts the Scissors, Computer wins!" , userchoise, computerchoise);
            }
            else if(IsPaper(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Paper).... Scissors Cuts The Paper, You win!!" , userchoise, computerchoise);
            }
            else if(IsScissors(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Scissors).... Hence A Draw!" , userchoise, computerchoise);
            }
        }
        else if ( userchoise < 0 || userchoise >= 4)
        {
            System.out.println("\nInvalid Choise....");
        }
    }


    // To Get An Integer as the Input
    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        return temp;
    }
    // To Get A Long as the Input
    public static long GetLong(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        long temp = sc.nextLong();
        return temp;
    }
    // To Get A Double as the Input
    public static double GetDouble(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        return temp;
    }
    // To Get A Float as the Input
    public static float GetFloat(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        return temp;
    }
     // To Get A Char as the Input
    public static char GetCharacter(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        char temp = sc.next().charAt(0);
        return temp;
    }
    // To Get A String as the Input
    public static String GetString(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return temp;
    }
    // To Get Sum of Two Numbers.
    public static int CalculateSum(int number1, int number2)
    {
        return (number1 + number2);
    }
    // To Get Difference of Two Numbers.
    public static int CalculateDifference(int number1, int number2)
    {
        return Math.abs(number1 - number2);
    }
    // To Get Product of Two Numbers.
    public static double CalculateProduct(int number1, int number2)
    {
        return (number1 * number2);
    }
    // To Perform Division of Two Numbers.
    public static double CalculateDivision(int number1, int number2)
    {
        return (number1 / number2);
    }
    // To Get The Square Value Of A Number.
    public static double ToGetSquareValue(double number1, double number2)
    {
        return Math.pow(number1, number2);
    } 
    // To Check if a Integer is Positive 
    public static boolean IsPositive(int number1)
    {
        return number1 > 0 ;
    }
    // To Check if a Integer is Negative 
    public static boolean IsNegative(int number1)
    {
        return number1 < 0 ;
    }
    // To Check if a Integer is Zero 
    public static boolean IsZero(int number1)
    {
        return number1 == 0 ;
    }
    // To Check if a Double is Positive 
    public static boolean IsAPositiveDouble(double number1)
    {
        return number1 > 0 ;
    }
    // To Check if a Double is Negative 
    public static boolean IsANegativeDouble(double number1)
    {
        return number1 < 0 ;
    }
    // To Check if a Double is Zero 
    public static boolean IsAZeroDouble(double number1)
    {
        return number1 == 0 ;
    }
    // To Check if Two Numbers are Equal 
    public static boolean IsEqual(int number1, int number2)
    {
        return number1 == number2 ;
    }
    // To Check if Two Numbers are Not Equals 
    public static boolean IsUnEqual(int number1, int number2)
    {
        return number1 != number2 ;
    }
    // To Check if The Given Number is a Odd Number 
    public static boolean IsOdd(int number)
    {
        return number % 2 != 0 ;
    }
    // To Check if The Given Number is a Even Number 
    public static boolean IsEven(int number)
    {
        return number % 2 == 0 ;
    }
    // To Check the Bigger Number Among  Two Numbers 
    public static boolean IsBigger(int number1 , int number2)
    {
        return number1 > number2 ;
    }
    // To Check the Smallest Number Among  Two Numbers
    public static boolean IsSmaller(int number1 , int number2)
    {
        return number1 < number2 ;
    }
    // To Check if The Person is Tall
    public static boolean IsTall(int height) 
    {
        return height >= 160; // 5 foot and 3 inches
    }
    // To Check if The Person is Short
    public static boolean IsShort(int height) 
    {
        return height < 160; // 5 foot and 3 inches
    }
    // To Check if The Given Angle's Represent A Triangle
    public static boolean IsATriangle(int angle1, int angle2, int angle3)
    {
        return angle1 + angle2 + angle3 == 180 ;
    }
    // To Check if The Given Angle's Does Not Represent A Triangle
    public static boolean IsNotATriangle(int angle1, int angle2, int angle3)
    {
        return angle1 + angle2 + angle3 != 180 ;
    }
    // To Get The Largest Among Four Numbers.
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
    // To Get The Largest Among Three Numbers.
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
    // To Get The Smallest Among Three Numbers.
    static int GetSmallestAmongThree(int number1, int number2, int number3)
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
    // To Check if The Given Alphabet Is A Vowel
    public static boolean IsVowel(char letter)
    {
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    // To Display The Name Of the Shape in accordance With The Number of Sides.
    public static String GetShape(int sides)
    {
        String shape = "";
        switch (sides)
        {
            case 3 :
            {
            shape = "The Shape You Want is Triangle .. ";
            break;
            }
            case 4:
            {
            shape = "The Shape You Want is Square .. ";
            break;
            }
            case 5:
            {
            shape = "The Shape You Want is Pentagon .. ";
            break;
            }
            case 6:
            {
            shape = "The Shape You Want is Hexagon .. ";
            break;
            }
            case 7:
            {
            shape = "The Shape You Want is Heptagon .. ";
            break;
            }
            case 8:
            {
            shape = "The Shape You Want is octagon .. ";
            break;
            }
            case 9:
            {
            shape = "The Shape You Want is Nonagon .. ";
            break;
            }
            case 10:
            {
            shape = "The Shape You Want is Decagon .. ";
            break;
            }
            default :
            {
            shape = "Enter The Value For Sides Between 3 And 10 ..";
            break;
            }
        }
        return shape;    
    }
    // To Display the Number of Days In a Given Month.
    public static String GetNumberOfDays(String month)
    {
        String days = "";
        String month1 = month.toLowerCase();
        switch (month1)
        {
            case "january":
            {

            }
            case "march":
            {
                
            }
            case "may":
            {
                
            }
            case "july":
            {
                
            }
            case "august":
            {
                
            }
            case "october":
            {
                
            }
            case "december":
            {
                days = "The Number Of Days in " + month1 + " is 31";
                break;
            }
            case "april" :
            {

            }
            case "june" :
            {
                
            }
            case "september" :
            {
                
            }
            case "november" :
            {
                days = "The Number Of Days in " + month1 + " is 30"; 
                break;
            }
            case "february" :
            {
                days = "The Number Of Days in " + month1 + " is 28";
                break;
            }
            default :
            {
                days = "Enter Valid Month.";
                break;
            }
        }
        return days;
    }
    // To Display Which Day of the Week For The Given Date.
    public static String GetTheDay(int date)
    {
        String day = "";
        switch(date % 7)
        if(date > 0 && date <= 31 && date % 7 == 0)
        {
            day = "Today is Sunday..";
        }
        else if(date > 0 && date <= 31 && date % 7 == 1)
        {
            day = "Today is Monday..";
        }
        else if(date > 0 && date <= 31 && date % 7 == 2)
        {
            day = "Today is Tuesday..";
        }
        else if(date > 0 && date <= 31 && date % 7 == 3)
        {
            day = "Today is Wednesday..";
        }
        else if(date > 0 && date <= 31 && date % 7 == 4)
        {
            day = "Today is Thursday..";
        }
        else if(date > 0 && date <= 31 && date % 7 == 5)
        {
            day = "Today is Friday..";
        }
        else if(date > 0 && date <= 31 && date % 7 == 6)
        {
            day = "Today is Saturday..";
        }
        else if (date <= 0 || date > 31)
        {
            day = "Enter Valid Data ..";
        }
        return day;
    }
    // To Display The Name of The Triangle In Accoradance With The Sides Given.
    public static String GetTriangleName(float side1, float side2, float side3)
    {
        String triangle = "";
        if (side1 == side2 && side2 == side3)
        {
            triangle = "The Given Sides Represents A Equilateral Triangle .. ";
        }
        else if ( side1 == side2 || side2 == side3 || side3 == side1)
        {
            triangle = "The Given Sides Represents A Isosceles Triangle .. ";
        }
        else if (side1 != side2 && side2 != side3)
        {
            triangle = "The Given Sides Represents A Scalene Triangle .. ";
        }
        return triangle;
    }
    // To Get Grade Ranks For the Given Grade Points.
    public static String ToGetGradeRanks(int points)
    {
        String grade = "";
        if(points > 0 && points >= 90)
        {
            grade = "Your Grade is : A";
        }
        else if(points > 0 && points >= 80)
        {
            grade = "Your Grade is : B";
        }
        else if(points > 0 && points >= 70)
        {
            grade = "Your Grade is : C";
        }
        else if(points > 0 && points >= 60)
        {
            grade = "Your Grade is : D";
        }
        else if(points > 0 && points >= 50)
        {
            grade = "Your Grade is : E";
        }
        else if(points > 0 && points < 50)
        {
            grade = "Your Grade is : F";
        }
        else if(points < 0)
        {
            grade = "Please Enter Valid Input .. ";
        }
        return grade;
    }
    //To Diplay The Color Of The Square In Accordance With The Given Row And Column.
    public static String GetColorOfTheSquareInBoard(int row1 , char column1 )
    {
        String color = "";
        char column2 = Character.toLowerCase(column1);

        if( row1 == 1 || row1 == 3 || row1 == 5  || row1 == 7 ) 
        {
            if (column2 == 'a' || column2 == 'c' || column2 == 'e' || column2 == 'g' )
            {
                color = "The Color Of " + row1 + "-" + column1 + " Is Black.";
            }
        }
        if( row1 == 2 || row1 == 4 || row1 == 6  || row1 == 8 )
        {
            if( column2 == 'b' || column2 == 'd' || column2 == 'f' || column2 == 'h' )
            {
                color = "The Color Of " + row1 + "-" + column1 + " Is Black.";
            }      
        }
        if( row1 == 2 || row1 == 4 || row1 == 6  || row1 == 8 )
        {
            if( column2 == 'a' || column2 == 'c' || column2 == 'e' || column2 == 'g' )
            {
                color = "The Color Of " + row1 + "-" + column1 + " Is White.";
            }
            
        }
        if( row1 == 1 || row1 == 3 || row1 == 5  || row1 == 7 ) 
        {
            if(column2 == 'b' || column2 == 'd' || column2 == 'f' || column2 == 'h' )
            {
                color = "The Color Of " + row1 + "-" + column1 + " Is White.";
            }    
        }
        return color;
    }
    //To Calculate The Roots Of The Quadratic Equation.
    public static void GetRootsOfQuadraticEquation(double a, double b, double c)
    {
        double calc1 = ToGetSquareValue(b, 2);  // b^2
        double calc2 = 4 * a * c ;             // 4ac
        double calc3 = calc1 - calc2 ;        //  b^2 - 4ac
        if(IsAPositiveDouble(calc3) )
        {
            double root1 = ( -b + Math.sqrt(calc3) ) / (2 * a);
            double root2 = ( -b - Math.sqrt(calc3) ) / (2 * a);
            System.out.printf("This Quadratic Equation Has 2 Roots : %.2f ,%.2f " , root1 , root2);
        } 
        else if(IsANegativeDouble(calc3) )
        {
            System.out.println("This Quadratic Equation Has No Real Roots");
        }
        else if(IsAZeroDouble(calc3) )
        {
            double root1 = - b / (2 * a) ; 
            System.out.printf("This Quadratic Equation Has 2 Roots : %.2f " ,root1 );
        }
    }
    //To Check if its Profit Depending On The Buying And Selling Price.
    public static boolean IsProfit(double bought , double sold)
    {
        if(bought < sold)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // To Check if its Loss Depending On The Buying And Selling Price.
    public static boolean IsLoss(double bought , double  sold)
    {
        if (bought > sold)
        {
            return true;
        }
        else
        {
            return false;
        }   
    }
    // To Calculate Profit Amount Or Loss Amount.
    public static double ToCalcProfitOrLossAmount(double bought , double sold)
    {
        double amount = Math.abs(sold - bought);
        return amount;
    }
    // To Calculate Profit Percentage Or Loss Percentage.
    public static double ToCalcProfitOrLossPercent(double bought , double sold)
    {
        double amount = Math.abs(sold - bought);
        double percentage = ( amount / bought ) * 100 ;
        return percentage;
    }
    // If The User Input Is "Rock"  in Rock, Paper and Scissors.
    public static boolean IsRock(int choise)
    {
        return choise == 1;
    }
    // If The User Input Is "Paper"  in Rock, Paper and Scissors.
    public static boolean IsPaper(int choise)
    {
        return choise == 2;
    }
    // If The User Input Is "Scissors"  in Rock, Paper and Scissors.
    public static boolean IsScissors(int choise)
    {
        return choise == 3;
    }
    
}   










