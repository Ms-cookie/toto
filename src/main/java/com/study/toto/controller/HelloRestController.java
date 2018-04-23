package com.study.toto.controller;

import java.util.HashMap;

@RestController
public class HelloRestController {
	// TODO 2 "/"로 요청이 들어오면 "Hello"을 리턴하는 RestController 작성

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Hello";
	}
}