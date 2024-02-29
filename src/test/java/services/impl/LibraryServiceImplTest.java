package services.impl;

import enums.Role;
import models.Book;
import models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    @Test
    void borrowBookInPriority() {

        Book bk = new Book("MockingBird", "Ciel Belle", 01);
        User us = new User("Teacher Delia Uzo", Role.TEACHER, 1);

        LibraryServiceImpl libraryServices = new LibraryServiceImpl();
        libraryServices.addUserToQueue(us);


        String expected = libraryServices.borrowBookInPriority(bk);
        String actual = "";
        assertEquals(expected, actual);
    }



    }

