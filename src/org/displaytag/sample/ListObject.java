/*     */ package org.displaytag.sample;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ import org.apache.commons.lang.builder.ToStringStyle;
/*     */ 
/*     */ public class ListObject
/*     */   implements Serializable
/*     */ {
/*     */   private static final long serialVersionUID = 42L;
/*  43 */   private static Random random = new Random();
/*     */ 
/*  48 */   private int id = -1;
/*     */   private String name;
/*     */   private String email;
/*     */   private Date date;
/*     */   private double money;
/*     */   private String description;
/*     */   private String longDescription;
/*     */   private String status;
/*     */   private String url;
/*     */   private List subList;
/*     */ 
/*     */   public ListObject()
/*     */   {
/* 100 */     this.id = (random.nextInt(99998) + 1);
/* 101 */     this.money = ((random.nextInt(999998) + 1) / 100);
/*     */ 
/* 103 */     String firstName = RandomSampleUtil.getRandomWord();
/* 104 */     String lastName = RandomSampleUtil.getRandomWord();
/*     */ 
/* 106 */     this.name = (StringUtils.capitalize(firstName) + ' ' + StringUtils.capitalize(lastName));
/*     */ 
/* 108 */     this.email = (firstName + '-' + lastName + '@' + RandomSampleUtil.getRandomWord() + ".com");
/*     */ 
/* 110 */     this.date = RandomSampleUtil.getRandomDate();
/*     */ 
/* 112 */     this.description = (RandomSampleUtil.getRandomWord() + ' ' + RandomSampleUtil.getRandomWord() + "...");
/*     */ 
/* 116 */     this.longDescription = RandomSampleUtil.getRandomSentence(10);
/*     */ 
/* 118 */     this.status = RandomSampleUtil.getRandomWord().toUpperCase();
/*     */ 
/* 121 */     this.subList = new ArrayList();
/* 122 */     this.subList.add(new SubListItem());
/* 123 */     this.subList.add(new SubListItem());
/* 124 */     this.subList.add(new SubListItem());
/*     */ 
/* 126 */     this.url = ("http://www." + lastName + ".org/");
/*     */   }
/*     */ 
/*     */   public int getId()
/*     */   {
/* 135 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(int value)
/*     */   {
/* 144 */     this.id = value;
/*     */   }
/*     */ 
/*     */   public String getName()
/*     */   {
/* 153 */     return this.name;
/*     */   }
/*     */ 
/*     */   public String getEmail()
/*     */   {
/* 162 */     return this.email;
/*     */   }
/*     */ 
/*     */   public void setEmail(String value)
/*     */   {
/* 171 */     this.email = value;
/*     */   }
/*     */ 
/*     */   public Date getDate()
/*     */   {
/* 180 */     return (Date)this.date.clone();
/*     */   }
/*     */ 
/*     */   public double getMoney()
/*     */   {
/* 189 */     return this.money;
/*     */   }
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 198 */     return this.description;
/*     */   }
/*     */ 
/*     */   public String getLongDescription()
/*     */   {
/* 207 */     return this.longDescription;
/*     */   }
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 216 */     return this.status;
/*     */   }
/*     */ 
/*     */   public String getUrl()
/*     */   {
/* 225 */     return this.url;
/*     */   }
/*     */ 
/*     */   public String getNullValue()
/*     */   {
/* 234 */     return null;
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 243 */     return "ListObject(" + this.id + ")";
/*     */   }
/*     */ 
/*     */   public String toDetailedString()
/*     */   {
/* 252 */     return "ID:          " + this.id + "\n" + "Name:        " + this.name + "\n" + "Email:       " + this.email + "\n" + "Date:        " + this.date + "\n" + "Money:       " + this.money + "\n" + "Description: " + this.description + "\n" + "Status:      " + this.status + "\n" + "URL:         " + this.url + "\n";
/*     */   }
/*     */ 
/*     */   public List getSubList()
/*     */   {
/* 284 */     return this.subList;
/*     */   }
/*     */ 
/*     */   public static class SubListItem
/*     */     implements Serializable
/*     */   {
/*     */     private static final long serialVersionUID = 42L;
/*     */     private String itemName;
/*     */     private String itemEmail;
/*     */ 
/*     */     public SubListItem()
/*     */     {
/* 314 */       this.itemName = RandomSampleUtil.getRandomWord();
/* 315 */       this.itemEmail = RandomSampleUtil.getRandomEmail();
/*     */     }
/*     */ 
/*     */     public String getName()
/*     */     {
/* 324 */       return this.itemName;
/*     */     }
/*     */ 
/*     */     public String getEmail()
/*     */     {
/* 333 */       return this.itemEmail;
/*     */     }
/*     */ 
/*     */     public String toString()
/*     */     {
/* 341 */       return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE).append("name", this.itemName).append("email", this.itemEmail).toString();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.ListObject
 * JD-Core Version:    0.6.2
 */