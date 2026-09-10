import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   SMART CLINIC MANAGEMENT SYSTEM");
        System.out.println("======================================");

        // 1. Clinic
        Clinic clinic = new Clinic(
                1,
                "City Care Clinic",
                "Ahmedabad",
                "9876543210",
                "citycare@gmail.com",
                "09:00 AM",
                "08:00 PM",
                "OPEN"
        );

        System.out.println("\n--- CLINIC DETAILS ---");
        clinic.displayClinicInfo();

        // 2. Department
        Department department = new Department(
                101,
                "Cardiology",
                "Department for heart-related treatment"
        );

        System.out.println("\n--- DEPARTMENT DETAILS ---");
        department.displayDepartmentDetails();

        // 3. Doctor
        Doctor doctor = new Doctor(
                201L,
                "dr_rahul",
                "doctor123",
                "rahul@citycare.com",
                "Dr. Rahul Sharma",
                "Cardiologist",
                "LIC-2026-001",
                "9876501234",
                10
        );

        System.out.println("\n--- DOCTOR DETAILS ---");
        doctor.displayDoctorDetails();

        // 4. Patient
        Patient patient = new Patient(
                301,
                "Amit Patel",
                "amit@gmail.com",
                "amit123",
                "9876512345",
                LocalDate.of(1995, 5, 15),
                "Male",
                "Ahmedabad",
                "B+",
                "9876509876"
        );

        System.out.println("\n--- PATIENT DETAILS ---");
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Email: " + patient.getEmail());
        System.out.println("Phone: " + patient.getPhone());
        System.out.println("Blood Group: " + patient.getBloodGroup());

        // 5. Appointment
        Appointment appointment = new Appointment(
                401,
                patient.getPatientId(),
                doctor.getDoctorId().intValue(),
                LocalDate.of(2026, 9, 15),
                LocalTime.of(10, 30),
                "CONFIRMED",
                "Chest pain",
                "Regular consultation"
        );

        System.out.println("\n--- APPOINTMENT DETAILS ---");
        System.out.println("Appointment ID: " + appointment.getAppointmentId());
        System.out.println("Patient ID: " + appointment.getPatientId());
        System.out.println("Doctor ID: " + appointment.getDoctorId());
        System.out.println("Date: " + appointment.getAppointmentDate());
        System.out.println("Time: " + appointment.getAppointmentTime());
        System.out.println("Status: " + appointment.getStatus());
        System.out.println("Reason: " + appointment.getReasonForVisit());

        // 6. Medical Record
        MedicalRecord record = new MedicalRecord(
                501,
                patient.getPatientId(),
                doctor.getDoctorId().intValue(),
                LocalDate.now(),
                "Mild Hypertension",
                "Headache and high blood pressure",
                "Medication and regular monitoring",
                "Amlodipine 5mg",
                "Follow-up after 15 days"
        );

        System.out.println("\n--- MEDICAL RECORD ---");
        System.out.println("Record ID: " + record.getRecordId());
        System.out.println("Diagnosis: " + record.getDiagnosis());
        System.out.println("Symptoms: " + record.getSymptoms());
        System.out.println("Treatment: " + record.getTreatment());
        System.out.println("Prescription: " + record.getPrescription());

        // 7. Prescription
        Prescription prescription = new Prescription(
                601,
                patient.getPatientId(),
                doctor.getDoctorId().intValue(),
                record.getRecordId(),
                LocalDate.now(),
                "Amlodipine",
                "5 mg",
                "Once Daily",
                "30 Days",
                "Take after breakfast"
        );

        System.out.println("\n--- PRESCRIPTION ---");
        System.out.println("Prescription ID: " + prescription.getPrescriptionId());
        System.out.println("Medicine: " + prescription.getMedicineName());
        System.out.println("Dosage: " + prescription.getDosage());
        System.out.println("Frequency: " + prescription.getFrequency());
        System.out.println("Duration: " + prescription.getDuration());
        System.out.println("Instructions: " + prescription.getInstructions());

        // 8. Billing
        Billing billing = new Billing(
                701,
                patient.getPatientId(),
                appointment.getAppointmentId(),
                LocalDate.now(),
                800.0,
                300.0,
                500.0,
                100.0,
                1700.0,
                "PENDING",
                "UPI"
        );

        System.out.println("\n--- BILLING ---");
        System.out.println("Bill ID: " + billing.getBillId());
        System.out.println("Consultation Fee: " + billing.getConsultationFee());
        System.out.println("Medicine Charges: " + billing.getMedicineCharges());
        System.out.println("Test Charges: " + billing.getTestCharges());
        System.out.println("Other Charges: " + billing.getOtherCharges());
        System.out.println("Total Amount: " + billing.getTotalAmount());
        System.out.println("Payment Status: " + billing.getPaymentStatus());

        // 9. Payment
        Payment payment = new Payment(
                801,
                billing.getTotalAmount(),
                LocalDate.now().toString(),
                "UPI",
                "Pending"
        );

        System.out.println("\n--- PAYMENT ---");
        payment.displayPaymentDetails();

        payment.processPayment();

        System.out.println("\nAfter Processing:");
        payment.displayPaymentDetails();

        // 10. Room
        Room room = new Room(
                901,
                "R-101",
                "Consultation Room",
                true
        );

        System.out.println("\n--- ROOM ---");
        room.displayRoomDetails();

        room.allocateRoom();

        System.out.println("\nAfter Allocation:");
        room.displayRoomDetails();

        room.releaseRoom();

        // 11. Admin
        Admin admin = new Admin(
                1001,
                "Clinic Administrator",
                "admin@citycare.com",
                "9876598765"
        );

        System.out.println("\n--- ADMIN ---");
        admin.displayAdminDetails();
        admin.manageAppointments();
        admin.manageDoctors();
        admin.managePatients();
        admin.generateReports();

        // 12. User
        User user = new User(
                1101,
                "receptionist",
                "reception123",
                "reception@citycare.com",
                "Clinic Receptionist",
                "RECEPTIONIST",
                "9876587654",
                "ACTIVE"
        );

        System.out.println("\n--- USER ---");
        user.displayUserInfo();

        System.out.println("\n======================================");
        System.out.println("   CLINIC SYSTEM DEMONSTRATION DONE");
        System.out.println("======================================");
    }
}
