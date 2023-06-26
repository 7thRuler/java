import java.util.Scanner;
import java.lang.Exception;
class usr extends Exception{
	usr(String msg){
		System.out.println(msg);
	}
}
class pass extends Exception{
	pass(String msg){
		System.out.println(msg);
	}
}
public class exp{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		String username,password;
		System.out.println("Enter Username:");
		username=in.nextLine();
		System.out.println("Enter Password:");
		password=in.nextLine();
		int len=username.length();
		try{
			if(len < 8)
				throw new usr
				("Username must be greater than 8 characters\n");
			else if(!password.equals("admin"))
				throw new pass
				("Incorrect password\n");
			else
				System.out.println("Login SUcessfully");
			}
		catch(usr p){
			System.out.println(p);
			}
		catch(pass q){
			System.out.println(q);
			}
		}
	}
			
		
	
