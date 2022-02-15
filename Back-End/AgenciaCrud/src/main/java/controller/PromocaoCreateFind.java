package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PromocaoDao;
import model.Promocao;

/**
 * Servlet implementation class PromocaoCreateFind
 */
@WebServlet("/PromocaoCreateFind")
public class PromocaoCreateFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PromocaoCreateFind() {
        super();
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
String pesquisa = request.getParameter("pesquisa");
			
if(pesquisa == null) {
pesquisa="";
				
	}

List<Promocao> promocoes = PromocaoDao.find(pesquisa);


request.setAttribute("promocoes", promocoes);
RequestDispatcher requestDispatcher= request.getRequestDispatcher("promocaolista.jsp");
requestDispatcher.forward(request, response);
	


   }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Promocao promocao=new Promocao();
		promocao.setNome(request.getParameter("nome"));
		promocao.setDescricao(request.getParameter("descricao"));
		promocao.setValor(Double.parseDouble(request.getParameter("valor")));	
		
		PromocaoDao.create(promocao);

		doGet(request, response);
		
	}

}
