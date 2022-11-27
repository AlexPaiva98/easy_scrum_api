package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class PersonDto extends AbstractDto {
    private String name;
    private String nickname;
    private String email;
    private String password;

    public PersonDto() {
        super();
        this.setName("");
        this.setNickname("");
        this.setEmail("");
        this.setPassword("");
    }

    public PersonDto(Long id, String name, String nickname, String email, String password) {
        super(id);
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
