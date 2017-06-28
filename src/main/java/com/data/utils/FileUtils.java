package com.data.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
public class FileUtils {

  public static String PROPERTY_NAME_PATH = "data/names.csv";

  public static String getResourcePath(String shortPath) {
    ClassLoader classLoader = FileUtils.class.getClassLoader();
    return classLoader.getResource(shortPath).getPath();
  }

  /**
   * Wczytanie pliku jako string
   * 
   * @param filepath
   * @return
 * @throws IOException 
   */
  public static String readFile(String filepath) throws IOException  {
	  	  
	  return org.apache.commons.io.FileUtils.readFileToString(new File(filepath));
      }

  /**
   * Zapisanie contentu w pliku o sciezce filepath
   * 
   * @param filepath
   * @param content
 * @throws IOException 
 * @throws FileNotFoundException 
   */
  
public static void saveFile(String filepath, String content, boolean append) throws IOException {
		 org.apache.commons.io.FileUtils.writeStringToFile(new File(filepath), content, append);
	 }
}
