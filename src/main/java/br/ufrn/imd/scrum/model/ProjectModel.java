package br.ufrn.imd.scrum.model;

import br.ufrn.imd.scrum.model.enumerate.StatusProjectEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ProjectModel extends AbstractModel {
    @NotBlank
    private String name;
    @NotNull
    @Column
    private Date startDate;
    @NotNull
    private Date deadline;
    @NotNull
    private StatusProjectEnum status;
    @NotBlank
    private String productOwner;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    private ScrumMasterModel scrumMaster;
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(nullable = false)
    private ProductBacklogModel productBacklog;
    @OneToMany
    @JoinColumn(nullable = false)
    private Set<DevTeamModel> teams;
    private String logo;
    private String description;

    public ProjectModel() {
        this.setName("");
        this.setStartDate(new Date());
        this.setDeadline(new Date());
        this.setStatus(StatusProjectEnum.DEFAULT);
        this.setProductOwner("");
        this.setScrumMaster(new ScrumMasterModel());
        this.setProductBacklog(new ProductBacklogModel());
        this.setTeams(new HashSet<DevTeamModel>());
        this.setLogo("");
        this.setDescription("");
    }

    public ProjectModel(String name, Date startDate, Date deadline, StatusProjectEnum status, String productOwner, ScrumMasterModel scrumMaster, ProductBacklogModel productBacklog, Set<DevTeamModel> teams, String logo, String description) {
        this.setName(name);
        this.setStartDate(startDate);
        this.setDeadline(deadline);
        this.setStatus(status);
        this.setProductOwner(productOwner);
        this.setScrumMaster(scrumMaster);
        this.setProductBacklog(productBacklog);
        this.setTeams(teams);
        this.setLogo(logo);
        this.setDescription(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public StatusProjectEnum getStatus() {
        return status;
    }

    public void setStatus(StatusProjectEnum status) {
        this.status = status;
    }

    public String getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(String productOwner) {
        this.productOwner = productOwner;
    }

    public ScrumMasterModel getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMasterModel scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public ProductBacklogModel getProductBacklog() {
        return productBacklog;
    }

    public void setProductBacklog(ProductBacklogModel productBacklog) {
        this.productBacklog = productBacklog;
    }

    public Set<DevTeamModel> getTeams() {
        return teams;
    }

    public void setTeams(Set<DevTeamModel> teams) {
        this.teams = teams;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
