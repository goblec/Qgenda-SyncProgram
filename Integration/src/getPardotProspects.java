import java.io.File;
import java.io.PrintWriter;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;


public class getPardotProspects {
	
	
	public static void main(String args[]){
		
		try	
		{
			
			String targetURL="https://pi.pardot.com/api/prospect/version/3/do/query?api_key=be6571c972cb1e62a6509e3678dfc913&user_key=9f18d11e630e170d14d207d19e641b19&format=json"; 
			PostMethod post = new PostMethod(targetURL);

			HttpClient httpclient = new HttpClient();
			PrintWriter myout = null;

			// Execute http request
			try 
			{
				long t1 = System.currentTimeMillis();
				int result = httpclient.executeMethod(post);
				System.out.println("HTTP Response status code: " + result);
				System.out.println(">> Time taken " + (System.currentTimeMillis() - t1));

				// writing the response to a file
				myout = new PrintWriter(new File("PardotProspects.json"));
				myout.print(post.getResponseBodyAsString());

				//-----------------------Get response as a string ----------------
				String postResp = post.getResponseBodyAsString();
				System.out.println("postResp=======>"+postResp);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
			finally 
			{
				myout.close();
				post.releaseConnection();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
