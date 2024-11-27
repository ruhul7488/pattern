public class CodingTest {
// Print a Triangle Pattern: Write a program to print the following triangle pattern:
// *
// ***
// *****.
public static void main(String []a){
 int c=1;
for(int i=1;i<=3;i++){
       
        for(int j=1;j<=c;j++){

                System.out.print("* ");
            
        }
        System.out.println();
       c=c+2;
       }

}
}

