import java.io.File;
import java.io.PrintWriter;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import com.google.gson.Gson;


public class APIKey {
	String apiKey; 
	
	public String getAPIKeyJson(){
		try	
		{
			String targetURL=" https://pi.pardot.com/api/login/version/3?email=greg@qgenda.com&password=qgendaPardot2015!&user_key=9f18d11e630e170d14d207d19e641b19&format=json"; 
			PostMethod post = new PostMethod(targetURL);

			HttpClient httpclient = new HttpClient();

			try{
				httpclient.executeMethod(post);
				apiKey = post.getResponseBodyAsString(); 
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
			finally 
			{

				post.releaseConnection();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		return apiKey; 
	}
	
	public String getAPIKey(String akey){
	
		Gson gson = new Gson(); 
		String apiKeyAsJson = getAPIKeyJson(); 
		APIKeyClass apiKey = gson.fromJson(apiKeyAsJson,APIKeyClass.class); 
		return apiKey.getApi_key();
	}
//}
	

	public static void main(String a[])	{	
		APIKey apiK= new APIKey(); 
		String text =apiK.getAPIKeyJson();
		System.out.println(apiK.getAPIKey(text)); 
				
	}

}

