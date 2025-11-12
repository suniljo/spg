package com.spg.boot.rest.models;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Book {
	private Integer bookId;
	private String bookTitle;
	private Float bookPrice;
}
