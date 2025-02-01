package com.vinna.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private double price;

    Book()
    {}	// empty model constructor.





    Book (String title, String author,double price){

        this.title=title;
        this.author=author;
        this.price= price;
// constructor injection

    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }




    public double getPrice() {
        return price;
    }




    public void setPrice(double price) {
        this.price = price;
    }


}
