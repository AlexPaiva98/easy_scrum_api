package br.ufrn.imd.scrum.service;

import br.ufrn.imd.scrum.model.PersonModel;
import br.ufrn.imd.scrum.model.dto.PersonDto;
import br.ufrn.imd.scrum.repository.PersonRepository;
import br.ufrn.imd.springcrud.exception.ValidationException;
import br.ufrn.imd.springcrud.helper.ExceptionHelper;
import br.ufrn.imd.springcrud.repository.GenericRepository;
import br.ufrn.imd.springcrud.service.GenericService;
import br.ufrn.imd.springcrud.util.ValidationTypeUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Properties;

@Service
public class PersonService extends GenericService<PersonModel, PersonDto> {
    private PersonRepository personRepository;

    @Override
    protected GenericRepository<PersonModel> getRepository() {
        return this.personRepository;
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonModel login(String name, String password) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();

        PersonModel p = this.personRepository.findByNickname(name);

        if(p == null) {
            exceptionHelper.add("Nome de usuario incorreto.");
        } else if(!p.getPassword().equals(password)){
            exceptionHelper.add("Senha incorreta.");
        }

        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }

        return p;
    }

    public PersonModel register(String name, String password, String email) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();

        PersonModel p = this.personRepository.findByNickname(name);

        if(p != null) {
            exceptionHelper.add("Este nome de usuario ja esta sendo utilizado");
        }

        p = this.personRepository.findByEmail(email);

        if(p != null) {
            exceptionHelper.add("Este email ja esta sendo utilizado");
        }

        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }

        p = new PersonModel();
        p.setEmail(email);
        p.setName(name);
        p.setNickname(name);
        p.setPassword(password);

        p = this.personRepository.save(p);

        return p;
    }

    public void sendCode(String to, String code) throws ValidationException {
        /*
        String from = "easyscrumcode@gmail.com";
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, "coderecoveryscrum22");
            }
        });
        session.setDebug(true);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Código para recuperação de senha no EasyScrum.");
            message.setText("Seu código é: " + code + ". Basta inseri-lo no app para restaurar sua senha.");
            System.out.println("sending...");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        */
    }

    public PersonModel passwordChange(String email, String newPassword) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        PersonModel p = this.personRepository.findByEmail(email);

        if(p == null) {
            exceptionHelper.add("Nome de usuario incorreto.");
        }

        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }

        p.setPassword(newPassword);

        this.personRepository.save(p);
        return p;
    }

    public PersonDto findByNickname(String nickname) {
        PersonDto person = this.convertToDto(this.personRepository.findByNickname(nickname));
        person.setPassword("");
        return person;
    }

    @Override
    protected void validateDto(ValidationTypeUtil validationTypeUtil, PersonDto dto) throws ValidationException {
        ExceptionHelper exceptionHelper = new ExceptionHelper();
        /** Check name */
        if (dto.getName().isEmpty()) {
            exceptionHelper.add("Nome invalido");
        }
        if (dto.getEmail().isEmpty()) {
            exceptionHelper.add("Email invalido");
        }
        if (dto.getPassword().isEmpty()) {
            exceptionHelper.add("Senha invalida");
        }
        if (dto.getNickname().isEmpty()) {
            exceptionHelper.add("Nome invalido");
        }
        /** Check error */
        if (!exceptionHelper.isEmpty()) {
            throw new ValidationException(exceptionHelper.getMessage());
        }
    }
}
