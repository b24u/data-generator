package com.data.generator;

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
