package br.ufrn.imd.finance.model.dto;

import br.ufrn.imd.springcrud.model.dto.AbstractDto;

import java.util.HashSet;
import java.util.Set;

public class ProductBacklogDto extends AbstractDto {
    private Set<UserStorieDto> stories;

    public ProductBacklogDto() {
        super();
        this.setStories(new HashSet<UserStorieDto>());
    }

    public ProductBacklogDto(Long id, Set<UserStorieDto> stories) {
        super(id);
        this.setStories(stories);
    }

    public Set<UserStorieDto> getStories() {
        return stories;
    }

    public void setStories(Set<UserStorieDto> stories) {
        this.stories = stories;
    }
}
