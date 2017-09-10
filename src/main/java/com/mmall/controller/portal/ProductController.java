package com.mmall.controller.portal;

import com.mmall.service.IProudctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zsl on 2017/9/4.
 */
@Controller
@RequestMapping("/product/")
public class ProductController {
	@Autowired
	private IProudctService iProudctService;




}
