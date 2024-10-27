import java.util.*;
public class ArrInput {
public static void main(String args[]){
    int marks[] =new  int [50];

Scanner scn = new Scanner(System.in);
System.out.print("Enter the marks of physics:");
marks[0] = scn.nextInt();
System.out.print("Enter marks of chemistry:");
marks[1] = scn.nextInt();
System.out.print("Enter the marks of Maths:");
marks[2] = scn.nextInt();


System.out.println("physics:"+marks[0]);
System.out.println("Chemistry:"+marks[1]);
System.out.println("Maths:"+marks[2]);
int percentage = (marks[0]+marks[1]+marks[2])/3;
System.out.println("Percentage:"+percentage+"%");
  }
}