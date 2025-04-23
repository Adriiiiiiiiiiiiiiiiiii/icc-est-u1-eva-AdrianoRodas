package View;

import Models.Book;

public class ViewConsole {
    public void printArrayBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}
