package ua.wizard.promo.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 29.11.13
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    public Filter[] getServletFilters() {
        return new Filter[] { new HiddenHttpMethodFilter(), characterEncodingFilter("UTF-8")/*, new OpenEntityManagerInViewFilter(), new DelegatingFilterProxy("springSecurityFilterChain")*/};
    }

    private CharacterEncodingFilter characterEncodingFilter(String s) {
        CharacterEncodingFilter res = new CharacterEncodingFilter();
        res.setEncoding("UTF-8");
        res.setForceEncoding(true);
        return res;
    }


    @Override
    protected void registerDispatcherServlet(ServletContext servletContext) {
        super.registerDispatcherServlet(servletContext);
    }
}
