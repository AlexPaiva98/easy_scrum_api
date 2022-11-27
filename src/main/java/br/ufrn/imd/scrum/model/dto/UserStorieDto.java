package br.ufrn.imd.scrum.model.dto;

import br.ufrn.imd.scrum.model.enumerate.StatusUserStorieEnum;
import br.ufrn.imd.springcrud.model.dto.AbstractDto;

public class UserStorieDto extends AbstractDto {
    private String title;
    private String acceptanceCriterion;
    private String description;
    private ProductBacklogDto productBacklog;
    private StatusUserStorieEnum status;

    public UserStorieDto() {
        super();
        this.setTitle("");
        this.setAcceptanceCriterion("");
        this.setDescription("");
        this.setProductBacklog(new ProductBacklogDto());
        this.setStatus(StatusUserStorieEnum.CREATED);
    }

    public UserStorieDto(Long id, String title, String acceptanceCriterion, String description, ProductBacklogDto productBacklog, StatusUserStorieEnum status) {
        super(id);
        this.setTitle(title);
        this.setAcceptanceCriterion(acceptanceCriterion);
        this.setDescription(description);;
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

    public ProductBacklogDto getProductBacklog() {
        return productBacklog;
    }

    public void setProductBacklog(ProductBacklogDto productBacklog) {
        this.productBacklog = productBacklog;
    }

    public StatusUserStorieEnum getStatus() {
        return status;
    }

    public void setStatus(StatusUserStorieEnum status) {
        this.status = status;
    }
}
