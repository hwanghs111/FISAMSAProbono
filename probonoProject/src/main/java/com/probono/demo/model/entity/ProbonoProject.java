package com.probono.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "probono_project")
@Entity
public class ProbonoProject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int probonoProjectId;
	private String probonoProjectName;	
	private String probonoId;
	private String activistId;
	private String receiveId; 
	private String projectContent; 
	
}
