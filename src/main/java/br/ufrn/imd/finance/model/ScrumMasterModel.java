package br.ufrn.imd.finance.model;

import javax.persistence.Entity;

@Entity
public class ScrumMasterModel extends PersonModel {
    public ScrumMasterModel() {
        super();
    }

    public ScrumMasterModel(String name, String nickname, String email, String password) {
        super(name, nickname, email, password);
    }
}
