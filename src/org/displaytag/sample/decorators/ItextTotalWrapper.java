/*     */ package org.displaytag.sample.decorators;
/*     */ 
/*     */ import com.lowagie.text.BadElementException;
/*     */ import com.lowagie.text.Cell;
/*     */ import com.lowagie.text.Chunk;
/*     */ import com.lowagie.text.Font;
/*     */ import com.lowagie.text.FontFactory;
/*     */ import com.lowagie.text.Table;
/*     */ 
/*     */ 
/*     */ public class ItextTotalWrapper extends TotalWrapperTemplate
/*     */ {
/*     */   private Table table;
/*     */   private Font font;
/*     */ 
/*     */   public void setTable(Table table)
/*     */   {
/*  53 */     this.table = table;
/*     */   }
/*     */ 
/*     */   public void setFont(Font font)
/*     */   {
/*  63 */     this.font = font;
/*     */   }
/*     */ 
/*     */   public String startRow()
/*     */   {
/*  71 */     this.table.setDefaultCellBorder(2);
/*  72 */     return null;
/*     */   }
/*     */ 
/*     */   protected void writeCityTotal(String city, double total)
/*     */   {
/*  82 */     writeTotal(city, total);
/*     */   }
/*     */ 
/*     */   protected void writeGrandTotal(double total)
/*     */   {
/*  91 */     writeTotal("Grand", total);
/*     */   }
/*     */ 
/*     */   private void writeTotal(String value, double total)
/*     */   {
/* 101 */     if (assertRequiredState())
/*     */     {
/*     */       try
/*     */       {
/* 105 */         this.font = FontFactory.getFont(this.font.getFamilyname(), this.font.size(), 1, this.font.color());
/*     */ 
/* 107 */         this.table.addCell(getCell(""));
/* 108 */         this.table.addCell(getCell(""));
/* 109 */         this.table.addCell(getCell("-------------"));
/* 110 */         this.table.addCell(getCell(""));
/*     */ 
/* 112 */         this.table.addCell(getCell(""));
/* 113 */         this.table.addCell(getCell(value + " Total:"));
/* 114 */         this.table.addCell(getCell(total + ""));
/* 115 */         this.table.addCell(getCell(""));
/*     */       }
/*     */       catch (BadElementException e)
/*     */       {
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private Cell getCell(String value)
/*     */     throws BadElementException
/*     */   {
/* 131 */     Cell cell = new Cell(new Chunk(value, this.font));
/* 132 */     cell.setLeading(8.0F);
/* 133 */     cell.setHorizontalAlignment(0);
/* 134 */     return cell;
/*     */   }
/*     */ 
/*     */   private boolean assertRequiredState()
/*     */   {
/* 143 */     return (this.table != null) && (this.font != null);
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.decorators.ItextTotalWrapper
 * JD-Core Version:    0.6.2
 */