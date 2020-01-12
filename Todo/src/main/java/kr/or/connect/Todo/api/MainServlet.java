package kr.or.connect.Todo.api;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/todo")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		TodoDao dao = new TodoDao();
		
		List<TodoDto> todolist = dao.getTodos("TODO");
		List<TodoDto> doinglist = dao.getTodos("DOING");
		List<TodoDto> donelist = dao.getTodos("DONE");
		
		request.setAttribute("l1", todolist);
		request.setAttribute("l2", doinglist);
		request.setAttribute("l3", donelist);
				
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/main.jsp");
        requestDispatcher.forward(request, response);
        
        
		/*
		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(list);
		
		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
		*/
		/*
		for(TodoDto todo:list) {
			System.out.println(todo);
		}*/
	}

}
