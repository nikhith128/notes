class Student
{
    String usn;
    String name;
    int marks;
}

Student s1 = new Student();

             CLASS
          ┌─────────────┐
          │   Student   │
          │-------------│
          │ USN         │
          │ Name        │
          │ Marks       │
          └─────────────┘
                 │
                 │ new
                 ▼
             OBJECT
          ┌─────────────┐
          │ s1          │
          │-------------│
          │ AL25CS094   │
          │ Nikhith     │
          │ 80          │
          └─────────────┘

class Student
{
    String name;
    int marks;
}

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();                               Student     s1       new Student()
                                                                    │         │            │
                                                                  class    variable    creates object
                                                                    
        s1.name = "Nikhith";
        s1.marks = 80;

        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
}
//create another object?
Student s1 = new Student();
Student s2 = new Student();

s1 ───► Student
        name = Nikhith
        marks = 80

s2 ───► Student
        name = Anil
        marks = 90

    
//  8. Why did you use private?
//You wrote:
private String usnNum;
// private means other classes/objects cannot directly access that variable.
//For example:
s1.usnNum = "AL25CS094";
//will not work if usnNum is private.
