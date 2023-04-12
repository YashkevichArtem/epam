package University;

import java.util.Set;
import java.util.TreeSet;

public class Faculty {

    private String facultyName;
    private Set<Group> groupsSet;

    public Faculty(String nameFaculty) {
        this.facultyName = nameFaculty;
        groupsSet = new TreeSet<>();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Set<Group> getGroupsSet() {
        try {
            if (groupsSet.isEmpty()) throw new Exception("The faculty " + getFacultyName() + " is empty and has no groups!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return groupsSet;
    }

    public void addGroup(String groupName) {
        try {
            if (groupsSet.contains(groupName)) throw new Exception("Group " + groupName + " already created!");
            groupsSet.add(new Group(groupName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
