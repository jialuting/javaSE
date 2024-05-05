package operation;
import book.BookList;
import book.Book;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("借阅图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要借阅的书名:");
        String name=scanner.nextLine();

        int currentSize=bookList.getUseSize();

        for (int i=0;i<currentSize;i++){
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                if (!book.isBorrowed()){
                    book.setBorrowed(true);
                    System.out.println("成功借阅！");
                    return;
                }
            }
        }
        System.out.println("抱歉，暂无此书:"+name);
    }
}
