import java.time.LocalDate;

public class Billing {

    private Integer billId;
    private Integer patientId;
    private Integer appointmentId;
    private LocalDate billDate;
    private Double consultationFee;
    private Double medicineCharges;
    private Double testCharges;
    private Double otherCharges;
    private Double totalAmount;
    private String paymentStatus;
    private String paymentMethod;

    public Billing() {
    }

    public Billing(Integer billId, Integer patientId, Integer appointmentId,
                   LocalDate billDate, Double consultationFee,
                   Double medicineCharges, Double testCharges,
                   Double otherCharges, Double totalAmount,
                   String paymentStatus, String paymentMethod) {

        this.billId = billId;
        this.patientId = patientId;
        this.appointmentId = appointmentId;
        this.billDate = billDate;
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
        this.testCharges = testCharges;
        this.otherCharges = otherCharges;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public Double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(Double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public Double getMedicineCharges() {
        return medicineCharges;
    }

    public void setMedicineCharges(Double medicineCharges) {
        this.medicineCharges = medicineCharges;
    }

    public Double getTestCharges() {
        return testCharges;
    }

    public void setTestCharges(Double testCharges) {
        this.testCharges = testCharges;
    }

    public Double getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(Double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
