package MyPackage;

public class ThisKeyword {

	int a;
	
	public void keyword(int a)
	{
		this.a=a;
	}
   
	public void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		
		ThisKeyword obj=new ThisKeyword();
		obj.keyword(20);
		obj.show();
		
	}

}
