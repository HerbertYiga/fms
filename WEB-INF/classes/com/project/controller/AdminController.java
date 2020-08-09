/*    */ package com.project.controller;
/*    */ 
/*    */ import com.project.model.User;
/*    */ import com.project.service.CropService;
/*    */ import com.project.service.UserService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.beans.factory.annotation.Qualifier;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.ui.Model;
/*    */ import org.springframework.web.bind.annotation.ModelAttribute;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ 
/*    */ @Controller
/*    */ public class AdminController {
/*    */   private UserService userService;
/*    */   
/*    */   private CropService cropService;
/*    */   
/*    */   @Autowired(required = true)
/*    */   @Qualifier("cropService")
/*    */   public void setCropService(CropService cropService) {
/* 28 */     this.cropService = cropService;
/*    */   }
/*    */   
/*    */   @Autowired(required = true)
/*    */   @Qualifier("userService")
/*    */   public void setUserService(UserService userService) {
/* 36 */     this.userService = userService;
/*    */   }
/*    */   
/*    */   @RequestMapping({"adminAddUser"})
/*    */   public String adminAddUser(@ModelAttribute("user") User user, Model model) {
/* 42 */     return "adminAddUser";
/*    */   }
/*    */   
/*    */   @RequestMapping({"adminSaveUser"})
/*    */   public String adminSaveUser(@ModelAttribute("user") User user, Model model) {
/* 47 */     this.userService.addUser(user);
/* 49 */     return "redirect:/adminViewUser";
/*    */   }
/*    */   
/*    */   @RequestMapping({"adminViewUser"})
/*    */   public String adminViewUser(@ModelAttribute("user") User user, Model model) {
/* 55 */     List<User> list = this.userService.listUser();
/* 56 */     model.addAttribute("list", list);
/* 58 */     return "adminViewUser";
/*    */   }
/*    */   
/*    */   @RequestMapping({"admin"})
/*    */   public String admin() {
/* 64 */     return "admin";
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\controller\AdminController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */