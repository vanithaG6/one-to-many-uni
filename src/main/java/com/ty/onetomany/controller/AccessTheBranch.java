package com.ty.onetomany.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Branch;
import com.ty.onetomany.dto.Hospital;

public class AccessTheBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		 Hospital hospital=entityManager.find(Hospital.class,2);
		 List<Branch> branch = hospital.getBreach();
		 System.out.println(hospital.getName());
		 System.out.println(hospital.getFounder());
		 System.out.println("===========branchs ==================");
		 for (Branch branch2 : branch) {
			
			 System.out.println("Branch  name = "+branch2.getName()+"\t\t");
			 System.out.println("Branch  email = "+branch2.getEmail()+"\t\t");
			 System.out.println("Branch phone Number = "+branch2.getPhone());
			 System.out.println("========================================");
			
		}
		
	}

}
