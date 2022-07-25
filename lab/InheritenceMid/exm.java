package InheritenceMid;

class Employee{
    int id;
    String name;
    int salary;
    int bonus;

    Employee(int id, String name, int salary, int bonus)
    {
        this.id = id;
        this.name= name;
        this.salary = salary;
        this.bonus = bonus;
    }
    public int totalSal()
    {
        return salary+bonus;
    }
    public String toString(){
        return "Employee name: "+name+"Id: "+ id + "Total Salary: "+totalSal();
    }
}
class Employee1 extends Employee{
    int fine;
    Employee1(int id,String name ,int salary,int bonus,int fine)
    {
        super(id,name,salary,bonus);
        this.fine = fine;
    }

    public String toString(){
        return "Total Salary after fine = "+(super.totalSal()-fine);
    }
}
class Employee2 extends Employee{
    int extra;
    Employee2(int id, String name , int salary, int bonus, int extra){
        super(id, name, salary, bonus);
        this.extra = extra;
    }

    public String toString(){
        return "Total Salary after giving extra = "+(super.totalSal()+extra);
    }
}

public class exm {
    public static void main(String[] args){
        Employee e = new Employee (1,"Rahim", 10000,1000);
        System.out.println(e);
        Employee1 e1 = new Employee1(1,"Rahim",10000,1000,5000);
        System.out.println(e1);
        Employee2 e2 = new Employee2(1,"Rahim",10000,10000,5000);
        System.out.println(e2);
    }
}
