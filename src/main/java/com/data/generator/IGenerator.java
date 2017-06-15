package com.data.generator;

/*
 * not use to remove in version 1.0.1
 */
@Deprecated
public interface IGenerator<T> {

  /**
   * Przygotowanie/utworzenie danych
   */
  void createData();

  /**
   * Zapisanie danych do pliku
   * 
   * @param pathFile
   */
  void saveData(String pathFile);



}
