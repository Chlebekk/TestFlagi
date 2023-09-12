public final class Supervising extends Teacher{
    private Class sClass;

    /**
     * Supervising reprezentuję obiekt nauczyciel z dodaną klasą którą wychowuje
     * @param name -imię Wychowawcy
     * @param surname - nazwisko Wychowawcy
     * @param sClass- Klasa którą wychowuje
     * @param subjects - przedmioty których uczy
     */
    public Supervising(String name, String surname, Class sClass, String... subjects) {
        super(name, surname, subjects);
        this.sClass = sClass;
    }
}
