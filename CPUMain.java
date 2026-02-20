import java.util.Scanner;
class CPU{
double price;
CPU(){
}
CPU(double p){
price=p;
}

class Processor{
int no_of_cores;
String manufacturer;
Processor(){
}
Processor(int c,String n)
{
 no_of_cores=c;
 manufacturer=n;
}}
static class RAM{
   double memory;
   String manufacturer;
RAM(){
}
RAM(double m,String n)
{
  memory=m;
  manufacturer=n;
}}
}

public class CPUMain{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("CPUprice:");
  double pr=sc.nextDouble();
  sc.nextLine();
 CPU cpuObj = new CPU(pr);
   System.out.println("number of core:");
   int c=sc.nextInt();
   sc.nextLine();
    System.out.println("manufacturer :");
   String n1=sc.nextLine();
 
 CPU.Processor p = cpuObj.new Processor(c,n1);
  System.out.println("memory:");
  double m=sc.nextDouble();
  sc.nextLine();
   System.out.println("manufacturer :");
    String n2=sc.nextLine();
 CPU.RAM r = new CPU.RAM(m,n2);
  System.out.println("------------details of cpu-----------");
 System.out.println("CPU price:"+cpuObj.price);
  System.out.println("munber of core:"+p.no_of_cores);
   System.out.println("manufacturer:"+p.manufacturer);
  System.out.println("memory:"+r.memory);
  System.out.println("manufacturer:"+r.manufacturer);
}
}
