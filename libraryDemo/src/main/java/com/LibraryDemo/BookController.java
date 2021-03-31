package com.LibraryDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Book> listBooks =bookService.listAll();
		model.addAttribute("listBooks", listBooks);
			return "index";
	}
	
	@RequestMapping("/addbook")
	public String AddForm(Model model){
		Book book =new Book();
		model.addAttribute("book", book);
		
		return "addbookform";
	}	
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String saveBook(@ModelAttribute("book")Book book) {
		bookService.save(book);
		return "redirect:/";
		
	}
	

}
