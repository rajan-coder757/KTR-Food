package com.ktrfood.KTR.Food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
     
	
	@GetMapping("")
	public String openAdminLogin() {
		
		return "adminService/adminLogin";
	}
	
	@GetMapping("/home")
	public String veiwHome(){				
		return "adminService/adminhome";
	}
	@GetMapping("allOrders")
	public String veiworder(){				
		return "adminService/Orders";
	}
	@GetMapping("/addvendor")
	public String addvendor(){				
		return "adminService/vendor";
	}
	@GetMapping("/viewCustomer")
	public String viewCustomer(){				
		return "adminService/viewcustomer";
	}
	@GetMapping("/additem")
	public String additem(){				
		return "adminService/additem";
	}
	@GetMapping("/updatevendor")
	public String updatevendor(){				
		return "adminService/updateVendor";
	}
	@GetMapping("/updateItem")
	public String updateItem(){				
		return "adminService/updateitem";
	}
	
}
