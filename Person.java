public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
    public String toString(){
        return "Person[Name = " + myName + " Age= " + myAge + "Gender = "+ myGender +"]";
    }

}
