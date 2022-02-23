package tn.esponline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esponline.entities.Personne;
import tn.esponline.services.IUserService;

//@RunWith(SpringRunner.class)
@SpringBootTest
 class ApplicationTests {

	@Autowired
	IUserService userserv;
	private static final Logger l=LogManager.getLogger(ApplicationTests.class);

	@Test
	 void contextLoads() throws ParseException {
		Personne p =new Personne();
		p.setNom("ahmed");
		SimpleDateFormat df= new SimpleDateFormat("dd-mm-yyyy");
		Date date= df.parse("22-05-2015");
		l.info(userserv.addPersonne(p).getNom());
		Assertions.assertEquals(userserv.addPersonne(p).getNom(), "amed");
	}

}
