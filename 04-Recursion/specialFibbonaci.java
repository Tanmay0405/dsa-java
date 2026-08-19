
class specialFibbonaci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		    System.out.println(fun(86, 77 ,15));
		

	}
	private static int fun(int a,int b,int n){
	    if(n==0){
	        return a;
	    }if(n==1){
	        return b;
	    }
	    return fun(a,b,n-1)^fun(a,b,n-2);
	}
}
