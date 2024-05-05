package operation;
import book.BookList;

public interface IOperation {
    void work(BookList bookList);//实现操作时引用该接口
}
