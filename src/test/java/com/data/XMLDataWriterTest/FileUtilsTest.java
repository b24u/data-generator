package com.data.XMLDataWriterTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.data.utils.FileUtils;

public class FileUtilsTest {
	String filepath;
	String content;
	
	@Before
	public void setUp(){
		filepath= "F:/Repozytorium/data-generator/src/main/resources/data/names.csv";
		content= "Romek Atomek";
		
	}
	
	@Test
	public void saveToFileTest(String filepath, String content) throws FileNotFoundException, IOException{
		FileUtils fileUtils = new FileUtils();
		fileUtils.saveFile(filepath, content,true);
		
		
	}
	
	@Test
	public void readFromFileTest(String filePath) throws IOException{
		
		
		System.out.println(FileUtils.readFile(filePath));
	}

}
