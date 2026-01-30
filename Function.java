//Function/Method: A function is a block of code that is written to perform a specific task, and it can be used again to again.
/*
Syntex: 
returnType name(){
    //body
    return statement;
}
*/
/* 
public class Function{
    public static void printHelloWorld(){
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    return;
}
public static void main(String args[]){
    printHelloWorld();  //   call function 
    
}
}
*/


//Syntax with Parameters
/*
ewturnType name(type param1,type param2) {
    //body
    return statement;
}
*/

//method1
/* 
import java.util.*;
public class Function {
    public static void printHelloWorld(){
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    
}
public static void calculateSum(){
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("sum is:"+sum);
}
public static void main(String args[]){    
    calculateSum();
}
}
*/



//method2
/* 
import java.util.*;
public class Function {


    public static void printHelloWorld(){
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    
}

public static void calculateSum(int a, int b){      //parametrs or formal parametera
    
    int sum = a+b;
    System.out.println("sum is:"+sum);
}
public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();  
    calculateSum(a,b);                              // arguments of actual parameter

}
}

*/



//method3
/* 
import java.util.*;
public class Function {


    public static void printHelloWorld(){
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    System.out.println("Lokesh Kumawat");
    
}

public static int calculateSum(int a, int b){
    
    int sum = a+b;
    return sum;
}
public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();  
    int sum = calculateSum(a,b);
    System.out.println("sum is : "+sum);
}
}
*/




//Check if a number is Prime or not

/* 
import java.util.*;
public class Function {
    

public static boolean isPrime(int n){
    boolean isPrime=true;
    
    
    for(int i=2; i<=n-1;i++){
        if(n%i==0){
            isPrime=false;
            break;       
    }
}
    return isPrime;
         }
public static void main(String args[]){    
    System.out.println(isPrime(4));

    }
}
*/




//call by value: 
/* 
import java.util.*;
public class Function {
public static void swap(int a, int b){
    int temp = a;
    a=b;
    b=temp;
    System.out.println("a = : "+a);
    System.out.println("b = : "+b);
    
    
}
public static void main(String args[]){  
    int a=5;
    int b=10;
    swap(a,b);
    
}
}
*/


//Find Product of a & b
/* 
import java.util.*;
public class Function {
    public static int multiply( int a, int b){
        int product =a*b;
        return product;
    }
    public static void main(String args[]) {
        int a=3;
        int b=5;
        int prod=multiply(a, b);
        System.out.println(prod);
        prod=multiply(5, 8);
        System.out.println(prod);
    }
}
    */



//Factorial of a number (!):  n=4
/* 
import java.util.*;
public class Function{
    public static int Factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;    
    }
    
public static void main (String args[]){
    System.out.println(Factorial(4));
}
}
*/


//Find Binomial Coefficient :n=5,r=2
/* 
import java.util.*;
public class Function{
    public static int Factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;    
    }

    public static int binCoeff(int n, int r) {
         int fact_n=Factorial(n);
         int fact_r=Factorial(r);
         int fact_nmn=Factorial(n-r);

         int binCoeff=fact_n/(fact_r*fact_nmn);
         return binCoeff;
    }
    public static void main(String args[]) {
        System.out.println(binCoeff(5, 2));
        
    }
}
    */







//Methods: there are two types 
// 1.user-definf(self) , 
// 2.in-built(allready)


//Function Overloading: Multiple function with the same name but different parametrs

//fuction to calc sum of 2 number 
/* 
import java.util.*;
public class Function{
    public static int sum(int a, int b){
        return a + b;
    }
    //func to calc sum of 3 num
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String arg[]) {
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));
    }
}
*/



//using Data Types
/*  
import java.util.*;
public class Function{
    public static int sum(int a, int b){
        return a + b;
    }
     public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String arg[]) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
*/

//Check if a number is Prime or not(secind method)
/*
import java.util.*;
public class Function{
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]) {
        System.out.println(isprime(187));
    }
}*/


//
/* 
import java.util.*;
public class Function{
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i=2; i<=n;i++){
             if(isprime(i)) { //true
             System.out.print(i+" ");
        }
    }
    System.out.println(); 
}
    public static void main(String arg[]) {
        primeInRange(21);
    }
}
     */



//Binary to Decimal

/* 
import java.util.*;
public class Function{
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum>0) {
            int lastDigit= binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+ myNum +" = " + decNum);
    }
    public static void main(String args[]) {
        binToDec(101); 
    }
}
    */


//Convert from Decimal to Binary :
import java.util.*;
public class Function{
    public static void binToDec(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;

        while(decNum>0) {
            int rem= decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            decNum=decNum/2;
        }
        System.out.println("binary of "+ myNum +" = " + binNum);
    }
    public static void main(String args[]) {
        binToDec(141); 
    }
} 