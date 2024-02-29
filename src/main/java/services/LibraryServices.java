package services;

import enums.Role;
import models.Books;
import models.LibraryUsers;

public interface LibraryServices {

    void addBooks (Books books);
    void registerUsers (LibraryUsers libraryUsers, Role role);

    String borrowBook (LibraryUsers libraryUsers) throws Exception;

    String borrowBookInOrder (LibraryUsers libraryUsers) throws Exception;
}
