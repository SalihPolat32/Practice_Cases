package com.salihpolat;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void lendBook(Member member, Book book) {
        for (Book b : books) {
            for (Member m : members) {
                if (b.equals(book) && b.getStatus() == EStatus.AVAILABLE) {
                    b.setBorrower(List.of(member));
                    m.setBorrowedBooks(List.of(b));
                    b.setStatus(EStatus.BORROWED);
                    System.out.println("Kitap ödünç alındı.");
                    return;
                }
            }
        }
        System.out.println("Kitap bulunamadı veya ödünç alınamaz durumda.");
    }

    public void returnBook(Member member, Book book) {
        for (Book b : books) {
            for (Member m : members) {
                if (b.equals(book) && b.getStatus() == EStatus.BORROWED) {
                    b.setBorrower(null);
                    m.setBorrowedBooks(null);
                    b.setStatus(EStatus.AVAILABLE);
                    System.out.println("Kitap geri alındı.");
                    return;
                }
            }
        }
    }

    public void viewBorrowedBooks(Member member) {
        System.out.println("Borrowed Books:");
        for (Book book : books) {
            if (book.getStatus() == EStatus.BORROWED && book.getBorrower().contains(member)) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void viewLibraryStatus() {
        System.out.println("Library Status:");
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.getStatus() == EStatus.AVAILABLE) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.println("Borrowed Books:");
        for (Book book : books) {
            if (book.getStatus() == EStatus.BORROWED) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " borrowed by " + book.getBorrower());
            }
        }
        System.out.println("Members:");
        for (Member member : members) {
            System.out.println("- " + member.getFullName());
        }
        System.out.println("End of Library Status");
    }
}
