package Lab4;

public class Faculty extends Employee implements Rules {
   private String [] courses;

   public Faculty(String name, double salary, String [] courses)
   {
       super.name = name;
       super.salary = salary;
       setCourses(courses);
   }

    /*public Faculty (int numberOfCourses)
    {
        collection = new String[numberOfCourses];
        //remember - each of the CDs in the array are still null
        count = 0;
        totalCost = 0.0;
    }
    */
   @Override
   public String getName()
   {
       String pName = "Professor " + name;
       return pName;
   }

   public String [] getCourses()
   {
       String [] copyCourses = new String[courses.length];

       for (int i = 0; i < courses.length; i++)
       {
           copyCourses[i] = (courses[i]);
       }
       return copyCourses;
   }

   public String getCourseNames()
   {
       String cName = "";

       for (int i = 0; i < courses.length; i++)
       {
           cName += courses[i] + "\n";
       }
       return cName;
   }

    public void setCourses(String[] addCourses) {
        String [] copyCourses = new String[addCourses.length];

        for (int i = 0; i < addCourses.length; i++)
        {
            copyCourses[i] = "" + (addCourses[i]);
        }
        courses = copyCourses;
    }

    public String toString()
    {
        String display = String.format(getName() + " has a salary of " + getSalary() + " and teaches these courses: ");
        for (int i = 0; i < courses.length; i++)
        {
            display += String.format(courses[i] + " ");
        }
        return display;
    }
}
