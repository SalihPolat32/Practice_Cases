package com.salihpolat;

import java.util.List;

public class BookOfScience extends Book{

    public BookOfScience(String ISBN, String title, String author, int year, EStatus status, List<Member> borrower) {
        super(ISBN, title, author, year, status, borrower);
    }

    @Override
    public String getBookType() {
        return "Bilim Kitabı Durumu: " + super.getStatus();
    }
}
