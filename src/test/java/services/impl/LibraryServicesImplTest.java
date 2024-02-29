package services.impl;

import enums.Role;
import models.Books;
import models.LibraryUsers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServicesImplTest {

    @Test
    void borrowBook() throws Exception {

        Books books = new Books("MockingBird", "Ciel Belle", 2);
        LibraryUsers libraryUsers = new LibraryUsers("Teacher Delia Uzo", Role.TEACHER);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();
        libraryServices.addBooks(books);

        String expected = libraryServices.borrowBook(libraryUsers);
        String actual = "Teacher Delia Uzo borrowed MockingBird by Ciel Belle";
        assertEquals(expected, actual);
    }

    @Test
    void borrowBookInOrder() throws Exception {
        Books books = new Books("MockingBird", "Ciel Belle", 2);
        LibraryUsers libraryUsers = new LibraryUsers("Teacher Delia Uzo", Role.TEACHER);

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();
        libraryServices.addBooks(books);

        String expected = libraryServices.borrowBookInOrder(libraryUsers);
        String actual = "Teacher Delia Uzo borrowed MockingBird by Ciel Belle";
        assertEquals(expected, actual);
    }
}