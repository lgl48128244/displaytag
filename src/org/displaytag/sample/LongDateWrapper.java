/*    */ package org.displaytag.sample;
/*    */ 
/*    */ import java.util.Date;
/*    */ import javax.servlet.jsp.PageContext;
/*    */ import org.apache.commons.lang.time.FastDateFormat;
/*    */ import org.displaytag.decorator.DisplaytagColumnDecorator;
/*    */ import org.displaytag.exception.DecoratorException;
/*    */ import org.displaytag.properties.MediaTypeEnum;
/*    */ 
/*    */ public class LongDateWrapper
/*    */   implements DisplaytagColumnDecorator
/*    */ {
/* 36 */   private FastDateFormat dateFormat = FastDateFormat.getInstance("MM/dd/yyyy HH:mm:ss");
/*    */ 
/*    */   public Object decorate(Object columnValue, PageContext pageContext, MediaTypeEnum media)
/*    */     throws DecoratorException
/*    */   {
/* 44 */     Date date = (Date)columnValue;
/* 45 */     return this.dateFormat.format(date);
/*    */   }
/*    */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.LongDateWrapper
 * JD-Core Version:    0.6.2
 */