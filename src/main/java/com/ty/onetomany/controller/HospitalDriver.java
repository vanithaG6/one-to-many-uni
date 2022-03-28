package com.ty.onetomany.controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany.dto.Branch;
import com.ty.onetomany.dto.Hospital;

public class HospitalDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		ArrayList<Branch> a = new ArrayList<Branch>();
		Branch branch1 = new Branch();
		branch1.setName("Manipal_btr");
		branch1.setPhone(8776543l);
		branch1.setEmail("manipal_brt@1gmail.com");
		
		Branch branch2 = new Branch();
		branch2.setName("Manipal_btm");
		branch2.setPhone(876543l);
		branch2.setEmail("Manipal_btm@1gmail.com");
		a.add(branch1);
		a.add(branch2);
		Hospital  h = new Hospital();
		h.setFounder("gopal");
		h.setGstNumber("12gh45XX");
		h.setName("Manipal Hospital");
		h.setBreach(a);
		entityTransaction.begin();
		entityManager.persist(h);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
		
		
	}

}
