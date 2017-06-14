package com.data.XMLDataWriterTest;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.Before;
import org.junit.Test;

import com.data.generator.xml.XMLData;

public class XMLDataWriterTest {

	List<String> listElements;
	String filePath;

	@Before
	public void setUp() {
		filePath = "/data-generator/src/main/resources/test/testFile.xml";
	}

	@Test
	public void test() throws IOException, JAXBException {
		// given
		XMLData<String> writer = new XMLData<>(filePath);

		// when
		writer.write(listElements);
		// then

		assertTrue(true);
	}

}
