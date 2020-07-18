package thirteen;

public class Demo2
{
   private String name ="satya";

   public void func4(Demo1 s1) // using primitive datatype as a parameter
   {
	   System.out.println("employee name="+name);
	   s1.func1();
	   s1.func2();
	   s1.func3();
   }

}
