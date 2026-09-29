public class Main
{
     public static  void main(String[] args)
   {
    Teacher teacher = new Teacher("Mrs. Brown", 10);
    Subject subject = new Subject("Java" , 4 , teacher);
    Student student = new Student("Maria", 16, subject);

    student.showStudentInfo();
   }
}