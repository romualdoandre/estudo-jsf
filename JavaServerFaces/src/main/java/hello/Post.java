package hello;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Post
 *
 */
@Entity
@Table(name="post")
public class Post implements Serializable {

	   
	@Id
	@GeneratedValue
	private int id;
	private String texto;
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
   
}
