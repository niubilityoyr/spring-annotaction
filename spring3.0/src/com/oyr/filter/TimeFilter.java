package com.oyr.filter;

import com.sun.javafx.binding.StringFormatter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/14.
 */
@WebFilter(filterName = "timeFilter", urlPatterns = "/*")
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(format.format(date));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }

}
