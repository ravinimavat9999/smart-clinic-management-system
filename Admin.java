public class Admin {

    private int adminId;
    private String name;
    private String email;
    private String phone;

    public Admin(int adminId, String name, String email, String phone) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void manageAppointments() {
        System.out.println("Managing appointments...");
    }

    public void manageDoctors() {
        System.out.println("Managing doctors...");
    }

    public void managePatients() {
        System.out.println("Managing patients...");
    }

    public void generateReports() {
        System.out.println("Generating clinic reports...");
    }

    public void displayAdminDetails() {
        System.out.println("Admin ID: " + adminId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
