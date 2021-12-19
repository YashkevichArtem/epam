import java.util.Comparator;

public abstract class CompByGroupAndFaculty implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2){
        int flag = o1.getGroup() - o2.getGroup();

        if(flag == 0) flag = o1.getFaculty().compareTo(o2.getFaculty());
        return flag;
    }
}
