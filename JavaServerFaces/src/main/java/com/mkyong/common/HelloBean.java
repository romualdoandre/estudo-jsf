package com.mkyong.common;

import hello.Post;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String enviaPost(){
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JavaServerFaces");
		EntityManager manager = factory.createEntityManager();
		Post post=new Post();
		post.setTexto(name);
		manager.getTransaction().begin();
		manager.persist(post);
		manager.flush();
		manager.getTransaction().commit();
		return "welcome";
	}

}