package com.tencent.mm.compatible.d;

import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.t;
import java.io.File;
import java.util.Map;

public final class m
{
  private static Map bib = null;
  
  private static boolean c(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }
  
  private static String cU(String paramString)
  {
    localObject = paramString;
    if (paramString != null)
    {
      String str = paramString;
      localObject = paramString;
      try
      {
        if (paramString.length() > 0) {
          for (;;)
          {
            str = paramString;
            localObject = paramString;
            if (c(paramString.charAt(0))) {
              break;
            }
            str = paramString;
            if (paramString.length() == 1) {
              return null;
            }
            str = paramString;
            paramString = paramString.substring(1);
          }
        }
        return (String)localObject;
      }
      catch (Exception paramString)
      {
        localObject = str;
      }
    }
  }
  
  private static String cV(String paramString)
  {
    int j;
    for (int i = 0;; i = j)
    {
      j = i + 1;
      try
      {
        if ((!c(paramString.charAt(i))) || (paramString.length() <= j))
        {
          i = j - 1;
          String str = paramString;
          if (paramString.length() > i + 1)
          {
            str = paramString;
            if (i > 0) {
              str = paramString.substring(0, i);
            }
          }
          return str;
        }
      }
      catch (Exception localException)
      {
        return paramString;
      }
    }
  }
  
  private static String d(Map paramMap, String paramString)
  {
    return (String)paramMap.get(paramString);
  }
  
  public static String oA()
  {
    if (bib == null) {
      bib = oF();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(": ");
    localStringBuilder.append(d(bib, "Features"));
    localStringBuilder.append(": ");
    localStringBuilder.append(d(bib, "Processor"));
    localStringBuilder.append(": ");
    localStringBuilder.append(d(bib, "CPU architecture"));
    localStringBuilder.append(": ");
    localStringBuilder.append(d(bib, "Hardware"));
    localStringBuilder.append(": ");
    localStringBuilder.append(d(bib, "Serial"));
    return localStringBuilder.toString();
  }
  
  public static boolean oB()
  {
    if (bib == null) {
      bib = oF();
    }
    if (bib != null)
    {
      String str = d(bib, "Features");
      if ((str != null) && (str.contains("neon"))) {}
      while ((str != null) && (str.contains("asimd"))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean oC()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 4) {}
      for (int i = 1; i != 0; i = 0)
      {
        boolean bool = oB();
        if (!bool) {
          break;
        }
        return true;
      }
      return false;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      t.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public static boolean oD()
  {
    if (bib == null) {
      bib = oF();
    }
    if (bib != null)
    {
      String str = d(bib, "CPU architecture");
      t.d("!24@L1cC8s87OdiHYjVaLdwXjw==", "arch " + str);
      if (str != null) {
        try
        {
          if (str.length() > 0)
          {
            int i = Integer.parseInt(cV(cU(str)));
            t.d("!24@L1cC8s87OdiHYjVaLdwXjw==", "armarch " + i);
            if (i >= 6) {
              return true;
            }
          }
        }
        catch (Exception localException) {}
      }
    }
    return false;
  }
  
  public static int oE()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new n()).length;
      return i;
    }
    catch (Exception localException) {}
    return 1;
  }
  
  /* Error */
  public static java.util.HashMap oF()
  {
    // Byte code:
    //   0: new 158	java/util/HashMap
    //   3: dup
    //   4: invokespecial 159	java/util/HashMap:<init>	()V
    //   7: astore_3
    //   8: aconst_null
    //   9: astore_1
    //   10: aconst_null
    //   11: astore_0
    //   12: new 161	java/lang/ProcessBuilder
    //   15: dup
    //   16: iconst_2
    //   17: anewarray 19	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: ldc -93
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: ldc -91
    //   29: aastore
    //   30: invokespecial 168	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   33: invokevirtual 172	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   36: invokevirtual 178	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   39: astore_2
    //   40: aload_2
    //   41: astore_0
    //   42: aload_2
    //   43: astore_1
    //   44: new 180	java/io/BufferedReader
    //   47: dup
    //   48: new 182	java/io/InputStreamReader
    //   51: dup
    //   52: aload_2
    //   53: invokespecial 185	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   56: invokespecial 188	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   59: astore 4
    //   61: aload_2
    //   62: astore_0
    //   63: aload_2
    //   64: astore_1
    //   65: aload 4
    //   67: invokevirtual 191	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   70: astore 5
    //   72: aload 5
    //   74: ifnull +113 -> 187
    //   77: aload_2
    //   78: astore_0
    //   79: aload_2
    //   80: astore_1
    //   81: aload 5
    //   83: ldc -63
    //   85: iconst_2
    //   86: invokevirtual 197	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   89: astore 6
    //   91: aload 6
    //   93: ifnull -32 -> 61
    //   96: aload_2
    //   97: astore_0
    //   98: aload_2
    //   99: astore_1
    //   100: aload 6
    //   102: arraylength
    //   103: iconst_2
    //   104: if_icmplt -43 -> 61
    //   107: aload_2
    //   108: astore_0
    //   109: aload_2
    //   110: astore_1
    //   111: aload 6
    //   113: iconst_0
    //   114: aaload
    //   115: invokevirtual 200	java/lang/String:trim	()Ljava/lang/String;
    //   118: astore 5
    //   120: aload_2
    //   121: astore_0
    //   122: aload_2
    //   123: astore_1
    //   124: aload 6
    //   126: iconst_1
    //   127: aaload
    //   128: invokevirtual 200	java/lang/String:trim	()Ljava/lang/String;
    //   131: astore 6
    //   133: aload_2
    //   134: astore_0
    //   135: aload_2
    //   136: astore_1
    //   137: aload_3
    //   138: aload 5
    //   140: invokevirtual 201	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   143: ifnonnull -82 -> 61
    //   146: aload_2
    //   147: astore_0
    //   148: aload_2
    //   149: astore_1
    //   150: aload_3
    //   151: aload 5
    //   153: aload 6
    //   155: invokevirtual 205	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   158: pop
    //   159: goto -98 -> 61
    //   162: astore_2
    //   163: aload_0
    //   164: astore_1
    //   165: ldc 120
    //   167: aload_2
    //   168: ldc -49
    //   170: iconst_0
    //   171: anewarray 4	java/lang/Object
    //   174: invokestatic 110	com/tencent/mm/sdk/platformtools/t:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload_0
    //   178: ifnull +7 -> 185
    //   181: aload_0
    //   182: invokevirtual 212	java/io/InputStream:close	()V
    //   185: aload_3
    //   186: areturn
    //   187: aload_2
    //   188: ifnull -3 -> 185
    //   191: aload_2
    //   192: invokevirtual 212	java/io/InputStream:close	()V
    //   195: aload_3
    //   196: areturn
    //   197: astore_0
    //   198: aload_3
    //   199: areturn
    //   200: astore_0
    //   201: aload_1
    //   202: ifnull +7 -> 209
    //   205: aload_1
    //   206: invokevirtual 212	java/io/InputStream:close	()V
    //   209: aload_0
    //   210: athrow
    //   211: astore_0
    //   212: aload_3
    //   213: areturn
    //   214: astore_1
    //   215: goto -6 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   11	171	0	localObject1	Object
    //   197	1	0	localIOException1	java.io.IOException
    //   200	10	0	localObject2	Object
    //   211	1	0	localIOException2	java.io.IOException
    //   9	197	1	localObject3	Object
    //   214	1	1	localIOException3	java.io.IOException
    //   39	110	2	localInputStream	java.io.InputStream
    //   162	30	2	localIOException4	java.io.IOException
    //   7	206	3	localHashMap	java.util.HashMap
    //   59	7	4	localBufferedReader	java.io.BufferedReader
    //   70	82	5	str	String
    //   89	65	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   12	40	162	java/io/IOException
    //   44	61	162	java/io/IOException
    //   65	72	162	java/io/IOException
    //   81	91	162	java/io/IOException
    //   100	107	162	java/io/IOException
    //   111	120	162	java/io/IOException
    //   124	133	162	java/io/IOException
    //   137	146	162	java/io/IOException
    //   150	159	162	java/io/IOException
    //   191	195	197	java/io/IOException
    //   12	40	200	finally
    //   44	61	200	finally
    //   65	72	200	finally
    //   81	91	200	finally
    //   100	107	200	finally
    //   111	120	200	finally
    //   124	133	200	finally
    //   137	146	200	finally
    //   150	159	200	finally
    //   165	177	200	finally
    //   181	185	211	java/io/IOException
    //   205	209	214	java/io/IOException
  }
  
  public static Map oz()
  {
    if (bib == null) {
      bib = oF();
    }
    return bib;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.compatible.d.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */