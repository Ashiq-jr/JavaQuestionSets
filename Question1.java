import java.util.*;
import java.lang.*;
class SumOfNumbers
{
    public static void main (String[]args)
    {
        //Question1
        // int number1 = GetInteger("Enter the First Number : ");
        // int number2 = GetInteger("Enter the Second Number : ");
        // System.out.println("The sum of the Numbers is : " + CalcSumOfTwoNumbers(number1, number2)); 
        // System.out.println("The Difference of the Numbers is : " + CalcDifferenceOfTwoNumbers  (number1, number2));
        // System.out.println("The Product of the Numbers is : " + CalcProductOfTwoNumbers(number1, number2));

        //Question2
        // int number1 = GetInteger("Enter The First Number : ");
        // int number2 = GetInteger("Enter The Second Number : ");
        // System.out.printf("The Value of  %d raised to %d is %.0f", number1, number2,ToCalcPower(number1, number2));

        //Question3
        // double length = GetDouble("Enter the Length of the Tank : ");
        // double width = GetDouble("Enter the width of the Tank : ");
        // double height = GetDouble("Enter the height of the Tank : ");
        // System.out.println("The Volume of the tank is : " + GetVolumeOfReactangularTank(length, width, height) + " metres.");

        //Question 4
        // double radius = GetDouble("Enter the Radius of the Circle : ");
        // System.out.printf("The Raidus of the Circle is : %.2f" , GetPerimeterOfCircle(radius));

        //Question5
        // int number1 = GetInteger("Enter the First Number : ");
        // int number2 = GetInteger("Enter the Second Number : ");
        // System.out.println(ToCalcNumeratorAndDenominator(number1, number2));

        //Question6
        // int number1 = GetInteger("Enter the Number");
        // if (number1 >=0)
        // {
        //     System.out.println("The Square of the Number is : " + ToCalcPower(number1, 2) );
        // }
        // else
        // {
        //     System.out.println("Enter a Positive Number ... ");
        // }

        //Question7
        // int number1 = GetInteger("Enter the Number : ");
        // if (number1 >= 0)
        // {
        //     System.out.println("The Squareroot of the Number is : " + ToCalcSquareroot(number1));
        // }
        // else
        // {
        //     System.out.println("Enter a Positive Number ... ");
        // }

        //Question8
        // int length = GetInteger("Enter the Length of the Traiangle : ");    
        // int breadth = GetInteger("Enter the Breadth of the Traiangle : ");    
        // if (length > 0 && breadth > 0)
        // {
        //     ToCalcAreaOfTriangle(breadth, length);
        // }
        // else
        // {
        //     System.out.println("Enter a Valid Measurement ... ");
        // }

        //Question9
        // float kilometre = GetFloat("Enter The Distance in Kilometre's : ");
        // if(kilometre > 0)
        // {
        //     ToConvertKilometreIntoMiles(kilometre);
        // }
        // else
        // {
        //     System.out.println("Enter Valid Distance .. ");
        // }

        //Question10
        // float celsius = GetFloat("Enter the Temperature in Degree Celsius : ");
        // if(celsius >= -273) //0 kelvin = -273 Degree Celsius(lowest possible value)
        // {
        //     ToConvertCelsiusIntoFahrenheit(celsius);
        // }
        // else
        // {
        //     System.out.println("Enter Proper Value for Degree Celsius ..");

        // }

        //Question11
        // int number1 = GetInteger("Enter the First Number : " );
        // int number2 = GetInteger("Enter the Second Number : " );
        // if(number1 != number2)
        // {
        //     ToSwapUsingTempVariable(number1, number2);
        // }
        // else if(number1 == number2)
        // {
        //     System.out.println("The Two Numbers are Equal ... ");
        // }
     
        //Question12
        // float number1 = GetFloat("Enter the First Number : " );
        // float number2 = GetFloat("Enter the Second Number : " );
        // if (number1 % 1 > 0 || number2 % 1 > 0)
        // {
        //     System.out.println("Please Dont Enter Decimal Values .. ");
        // }
        // else if (number1 <= 0 || number2 <= 0)
        // {
        //     System.out.println("Please Enter Natural Numbers .. ");
        // }
        // else if(number1 - number2 != 0)
        // {
        //     ToSwapWithoutTempVariable(number1, number2);
        // }
        // else if(number1 - number2 == 0)
        // {
        //     System.out.println("The Two Numbers are Equal ... ");
        // }

        //Question13
        // int number1 = GetInteger("Enter the First Number : " );
        // int number2 = GetInteger("Enter the Second Number : " );
        // if(number1 - number2 != 0)
        // {
        //     ToSwapUsingLogicalOperation(number1, number2);
        // }
        // else if(number1 - number2 == 0)
        // {
        //     System.out.println("The Two Numbers are Equal ... ");
        // }

        //Question14
        // Random r = new Random();
        // int x = r.nextInt(21, 51);
        // System.out.println(x);

        //Question15
        // float length = GetFloat("Enter the length of the Field : ");
        // float width = GetFloat("Enter the Width of the Field : ");
        // if (length > 0 && width > 0 )
        // {
        //    double areainsqft = ToCalculateAreaOfField(length, width);
        //    ToConvertSqFtIntoAcre(areainsqft);
        // }
        // else if (length <= 0 && width <= 0 )
        // {
        //     System.out.println("Enter Proper Value for Length and Width ..");
        // }
        // else if (length <= 0 )
        // {
        //     System.out.println("Enter Proper Value for Length ..");
        // }
        // else if (width <= 0 )
        // {
        //     System.out.println("Enter Proper Value for Width ..");
        // }

        //Question16
        // int number = GetInteger("Enter the Value of 'N' (Hint : ' 1 to 2147483647 ' ) : ");
        // if (number > 0)
        // {
        //     ToCalcSumOfNaturalNumbers(number);
        // }
        // else if (number < 0)
        // {
        //     System.out.println("Please Enter Number Between 1 and 2147483647 ... ");
        // }

        //Question17
        // float number1 = GetFloat("Enter the First Number : ");
        // float number2 = GetFloat("Enter the Second Number : ");
        // float number3 = GetFloat("Enter the Third Number : ");
        // if (( number1 > 0) && (number2 > 0) && (number3 > 0))
        // {
        //     System.out.printf("The Average of the Three Numbers is %.2f", ToCalcAverage(number1, number2, number3));
        // }
        // else if (( number1 <= 0) || (number2 <= 0) || (number3 <= 0))
        // {
        //     System.out.printf("Please Enter Three Natural Numbers .. ");
        // }

        //Question18
        // double amount = GetFloat("Enter the Bill Amount : ");
        // if (amount > 0)
        // {
        //     ToCalcTipAmount(amount);
        // }
        // else if (amount <= 0)
        // {
        //     System.out.println("Enter Valid Bill Amount .. ");
        // }

        //Question19
        // double totalamount = GetDouble("Enter the Total Amount Paid : ");
        // double taxpercent = GetDouble("Enter the Tax Percentage : ");
        // if ( totalamount > 0 && taxpercent >= 0)
        // {
        //  ToCalcNetAmountPaid(totalamount, taxpercent);
        // }
        // else if ( totalamount <= 0 || taxpercent < 0)
        // {
        //  System.out.println("Enter Valid Data .. ");
        // }

        //Question20
        // double basicpay = GetDouble("Enter the Basic Pay : ");
        // double da = GetDouble("Enter the Dearness Allowance Percentage : ");
        // double ta = GetDouble("Enter the Travel Allowance Percentage : ");
        // if(basicpay > 0 && da >= 0 && ta >=0)
        // {
        //    System.out.printf("your Gross Pay is Rs.%,6.2f .. " , ToCalcGrossPay(basicpay, da, ta));
        // }
        // else if (basicpay <= 0 || da < 0 || ta < 0)
        // {
        //     System.out.println("Please Enter Valid Data .. ");
        // }
        
        //Question21
        // double principal = GetDouble("Enter the Principal Amount : ");
        // double years = GetDouble("Enter The Number of Years : ");
        // double rate = GetDouble("Enter the Rate of Interest : ");
        // if ( principal > 0 && years > 0 && rate > 0 )
        // {
        // System.out.printf("The Simple Interest For Rs. %,6.2f is Rs. %,6.2f .. " , principal , + ToCalcSimpleInterest(principal , years , rate ));
        // }
        // else if ( principal <=0 && years > 0 && rate > 0 )
        // {
        //     System.out.println("Enter Valid Principal Data .. ");
        // }
        // else if ( principal > 0 && years <= 0 && rate > 0 )
        // {
        //     System.out.println("Enter Valid Number Of Years .. ");
        // }
        //  else if ( principal > 0 && years > 0 && rate <= 0 )
        // {
        //     System.out.println("Enter Valid Rate of interest .. ");
        // } 
        // else if ( principal <= 0 || years <= 0 || rate <= 0 )
        // {
        //     System.out.println("More Than one Invalid Input's  ..");
        // }

        //Question22
        // double principal = GetDouble("Enter the Principal Amount : ");
        // double years = GetDouble("Enter The Number of Years : ");
        // double rate = GetDouble("Enter the Rate of Interest : ");
        // double times = GetDouble("Enter the Number of times in Which the Interest is Compounded : ");
        // if ( principal > 0 && years > 0 && rate > 0 && times > 0 )
        // {
        //     ToCalcCompoundInterest(principal , years , rate , times );
        // }
        // else if ( principal <=0 && years > 0 && rate > 0 && times > 0)
        // {
        //     System.out.println("Enter Valid Principal Data .. ");
        // }
        // else if ( principal > 0 && years <= 0 && rate > 0 && times > 0)
        // {
        //     System.out.println("Enter Valid Number Of Years .. ");
        // }
        //  else if ( principal > 0 && years > 0 && rate <= 0 && times > 0)
        // {
        //     System.out.println("Enter Valid Rate of interest .. ");
        // } 
        // else if ( principal > 0 && years > 0 && rate <= 0 && times <= 0)
        // {
        //     System.out.println("Enter Valid Input for Number of times in Which Interest is Compounded .. ");
        // }
        // else if ( principal <= 0 || years <= 0 || rate <= 0 || times <= 0)
        // {
        //     System.out.println("More Than one Invalid Input's  ..");
        // }

        //Question23
        // float centimetre = GetFloat("Enter your Height in Centimetre's : ");
        // if(centimetre > 0)
        // {
        //     System.out.println(ToConvertHeightIntoFeetAndInches(centimetre)); 
        // }
        // else if ( centimetre <= 0)
        // {
        //     System.out.println("Enter Valid Input .. ");
        // }
         
        //Question24
        // float height = GetFloat("Enter Your Height in Metre's : ");
        // float weight = GetFloat("Enter Your Weight in Kilogram : ");
        // if ( height > 0 && weight > 0 )
        // {
        //     ToCalcBMI(height,weight);
        // }
        // else if ( height <= 0 && weight <= 0 )
        // {
        //     System.out.println("Enter Valid Input for Height and weight .. ");
        // }
        // else if ( height <= 0 && weight > 0 )
        // {
        //     System.out.println("Enter Valid Input for Height .. ");
        // }
        //  else if ( height > 0 && weight <= 0 )
        // {
        //     System.out.println("Enter Valid Input for Weight .. ");
        // }
        
        //Question25
        float rollno = GetFloat("Enter Your Roll number : ");
        String name = GetString("Enter Your Name  : ");
        float maths = GetFloat("Enter Your Maths Mark : ");
        float science = GetFloat("Enter Your Science Mark: ");
        float social = GetFloat("Enter Your Social Mark : ");
        if ( IsPositiveOrZero(maths) && IsPositiveOrZero(science) && IsPositiveOrZero(social) )
        {
            double total = ToCalcTotal(maths, science, social);
            double average = ToCalcAverage(maths, science, social);
            System.out.printf("Your Name is : %s , Your Roll Number is %.0f , Your Total Marks is : %.0f and Your Average Mark is : %.2f .." , name , rollno , total ,average);
        }
        else if ( IsNegative(maths) && IsPositiveOrZero(science) && IsPositiveOrZero(social) )
        {
            System.out.println("Enter Valid Maths Mark .. ");
        }
        else if ( IsPositiveOrZero(maths) && IsNegative(science) && IsPositiveOrZero(social) )
        {
            System.out.println("Enter Valid Science Mark .. ");
        }
        else if ( IsPositiveOrZero(maths) && IsPositiveOrZero(science) && IsNegative(social) )
        {
            System.out.println("Enter Valid Social Mark .. ");
        }
        else if ( IsNegative(maths) && IsNegative(science) && IsNegative(social) )
        {
            System.out.println("All Three Are Invalid Data's ");
        }
        else if ( IsNegative(maths) && IsNegative(science) && IsPositiveOrZero(social) )
        {
            System.out.println("Enter Valid Data For Maths And Sciene  ");
        }
        else if ( IsNegative(maths) && IsPositiveOrZero(science) && IsNegative(social) )
        {
            System.out.println("Enter Valid Data For Maths And Social   ");
        }
        else if ( IsPositiveOrZero(maths) && IsNegative(science) && IsNegative(social) )
        {
            System.out.println("Enter Valid Data For Science And Social  ");
        }

        
       
    




        


       
    }
    
    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        return temp;
    }
    public static double GetDouble(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        double temp  = sc.nextDouble();
        return temp;
    }
    public static long GetLong(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        long temp = sc.nextLong();
        return temp;
    }
    public static float GetFloat(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        return temp;
    }
    public static String GetString(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return temp;
    }
     public static int CalcSumOfTwoNumbers(int number1, int number2)
    {
        int sum = number1 + number2;
        return sum;
    }
     public static int CalcDifferenceOfTwoNumbers(int number1, int number2)
    {
        int difference = Math.abs(number1 - number2);
        return difference;
    }
     public static double CalcProductOfTwoNumbers(int number1, int number2)
    {
        double product = number1 * number2;
        return product;
    }
    public static double ToCalcDivision(int number1, int number2)
    {
        double quotient = number1 / number2;
        return quotient;
    }
     public static double CalcDivisionToGetRemainder(int number1, int number2)
    {
        double remainder = number1 % number2; 
        return remainder;

    }
    public static double ToCalcPercentage(double number1 ,double rate)
    {
        double percentage = (number1 / 100) * rate ;
        return percentage;
    }
    public static double ToCalcPower(int number1, int number2)
    {
        Double power = Math.pow(number2 , number1);
        return power;
     
    }
    public static double GetVolumeOfReactangularTank(double length, double width, double height)
    {
        double volume = length * width * height ;
        return volume;
    }
    public static double GetPerimeterOfCircle(double radius)
    {
        double perimeter = 2 * Math.PI *radius;
        return perimeter;
    }
    public static String ToCalcNumeratorAndDenominator(int number1, int number2)
    {
        String temp = "";
        int numerator = number1 / number2;
        temp += "The Numerator is : " + numerator  + " ... The Denominator is : ";
        int denominator = number1 % number2;
        temp += denominator + " ...";
        return temp;
    }
    public static double ToCalcSquareroot(int number1)
    {
        return Math.sqrt(number1);
    }
    public static void ToCalcAreaOfTriangle(float breadth , float height)
    {
       double area = 1/2.0 * breadth * height;
       System.out.printf("The Area of the Triangle is : %.2f metre. ", area);
    }
    public static void ToConvertKilometreIntoMiles(float kilometre)
    {
        double miles = kilometre * 1.60934;
        System.out.printf("The Distance of %.2f Kilometre Converted into Miles is : %.2 miles " , kilometre, miles );
    }
    public static void ToConvertCelsiusIntoFahrenheit(float celsius)
    {
        double fahrenheit = ( (celsius * (9 / 5.0) ) + 32 );
        System.out.printf("The Temperature in %.2f Celsius Converted into Fahrenheit is : %.2f F", celsius, fahrenheit);
    }
    public static void ToSwapUsingTempVariable(int number1, int number2)
    {
        System.out.printf("The Two Numbers Before Swapping is %d : %d .... " , number1 , number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.printf("And The Two Numbers After Swapping is %d : %d " , number1 , number2);
    }
    public static void ToSwapWithoutTempVariable(float number1, float number2)
    {
        System.out.printf("The Two Numbers Before Swapping is %.0f : %.0f .... " , number1 , number2);
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.printf("The Two Numbers After Swapping is %.0f : %.0f .... " , number1 , number2);
    }
    public static void ToSwapUsingLogicalOperation(int number1, int number2)
    {
        System.out.printf("The Two Numbers Before Swapping is %d : %d .... " , number1 , number2);
        number1 = number1 ^ number2;
        number2 = number1 ^ number2;
        number1 = number1 ^ number2;
        System.out.printf("The Two Numbers After Swapping is %d : %d .... " , number1 , number2);
    }
    public static double ToCalculateAreaOfField(float length , float width)
    {
        double areainsqft = length * width ;
        return areainsqft;
    }
     public static void ToConvertSqFtIntoAcre(double areainsqft)
    {
        double areainacre = areainsqft / 43560.0 ;
        System.out.printf("The Area Of the Field is : %,6.2f  acres " , areainacre);
    }
    public static void ToCalcSumOfNaturalNumbers(int number)
    {
        long natural = ( number * ( number + 1 ) / 2 );
        System.out.printf("The Sum of Natural Numbers Upto %d is %d .. " , number, natural);
    }
     public static double ToCalcTotal(float number1, float number2, float number3)
    {
        double total = number1 + number2 + number3;
        return total;
    }
    public static double ToCalcAverage (float number1 , float number2, float number3)
    {
        double average = ( number1 + number2 + number3 ) / 3;
        return average;
    }
    public static void ToCalcTipAmount(double billamount)
    {
        double tipamount = ToCalcPercentage(billamount, 5.0);
        System.out.printf("The Tip Amount for Rs.%,6.2f is Rs.%,4.2f .. " ,billamount , tipamount);
    }
    public static void ToCalcNetAmountPaid(double total, double tax)
    {
        double net =( total *100 ) / (100 + tax);
        System.out.printf("The Net Amount Paid is Rs.%,6.2f , The Tax Percentage is %.1f  and The Total Amount Paid is Rs.%,6.2f", net, tax, total);
    }
    public static double ToCalcGrossPay(double basicpay, double da, double ta)
    {
        double grosspay = basicpay + ToCalcPercentage(basicpay , da) + ToCalcPercentage(basicpay , ta) - ToCalcPercentage(basicpay , 8.0);
        return grosspay;
    }
    public static double ToCalcSimpleInterest(double principal, double years, double rate)
    {
        double interest = ( principal * years * rate ) / 100.0;
        return interest;
    }
    public static void ToCalcCompoundInterest(double principal , double years, double rate, double times)
    {
        double calculation1 = ( 1 + ( rate / 100 ) / times ) ;
        double calculation2 = years * times ; 
        double calculation3 = Math.pow(calculation1, calculation2) ;
        double calculation4 = principal * calculation3;
        double compound = calculation4 - principal ;
        System.out.printf("The Compound Interest for Rs.%,6.2f is Rs.%,5.2f .. " , principal, compound);
    }  
    public static String ToConvertHeightIntoFeetAndInches(float centimetre)
    {
        String result = "";
        double feet = centimetre / 30.48;
        result += "Your Height is " + String.valueOf((int) feet)  + " feet and ";
        double remainder = centimetre % 30.48; 
        double inch = remainder / 2.54 ; 
        result += String.valueOf((int) inch) + " inches" ;
        return result;
    }        
    public static void ToCalcBMI(float height, float weight)
    {
        double bmi = Math.abs(weight / (height * height)) ;
        System.out.printf("Your BMI is : %3.2f .." , bmi);
    }  
    public static boolean IsPositiveOrZero(float number1) 
    {
        return number1 >= 0;
    }   
     public static boolean IsNegative(float number1) 
    {
        return number1 < 0;
    }   
                      
}