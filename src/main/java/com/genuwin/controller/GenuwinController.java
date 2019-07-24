package com.genuwin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.genuwin.domain.GenuwinVO;
import com.genuwin.service.GenuwinService;

@Controller
@RequestMapping("/board/")
public class GenuwinController {

	@Inject
	GenuwinService service;

	

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {

		List<GenuwinVO> list = null;
		list = service.list();

		model.addAttribute("list", list);
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void write() throws Exception {

	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(GenuwinVO vo) throws Exception {
		service.write(vo);

		return "redirect:/board/list";
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("pk") int pk, Model model) throws Exception {
		GenuwinVO view = null;
		view = service.view(pk);

		model.addAttribute("view", view);
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void getUpdate(@RequestParam("pk") int pk, Model model) throws Exception {
		GenuwinVO view = null;
		view = service.view(pk);

		model.addAttribute("view", view);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String postUpdate(GenuwinVO vo) throws Exception {

		service.update(vo);

		return "redirect:/board/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void getDelete(@RequestParam("pk") int pk, Model model) throws Exception {
		GenuwinVO view = null;
		view = service.view(pk);

		model.addAttribute("view", view);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDelete(GenuwinVO vo) throws Exception {

		service.delete(vo.getPk());

		return "redirect:/board/list";
	}

}