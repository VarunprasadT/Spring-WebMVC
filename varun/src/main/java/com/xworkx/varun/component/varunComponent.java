package com.xworkx.varun.component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;



import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkx.varun.dto.BeverageDTO;
import com.xworkx.varun.dto.ChatDTO;
import com.xworkx.varun.dto.EducationDTO;
import com.xworkx.varun.dto.MobileDTO;

@Component
@RequestMapping("/")
public class varunComponent {
public varunComponent() {
	System.out.println("Running VarunComponent....");
}
@PostMapping("/email")
public String onEmail(Model model) {
	System.out.println("Runnning Email...");
	model.addAttribute("email","Varunprasadt.xworkz@gmail.com");
	return "index.jsp";
}

@PostMapping("/mNumber")
public String onMobileNumber(Model model) {
	System.out.println("Running onMobileNumber.....");
	model.addAttribute("mobileNumber",8296699016l);
	return "index.jsp";
}
@PostMapping("/addhar")
public String onAddar(Model model) {
	System.out.println("Running onAddhar...");
	model.addAttribute("addharNumber", "123 456 789");
	return "index.jsp";
}
@PostMapping("/age")
public String onAge(Model model) {
	System.out.println("Running onAge.....");
	model.addAttribute("age", 24);
	return "index.jsp";
}
@PostMapping("/dateOfBirth")
public String onDateOfBirth(Model model) {
	System.out.println("Running onDateOfBirth.....");
	model.addAttribute("dateOfBirth",LocalDateTime.of(1999,04,19,11,37));
	return "index.jsp";
}
@PostMapping("/desiredSalary")
public String onDesiredSalary(Model model) {
	System.out.println("Running onDesiredSalary....");
	model.addAttribute("desiredSalary","1 Cr");
	return "index.jsp";
}
@PostMapping("/bestFriend")
public String onBestFriend(Model model) {
	System.out.println("Running onBestFriend....");
	ArrayList<String> al = new ArrayList<String>();
	al.add("Virat");
	al.add("Dhoni");
	al.add("Suresh");
	al.add("Dinesh");
	al.add("Surya");
	al.add("Sharma");
	al.add("Rishab");
	al.add("Rahul");
	al.add("Iyer");
	al.add("Dhawan");
	model.addAttribute("friends", al);
	return "index.jsp";
}
@PostMapping("/vistedPlaces")
public String onVistedPlaces(Model model) {
	System.out.println("Running onVistedPlaces......");
	ArrayList<String> pl = new ArrayList<String>();
	pl.add("X-Workz");
	pl.add("Bhasham Circle");
	pl.add("Lakshimi NaraShima PG");
	pl.add("Prakash Nagar");
	pl.add("RajajiNagar");
	pl.add("Dr Rajkumar Road");
	pl.add("CIT Gubbi");
	pl.add("Home");
	pl.add("Bus Stand");
	pl.add("Old X-Workz");
	model.addAttribute("places", pl);
	return "index.jsp";
}
@PostMapping("/skillSet")
public String onSkillSet(Model model) {
	System.out.println("Running onSkillSet......");
	ArrayList<String> sl = new ArrayList<String>();
	sl.add("Core-Java");
	sl.add("HTML");
	sl.add("CSS");
	sl.add("JavaScript");
	sl.add("BootStrap");
	sl.add("MSOffice");
	sl.add("MSExcel");
	sl.add("PowerPoint");
	sl.add("VsCode");
	sl.add("Eclipse");
	model.addAttribute("skill", sl);
	return "index.jsp";
}
@PostMapping("/education")
public String onEducation(Model model) {
	System.out.println("Running onEducation....");
	EducationDTO edto = new EducationDTO("CIT","Gubbi","BE","Mechanical",4,2017,2022,7.91f,6,true);
	model.addAttribute("collegeName", edto.getCollegeName());
	model.addAttribute("collegeAddress", edto.getCollegeAddress());
	model.addAttribute("degree", edto.getDegree());
	model.addAttribute("course", edto.getCourse());
	model.addAttribute("cgpa", edto.getCGPA());
	model.addAttribute("duration", edto.getDuration());
	model.addAttribute("joinedYear", edto.getJoinedYear());
	model.addAttribute("completedYear", edto.getCompletedYear());
	model.addAttribute("backLogs", edto.getNumberOfBacklogs());
	model.addAttribute("cleared",edto.isBacklogsCleared());
	return "index.jsp";
}
@PostMapping("/mobile")
public String onMobile(Model model) {
	System.out.println("Running onMobile.....");
	MobileDTO mdto = new MobileDTO("POCO",37,"POCO_Launcher",LocalDate.of(2022,02,02),128);
	model.addAttribute("mobileName", mdto.getMobileName());
	model.addAttribute("numberOfApplications", mdto.getNumberOfApllications());
	model.addAttribute("mostUsedApp", mdto.getMostUsedApllication());
	model.addAttribute("internalStorage", mdto.getInternalStorage());
	model.addAttribute("mobileBroughtDate",mdto.getMobileBroughtDate());
	return "index.jsp";
}
@PostMapping("/beverage")
public String onBeverage(Model model) {
	System.out.println("Runnning onBeverage....");
	BeverageDTO bdto = new BeverageDTO("Water","Water",10,10d,LocalDate.of(2023, 02, 27));
	model.addAttribute("mostLikedBreverage", bdto.getMostLikedBreverage());
	model.addAttribute("nameOfMostDrinkedBreverage", bdto.getNameofMostDrinkedBeverage());
	model.addAttribute("numberofTimesBreverageHadinDay", bdto.getNumberofTimesBreverageHadinDay());
	model.addAttribute("expireDate", bdto.getExpireDate());
	model.addAttribute("breveragePrice", bdto.getPrice());
	return "index.jsp";
}
@PostMapping("/chat")
public String onChat(Model model) {
	System.out.println("Running onChat....");
	ChatDTO cdto = new ChatDTO(3,"WhatsApp",2,1,20);
	model.addAttribute("mostUsedMessagingApp", cdto.getMostUsedMessagingApp());
	model.addAttribute("numberOfChatPerDay", cdto.getNumberOfChatPerDay());
	model.addAttribute("numberofgroupChat", cdto.getNumberofgroupChat());
	model.addAttribute("numberOfMessagingApp", cdto.getNumberOfMessagingApp());
	model.addAttribute("totalNumberOfChat", cdto.getTotalNumberOfChat());
	return "index.jsp";
}

}
