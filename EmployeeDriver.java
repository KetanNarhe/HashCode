package OOPS;

public class EmployeeDriver {

	public static void main(String[] args) {               
		                                              
		Employee e1=new Employee("Ketan",1234,"TCS",50000.,3,'A');
		Employee e2=new Employee ("Ketan",1234,"TCS",50000,3,'A');
		                                        
		System.out.println(e1);            
		System.out.println(e2);           
		                                                 
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
	}

}
