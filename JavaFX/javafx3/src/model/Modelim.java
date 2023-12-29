package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Modelim implements Serializable{
private static final long serialVersionUID=1L;
private LocalDate tarihDate;
private String aciklamaString;

public LocalDate getTarihDate() {
	return tarihDate;
}

public String getAcikalmaString() {
	return aciklamaString;
}
public Modelim(LocalDate tarih,String aciklama){
	this.tarihDate=tarih;
	this.aciklamaString=aciklama;
}
@Override
public String toString() {
	return "Gorev Zamanı: "+tarihDate+" Goreviniz:"+aciklamaString;
}


}
