package com.data.XMLDataWriterTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.data.utils.generatoFileUtils;

public class FileUtilsTest {
	String filepath;
	String content;
	
	@Before
	public void setUp(){
		filepath= "F:/Repozytorium/data-generator/src/main/resources/data/names.csv";
		content= "Romek Atomek";
		
		
	}
	
	@Test
	public void saveToFileTest(String filepath, String content,boolean append) throws FileNotFoundException, IOException{
		
		generatoFileUtils fileUtils = new generatoFileUtils();
		fileUtils.saveFile(filepath, content);
		
		
	}
	
	@Test
	public void readFromFileTest(String filePath) throws IOException{
		
		
		System.out.println(generatoFileUtils.readFile(filePath));
	}

}
