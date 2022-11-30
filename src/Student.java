import java.util.List;

public class Student extends Human{
    private String facultyNumber;
    private String subject;
    private int tolerance;

    public Student(String name , int phoneNumber ,String facultyNumber, String subject) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.facultyNumber = facultyNumber;
        this.subject = subject;
        this.tolerance = 20;
    }

    public int getTolerance() {
        return tolerance;
    }

    public void setTolerance(int tolerance) {
        this.tolerance = tolerance;
    }

    @Override
    public void work(List<Student> students , List<Teacher> teachers , List<MaintenanceEmployee> maintenanceEmployees, List<AdministrationEmployee> administrationEmployees) {
        this.tolerance+=2;
        for(MaintenanceEmployee employee : maintenanceEmployees){
            employee.setTolerance(employee.getTolerance()-1);
        }
    }
}
