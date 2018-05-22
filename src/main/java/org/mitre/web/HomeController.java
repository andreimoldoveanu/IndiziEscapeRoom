/*******************************************************************************
 * Copyright 2017 The MIT Internet Trust Consortium
 *
 * Portions copyright 2011-2013 The MITRE Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.mitre.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.common.util.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/escape")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	private String message = "{\"text\":\"Leggere qui per indizi\"}";
	private String silente = "false";

	@RequestMapping(value="/writeText", method= RequestMethod.POST,produces="application/json")
	public @ResponseBody String writeText(
			@RequestBody String text
			) {
		message = text;
		return message;
	}	

	@RequestMapping(value="/setSilente", method= RequestMethod.POST,produces="application/json")
	public @ResponseBody String setSilente(
			@RequestParam(value = "silente") String silente 
			) {
		this.silente=silente;
		return this.silente;
	}
	
	@RequestMapping(value="/resetGames", method= RequestMethod.POST,produces="application/json")
	public @ResponseBody String resetGames() {
		//IMPLEMENT CODE TO CONNECT ARDUINO
		String timeStamp = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").format(Calendar.getInstance().getTime());
		return "{\"text\":\"resetted at " + timeStamp + " \"}";
	}
	
	@RequestMapping(value="/getText", method= RequestMethod.GET)
	public @ResponseBody String text() {
		return message;
	}
	
	@RequestMapping(value="/getSilente", method= RequestMethod.GET)
	public @ResponseBody String getSilente() {
		
		return silente;
	}
	
	@RequestMapping(value="/salaEscape")
	public String salaEscape() {
		
		return "salaEscape";
	}
	
	@RequestMapping(value="/salaPc")
	public String salaPc() {
		
		return "salaPc";
	}

}
