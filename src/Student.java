public class Student    // class header
{ // class body
    private String name; // declaration of a field
    // define a String field for student ID called studentID

    public Student(String aName) // class constructor - take in second parameter
    {
        this.name = aName;
        // assign the value passed in as studentID parameter to the field studentID
    }

    public void sayHi()
    {
        System.out.println("hola");
    }

    public void sayName()
    {
        System.out.println("Hi, my name is " + name);
    }
}
