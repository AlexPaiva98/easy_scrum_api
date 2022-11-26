package br.ufrn.imd.finance.model;

import javax.persistence.Entity;

@Entity
public class DeveloperModel extends PersonModel {
    public DeveloperModel() {
        super();
    }

    public DeveloperModel(String name, String nickname, String email, String password) {
        super(name, nickname, email, password);
    }
}
