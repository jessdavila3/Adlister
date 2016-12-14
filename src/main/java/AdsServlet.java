import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jessedavila on 12/14/16.
 */
@WebServlet(name = "AdsServlet", urlPatterns = "/ads/index")
public class
AdsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // do later if I do it at all
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads adsList = DaoFactory.getAdsDao();
        List<Ad> ads = adsList.all();

        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
        // get list of ads from ListAdsDAO
    }
}
