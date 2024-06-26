
import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static User login() {
        System.out.println("请输入你的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入你的身份，1:管理员   2:普通用户->");
        int choice=scanner.nextInt();
        if (choice == 1){
            return new AdminUser(name);
        }
        else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
    BookList bookList=new BookList();
    User user=login();
    while(true){
        int choice=user.menu();
        user.doOperation(choice,bookList);
        }
    }
}