package services;

import models.Book;
import models.User;

public interface LibraryService {

    void addUserToQueue (User user);

    String borrowBookInPriority (Book book);

    String borrowBookFIFO (Book book);
}
