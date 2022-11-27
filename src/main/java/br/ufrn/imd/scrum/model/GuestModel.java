package br.ufrn.imd.scrum.model;

import br.ufrn.imd.scrum.model.enumerate.CategoryGuestEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "guest")
public class GuestModel extends AbstractModel {
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private PersonModel person;
    @ManyToOne
    @JoinColumn(name = "meeting_id", nullable = false)
    private MeetingModel meeting;
    @NotNull
    private CategoryGuestEnum category;

    public GuestModel() {
        this.setPerson(new PersonModel());
        this.setMeeting(new MeetingModel());
        this.setCategory(CategoryGuestEnum.DEFAULT);
    }

    public GuestModel(PersonModel person, MeetingModel meeting, CategoryGuestEnum category) {
        this.setPerson(person);
        this.setMeeting(meeting);
        this.setCategory(category);
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }

    public MeetingModel getMeeting() {
        return meeting;
    }

    public void setMeeting(MeetingModel meeting) {
        this.meeting = meeting;
    }

    public CategoryGuestEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryGuestEnum category) {
        this.category = category;
    }
}
