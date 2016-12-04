/*     */ package org.displaytag.sample;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintWriter;
/*     */ import javax.servlet.ServletContext;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ public class DisplaySourceServlet extends HttpServlet
/*     */ {
/*     */   private static final long serialVersionUID = 899149338534L;
/*     */   private static final String EXAMPLE_FOLDER = "/";
/*     */ 
/*     */   protected final void doGet(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  49 */     String jspFile = request.getRequestURI();
/*     */ 
/*  52 */     jspFile = jspFile.substring(0, jspFile.lastIndexOf("."));
/*     */ 
/*  54 */     if (jspFile.lastIndexOf("/") != -1)
/*     */     {
/*  56 */       jspFile = jspFile.substring(jspFile.lastIndexOf("/") + 1);
/*     */     }
/*     */ 
/*  60 */     if (!jspFile.startsWith("example-"))
/*     */     {
/*  62 */       throw new ServletException("Invalid file selected: " + jspFile);
/*     */     }
/*     */ 
/*  65 */     String fullName = "/" + jspFile;
/*     */ 
/*  67 */     InputStream inputStream = getServletContext().getResourceAsStream(fullName);
/*     */ 
/*  69 */     if (inputStream == null)
/*     */     {
/*  71 */       throw new ServletException("Unable to find JSP file: " + jspFile);
/*     */     }
/*     */ 
/*  74 */     response.setContentType("text/html");
/*     */ 
/*  76 */     PrintWriter out = response.getWriter();
/*     */ 
/*  78 */     out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
/*     */ 
/*  80 */     out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
/*  81 */     out.println("<head>");
/*  82 */     out.println("<title>");
/*  83 */     out.println("source for " + jspFile);
/*  84 */     out.println("</title>");
/*  85 */     out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\" />");
/*  86 */     out.println("</head>");
/*  87 */     out.println("<body>");
/*  88 */     out.println("<pre>");
/*  89 */     for (int currentChar = inputStream.read(); currentChar != -1; currentChar = inputStream.read())
/*     */     {
/*  91 */       if (currentChar == 60)
/*     */       {
/*  93 */         out.print("&lt;");
/*     */       }
/*     */       else
/*     */       {
/*  97 */         out.print((char)currentChar);
/*     */       }
/*     */     }
/* 100 */     out.println("</pre>");
/* 101 */     out.println("</body>");
/* 102 */     out.println("</html>");
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.DisplaySourceServlet
 * JD-Core Version:    0.6.2
 */