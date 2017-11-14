package br.com.gestao.livraria.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Livro implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//	
//	@Id
//	@GeneratedValue (strategy = GenerationType.AUTO)
//    @Column(name="id", nullable=false, unique=true)
//	private Long id;
//	
//	@Column(name = "titulo", nullable=false)
//	private String titulo;
//	
//	@Column(name = "autor", nullable=false)
//	private String autor;
//	
//	public Livro(){
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTitulo() {
//		return titulo;
//	}
//
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//
//	public String getAutor() {
//		return autor;
//	}
//
//	public void setAutor(String autor) {
//		this.autor = autor;
//	}
//	
//}
