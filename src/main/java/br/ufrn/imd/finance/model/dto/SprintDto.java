package br.ufrn.imd.finance.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SprintDto extends AbstractDto {
    private Integer duration;
    private Date startDate;
    private Date endDate;
    private Set<ActivityDto> activities;

    public SprintDto(Integer duration, Date startDate, Date endDate, Set<ActivityDto> activities) {
        super();
        this.setDuration(7);
        this.setStartDate(new Date());
        /** TODO: add 7 days */
        this.setEndDate(new Date());
        this.setActivities(new HashSet<ActivityDto>());
    }

    public SprintDto(Long id, Integer duration, Date startDate, Date endDate, Set<ActivityDto> activities) {
        super(id);
        this.setDuration(duration);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setActivities(activities);
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<ActivityDto> getActivities() {
        return activities;
    }

    public void setActivities(Set<ActivityDto> activities) {
        this.activities = activities;
    }
}
