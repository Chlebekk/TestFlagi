public final class Supervising extends Teacher{
    private Class sClass;

    public Supervising(String name, String surname, Class sClass, String... subjects) {
        super(name, surname, subjects);
        this.sClass = sClass;
    }
}
