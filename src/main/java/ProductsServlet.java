import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "productsServlet", urlPatterns = "/products")
public class ProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product1", 1, 100f));
        productList.add(new Product("Product2", 2, 200f));
        productList.add(new Product("Product3", 3, 300f));
        productList.add(new Product("Product4", 4, 400f));
        productList.add(new Product("Product5", 5, 500f));
        productList.add(new Product("Product6", 6, 600f));
        productList.add(new Product("Product7", 7, 700f));
        productList.add(new Product("Product8", 8, 800f));
        productList.add(new Product("Product9", 9, 900f));
        productList.add(new Product("Product10", 10, 1000f));

        for (Product p : productList) {
            resp.getWriter().println(p);
        }
    }
}
