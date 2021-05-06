package com.evn.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.evn.model.Configuration;
import com.evn.model.Invoice;
import com.evn.model.User;
import com.evn.repository.ConfigurationRepository;
import com.evn.repository.InvoiceRepository;
import com.evn.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private InvoiceRepository invoiceRepo;
	@Autowired
	private ConfigurationRepository configRepo;
	
//	Đăng nhập
	@PostMapping("/login")
	public String login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, Model model) {
		User user = userRepo.findByUsernameAndPassword(username, password);
		if (user != null) {// kiểm tra đăng nhập accc]ount có tồn tại?
			model.addAttribute("user", user);
			return "homepage";
		} else {
			model.addAttribute("message", "Sai tài khoản hoặc mật khẩu");
			return "index";
		}
	}

//	Gửi mail
	@GetMapping("/sendmail/{iduser}")
	public String goSendMailPage(@PathVariable("iduser") String id, Model model) {// hàm trở về trang chủ sau khi đã
																					// login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
			model.addAttribute("user", user);
			List<Invoice> invoices = new ArrayList<>();
			invoices = invoiceRepo.findByStatus("Chưa hoàn thành");
			System.out.println(invoices);
			model.addAttribute("mails", invoices);
			return "mail";
		} else {
			return "index";
		}
	}
	
	@PostMapping("/sendmail/view")
	public String viewSendmail(@RequestParam(name = "idUser") String id,
			@RequestParam(name = "district") String district, @RequestParam(name = "year") Integer year,
			@RequestParam(name = "time") Integer time, Model model) {// hàm trở về trang chủ sau khi đã login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
			model.addAttribute("user", user);
			System.out.println(user);
			List<Invoice> invoices = new ArrayList<Invoice>();
			if (time <= 12) {
				invoices = invoiceRepo.findByStatusAndMonthAndYear("Chưa hoàn thành", time, year);
				System.out.println(invoices);
			} else if (time >12){

				invoices = invoiceRepo.findByStatusAndQuarterAndYear("Chưa hoàn thành", time - 12, year);
				System.out.println(invoices);
			}
			List<Invoice> mails = new ArrayList<Invoice>();
			for (Invoice x : invoices) {
				if (x.getCustomer().getDistrict().equals(district)) {
					mails.add(x);
					System.out.println(x);
				}
			}
			System.out.println("list mail:  " + mails);
			model.addAttribute("mails", mails);
			return "mail";
		} else {
			return "homepage";
		}
	}

	
//	Xuất báo cáo
	@GetMapping("/report/{iduser}")
	public String goReportPage(@PathVariable("iduser") String id, Model model) {// hàm trở về trang chủ sau khi đã login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
			model.addAttribute("user", user);
			return "baocao";
		} else {
			return "index";
		}
	}

	@PostMapping("/report/view")
	public String viewReport(@RequestParam(name = "idUser") String id, @RequestParam(name = "district") String district,
			@RequestParam(name = "year") Integer year, @RequestParam(name = "status") Integer status,
			@RequestParam(name = "time") Integer time, Model model) {// hàm trở về trang chủ sau khi đã login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
			model.addAttribute("user", user);
			System.out.println(user);
			List<Invoice> invoices = new ArrayList<Invoice>();
			if (time <= 12) {
				if (status == 2) {
					invoices = invoiceRepo.findByStatusAndMonthAndYear("Chưa hoàn thành", time, year);
					System.out.println(invoices);
				}
				if (status == 3) {
					invoices = invoiceRepo.findByStatusAndMonthAndYear("Đã hoàn thành", time, year);
					System.out.println(invoices);
				}
				if (status == 1) {
					invoices = invoiceRepo.findByMonthAndYear(time, year);
					System.out.println(invoices);
				}
			} else {
				if (status == 2) {
					invoices = invoiceRepo.findByStatusAndQuarterAndYear("Chưa hoàn thành", time - 12, year);
					System.out.println(invoices);
				}
				if (status == 3) {
					invoices = invoiceRepo.findByStatusAndQuarterAndYear("Đã hoàn thành", time - 12, year);
					System.out.println(invoices);
				}
				if (status == 1) {
					invoices = invoiceRepo.findByQuarterAndYear(time - 12, year);
					System.out.println(invoices);
				}
			}
			List<Invoice> reports = new ArrayList<Invoice>();
			for (Invoice x : invoices) {
				if (x.getCustomer().getDistrict().equals(district)) {
					reports.add(x);
					System.out.println(x);
				}
			}
			System.out.println("list report:  " + reports);
			model.addAttribute("reports", reports);
			return "baocao";
		} else {
			return "index";
		}
	}

//	Theo dõi danh sách
	@GetMapping("/follow/{iduser}")
	public String goFollowPage(@PathVariable("iduser") String id, Model model) {// hàm trở về trang chủ sau khi đã login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
//			System.out.println(user);
			model.addAttribute("user", user);
			return "follow";
		} else {
			return "index";
		}
	}
	@PostMapping("/follow/view")
	public String viewFollow(@RequestParam(name = "idUser") String id,
			@RequestParam(name = "district") String district, @RequestParam(name = "year") Integer year,
			@RequestParam(name = "time") Integer time, Model model) {// hàm trở về trang chủ sau khi đã login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
			model.addAttribute("user", user);
			System.out.println(user);
			List<Invoice> invoices = new ArrayList<Invoice>();
			if (time <= 12) {
				invoices = invoiceRepo.findByStatusAndMonthAndYear("Chưa hoàn thành", time, year);
				System.out.println(invoices);
			} else if (time >12){

				invoices = invoiceRepo.findByStatusAndQuarterAndYear("Chưa hoàn thành", time - 12, year);
				System.out.println(invoices);
			}
			List<Invoice> follows = new ArrayList<Invoice>();
			for (Invoice x : invoices) {
				if (x.getCustomer().getDistrict().equals(district)) {
					follows.add(x);
					System.out.println(x);
				}
			}
			System.out.println("list follow:  " + follows);
			model.addAttribute("follows", follows);
			return "follow";
		} else {
			return "homepage";
		}
	}
	
//	Danh sách cấu hình
	@GetMapping("/config/{iduser}")
	public String goConfigPage(@PathVariable("iduser") String id, Model model) {// hàm trở về trang chủ sau khi đã login
		Optional<User> optuser = userRepo.findById(id);
		if (optuser.isPresent()) {
			User user = optuser.get();
			model.addAttribute("user", user);
			List<Configuration> configs = new ArrayList<>();
			configs = configRepo.findAll();
			System.out.println(configs);
			model.addAttribute("configs", configs);
			return "cauhinh";
		} else {
			return "homepage";
		}
	}

//	Thêm cấu hình
	@GetMapping("/addConfig/view")
	public String viewToAddConfig(Model model) {
		return "viewtoaddconfig";
		
	}
	@PostMapping("/addConfig/")
	public String addConfig(@RequestParam("idConfiguration") String id,@RequestParam("creator") String creator,
			@RequestParam("dateCreate") String dateCreate, @RequestParam("editor") String editor, 
			@RequestParam("dateEdit") String dateEdit,@RequestParam("price") Float price, 
			@RequestParam("subject") String subject, Model model) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Configuration c = new Configuration();
		c.setIdConfiguration(id);
		c.setCreator(creator);
		c.setDateCreate(formatter.parse(dateCreate));
		c.setEditor(editor);
		c.setDateEdit(formatter.parse(dateEdit));
		c.setPrice(price);
		c.setSubject(subject);
		configRepo.save(c);
		List<Configuration> list = new ArrayList<>();
		list = configRepo.findAll();
		System.out.println(list);
		model.addAttribute("configs",list);
		return "deleteconfigsuccess";
	}
	
//	Xóa cấu hình
	@GetMapping("/deleteConfig/view/{idConfiguration}")
	public String viewToDelConfig(@PathVariable("idConfiguration") String id, Model model) {
		Optional<Configuration> con = configRepo.findById(id) ;
		if(con.isPresent()) {
			System.out.println(con);
			model.addAttribute("config", con);
			return "viewtodelconfig";
		}
		return "homepage";
	}
	@PostMapping("/deleteConfig/")
	public String delConfig(@RequestParam("idConfiguration") String id, Model model) {
		Optional<Configuration> con = configRepo.findById(id) ;
		if(con.isPresent()) {
			configRepo.deleteById(id);
			List<Configuration> list = new ArrayList<>();
			list = configRepo.findAll();
			System.out.println(list);
			model.addAttribute("configs",list);
			return "deleteconfigsuccess";
		}
		return "index";
		}
		
//	Sửa cấu hình
	@GetMapping("/editConfig/view/{idConfiguration}")
	public String viewToEditConfig(@PathVariable("idConfiguration") String id, Model model) {
		Optional<Configuration> con = configRepo.findById(id) ;
		if(con.isPresent()) {
			System.out.println(con);
			model.addAttribute("config", con);
			return "viewtoeditconfig";
		}
		return "homepage";
		}
	@PostMapping("/editConfig/")
	public String editConfig(@RequestParam("idConfiguration") String id,@RequestParam("creator") String creator,
							@RequestParam("dateCreate") String dateCreate, @RequestParam("editor") String editor, 
							@RequestParam("dateEdit") String dateEdit,@RequestParam("price") Float price, 
							@RequestParam("subject") String subject, Model model) throws ParseException {
		Optional<Configuration> con = configRepo.findById(id) ;
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		if(con.isPresent()) {
			configRepo.deleteById(id);
			Configuration c = new Configuration();
			c.setIdConfiguration(id);
			c.setCreator(creator);
			c.setDateCreate(formatter.parse(dateCreate));
			c.setEditor(editor);
			c.setDateEdit(formatter.parse(dateEdit));
			c.setPrice(price);
			c.setSubject(subject);
			configRepo.save(c);
			List<Configuration> list = new ArrayList<>();
			list = configRepo.findAll();
			System.out.println(list);
			model.addAttribute("configs",list);
			return "deleteconfigsuccess";
		}
		return "index";
		}
	}

