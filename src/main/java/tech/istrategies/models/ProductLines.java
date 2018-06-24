package tech.istrategies.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productLines")
public class ProductLines {

	@Id
	@Column(name="productLine")
	private String productLine;
	private String textDescription;
	private String htmlDescription;
	private Byte image;
	
	
	public ProductLines() {}


	public String getProductLine() {
		return productLine;
	}


	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}


	public String getTextDescription() {
		return textDescription;
	}


	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}


	public String getHtmlDescription() {
		return htmlDescription;
	}


	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}


	public Byte getImage() {
		return image;
	}


	public void setImage(Byte image) {
		this.image = image;
	}
	
}
