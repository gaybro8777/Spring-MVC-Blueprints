package org.packt.academic.student.portal.model.data;
// Generated 03 12, 16 1:32:12 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Status generated by hbm2java
 */
@Entity
@Table(name = "status", catalog = "smp")
public class Status implements java.io.Serializable {

	private int status;
	private String label;
	private Set<Tblstudents> tblstudentses = new HashSet<Tblstudents>(0);

	public Status() {
	}

	public Status(int status, String label) {
		this.status = status;
		this.label = label;
	}

	public Status(int status, String label, Set<Tblstudents> tblstudentses) {
		this.status = status;
		this.label = label;
		this.tblstudentses = tblstudentses;
	}

	@Id
	@Column(name = "status", unique = true, nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "label", nullable = false, length = 45)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<Tblstudents> getTblstudentses() {
		return this.tblstudentses;
	}

	public void setTblstudentses(Set<Tblstudents> tblstudentses) {
		this.tblstudentses = tblstudentses;
	}

}
