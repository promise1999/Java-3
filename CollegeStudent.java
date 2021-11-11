public class CollegeStudent extends Student{
    protected String major;
    protected int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa, year, major);
        this.year = year;
        this.major = major;
        
    }
    // getter method
    public double getYear() {
        return year;
    }
    public String getMajor(){
        return major;
    }
    // setter method
    public void setYear(int year ){
        this.year = year;
    }
    public void setMajor(String major){
        this.major = major;
    }
    // to string method
    public String toString(){
        return "Student[Name = " + myName + " Age = " + myAge + " Gender = "+ myGender +" myIdNum = " + myIdNum + " myGPA = "+ myGPA +  " year = "+ year + " major = "+ major +"]";
    }  
}
