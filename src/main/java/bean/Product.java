package bean;

public class Product {

	private String name;
	private String com;
	private String mail;
	private String content;
	private String[] magazine;
	private String data;

	public String getName() {
		return name;
	}

	public String getCom() {
		return com;
	}

	public String getMail() {
		return mail;
	}

	public String getContent() {
		return content;
	}

	public String[] getMagazine() {
		return magazine;
	}

	public String getDate() {
		return data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCom(String com) {
		this.com=com;
}

public void setMail(String mail) {
		this.mail=mail;
		}


public void setContent(String content) {
			this.content=content;
}
public void setMagazine(String[] magazine ) {
			this.magazine=magazine;
}

public void setData(String data) {
	this.data = data;
}
}