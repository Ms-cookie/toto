package com.study.toto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	// TODO 2 "/"로 요청이 들어오면 "Hello"을 리턴하는 RestController 작성

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Hello 또욘!";
	}
}