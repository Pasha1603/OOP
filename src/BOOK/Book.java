package BOOK;

public class Book {
    String author;
    String title;
    int year;
    boolean isRead;
    public Book(String bookAuthor, String bookTitle,int bookYear ){
        author = bookAuthor;
        title = bookTitle;
        year = bookYear;
        isRead = false;
    }
    public void displayInfo(){
        System.out.println("Name:"+ title);
        System.out.println("Author:"+ author);
        System.out.println("Written:"+ year);

    }
    public void markAsRead() {
        if (!isRead){
            isRead = true;
            System.out.println("Read it");
        }

        }
        public void isOldBook(){
        if(year<2000){
            System.out.println("Old");
        }
        else {
            System.out.println("New");
        }
        }
    }

