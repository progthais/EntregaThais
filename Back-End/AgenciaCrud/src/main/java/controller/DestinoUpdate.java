package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDao;
import model.Destino;

/**
 * Servlet implementation class DestinoUpdate
 */
@WebServlet("/Update")
public class DestinoUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinoUpdate() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int destinoId = Integer.parseInt(request.getParameter("destinoId"));
		Destino destino = DestinoDao.findByPk(destinoId);
		
		request.setAttribute("destino", destino);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");	
		requestDispatcher.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Destino destino=new Destino();
		
		destino.setId(Integer.parseInt(request.getParameter("id")));
		destino.setNome(request.getParameter("nome"));
		destino.setPais(request.getParameter("pais"));
		destino.setCidade(request.getParameter("cidade"));
		destino.setEstado(request.getParameter("estado"));
		
		DestinoDao.update(destino);

		DestinoCreateFind destinoCreateFind = new DestinoCreateFind();
		destinoCreateFind.doGet(request, response);
	}

}
