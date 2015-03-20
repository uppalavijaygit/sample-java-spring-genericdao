package br.com.hhc.sample.fullstackspringhibernate.database.data.domain;

// Generated 18/03/2015 07:46:00 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StudentClassesId generated by hbm2java
 */
@Embeddable
public class StudentClassesId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer studentId;
	private Integer classesId;
	private Character status;

	public StudentClassesId() {
	}

	public StudentClassesId(Integer studentId, Integer classesId,
			Character Status) {
		this.studentId = studentId;
		this.classesId = classesId;
		this.status = Status;
	}

	@Column(name = "STUDENT_ID", nullable = false, precision = 5, scale = 0)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "CLASSES_ID", nullable = false, precision = 4, scale = 0)
	public Integer getClassesId() {
		return this.classesId;
	}

	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}

	@Column(name = "STU_CLASSES_STATUS", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char Status) {
		this.status = Status;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentClassesId))
			return false;
		StudentClassesId castOther = (StudentClassesId) other;

		return (this.getStudentId() == castOther.getStudentId())
				&& (this.getClassesId() == castOther.getClassesId())
				&& (this.getStatus() == castOther.getStatus());
	}

	public int hashCode() {
		Integer result = 17;

		result = 37 * result + this.getStudentId();
		result = 37 * result + this.getClassesId();
		result = 37 * result + this.getStatus();
		return result;
	}

}