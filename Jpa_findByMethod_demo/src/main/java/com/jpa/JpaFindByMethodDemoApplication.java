package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.entity.Book;
import com.jpa.repo.bookRepo;

@SpringBootApplication
public class JpaFindByMethodDemoApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context=SpringApplication.run(JpaFindByMethodDemoApplication.class, args);
		bookRepo repo = context.getBean(bookRepo.class);
		
		
	//greater than method
		/*
		List<Book> books =repo.findByBookPriceGreaterThan(500.0);
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
	//LessThan method
		/*
		List<Book> books = repo.findByBookPriceIsLessThanEqual(1000.0);
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
	//finding By book name method
		/*
		List<Book> books = repo.findByBookName("Angular");
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
	// custom query  native sql
		/*
		List<Book> books =repo.allbook();
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
	// custom Query  HQL query
		/*
		List<Book> books =repo.givealbook();
		for(Book b : books)
		{
			System.out.println(b);
		}
		*/
		
		
	
	}

}
