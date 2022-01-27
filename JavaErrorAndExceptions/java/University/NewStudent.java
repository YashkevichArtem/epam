package University;

public class NewStudent {
    private int id;
    private String faculty;
    private int group;

    public NewStudent(int id, String faculty, int group) {
        this.id = id;
        this.faculty = faculty;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getGroup() {
        return group;
    }
}
