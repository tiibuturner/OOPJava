package data;

public class Traktori{
	private int id;
	private String merkki;
	private String malli;
	private int teho;
	
	public int getId() {
		return id;
	}
	public boolean setId(int id){
		if (id>0){
			this.id= id;
			return true;
		}
		return false;
	}
	public boolean setId(String Id){
		try{
			return setId(Integer.parseInt(Id));
		}
		catch(NumberFormatException e){
		}
		return false;
	}
	public String getMerkki() {
		return merkki;
	}
	public boolean setMerkki(String merkki) {
		if (merkki.length()>=5) {
			this.merkki = merkki;
			return true;
		} return false;
	}
	public String getMalli() {
		return malli;
	}
	public boolean setMalli(String malli) {
		if (malli.length()>=5) {
			this.malli = malli;
			return true;
		} return false;
	}
	public int getTeho() {
		return teho;
	}
	public boolean setTeho(int teho){
		if (teho > 30 && teho < 250){
			this.teho = teho;
			return true;
		}
		return false;
	}
	public boolean setTeho(String teho){
		try{
			return setTeho(Integer.parseInt(teho));
		}
		catch(NumberFormatException e){
		}
		return false;
	}
	
	public Traktori(int id, String merkki, String malli, int teho) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.merkki=merkki;
		this.malli=malli;
		this.teho=teho;
	}
	
	@Override
	public String toString() {
		return "Traktori [id=" + id + ", merkki=" 
				+ merkki + ", malli=" + malli + ", teho=" 
				+ teho + "]";
	}
	
}
