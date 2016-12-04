/*    */ package org.displaytag.sample;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ 
/*    */ public class ReportList extends ArrayList
/*    */ {
/*    */   private static final long serialVersionUID = 899149338534L;
/*    */ 
/*    */   public ReportList()
/*    */   {
/* 41 */     for (int j = 0; j < 20; j++)
/*    */     {
/* 43 */       add(new ReportableListObject());
/*    */     }
/*    */ 
/* 46 */     Collections.sort(this);
/*    */   }
/*    */ 
/*    */   public ReportList(int size)
/*    */   {
/* 57 */     for (int j = 0; j < size; j++)
/*    */     {
/* 59 */       add(new ReportableListObject());
/*    */     }
/*    */ 
/* 62 */     Collections.sort(this);
/*    */   }
/*    */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.ReportList
 * JD-Core Version:    0.6.2
 */