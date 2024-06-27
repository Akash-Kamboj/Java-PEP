// book code
// book name 
// book author
// using constructor
// constructor overloading


class book_details
{
    int bcode;
    String bname;
    String bauthor;
    book_details(int bcode,String bname,String bauthor)
    {
        this.bcode=bcode;
        this.bname=bname;
        this.bauthor=bauthor;
    }

    book_details( String bn, String ba   )
    {
        this.bname=bn;
        this.bauthor=ba;
    }
    // int getbcode()
    // {
    //     return bcode;
    // }
    // String getbname()
    // {
    //     return bname;
    // }
    // String getbauthor()
    // {
    //     return bauthor;
    // }
    // void setbcode(int bcode)
    // {
    //     this.bcode=bcode;
    // }
    // void setbname(String bname)
    // {
    //     this.bname=bname;
    // }
    // void setbauthor(String bauthor)
    // {
    //     this.bauthor=bauthor;
    // }
    void display()
    {
        System.out.println("Code of book is: "+bcode);
        System.out.println("Name of the book is: "+bname);
        System.out.println("Name of the author is: "+bauthor);
        
    }
}
public class book
{
    public static void main(String args[])
    {
        book_details b = new book_details(15,"Raat","Rohan");
        b.display();
        book_details c = new book_details("Raat","Rohan");
        c.display();
    }
}
