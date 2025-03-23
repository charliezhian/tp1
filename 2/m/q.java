package m;

public class q {
  public static String ALLATORIxDEMO(String s) {
    // Byte code:
    //   0: iconst_5
    //   1: iconst_4
    //   2: ishl
    //   3: iconst_2
    //   4: iconst_1
    //   5: ishl
    //   6: ixor
    //   7: iconst_5
    //   8: iconst_4
    //   9: ishl
    //   10: iconst_3
    //   11: ixor
    //   12: iconst_5
    //   13: iconst_4
    //   14: ishl
    //   15: iconst_3
    //   16: iconst_5
    //   17: ixor
    //   18: iconst_1
    //   19: ishl
    //   20: ixor
    //   21: aload_0
    //   22: checkcast java/lang/String
    //   25: dup
    //   26: astore_0
    //   27: invokevirtual length : ()I
    //   30: dup
    //   31: newarray char
    //   33: iconst_1
    //   34: dup
    //   35: pop2
    //   36: swap
    //   37: iconst_1
    //   38: isub
    //   39: dup_x2
    //   40: istore_3
    //   41: astore_1
    //   42: istore #4
    //   44: dup_x2
    //   45: pop2
    //   46: istore_2
    //   47: iflt -> 87
    //   50: aload_1
    //   51: aload_0
    //   52: iload_3
    //   53: dup_x1
    //   54: invokevirtual charAt : (I)C
    //   57: iinc #3, -1
    //   60: iload_2
    //   61: ixor
    //   62: i2c
    //   63: castore
    //   64: iload_3
    //   65: iflt -> 87
    //   68: aload_1
    //   69: aload_0
    //   70: iload_3
    //   71: iinc #3, -1
    //   74: dup_x1
    //   75: invokevirtual charAt : (I)C
    //   78: iload #4
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: iload_3
    //   84: goto -> 47
    //   87: new java/lang/String
    //   90: dup
    //   91: aload_1
    //   92: invokespecial <init> : ([C)V
    //   95: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	96	0	s	Ljava/lang/String;
  }
  
  public String IiIIiIIIii(String url) {
    // Byte code:
    //   0: new m/l
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Lm/q;)V
    //   8: astore_2
    //   9: ldc '4_9T%'
    //   11: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   14: astore_3
    //   15: iconst_0
    //   16: dup
    //   17: istore #4
    //   19: aload_2
    //   20: invokevirtual size : ()I
    //   23: if_icmpge -> 106
    //   26: new java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: iconst_0
    //   34: aload_1
    //   35: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 'CHJC'
    //   40: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: aload_2
    //   47: iload #4
    //   49: invokevirtual get : (I)Ljava/lang/Object;
    //   52: checkcast java/lang/String
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual toString : ()Ljava/lang/String;
    //   61: invokestatic get : (Ljava/lang/CharSequence;)Lcom/github/kevinsawicki/http/HttpRequest;
    //   64: invokevirtual code : ()I
    //   67: dup
    //   68: istore #5
    //   70: sipush #200
    //   73: if_icmpne -> 97
    //   76: aload_2
    //   77: iload #4
    //   79: invokevirtual get : (I)Ljava/lang/Object;
    //   82: checkcast java/lang/String
    //   85: astore_3
    //   86: goto -> 97
    //   89: athrow
    //   90: astore #5
    //   92: aload #5
    //   94: invokevirtual printStackTrace : ()V
    //   97: iinc #4, 1
    //   100: iload #4
    //   102: goto -> 19
    //   105: athrow
    //   106: aload_3
    //   107: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #208	-> 0
    //   #238	-> 9
    //   #312	-> 15
    //   #104	-> 26
    //   #161	-> 70
    //   #323	-> 76
    //   #139	-> 86
    //   #256	-> 90
    //   #233	-> 92
    //   #312	-> 97
    //   #69	-> 106
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	108	0	this	Lm/q;
    //   0	108	1	url	Ljava/lang/String;
    //   9	99	2	iiiIiiIiII	Ljava/util/ArrayList;
    //   15	93	3	iiiIiiIiII	Ljava/lang/String;
    //   17	91	4	iiiIiiIiII	I
    //   92	16	5	iiiIiiIiII	Ljava/lang/Exception;
    //   68	32	5	iiiIiiIiII	I
    // Exception table:
    //   from	to	target	type
    //   26	86	90	java/lang/Exception
  }
}


/* Location:              C:\Users\zyh\Desktop\ThinkphpGUI-1.3-SNAPSHOT.jar!\m\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */