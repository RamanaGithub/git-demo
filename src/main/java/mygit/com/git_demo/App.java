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
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
