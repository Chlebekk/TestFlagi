public class Main {
    public static void main(String[] args) {
        //Person Person1=new Person("Jan","Mama",230957092);
        //System.out.println(Person1.getName()+","+Person1.getSurname()+","+Person1.getAge());
        //Person Person2 =new Person("Ola","Nowak");
        //System.out.println(Person2);
        Student student1P1= new Student("Maksiu","Golgowski",3);
        Student student1P2 = new Student("NieMaksiu","NieGolgowski",23);
        System.out.println(student1P1);
        System.out.println(student1P2);
        Teacher teacherSN=new Teacher("Sebastian","Nowak","Polish","PE");
        System.out.println(teacherSN);
        Class class2AC =new Class("AC",student1P1,student1P2);
        System.out.println(class2AC);
        Class class3AC=new Class(class2AC);
        System.out.println(class3AC);
        Supervising supervising1= new Supervising("Anna","Kowalska",class3AC,"Math","Meth","Chemistry");
        System.out.println(supervising1);
    }


}