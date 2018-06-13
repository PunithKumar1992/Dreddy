package com.appfone.dreddy.controller;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.appfone.dreddy.Service.AdminLoginService;
import com.appfone.dreddy.Service.AdminRecoveryService;
import com.appfone.dreddy.Service.AdminactiveService;
import com.appfone.dreddy.Service.AdminarticleService;
import com.appfone.dreddy.Service.AdminbannerService;
import com.appfone.dreddy.Service.AdmingalleryService;
import com.appfone.dreddy.Service.AdminquotesService;
import com.appfone.dreddy.Service.AdminvideoService;
import com.appfone.dreddy.Service.CommentsService;
import com.appfone.dreddy.Service.ReplyService;
import com.appfone.dreddy.Service.UserfeedbackService;
import com.appfone.dreddy.pojo.Dreddyadminregestration;
import com.appfone.dreddy.pojo.Dreddyarticle;
import com.appfone.dreddy.pojo.Dreddybanner;
import com.appfone.dreddy.pojo.Dreddycomments;
import com.appfone.dreddy.pojo.Dreddyfeedback;
import com.appfone.dreddy.pojo.Dreddygalareyimg;
import com.appfone.dreddy.pojo.Dreddyquotes;
import com.appfone.dreddy.pojo.Dreddyreply;
import com.appfone.dreddy.pojo.Dreddyvideos;
import com.appfone.dreddy.util.Emailutility;


@Controller
public class DreddyController {
	
	@Autowired
	private ServletContext context;
	
	@Autowired
	private HttpSession sessionn;
	
	@Autowired
	private AdminbannerService adminbannerservice;
	
	@Autowired
	private AdminquotesService quoteservice;
	
	@RequestMapping("/")
	public ModelAndView Controller()
	{
		List<Dreddybanner> list = adminbannerservice.getallbannerlist();
		List<Dreddyvideos> videolist = adminvideoservice.getallvideos();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		List<Dreddyquotes> quoteslist = quoteservice.getallQuoteslist();
		List<Dreddyfeedback>feedlist = feedservice.getUserfeedlist();
		System.out.println("in controller");
		Dreddyfeedback feedback = new Dreddyfeedback();
		ModelAndView mv = new ModelAndView();
		mv.addObject("videolist", videolist);
		mv.addObject("gallerylist", gallerylist);
		mv.addObject("quoteslist", quoteslist);
		mv.addObject("bannerlist", list);
		mv.addObject("feedlist", feedlist);
		mv.addObject("userfeedback", feedback);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("index.html")
	public ModelAndView iindexController()
	{
		List<Dreddybanner> list = adminbannerservice.getallbannerlist();
		List<Dreddyvideos> videolist = adminvideoservice.getallvideos();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		List<Dreddyquotes> quoteslist = quoteservice.getallQuoteslist();
		List<Dreddyfeedback>feedlist = feedservice.getUserfeedlist();
		System.out.println("in controller");
		Dreddyfeedback feedback = new Dreddyfeedback();
		ModelAndView mv = new ModelAndView();
		mv.addObject("videolist", videolist);
		mv.addObject("gallerylist", gallerylist);
		mv.addObject("quoteslist", quoteslist);
		mv.addObject("bannerlist", list);
		mv.addObject("feedlist", feedlist);
		mv.addObject("userfeedback", feedback);
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping(value="/admin")
	public ModelAndView adminController()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("adminlogin");
		return mv;
	}
	
	@Autowired
	private AdminLoginService adminloginservice;
	
	@RequestMapping(value="/adminlogin.html")
	public String adminloginController(@RequestParam("username")String username,@RequestParam("password")String pass)
	{
		int res= adminloginservice.checkAdmin(username, pass);
		if(res==1)
		{
			sessionn.setAttribute("activeuser", username);
			sessionn.setAttribute("activepassword", pass);
			
			return "redirect:/adminloginsuccess.html";
			
		}
		
		return "redirect:/adminloginfailure.html";
		
		
		
		
	}
	
	@RequestMapping(value="/adminloginsuccess.html")
	public ModelAndView adminloginsuccessController()
	{	
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}

		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminindex");
		return mv;
	}
	
	
	@RequestMapping(value="/adminloginfailure.html")
	public ModelAndView adminloginfailureController()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminlogin");
		String err="Username or Password Missmatch";
		mv.addObject("logerr", err);
		return mv;
	}

	@RequestMapping(value="/forgetpassword.html")
	public ModelAndView forgetpasswordController()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("forgetpassword");
		return mv;
	}

	@RequestMapping(value="/adminlogout")
	public String adminlogoutController()
	{
		sessionn.invalidate();
		return "redirect:/admin";
	}
	
	@RequestMapping(value="dashboard.html")
	public String dashboardController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			
			return "redirect:/admin";
		}
		return"redirect:/adminloginsuccess.html";
	}
	
	@Autowired
	private AdminRecoveryService adminrecoveryservice;
	
	@RequestMapping(value="/recovery.html")
	public ModelAndView recoveryController(@RequestParam("useremail")String email)
	{
		
		int res=adminrecoveryservice.checkMailidtosend(email);
		if(res==1)
		{
			String username=adminrecoveryservice.getusername(email);
			String password=adminrecoveryservice.getpassword(email);
			String subject ="login credentials Recovery ";
			String msg="Dear Admin your username and password is as follows \n \n \n Username :" +username +"\n Password is :"+password +"\n \n \n Please don't reply to this message this is computer generated";
		Emailutility.send(email, subject, msg);
		
			ModelAndView mv = new ModelAndView();
		mv.setViewName("popup");
		return mv;
		}
		ModelAndView mv=new ModelAndView();
		mv.setViewName("forgetpassword");
		String recerror="please enter the registred email id";
		mv.addObject("recerr", recerror);
		return mv;
		
		
	}
	
	@Autowired
	private AdminactiveService adminactivservice;
	@RequestMapping(value="/adminprofile")
	public ModelAndView adminprofileController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		String username= sessionn.getAttribute("activeuser").toString();
		String password = sessionn.getAttribute("activepassword").toString();
		List<Dreddyadminregestration>list = adminactivservice.getCurrentuser(username, password);
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminactivelist", list);
		mv.setViewName("adminprofile");
		return mv;
	}
	
	@RequestMapping(value="/adminsetting")
	public ModelAndView adminsettingController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		ModelAndView mv= new ModelAndView();
		Dreddyadminregestration addadmin = new Dreddyadminregestration();
		List<Dreddyadminregestration> list = adminactivservice.getalladmin();
		mv.addObject("alladminlist", list);
		mv.addObject("addnewadmin", addadmin);
		mv.setViewName("adminsetting");
		return mv;
	}
	
	@RequestMapping(value="/admindelete.html")
	public String admindeleteController(@RequestParam("admin_id")int id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		adminactivservice.deleteSingleAdmin(id);
		return "redirect:/adminsetting.html";
		
		
	}
	
	@RequestMapping(value="/editadmin.html")
	public ModelAndView editadminController(@RequestParam("admin_id")int id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		sessionn.setAttribute("editadmin", id);
		Dreddyadminregestration editadmin=adminactivservice.getSingleadmin(id);
		ModelAndView mv= new ModelAndView();
		
		mv.setViewName("editadmin");
		mv.addObject("editadmin", editadmin);
		return mv;
		
	}
	
	@RequestMapping(value="/saveeditadmin")
	public String saveeditadminController(@ModelAttribute("editadmin")Dreddyadminregestration newadmin)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		String adminname=newadmin.getAdmin_name();
		 int res= adminactivservice.checkadminNameavailable(adminname);
		 if(res==0)
		 {
		adminactivservice.saveAdmin(newadmin);
		return"redirect:/adminsetting.html";
		 }
		 int admin_id=Integer.parseInt(sessionn.getAttribute("editadmin").toString());
		 return "redirect:/saveeditadminfailure.html?admin_id="+admin_id;
		
	}
	@RequestMapping(value="/saveeditadminfailure.html")
	public ModelAndView saveeditadminfailureController(@RequestParam("admin_id")int id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		
		Dreddyadminregestration editadmin=adminactivservice.getSingleadmin(id);
		ModelAndView mv= new ModelAndView();
		String errmsg = "Choosen admin name is already taken !!!";
		mv.setViewName("editadmin");
		mv.addObject("editadmin", editadmin);
		mv.addObject("editadminexist", errmsg);
		return mv;
		
		
		
	}
	
	@RequestMapping(value="/saveadmin.html")
	public String saveadminController(@ModelAttribute("addnewadmin")Dreddyadminregestration newadmin)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		String adminname=newadmin.getAdmin_name();
		 int res= adminactivservice.checkadminNameavailable(adminname);
		 if(res==0)
		 {
		adminactivservice.saveAdmin(newadmin);
		
		return"redirect:/adminsetting.html";
		 }
		 return "redirect:/saveadminfailure.html";
		
	}
	
	@RequestMapping(value="/saveadminfailure.html")
	public ModelAndView saveadminfailureController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		ModelAndView mv= new ModelAndView();
		Dreddyadminregestration addadmin = new Dreddyadminregestration();
		List<Dreddyadminregestration> list = adminactivservice.getalladmin();
		String errmsg = "Choosen admin name already exists !!";
		mv.addObject("alladminlist", list);
		mv.addObject("addnewadmin", addadmin);
		mv.addObject("adminexists", errmsg);
		mv.setViewName("adminsetting");
		return mv;
		
	}
	
	@RequestMapping(value="/adminbanner.html")
	public ModelAndView adminbannerController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		int size=adminbannerservice.getbannersize();
		List<Dreddybanner> list = adminbannerservice.getallbannerlist();
		ModelAndView mv= new ModelAndView();
		Dreddybanner banner = new Dreddybanner();
		mv.addObject("adminbannerlist", list);
		mv.addObject("adminbanner", banner);
		mv.addObject("bannersize", size);
		mv.setViewName("adminbanner");
		
		return mv;
		
	}
	
	
	@RequestMapping(value="/adminbannerdelete")
	public String adminbannerdeleteController(@RequestParam("banner_id")int banner_id,@RequestParam("banner_image")String banimg)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"bannerimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,banimg);
		delfile.delete();
		adminbannerservice.deletebanner(banner_id);
		return "redirect:/adminbanner.html";
		
	}
	
	@RequestMapping(value="/saveadminbanner.html")
	public String saveadminbannerController(@ModelAttribute("adminbanner")Dreddybanner banner)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		MultipartFile file= banner.getBannerfile();
		String fileName = file.getOriginalFilename();
		banner.setBanner_image(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"bannerimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   adminbannerservice.saveBanner(banner);
		   return "redirect:/adminbanner.html";
		   
		
	}
	
	@RequestMapping(value="/adminbanneredit")
	public ModelAndView adminbannereditController(@RequestParam("banner_image")String bannerimg,@RequestParam("banner_id")int banner_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddybanner editbanner = adminbannerservice.getSinglebanner(banner_id);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("adminbanneredit");
		mv.addObject("editadminbanner", editbanner);
		mv.addObject("banimgtoedit", bannerimg);
		return mv;
	}
	
	
	@RequestMapping(value="/saveadminbanneredit.html")
	public String saveadminbannereditController(@ModelAttribute("editadminbanner")Dreddybanner editbanner,@RequestParam("bannerimgtoedit")String deleteimage)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"bannerimages";
		MultipartFile file = editbanner.getBannerfile();
		String fileName= file.getOriginalFilename();
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   editbanner.setBanner_image(fileName);
		   File deletefile = new File(uploadpath,deleteimage);
		   deletefile.delete();
		   adminbannerservice.saveBanner(editbanner);
		   return "redirect:/adminbanner.html";

	}
	@RequestMapping(value="/admingallery.html")
	public ModelAndView admingalleryController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admingallery");
		return mv ;
		
		
	}
	
	@Autowired
	private AdminvideoService adminvideoservice;
	
	@RequestMapping(value="/adminvideo.html")
	public ModelAndView adminvideoController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		List<Dreddyvideos>list =adminvideoservice.getallvideos(); 
		Dreddyvideos adminvideos = new Dreddyvideos();
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminvideo", adminvideos);
		mv.addObject("adminvideolist", list);
		mv.setViewName("adminvideos");
		return mv ;
		
		
	}
	
	
	@RequestMapping(value="/adminvideodel.html")
	public String adminvideodelController(@RequestParam("video_id")int video_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		adminvideoservice.deletevideo(video_id);
		return "redirect:/adminvideo.html";
	}
	
	@RequestMapping(value="/adminaddvideo.html")
	public String adminaddvideoController(@ModelAttribute("adminvideo")Dreddyvideos adminvideo)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		adminvideoservice.saveVideo(adminvideo);
		return "redirect:/adminvideo.html";
	}
	
	@RequestMapping(value="/admintimelineimages.html")
	public ModelAndView admintimelineimagesController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddygalareyimg galleryimage= new Dreddygalareyimg();
		ModelAndView mv = new ModelAndView();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		mv.addObject("timelineimggal", galleryimage);
		mv.addObject("admintimeimg", gallerylist);
		mv.setViewName("admintimelineimg");
		return mv;
		
	}
	
	@Autowired
	private AdmingalleryService admingalleryservice;
	@RequestMapping(value="/saveadmintimelineimg.html")
	public String saveadmintimelineimgController(@ModelAttribute("timelineimggal")Dreddygalareyimg timelineimg)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		MultipartFile file= timelineimg.getGalleryfile();
		String fileName = file.getOriginalFilename();
		timelineimg.setGallery_img(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   admingalleryservice.savegalleryImg(timelineimg);
		   return "redirect:admintimelineimages.html";
		
		
	}
	
	@RequestMapping(value="/deleteadmintimeimg.html")
	public String deleteadmintimeimgController(@RequestParam("gallery_id")int gallery_id,@RequestParam("gallery_img")String gallery_img)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,gallery_img);
		delfile.delete();
		admingalleryservice.deletegalleryImg(gallery_id);
		return "redirect:/admintimelineimages.html";
		
		
		
		
	}
	
	@RequestMapping(value="/adminpoliticaleventimg.html")
	public ModelAndView adminpoliticaleventimgController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddygalareyimg galleryimage= new Dreddygalareyimg();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminpoliticaleventimg");
		mv.addObject("politicalimggal", galleryimage);
		mv.addObject("adminpoliticalimg", gallerylist);
		return mv;
		
	}
	
	
	@RequestMapping(value="/saveadminpolticalimg.html")
	public String saveadminpolticalimgController(@ModelAttribute("politicalimggal")Dreddygalareyimg politicalimggal)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		MultipartFile file= politicalimggal.getGalleryfile();
		String fileName = file.getOriginalFilename();
		politicalimggal.setGallery_img(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   admingalleryservice.savegalleryImg(politicalimggal);
		   return "redirect:adminpoliticaleventimg.html";
		
		
	}
	
	@RequestMapping(value="/deleteadminpoliticalimg.html")
	public String deleteadminpoliticalimgController(@RequestParam("gallery_id")int gallery_id,@RequestParam("gallery_img")String gallery_img)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,gallery_img);
		delfile.delete();
		admingalleryservice.deletegalleryImg(gallery_id);
		return "redirect:/adminpoliticaleventimg.html";
		
		
		
		
	}
	
	@RequestMapping(value="/adminspiritualeventimg.html")
	public ModelAndView adminspiritualeventimgController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddygalareyimg galleryimage= new Dreddygalareyimg();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminspiritualimg");
		mv.addObject("spiritualimggal", galleryimage);
		mv.addObject("adminspiritualimg", gallerylist);
		return mv;
		
	}
	
	@RequestMapping(value="/saveadminspiritualimg.html")
	public String saveadminspiritualimgController(@ModelAttribute("spiritualimggal")Dreddygalareyimg spiritualimggal)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		MultipartFile file= spiritualimggal.getGalleryfile();
		String fileName = file.getOriginalFilename();
		spiritualimggal.setGallery_img(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   admingalleryservice.savegalleryImg(spiritualimggal);
		   return "redirect:adminspiritualeventimg.html";
		
		
	}
	
	@RequestMapping(value="/deleteadminspiritualimg.html")
	public String deleteadminspiritualimgController(@RequestParam("gallery_id")int gallery_id,@RequestParam("gallery_img")String gallery_img)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,gallery_img);
		delfile.delete();
		admingalleryservice.deletegalleryImg(gallery_id);
		return "redirect:/adminspiritualeventimg.html";
		
		
		
		
	}
	
	
	
	@RequestMapping(value="/adminwithleaderimg.html")
	public ModelAndView adminwithleaderimgController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddygalareyimg galleryimage= new Dreddygalareyimg();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminwithleaderimg");
		mv.addObject("withleaderimggal", galleryimage);
		mv.addObject("adminleaderimg", gallerylist);
		return mv;
		
	}
	
	
	@RequestMapping(value="/saveadminleaderimg.html")
	public String saveadminleaderimgController(@ModelAttribute("withleaderimggal")Dreddygalareyimg withleaderimggal)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		MultipartFile file= withleaderimggal.getGalleryfile();
		String fileName = file.getOriginalFilename();
		withleaderimggal.setGallery_img(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   admingalleryservice.savegalleryImg(withleaderimggal);
		   return "redirect:adminwithleaderimg.html";
		
		
	}
	
	@RequestMapping(value="/deleteadminleaderimg.html")
	public String deleteadminleaderimgController(@RequestParam("gallery_id")int gallery_id,@RequestParam("gallery_img")String gallery_img)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,gallery_img);
		delfile.delete();
		admingalleryservice.deletegalleryImg(gallery_id);
		return "redirect:/adminwithleaderimg.html";
		
		
		
		
	}
	
	
	@RequestMapping(value="/adminothereventimg.html")
	public ModelAndView adminothereventimgController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddygalareyimg galleryimage= new Dreddygalareyimg();
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminothereventimg");
		mv.addObject("othereventimggal", galleryimage);
		mv.addObject("adminothereventimg", gallerylist);

		return mv;
		
	}
	
	@RequestMapping(value="/saveadminothereventimg.html")
	public String saveadminothereventimgController(@ModelAttribute("othereventimggal")Dreddygalareyimg othereventimggal)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		MultipartFile file= othereventimggal.getGalleryfile();
		String fileName = file.getOriginalFilename();
		othereventimggal.setGallery_img(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   admingalleryservice.savegalleryImg(othereventimggal);
		   return "redirect:adminothereventimg.html";
		
		
	}
	
	@RequestMapping(value="/deleteadminothereventimg.html")
	public String deleteadminothereventimgController(@RequestParam("gallery_id")int gallery_id,@RequestParam("gallery_img")String gallery_img)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"galleryimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,gallery_img);
		delfile.delete();
		admingalleryservice.deletegalleryImg(gallery_id);
		return "redirect:/adminothereventimg.html";
		
	}
	
	@RequestMapping(value="/gallery.html")
	public ModelAndView galleryController()
	{
		List<Dreddygalareyimg> gallerylist = admingalleryservice.allimglist();
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("galleryplist", gallerylist);
		mv.setViewName("gallery");
		return mv;
	}
	
	@RequestMapping(value="/adminarticle.html")
	public ModelAndView adminarticleController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		Dreddyarticle adminarticle= new Dreddyarticle();
		ModelAndView mv = new ModelAndView();
		List<Dreddyarticle>list = articleservice.getallarticle();
		mv.addObject("adminarticle", adminarticle);
		mv.addObject("adminarticlelist", list);
		mv.setViewName("adminarticle");
		return mv;
	}
	@RequestMapping(value="/deleteadminarticle.html")
	public String deleteadminarticleController(@RequestParam("article_id")int article_id,@RequestParam("article_image")String article_image,@RequestParam("article_gridimage")String article_gridimage)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"articleimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,article_image);
		delfile.delete();
		
		String floderpath1= context.getRealPath("")+File.separator+"images"+File.separator+"articlegridimages"+File.separator;
		System.out.println("floder path is " +floderpath1);
		File delfile1=new File(floderpath1,article_gridimage);
		delfile1.delete();
		articleservice.deletearticle(article_id);
		return "redirect:/adminarticle.html";
		
		
	}
		
	
	
	@RequestMapping(value="/blog-list.html")
	public ModelAndView bloglistController()
	{
		List<Dreddyarticle>list = articleservice.getallarticle();
		ModelAndView mv = new ModelAndView();
		mv.addObject("articlegridlist", list);
		mv.setViewName("blog-list");
		return mv;
	}
	
	@RequestMapping(value="/blogarticle.html")
	public ModelAndView blogarticleController(@RequestParam("article_id")int article_id)
	{
		Dreddyarticle currentarticle= articleservice.getsinglearticle(article_id);
		String fulldate = currentarticle.getArticle_date();
		String date = fulldate.substring(8, 10);
		String month = fulldate.substring(4, 7);
		List<Dreddyarticle>list = articleservice.getallarticle();
		List<Dreddycomments>cmtreplylist= commentservice.getcommentlist(article_id);
		Dreddycomments comment= new Dreddycomments();
		Dreddyreply replymsg = new Dreddyreply();
		ModelAndView mv = new ModelAndView();
		mv.addObject("currentarticle", currentarticle);
		mv.addObject("articlecomment", comment);
		mv.addObject("cmtrplylist", cmtreplylist);
		mv.addObject("curartdate", date);
		mv.addObject("curartmonth", month);
		mv.addObject("replymsg", replymsg);
		mv.addObject("recentartlist", list);
		mv.setViewName("blogarticle");
		return mv;
	}
	
	@Autowired
	private AdminarticleService articleservice;
	
	@RequestMapping(value="/saveadminarticle")
	public String saveadminarticleController(@ModelAttribute("adminarticle")Dreddyarticle articles,@RequestParam Map<String, String>reqparam)
	{
		String caption =articles.getArticle_caption();
		caption = "<p style='text-align: justify;text-decoration: none;color: #f57c20;'>"+caption +"</p>";
		
		System.out.println("save controller");
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return "redirect:/admin.html";
		}
		String artcounter=reqparam.get("artcount");
		String article_detail="";
		int artcount=Integer.parseInt(artcounter);
		System.out.println("article text area count is  " +artcount);
		String article[] = new String[artcount];
		String param;
		String temp;
		for(int i=0;i<artcount;i++)
		{
			param="article"+(i+1);
			temp=reqparam.get(param);
			temp="<p style='text-align: justify;'>"+temp+"</p><br/>";
			article[i]=temp;
			
			
		}
		for(int i=0;i<artcount;i++)
		{
			article_detail=article_detail+article[i];
		}
		
		articles.setArticle_detail(article_detail);
		System.out.println("save controller");
		
		
		 MultipartFile file = articles.getArticlegridfile(); 
		  String fileName = file.getOriginalFilename();  
		  System.out.println("filename is " +fileName);
		  articles.setArticle_gridimage(fileName);
		   String uploadPath = context.getRealPath("") + File.separator + "images" + File.separator +"articlegridimages"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath);
		   File targetFile = new File(uploadPath, fileName);  
		  try {
			file.transferTo(targetFile);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  
		  MultipartFile file2= articles.getArticlefile();
		  String fileName2=file2.getOriginalFilename();
		  System.out.println("filename is " +fileName2);
		  articles.setArticle_image(fileName2);
		   String uploadPath2 = context.getRealPath("") + File.separator + "images" + File.separator +"articleimages"+ File.separator;
		   System.out.println("uploadpath is" +uploadPath2);
		  File targetFile2 = new File(uploadPath2, fileName2);  
		  try {
			file2.transferTo(targetFile2);
			System.out.println("transfer starts");
		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  
		  articles.setArticle_caption(caption);
		  String grid = articles.getArticle_brief();
		  grid="<p style='text-align: justify;'>"+grid+"</p>";
		  articles.setArticle_brief(grid);
		  articles.setArticle_comments(0);
	  articleservice.saveArticle(articles);
		return "redirect:/adminarticle.html";
	}
	
	@RequestMapping(value="/adminarticledetail")
	public ModelAndView adminarticledetailController(@RequestParam("article_id")int article_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		
		ModelAndView mv = new ModelAndView();
		Dreddyarticle article= articleservice.getsinglearticle(article_id);
		mv.addObject("adminarticledetail", article);
		mv.setViewName("adminarticledetail");
		return mv;
		
		
	}
	
	@RequestMapping(value="/adminquotes.html")
	public ModelAndView adminquotesController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		
		Dreddyquotes adminquotes = new Dreddyquotes();
		List<Dreddyquotes>list =quoteservice.getallQuoteslist();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminquotes");
		mv.addObject("adminquoteslist", list);
		mv.addObject("adminquotes", adminquotes);
		return mv;
		
	}
	
	@RequestMapping(value="/saveadminquotes.html")
	public String saveadminquotesController(@ModelAttribute("adminquotes")Dreddyquotes quotes,@RequestParam Map<String, String>reqparam)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		String artcounter=reqparam.get("artcount");
		String article_detail="";
		int artcount=Integer.parseInt(artcounter);
		System.out.println("article text area count is  " +artcount);
		String article[] = new String[artcount];
		String param;
		String temp;
		for(int i=0;i<artcount;i++)
		{
			param="article"+(i+1);
			temp=reqparam.get(param);
			temp=temp+"<br/>";
			article[i]=temp;
			
			
		}
		for(int i=0;i<artcount;i++)
		{
			article_detail=article_detail+article[i];
		}
		
		quotes.setQuotes_msg(article_detail);
		MultipartFile file= quotes.getQuotesfile();
		String fileName = file.getOriginalFilename();
		quotes.setQuotes_image(fileName);
		String uploadpath = context.getRealPath("")+File.separator+"images"+File.separator+"quotesimages";
		System.out.println("uploadpath is" +uploadpath);
		   File targetFile = new File(uploadpath, fileName);  
		   try {
			file.transferTo(targetFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   quoteservice.saveQuotes(quotes);
			return "redirect:/adminquotes.html";
			
		
		
	}
	
	@RequestMapping(value="/deleteadminquotes.html")
	public String deleteadminquotesController(@RequestParam("quotes_id")int quotes_id,@RequestParam("quotes_image")String quotes_image)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		String floderpath= context.getRealPath("")+File.separator+"images"+File.separator+"quotesimages"+File.separator;
		System.out.println("floder path is " +floderpath);
		File delfile=new File(floderpath,quotes_image);
		delfile.delete();
		quoteservice.deletequotes(quotes_id);
		
		return"redirect:/adminquotes.html";
		
	}
	
	@Autowired
	private UserfeedbackService feedservice;
	@RequestMapping(value="/userfeedback.html")
	public ModelAndView userfeedbackController(@ModelAttribute("userfeedback")Dreddyfeedback feedback)
	{
		String to = "seemayaladagi156@gmail.com";
		String sub= "User feedback ";
		String msg = "This is the feedback mail sended  by " +feedback.getFeedperson_name() +"\n and his/her mail id is " +feedback.getFeedperson_email() +"\n and feedback message is " +feedback.getFeedperson_msg();
		Emailutility.send(to, sub, msg);
		feedback.setFeeddisplay_status(0);
		feedservice.saveUserfeedback(feedback);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("feedbackpopup");
		return mv;
	}
	
	
	@RequestMapping(value="/adminpionners.html")
	public ModelAndView adminpionnersController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		List<Dreddyfeedback> list = feedservice.getUserfeedlist();
		ModelAndView mv = new ModelAndView();
		mv.addObject("adminfeedlist", list);
		mv.setViewName("adminpionners");
		return mv;
		
	}
	
	@RequestMapping(value="/deletepionner.html")
	public String deletepionnerController(@RequestParam("feed_id")int feed_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		feedservice.deletefeedback(feed_id);
		return "redirect:/adminpionners.html";
		
	}
	
	@Autowired
	private CommentsService commentservice;
	@RequestMapping(value="/commentarticle.html")
	public String commentarticleController(@ModelAttribute("articlecomment")Dreddycomments comments,@RequestParam("commentarticleid")int cmtarticleid)
	{
		Dreddyarticle article=articleservice.getsinglearticle(cmtarticleid);
		 int cmtcount=0;
		 cmtcount = article.getArticle_comments();
		 cmtcount=cmtcount+1;
		 article.setArticle_comments(cmtcount);
		 articleservice.updatearticle(article);
		comments.setArticle_id(cmtarticleid);
		commentservice.saveComment(comments);
		 return"redirect:/blogarticle.html?article_id="+cmtarticleid;
		
		
	}
	@Autowired
	 private ReplyService rplyservice;
	
	@RequestMapping("/usercommentreplay.html")
	public String  usercommentreplayController(@RequestParam("article_id")int article_id, @RequestParam("comment_id")int comment_id, @ModelAttribute("replymsg")Dreddyreply rply)
	{
		
		rply.setArticle_id(article_id);
		rply.setComment_id(comment_id);
		rplyservice.saveReply(rply);
		
		
		return "redirect:/blogarticle.html?article_id="+article_id;
		
	}
	
	@RequestMapping("/hello")  
	 public @ResponseBody  
	 String hello(@RequestParam(value = "feed_id") int feed_id,  
	   @RequestParam(value = "display_status") int display_status)  
	    {  
	 Dreddyfeedback feed = feedservice.getsinglefeedback(feed_id);
	 feed.setFeeddisplay_status(display_status);
	 feedservice.update_feedback(feed);
	 String str="";
	 if(display_status==1)
	 {
	 str= "Feed back with id  " +feed_id +" is displayed in pionners field ";
	 }
	 else
	 {
		 str= "Feed back with id  " +feed_id +" is hided in pionners field ";
	 }
	  return str;  
	  
	 }  
	
	@RequestMapping(value="/adminarticlecomments.html")
	public ModelAndView adminarticlecommentsController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
	
		List<Dreddycomments>list = commentservice.getallcomments();
		ModelAndView mv = new ModelAndView();
		mv.addObject("admincmtlist", list);
		mv.setViewName("adminarticlecomments");
		return mv;
	}
	
	@RequestMapping(value="/deleteadmincomment.html")
	public String deleteadmincommentController(@RequestParam("commenter_id")int commenter_id,@RequestParam("article_id")int article_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		Dreddyarticle article = articleservice.getsinglearticle(article_id);
		int cmtcount = article.getArticle_comments();
		cmtcount=cmtcount-1;
		article.setArticle_comments(cmtcount);
		articleservice.updatearticle(article);
		commentservice.deletecomment(commenter_id);
		
		return "redirect:/adminarticlecomments.html";
		
	}
	
	@RequestMapping(value="/adminarticlereplys.html")
	public ModelAndView adminarticlereplysController()
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			ModelAndView mv= new ModelAndView();
			mv.setViewName("adminlogin");
			return mv;
		}
		List<Dreddyreply>list = rplyservice.getallreplylist();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("rplylist", list);
		mv.setViewName("adminarticlereplys");
		return mv;
	}
	@RequestMapping(value="/deleteadminreply.html")
	public String deleteadminreplyController(@RequestParam("reply_id")int reply_id)
	{
		if((sessionn.getAttribute("activeuser"))==null)
		{
			return"redirect:/admin";
		}
		
		rplyservice.deletereply(reply_id);
		return "redirect:/adminarticlereplys.html";
		
		
		
		
	}
	
	@RequestMapping(value="/webmail")
	public ModelAndView webmailController()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect");
		return mv;
	}
	
}