package domain;

public class Intern extends Employee{
    private String major;
    private String semester;
    private String universityName;

    public Intern() {
    }



    public Intern(String id, String fullName, String birthDay, String phone, String email, String major, String semester, String universityName) {
        super(id, fullName, birthDay, phone, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
