package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PromocaoDao;
import model.Promocao;

/**
 * Servlet implementation class PromocaoUpdate
 */
@WebServlet("/PromocaoUpdate")
public class PromocaoUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PromocaoUpdate() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int promocaoId = Integer.parseInt(request.getParameter("promocaoId"));
		Promocao promocao = PromocaoDao.findByPk(promocaoId);
		
		request.setAttribute("promocao", promocao);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("promocaoupdate.jsp");	
		requestDispatcher.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Promocao promocao=new Promocao();
		
	promocao.setId(Integer.parseInt(request.getParameter("id")));
	promocao.setNome(request.getParameter("nome"));
	promocao.setDescricao(request.getParameter("descricao"));
	promocao.setValor(Double.parseDouble(request.getParameter("valor")));
	
	PromocaoDao.update(promocao);

		PromocaoCreateFind promocaoCreateFind = new PromocaoCreateFind();
		promocaoCreateFind.doGet(request, response);
	}

}
