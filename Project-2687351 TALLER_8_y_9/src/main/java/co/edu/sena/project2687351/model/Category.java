package co.edu.sena.project2687351.model;

public class Category {
    private Integer category_id;
    private String category_name;
    //constructs
    public Category() {
    }
    public Category(Integer category_id, String category_name) {
        this.category_id = category_id;
        this.category_name = category_name;
    }

    //getters and setters
    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    //toString
    @Override
    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                '}';
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;

    }
}
