/**
 * 
 * Problem Statement-
 * [Abstract Classes](https://www.hackerrank.com/challenges/30-abstract-classes/problem)         
 * 
 */
package com.javaaid.hackerrank.solutions.thirtydaysofcode;

/**
 * @author Kanahaiya Gupta
 *
 */
class MyBook extends Book{
    private int price;
    MyBook(String $title,String $author,int $price){
        super($title,$author);
        this.price=$price;
    }
 
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);

    }
}
class Book{
 String title;
 String author;
	/**
	 * @param $title
	 * @param $author
	 */
	public Book(String $title, String $author) {
		this.author=$author;
		this.title=$title;
	}
	
}