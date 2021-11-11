public class Student extends Person{
   protected String myIdNum;
   protected double myGPA;

    public Student(String name, String gender, int age, String idNum, double gpa, String year) {
    super(name, age, gender);
        this.myGPA = gpa;
        this.myIdNum = idNum;

    }
    
    public Student(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender);
        this.myGPA = gpa;
        this.myIdNum = idNum;
    }
    //getters method
    public String getMyName() {
        return myName;
    }
    public int getMyAge() {
        return myAge;
    }
    public double getMyGPA() {
        return myGPA;
    }
    public String getGender(){
        return myGender;
    }
    public String getmyIdNum(){
        return myIdNum;
    }
    public double getmyGPA(){
        return myGPA;
    }
   
    //setter method
    public void setMyName(String myName) {
        this.myName = myName;
    }
    public void setmyAge(int age) {
        this.myAge = age;
    }
    public void setmyGender(String gender) {
        this.myGender= gender;
    }
    public void setMyIdNum(String myIdNum) {
        this.myIdNum= myIdNum;
    }
    public void setmyGPA(int myGPA) {
        this.myGPA= myGPA;
    }

    // To string method
    public String toString(){
        return "Student[Name = " + myName + " Age= " + myAge + " Gender = " + myGender + " myIdNum = " + myIdNum + " myGPA = " + myGPA + "]";
    }  
}
