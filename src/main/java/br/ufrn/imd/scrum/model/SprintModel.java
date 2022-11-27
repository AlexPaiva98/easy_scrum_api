package br.ufrn.imd.scrum.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sprint")
public class SprintModel extends AbstractModel {
    @NotNull
    @Size(min = 7)
    private Integer duration;
    @NotNull
    @Column(name = "start_date")
    private Date startDate;
    @NotNull
    @Column(name = "end_date")
    private Date endDate;
    @ManyToMany
    @JoinTable(name = "sprint_activity", joinColumns = {@JoinColumn(name = "activity_id") }, inverseJoinColumns = { @JoinColumn(name = "sprint_id") })
    private Set<ActivityModel> activities;

    public SprintModel() {
        this.setDuration(7);
        this.setStartDate(new Date());
        /** TODO: add 7 days */
        this.setEndDate(new Date());
        this.setActivities(new HashSet<ActivityModel>());
    }

    public SprintModel(Integer duration, Date startDate, Date endDate, Set<ActivityModel> activities) {
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

    public Set<ActivityModel> getActivities() {
        return activities;
    }

    public void setActivities(Set<ActivityModel> activities) {
        this.activities = activities;
    }
}
