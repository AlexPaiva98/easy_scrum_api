package br.ufrn.imd.finance.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

import java.util.HashSet;
import java.util.Set;

public class DevTeamDto extends AbstractDto {
    private String surname;
    private ProjectDto project;
    private Set<ParticipantDto> participants;

    public DevTeamDto() {
        super();
        this.setSurname("");
        this.setProject(new ProjectDto());
        this.setParticipants(new HashSet<ParticipantDto>());
    }

    public DevTeamDto(Long id, String surname, ProjectDto project, Set<ParticipantDto> participants) {
        super(id);
        this.setSurname(surname);
        this.setProject(project);
        this.setParticipants(participants);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public Set<ParticipantDto> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<ParticipantDto> participants) {
        this.participants = participants;
    }
}
