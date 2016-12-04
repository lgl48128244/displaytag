/*     */ package org.displaytag.sample;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang.builder.CompareToBuilder;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ import org.apache.commons.lang.builder.ToStringStyle;
/*     */ 
/*     */ public class ReportableListObject
/*     */   implements Comparable, Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 899149338534L;
/*  39 */   private static Random random = new Random();
/*     */ 
/*  44 */   private static String[] cities = { "Roma", "Olympia", "Neapolis", "Carthago" };
/*     */ 
/*  50 */   private static String[] projects = { "Taxes", "Arts", "Army", "Gladiators" };
/*     */   private String city;
/*     */   private String project;
/*     */   private String task;
/*     */   private double amount;
/*     */   private int count;
/*     */ 
/*     */   public ReportableListObject()
/*     */   {
/*  83 */     this.amount = ((random.nextInt(99999) + 1) / 100);
/*  84 */     this.city = cities[random.nextInt(cities.length)];
/*  85 */     this.project = projects[random.nextInt(projects.length)];
/*  86 */     this.task = RandomSampleUtil.getRandomSentence(4);
/*  87 */     this.count = random.nextInt(10);
/*     */   }
/*     */ 
/*     */   public String getCity()
/*     */   {
/*  96 */     return this.city;
/*     */   }
/*     */ 
/*     */   public int getCount()
/*     */   {
/* 105 */     return this.count;
/*     */   }
/*     */ 
/*     */   public String getProject()
/*     */   {
/* 114 */     return this.project;
/*     */   }
/*     */ 
/*     */   public String getTask()
/*     */   {
/* 123 */     return this.task;
/*     */   }
/*     */ 
/*     */   public double getAmount()
/*     */   {
/* 132 */     return this.amount;
/*     */   }
/*     */ 
/*     */   public int compareTo(Object object)
/*     */   {
/* 140 */     ReportableListObject myClass = (ReportableListObject)object;
/* 141 */     return new CompareToBuilder().append(this.project, myClass.project).append(this.amount, myClass.amount).append(this.city, myClass.city).append(this.task, myClass.task).toComparison();
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 151 */     return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).append("project", this.project).append("amount", this.amount).append("city", this.city).append("task", this.task).toString();
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.ReportableListObject
 * JD-Core Version:    0.6.2
 */