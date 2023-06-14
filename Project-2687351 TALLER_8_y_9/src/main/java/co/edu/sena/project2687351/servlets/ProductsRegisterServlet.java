package co.edu.sena.project2687351.servlets;

import co.edu.sena.project2687351.model.Product;
import co.edu.sena.project2687351.model.repository.ProductRepositoyImpl;
import co.edu.sena.project2687351.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/registerProduct")
public class ProductsRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String Product_name = request.getParameter("Product_name");
        Integer Product_value = Integer.valueOf(request.getParameter("Product_value"));
        Integer category_id = Integer.valueOf(request.getParameter("category_id"));
        //  fill it up in a User Bean
        Product product = new Product();
        product.setProduct_name(Product_name);
        product.setProduct_value(Product_value);
        product.setCategory_id(category_id);
        // call repository layer and save the user object to DB
        Repository<Product> repository = new ProductRepositoyImpl();
        int rows = 0;
        try {
            repository.saveObj(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //todo prepare message for user about success
        //String message = null

        if(rows==0){
            System.out.println("Ocurrio un error");
        }else{
            System.out.println("Registro exitoso");
        }

        // todo write the message back to the page in client browser
    }
}
