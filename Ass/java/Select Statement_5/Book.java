
public class Book {
	Integer id;
	String title;
	String category;
	String author;
	Double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer id, String title, String category, String author, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
