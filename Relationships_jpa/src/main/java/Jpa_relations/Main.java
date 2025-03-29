package Jpa_relations;
import jakarta.persistence.EntityManager;
class Main{
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		Author author=new Author("Chandu");
		Book book1=new Book("Paris Eiffel tower");
		Book book2=new Book("The School of Good and Evil");
		author.addBook(book1);
		author.addBook(book2);
		em.persist(author);
		em.getTransaction().commit();
		em.close();
		JPAUtil.close();
	}
}