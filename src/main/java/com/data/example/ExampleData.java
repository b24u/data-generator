package com.data.example;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExampleData")
public class ExampleData {

	List<ExampleData> exampleList = new ArrayList<ExampleData>();

	private int id;
	private String name;
	private int value;

	public ExampleData() {
	}

	public ExampleData(int id, String name, int value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute(name = "value")
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ExampleData [id=" + id + ", name=" + name + ", value=" + value + "]";
	}

}
