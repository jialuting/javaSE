package operation;

import book.BookList;
import book.Book;


import java.util.Scanner;


public class AddOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("新增图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要新增的书名:");
        String name=scanner.nextLine();

        int currentSize=bookList.getUseSize();
        for (int i=0;i<currentSize;i++){
            Book book=bookList.getBooks(i);
            if(book.getName().equals(name)){
                System.out.println("此书已存在！");
                return;
            }
        }
        System.out.println("请输入新书的作者:");
        String author=scanner.nextLine();
        System.out.println("请输入新书的价格:");
        int price=scanner.nextInt();
        System.out.println("请输入新书的类型:");
        scanner.nextLine();
        String type=scanner.nextLine();

        Book book=new Book(name,author,price,type);
        bookList.setBooks(book,currentSize);
        bookList.setUseSize(currentSize+1);
        System.out.println("设置成功！");
    }

}
