package com.police.fir;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.police.fir.Entity.CitizenFirSearchBean;
import com.police.fir.Entity.FIRSearchBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest
class FIRApplicationTests {

	@Test
	void contextLoads() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			FIRSearchBean firSearchBean = objectMapper.readValue(new File("data/data.json"), FIRSearchBean.class);
			System.out.println("====----"+firSearchBean.getCitizenFirSearchBean().getDistrictId());
			for(CitizenFirSearchBean bean : firSearchBean.getList()){
				System.out.println("=="+bean.getDistrictId());

				System.out.println("=="+bean.getFirNumDisplay());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
