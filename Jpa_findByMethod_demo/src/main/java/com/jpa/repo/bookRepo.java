package com.jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jpa.entity.Book;

public interface bookRepo extends JpaRepository<Book, Integer>
{
	//These methods will automatically construct query for these methods.
						// findByMethod
	// this query is equals to  select * from Book where bookPrice >: price
	public List<Book> findByBookPriceGreaterThan(Double price);
	
	//This method is equals to select * from Book where bookPrice <=: price
	public List<Book> findByBookPriceIsLessThanEqual(Double price);
	
	//select * from Book where bookName = : bookName
	public List<Book> findByBookName(String BookName);
						// Custom Query
	
	      // this is a custom SQL query native SQL query
	@Query(value = "select * from book",nativeQuery =true )
	public List<Book> allbook();// here we can give method name as per our choice
	
		// this is a HQL query
	@Query(value ="from Book")
	public List<Book> givealbook();

}
