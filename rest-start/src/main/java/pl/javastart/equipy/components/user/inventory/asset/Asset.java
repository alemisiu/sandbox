package pl.javastart.equipy.components.user.inventory.asset;


import pl.javastart.equipy.components.user.inventory.category.Category;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @Column(unique = true)
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asset asset = (Asset) o;
        return Objects.equals(id, asset.id) &&
                Objects.equals(name, asset.name) &&
                Objects.equals(description, asset.description) &&
                Objects.equals(serialNumber, asset.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, serialNumber);
    }
}