public class Student {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String dateOfBirth;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student(int id, String name, String surname, String fatherName, String dateOfBirth, String address,
                   int phoneNumber, String faculty, int course, int group){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    public String toString(){
        return "Student [id=" + id
                + ", name=" + name
                + ", surname=" + surname
                + ", fatherName=" + fatherName
                + ", dateOfBirth=" + dateOfBirth
                + ", address=" + address
                + ", phoneNumber=" + phoneNumber
                + ", faculty=" + faculty
                + ", course=" + course
                + ", group=" + group + "]";
    }
}
