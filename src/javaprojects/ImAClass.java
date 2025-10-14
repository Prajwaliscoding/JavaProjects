 /* Given the constructor below, declare the class that it is a constructor for, 
 list all the data fields that the class would have, and list all the methods that it would need to have 
 (you don't have to write them, just give the first line with access type, return type, name, and parameters).  
Basically, you are writing the class around the constructor.  
[You may use the back of another page if needed but make a note on this page if the rest of the answer is somewhere else.]
*/

public class ImAClass{
	
	private String department;
	private int courseNumber, year, numberEnrolled, maxCapacity;
	private String instructor;
	private boolean preProfessional, labClass;
	private char studentStatus;
	
	
	public ImAClass(String department, int courseNumber, Semester courseSemester, 
			int year, String instructor, boolean preProfessional, 
			boolean labClass, int numberEnrolled, int maxCapacity, char studentStatus)
	{
	      super(department, courseNumber, courseSemester, year);
	      this.instructor = instructor;
	      this.preProfessional = preProfessional;
	      this.labClass = labClass;

	      if (!(setNumberEnrolled(numberEnrollled, maxCapacity)))
	      {
	            setNumberEnrolled(0,30);
	      }

	      if (!(setStudentStatus(studentStatus)))
	      {
	            setStudentStatus( 'U');
	      }
	      
	      
	}
	
	
}


