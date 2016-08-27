package br.senai.sp.informatica.contato.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.contato.modelo.Contato;
import br.senai.sp.informatica.contato.modelo.Endereco;
import br.senai.sp.informatica.contato.modelo.Sexo;

@WebServlet(urlPatterns={"/contatoservlet"})
public class ContatoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
			//System.out.println("PASSOU AQUI");
			PrintWriter out = resp.getWriter();
			//out.write("<h1>Hello World</h1>");

			Contato contato = new Contato();
			contato.setNome(req.getParameter("nome"));
			contato.setEmail(req.getParameter("email"));
			contato.setSexo
				(Sexo.valueOf(req.getParameter("sexo")));
			Endereco endereco = new Endereco();
			endereco.setLogradouro
			(req.getParameter("endereco.logradouro"));
			endereco.setNumero
				(Integer.parseInt
						(req.getParameter("endereco.numero")));
			contato.setEndereco(endereco);
			out.write("<h2>Nome:"+contato.getNome()+"</h2>");
			// "pendurando" o objeto na requisição
			req.setAttribute("contato", contato);
			// criando um "Despachante"
			RequestDispatcher despachante = 
					req.getRequestDispatcher("/resultado.jsp");
			// despacha a request
			despachante.forward(req, resp);
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
}
