public class Book extends TangibleAsset{
	private String ibsn;
	public Book(String name, int Price, String color, String ibsn){
		super(name, price, color);
		this.ibsn = ibsn;	
	}
	public String getIbsn(){ return this.ibsn; }
}
