package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.scrum.model.enumerate.StatusProjectEnum;
import br.ufrn.imd.springcrud.model.dto.AbstractDto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProjectDto extends AbstractDto {
    private String name;
    private Date startDate;
    private Date deadline;
    private StatusProjectEnum status;
    private ProductOwnerDto productOwner;
    private ScrumMasterDto scrumMaster;
    private ProductBacklogDto productBacklog;
    private Set<DevTeamDto> teams;
    private String logo;
    private String description;

    public ProjectDto() {
        this.setName("");
        this.setStartDate(new Date());
        this.setDeadline(new Date());
        this.setStatus(StatusProjectEnum.CREATED);
        this.setProductOwner(new ProductOwnerDto());
        this.setScrumMaster(new ScrumMasterDto());
        this.setProductBacklog(new ProductBacklogDto());
        this.setTeams(new HashSet<DevTeamDto>());
        this.setLogo("");
        this.setDescription("");
    }

    public ProjectDto(Long id, String name, Date startDate, Date deadline, StatusProjectEnum status, ProductOwnerDto productOwner, ScrumMasterDto scrumMaster, ProductBacklogDto productBacklog, Set<DevTeamDto> teams, String logo, String description) {
        super(id);
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

    public ProductOwnerDto getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(ProductOwnerDto productOwner) {
        this.productOwner = productOwner;
    }

    public ScrumMasterDto getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMasterDto scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public ProductBacklogDto getProductBacklog() {
        return productBacklog;
    }

    public void setProductBacklog(ProductBacklogDto productBacklog) {
        this.productBacklog = productBacklog;
    }

    public Set<DevTeamDto> getTeams() {
        return teams;
    }

    public void setTeams(Set<DevTeamDto> teams) {
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
