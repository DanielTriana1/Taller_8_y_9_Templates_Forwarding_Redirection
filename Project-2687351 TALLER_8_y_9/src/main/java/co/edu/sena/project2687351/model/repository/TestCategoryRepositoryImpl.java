package co.edu.sena.project2687351.model.repository;

import co.edu.sena.project2687351.model.Category;

import java.sql.SQLException;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Category> repository= new CategoryRepositoryImpl();

        System.out.println("========== SaveObj Insert =========");
        Category CategoryInsert = new Category();
        CategoryInsert.setCategory_name("licor");
        repository.saveObj(CategoryInsert);
        CategoryInsert.setCategory_name("jugos");
        repository.saveObj(CategoryInsert);

        System.out.println("========= listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdOBj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Category CategoryUpdate = new Category();
        CategoryUpdate.setCategory_id(2);
        CategoryUpdate.setCategory_name("jugos");
        repository.saveObj(CategoryInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}