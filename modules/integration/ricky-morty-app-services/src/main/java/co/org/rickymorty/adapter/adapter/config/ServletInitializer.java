package co.org.rickymorty.adapter.adapter.config;

import co.org.rickymorty.adapter.RESTAdapterApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(RESTAdapterApplication.class);
  }

}
