package com.esprit.examen.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.esprit.com.dto.ReglementDTO;

import com.esprit.examen.services.ReglementServiceImpl;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@RunWith(SpringJUnit4ClassRunner.class)
class ReglementJUNITTest {

	@Autowired
	ReglementServiceImpl r;	
	@Test
	@Order(1)
	 void all() {
	List<ReglementDTO> list = r.retrieveAllReglement2();
	Assertions.assertEquals(0, list.size());}
	
	
	@Test
	@Order(2)
	 void add() throws ParseException{
		
		ReglementDTO re = new ReglementDTO();
		ReglementDTO rg = r.addANDupdate2(re);
		Assertions.assertEquals(rg.getIdReglement(),rg.getIdReglement());
		
	}
	
	
	@Test
	@Order(3)
	 void update() throws ParseException{
		
		ReglementDTO re = new ReglementDTO();
		ReglementDTO rg = r.addANDupdate2(re);
		Assertions.assertEquals(rg.getIdReglement(),rg.getIdReglement());
		
	}
	
	@Test
	@Order(4)
	 void one() {
		ReglementDTO retrived = r.retrieveReglement2((long) 5);
	Assertions.assertEquals(1,retrived.getIdReglement());
	}
}
