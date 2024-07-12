package co.org.rickymorty.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class RESTAdapterApplication {

  @PostConstruct
  void started() {
    TimeZone.setDefault(TimeZone.getTimeZone("GMT-5"));
  }

  public static void main(String[] args) {
    SpringApplication.run(RESTAdapterApplication.class, args);
  }

}
