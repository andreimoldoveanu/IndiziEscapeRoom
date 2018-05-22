package org.mitre.web;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupHousekeeper implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(final ContextRefreshedEvent event) {
	  if (Desktop.isDesktopSupported()) {
		    try {
				Desktop.getDesktop().browse(new URI("http://localhost:8080/escape/salaPc"));
				Desktop.getDesktop().browse(new URI("http://localhost:8080/escape/salaEscape"));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}
  }
}