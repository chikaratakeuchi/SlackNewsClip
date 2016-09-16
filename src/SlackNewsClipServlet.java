

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SlackNewsClipServlet
 */
@WebServlet("/SlackNewsClipServlet")
public class SlackNewsClipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public SlackNewsClipServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String name = request.getParameter("user_name");
		String text = request.getParameter("text");

		/*
		CSVPrintWriter csvpw = new CSVPrintWriter("article_list.csv");
		csvpw.println(name, text);
		*/

		response.getWriter().write("user_name = " + name + "\n" + "text = " + text);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
