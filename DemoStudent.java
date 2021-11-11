public class DemoStudent {
    public static void main(String[] args) {

        Person bob = new Person("Bob", 27, "M");
        System.out.println(bob);
        System.out.println();

        Student lynne = new Student("Lynne Brooke", "F", 16, "HS95129", 3.5, "0");
        System.out.println(lynne.toString());
        System.out.println();

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava.toString());
        System.out.println();

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
        System.out.println();
    } 
} 

       