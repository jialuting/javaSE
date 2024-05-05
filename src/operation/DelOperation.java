package operation;
import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除图书！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除的书名:");
        String name=scanner.nextLine();

        int currentSize=bookList.getUseSize();
        int index=-1;

        for (int i=0;i<currentSize;i++){
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                index=i;
            }
        }
        if(index == -1){
            System.out.println("无法删除，此书不存在！");
        }
        for (int j=index;j<currentSize-1;j++){
            Book book=bookList.getBooks(j+1);
            bookList.setBooks(book,j);
        }
        bookList.setBooks(null,currentSize-1);
        bookList.setUseSize(currentSize-1);
        System.out.println("删除成功！");
    }
}
