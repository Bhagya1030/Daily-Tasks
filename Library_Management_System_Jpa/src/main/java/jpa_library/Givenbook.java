package jpa_library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Givenbook {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
	
	 private LocalDate borrowDate;
	 private LocalDate dueDate;

	 public Givenbook() {}

	    public Givenbook(Member member, Book book) {
	        this.member = member;
	        this.book = book;
	        this.borrowDate = LocalDate.now();
	        this.dueDate = borrowDate.plusDays(14);
	    }

	    public int getId() { 
	    	return id; 
	    }
	    public long Fine(LocalDate returnDate) {
	        long overdueDays = ChronoUnit.DAYS.between(dueDate, returnDate);
	        return overdueDays > 0 ? overdueDays * 10 : 0;
	    }
	

}
