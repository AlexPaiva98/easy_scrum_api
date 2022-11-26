package br.ufrn.imd.finance.model.dto;

import br.ufrn.imd.finance.model.enumerate.StatusParticipantEnum;
import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class ParticipantDto extends AbstractDto {
    private DeveloperDto developer;
    private StatusParticipantEnum status;

    public ParticipantDto() {
        this.setDeveloper(new DeveloperDto());
        this.setStatus(StatusParticipantEnum.DEFAULT);
    }

    public ParticipantDto(Long id, DeveloperDto developer, StatusParticipantEnum status) {
        super(id);
        this.setDeveloper(developer);
        this.setStatus(status);
    }

    public DeveloperDto getDeveloper() {
        return developer;
    }

    public void setDeveloper(DeveloperDto developer) {
        this.developer = developer;
    }

    public StatusParticipantEnum getStatus() {
        return status;
    }

    public void setStatus(StatusParticipantEnum status) {
        this.status = status;
    }
}
