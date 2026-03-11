import java.util.Scanner;
import mathutils.calculator;
public class packageDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
calculator calc=new calculator();
System.out.println("enter first number:");
int num1=sc.nextInt();
System.out.println("enter second number:");
int num2=sc.nextInt();
System.out.println("--------Results-------");
System.out.println("addition:"+calc.add(num1,num2));
System.out.println("subtraction:"+calc.sub(num1,num2));
System.out.println("multiplication:"+calc.mul(num1,num2));
if(num2==0){
System.out.println("not divisible by zero");
}
else{
System.out.println("division:"+calc.div(num1,num2));
}
}
}
