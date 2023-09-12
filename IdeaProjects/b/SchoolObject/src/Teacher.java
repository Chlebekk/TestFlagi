import java.util.ArrayList;
import java.util.Arrays;

public sealed class Teacher extends Person permits Supervising{
//sealed permits what can extend the class
private ArrayList<String> Subjects=new ArrayList<>();

    public Teacher(String name, String surname, String ...subjects) {
        super(name, surname);
        this.Subjects.addAll(Arrays.asList(subjects));
    }

    @Override
    public String toString() {
        return "Teacher{name:"+this.getName()+
                ", surname:"+this.getSurname() +
                ", Subjects=" + Subjects +
                '}';
    }
}
