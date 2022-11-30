import java.util.List;

public class University {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<MaintenanceEmployee> maintenanceEmployees;
    private List<AdministrationEmployee> administrationEmployees;

    private int bankAccount;

    public University(List<Student> students, List<Teacher> teachers, List<MaintenanceEmployee> maintenanceEmployees, List<AdministrationEmployee> administrationEmployees) {
        this.students = students;
        this.teachers = teachers;
        this.maintenanceEmployees = maintenanceEmployees;
        this.administrationEmployees = administrationEmployees;
        this.bankAccount = 500;
    }

    public void paySalaryToTeacher(Teacher teacher) {
        this.bankAccount -= teacher.getSalaryPerHour();

    }

    public void paySalaryToAdministration(AdministrationEmployee administrationEmployee) {
        this.bankAccount -= administrationEmployee.getSalaryPerHour();
    }

    public void paySalaryToMaintenance(MaintenanceEmployee maintenanceEmployee) {
        this.bankAccount -= maintenanceEmployee.getSalaryPerHour();
    }

    public void increaseBankAccountWhenStudentWorks(Student student) {
        if (student.getTolerance() >= 50) {
            this.bankAccount += 10;
        }
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void whenNoBodyIsWorking(){
        for(Student student : students){
            student.setTolerance(student.getTolerance()-5);
        }
        for(Teacher teacher : teachers){
            teacher.setTolerance(teacher.getTolerance()-5);
        }
        for(MaintenanceEmployee employee: maintenanceEmployees){
            employee.setTolerance(employee.getTolerance()-5);
        }
        for(AdministrationEmployee employee : administrationEmployees){
            employee.setTolerance(employee.getTolerance()-5);
        }
    }
}
