package com.data.generator.xml;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.data.generator.IOData;

/**
 * Serializacja/Deserializacja do XML use JAXB
 * 
 * @author olszewskij
 *
 */
public class XMLData<T> extends IOData<T> {

	public XMLData(String filePath) {
		super(filePath);

	}

	@Override
	public void write(List<T> listElements) {

		try {
			new File("/data-generator/src/main/resources/test/test.xml");

			JAXBContext ctx = JAXBContext.newInstance();
			Marshaller marshaller = ctx.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshaller.marshal(listElements, new File("/data-generator/src/main/resources/test/test.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<T> read() {

		return null;
	}

}
