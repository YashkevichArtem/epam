package University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) throws Exception {
        University university = new University();
        Faculty facultyOfHistory = new Faculty("History");
        Faculty facultyOfBiology = new Faculty("Biology");
        Group groupOfHistory1 = new Group("1");

        university.setFaculty(new ArrayList<>(Arrays.asList(facultyOfHistory,facultyOfBiology)));
    }
}
