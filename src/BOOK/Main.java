package BOOK;

public class Main {static void main(String[]args){
    Book book1 = new Book("Pushkin","Evgeny Onegin",1831);
    Book book2 = new Book("Chehov","Krujovnik", 1898);
    Book book3 = new Book("Sorokin","Nasty",2001 );
    System.out.println("Book:");
    book1.displayInfo();
    book1.markAsRead();
    book1.isOldBook();
    System.out.println();

    System.out.println("Book:");
    book2.displayInfo();
    book2.markAsRead();
    book2.isOldBook();
    System.out.println();

    System.out.println("Book:");
    book3.displayInfo();
    book3.markAsRead();
    book3.isOldBook();
}
}
