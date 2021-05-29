package com.main.beans;

public class Upload {
	private String name;
	private String type;
	private String reldate;
	private String lead;
	private String director;
	private String genre;
	private String length;
	private String certificate;
	private String description;
	private String writer;
	private String category;
	private String relcountry;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}
	/**
	 * @return the certificate
	 */
	public String getCertificate() {
		return certificate;
	}
	/**
	 * @param certificate the certificate to set
	 */
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the relcountry
	 */
	public String getRelcountry() {
		return relcountry;
	}
	/**
	 * @param relcountry the relcountry to set
	 */
	public void setRelcountry(String relcountry) {
		this.relcountry = relcountry;
	}
	/**
	 * @return the lead
	 */
	public String getLead() {
		return lead;
	}
	/**
	 * @param lead the lead to set
	 */
	public void setLead(String lead) {
		this.lead = lead;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the reldate
	 */
	public String getReldate() {
		return reldate;
	}
	
	/**
	 * @param reldate the reldate to set
	 */
	
	public void setReldate(String reldate) {
		this.reldate = reldate;
	}
	@Override
	public String toString() {
		return "Upload [name=" + name + ", type=" + type + ", reldate=" + reldate + ", lead=" + lead + ", director="
				+ director + ", genre=" + genre + ", length=" + length + ", certificate=" + certificate
				+ ", description=" + description + ", writer=" + writer + ", category=" + category + ", relcountry="
				+ relcountry + "]";
	}
	

	public Upload() {
		System.out.print("upload java page");
	}

}
