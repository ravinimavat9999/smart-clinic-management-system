public class Clinic {

    private Integer clinicId;
    private String clinicName;
    private String address;
    private String phoneNumber;
    private String email;
    private String openingTime;
    private String closingTime;
    private String status;

    public Clinic() {
    }

    public Clinic(Integer clinicId, String clinicName, String address,
                  String phoneNumber, String email, String openingTime,
                  String closingTime, String status) {

        this.clinicId = clinicId;
        this.clinicName = clinicName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.status = status;
    }

    public Integer getClinicId() {
        return clinicId;
    }

    public void setClinicId(Integer clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void openClinic() {
        this.status = "OPEN";
    }

    public void closeClinic() {
        this.status = "CLOSED";
    }

    public boolean isOpen() {
        return "OPEN".equalsIgnoreCase(this.status);
    }

    public void displayClinicInfo() {
        System.out.println("Clinic ID: " + clinicId);
        System.out.println("Clinic Name: " + clinicName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Status: " + status);
    }
}
