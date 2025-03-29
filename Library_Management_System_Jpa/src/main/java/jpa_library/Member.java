package jpa_library;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity

public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String branch;
	private int books_count;
	
	//@ManyToMany
	//@JoinTable(name="member_book",
	//joinColumns=@JoinColumn(name="member_id"), 
	//inverseJoinColumns=@JoinColumn(name="book_id"))
	
	@OneToMany(mappedBy="member",cascade=CascadeType.ALL,orphanRemoval=true)
	
	
	private List<Givenbook> givenbooks=new ArrayList<>();
	
	public Member() {
		
	}

	public Member(String name, String branch, int books_count, List<Givenbook> givenbooks) {
		super();
		this.name = name;
		this.branch = branch;
		this.books_count = books_count;
		this.givenbooks = givenbooks;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getBooks_count() {
		return books_count;
	}

	public void setBooks_count(int books_count) {
		this.books_count = books_count;
	}

	public List<Givenbook> getGivenbooks() {
		return givenbooks;
	}

	public void setGivenbooks(List<Givenbook> givenbooks) {
		this.givenbooks = givenbooks;
	}
	
	
  
	
	

}
