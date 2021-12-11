package com.project.HMS.Controller;

import java.util.ArrayList;
import java.util.List;

import com.project.HMS.Entity.Appointment;
import com.project.HMS.Entity.Doctor;
import com.project.HMS.Entity.Hospital;
import com.project.HMS.Entity.Operation;
import com.project.HMS.Entity.Patient;
import com.project.HMS.Entity.Receptionist;
import com.project.HMS.Entity.User;
import com.project.HMS.Entity.medical_staff;
import com.project.HMS.Entity.r;
import com.project.HMS.Entity.user_queries;
import com.project.HMS.form.register_user_form;
import com.project.HMS.form.select_doctor;
import com.project.HMS.form.selection_form;
import com.project.HMS.Repository.AppointmentRepository;
import com.project.HMS.Repository.DoctorRepository;
import com.project.HMS.Repository.HospitalRepository;
import com.project.HMS.Repository.Medical_staffRepository;
import com.project.HMS.Repository.OperationRepository;
import com.project.HMS.Repository.PatientRepository;
import com.project.HMS.Repository.ReceptionistRepository;
import com.project.HMS.Repository.UserRepository;
import com.project.HMS.Repository.UserqueriesRepository;
import com.project.HMS.Repository.rRepo;
import com.project.HMS.form.app_cancel_form;
import com.project.HMS.form.appointment_form;
import com.project.HMS.form.contact_form;
import com.project.HMS.form.doctor_search_form;
import com.project.HMS.form.edit_profile_form;
import com.project.HMS.form.exp_more;
import com.project.HMS.form.hospital_search_form;
import com.project.HMS.form.login_user_form;
import com.project.HMS.form.medical_staff_edit_profile_form;
import com.project.HMS.form.medical_staff_form;
import com.project.HMS.form.new_patient;
import com.project.HMS.form.op_form;
import com.project.HMS.form.r_edit_form;
import com.project.HMS.form.receptionist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class MainController {

	private Boolean r_has_logged_in = false;
	private Boolean d_has_logged_in = false;
	private String current_user_email = "";
	private Boolean med_staff_has_logged_in = false;
	private Boolean user_has_logged_in = false;
	private medical_staff current_medstaff = null;
	private Hospital h = null;
	private Doctor curr_d = null;
	private User curr_user = null;
	private Receptionist curr_r;
	private r curr_ruser = null;

	@Autowired
	PatientRepository pRepo;

	@Autowired
	OperationRepository oRepo;

	@Autowired
	rRepo rrepo;

	@Autowired
	AppointmentRepository appRepo;

	@Autowired
	DoctorRepository dRepo;

	@Autowired
	UserRepository userRepository;

	@Autowired
	HospitalRepository hRepo;

	@Autowired
	Medical_staffRepository medical_staffRepository;

	@Autowired
	UserqueriesRepository uRepo;

	@Autowired
	ReceptionistRepository receptionistRepository;
	
	public MainController() {
		super();
	}
	
	@GetMapping({"/", "/home"})
	public String home() {
		user_has_logged_in = false;
		return "home";
	}
	
	@GetMapping({"/contact"})
	public String contact() {
		user_has_logged_in = false;
		return "contact";
	}
	
	@GetMapping({"/about"})
	public String about() {
		user_has_logged_in = false;
		return "about";
	}
	
	@GetMapping({"register"})
	public String register() {
		user_has_logged_in = false;
		return "register";
	}

	
	@GetMapping({"/login"})
	public String login() {
		user_has_logged_in = false;
		return "login";
	}
	
	@GetMapping({"/register_user"})
	public String register_user(Model model) {
		user_has_logged_in = false;
		model.addAttribute("user", new register_user_form());
		return "register_user";
	}

	@RequestMapping(path = "/user_registration")
	public String user_registration(){
		user_has_logged_in = false;
		return "register";
	}

	@PostMapping(path = "/user_registration")
	public String user_registration(register_user_form user){
		user_has_logged_in = false;
		String p1 = user.getPassword1().toString();
		String p2 = user.getPassword2().toString();
		if(p1.equals(p2)){
			User new_user = new User();
			new_user.setEmail(user.getEmail().toString());
			new_user.setPassword(user.getPassword1().toString());
			new_user.setFname(user.getFname().toString());
			new_user.setLname(user.getLname().toString());
			userRepository.save(new_user);
			return "registration_success";
		}
		else{
			return "redirect:/register_user";
		}
	}

	
	@GetMapping("/login_user")
	public String login_user(Model model) {
		user_has_logged_in = false;
		model.addAttribute("user", new login_user_form());
		return "login_user";
	}

	@RequestMapping(path = "/login_user/profile")
	public String user_login(Model model){
		if(user_has_logged_in){
			model.addAttribute("user_inf", userRepository.getById(current_user_email));
			return "user_profile";
		}
		return "redirect:/login";
	}

	@PostMapping(path = "/login_user/profile")
	public String user_login(login_user_form user, Model model) {
		user_has_logged_in = false;
		Boolean y = userRepository.existsById(user.getEmail());
		String email = user.getEmail();
		String password = user.getPassword();
		System.out.println(user.getEmail() + user.getPassword() + Boolean.toString(y));
		if(y){

			if(userRepository.getById(email).getPassword().toString().equals(password)){
				current_user_email = email;
				user_has_logged_in = true;
				model.addAttribute("user_inf", userRepository.getById(current_user_email));
				return "user_profile";
			}
			else{
				model.addAttribute("error", "Password validation failed!");
				model.addAttribute("user", new login_user_form());
				return "login_user";
			}
		}
		else{
			model.addAttribute("error", "Email doenn't not exists!");
			model.addAttribute("user", new login_user_form());
			return "login_user";
		}
	}

	@GetMapping(path = "/login_user/services")
	public String services(){
		if(user_has_logged_in == true){
			return "services";
		}
		else{
			return "redirect:/login_user";
		}
	}

	@GetMapping(path = "/logout")
	public String logout(){
		if(user_has_logged_in){
			user_has_logged_in = false;
			current_user_email = "";
			return "redirect:/home";
		}
		else{
			current_user_email = "";
			return "redirect:/home";
		}
	}
	
	@GetMapping(path = "/login_medicalstaff")
	public String login_medicalstaff(Model model) {
		model.addAttribute("med_staff", new medical_staff_form());
		return "login_medicalstaff";
	}

	@PostMapping(path = "/login_medicalstaff/profile")
	public String medicalstaff_login(medical_staff_form medstaffform, Model model){
		Boolean y = medical_staffRepository.existsById(medstaffform.getEmail());
		if(y){
			medical_staff doc = medical_staffRepository.getById(medstaffform.getEmail().toString());
			if(doc.getPassword().equals(medstaffform.getPassword().toString())){
				d_has_logged_in = true;
				med_staff_has_logged_in = true;
				current_medstaff = doc;
				curr_d = dRepo.findByEmail(doc.getEmail()).get(0);
				System.out.println("-----------------");
				System.out.println(curr_d.getEmail());
				System.out.println("-----------------");
				model.addAttribute("d", curr_d);
				return "med_staff_profile";
			}else{
				model.addAttribute("message", "Wrong Password!");
				model.addAttribute("med_staff", new medical_staff_form());
				return "login_medicalstaff";
			}
		}else{
			model.addAttribute("message", "Invalid Email Address!");
			model.addAttribute("med_staff", new medical_staff_form());
			return "login_medicalstaff";
		}
	}

	@GetMapping(path = "login_medicalstaff/profile")
	public String medstaff_edit_profile(Model model){
		if(med_staff_has_logged_in){
			model.addAttribute("d", curr_d);
			model.addAttribute("message", null);
			return "med_staff_profile";
		}
		else{
			return "redirect:/login_medicalstaff";
		}
	}

	@GetMapping(path = "login_medicalstaff/edit_profile")
	public String medstaff_login(Model model){
		if(med_staff_has_logged_in){
			model.addAttribute("cms", current_medstaff);
			curr_d = dRepo.getById(medical_staffRepository.getById(current_medstaff.getEmail().toString()).getId());
			model.addAttribute("d", curr_d);
			model.addAttribute("form", new medical_staff_edit_profile_form());
			return "med_staff_edit_profile";
		}
		else{
			return "redirect:/login_medicalstaff";
		}
	}

	@RequestMapping(value="/login_medicalstaff/profile_update")
	public String med_staff_profile_update(medical_staff_edit_profile_form msf, Model model) {
		Doctor new_d = new Doctor();
		medical_staff new_m = new medical_staff();
		new_d.setName(msf.getName());
		new_d.setContact(msf.getContact());
		new_d.setEmail(msf.getEmail());
		new_d.setDept(msf.getDept());
		new_d.setRole(msf.getRole());
		new_d.setDistrict(msf.getDistrict());
		new_d.setState(msf.getState());
		new_d.setCountry(msf.getCountry());
		new_d.setAge(msf.getAge());
		new_d.setAddress(msf.getAddress());
		new_m.setEmail(msf.getEmail());
		new_m.setPassword(msf.getPassword());
		new_d.setFilepath(curr_d.getFilepath());
		new_d.setGender(curr_d.getGender());
		Long temp_id = curr_d.getId();
		Hospital temp_h = curr_d.getHospital();
		dRepo.delete(curr_d);
		new_d.setId(temp_id);
		new_d.setHospital(temp_h);
		dRepo.save(new_d);
		medical_staffRepository.delete(current_medstaff);
		new_m.setId(temp_id);
		curr_d = dRepo.getById(temp_id);
		medical_staffRepository.save(new_m);
		current_medstaff = medical_staffRepository.getById(curr_d.getEmail());
		model.addAttribute("d", curr_d);
		model.addAttribute("message", "Your profile has been updated successfully!");
		model.addAttribute("med_staff", current_medstaff);
		return "med_staff_profile";

	}

	@RequestMapping(path="/login_medical_staff/my_appointments")
	public String doctor_appointmetns(Model model){
		model.addAttribute("d", curr_d);
		List<Appointment> req_a = appRepo.findByDoctorid(curr_d.getId());
		if(req_a.size() == 0){
			model.addAttribute("p", "0");
		}
		else{
			model.addAttribute("p", "1");
			model.addAttribute("all_app", req_a);
			model.addAttribute("form", new selection_form());
		}
		return "med_staff_appointments";
	}

	@RequestMapping(path="/login_medical_staff/my_appointments/selection")
	public String makeselection(selection_form sf, Model model) {
		if(sf.getSelection().equals("1")){
			Appointment new_a = appRepo.getById(sf.getAppid());
			new_a.setStatus("accepted");
			appRepo.save(new_a);
		}
		else{
			Appointment new_a = appRepo.getById(sf.getAppid());
			new_a.setStatus("rejected");
			appRepo.save(new_a);
		}
		model.addAttribute("d", curr_d);
		List<Appointment> req_a = appRepo.findByDoctorid(curr_d.getId());
		if(req_a.size() == 0){
			model.addAttribute("p", "0");
		}
		else{
			model.addAttribute("p", "1");
			model.addAttribute("all_app", req_a);
			model.addAttribute("form", new selection_form());
		}
		return "med_staff_appointments";
	}

	@GetMapping(path = "/login_medicalstaff/operations")
	public String showoperations(Model model){
		List<Operation> all_o = oRepo.findAll();
		List<Operation> req = new ArrayList<Operation>();
		for (Operation o : all_o) {
			String[] all_d = o.getDoctors().split(" ");
			for(String i : all_d){
				if(i.equals(curr_d.getId().toString())){
					req.add(o);
					break;
				}
			}
		}
		if(req.size() == 0){
			model.addAttribute("p", "0");
		}
		else{
			model.addAttribute("p", "1");
			model.addAttribute("all_op", req);
		}
		return "med_staff_operations";
	}
	
	@GetMapping(path = "/medstaff_logout")
	public String med_staff_logout(){
		med_staff_has_logged_in = false;
		return "redirect:/login_medicalstaff";
	}
	
	
	@GetMapping("/login_receptionist")
	public String login_receptionist(Model model) {
		model.addAttribute("recep", new receptionist());
		return "login_receptionist";
	}

	@RequestMapping(path = "/login_receptionist/profile")
	public String receptionist_login(receptionist recep, Model model){
		r new_r = rrepo.getById(recep.getEmail());
		if(new_r == null){
			model.addAttribute("message", "Invalid Email!");
			model.addAttribute("recep", new receptionist());
			return "login_receptionist";
		}	
		else{
			if(new_r.getPassword().equals(recep.getPassword())){
				r_has_logged_in = true;
				curr_r = receptionistRepository.getById(recep.getEmail());
				curr_ruser = rrepo.getById(recep.getEmail());
				model.addAttribute("r", curr_r);
				return "receptionist_profile";
			}
			else{
				model.addAttribute("message", "Password Validation Failed!");
				model.addAttribute("recep", new receptionist());
				return "login_receptionist";
			}
		}
	}

	@GetMapping(path = "/login_receptionist/profile")
	public String r_profile(Model model){
		if(r_has_logged_in){
			model.addAttribute("r", curr_r);
			return "receptionist_profile";
		}else{
			model.addAttribute("recep", new receptionist());
			return "login_receptionist";	
		}
	}


	@GetMapping("/login_receptionist/r_patients")
	public String r_patients(Model model){
		if(r_has_logged_in){
			model.addAttribute("form", new new_patient());
			List<Patient> req_p = pRepo.findByHid(curr_r.getHid());
			if(req_p.size() == 0){
				model.addAttribute("p", "0");
			}else{
				model.addAttribute("p", "1");
				model.addAttribute("all_p", req_p);
			}
			return "r_patients";
		}else{
			model.addAttribute("recep", new receptionist());
			return "login_receptionist";	
		}
	}

	@GetMapping("/login_receptionist/new_patient")
	public String newpatient(Model model){
		model.addAttribute("p", "0");
		model.addAttribute("pr", new new_patient());
		return "r_newpatient";
	}


	@RequestMapping(path = "/login_receptionist/new_patient_registation")
	public String addnewpatient(new_patient pr, Model model){
		Patient p = new Patient();
		p.setAddress(pr.getAddress());
		p.setAge(pr.getAge());
		p.setContact(pr.getContact());;
		p.setDisease_description(pr.getDd());
		p.setEmail(pr.getEmail());
		p.setRoom(pr.getRoom());
		p.setIn_time(pr.getIn());
		p.setName(pr.getName());
		p.setGender(pr.getGender());
		p.setHid(curr_r.getHid());
		pRepo.save(p);
		List<Patient> req_p = pRepo.findByHid(curr_r.getHid());
		if(req_p.size() == 0){
			model.addAttribute("p", "0");
		}else{
			model.addAttribute("p", "1");
			model.addAttribute("all_p", req_p);
		}
		model.addAttribute("form", new selection_form());
		return "r_patients";
	}

	@RequestMapping(path = "/login_receptionist/patient/edit")
	public String editPatient(selection_form form, Model model){
		model.addAttribute("p", "1");
		model.addAttribute("pr", new new_patient());
		model.addAttribute("pt", pRepo.getById(form.getAppid()));
		return "r_newpatient";
	}

	@GetMapping("/login_medical_staff/d_patients")
	public String d_patients(Model model){
		if(d_has_logged_in){
			model.addAttribute("form", new new_patient());
			List<Patient> req_p = pRepo.findByDid(curr_d.getId());
			if(req_p.size() == 0){
				model.addAttribute("p", "0");
			}else{
				model.addAttribute("p", "1");
				model.addAttribute("all_p", req_p);
			}
			return "d_patients";
		}else{
			model.addAttribute("recep", new receptionist());
			return "login_receptionist";	
		}
	}
	

	@GetMapping(path = "login_receptionist/edit_profile")
	public String r_edit_profile(Model model){
		if(r_has_logged_in){
			model.addAttribute("r", curr_r);
			model.addAttribute("form", new r_edit_form());
			model.addAttribute("cr", curr_ruser);
			return "r_edit_profile";
		}else{
			model.addAttribute("recep", new receptionist());
			return "login_receptionist";	
		}
	}

	@RequestMapping(value="/login_receptionist/profile_update")
	public String r_update_profile(r_edit_form ref, Model model) {
		Receptionist new_r = receptionistRepository.getById(curr_r.getEmail());
		new_r.setEmail(ref.getEmail());
		new_r.setAddress(ref.getAddress());
		new_r.setContact(ref.getContact());
		new_r.setCountry(ref.getCountry());
		new_r.setDistrict(ref.getDistrict());
		new_r.setState(ref.getState());
		new_r.setFname(ref.getFname());
		new_r.setLname(ref.getLname());
		r new_ruser = rrepo.getById(curr_ruser.getEmail());
		new_ruser.setEmail(ref.getEmail());
		new_ruser.setPassword(ref.getPassword());
		receptionistRepository.save(new_r);
		rrepo.save(new_ruser);
		curr_r = receptionistRepository.getById(new_r.getEmail());
		curr_ruser = rrepo.getById(new_ruser.getEmail());
		model.addAttribute("message", "Profile Updated Successfully!");
		model.addAttribute("r", curr_r);
		return "receptionist_profile";
	}

	@GetMapping(path = "/login_receptionist/tasks")
	public String r_tasks(Model model){
		model.addAttribute("r", curr_r);
		return "r_tasks";
	}
	
	@GetMapping(path = "/login_receptionist/operation_services")
	public String r_operations(Model model){
		model.addAttribute("r", curr_r);
		List<Operation> req_o = oRepo.findByHid(curr_r.getHid());
		if(req_o.size() == 0){
			model.addAttribute("p", "0");
		}else{
			model.addAttribute("all_op", req_o);
			model.addAttribute("p", "1");
		}
		model.addAttribute("form", new selection_form());
		return "r_operations";
	}

	@RequestMapping(path = "/login_receptionist/operation_services/new_operation")
	public String newop(Model model){
		model.addAttribute("r", curr_r);
		model.addAttribute("p", "new");
		model.addAttribute("op_form", new op_form());
		return "edit_or_new_opform";
	}

	@RequestMapping(path = "/login_receptionist/operation_services/edit_operation")
	public String editop(Model model){
		model.addAttribute("r", curr_r);
		model.addAttribute("p", "edit");
		model.addAttribute("opform", new op_form());
		return "edit_or_new_opform";
	}

	@RequestMapping(path = "/login_receptionist/operation_services/save_operation")
	public String op_edit(op_form opform , Model model){
		System.out.print(opform.getTime());
		return "/about";
	}



	@RequestMapping(path = "/login_receptionist/appointment_services")
	public String r_appointments(Model model){
		model.addAttribute("r", curr_r);
		List<Appointment> req_a = appRepo.findByHid(curr_r.getHid());
		if(req_a.size() == 0){
			model.addAttribute("p", "0");
		}else{
			model.addAttribute("p", "1");
			model.addAttribute("all_app", req_a);
		}
		return "r_appointments";
	}

	@RequestMapping(path = "/forgot_password")
	public String forgot_password(){
		return "home";
	}

	@RequestMapping(path = "/login_user/profile/edit_profile")
	public String edit_profile(Model model){
		if(user_has_logged_in){
			model.addAttribute("form", new edit_profile_form());
			model.addAttribute("user", userRepository.getById(current_user_email));
			return "edit_profile";
		}
		else{
			return "redirect:/login_user";
		}
	}

	@RequestMapping(path = "/login_user/profile/editprofile")
	public String editprofile(edit_profile_form form, Model model){
		if(user_has_logged_in){
			String new_user_email = "";
			User update_user = new User();
			if(form.getEmail() != ""){
				update_user.setEmail(form.getEmail());
				new_user_email = form.getEmail();
			}
			else{
				new_user_email = current_user_email;
				update_user.setEmail(current_user_email);
			}
			if(form.getFname() != ""){
				update_user.setFname(form.getFname());
			}
			else{
				update_user.setFname(userRepository.getById(current_user_email).getFname());
			}
			if(form.getLname() != ""){
				update_user.setLname(form.getLname());
			}
			else{
				update_user.setLname(userRepository.getById(current_user_email).getLname());
			}
			if(form.getPassword() != ""){
				update_user.setPassword(form.getPassword());
			}
			else{
				update_user.setPassword(userRepository.getById(current_user_email).getPassword());
			}
			userRepository.delete(userRepository.getById(current_user_email));
			userRepository.save(update_user);
			current_user_email = new_user_email;
			new_user_email = "";
			model.addAttribute("user_inf", userRepository.findByEmail(current_user_email));
			return "user_profile";
		}else{
			return "redirect:/login_user";
		}
	}


	@GetMapping(path = "/login_user/hospital_search")
	public String hospitalservices(Model model){
		if(user_has_logged_in){
			model.addAttribute("hsf", new hospital_search_form());
			model.addAttribute("h_info", null);
			String start = "0";
			model.addAttribute("start", start);
			return "hospital_search";
		}else{
			return "redirect:/login_user";
		}
	}

	@GetMapping(path = "/login_user/doctor_services")
	public String doctorservices(Model model){
		if(user_has_logged_in){
			model.addAttribute("start", "0");
			model.addAttribute("dsf", new doctor_search_form());
			return "doctors_services";
		}else{
			return "redirect:/login_user";
		}
	}

	@RequestMapping(path = "/login_user/doctor_services/doctor_search")
	public String doctorsearch(doctor_search_form dsf, Model model){
		String c = dsf.getDoctor_name();
		List<Doctor> req = new ArrayList<Doctor>();
		for (Doctor d : dRepo.findAll()) {
			if(d.getName().contains(c) || d.getHospital().getName().contains(c) || d.getDistrict().contains(c) || d.getState().contains(c) || d.getCountry().contains(c)){
				req.add(d);
			}
		}
		model.addAttribute("dn", c);
		if(req.size() == 0){
			model.addAttribute("start", "-1");
		}
		else{
			model.addAttribute("start", "1");
			model.addAttribute("req", req);
		}
		model.addAttribute("dsf", new doctor_search_form());
		return "doctors_services";
	}

	@PostMapping(path = "login_user/doctor_services/doctor_search/profile")
	private String doctorprofile(exp_more e, Model model){
		curr_d = dRepo.getById(e.getId());
		model.addAttribute("status", "0");
		Doctor selecteddoctor = dRepo.getById(e.getId());
		model.addAttribute("d", selecteddoctor);
		model.addAttribute("appform", new appointment_form());
		return "doctor_service_profile";
	}

	@PostMapping(path = "login_user/doctor_services/doctor_search/profile/make_appointment")
	private String doctorprofileappointment(appointment_form appform, Model model){
		Doctor selecteddoctor = dRepo.getById(curr_d.getId());
		Appointment app = new Appointment();
		app.setContact(appform.getContact());
		app.setDescription(appform.getDescription());
		app.setUser(current_user_email);
		app.setDoctorid(curr_d.getId());
		app.setLname(appform.getLname());
		app.setFname(appform.getFname());
		app.setEmail(appform.getEmail());
		app.setStatus("pending");
		app.setDoctorname(curr_d.getName());
		app.setDate(appform.getDate());
		app.setTime(appform.getTime());
		app.setHid(selecteddoctor.getHospital().getId());
		appRepo.save(app);
		model.addAttribute("status", "1");
		model.addAttribute("d", selecteddoctor);
		model.addAttribute("appform", new appointment_form());
		return "doctor_service_profile";
	}

	@PostMapping(path = "/login_user/hospital_search/search_results")
	public String hospitalsearch(hospital_search_form hsf, Model model){
		if(user_has_logged_in){
			List<Hospital> all_h = hRepo.findAll();
			String a = hsf.getHospital_name();
			List<Hospital> req = new ArrayList<Hospital>();
			for (Hospital h : all_h) {
				if(h.getName().contains(a) || h.getDistrict().contains(a) || h.getState().contains(a) || h.getCountry().contains(a) || h.getPincode().toString().contains(a)){
					req.add(h);
				}
			}
			if(req.size() == 0){
				String start="-1";
				model.addAttribute("start", start);
			}
			else{
				String start="1";
				model.addAttribute("start", start);
			}
			String sf = hsf.getHospital_name();
			model.addAttribute("exp_more", new exp_more());
			model.addAttribute("sf", sf);
			model.addAttribute("hsf", new hospital_search_form());
			model.addAttribute("h_info", req);
			System.out.println("111111111111111111111111");
			for (Hospital hospital : req) {
				for(int i=0; i<hospital.getDoctors().size(); i++){
					System.out.println(hospital.getDoctors().get(i).getEmail().toString());
				}
			}
			for (Hospital h : req) {
				System.out.println(h.getFilepath());
			}
			System.out.println("111111111111111111111111");
			return "hospital_search";
		}else{
			return "redirect:/login_user";
		}
	}

	@RequestMapping(path = "/login_user/hospital_search/search_results/home")
	public String hospital_home(exp_more exp_more, Model model){
		System.out.println("---------------------");
		System.out.println(exp_more.getId());
		System.out.println("---------------------");
		h = hRepo.getById(exp_more.getId());
		Hospital searched_h = hRepo.getById(exp_more.getId());
		model.addAttribute("h", searched_h);
		return "hospital_home";
	}

	@GetMapping(path = "/login_user/hospital_search/search_results/home")
	public String hospital_home(Model model){
		model.addAttribute("h", h);
		return "hospital_home";
	}

	@GetMapping(path = "/login_user/hospital_search/search_results/about")
	public String hospital_about(Model model){
		model.addAttribute("h", h);
		return "hospital_about";
	}

	@GetMapping(path = "/login_user/hospital_search/search_results/contact")
	public String hospital_contact(Model model){
		model.addAttribute("h", h);
		User curr_user = userRepository.getById(current_user_email);
		model.addAttribute("user", curr_user);
		model.addAttribute("status", "0");
		model.addAttribute("c_f", new contact_form());
		return "hospital_contact";
	}

	@PostMapping(path = "/login_user/hospital_search/search_results/contact")
	public String hospital_contact1(contact_form cf, Model model){
		user_queries uq = new user_queries();
		uq.setContact(cf.getContact());
		uq.setDescription(cf.getQueries());
		uq.setEmail(current_user_email);
		uq.setFname(cf.getFname());
		uq.setLname(cf.getLname());
		uRepo.save(uq);
		User curr_user = userRepository.getById(current_user_email);
		model.addAttribute("user", curr_user);
		model.addAttribute("status", "1");
		model.addAttribute("h", h);
		model.addAttribute("c_f", new contact_form());
		return "hospital_contact";
	}

	@GetMapping(path = "/login_user/hospital_search/search_results/services")
	public String hospital_services(Model model){
		model.addAttribute("h", h);
		return "hospital_services";
	}

	@GetMapping(path = "/login_user/hospital_search/search_results/doctors")
	public String hospital_doctors(Model model){
		model.addAttribute("h", h);
		model.addAttribute("select_doctor", new select_doctor());
		List<Doctor> d = dRepo.findByHospital(h);
		model.addAttribute("d", d);
		return "hospital_doctors";
	}

	@RequestMapping(path = "/login_user/hospital_search/search_results/doctors/make_appointment")
	public String make_appointment(select_doctor selected_doctor, Model model){
		model.addAttribute("h", h);
		curr_d = dRepo.getById(selected_doctor.getId());
		model.addAttribute("d", curr_d);
		model.addAttribute("a_f", new appointment_form());
		model.addAttribute("status", null);
		return "hospital_doctor_appointment";
	}

	@RequestMapping(path = "/login_user/hospital_search/search_results/doctors/make_appointment/success")
	public String appointment_success(appointment_form af, Model model){
		model.addAttribute("h", h);
		Appointment app = new Appointment();
		app.setContact(af.getContact());
		app.setDescription(af.getDescription());
		app.setDoctorid(curr_d.getId());
		app.setUser(current_user_email);
		app.setLname(af.getLname());
		app.setFname(af.getFname());
		app.setEmail(af.getEmail());
		app.setDate(af.getDate());
		app.setHid(h.getId());
		app.setTime(af.getTime());
		app.setStatus("pending");
		app.setDoctorname(curr_d.getName());
		appRepo.save(app);
		model.addAttribute("d", curr_d);
		model.addAttribute("status", "1");
		model.addAttribute("a_f", new appointment_form());
		return "hospital_doctor_appointment";
	}

	@GetMapping(value="/login_user/my_appointments")
	public String myappointments(Model model) {
		List<Appointment> myapps = appRepo.findByUser(current_user_email);
		List<Doctor> doc = new ArrayList<Doctor>();
		for (Appointment app : myapps) {
			doc.add(dRepo.getById(app.getDoctorid()));
		}
		if(myapps.size() != 0){
			model.addAttribute("p", "1");
			model.addAttribute("ma", myapps);
		}else{
			model.addAttribute("p", "0");
		}
		model.addAttribute("form", new app_cancel_form());
		model.addAttribute("d", doc);
		curr_user = userRepository.getById(current_user_email);
		model.addAttribute("u", curr_user);
		return "my_appointments";
	}
	
	@RequestMapping(value="/login_user/my_appointments/selection")
	public String myappointmentsselection(app_cancel_form form , Model model) {
		appRepo.deleteById(form.getAppid());
		List<Appointment> myapps = appRepo.findByUser(current_user_email);
		List<Doctor> doc = new ArrayList<Doctor>();
		for (Appointment app : myapps) {
			doc.add(dRepo.getById(app.getDoctorid()));
		}
		if(myapps.size() != 0){
			model.addAttribute("p", "1");
			model.addAttribute("ma", myapps);
		}else{
			model.addAttribute("p", "0");
		}
		model.addAttribute("form", new app_cancel_form());
		model.addAttribute("d", doc);
		curr_user = userRepository.getById(current_user_email);
		model.addAttribute("u", curr_user);
		return "my_appointments";
	}
	
	
}
