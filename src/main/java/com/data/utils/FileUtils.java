package com.data.utils;

public class FileUtils {

  public static String getResourcePath(String shortPath) {
    ClassLoader classLoader = FileUtils.class.getClassLoader();
    return classLoader.getResource(shortPath).getPath();
  }

  /**
   * Wczytanie pliku jako string
   * 
   * @param filepath
   * @return
   */
  public static String readFile(String filepath) {
    return null;
  }

  /**
   * Zapisanie contentu w pliku o sciezce filepath
   * 
   * @param filepath
   * @param content
   */
  public static void saveFile(String filepath, String content) {

  }
}
