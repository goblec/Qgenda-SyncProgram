import java.io.*;

import java.util.*;
import java.net.*;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.PartSource;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;

public class getZohoContacts 
{
	public static void main(String a[])
	{	
		try	
		{
					//----------------------------Fetch Auth Token ----------------------
//					String authtoken = 
//							"a2c591362470d899dafc5f081fae2cf4";//If you don't have a authtoken please refer this wiki https://zohocrmapi.wiki.zoho.com/using-authtoken.html
//					String scope = "crmapi";
//					String selectColumns ="Contact(Last Name,Email)";
//					String newFormat = "1";
//					String version = "4"; 
//					String fromIndex = "1";
//					String toIndex = "50";
//		
					String targetURL="https://crm.zoho.com/crm/private/json/Contacts/getRecords?authtoken=a2c591362470d899dafc5f081fae2cf4&scope=crmapi"; 
//					String paramname = "content";
					PostMethod post = new PostMethod(targetURL);
//					post.setParameter("authtoken",authtoken);
//					post.setParameter("scope",scope);
//					post.setParameter("selectColumns",selectColumns);
//					post.setParameter("newFormat",newFormat);
//					post.setParameter("version",version); 
//					post.setParameter("fromIndex",fromIndex);
//					post.setParameter("toIndex",toIndex);
					
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
						myout = new PrintWriter(new File("ZohoContacts.json"));
						myout.print(post.getResponseBodyAsString());
					
						//-----------------------Get response as a string ----------------
						String postResp = post.getResponseBodyAsString();
						Gson gson = new Gson(); 
						
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