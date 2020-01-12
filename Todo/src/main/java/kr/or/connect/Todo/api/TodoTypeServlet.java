package kr.or.connect.Todo.api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodoTypeServlet
 */
@WebServlet("/type")
public class TodoTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		
		long id = Long.parseLong(request.getHeader("id"));
		String type = request.getHeader("type");
		int updateCount;
		
		System.out.println(type);
		
		if(type.equals("TODO")) {
			TodoDto dto = new TodoDto(id,null,null,null,null,"DOING");
			TodoDao dao = new TodoDao();
			
			updateCount = dao.updateTodo(dto);
			System.out.println("success");
		}
		else if(type.equals("DOING")){
			TodoDto dto = new TodoDto(id,null,null,null,null,"DONE");
			TodoDao dao = new TodoDao();
			
			updateCount = dao.updateTodo(dto);
			System.out.println("success");
		}
		else
			updateCount = 0;
		
		System.out.println(updateCount);
		
		response.sendRedirect("/todo/todo");
        
	}

	
}
