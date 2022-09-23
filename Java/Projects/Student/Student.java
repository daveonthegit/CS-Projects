package Projects.Student;

public class Student {
    private String name;
    private String email;
    {
        name = "missing, missing";
        email = "missing";
    }
    public Student(String initName, String initEmail){
        name = initName;
        email = initEmail;
    }
    public void setName(String fName, String lName){
        name = (fName + ", " + lName);
    }
    public void setEmail(String newEmail){
        name = newEmail;
    }
    public void print(){
        System.out.println(name + ":" + email);
    }
    public String toString() {
    return name.toString() + ":" + email.toString();
    }
}