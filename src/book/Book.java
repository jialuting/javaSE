package book;

public class Book {//设置书的基本属性
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrowed;

    public Book(String name,String author,int price,String type){
        this.name=name;
        this.author=author;
        this.price=price;
        this.type=type;
    }
//获得书的各种属性
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }

    public boolean isBorrowed(){
      return isBorrowed;
    }
    public void setBorrowed(boolean borrowed){
        isBorrowed=borrowed;
    }

    //下文的ShowOperation类和FindOperation类将会用到此重写方法
    public String toString(){
        return "Book{" +
                "name='" + name + '\''+
                ",author='" + author + '\''+
                ",price='" + price + '\''+
                ",type='" + type + '\''+
                ",isBorrowed=" + isBorrowed +
                '}';
    }
}
