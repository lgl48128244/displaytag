/*     */ package org.displaytag.sample.decorators;
/*     */ 
/*     */ import java.text.DecimalFormat;
/*     */ import org.apache.commons.lang.time.FastDateFormat;
/*     */ import org.displaytag.decorator.TableDecorator;
/*     */ import org.displaytag.sample.ListObject;
/*     */ 
/*     */ public class Wrapper extends TableDecorator
/*     */ {
/*     */   private FastDateFormat dateFormat;
/*     */   private DecimalFormat moneyFormat;
/*     */ 
/*     */   public Wrapper()
/*     */   {
/*  50 */     this.dateFormat = FastDateFormat.getInstance("MM/dd/yy");
/*  51 */     this.moneyFormat = new DecimalFormat("$ #,###,###.00");
/*     */   }
/*     */ 
/*     */   public String getNullValue()
/*     */   {
/*  60 */     return null;
/*     */   }
/*     */ 
/*     */   public String getDate()
/*     */   {
/*  69 */     return this.dateFormat.format(((ListObject)getCurrentRowObject()).getDate());
/*     */   }
/*     */ 
/*     */   public String getMoney()
/*     */   {
/*  78 */     return this.moneyFormat.format(((ListObject)getCurrentRowObject()).getMoney());
/*     */   }
/*     */ 
/*     */   public String getLink1()
/*     */   {
/*  87 */     ListObject object = (ListObject)getCurrentRowObject();
/*  88 */     int index = getListIndex();
/*     */ 
/*  90 */     return "<a href=\"details.jsp?index=" + index + "\">" + object.getId() + "</a>";
/*     */   }
/*     */ 
/*     */   public String getLink2()
/*     */   {
/* 104 */     ListObject object = (ListObject)getCurrentRowObject();
/* 105 */     int id = object.getId();
/*     */ 
/* 107 */     return "<a href=\"details.jsp?id=" + id + "&amp;action=view\">View</a> | " + "<a href=\"details.jsp?id=" + id + "&amp;action=edit\">Edit</a> | " + "<a href=\"details.jsp?id=" + id + "&amp;action=delete\">Delete</a>";
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.decorators.Wrapper
 * JD-Core Version:    0.6.2
 */