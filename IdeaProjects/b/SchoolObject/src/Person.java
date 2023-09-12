public abstract class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age=7;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<3)
        {System.out.println("Name must be at least 3 characters");}
        else{this.name = name;}
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length()<3)
        {System.out.println("Surname must be at least 3 characters");}
        else{this.surname = surname;}

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            this.age=0;
        }else{this.age = age;}

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
