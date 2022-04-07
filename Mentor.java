// Solutions to mentor session questions

QUESTION 1:
 OP: false true    // Concept:- start() and fix() methods did not initialised as "static" even though main() method is static.
                   // This is because object is created inside static main() method and this object inside static is used to call start() and fix() methods.
   
QUESTION 2:
OP: slipstream slip stream  // + --->> Concatenates two strings
                            // called method first executed first then program return to where method was called.
  
QUESTION 3:
OP: tiny        // ternary operators --->> (condition check) ? (If condition True) : (If condition False)

QUESTION 4:  //  SCOPE of Variable --->> s is declared as static variable outside main method so has scope throughout program
OP: 7 14     //  whereas x is declared in start() method so has scope in start() method only. So, even outside start(), value of x is updated then also x will not store updated vaalue.

QUESTION 5:       // pre/post -increament/decreament --->> Pre --> first updates then use  Post --> First Use then update
OP: 33 33 35             int x = ++y + y-- + ++y;
                         (10->11) 11 + 11 -->(10) + 11 (10->11) = 33
                  // x++ --->> prints current value of x = 33 then increament it to 34 // ++x --->> incraement x values first from 34 to 35 then prints 35.
                           
QUESTION 6:     // && --->> Checks only 1st condition, if false --> terminates the loop, if true --> then only checks 2nd condition
OP: 6 3                     if both conditions are true then only goes inside the loop.    // SAME WITH || Operator --->> if 1st true doesn't check 2nd goes inside loop if 1st false --> checks 2nd if false terminates loop, if true goes inside.
                   & --->> Checks both conditions,  | --->> Checks both conditions.
                /* x = 0 --> 1 --> 2 --> 3 --> 4 --> 5 --> 6
                   y = 0 --> 1 --> 2 --> 3
                   z = 0 --> 1 --> 2 --> 3 --> 4 --> 5 */ 
  

QUESTION 7:          // for loop without {} --->> executes only 1st statement closest to it below. int x = 10; --> 1) int x; 2) x = 10; combination of two statements so only one statement required hence gave error.
OP: Comile Error 

QUESTION 8:           // float can't store into int type. --> possibility of loss --> typecasting required
OP: Comile Error      // for( ; ; ) --> 1st part -> initialization --> can initialize any no of variables BUT "All Variables MUST have same data type"
                       int x = 10; float y = 20.0f  -->> ; given for different data types then for loop structure disturbed.
                         
QUESTION 9:           // for( ; ; ) --> 1st part -> initialization --> if it is done outside for, we can write anything there, print statement also works.
OP: Hello, World 
    1

QUESTION 10: 

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Test {
    public static void main(String[] args)
    {
        int num,temp,digit ;
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        
        while(num>0)
        {
            digit = num%10;
            sum = sum * 10 + digit;
            num = num/10;
        }
        
        if(sum == temp)
        {
            System.out.println("The Given number "+temp+" is a PALLINDROME number");
        }
        else
        {
            System.out.println("The Given number "+temp+" is NOT a PALLINDROME number");
        }
    }
}

QUESTION 11: 


// "static void main" must be defined in a public class.
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Test {
    public static void main(String[] args)
    {
        int num,temp,digit ;
        int sum = 0;
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        
        while(num>0)
        {
            digit = num%10;
            sum = sum  + digit*digit*digit;
            num = num/10;
        }
        
        if(sum == temp)
        {
            System.out.println("The Given number "+temp+" is a ARMSTRONG number");
        }
        else
        {
            System.out.println("The Given number "+temp+" is NOT a ARMSTRONG number");
        }
    }
}

QUESTION 12:                //* 
OP: Infinite times HELLO
