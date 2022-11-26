package br.ufrn.imd.finance.model;

import br.ufrn.imd.springcrud.model.AbstractModel;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class ProductBacklogModel extends AbstractModel {
    @OneToMany
    @JoinColumn(name = "storie_id")
    private Set<UserStorieModel> stories;

    public ProductBacklogModel() {
        this.setStories(new HashSet<UserStorieModel>());
    }

    public ProductBacklogModel(Set<UserStorieModel> stories) {
        this.setStories(stories);
    }

    public Set<UserStorieModel> getStories() {
        return stories;
    }

    public void setStories(Set<UserStorieModel> stories) {
        this.stories = stories;
    }
}
