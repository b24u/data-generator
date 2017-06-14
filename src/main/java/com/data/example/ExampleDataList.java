package com.data.example;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

@XmlElements(@XmlElement(name = "ExampleDataList"))
public class ExampleDataList {

	List<ExampleData> list;

	public List<ExampleData> getList() {
		return list;
	}

	public void setList(List<ExampleData> list) {
		this.list = list;
	}
}
