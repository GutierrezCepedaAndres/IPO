package dominio;

import java.net.URL;
import java.util.ArrayList;

import presentacion.Circuitos;

public class CircuitoAmp {

	private String ciudad;
	private String monumento;
	private String entrada;
	private String horario;
	private String duracion;
	private String tipologia;
	private String descripcion;
	private URL foto;
	
	public CircuitoAmp(String ciudad, String monumento, String entrada, String horario, String duracion, String tipologia,
			String descripcion, URL foto) {
		super();
		this.ciudad = ciudad;
		this.monumento = monumento;
		this.entrada = entrada;
		this.horario = horario;
		this.duracion = duracion;
		this.tipologia = tipologia;
		this.descripcion = descripcion;
		this.foto = foto;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	
	public static ArrayList<CircuitoAmp> generarCircuito() {
		ArrayList<CircuitoAmp> circuitosAmp =new ArrayList<CircuitoAmp>();
		circuitosAmp.add(new CircuitoAmp("Almodovar del Campo","Museo Palmero","2.5 �","De 9:00-14:00 y 17:00-19:00","1 hora y 30 min aprox","Museo","Alfredo Palmero de Gregorio naci� en Almod�var del Campo en 1901, precisamente en el caser�n que desde la d�cada de 1960 alberga el citado museo. Se convirti� en uno de los pintores espa�oles m�s conocidos en el siglo XX. Tras su formaci�n en la Real Academia de Bellas Artes de San Fernando de Madrid y posterior etapa de profesor, el �Maestro Palmero� cosech� grandes �xitos con sus exposiciones",Circuitos.class.getResource("/presentacion/museo_palmero.jpg")));
		circuitosAmp.add(new CircuitoAmp("Almagro", "Museo Nacional del Teatro", "Gratuita","De 10:00-14:00 y 16:00-18:00","2/3 horas aprox","Museo","El Museo Nacional del Teatro es una instituci�n espa�ola dedicada a la promoci�n y salvaguardia del teatro espa�ol, que forma parte de la red de Museos Nacionales, y que est� localizado en la localidad castellano-manchega de Almagro (Ciudad Real). La nueva sede fue inaugurada el 4 de febrero de 2004 por los Reyes de Espa�a. En la actualidad su gesti�n est� transferida al Instituto Nacional de las Artes Esc�nicas y de la M�sica (INAEM), dependiente del Ministerio de Cultura y Deporte.", Circuitos.class.getResource("/presentacion/museo_almagro.jpg")));
		circuitosAmp.add(new CircuitoAmp("Campo de Criptana", "Molino Burleta", "Gratuita","De 10:00-14:00 y 16:00-18:30","2 horas aprox","Molinos de viento","Tambi�n conocido como Burlapobres, la denominaci�n hace alusi�n, probablemente, a la sospecha de pr�cticas fraudulentas por parte del molinero. Conserva la estructura y mecanismo originales del siglo XVI", Circuitos.class.getResource("/presentacion/molinos.jpg")));
		circuitosAmp.add(new CircuitoAmp("Ciudad Real", "Alarcos", "De 3 � hasta 5 �","De 10:00-18:00","45 min/1 hora aprox","Yacimiento arqueologico","Parque arqueol�gico muy importante de la historia de la Reconquista castellana y a una aldea pr�xima llamada Pozo Seco de Don Gil que se refund� como nueva capital por orden de Alfonso X el Sabio y la nombr� Villa Real, m�s tarde se le otorg� el t�tulo de ciudad pasando a ser Ciudad Real. Los hallazgos arqueol�gicos demuestran la ocupaci�n humana del cerro desde la Edad del Bronce hasta la Plena Edad Media, con un largo periodo intermedio de despoblaci�n en la �poca romana y visigoda. Los trabajos de excavaci�n y restauraci�n que se vienen realizando en el yacimiento desde 1984 han permitido recuperar un sector de la trama urbana de la ciudad �bera, as� como buena parte de la muralla y del castillo medievales.", Circuitos.class.getResource("/presentacion/alarcos.jpg")));
		circuitosAmp.add(new CircuitoAmp("Miguelturra", "Ermita del Santisimo Cristo","Gratuita","De 10:00-20:00","30/45 min aprox","Iglesia Catolica","Edificio religioso que se levanta en la localidad de Miguelturra (Ciudad Real), se la conoce popularmente como la torre gorda. Se trata de una construcci�n cil�ndrica acabada a principios del siglo XIX. Est� coronada por una c�pula y rematada con cimborrio y linterna. Dentro se venera a la imagen del Sant�simo Cristo de la Misericordia, patr�n de la localidad. Est� declarada Monumento Hist�rico Art�stico, siendo la �ltima obra de renacentista de la regi�n.", Circuitos.class.getResource("/presentacion/ermita_miguelturra.jpg")));
		circuitosAmp.add(new CircuitoAmp("Ruidera", "Lagunas de Ruidera", "Gratuita","Abierto las 24 horas","5/6 horas aprox","Parque natural","Espacio natural protegido y una de los grandes humedales de importancia situado en la comunidad aut�noma espa�ola de Castilla-La Mancha. Forman el parque natural un conjunto de diecis�is remansos o lagunas fluviales a lo largo del valle del Guadiana Viejo, como continuaci�n del r�o Pinilla por su afluencia sureste, y por su afluencia noreste a lo largo del Arroyo Alarconcillo; separados y conectados entre s� por barreras de formaci�n tob�cea o travertino.", Circuitos.class.getResource("/presentacion/lagunas_ruidera.jpg")));
		circuitosAmp.add(new CircuitoAmp("Almaden", "Parque minero", "De 10 � hasta 14 �","De 10:30-14:00 y 15:30-19:00","3 horas aprox","Museo","Es herencia viva de los dos mil a�os de la explotaci�n de Almad�n. Tras el cierre de la actividad minera en 2003, las minas m�s antiguas del mundo cuya actividad se ha mantenido hasta nuestros d�as, muestran sus secretos. El Parque Minero de Almad�n empez� a recibir visitantes en septiembre de 2006, aunque fue inaugurado en enero de 2008.\r\n" + 
				"\r\n" + 
				"El mercurio, la plata viva de los romanos, se muestra en el Parque en todos sus aspectos, la extracci�n de su mineral, el cinabrio, sulfuro de mercurio, su transformaci�n en los hornos metal�rgicos, sus propiedades f�sicas y qu�micas, sus usos y, como no, su eterna historia.", Circuitos.class.getResource("/presentacion/parque_minero.jpg"))); 
		return circuitosAmp;
	}

	public String getMonumento() {
		return monumento;
	}

	public void setMonumento(String monumento) {
		this.monumento = monumento;
	}
	
}
