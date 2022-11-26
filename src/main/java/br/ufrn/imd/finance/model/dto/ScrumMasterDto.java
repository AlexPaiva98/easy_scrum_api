package br.ufrn.imd.finance.model.dto;

public class ScrumMasterDto extends PersonDto {
    public ScrumMasterDto() {
        super();
    }

    public ScrumMasterDto(Long id, String name, String nickname, String email, String password) {
        super(id, name, nickname, email, password);
    }
}
