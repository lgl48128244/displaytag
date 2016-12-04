/*    */ package org.displaytag.sample.decorators;
/*    */ 
/*    */ import org.apache.poi.hssf.usermodel.HSSFCell;
/*    */ import org.apache.poi.hssf.usermodel.HSSFRichTextString;
/*    */ import org.apache.poi.hssf.usermodel.HSSFRow;
/*    */ import org.apache.poi.hssf.usermodel.HSSFSheet;
/*    */ import org.displaytag.decorator.hssf.DecoratesHssf;
/*    */ 
/*    */ public class HssfTotalWrapper extends TotalWrapperTemplate
/*    */   implements DecoratesHssf
/*    */ {
/*    */   private HSSFSheet sheet;
/*    */   private HSSFCell currentCell;
/*    */   private HSSFRow currentRow;
/*    */   private int colNum;
/*    */ 
/*    */   protected void writeCityTotal(String city, double total)
/*    */   {
/* 41 */     writeTotal(city, total);
/*    */   }
/*    */ 
/*    */   private void writeTotal(String value, double total)
/*    */   {
/* 46 */     if (assertRequiredState())
/*    */     {
/* 48 */       int rowNum = this.sheet.getLastRowNum();
/* 49 */       this.currentRow = this.sheet.createRow(++rowNum);
/* 50 */       this.colNum = 0;
/* 51 */       prepareCell();
/* 52 */       prepareCell();
/* 53 */       prepareCell();
/* 54 */       this.currentCell.setCellValue(new HSSFRichTextString("------------"));
/*    */ 
/* 56 */       this.currentRow = this.sheet.createRow(++rowNum);
/* 57 */       this.colNum = 0;
/* 58 */       prepareCell();
/* 59 */       prepareCell();
/* 60 */       this.currentCell.setCellValue(new HSSFRichTextString(value + " Total:"));
/* 61 */       prepareCell();
/* 62 */       this.currentCell.setCellValue(total);
/*    */     }
/*    */   }
/*    */ 
/*    */   private void prepareCell()
/*    */   {
/* 68 */     this.currentCell = this.currentRow.createCell(this.colNum++);
/*    */   }
/*    */ 
/*    */   protected void writeGrandTotal(double total)
/*    */   {
/* 73 */     writeTotal("Grand", total);
/*    */   }
/*    */ 
/*    */   public void setSheet(HSSFSheet sheet)
/*    */   {
/* 78 */     this.sheet = sheet;
/*    */   }
/*    */ 
/*    */   private boolean assertRequiredState()
/*    */   {
/* 87 */     return this.sheet != null;
/*    */   }
/*    */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.decorators.HssfTotalWrapper
 * JD-Core Version:    0.6.2
 */