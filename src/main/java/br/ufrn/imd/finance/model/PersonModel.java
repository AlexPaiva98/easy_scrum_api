package br.ufrn.imd.finance.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.ufrn.imd.springcrud.model.AbstractModel;

@Entity
public class PersonModel extends AbstractModel {
    @NotBlank
    private String name;
    @NotBlank
    @Column(unique = true)
    private String nickname;
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    @Size(min = 8)
    private String password;

    public PersonModel() {
        this.setName("");
        this.setNickname("");
        this.setEmail("");
        this.setPassword("");
    }

    public PersonModel(String name, String nickname, String email, String password) {
        this.setName(name);
        this.setNickname(nickname);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
