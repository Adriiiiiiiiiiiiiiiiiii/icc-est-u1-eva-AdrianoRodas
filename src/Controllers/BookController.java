package Controllers;

import Models.Book;

public class BookController {
    public void sortByName(Book[] books) {
        boolean swapped;
        for (int i = 0; i < books.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < books.length - 1 - i; j++) {
                String nombre1 = books[j].getName().toLowerCase();
                String nombre2 = books[j + 1].getName().toLowerCase();
                if (nombre1.compareTo(nombre2) < 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public Book searchByName(Book[] books, String nombre) {
        String encontrar = nombre.toLowerCase();
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midName = books[mid].getName().toLowerCase();

            int comparison = midName.compareTo(encontrar);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            return null;
        }
        return null;

    }
}
