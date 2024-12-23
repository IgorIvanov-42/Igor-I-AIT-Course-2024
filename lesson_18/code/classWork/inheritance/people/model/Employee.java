package classWork.inheritance.people.model;

public class Employee extends Human{

    int id;
    double salary;
    String jobTitle;
    int workExperience;

    public Employee(boolean gender, double height, double weight, String race, String country, String eyeColor, int id, double salary, String jobTitle, int workExperience) {
        super(gender, height, weight, race, country, eyeColor);
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
    }

    public Employee(int i, String n2, String ln2, int i1, boolean b) {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", workExperience=" + workExperience +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }


}// end of class
