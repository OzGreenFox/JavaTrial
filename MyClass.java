// printing stars


   //     	 *
   //      *  *
   //     *  *  *
   //   *  *  *  *
   //  *  *  *  *  *


public class MyClass {
  public static void main(String[] args) 
{
int i,j,k;
for(i=1; i<=10; i++) //defines rows
{
for(j=10; j>=i; j--) // j is defined as a shrinking number
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++) // k prints the stars the number grows ultill...
{
System.out.print("*");
}
System.out.println("");
}
}
}



