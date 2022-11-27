package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.scrum.model.enumerate.CategoryMeetingEnum;
import br.ufrn.imd.springcrud.model.dto.AbstractDto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MeetingDto extends AbstractDto {
    private String link;
    private Date datetime;
    private ProjectDto project;
    private CategoryMeetingEnum category;
    private Set<GuestDto> guests;
    private String description;

    public MeetingDto() {
        super();
        this.setLink("");
        this.setDatetime(new Date());
        this.setProject(new ProjectDto());
        this.setCategory(CategoryMeetingEnum.DEFAULT);
        this.setGuests(new HashSet<GuestDto>());
        this.setDescription("");
    }

    public MeetingDto(Long id, String link, Date datetime, ProjectDto project, CategoryMeetingEnum category, Set<GuestDto> guests, String description) {
        super(id);
        this.setLink(link);
        this.setDatetime(datetime);
        this.setProject(project);
        this.setCategory(category);
        this.setGuests(guests);
        this.setDescription(description);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public CategoryMeetingEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryMeetingEnum category) {
        this.category = category;
    }

    public Set<GuestDto> getGuests() {
        return guests;
    }

    public void setGuests(Set<GuestDto> guests) {
        this.guests = guests;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
