package com.salihpolat;

import java.util.List;

public class BookOfHistory extends Book{

    public BookOfHistory(String ISBN, String title, String author, int year, EStatus status, List<Member> borrower) {
        super(ISBN, title, author, year, status, borrower);
    }

    @Override
    public String getBookType() {
        return "Tarih Kitabı Durumu: " + super.getStatus();
    }
}
