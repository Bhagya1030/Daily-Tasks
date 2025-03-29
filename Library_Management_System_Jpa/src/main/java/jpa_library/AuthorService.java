package jpa_library;

import jakarta.persistence.EntityManager;

public class AuthorService {
	
private EntityManager em = JPAUtil.getEntityManager();
	
    public void save(Author author) { 
    	em.getTransaction().begin(); 
    	em.persist(author);
    	em.getTransaction().commit(); 
    }
    public Author find(Long id) { 
    	return em.find(Author.class, id);
    }
    public void update(Author author) { 
    	em.getTransaction().begin(); 
    	em.merge(author);
    	em.getTransaction().commit(); 
    }
    public void delete(Long id) { 
    	em.getTransaction().begin(); 
    	em.remove(find(id));
    	em.getTransaction().commit();
    }

}
