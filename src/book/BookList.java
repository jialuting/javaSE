package book;

public class BookList {
    private Book[] books;
    private int useSize;//一共几本书

    public BookList(){
        this.books=new Book[10];//将数组作为储存书的空间
        this.books[0]=new Book("三国演义","罗贯中",10,"小说");
        this.books[1]=new Book("西游记","吴承恩",9,"小说");
        this.books[2]=new Book("红楼梦","曹雪芹",19,"小说");
        this.useSize=3;
    }

    public Book getBooks(int pos){
        return books[pos];
    }

    public void setBooks(Book book,int pos){
        books[pos]=book;
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize){
        this.useSize=useSize;
    }
}
