package co.edu.sena.project2687351.model.repository;

import co.edu.sena.project2687351.model.Category;
import co.edu.sena.project2687351.model.Product;

import java.sql.SQLException;

public class TestProductRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Product> repository= new ProductRepositoyImpl();

        System.out.println("========== SaveObj Insert =========");
        Product ProductInsert = new Product();
        ProductInsert.setProduct_name("carlos");
        ProductInsert.setProduct_value(1231);
        ProductInsert.setCategory_id(1);
        repository.saveObj(ProductInsert);
        ProductInsert.setProduct_name("roman");
        ProductInsert.setProduct_value(8462);
        ProductInsert.setCategory_id(3);
        repository.saveObj(ProductInsert);

        System.out.println("========= listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdOBj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Product ProductUpdate = new Product();
        ProductUpdate.setId_product(2);
        ProductUpdate.setProduct_name("diego");
        repository.saveObj(ProductInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}