package problems;
public class Booleanprgm 
{
	public static void main(String[] args) 
	{
        int a=1000,b=570;  
        Boolean b1=(a>b)?true:false;  
        Boolean b2=(a<b)?true:false;  
        int b3 = Boolean.compare(b1,b2);  
        if(b3==0)
        {  
            System.out.println("Both values are equal");  
        }  
        else if(b3>0)
        {  
            System.out.println("true");  
        }  
        else
        {  
            System.out.println("false");              
	    }  
     } 
}