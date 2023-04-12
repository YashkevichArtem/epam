package University;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties;

    public List<Faculty> getFaculties() {
        try {
            if (faculties.isEmpty()) throw new Exception("University is empty and don't have groups.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return faculties;
    }
    public void setFaculty(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}