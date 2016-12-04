/*     */ package org.displaytag.sample;
/*     */ 
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Random;
/*     */ 
/*     */ public final class RandomSampleUtil
/*     */ {
/*  30 */   private static String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consetetur", "sadipscing", "elitr", "sed", "diam", "nonumy", "eirmod", "tempor", "invidunt", "ut", "labore", "et", "dolore", "magna", "aliquyam", "erat", "sed", "diam", "voluptua", "At", "vero", "eos", "et", "accusam", "et", "justo", "duo", "dolores", "et", "ea", "rebum", "Stet", "clita", "kasd", "gubergren", "no", "sea", "takimata", "sanctus", "est" };
/*     */ 
/*  79 */   private static Random random = new Random();
/*     */ 
/*     */   public static String getRandomWord()
/*     */   {
/*  95 */     return words[random.nextInt(words.length)];
/*     */   }
/*     */ 
/*     */   public static String getRandomSentence(int wordNumber)
/*     */   {
/* 105 */     StringBuffer buffer = new StringBuffer(wordNumber * 12);
/*     */ 
/* 107 */     int j = 0;
/* 108 */     while (j < wordNumber)
/*     */     {
/* 110 */       buffer.append(getRandomWord());
/* 111 */       buffer.append(" ");
/* 112 */       j++;
/*     */     }
/* 114 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   public static String getRandomEmail()
/*     */   {
/* 123 */     return getRandomWord() + "@" + getRandomWord() + ".com";
/*     */   }
/*     */ 
/*     */   public static Date getRandomDate()
/*     */   {
/* 133 */     Calendar calendar = Calendar.getInstance();
/* 134 */     calendar.add(5, 365 - random.nextInt(730));
/* 135 */     return calendar.getTime();
/*     */   }
/*     */ }

/* Location:           C:\apache-tomcat-7.0.59\webapps\displaytag-examples-1.2\WEB-INF\classes\
 * Qualified Name:     org.displaytag.sample.RandomSampleUtil
 * JD-Core Version:    0.6.2
 */