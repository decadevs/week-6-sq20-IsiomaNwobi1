package services.impl;

import libraryException.Exception;
import models.Book;
import models.User;
import services.LibraryService;

import java.util.*;

public class LibraryServiceImpl implements LibraryService {

    Queue<User> priorityUserQueue;
    PriorityQueue<User> userQueue;

    public LibraryServiceImpl() {
        Comparator<User> userQueueComparator = (u1, u2) -> Integer.compare(u1.getUserPriority(), u2.getUserPriority());
        userQueue = new PriorityQueue<>(userQueueComparator);
        priorityUserQueue = new LinkedList<>();

    }

    @Override
    public void addUserToQueue(User user) {
        userQueue.add(user);
        priorityUserQueue.add(user);

    }

    @Override
    public String borrowBookInPriority(Book book) {
        userQueue.forEach(
                user -> {
                    if (book.getCopiesAvailable() > 0) {
                        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
                        System.out.println(user.getName() + " has borrowed " + book.getTitle() + " by " + book.getAuthor());
                    } else {
                        throw new Exception("Book not available");
                    }
                });
        return "";
    }

    @Override
    public String borrowBookFIFO(Book book) {
        priorityUserQueue.forEach(
                user -> {
                    if (!userQueue.isEmpty()) {
                    if (book.getCopiesAvailable() > 0) {
                        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
                        System.out.println(user.getName() + " has borrowed " + book.getTitle() + " by " + book.getAuthor());
                    }
                }});
        return "";
    }
}
