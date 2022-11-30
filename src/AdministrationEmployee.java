import java.util.List;

public class AdministrationEmployee extends Employee{
    private String subjects;

    public AdministrationEmployee(String name ,int phoneNumber, String subjects) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salaryPerHour = 19;
        this.subjects = subjects;
        this.tolerance = 20;
    }
    @Override
    public void work(List<Student> students , List<Teacher> teachers , List<MaintenanceEmployee> maintenanceEmployees, List<AdministrationEmployee> administrationEmployees) {
        for(Student student : students) {
            student.setTolerance(student.getTolerance() + 3);
        }
        for(Teacher teacher : teachers){
            teacher.setTolerance(teacher.getTolerance()+3);
        }
        for(MaintenanceEmployee employee : maintenanceEmployees) {
           employee.setTolerance(employee.getTolerance() + 1);
        }
    }
}
