import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
 
public class Peak{

  public static void main(String[] args) {
   System.out.println(); 
    
  Random r=new Random();
  System.out.println("please enter number of collumns"); //directions for user
  System.out.println("for best result we recommend odd numbers :)");
  int coll = getNum();
   System.out.println("please enter number of rows");
   System.out.println("for best result we recommend odd numbers :)");
  int rows = getNum();
  int[][] a=new int[rows][coll];
  //creating the matrix
  ArrayList<Integer> nums = new ArrayList<Integer>();
   for(int i = 0; i < (rows*coll-1); i++){
       nums.add(i+1);
   }
  for(int i=0;i<a.length;i++)
  {
      for(int j=0;j<a[i].length;j++)
      {
          //creating the 'peak'
          if(coll/2 == j && rows/2 == i){
          a[i][j]=rows*coll;
          System.out.print(a[i][j]+"\t");
        }
        else{
        int storage =r.nextInt(nums.size());
        a[i][j]=nums.get(storage);
        nums.remove(storage);
        System.out.print(a[i][j]+"\t");}
      }
  
     System.out.print("\n");
  }
  

  
    }
    //getting info from users
    public static int getNum(){
      Scanner sc = new Scanner(System.in);
      int user = 0;
      if(sc.hasNextInt()){
        user = sc.nextInt();
        if(user<0){
            user *= -1;
        }
      }// Create a Scanner object
      else{
          System.out.println("please enter an positive integer");
          user = getNum();
      }

// Output user input
    return user; 
}
  }
  
