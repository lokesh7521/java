//if else
    /*  
if(condition){

}
else{

}



import java.util.*;
public class ConditionalStatement {
public static void main(String args[]){
    int age=22;
    if(age>=18){
        System.out.println("adult:drive, vote");
    }
    else{
        System.out.println("not adult");
    }
}   
    
}
*/



//Print the largest of 2  :  A=1, B=3
/* 
import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        int A=1;
        int B=3;
        if(A>=B){
            System.out.println("A is largest of 2");
        }
        else{
            System.out.println("B is largest of 2");

        }
    }    
}
    */


 


//Print if a number is Odd or Even  (n%2=0(remender) tnen even , another Odd)
/*import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        if(number%2==0) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}*/





// else if Statments

/*
if(condition 1) {
}
else if (condition 2){
}
else{
}
*/



//Example 
/* 
import java.util.*;
public class ConditionalStatement{
    public static void main(String ards[]){
        int age = 13;
        if(age>=18){
            System.out.println("adult");
        }
        else if(age>=13 && age<18){
             System.out.println("teenager");

        }
        else{
            System.out.println("child");
        }
    }
}
    */



//income Tax Calculator
/* 
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income=sc.nextInt();
        int tax;

        if(income<50000) {
            tax=0;
        }
        else if(income>=50000 && income<1000000){
            tax= (int) (income * 0.2);
        }
        else{
            tax=(int) (income*0.3);
        }
        System.out.println("your tax is :"+ tax);

    }
}
*/



//Print the largest of 3 : A=1,B=3,C=6
/*
import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        int A=1;
        int B=3;
        int C=6;
        if((A>=B)&&(A>=C)){
            System.out.println("laegest is A");
        }
        else if(B>=C){
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
}
*/




// Ternary Operator:
// Variable = condition?Statement1:statement2;
/* 
import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        int number = 4 ;
        String type=((number%2)==0)?"even":"odd";
        System.out.println(type);
    }
}
    */



// Check if a student will pass or fail 
// marks>=33:PASS, marks < 33:FAIL
/* 
import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks=sc.nextInt();
        String result = marks>=33?"PASS":"FAIL";
        System.out.println(result);

}
}
*/




//Swich Statement
/*
switch(variable){
case 1: 
case 2:
Case 3:
sefault: 


import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        char click='c';
        switch(click){
            case 'a':System.out.println("start");
                     break;
            case 'b':System.out.println("stop");
                     break;
            case 'c':System.out.println("yes");
                     break;
            case 'd':System.out.println("no");
                     break;
            default:System.out.println("sorry");
                     break;
        }
    }
}
*/



// calculator
import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        System.out.println("enter operators");
        char operators=sc.next().charAt(0);
        switch (operators) {
            case '+' :System.out.println(a+b);       
             break;
             case '-' :System.out.println(a-b);       
             break;
             case '*' :System.out.println(a*b);       
             break;
             case '/' :System.out.println(a/b);       
             break;
        
             default:System.out.println("sorry");  
                break;
        }
    }
}                                           