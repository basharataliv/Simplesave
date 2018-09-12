package com.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.boot.web.dao.DaoClass;

import com.boot.web.model.ModelParam;

@Controller
public class HController 
{
@Autowired
DaoClass dao;

@RequestMapping("/")
public String home()
	{
		
	return "home";
}
@RequestMapping(value="/add",method = RequestMethod.POST)
public String home(ModelParam model )
{
	dao.save(model);	
	return "new";
}
@ResponseBody 
@RequestMapping(path="/show") 
	public  ModelAndView Show()
		{
	 ModelAndView mv=new ModelAndView();
	 List<ModelParam> modl= dao.findAll();
	 System.out.println(modl);
	 mv.addObject("modl",modl);
		mv.setViewName("new");
			return mv;
			
		}
@ResponseBody 
@RequestMapping(value="/delete",method = RequestMethod.POST)
	public String Delete(@RequestParam("aid") int aid)
		{
	ModelParam mp=dao.getOne(aid);
	dao.delete(mp);
	 return "Successfully deleted";
		}
}
