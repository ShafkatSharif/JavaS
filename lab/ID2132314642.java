package Test;
import java.sql.SQLOutput;
import java.util.Scanner;
class Employee{
 private double bonus , salary , fine;
 Employee(){}
 Employee(double a, double b, double c)
 {
  bonus = a;
  salary = b;
  fine = c;
 }
 Employee(Employee a)
 {
  bonus = a.bonus;
  salary = a.salary;
  fine = a.fine;
 }
 Employee(double b)
 {
  salary = b;
 }

 public void setBonus(double bonus){
  this.bonus = bonus;
 }
 public void setSalary(double salary){
     this.salary = salary;
 }
 public void setFine(double fine){
     this.fine = fine;
 }
 public double getFine(){
     return fine;
 }
 public double getSalary(){
     return salary;
 }
 public double getBonus(){
     return bonus;
 }
 public double totalSalary(){
    return salary+bonus-fine;
 }
}

public class ID2132314642 {
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    Employee Employee1 = new Employee();
   System.out.println("Enter the Employee no.2 bonus, salary and fine: ");
    Employee Employee2 = new Employee(in.nextDouble(),in.nextDouble(),in.nextDouble());
    Employee Employee3 = new Employee(Employee2);
    Employee Employee4 = new Employee(5000);

     System.out.println("Total salary of the employee no.1 is: "+Employee1.totalSalary());
     System.out.println("Total salary of the employee no.2 is: "+Employee2.totalSalary());
     System.out.println("Total salary of the employee no.3 is: "+Employee3.totalSalary());
     System.out.println("Total salary of the employee no.3 is: "+Employee4.totalSalary());

     Employee2.setSalary(10000);
     Employee2.setBonus(200.5);
     Employee2.setFine(100);
     System.out.println("New data of the Employee no.2 is: Salary: "+Employee2.getSalary()+", Bonus: "+Employee2.getBonus()+", Fine: "+Employee2.getFine());

     System.out.println("New Salary of Employee no.2 is: "+Employee2.totalSalary());


 }

}
