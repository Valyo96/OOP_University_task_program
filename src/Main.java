import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = null;
        List<MaintenanceEmployee> employees = new ArrayList<>();
        List<AdministrationEmployee> administrationEmployees = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();


        while(true) {
            String input = UserInput.returnUserInput();
            String[] arr;
            if (input.length() > 4) {
                arr = Utilities.shredStringToStrings(input);
                if (Utilities.checkStringArrayValueOfIndex(arr).equals("MAINT")) {
                    employees.add(new MaintenanceEmployee(arr[2], Utilities.parseStringToInteger(arr[3])));

                } else if (Utilities.checkStringArrayValueOfIndex(arr).equals("TEACH")) {
                    teachers.add(new Teacher(arr[2], Utilities.parseStringToInteger(arr[3]), arr[4]));
                } else if (Utilities.checkStringArrayValueOfIndex(arr).equals("STUD")) {
                    students.add(new Student(arr[2], Utilities.parseStringToInteger(arr[3]), arr[4], arr[4])); // cheatnah , che neshto ne moga da se opravq, iskam idei :D
                } else if (Utilities.checkStringArrayValueOfIndex(arr).equals("ADMIN")) {
                    administrationEmployees.add(new AdministrationEmployee(arr[2], Utilities.parseStringToInteger(arr[3]), arr[4]));
                }

                university = new University(students, teachers, employees, administrationEmployees);


                if (Utilities.checkStringArrayValueOfIndex(arr).equals("WORK")) {
                    for (MaintenanceEmployee employee : employees) {
                        if (arr[1].equals(employee.getName())) {
                            employee.work(students, teachers, employees, administrationEmployees);
                            if (university.getBankAccount() > 0) {
                                university.paySalaryToMaintenance(employee);
                            }
                        }
                    }
                    for (AdministrationEmployee employee : administrationEmployees) {
                        if (arr[1].equals(employee.getName())) {
                            employee.work(students, teachers, employees, administrationEmployees);
                            if (university.getBankAccount() > 0) {
                                university.paySalaryToAdministration(employee);
                            }
                        }
                    }
                    for (Teacher teacher : teachers) {
                        if (arr[1].equals(teacher.getName())) {
                            teacher.work(students, teachers, employees, administrationEmployees);
                            if (university.getBankAccount() > 0) {
                                university.paySalaryToTeacher(teacher);
                                System.out.println(teacher.getName()+" has received salary!");
                            }
                        }
                    }
                    for (Student student : students) {
                        if (arr[1].equals(student.getName())) {
                            student.work(students, teachers, employees, administrationEmployees);
                            university.increaseBankAccountWhenStudentWorks(student);
                        }
                    }
                }
            } else {
                if (input.equals("IDLE")) {
                    university.whenNoBodyIsWorking();
                    for (Student student : students) {
                        if (student.getTolerance() <= 0) {
                            System.out.println(student.getName() + " is not happy!");
                        }
                    }
                    for (Teacher teacher : teachers) {
                        if (teacher.getTolerance() <= 0) {
                            System.out.println(teacher.getName() + "is not happy!");
                        }
                    }
                    for (MaintenanceEmployee employee : employees) {
                        if (employee.getTolerance() <= 0) {
                            System.out.println(employee.getName() + "is not happy!");
                        }
                    }
                    for (AdministrationEmployee employee : administrationEmployees) {
                        if (employee.getTolerance() <= 0) {
                            System.out.println(employee.getName() + "is not happy!");
                        }
                    }
                }
                if (input.equals("END")) {
                    return;
                }
                if (university.getBankAccount() <= 0) {
                    System.out.println("Bankrupcy!!!");
                }
            }
        }
    }
}