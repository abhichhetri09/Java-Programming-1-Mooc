/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhic
 */
public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.pages = pages;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPage() {
        return this.getPage();
    }

    public int getYear() {
        return this.year;
    }

public String toString(){
return this.title + ", " + this.pages + " pages, " + this.year;
}
}
