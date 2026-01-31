// Print STAR pattern
/*


*
**
***
****

*/


/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      for(int i=1;i<=4;i++){
        for(int j=1; j<=i;j++){
          System.out.print("*");
        }
        System.out.println();

      }
    }
}
*/


//Print INVERTED-STAR pattern
/*


****
***
**
*


*/

/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      int n=4;
      for(int i=1;i<=4;i++){

      
        for(int j=1; j<=4-i+1;j++){
          System.out.print("*");
        }
        System.out.println();
      }

      }
    }
*/



// Print HALF-PYPRAMD pattern:
/*

1
12
123
1234


*/

/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      int n=4;
      for(int i=1;i<=4;i++){

      
        for(int j=1; j<=4-i+1;j++){
          System.out.print("1 ");
        }
        System.out.println();
      }

    }
} 
 */





//Print the pattern

/*


*****
*   *
*   * 
***** 


*/
/* 
import java.util.*;
public class pattern { 
  public static void main(String args[]){
    int n=4;
    int m=5;

    for(int i=1; i<=n; i++){
      for(int j=1; j<=m; j++) {
        if(i==1 || j==1 || i==n || j==m){

        
        System.out.print("*");
       }
       else{
        System.out.print(" ");
       }
      }
    System.out.println();
    
    }
  }
}

*/



/* 
   *
  **
 ***
****
      
*/
/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      int n=5;

      for(int i=1;i<=n;i++){
        for(int j=1; j<=n-i;j++){
          System.out.print(" ");
        }
        for(int j=1;j<i;j++){
        System.out.print("*");

      }
      System.out.println();
    }
  }
}
*/

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      for(int i=1;i<=4;i++){
        for(int j=1; j<=i;j++){
          System.out.print(j+" ");
          
        }
        System.out.println();

      }
    }
}
    */




/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/


/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      int n=5;
      for(int i=1;i<=n;i++){
        for(int j=1; j<=n-i+1;j++){
          System.out.print(j+" ");
        }
        System.out.println();

      }
    }
}*/

/*
1 
2  3 
4  5  6 
7  8  9  10
11 12 13 14 15
 */

/*
import java.util.*;
public class pattern{
    public static void main(String args[]){
      int n=5;
      int number=1;
      for(int i=1;i<=n;i++){
        for(int j=1; j<=i;j++){
          System.out.print(number+" ");
          number++;
            
        }
        System.out.println();

      }
    }
}

*/

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1    */

/* 
import java.util.*;
public class pattern{
    public static void main(String args[]){
      int n=5;
      for(int i=1;i<=n;i++){
        for(int j=1; j<=i;j++){
          int sum=i+j;
        if(sum%2==0){
          System.out.print("1 ");
        } else{
            System.out.print("0 ");
          }
        }
  
          
      
        System.out.println();
      }
    }
  
  }
*/




//Print CHARACHER pattern 
/*
A
B C
D E F
G H I J */
/*
import JAVA.util.*;
public class pattern{
  public static void main(String args[]){
    char ch='A';
    int n=4;
    for(int i=1; i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(ch);
        ch++;
      }
      System.out.println(" ");
    }
  }
}
  */


//print HOLLOW RECTSNGLE pattern
/*


* * * * *
*       *
*       *
* * * * *


*/


import java.util.*;
public class pattern{
  public static void hollow_rectangle(int Rows, int Cols){
    //outer loop
    for(int i=1; i<=Rows; i++) {
      //inner columns
      for(int j=1; j<=Cols;j++){
        //cell-(i,j)
        if(i==1 || i==Rows || j==1 || j==Cols){
          //boundary cells
          System.out.print("* ");
        } else{
          System.out.print("  ");
        }
      }
      System.out.println(" ");
    }
  }
  public static void main(String args[]){
    hollow_rectangle(4,5);
  }

}