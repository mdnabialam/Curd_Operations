package com.restful.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "School_Info")
public class SchoolEntity {
	
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "SchoolSeq"
		)
		@SequenceGenerator(
		    name = "SchoolSeq"
		)
	
	@Id
	@Column(name = "SCHOOL_ID")
	private	Integer schoolId;
	@Column(name = "SCHOOL_NAME")
	private String 	schoolName;
	@Column(name = "SCHOOLADDRESS")
	private String 	schoolAddres;
	
	
	

}
