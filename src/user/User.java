package user;

import book.BookList;
import operation.IOperation;
//管理员和普通用户继承该父类
public abstract class User {
   protected String name;//用户名字
   protected IOperation[] ioperations;//操作（不同操作类型）接口数组
   public User(String name){
       this.name=name;
   }
   public void doOperation(int choice,BookList bookList){
       this.ioperations[choice].work(bookList);//通过choice引用接口实现相应操作
   }
   public abstract int menu();//提供空菜单让Admin User和NomalUser重写
}
