package assignment.datastructure;
import java.util.*;
import java.util.logging.*;
import java.util.Comparator;
public class StudentTest
{
    public static void main( String[] args )
    {
    	String name;
    	int age;
    	double gpa;
    	Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("hi");
    	boolean b = true;
        List<Student> arrlist = new ArrayList<Student>();
    	while(b)
    	{
    		logger.info("1.Add Details\n2.Exit");
    		logger.info("Choose 1 or 2: ");
        	int x = sc.nextInt();
    		if(x==1)
    		{
		        logger.info("Student Name:");
		        name = sc.next();
		        logger.info("Student Age:");
		        age = sc.nextInt();
		        logger.info("Student GPA:");
		        gpa = sc.nextDouble();
		        Student obj = new Student(name,age,gpa);
		        arrlist.add(new Student(name,age,gpa));
    		}
    		else {
    			b=false;
    		}
    	}       
        for(int i=0;i<arrlist.size();i++)
        {
        	logger.info("Name: " + arrlist.get(i).getName()+ " " +"Age: " +arrlist.get(i).getAge() + " " +"GPA:"+arrlist.get(i).getGpa());
        }
        Comparator<Student> com = new Comparator<Student>() {
        	public int compare(Student s1, Student s2) {
				if(s2.getGpa()>s1.getGpa())
				{
					return 1;
				}
				else if(s2.getGpa()< s1.getGpa())
				{
					return -1;
				}
				else
					return 0;
			}
        };
        
        Collections.sort(arrlist,com);
        logger.info("Sorted List");
        for(int i=0;i<arrlist.size();i++)
        {
        	logger.info("Name: " + arrlist.get(i).getName() + " " +"GPA:"+arrlist.get(i).getGpa());
        }
        sc.close();
    }
}
