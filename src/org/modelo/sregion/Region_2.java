package org.modelo.sregion;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Region_2 {
   private int id;
   private String nombre;
   
   @Id
   @GeneratedValue
   
   public int getId() {
	return id;
   }
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
 
   
   
   
}
