package com.data.example;

import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.annotation.*;


/**
 * Example database zawiera listy obiekt�w wygenerowany. Docelowo bedzie ona zmieniona na baze
 * danych imion, nazwisk, nazw z ktorych beda generowane dane do poszczegolnych obiektow
 * 
 * @author olszewskij
 *
 */

@XmlRootElement
public class ExampleDatabase<T> {
	
 private List<T> listExampleData= new ArrayList<T>();
private int id;
private String name;
private int value;
	
 public ExampleDatabase(int id, String name, int value) {
	    this.id = id;
	    this.name = name;
	    this.value = value;
	  } 
  public List<T> getList() {
    return listExampleData;
  }

  public void setList(List<T> listExampleData) {
    this.listExampleData= listExampleData;
  }
}
