package br.ufrn.imd.finance.model;

import br.ufrn.imd.finance.model.enumerate.StatusProjectEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class ProjectModel extends AbstractModel {
    @NotBlank
    private String name;
    @NotNull
    @Column(name = "start_date")
    private Date startDate;
    @NotNull
    private Date deadline;
    @NotNull
    private StatusProjectEnum status;
    @ManyToOne
    @JoinColumn(name = "product_owner_id", nullable = false)
    private ProductOwnerModel productOwner;
    @ManyToOne
    @JoinColumn(name = "scrum_master_id", nullable = false)
    private ScrumMasterModel scrumMaster;
    @OneToOne
    @JoinColumn(name = "product_backlog_id", nullable = false)
    private ProductBacklogModel productBacklog;
    private String logo;
    private String description;

    public ProjectModel() {
        this.setName("");
        this.setStartDate(new Date());
        this.setDeadline(new Date());
        this.setStatus(StatusProjectEnum.DEFAULT);
        this.setProductOwner(new ProductOwnerModel());
        this.setScrumMaster(new ScrumMasterModel());
        this.setProductBacklog(new ProductBacklogModel());
        this.setLogo("");
        this.setDescription("");
    }

    public ProjectModel(String name, Date startDate, Date deadline, StatusProjectEnum status, ProductOwnerModel productOwner, ScrumMasterModel scrumMaster, ProductBacklogModel productBacklog, String logo, String description) {
        this.setName(name);
        this.setStartDate(startDate);
        this.setDeadline(deadline);
        this.setStatus(status);
        this.setProductOwner(productOwner);
        this.setScrumMaster(scrumMaster);
        this.setProductBacklog(productBacklog);
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

    public ProductOwnerModel getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(ProductOwnerModel productOwner) {
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
