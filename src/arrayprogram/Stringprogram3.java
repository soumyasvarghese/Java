package arrayprogram;

public class Stringprogram3 {

	public static void main(String[] args) {
		String s3="Selenium webdriver is used for webapplication testing";
		String[] sr=s3.split(" ");
		for(String v:sr)
		{
			System.out.println(v);
			if(v.contains("webapplication"))
				//if(v.equals("webapplication"))
			{
			break;
		}
		}
	}

}
