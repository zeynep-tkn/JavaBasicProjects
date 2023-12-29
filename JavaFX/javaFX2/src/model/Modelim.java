package model;

import java.time.LocalDate;

public class Modelim {
   private LocalDate tarihDate;
   private String aciklamaString;
  public LocalDate getTarihDate() {
	return tarihDate;
}


  public String getAciklamaString() {
	return aciklamaString;
}
   public Modelim (LocalDate tarih, String aciklama){
	 this.tarihDate=tarih;
	 this.aciklamaString=aciklama;
	 
 }
   
   
}
