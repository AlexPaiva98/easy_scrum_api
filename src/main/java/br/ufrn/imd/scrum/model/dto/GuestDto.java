package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.scrum.model.enumerate.CategoryGuestEnum;
import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class GuestDto extends AbstractDto {
    private PersonDto person;
    private MeetingDto meeting;
    private CategoryGuestEnum category;

    public GuestDto() {
        super();
        this.setPerson(new PersonDto());
        this.setMeeting(new MeetingDto());
        this.setCategory(CategoryGuestEnum.DEFAULT);
    }

    public GuestDto(Long id, PersonDto person, MeetingDto meeting, CategoryGuestEnum category) {
        super(id);
        this.setPerson(person);
        this.setMeeting(meeting);
        this.setCategory(category);
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public MeetingDto getMeeting() {
        return meeting;
    }

    public void setMeeting(MeetingDto meeting) {
        this.meeting = meeting;
    }

    public CategoryGuestEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryGuestEnum category) {
        this.category = category;
    }
}
