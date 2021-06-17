class Employee{
  private String name, address;
  private int year;
  public Employee(String n, int y, String add)
  {
        name = n;
        year = y;
        address = add;
  }
  public String getName()
  {
        return name;
  }
  public int getYear()
  {
        return year;
  }
  public String getAddress()
  {
        return address;
  }
}

public class Main
{
	public static void main(String[] args) {
		Employee e1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreet");
        System.out.println("Name\t  Year of joining\t     Address");
        System.out.println(e1.getName()+"\t       "+e1.getYear()+"\t\t"+e1.getAddress());  
        System.out.println(e2.getName()+"\t       "+e2.getYear()+"\t\t"+e2.getAddress());   
        System.out.println(e3.getName()+"\t       "+e3.getYear()+"\t\t"+e3.getAddress());  
	}
}
