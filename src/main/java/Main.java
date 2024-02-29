import enums.Role;
import models.Books;
import models.LibraryUsers;
import services.LibraryServices;
import services.impl.LibraryServicesImpl;

public class Main {
    public static void main(String[] args) throws Exception {

        LibraryServices libraryService = new LibraryServicesImpl();
        LibraryServices libraryServices1 = new LibraryServicesImpl();

        Books book1 = new Books("MockingBird", "Ciel Belle", 2);
        Books book2 = new Books("Awakening", "Thomas Wan", 5);
        Books book3 = new Books("Healing Within", "S.A John", 3);

        libraryService.addBooks(book1);
        libraryServices1.addBooks(book1);
        libraryService.addBooks(book2);
        libraryServices1.addBooks(book2);
        libraryService.addBooks(book3);
        libraryServices1.addBooks(book3);

        LibraryUsers teacher = new LibraryUsers("Teacher Delia Uzo", Role.TEACHER);
        LibraryUsers seniorStudent = new LibraryUsers("Senior Student Henry Okoro", Role.SENIOR_STUDENT);
        LibraryUsers juniorStudent = new LibraryUsers("Junior Student Sarah Eze", Role.JUNIOR_STUDENT);

        System.out.println(libraryService.borrowBook(teacher));
        System.out.println(libraryService.borrowBook(seniorStudent));
        System.out.println(libraryService.borrowBook(juniorStudent));

        System.out.println("");

        System.out.println(libraryServices1.borrowBookInOrder(juniorStudent));
        System.out.println(libraryServices1.borrowBookInOrder(seniorStudent));
        System.out.println(libraryServices1.borrowBookInOrder(teacher));
    }
    }


