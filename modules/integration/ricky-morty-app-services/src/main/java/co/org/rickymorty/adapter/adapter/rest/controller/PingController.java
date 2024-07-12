
package co.org.rickymorty.adapter.adapter.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  private static final Logger LOG = LoggerFactory.getLogger(RootController.class);

  @GetMapping("/ping")
  public String ping() {
    LOG.info("method: ping()");
    return "Ping success.";
  }
}
