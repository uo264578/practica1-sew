import javax.xml.bind.annotation.XmlElement;


public class Ruta {
	private String ruta;
	private String tipo;
	private String dificultad;
	private String duracion;
	private String agencia;
	private String descripcion;
	private String personas;
	private String inicio;
	private String direccionInicio;
	private Coordenada coordenadasInicio;
	private Referencias referencias;
	private String recomendacion;
	private Hitos hitos;

	public String getRuta() {
		return ruta;
	}

	@XmlElement
	public void setRuta(String nombre) {
		this.ruta = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	@XmlElement
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDificultad() {
		return dificultad;
	}

	@XmlElement
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getAgencia() {
		return agencia;
	}

	@XmlElement
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDuracion() {
		return duracion;
	}

	@XmlElement
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@XmlElement
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPersonas() {
		return personas;
	}

	@XmlElement
	public void setPersonas(String personasAdecuadas) {
		this.personas = personasAdecuadas;
	}

	public String getInicio() {
		return inicio;
	}

	@XmlElement
	public void setInicio(String lugarInicio) {
		this.inicio = lugarInicio;
	}

	public String getDireccionInicio() {
		return direccionInicio;
	}

	@XmlElement
	public void setDireccionInicio(String direccionInicio) {
		this.direccionInicio = direccionInicio;
	}

	public Coordenada getCoordenadasInicio() {
		return coordenadasInicio;
	}

	@XmlElement
	public void setCoordenadasInicio(Coordenada coordenada) {
		this.coordenadasInicio = coordenada;
	}

	public Referencias getReferencias() {
		return referencias;
	}

	@XmlElement
	public void setReferencias(Referencias referencias) {
		this.referencias = referencias;
	}

	public String getRecomendacion() {
		return recomendacion;
	}

	@XmlElement
	public void setRecomendacion(String recomendacion) {
		this.recomendacion = recomendacion;
	}

	public Hitos getHitos() {
		return hitos;
	}

	@XmlElement
	public void setHitos(Hitos hitos) {
		this.hitos = hitos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((referencias == null) ? 0 : referencias.hashCode());
		result = prime * result
				+ ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((duracion == null) ? 0 : duracion.hashCode());
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		
		result = prime * result
				+ ((direccionInicio == null) ? 0 : direccionInicio.hashCode());
		result = prime * result + ((ruta == null) ? 0 : ruta.hashCode());
		result = prime * result + ((personas == null) ? 0
				: personas.hashCode());
		result = prime * result
				+ ((recomendacion == null) ? 0 : recomendacion.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ruta other = (Ruta) obj;
		if (referencias == null) {
			if (other.referencias != null)
				return false;
		} else if (!referencias.equals(other.referencias))
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (duracion == null) {
			if (other.duracion != null)
				return false;
		} else if (!duracion.equals(other.duracion))
			return false;
		if (direccionInicio == null) {
			if (other.direccionInicio != null)
				return false;
		} else if (!direccionInicio.equals(other.direccionInicio))
			return false;
		if (ruta == null) {
			if (other.ruta != null)
				return false;
		} else if (!ruta.equals(other.ruta))
			return false;
		if (personas == null) {
			if (other.personas != null)
				return false;
		} else if (!personas.equals(other.personas))
			return false;
		if (recomendacion == null) {
			if (other.recomendacion != null)
				return false;
		} else if (!recomendacion.equals(other.recomendacion))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ruta [nombre=" + ruta + ", tipo=" + tipo + ", duracion=" + duracion + ", descripcion=" + descripcion
				+ ", personasAdecuadas=" + personas + ", lugarInicio="
				+ inicio + ", calleInicio=" + direccionInicio + ", coordenada="
				+ coordenadasInicio + ", referencias=" + referencias
				+ ", recomendacion=" + recomendacion + ", hitos=" + hitos + "]";
	}

}
