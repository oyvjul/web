package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class BaseController 
{

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String welcome(ModelMap model) 
	{
		model.addAttribute("message", "Maven Web Project + Spring 4 MVC - welcome()");

		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";
	}

	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) 
	{
		model.addAttribute("message", "Maven Web Project + Spring 4 MVC - " + name);
		return "index";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test() 
	{
		//model.addAttribute("message", "testing");
		return "maps";
	}

}
