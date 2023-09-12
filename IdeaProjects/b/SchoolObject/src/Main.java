public class Main {
    public static void main(String[] args) {
        Person Person1=new Person("Jan","Mama",230957092);
        System.out.println(Person1.getName()+","+Person1.getSurname()+","+Person1.getAge());
        Person Person2 =new Person("Ola","Nowak");
        System.out.println(Person2);
        Student student1P1= new Student("Maksiu","Golgowski",3);
        Student student1P2 = new Student("NieMaksiu","NieGolgowski",23);
        System.out.println(student1P1);
        System.out.println(student1P2);
    }

}