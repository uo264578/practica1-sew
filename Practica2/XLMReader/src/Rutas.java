import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rutas {
	private List<Ruta> rutas = new ArrayList<>();

	public List<Ruta> getRutas() {
		return rutas;
	}

	@XmlElement(name = "ruta")
	public void setRutas(List<Ruta> rutas) {
		this.rutas = rutas;
	}

	@Override
	public String toString() {
		String aux = "Rutas [";
		for (Ruta ruta : rutas) {
			aux += "\n\t" + ruta;
		}
		return aux + "\n]";
	}

}
