package week1.day2;

public class LearnMethods {
	
	public int add()
	{
		int A=10;
		int B=10;
		int c=A+B;
		//System.out.println(c);
		return c;// by using return we can get data from method		
	}
 
	//passing the arguments
	public void Result(int value,String str) {
		System.out.println("The Accepted Argument is " +value);
		System.out.println("String Value " +str);
			}

	public static void main(String[] args) {
		
		LearnMethods obj=new LearnMethods();
		obj.add();
		int result=obj.add();
		System.out.println("result" +result);
		obj.Result(result,"String");
		obj.Result(45,"Str");
			
		
	}

}
