package com.salihpolat;

import java.util.List;

public class BookOfNovel extends Book{

        public BookOfNovel(String ISBN, String title, String author, int year, EStatus status, List<Member> borrower) {
            super(ISBN, title, author, year, status, borrower);
        }

        @Override
        public String getBookType() {
            return "Roman Kitabı Durumu: " + super.getStatus();
        }
}
