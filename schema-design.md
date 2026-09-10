# Smart Clinic Management System - Database Schema Design

## Database

The Smart Clinic Management System uses MySQL as the relational database.

## Tables

### 1. Doctor

Stores information about doctors registered in the clinic.

| Column | Data Type | Constraint |
|---|---|---|
| doctor_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE, NOT NULL |
| password | VARCHAR(255) | NOT NULL |
| speciality | VARCHAR(100) | NOT NULL |
| phone | VARCHAR(20) | |
| available_from | TIME | |
| available_to | TIME | |

### 2. Patient

Stores information about patients registered in the clinic.

| Column | Data Type | Constraint |
|---|---|---|
| patient_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE, NOT NULL |
| password | VARCHAR(255) | NOT NULL |
| phone | VARCHAR(20) | |
| date_of_birth | DATE | |

### 3. Appointment

Stores appointment information between patients and doctors.

| Column | Data Type | Constraint |
|---|---|---|
| appointment_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| doctor_id | INT | FOREIGN KEY |
| patient_id | INT | FOREIGN KEY |
| appointment_date | DATE | NOT NULL |
| appointment_time | TIME | NOT NULL |
| status | VARCHAR(30) | NOT NULL |
| reason | VARCHAR(255) | |

### 4. Prescription

Stores prescriptions issued by doctors to patients.

| Column | Data Type | Constraint |
|---|---|---|
| prescription_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| doctor_id | INT | FOREIGN KEY |
| patient_id | INT | FOREIGN KEY |
| appointment_id | INT | FOREIGN KEY |
| medicine | VARCHAR(255) | NOT NULL |
| dosage | VARCHAR(100) | |
| instructions | VARCHAR(500) | |
| prescription_date | DATE | NOT NULL |

### 5. Admin

Stores administrator login information.

| Column | Data Type | Constraint |
|---|---|---|
| admin_id | INT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE, NOT NULL |
| password | VARCHAR(255) | NOT NULL |

## Relationships

- One doctor can have many appointments.
- One patient can have many appointments.
- Each appointment belongs to one doctor and one patient.
- A doctor can issue many prescriptions.
- A patient can receive many prescriptions.
- A prescription can be associated with an appointment.
- Admin users manage doctors, patients, and appointments.

## Foreign Keys

```sql
ALTER TABLE Appointment
ADD CONSTRAINT fk_appointment_doctor
FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id);

ALTER TABLE Appointment
ADD CONSTRAINT fk_appointment_patient
FOREIGN KEY (patient_id) REFERENCES Patient(patient_id);

ALTER TABLE Prescription
ADD CONSTRAINT fk_prescription_doctor
FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id);

ALTER TABLE Prescription
ADD CONSTRAINT fk_prescription_patient
FOREIGN KEY (patient_id) REFERENCES Patient(patient_id);

ALTER TABLE Prescription
ADD CONSTRAINT fk_prescription_appointment
FOREIGN KEY (appointment_id) REFERENCES Appointment(appointment_id);
