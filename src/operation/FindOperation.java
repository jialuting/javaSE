package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("查找图书！");
        System.out.println("请输入要查找的书名:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        int currentSize=bookList.getUseSize();
        for (int i=0;i<currentSize;i++){
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println("存在这本书，信息如下:");
                System.out.println(book);
                return;
            }
        }
        System.out.println(name+"此书不存在！");
    }
}
