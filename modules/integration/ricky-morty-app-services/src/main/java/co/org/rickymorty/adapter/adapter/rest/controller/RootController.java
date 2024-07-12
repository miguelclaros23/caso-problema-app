
package co.org.rickymorty.adapter.adapter.rest.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@Slf4j
public class RootController {

  private static final Logger LOG = LoggerFactory.getLogger(RootController.class);

  @GetMapping("/")
  public String root() {
    LOG.info("method: root(INFO)");
    return "Root success.";
  }

  @GetMapping("_ah/warmup")
  public ResponseEntity<Object> warmup() {
    log.info("Time now {}" + Calendar.getInstance().getTime().toString());
    return new ResponseEntity<>("12345", HttpStatus.OK);
  }
}
