package finalPractice.overrideHashCode.Lesson11.Prob3;

import java.util.HashMap;

public class Library {
    private HashMap<String,Book> books;
    public Library(){
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){
        if(books.containsKey(ISBN)){
            System.out.println("book is exit");
        }else{
            books.put(ISBN,new Book(ISBN,title,author));
        }
    }

    public void borrowBook(String ISBN){
        if(!books.containsKey(ISBN)){
            return;
        }
        Book b = books.get(ISBN);
        if(b.isBorrowed()){
            System.out.println("Book with ISBN " + ISBN + " is already borrowed.")
        }else{
            b.setBorrowed(true);
        }
    }

    public void returnBook(String isbn){
        if(!books.containsKey(isbn)){
            return;
        }
        Book b = books.get(isbn);
        if(b.isBorrowed()){
            b.setBorrowed(false);
        }else{
            System.out.println("book is still in library and no one is borrowed");
        }
    }

    public boolean isBookBorrowed(String isbn){
        if(!books.containsKey(isbn)){
            return false;
        }
        Book b = books.get(isbn);
        return b.isBorrowed();
    }

    public void bookDetails(String isbn){
        if(!books.containsKey(isbn)) return;
        Book b = books.get(isbn);
        System.out.println(b);
     }


     public void listAll(){
        for(Book i : books.values()){
            System.out.println(i);
        }
     }

     public void borrowBook(){
        for(Book i : books.values()){
            if(i != null){
                if(i.isBorrowed()){
                    System.out.println(i);
                }
            }
        }
     }
}
