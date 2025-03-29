package Jpa_relations;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="Authors")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Book> books=new ArrayList<>();
	public Author() {}
	public Author( String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getBooks() {
		return books;
	}
	public void setBooks() {
		this.books=books;
	}
	//Helper method to add books into the list
	public void addBook(Book book) {
		books.add(book);
		book.setAuthor(this);
	}
	
}