package br.ufrn.imd.scrum.model;

import br.ufrn.imd.scrum.model.enumerate.StatusUserStorieEnum;
import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_storie")
public class UserStorieModel extends AbstractModel {
    @NotBlank
    private String title;
    @NotBlank
    private String acceptanceCriterion;
    @NotBlank
    private String description;
    @ManyToOne
    @JoinColumn(name = "product_backlog_id", nullable = false)
    private ProductBacklogModel productBacklog;
    @NotNull
    private StatusUserStorieEnum status;

    public UserStorieModel() {
        this.setTitle("");
        this.setAcceptanceCriterion("");
        this.setDescription("");
        this.setProductBacklog(new ProductBacklogModel());
        this.setStatus(StatusUserStorieEnum.DEFAULT);
    }

    public UserStorieModel(String title, String acceptanceCriterion, String description, ProductBacklogModel productBacklog, StatusUserStorieEnum status) {
        this.setTitle(title);
        this.setAcceptanceCriterion(acceptanceCriterion);
        this.setDescription(description);
        this.setProductBacklog(productBacklog);
        this.setStatus(status);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAcceptanceCriterion() {
        return acceptanceCriterion;
    }

    public void setAcceptanceCriterion(String acceptanceCriterion) {
        this.acceptanceCriterion = acceptanceCriterion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductBacklogModel getProductBacklog() {
        return productBacklog;
    }

    public void setProductBacklog(ProductBacklogModel productBacklog) {
        this.productBacklog = productBacklog;
    }

    public StatusUserStorieEnum getStatus() {
        return status;
    }

    public void setStatus(StatusUserStorieEnum status) {
        this.status = status;
    }
}
