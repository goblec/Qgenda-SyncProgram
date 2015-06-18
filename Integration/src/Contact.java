
public class Contact {
	private int contactId; 
	private int smownerid; 
	private String contactOwner; 
	private String firstName; 
	private String lastName; 
	private int accountId; 
	private String accountName; 
	private String email; 
	private String title; 
	private String phone; 
	private int smCreatorId;
	private String createdBy; 
	private int MODIFIEDBY; 
	private String modifiedBy; 
	private String createdTime; 
	private String modifiedTime; 
	private String mailingCity; 
	private String mailingState; 
	private boolean emailOptOut; 
	private String salutation; 
	private boolean addToQuickBooks; 
	private String groupType; 
	private String lastActivityTime; 
	
//	Getters for fields 	
	public int getContactId(){return contactId;}
	public int getSmOwnerId(){return smownerid;}
	public String getContactOwner(){return contactOwner;}
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public int getAccountId(){return accountId;}
	public String getAccountName(){return accountName;}
	public String getEmail(){return email;}
	public String getTitle(){return title;}
	public String getPhone(){return phone;}
	public int getSmCreatorId(){return smCreatorId;}
	public String getCreatedBy(){return createdBy;}
	public int getMODIFIEDBY(){return MODIFIEDBY;}
	public String getModifiedBy(){return modifiedBy;}
	public String getCreatedTime(){return createdTime;}
	public String getModifiedTime(){return modifiedTime;}
	public String getMailingCity(){return mailingCity;}
	public String getMailingState(){return mailingState;}
	public boolean getEmailOptOut(){return emailOptOut;}
	public String getSalutation(){return salutation;}
	public boolean getAddToQuickBooks(){return addToQuickBooks;}
	public String getGroupType(){return groupType;}
	public String getLastActivityTime(){return lastActivityTime;}
	
//setters for fields
	public void setContactId(int contactId){this.contactId=contactId; }
	public void setSmOwnerId(int smOwnerId){this.smownerid=smOwnerId;}
	public void getContactOwner(String contactOwner){this.contactOwner=contactOwner;}
	public void setFirstName(String firstName){this.firstName=firstName;}
	public void setLastName(String lastName){this.lastName=lastName;}
	public void setAccountId(int accountId){this.accountId=accountId;}
	public void setAccountName(String accountName){this.accountName=accountName; ;}
	public void setEmail(String email){this.email=email;}
	public void setTitle(String title){this.title=title;;}
	public void setPhone(String phone){this.phone=phone;}
	public void setSmCreatorId(int smCreatorId){this.smCreatorId=smCreatorId;}
	public void setCreatedBy(String createdBy){this.createdBy=createdBy;}
	public void setMODIFIEDBY(int MODIFIEDBY){this.MODIFIEDBY=MODIFIEDBY;}
	public void setModifiedBy(String modifiedBy){this.modifiedBy=modifiedBy;}
	public void setCreatedTime(String createdTime){this.createdTime=createdTime;}
	public void setModifiedTime(String modifiedTime){this.modifiedTime=modifiedTime;}
	public void setMailingCity(String mailingCity){this.mailingCity=mailingCity;}
	public void setMailingState(String mailingState){this.mailingState=mailingState;}
	public void setEmailOptOut(boolean emailOptOut){this.emailOptOut=emailOptOut;}
	public void setSalutation(String salutation){this.salutation=salutation;}
	public void setAddToQuickBooks(boolean addToQuickBooks){this.addToQuickBooks=addToQuickBooks;}
	public void setGroupType(String groupType){this.groupType=groupType;}
	public void setLastActivityTime(String lastActivityTime){this.lastActivityTime=lastActivityTime;}
	
}
