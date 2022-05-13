package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * no post:
	*você pode colocar os parametros que serão enviados na url.
	*depois do local, você pode colocar /novaEmpresa?nome=Alura
	*outro parametro? use && /novaEmpresa?nome=Alura&&cnpj=123
	*o retorno é sempre string
	
	*doPost obriga só Post, tinha o service antes aqui mas não há problema, pois recebe os mesmos parametros de service
	*os métodos service e doPost tem a mesma assinatura (mesmo retorno, mesmos parâmetros, mesmas exceções)
	*service basicamente lida com requisições do tipo get e do tipo post
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		System.out.println("Cadastrando empresa");
		String nomeEmpresa = request.getParameter("nome");
		String fundacaoEmpresa = request.getParameter("data");
		
		//catch and reflow
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(fundacaoEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
        banco.adiciona(empresa);
        
        //correção, antes estava o de baixo
        request.setAttribute("empresa", empresa.getNome());
        response.sendRedirect("listaEmpresas");

        //chamar o JPS
//        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		//o RequestDispatcher delega o fluxo da requisição para qualquer recurso recurso acessível pela URL (uma página HTML, CSS, JavaScript, Servlet ou JSP).
//        request.setAttribute("empresa", empresa.getNome());
//        rd.forward(request, response);
    
		
		
//		PrintWriter out = response.getWriter();
//		
		
		
	}

}
