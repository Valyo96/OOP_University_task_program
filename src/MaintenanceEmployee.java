import java.util.List;

public class MaintenanceEmployee extends Employee{
    public MaintenanceEmployee(String name ,int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salaryPerHour = 15;
        this.tolerance = 20;
    }
    @Override
    public void work(List<Student> students , List<Teacher> teachers , List<MaintenanceEmployee> maintenanceEmployees, List<AdministrationEmployee> administrationEmployee) {
        for(Student student : students){
            student.setTolerance(student.getTolerance()+2);
        }
        for(Teacher teacher : teachers){
            teacher.setTolerance(teacher.getTolerance()+2);
        }
        for(AdministrationEmployee employee : administrationEmployee){
            employee.setTolerance(employee.getTolerance()+2);
        }
        this.tolerance+=2;


    }
}
