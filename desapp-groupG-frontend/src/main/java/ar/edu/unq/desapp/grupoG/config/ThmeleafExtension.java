package ar.edu.unq.desapp.grupoG.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.FileTemplateResolver;
/*
@Configuration
	public class ThmeleafExtension {

	    @Autowired
	    private SpringTemplateEngine templateEngine;

	    @PostConstruct
	    public void extension() {
	        FileTemplateResolver resolver = new FileTemplateResolver();
	        resolver.setPrefix("D:\\templates\\");
	        resolver.setSuffix(".html");
	        resolver.setTemplateMode("HTML5");
	        resolver.setOrder(templateEngine.getTemplateResolvers().size());
	        resolver.setCacheable(false);
	        templateEngine.addTemplateResolver(resolver);
	    }
	}

*/