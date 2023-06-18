package id.clsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
		//@GeneratedValue(strategy=GenerationType.IDENTITY) //The annotation represents the field as the primary key and the value of the key auto incremental
	@Id
	@Column (name="AppointmentID") //The name of @Column refers to the column named orderTypeId in the table OrderType.
	private String appointmentID;
	
	@Column (name="PatientID")
	private String patientID;
	
	@Column (name="DoctorID")
	private String doctorID;
	
	@Column (name="ClinicID") //The name of @Column refers to the column named orderTypeId in the table OrderType.
	private String clinicID;
	
	@Column (name="AppointmentDate")
	private String appointmentDate;
	@Column (name="AppointmentTime")
	private String appointmenttime;
	
	@Column (name="StartTime")
	private String startTime;
	
	@Column (name="EndTime")
	private String endTime;
	
	@Column (name="Status") //The name of @Column refers to the column named orderTypeId in the table OrderType.
	private String status;
	
	

	public String getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}

	public String getClinicID() {
		return clinicID;
	}

	public void setClinicID(String clinicID) {
		this.clinicID = clinicID;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmenttime() {
		return appointmenttime;
	}

	public void setAppointmenttime(String appointmenttime) {
		this.appointmenttime = appointmenttime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}


