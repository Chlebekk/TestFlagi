public class School {
     private String name;
     private int num;
private  static  School school = new School("zs10",10);
    private School(String name,int num){
        this.name=name;this.num=num;
        //private constructor cannot be called outside of class
    }
    public  static  School getSchool(){
        return school;
    }
}
