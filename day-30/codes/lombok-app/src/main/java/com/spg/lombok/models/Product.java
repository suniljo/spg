package com.spg.lombok.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/*
@Getter
@Setter
@ToString
@EqualsAndHashCode
*/
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
	private Integer productId;
	private String productName;
	private Float productPrice;
}
