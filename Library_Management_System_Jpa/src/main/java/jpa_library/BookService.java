package jpa_library;

import jakarta.persistence.EntityManager;

public class BookService {
	
	private EntityManager em = JPAUtil.getEntityManager();
    public void save(Book book) { 
    	em.getTransaction().begin(); 
    	em.persist(book); 
    	em.getTransaction().commit();
    }
    public Book find(Long id) { 
    	return em.find(Book.class, id); 
    }
    public void update(Book book) { 
    	em.getTransaction().begin();
    	em.merge(book); 
    	em.getTransaction().commit();
    }
    public void delete(Long id) { 
    	em.getTransaction().begin();
    	em.remove(find(id));
    	em.getTransaction().commit(); 
    }

}
