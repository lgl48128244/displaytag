/*     */ package org.displaytag.sample.decorators;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang.ObjectUtils;
/*     */ import org.displaytag.decorator.TableDecorator;
/*     */ import org.displaytag.sample.ReportableListObject;
/*     */ 
/*     */ public abstract class TotalWrapperTemplate extends TableDecorator
/*     */ {
/*     */   private double grandTotal;
/*     */   private double cityTotal;
/*     */   private StringBuffer buffer;
/*     */ 
/*     */   public final String finishRow()
/*     */   {
/*  52 */     int listindex = ((List)getDecoratedObject()).indexOf(getCurrentRowObject());
/*  53 */     ReportableListObject reportableObject = (ReportableListObject)getCurrentRowObject();
/*  54 */     String nextCity = null;
/*     */ 
/*  56 */     this.cityTotal += reportableObject.getAmount();
/*  57 */     this.grandTotal += reportableObject.getAmount();
/*     */ 
/*  59 */     if (listindex != ((List)getDecoratedObject()).size() - 1)
/*     */     {
/*  61 */       nextCity = ((ReportableListObject)((List)getDecoratedObject()).get(listindex + 1)).getCity();
/*     */     }
/*     */ 
/*  64 */     this.buffer = new StringBuffer(1000);
/*     */ 
/*  67 */     if (!ObjectUtils.equals(nextCity, reportableObject.getCity()))
/*     */     {
/*  69 */       writeCityTotal(reportableObject.getCity(), this.cityTotal);
/*  70 */       this.cityTotal = 0.0D;
/*     */     }
/*     */ 
/*  74 */     if (getViewIndex() == ((List)getDecoratedObject()).size() - 1)
/*     */     {
/*  76 */       writeGrandTotal(this.grandTotal);
/*     */     }
/*     */ 
/*  79 */     return this.buffer.toString();
/*     */   }
/*     */ 
/*     */   protected abstract void writeCityTotal(String paramString, double paramDouble);
/*     */ 
/*     */   protected abstract void writeGrandTotal(double paramDouble);
/*     */ 
/*     */   protected StringBuffer getStringBuffer()
/*     */   {
/* 101 */     return this.buffer;
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.decorators.TotalWrapperTemplate
 * JD-Core Version:    0.6.2
 */