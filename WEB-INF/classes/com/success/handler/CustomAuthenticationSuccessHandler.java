/*    */ package com.success.handler;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.Set;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.springframework.security.core.Authentication;
/*    */ import org.springframework.security.core.authority.AuthorityUtils;
/*    */ import org.springframework.security.core.context.SecurityContextHolder;
/*    */ import org.springframework.security.core.userdetails.User;
/*    */ import org.springframework.security.web.DefaultRedirectStrategy;
/*    */ import org.springframework.security.web.RedirectStrategy;
/*    */ import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
/*    */ 
/*    */ public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
/* 21 */   private RedirectStrategy redirectStrategy = (RedirectStrategy)new DefaultRedirectStrategy();
/*    */   
/*    */   public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
/* 26 */     HttpSession session = request.getSession();
/* 29 */     User authUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
/* 30 */     session.setAttribute("username", authUser.getUsername());
/* 31 */     session.setAttribute("authorites", authentication.getAuthorities());
/* 34 */     String targetUrl = determineTargetUrl(authentication, request);
/* 35 */     this.redirectStrategy.sendRedirect(request, response, targetUrl);
/*    */   }
/*    */   
/*    */   protected String determineTargetUrl(Authentication authentication, HttpServletRequest request) {
/* 41 */     Set<String> authorities = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
/* 42 */     if (authorities.contains("ROLE_SystemAdmin"))
/* 44 */       return "/admin"; 
/* 47 */     if (authorities.contains("ROLE_farmManger"))
/* 48 */       return "/user"; 
/* 55 */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public RedirectStrategy getRedirectStrategy() {
/* 61 */     return this.redirectStrategy;
/*    */   }
/*    */   
/*    */   public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
/* 66 */     this.redirectStrategy = redirectStrategy;
/*    */   }
/*    */ }


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\success\handler\CustomAuthenticationSuccessHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */