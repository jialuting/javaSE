package user;
import operation.*;
import java.util.Scanner;
public class AdminUser extends User {
    public AdminUser(String name){
        super(name);//沿用父类中的名字
        this.ioperations=new IOperation[]{//管理员操作数组
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    public int menu(){
        System.out.println("******管理员菜单******");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("********************");
        System.out.println("请输入你的操作:");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
