package com.data.XMLDataWriterTest;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;


import org.junit.Before;
import org.junit.Test;

import com.data.example.ExampleData;
import com.data.example.ExampleDatabase;
import com.data.generator.xml.XMLData;

public class XMLDataTest {

	List<ExampleData> listElements;
	String filePath1;
	String filePath2;
	@Before
	public void setUp() {
		filePath1 = "F://testFile.xml";
		filePath2 = "F://testFileList.xml";
	}

	@Test
	public void writeElement() throws IOException, JAXBException {
		// given
		XMLData<ExampleData> writer = new XMLData<ExampleData>(filePath1, ExampleData.class);
		
		listElements = new ArrayList<>();
		ExampleData data1 = new ExampleData(1, "tosia", 2);
		listElements.add(data1);
				
		// when
		writer.write1(data1);
		// then

		assertTrue(true);
	}
	@Test
	public void writeList() throws IOException, JAXBException {
		// given
		XMLData<ExampleDatabase> writerList = new XMLData<ExampleDatabase>(filePath2, ExampleDatabase.class);
		
//		List<ExampleData> listOfElements = new ArrayList<>();
		ExampleDatabase listOfElements = new ExampleDatabase();
		listOfElements.addToList(new ExampleData(1, "Romek", 2));
		
		listOfElements.addToList(new ExampleData(2, "Czesiek", 24));
		
		listOfElements.addToList( new ExampleData(3, "Bogdan", 3));
		

		ExampleDatabase listOfElements2 = new ExampleDatabase();
		listOfElements2.addToList(new ExampleData(1, "Romek", 2));
		
		listOfElements2.addToList(new ExampleData(2, "Czesiek", 24));
		
		listOfElements2.addToList( new ExampleData(3, "Bogdan", 3));
		
//		List<ExampleDatabase> listData= new ArrayList<>();
		
		
//		listData.add(new E());
//		listData.add(new ExampleDatabase());
//		listData.add(new ExampleDatabase());
//		listData.add(new ExampleDatabase());
//		ExampleDatabase test = new ExampleDatabase(3,"Bogdan",3);
//		listData.add(test);
//		ExampleDatabase test2 = new ExampleDatabase(4,"Adam",5);
//		listData.add(test2);
		
		List<ExampleDatabase> exampleList = new ArrayList<>();
		exampleList.add(listOfElements);
		exampleList.add(listOfElements2);
		// when
		writerList.write(exampleList);
		// then

		assertTrue(true);
	}

}
