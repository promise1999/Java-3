public class Teacher extends Person{
    protected String subject;
    protected double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject= subject;
        this.salary = salary;

    }
    // getters
    public String getSubject() {
        return subject;
    }
    public double getSalary(){
        return salary;
    }
    //setter
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setSalary(double salary){
        this.salary = salary;
    } 
    public String toString(){
        return "Teacher[Name = " + myName + " Age = " + myAge +  " Gender = "+ myGender + " Subject = " + subject +" Salary = "+ salary +"]";
    }  
    

}
    
