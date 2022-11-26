package br.ufrn.imd.finance.model;

import br.ufrn.imd.finance.model.enumerate.CategoryMeetingEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MeetingModel extends AbstractModel {
    @NotBlank
    private String link;
    @NotNull
    private Date datetime;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private ProjectModel project;
    @NotNull
    private CategoryMeetingEnum category;
    @OneToMany
    @JoinColumn(name = "guest_id")
    private Set<GuestModel> guests;
    private String description;

    public MeetingModel() {
        this.setLink("");
        this.setDatetime(new Date());
        this.setProject(new ProjectModel());
        this.setCategory(CategoryMeetingEnum.DEFAULT);
        this.setGuests(new HashSet<GuestModel>());
        this.setDescription("");
    }

    public MeetingModel(String link, Date datetime, ProjectModel project, CategoryMeetingEnum category, Set<GuestModel> guests, String description) {
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

    public ProjectModel getProject() {
        return project;
    }

    public void setProject(ProjectModel project) {
        this.project = project;
    }

    public CategoryMeetingEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryMeetingEnum category) {
        this.category = category;
    }

    public Set<GuestModel> getGuests() {
        return guests;
    }

    public void setGuests(Set<GuestModel> guests) {
        this.guests = guests;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
