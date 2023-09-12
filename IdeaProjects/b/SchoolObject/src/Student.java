public class Student extends Person implements duty{
    private static int HowMany=0;
    private int StudentNmb=0;

    public Student(String name, String surname, int age) {
        super(name, surname, age);
        HowMany++;
        this.StudentNmb=HowMany;
    }

    @Override
    public String toString() {
        return "Student{name:"+getName()+", surname:"+getSurname()+", age:"+getAge()+", studentNumber:"+this.StudentNmb;
    }

    @Override
    public void onDuty() {
        System.out.println("Cleaning the whiteboard");
    }
}
