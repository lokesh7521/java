//LOOP: For loop , while loop , d0-while loop

//While LOOP:
/* 
while(condition){
    //do something
}*/


//Example 
/* 
import java.util.*;
public class Loop {
    public static void main(String args[]){
        int counter=0;
        while(counter<10){
            System.out.println("Hello Lokesh Kumawat");
            counter++;

        }


    }
}



//Print Sum pf first n natural numbers 

import java.util.*;
public class Loop{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("n:");
        int n = sc.nextInt();
        int sum = 0;

        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("sum is : "+sum);
    }
}
    */



//For loos 
/* 
for(intitalisation;condition;updation){
    //do something
}*/

/* 
import java.util.*;
public class Loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<n;i++){
            System.out.println("Hellow Lokesh");
        }

    }
}

*/

/* 
//Print SQUARE pattern
import java.util.*;
public class Loop{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            System.out.println("****");
        }
    }
}
    */


//Print Reverse of a number :  n=10899
/* 
import java.util.*;
public class Loop{
    public static void main(String args[]){
        int n = 10899;
        while(n>0) {
            int i = n%10;
            System.out.print(i+"");
            n=n/10;
        }
        System.out.println();
    }
}
    */


/* 
//Reverse the given numbefr :  n= 10899

import java.util.*;
public class Loop{
    public static void main(String args[]){
        int n = 10899;
        rev=
        while(n>0){
            int i=n%10;
            rev=(rev*10) + i;
            n=n/10;
        }
        System.out.println(rev);
    }

}
*/



// do while loop:
/*
do{
//do something 
}while(condition)
 */
/* 
import java.util.*;
public class Loop{
    public static void main(String args[]){
        int c=1;
        do{
            System.out.println("hello word");
            c++;
        }while(c<=10);
    }
}*/



// Keep entering number till user enters a number a multiple of 10 
/* 
import java.util.*;
public class Loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number :");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);

        }while(true);
    }
}*/




/* 
//Continue Statement : to skip an iteration
import java.util.*;
public class Loop{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            if (i==3){
                continue;
            
            }
            System.out.println(i);
        }
    }
}
*/




//Check if a number is prime or not :prime:2,3,4,5,7,11....

import java.util.*;
public class Loop{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("n is prime ");
        }
        else{
            boolean isPrime =true;
            for(int i=2; i<=n-1;i++) {
                if(n%i==0){
                    isPrime=false;

                }
            }
            if(isPrime==true){
                System.out.println("n is prime ");

            }else{
                System.out.println("n is not prime");
                        
            }
        }
    }
}