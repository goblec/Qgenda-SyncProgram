import java.util.Collection;


public class ZohoRow {
	private int no; 
	private Collection<ZohoField> FL; 
	
	public int getNo(){return no;}
	public Collection<ZohoField> getFL(){return FL;}
	
	public void setNo(int no){this.no=no;}
	public void set(Collection<ZohoField> FL){this.FL=FL;}
}
