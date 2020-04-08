package lab11;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VisitorFilter implements Filter {
	private int hitCounter = 0;
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.getServletContext().setAttribute("hitCounter", ++hitCounter);
		chain.doFilter(request, response);
	}
}
