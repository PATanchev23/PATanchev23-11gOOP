package BookPackage;

public class Book {
    String title;
    String author;
    int year;

    Book(String title,String author,int year)
    {
        this.title=title;
        this.author=author;
        this.year=year;
    }

    void showInfo()
    {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Year:" + year);
    }

    public static void main(String[] args)
    {
        Book book=new Book("Meditations","Marcus Aurelius",1990);

        book.showInfo();
    }
}
