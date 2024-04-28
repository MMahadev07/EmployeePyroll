package com.springBoot.Empoylee.Entity;

import java.time.LocalDate;

import javax.management.relation.RoleStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leave 

{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @ManyToOne
	    private Employee employee;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    private RoleStatus status;
	    
	
}
