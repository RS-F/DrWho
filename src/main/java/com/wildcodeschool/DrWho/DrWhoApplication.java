package com.wildcodeschool.DrWho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DrWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrWhoApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    public String index() {
		return "List of selected Doctors:"
				+ "<ul>"
				+ "<li><a href='/doctor/1'>Doctor  1</a></li>"
				+ "<li><a href='/doctor/3'>Doctor  3</a></li>"
				+ "<li><a href='/doctor/7'>Doctor  7</a></li>"
				+ "<li><a href='/doctor/13'>Doctor 13</a></li>"
				+ "</ul>"
				;    }
	
	@RequestMapping("/doctor/1")
    @ResponseBody
    public String index1() {
		return "<h1>William Hartnell</h1> <br>"
				+ "<img src='https://upload.wikimedia.org/wikipedia/en/thumb/a/aa/William_Hartnell.jpg/220px-William_Hartnell.jpg'>"
				;    }

	@RequestMapping("/doctor/3")
    @ResponseBody
    public String index3() {
		return "<h1>Jon Pertwee</h1><br>"
				+ "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Jon_Pertwee_%28filtered%29.jpg/220px-Jon_Pertwee_%28filtered%29.jpg'>"
				;    }

	@RequestMapping("/doctor/7")
    @ResponseBody
    public String index7() {
		return "<h1>Sylvester McCoy</h1><br>"
				+ "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Sylvester_McCoy_in_2018.jpg/220px-Sylvester_McCoy_in_2018.jpg'>"
				;    }
	
	@RequestMapping("/doctor/13")
    @ResponseBody
    public String index13() {
		return "<h1>Jodie Whittaker</h1><br>"
				+ "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Jodie_Whittaker_by_Gage_Skidmore.jpg/220px-Jodie_Whittaker_by_Gage_Skidmore.jpg'>"
				;    }

	

}
