package com.data.example;

import java.util.List;

/**
 * Example database zawiera listy obiektów wygenerowany. Docelowo bedzie ona zmieniona na baze
 * danych imion, nazwisk, nazw z ktorych beda generowane dane do poszczegolnych obiektow
 * 
 * @author olszewskij
 *
 */
public class ExampleDatabase {

  List<ExampleData> list;

  public List<ExampleData> getList() {
    return list;
  }

  public void setList(List<ExampleData> list) {
    this.list = list;
  }
}
