package com.data.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;



public class generatoFileUtils {
	

  private static final int UTF = 0;
public static String PROPERTY_NAME_PATH = "data/names.csv";

  public static String getResourcePath(String shortPath) {
    ClassLoader classLoader = generatoFileUtils.class.getClassLoader();
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
	
	  return FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
      }

  /**
   * Zapisanie contentu w pliku o sciezce filepath
   * 
   * @param filepath
   * @param content
 * @throws IOException 
 * @throws FileNotFoundException 
   */
  
public void saveFile(String filepath, String content,Charset charset,boolean append) throws IOException {
	 
		 FileUtils.writeStringToFile(new File(filepath), content, StandardCharsets.UTF_8, true);
	 }
}
