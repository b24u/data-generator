package com.data.XMLDataWriterTest;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.Before;
import org.junit.Test;

import com.data.example.ExampleData;
import com.data.generator.xml.XMLData;

public class XMLDataTest {

	List<ExampleData> listElements;
	String filePath;

	@Before
	public void setUp() {
		filePath = "F://testFile.xml";
	}

	@Test
	public void write() throws IOException, JAXBException {
		// given
		XMLData<ExampleData> writer = new XMLData<ExampleData>(filePath, ExampleData.class);
		listElements = new ArrayList<>();
		ExampleData data = new ExampleData(1, "name", 2);
		listElements.add(data);
		// when
		writer.write(data);
		// then

		assertTrue(true);
	}

}
