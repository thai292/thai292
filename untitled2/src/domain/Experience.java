package domain;

public class Experience extends Employee{
    private String yearOfExperience;
    private String proSkill;

    public Experience() {
    }

    public Experience(String yearOfExperience, String proSkill) {
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public Experience(String id, String fullName, String birthDay, String phone, String email, String yearOfExperience, String proSkill) {
        super(id, fullName, birthDay, phone, email);
        this.yearOfExperience = yearOfExperience;
        this.proSkill = proSkill;
    }

    public String getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
