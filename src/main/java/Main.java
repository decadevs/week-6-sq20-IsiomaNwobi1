import enums.Role;
import models.Book;
import models.User;
import services.impl.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {

        LibraryServiceImpl libraryServices = new LibraryServiceImpl();

        User libraryUser1 = new User("Teacher Delia Uzo", Role.TEACHER, 1);
        User libraryUser2 = new User("Snr Student Henry Okoro", Role.SENIOR_STUDENT, 2);
        User libraryUser3 = new User("Jnr Student Amaka Eze", Role.JUNIOR_STUDENT, 3);

        libraryServices.addUserToQueue(libraryUser2);
        libraryServices.addUserToQueue(libraryUser1);
        libraryServices.addUserToQueue(libraryUser3);

        Book book1 = new Book("MockingBird", "Ciel Belle", 3);
        Book book2 = new Book("Awakening", "Thomas Wan", 5);
        Book book3 = new Book("Healing Within", "S.A John", 10);

        System.out.println(libraryServices.borrowBookFIFO(book1));

        System.out.println("==================Priority====================");

           System.out.println(libraryServices.borrowBookInPriority(book3));
    }
    }


