package com.digital.utils.generater;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class DocReferanceGenerater {

	
	private String Docter_ref_prefix="RHBD-";
	
	public String Generate() {
		UUID uuid= UUID.randomUUID();
		return Docter_ref_prefix + uuid.toString();
	}
	
	
	
}
