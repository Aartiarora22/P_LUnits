import java.util.*;
import java.util.Scanner;
public class Main{

  void solution(String[] array) {
      
    // Write code here
   
  }

  //Test code
  //Don't change anything below this line
  public static void main(String[] args){
    Main test = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] array = new String[n]; 
    for(int i=0; i<n; i++)  
    {  
         
        array[i]=sc.nextLine();  
    }  
    test.solution(array);
  }
}
