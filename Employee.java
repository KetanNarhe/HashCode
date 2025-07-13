package OOPS;

public class Employee 
{
   String name;
   int empid;
   String comp;
   double sal;
   int exp;
   char grade;           
                
   
   
   public Employee()
   {
	   
   }



   public Employee(String name, int empid, String comp, double sal, int exp, char grade)
   {
	
	this.name = name;
	this.empid = empid;
	this.comp = comp;
	this.sal = sal;
	this.exp = exp;
	this.grade = grade;
   }
   
   
   public boolean equals(Object o)
   {
	   Employee e=(Employee)o;
	   
	   return this.name==e.name && this.empid==e.empid && this.comp==e.comp
			   && this.exp==e.exp&& this.sal==e.sal && this.grade==e.grade;
	    
   }    
              
      public int hashcode()
      {                                                                          
		return empid+exp+grade+comp.hashCode()+name.hashCode();
    	  
      }
   
}
