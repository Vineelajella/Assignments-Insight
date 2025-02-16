package Day4Ass;

import java.time.LocalDate;

public class Movies implements Comparable<Movies> {
	String name;
	String lan;
	String releaseDate;
	String director;
	String producer;
	int duraton;
	public Movies(String name, String lan, String releaseDate, String director, String producer, int duraton) {
		super();
		this.name = name;
		this.lan = lan;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duraton = duraton;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLan() {
		return lan;
	}

	public void setLan(String lan) {
		this.lan = lan;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getDuraton() {
		return duraton;
	}

	public void setDuraton(int duraton) {
		this.duraton = duraton;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", lan=" + lan + ", releaseDate=" + releaseDate + ", director=" + director
				+ ", producer=" + producer + ", duraton=" + duraton + "]";
	}
	
	public int compareTo(Movies o) {
		return this.lan.compareTo(o.lan);
	}
	
	

}
