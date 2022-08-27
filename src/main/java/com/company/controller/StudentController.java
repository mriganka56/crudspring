package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Student;
import com.company.service.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl studentServiceImpl;

	@GetMapping(value = "/")
	public String test() {
		String msg = "<!doctype html>\r\n" + "<html lang=\"en\">\r\n" + "\r\n" + "<head>\r\n"
				+ "  <!-- Required meta tags -->\r\n" + "  <meta charset=\"utf-8\">\r\n"
				+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + "\r\n"
				+ "  <!-- Bootstrap CSS and JS -->\r\n"
				+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "    integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n"
				+ "    integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n"
				+ "    crossorigin=\"anonymous\"></script>\r\n" + "\r\n"
				+ "  <title>Spring Boot CRUD Application</title>\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n"
				+ "  <div class=\"container my-5\">\r\n"
				+ "    <h1>Simple Spring Boot CRUD Application (Hosted by Mriganka Paul)</h1>\r\n"
				+ "    <hr class=\"text-danger\">\r\n"
				+ "    <big style=\"font-size: 20px; font-family: cascadia code;\">Test All REST-APIs <a href=\"https://crudspring2.herokuapp.com/swagger-ui/index.html\" style=\"text-decoration: none;\" target=\"_blank\">here</a></big>\r\n"
				+ "  </div>\r\n" + "</body>\r\n" + "\r\n" + "</html>";
		return msg;
	}

	@PostMapping("/createstudent")
	public Student saveStudent(@RequestBody Student params) {
		return studentServiceImpl.saveEntity(params);
	}

	@GetMapping(value = "/getallstudents")
	public List<Student> getAll() {
		return studentServiceImpl.getAllEntity();

	}

	@GetMapping(value = "/getOnlyOne/{mama}")
	public Student getAnEntity(@PathVariable int mama) {
		return studentServiceImpl.getAnEntity(mama);

	}

	@PutMapping(value = "/updatestudent/{mama}")
	public Student updateEntity(@PathVariable int mama, @RequestBody Student student) {
		return studentServiceImpl.updateEntity(student, mama);
	}

	@DeleteMapping(value = "/deletestudent/{mama}")
	public String deleteEntity(@PathVariable int mama) {
		return studentServiceImpl.deleteEntity(mama);
	}

}
