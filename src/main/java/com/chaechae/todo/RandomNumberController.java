package com.chaechae.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RandomNumberController {
	@GetMapping("random")
	public int getRandomNumber() {
		// Math.random() => 0 이상 1 미만의 숫자를 랜덤하게 반환해줌 0 ~ 0.99999999
		// Math.random() * 10 => (0 * 10) 이상 (1 * 10) 미만의 숫자를 랜덤하게 반환해줌 => 0 ~ 9.9999999
		// Math.random() * 11 => (0 * 11) 이상 (1 * 11) 미만의 숫자를 랜덤하게 반환해줌 => 0 ~ 10.9999999
		System.out.println("random");
		return (int) (Math.random() * 11);
	}
	
}
