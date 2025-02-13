package com.eventcrud.event.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eventcrud.event.Model.MailEvent;

@RestController
public class EventController {
	@PostMapping("/event")
	public String addEvent(@RequestBody MailEvent event) {
		return "inserted";
	}
}
