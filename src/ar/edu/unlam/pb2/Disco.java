package ar.edu.unlam.pb2;

public class Disco 
{
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	
	public Disco()
	{
		this.radioInterior=2.0;
		this.radioExterior=10.0;
		this.perimetroInterior=2*Math.PI*this.radioInterior;
		this.perimetroExterior=2*Math.PI*this.radioExterior;
		Double superficiePequeña = Math.PI*(this.radioInterior*this.radioInterior);
		this.superficie = ((Math.PI*(this.radioExterior*this.radioExterior))-superficiePequeña);
	}
	
	public Disco(Double radioInterior,Double radioExterno)
	{
		this.radioInterior= radioInterior;
		this.radioExterior= radioExterno;
		this.perimetroInterior=2*Math.PI*this.radioInterior;
		this.perimetroExterior=2*Math.PI*this.radioExterior;
		Double superficiePequeña = Math.PI*(this.radioInterior*this.radioInterior);
		this.superficie = ((Math.PI*(this.radioExterior*this.radioExterior))-superficiePequeña);
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double getPerimetroInterior() {
		return perimetroInterior;
	}

	public void setPerimetroInterior(Double perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}

	public Double getPerimetroExterior() {
		return perimetroExterior;
	}

	public void setPerimetroExterior(Double perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}
	
}
