package co.edu.sena.project2687351.model;

public class Product {
    private Integer Id_product;
    private String Product_name;
    private  Integer Product_value;

    private Integer category_id;
//constructs
    public Product() {
    }

    public Product(Integer id_product, String product_name, Integer product_value, Integer category_id) {
        Id_product = id_product;
        Product_name = product_name;
        Product_value = product_value;
        this.category_id = category_id;
    }
//getters and setters
    public Integer getId_product() {
        return Id_product;
    }

    public void setId_product(Integer id_product) {
        Id_product = id_product;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public Integer getProduct_value() {
        return Product_value;
    }

    public void setProduct_value(Integer product_value) {
        Product_value = product_value;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id_product=" + Id_product +
                ", Product_name='" + Product_name + '\'' +
                ", Product_value=" + Product_value +
                ", category_id=" + category_id +
                '}';
    }
}
