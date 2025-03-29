package jpa_library;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
      @Id 
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private int id;
      private String title;
      private int quantity;
      
      @ManyToOne
      @JoinColumn(name="author_id")
      private Author author;
      
      //@ManyToMany(mappedBy="returnbook")
      //private List<Member> mm=new ArrayList<>();
      
      public Book() {
    	  
      }

	public Book(String title, int quantity, Author author) {
		super();
		this.title = title;
		this.quantity = quantity;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

        

}
