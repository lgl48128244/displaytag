/*    */ package org.displaytag.sample.decorators;
/*    */ 
/*    */ public class HtmlTotalWrapper extends TotalWrapperTemplate
/*    */ {
/*    */   protected void writeCityTotal(String city, double total)
/*    */   {
/* 32 */     StringBuffer buffer = getStringBuffer();
/* 33 */     buffer.append("\n<tr>\n<td>&nbsp;</td><td>&nbsp;</td><td><hr/></td>");
/* 34 */     buffer.append("\n<td>&nbsp;</td></tr>");
/* 35 */     buffer.append("\n<tr><td>&nbsp;</td>");
/* 36 */     buffer.append("\n<td align=\"right\"><strong>" + city + " Total:</strong></td>\n<td><strong>");
/*    */ 
/* 38 */     buffer.append(total);
/* 39 */     buffer.append("</strong></td>\n<td>&nbsp;</td>\n</tr>");
/* 40 */     buffer.append("\n<tr>\n<td colspan=\"4\">&nbsp;\n</td>\n</tr>");
/*    */   }
/*    */ 
/*    */   protected void writeGrandTotal(double total)
/*    */   {
/* 49 */     StringBuffer buffer = getStringBuffer();
/* 50 */     buffer.append("<tr><td colspan=\"4\"><hr/></td></tr>");
/* 51 */     buffer.append("<tr><td>&nbsp;</td>");
/* 52 */     buffer.append("<td align=\"right\"><strong>Grand Total:</strong></td><td><strong>");
/* 53 */     buffer.append(total);
/* 54 */     buffer.append("</strong></td><td>&nbsp;</td></tr>");
/*    */   }
/*    */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.decorators.HtmlTotalWrapper
 * JD-Core Version:    0.6.2
 */