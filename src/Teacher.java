import java.util.List;

public class Teacher extends Employee{
    private String subjects;

    public Teacher(String name ,int phoneNumber ,String subjects) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.subjects = subjects;
        this.salaryPerHour = 25;
        this.tolerance = 20;
    }

    @Override
    public void work(List<Student> students , List<Teacher> teachers , List<MaintenanceEmployee> maintenanceEmployees, List<AdministrationEmployee> administrationEmployees){
       for(Student student : students) {
           student.setTolerance(student.getTolerance() + 3);
       }
       for(MaintenanceEmployee employee : maintenanceEmployees) {
          employee.setTolerance(employee.getTolerance() - 3);
       }
       for(AdministrationEmployee employee: administrationEmployees){
        employee.setTolerance(employee.getTolerance()-1);
    }}
}
