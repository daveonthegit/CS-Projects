package Projects.Student;

public class StudentRunner {
    public static void main(String[] args){
    //Create four students (with fake emails) 
        Student s1 = new Student("Hitotsu", "hitotsu@bths.edu");
        Student s2 = new Student("Futatsu", "futatsu@bths.edu");
        Student s3 = new Student("Mittsu", "mittsu@bths.edu");
        Student s4 = new Student("Yottsu", "yottsu@bths.edu");
    //print out the student info for each student
        s1.print();
        s2.print();
        s3.print();
        s4.print();
    //change the of emails to their nycstudents.net email
        s3.setEmail("msan0003@nycstudents.net");
        s4.setEmail("yyon004@nycstudents.net");
        s3.print();
        s4.print();
    //change the names so they have the format first name, last name
        s3.setName("Mittsu", "San");
        s4.setName("Yottsu", "Yon");
    //test out the toString() method
        s3.toString();
        s4.toString();
    }
}