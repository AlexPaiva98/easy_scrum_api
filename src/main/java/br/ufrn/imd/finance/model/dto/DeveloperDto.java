package br.ufrn.imd.finance.model.dto;

public class DeveloperDto extends PersonDto {
    public DeveloperDto() {
        super();
    }

    public DeveloperDto(Long id, String name, String nickname, String email, String password) {
        super(id, name, nickname, email, password);
    }
}
