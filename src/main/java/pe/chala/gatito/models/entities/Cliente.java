package pe.chala.gatito.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre_apellidos", length = 50, nullable = false)
	private String nombreApellidos;
	
	@Column(name = "telefono", length = 9, nullable = false)
	private String telefono;
	
	@OneToMany(mappedBy = "cliente")
	private List<Gato> gatos;
	
	public Cliente() {
		gatos=new ArrayList<Gato>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Gato> getGatos() {
		return gatos;
	}

	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
	}
	
}
