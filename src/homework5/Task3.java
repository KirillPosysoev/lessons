package homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class Task3 {
    public static class Book {
        public int id;
        public String title;
        public String author;
        public int pageCount;

//        public Book(int id, String title, String author, int pageCount) {
//            this.id = id;
//            this.title = title;
//            this.author = author;
//            this.pageCount = pageCount;
//        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
//        Book book1 = new Book(1, "Сказки", "Пушкин", 40);
//        Book book2 = new Book(2, "Басни", "Крылов", 110);
//        books.add(book1);
//        books.add(book2);
        HashMap<Integer, Book> newBooks = organizeBooks(books);
    }

    public static HashMap<Integer, Book> organizeBooks(ArrayList<Book> books) {
        HashMap<Integer, Book> newBooks = new HashMap<>();
        for (Book book : books) {
            newBooks.put(book.id, book);
        }
        return newBooks;
    }
}
