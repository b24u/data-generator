package com.data.XMLDataWriterTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import com.data.utils.generatoFileUtils;

public class FileUtilsTest {
	String filepath;
	String content;
	
	@Before
	public void setUp(){
		filepath= "/data-generator/src/main/resources/data/names.csv";
		content= "Romek"+" Atomek";
		
		
	}
	
	@Test
	public void saveToFileTest() throws FileNotFoundException, IOException{
		
		generatoFileUtils fileUtils = new generatoFileUtils();
		fileUtils.saveFile(filepath, content, StandardCharsets.UTF_8, true);
		
		
	}
	
	@Test
	public void readFromFileTest() throws IOException{
		
		
		System.out.println(generatoFileUtils.readFile(filepath));
	}

}
