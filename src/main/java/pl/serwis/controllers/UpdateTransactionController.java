package pl.serwis.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.seriws.model.Transaction;
import pl.serwis.service.TransactionService;

@Controller
public class UpdateTransactionController 
{
	@Autowired
	TransactionService service;
	
	
	@RequestMapping(value = "/serwis/updateOne", method=RequestMethod.POST)
	public String updateTransaction(HttpServletRequest req) {
	
		System.out.println("id wynosi: " + req.getParameter("id"));
		System.out.println("nowz status: " + req.getParameter("status"));
		service.updateTransaction(req.getParameter("id"), req.getParameter("status"));
		return "redirect:/serwis/allRepairs";
	}

}
