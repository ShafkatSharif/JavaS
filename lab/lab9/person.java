
package lab9;


public class person {

    
  
    private String name,gender;
    private int age;
    person(String name, String gender, int age){
      this.age= age;
      this.gender= gender;
      this.name = name;
      } 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getGender() {
        return gender;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
    	return "Name: "+name+" "+"Gender: "+gender+" "+"Age: "+age+" ";
    }
    public void printinfo() {
    	System.out.println("Name: "+name+" "+"Gender: "+gender+" "+"Age: "+age+" ");
    }
}