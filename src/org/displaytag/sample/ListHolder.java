/*    */ package org.displaytag.sample;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class ListHolder
/*    */ {
/*    */   private List list;
/*    */ 
/*    */   public ListHolder()
/*    */   {
/* 36 */     this.list = new TestList(15, false);
/*    */   }
/*    */ 
/*    */   public final List getList()
/*    */   {
/* 45 */     return this.list;
/*    */   }
/*    */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.ListHolder
 * JD-Core Version:    0.6.2
 */