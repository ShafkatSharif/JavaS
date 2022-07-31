
package lab9;

 
public class Employee extends person {

   
    private String id, depertment;
    private double salary;
    Employee(String name, String gender , int age, String id , String depertment, double salary){
        super(name,gender,age);
        this.id = id;
        this.depertment = depertment;
        this.salary = salary;  
    }

    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

   
    public String getDepertment() {
        return depertment;
    }

   
    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }

   
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
    	return super.toString()+"Id: "+id+ "Depertment: "+depertment+"Salary= "+salary;
    }
    public void printinfo() {
    	System.out.println("Name: "+getName()+" "+"Gender: "+getGender()+" "+"Age: "+getAge()+" "+"Id: "+id+ "Depertment: "+depertment+"Salary= "+salary);
    }
}
