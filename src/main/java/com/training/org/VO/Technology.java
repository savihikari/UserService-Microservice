package com.training.org.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Technology {

	private Long technologyId;
	private String technologyVersion;
	private String technologyName;
}