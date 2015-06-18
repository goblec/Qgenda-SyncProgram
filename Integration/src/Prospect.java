import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class Prospect {
	//Fields/Getters/Setters
		private int id;
		private int campaign_id;
		private String salutation;
		private String first_name; 
		private String last_name; 
		private String email; 
		private String password; 
		private String company; 
		private String website; 
		private String job_title; 
		private String department; 
		private String country;
		private String address_one; 
		private String address_two; 
		private String city; 
		private String state; 
		private String territory; 
		private int zip; 
		private String phone; 
		private String fax; 
		private String source; 
		private String annual_revenue; 
		private String employees; 
		private String industry;
		private int years_in_buisness; 
		private String comments;
		private String notes;
		private String score;
		private String grade;
		private String last_activity_at;
		private String recent_interaction;
		private String crm_lead_fid;
		private String crm_contact_fid;
		private String crm_owner_fid;
		private String crm_account_fid;
		private String crm_last_sync;
		private String crm_url;
		private String is_do_not_email;
		private String is_do_not_call;
		private String opted_out;
		private String is_reviewed;
		private String is_starred;
		private String created_at;
		private String updated_at;
		private Campaign campaign;
		private Assigned_to assigned_to;
		private String Role;
		//public Prospect(String asString) {
			// TODO Auto-generated constructor stub
		//}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCampaign_id() {
			return campaign_id;
		}
		public void setCampaign_id(int campaign_id) {
			this.campaign_id = campaign_id;
		}
		public String getSalutation() {
			return salutation;
		}
		public void setSalutation(String salutation) {
			this.salutation = salutation;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public String getJob_title() {
			return job_title;
		}
		public void setJob_title(String job_title) {
			this.job_title = job_title;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getAddress_one() {
			return address_one;
		}
		public void setAddress_one(String address_one) {
			this.address_one = address_one;
		}
		public String getAddress_two() {
			return address_two;
		}
		public void setAddress_two(String address_two) {
			this.address_two = address_two;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getTerritory() {
			return territory;
		}
		public void setTerritory(String territory) {
			this.territory = territory;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public String getPhone(String string) {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getFax() {
			return fax;
		}
		public void setFax(String fax) {
			this.fax = fax;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getAnnual_revenue() {
			return annual_revenue;
		}
		public void setAnnual_revenue(String annual_revenue) {
			this.annual_revenue = annual_revenue;
		}
		public String getEmployees() {
			return employees;
		}
		public void setEmployees(String employees) {
			this.employees = employees;
		}
		public String getIndustry() {
			return industry;
		}
		public void setIndustry(String industry) {
			this.industry = industry;
		}
		public int getYears_in_buisness() {
			return years_in_buisness;
		}
		public void setYears_in_buisness(int years_in_buisness) {
			this.years_in_buisness = years_in_buisness;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getLast_activity_at() {
			return last_activity_at;
		}
		public void setLast_activity_at(String last_activity_at) {
			this.last_activity_at = last_activity_at;
		}
		public String getRecent_interaction() {
			return recent_interaction;
		}
		public void setRecent_interaction(String recent_interaction) {
			this.recent_interaction = recent_interaction;
		}
		public String getCrm_lead_fid() {
			return crm_lead_fid;
		}
		public void setCrm_lead_fid(String crm_lead_fid) {
			this.crm_lead_fid = crm_lead_fid;
		}
		public String getCrm_contact_fid() {
			return crm_contact_fid;
		}
		public void setCrm_contact_fid(String crm_contact_fid) {
			this.crm_contact_fid = crm_contact_fid;
		}
		public String getCrm_owner_fid() {
			return crm_owner_fid;
		}
		public void setCrm_owner_fid(String crm_owner_fid) {
			this.crm_owner_fid = crm_owner_fid;
		}
		public String getCrm_account_fid() {
			return crm_account_fid;
		}
		public void setCrm_account_fid(String crm_account_fid) {
			this.crm_account_fid = crm_account_fid;
		}
		public String getCrm_last_sync() {
			return crm_last_sync;
		}
		public void setCrm_last_sync(String crm_last_sync) {
			this.crm_last_sync = crm_last_sync;
		}
		public String getCrm_url() {
			return crm_url;
		}
		public void setCrm_url(String crm_url) {
			this.crm_url = crm_url;
		}
		public String getIs_do_not_email() {
			return is_do_not_email;
		}
		public void setIs_do_not_email(String is_do_not_email) {
			this.is_do_not_email = is_do_not_email;
		}
		public String getIs_do_not_call() {
			return is_do_not_call;
		}
		public void setIs_do_not_call(String is_do_not_call) {
			this.is_do_not_call = is_do_not_call;
		}
		public String getOpted_out() {
			return opted_out;
		}
		public void setOpted_out(String opted_out) {
			this.opted_out = opted_out;
		}
		public String getIs_reviewed() {
			return is_reviewed;
		}
		public void setIs_reviewed(String is_reviewed) {
			this.is_reviewed = is_reviewed;
		}
		public String getIs_starred() {
			return is_starred;
		}
		public void setIs_starred(String is_starred) {
			this.is_starred = is_starred;
		}
		public String getCreated_at() {
			return created_at;
		}
		public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}
		public String getUpdated_at() {
			return updated_at;
		}
		public void setUpdated_at(String updated_at) {
			this.updated_at = updated_at;
		}
		public Campaign getCampaign() {
			return campaign;
		}
		public void setCampaign(Campaign campaign) {
			this.campaign = campaign;
		}
		public Assigned_to getAssigned_to() {
			return assigned_to;
		}
		public void setAssigned_to(Assigned_to assigned_to) {
			this.assigned_to = assigned_to;
		}
		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}
		
		public static void main(String args[]){
		
		Gson gson= new Gson();
		getPardotProspects getProspects = new getPardotProspects();
		String prospectAsJson = getPardotProspects.main(args);
		Prospect prospect = gson.fromJson(prospectAsJson, Prospect.class);
		
		
		Collection collection = new ArrayList();
		
		String json = gson.toJson(collection);
		JsonParser parser = new JsonParser();
		JsonArray array = parser.parse(json).getAsJsonArray();
		Prospect message= gson.fromJson(array.get(1),Prospect.class);
		System.out.println(prospect);
		
		class ProspectDeserializer implements JsonDeserializer<Prospect> {
			  public Prospect deserialize(JsonElement json, Type prospect, JsonDeserializationContext email)
			      throws JsonParseException {
			    return new Prospect();
			  }
		}
	}

}
