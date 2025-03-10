package task_manager;

public class Employee {
    private String name;
    private String department;
    private String mail;
    private String jobTitle;
    private int id;
    private double salary;
    private double bonus;
    private int countTask;

    public Employee() {
    }

    public Employee(String name, String department, String mail, String jobTitle, int id, double salary, double bonus, int countTask) {
        this.name = name;
        this.department = department;
        this.mail = mail;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.countTask = countTask;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getMail() {
        return mail;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public int getCountTask() {
        return countTask;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setCountTask(int countTask) {
        this.countTask = countTask;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", mail='" + mail + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", countTask=" + countTask +
                '}';
    }
}