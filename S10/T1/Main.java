import java.util.*;
import java.util.Scanner;
public class Main{

  void solution(int[] array, int [] aaray1) {
      
    // Write code here
   
//     print new array here
        System.out.println(Arrays.toString()); // type name of new array inside Arrays.toString()
   
    
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n]; 
    for(int i=0; i<n; i++)  
    {  
         
        array[i]=sc.nextInt();  
    } 
    
     Scanner sc1 = new Scanner(System.in);
    int x = sc1.nextInt();
    int[] array1 = new int[x]; 
    for(int i=0; i<x; i++)  
    {  
         
        array1[i]=sc.nextInt();  
    } 
    test.solution(array,array1);
  }
}
