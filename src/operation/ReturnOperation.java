package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("归还图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要归还的书名:");
        String name=scanner.nextLine();

        int currentSize=bookList.getUseSize();
        for (int i=0;i<currentSize;i++){
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("成功归还！");
                return;
            }
        }
        System.out.println("抱歉，此书不在归还范围中:"+name);
    }
}
