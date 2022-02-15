package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDao;
import model.Destino;

/**
 * Servlet implementation class DestinoCreateFind
 */
@WebServlet("/CreateFind")
public class DestinoCreateFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DestinoCreateFind() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String pesquisa = request.getParameter("pesquisa");
	
	if(pesquisa == null) {
		pesquisa="";
		
	}
	
	List<Destino> destinos = DestinoDao.find(pesquisa);

	
	request.setAttribute("destinos", destinos);
	RequestDispatcher requestDispatcher= request.getRequestDispatcher("lista.jsp");
	requestDispatcher.forward(request, response);
		

	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Destino destino=new Destino();
		destino.setNome(request.getParameter("nome"));
		destino.setPais(request.getParameter("pais"));
		destino.setCidade(request.getParameter("cidade"));
		destino.setEstado(request.getParameter("estado"));
		
		DestinoDao.create(destino);

		doGet(request, response);
		
	}

}
