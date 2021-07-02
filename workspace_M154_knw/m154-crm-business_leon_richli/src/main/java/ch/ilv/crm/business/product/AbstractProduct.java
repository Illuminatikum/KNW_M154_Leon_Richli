package ch.ilv.crm.business.product;

public class AbstractProduct implements IProduct {
	private int id = -1;
	private String description = "";
	
	public AbstractProduct(int id, String desciption) {
		this.id = id;
		this.description = desciption;
	}
	
	public AbstractProduct(String desciption) {
		this.description = desciption;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	public String getDescription() {
		return this.description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
}
