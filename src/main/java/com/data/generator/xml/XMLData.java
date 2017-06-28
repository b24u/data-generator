package com.data.generator.xml;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.data.example.ExampleData;
import com.data.example.ExampleDatabase;
import com.data.generator.IOData;

/**
 * Serializacja/Deserializacja do XML use JAXB
 * 
 * @author olszewskij
 *
 */
public class XMLData<T> extends IOData<T> {

	public void write(List<T> listData) {

		try {

			JAXBContext ctx = JAXBContext.newInstance(ExampleDatabase.class);
			Marshaller marshaller = ctx.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			for(int i=0; i<listData.size(); i ++){
			marshaller.marshal(listData.get(i), new File(getFilePath()));
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	

	public XMLData(String filePath, Class<T> dataInstance) {
		super(filePath, dataInstance);
	}

	


	/**
	 * To remove
	 */
	@Deprecated
	public void write1(T element) {
		try {
			System.out.println("dfds");
			JAXBContext ctx = JAXBContext.newInstance(element.getClass());
			Marshaller marshaller = ctx.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshaller.marshal(element, new File(getFilePath()));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<T> read() {

		return null;
	}



}
