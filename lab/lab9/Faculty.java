package lab9;

public class Faculty extends Employee {
	private String initial, rank;
	Faculty(String name, String gender , int age, String id , String depertment, double salary,String initial,String rank)
	{
		super(name,gender,age,id,depertment,salary);
		this.setInitial(initial);
		this.setRank(rank);
	   
	}
	public String getInitial() {
		return initial;
	}
	public void setInitial(String initial) {
		this.initial = initial;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString() {
		return super.toString()+"Initial: "+initial+ "Rank: "+rank;
	}
	 public void printinfo() {
	    	System.out.println("Name: "+getName()+" "+"Gender: "+getGender()+" "+"Age: "+getAge()+" "+"Id: "+getId()+ "Depertment: "+getDepertment()+"Salary= "+getSalary()+"Initial: "+initial+ "Rank: "+rank);
	    }
}
