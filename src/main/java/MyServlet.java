

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	PrintWriter out=response.getWriter();
	
	String m1=request.getParameter("n1");
	String m2=request.getParameter("n2");
	int a=Integer.parseInt(m1);
	int b=Integer.parseInt(m2);
	int c=a+b;
	if(c>30)
	{
		response.sendRedirect("welcome.jsp");
	}
	else
	{
		response.sendRedirect("index.html");
	}
	
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
