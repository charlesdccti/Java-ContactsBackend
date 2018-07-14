package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosApplication implements CommandLineRunner{
	@Autowired
    private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemosApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yy");
		contactRepository.save(new Contact("youin","salif",df.parse("26/12/1988"),"salifyouin@gmail.com", 55056961,"salif.jpg"));
		contactRepository.save(new Contact("youin","addico",df.parse("26/12/1987"),"addico@gmail.com", 55056961,"addico.jpg"));
		contactRepository.save(new Contact("youin","abdoul",df.parse("26/12/2014"),"abdoulyouin@gmail.com", 55056961,"salif.jpg"));
		contactRepository.save(new Contact("youin","salif",df.parse("26/12/1988"),"salifyouin@gmail.com", 55056961,"salif.jpg"));
		contactRepository.save(new Contact("youin","addico",df.parse("26/12/1987"),"addico@gmail.com", 55056961,"addico.jpg"));
		contactRepository.save(new Contact("youin","abdoul",df.parse("26/12/2014"),"abdoulyouin@gmail.com", 55056961,"salif.jpg"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
	}
}
