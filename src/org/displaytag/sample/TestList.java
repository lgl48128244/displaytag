/*     */ package org.displaytag.sample;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ 
/*     */ public class TestList extends ArrayList
/*     */ {
/*     */   private static final long serialVersionUID = 899149338534L;
/*     */ 
/*     */   public TestList()
/*     */   {
/*  41 */     for (int j = 0; j < 60; j++)
/*     */     {
/*  43 */       add(new ListObject());
/*     */     }
/*     */   }
/*     */ 
/*     */   public TestList(int size, boolean duplicates)
/*     */   {
/*  54 */     if (duplicates)
/*     */     {
/*  57 */       for (int j = 0; j < size; j++)
/*     */       {
/*  60 */         ListObject object1 = new ListObject();
/*  61 */         ListObject object2 = new ListObject();
/*  62 */         ListObject object3 = new ListObject();
/*     */ 
/*  64 */         int random = new Random().nextInt(3);
/*  65 */         for (int k = 0; k <= random; k++)
/*     */         {
/*  67 */           add(object1);
/*     */         }
/*     */ 
/*  70 */         object1.setId(object2.getId());
/*     */ 
/*  72 */         random = new Random().nextInt(3);
/*  73 */         for (int k = 0; k <= random; k++)
/*     */         {
/*  75 */           add(object1);
/*  76 */           add(object2);
/*     */         }
/*     */ 
/*  79 */         object1.setEmail(object3.getEmail());
/*     */ 
/*  81 */         random = new Random().nextInt(3);
/*  82 */         for (int k = 0; k <= random; k++)
/*     */         {
/*  84 */           add(object1);
/*     */         }
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/*  90 */       for (int j = 0; j < size; j++)
/*     */       {
/*  92 */         add(new ListObject());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public ListObject getItem(int index)
/*     */   {
/* 104 */     return (ListObject)super.get(index);
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.TestList
 * JD-Core Version:    0.6.2
 */