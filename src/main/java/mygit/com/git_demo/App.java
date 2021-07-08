package mygit.com.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{    int i=10;
	public  addData(String data) {
		System.out.println("the data is"+data);
		if(data.equals(Constant.Data_Type)) {
		System.out.println("newly added statement.....from Constant class")	;	
		System.out.println("statement added on 6th july.....for testing");	;
		System.out.println("Error statement  added on 6th july.....now....");	;
			System.out.println("newly added statement from remote....on7th,july");
		}
		public void hello(){
			System.out.println("new method added in the remote repo");
		}
		public String sayHi(){
			return "sayinh hi to git world..............................";
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
