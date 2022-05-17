package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/entrada") //igual a entrada
public class MonitoramentoFilter implements Filter{
	//Filter e Interceptor aparecem em alguns frameworks como a mesma coisa. NÃO É O CASO DO SPRING
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}
	
	@Override
	public void destroy() {
	
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoramentoFilter");
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
				
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("tempo de execucao da acao " + acao + " -> " + (depois - antes));
	}

	
}
