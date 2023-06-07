
public class Photo {

	private String url;
	private String firstname;
	private int width;
	private int height;
	
	public Photo(String url, String firstname, int width, int height) {
		super();
		this.url = url;
		this.firstname = firstname;
		this.width = width;
		this.height = height;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
