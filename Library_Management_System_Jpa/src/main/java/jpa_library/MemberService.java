package jpa_library;

import jakarta.persistence.EntityManager;

public class MemberService {
	
	private EntityManager em = JPAUtil.getEntityManager();
    public void save(Member member) { 
    	em.getTransaction().begin();
    	em.persist(member); 
    	em.getTransaction().commit();
    }
    public Member find(Long id) { 
    	return em.find(Member.class, id);
    }
    public void update(Member member) {
    	em.getTransaction().begin(); 
    	em.merge(member);
    	em.getTransaction().commit(); 
    }
    public void delete(Long id) { 
    	em.getTransaction().begin();
    	em.remove(find(id)); 
    	em.getTransaction().commit();
    }

}
