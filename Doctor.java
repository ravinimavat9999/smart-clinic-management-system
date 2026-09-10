public class Doctor {

    private Long doctorId;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String specialization;
    private String licenseNumber;
    private String phoneNumber;
    private Integer yearsOfExperience;

    public Doctor() {
    }

    public Doctor(Long doctorId, String username, String password,
                  String email, String fullName, String specialization,
                  String licenseNumber, String phoneNumber,
                  Integer yearsOfExperience) {

        this.doctorId = doctorId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void displayDoctorDetails() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + fullName);
        System.out.println("Specialization: " + specialization);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }
}
