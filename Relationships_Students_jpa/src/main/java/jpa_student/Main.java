package jpa_student;

import java.util.List;

import jakarta.persistence.EntityManager;

public class Main {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
	/*	//Create objects for the students class now
		
		Student s1=new Student("Chandu");
		Student s2=new Student("Yashoda");
		
		//Create objects for the Course class
		
		Course c1=new Course("Data Science");
		Course c2=new Course("Machine Learning");
		
		//Call the methods 
		s1.Enroll(c1);
		s1.Enroll(c2);
		s2.Enroll(c1);
		s2.Enroll(c2);
		
		em.persist(s1);
        em.persist(s2);
        em.persist(c1);
        em.persist(c2);    */
		
		
		em.persist(new User("Chandrika","arcot12@gmail.com","Active"));
		em.persist(new User("Rajashekar","rajashekhar06@gmail.com","Inactive"));
		em.persist(new User("Geetha","geetha14@gmail.com","Active"));
		
		em.getTransaction().commit();
		 
		List<User> users=em.createQuery("select u from User u where u.name=:name",User.class)
				.setParameter("name","Chandrika").getResultList();
		
		for(User u:users) {
			System.out.println(u.getName());
		}
		
		List<User> user1=em.createNamedQuery("User_Email",User.class)
				.setParameter("email","arcot12@gmail.com").getResultList();
		
		for(User u:user1) {
			System.out.println(u.getEmail());
		}
		
		
		List<User> user2=em.createNamedQuery("User_Status",User.class)
				.setParameter(1,"Active").getResultList();
		
		for(User u:user2) {
			System.out.println(u.getStatus());
		}

		em.close(); 
		JPAUtil.close();
	}

}
