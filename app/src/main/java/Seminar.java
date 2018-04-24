import java.util.ArrayList;

public class Seminar {

    private String mname;
    private String mteacher;
    private String mtime;
    private String mlocation;

    public Seminar(String name, String teacher, String time, String location) {

        mname = name;
        mteacher = teacher;
        mtime = time;
        mlocation = location;

    }

    public String getName() {
        return mname;
    }

    public String getTeacher() {
        return mteacher;
    }

    public String getTime() {
        return mtime;
    }

    public String getLocation() {
        return mlocation;
    }

    public static ArrayList<Seminar> createSeminarList() {

        ArrayList<Seminar> seminars = new ArrayList<Seminar>();

        seminars.add(new Seminar("Hist 2010", "Mr.Jones", "8am", "Haley 601"));
        seminars.add(new Seminar("Chem 1010", "Mr.Parker", "9am", "Haley 305"));
        seminars.add(new Seminar("Biol 1090", "Ms.Jenny", "10am", "Rouse 200"));
        seminars.add(new Seminar("Math 3030", "Mr.Butler", "8am", "Parker 201"));

        return seminars;
    }
}
