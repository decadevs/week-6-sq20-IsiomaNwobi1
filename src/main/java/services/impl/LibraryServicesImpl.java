package services.impl;

import enums.Role;
import models.Books;
import models.LibraryUsers;
import services.LibraryServices;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class LibraryServicesImpl implements LibraryServices {

    private final Deque<LibraryUsers> libraryUsersQueue = new ArrayDeque<>();
    private final Deque<LibraryUsers> libraryUsersFIFOQueue = new ArrayDeque<>();
    private final Deque<Books> availableBooks = new ArrayDeque<>();
    private final Deque<Books> availableBooks1 = new ArrayDeque<>();


    @Override
    public void addBooks(Books books) {
        availableBooks.add(books);
        availableBooks1.add(books);
    }

    @Override
    public void registerUsers(LibraryUsers libraryUsers, Role role) {
        libraryUsersQueue.add(libraryUsers);
        libraryUsersFIFOQueue.add(libraryUsers);
    }

    @Override
    public String borrowBook(LibraryUsers libraryUsers) throws Exception {
        Optional<String> result = Optional.empty();

        if (!result.isPresent() && !availableBooks.isEmpty()) {
            Books books = availableBooks.poll();
            if (books.getCopiesAvailable() > 0) {
                result = Optional.of(libraryUsers.getName() + " borrowed " + books.getTitle() + " by " + books.getAuthor());
            } else {
                result = Optional.of("No copies available for book: " + books.getTitle() + " by " + books.getAuthor());
            }
        } else if (!result.isPresent()) {
            result = Optional.of("No books available");
        }
        return result.orElseThrow(() -> new Exception());
    }

    @Override
    public String borrowBookInOrder(LibraryUsers libraryUsers) throws Exception {
        Optional<String> result = Optional.empty();

        if (!result.isPresent() && !availableBooks.isEmpty()) {
            Books books = availableBooks.poll();
            if (books.getCopiesAvailable() > 0) {
                result = Optional.of(libraryUsers.getName() + " borrowed " + books.getTitle() + " by " + books.getAuthor());
            } else {
                result = Optional.of("No copies available for book: " + books.getTitle() + " by " + books.getAuthor());
            }
        } else if (!result.isPresent()) {
            result = Optional.of("No books available");
        }
        return result.orElseThrow(() -> new Exception());
    }
}