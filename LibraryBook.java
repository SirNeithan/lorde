public class LibraryBook {
   private String borrowingdate;
   private String returndate;
   public String title;
   private String author;
   protected String maxnumber;
   private String bookpenalty;
   

   
public LibraryBook(String borrowingdate, String returndate, String title, String author, String maxnumber,
        String bookpenalty) {
    this.borrowingdate = borrowingdate;
    this.returndate = returndate;
    this.title = title;
    this.author = author;
    this.maxnumber = maxnumber;
    this.bookpenalty = bookpenalty;
}
public String getBorrowingdate() {
    return borrowingdate;
}
public void setBorrowingdate(String borrowingdate) {
    this.borrowingdate = borrowingdate;
}
public String getReturndate() {
    return returndate;
}
public void setReturndate(String returndate) {
    this.returndate = returndate;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
private String getAuthor() {
    return author;
}
private void setAuthor(String author) {
    this.author = author;
}
protected String getMaxnumber() {
    return maxnumber;
}
protected void setMaxnumber(String maxnumber) {
    this.maxnumber = maxnumber;
}
private String getBookpenalty() {
    return bookpenalty;
}
private void setBookpenalty(String bookpenalty) {
    this.bookpenalty = bookpenalty;
}

   
public static void main(String[] args) {
    LibraryBook lb = new LibraryBook("12/04/2023", "15/09/2023", "ANIMAL FARM", "CHARLES DICKENS", "45", "5");

    lb.setAuthor("CHARLES DICKENS");
    lb.setBookpenalty("5");

    System.out.println(lb.getAuthor());
    System.out.println(lb.getBookpenalty());

    
}

    
}
