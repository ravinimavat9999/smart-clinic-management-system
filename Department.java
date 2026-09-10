public class Department {

    private int departmentId;
    private String departmentName;
    private String description;

    public Department(int departmentId, String departmentName, String description) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.description = description;
    }

    public void addDoctor() {
        System.out.println("Doctor added to department.");
    }

    public void removeDoctor() {
        System.out.println("Doctor removed from department.");
    }

    public void displayDepartmentDetails() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Description: " + description);
    }
}
