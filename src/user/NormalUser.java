package user;
import operation.*;
import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        this.ioperations=new IOperation[]{//普通用户操作数组
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
public int menu(){
    System.out.println("******普通用户菜单******");
    System.out.println("1.查找图书");
    System.out.println("2.借阅图书");
    System.out.println("3.归还图书");
    System.out.println("0.退出系统");
    System.out.println("********************");
    System.out.println("请输入你的操作:");
    Scanner scanner=new Scanner(System.in);
    int choice=scanner.nextInt();
    return choice;
    }
}
