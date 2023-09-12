import java.util.ArrayList;
import java.util.Arrays;

public class Class {
    private ArrayList<Student> students=new ArrayList<>();
    private String name;

    public Class(String name) {
        this.name = name;
    }

    public Class(Class clas) {
        this.students=clas.students;
        this.name=clas.name;
    }

    /**
     * klasa - reprezentuje zespół uczniów
     */
    public Class(String name,Student ...students) {

            this.students.addAll(Arrays.asList(students));
            this.name = name;

    }

    /**
     * @param student -obiekt reprezentujący pojedynczego ucznia
     * @return - brak
     */
    public  void addStudentToClass(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Class{" +
                "students=" + students +
                ", name='" + name + '\'' +
                '}';
    }
}
