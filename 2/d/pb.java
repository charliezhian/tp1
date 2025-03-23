package d;

public class pb {
  public static String IiIIiIIIii(String s) {
    // Byte code:
    //   0: iconst_5
    //   1: iconst_3
    //   2: ishl
    //   3: iconst_2
    //   4: ixor
    //   5: iconst_2
    //   6: iconst_3
    //   7: ishl
    //   8: iconst_2
    //   9: ixor
    //   10: iconst_3
    //   11: dup
    //   12: ishl
    //   13: iconst_1
    //   14: ixor
    //   15: aload_0
    //   16: checkcast java/lang/String
    //   19: dup
    //   20: astore_0
    //   21: invokevirtual length : ()I
    //   24: dup
    //   25: newarray char
    //   27: iconst_1
    //   28: dup
    //   29: iconst_1
    //   30: dup
    //   31: pop2
    //   32: pop2
    //   33: swap
    //   34: iconst_1
    //   35: isub
    //   36: dup_x2
    //   37: istore_3
    //   38: astore_1
    //   39: istore #4
    //   41: dup_x2
    //   42: pop
    //   43: istore_2
    //   44: pop
    //   45: iflt -> 86
    //   48: aload_1
    //   49: aload_0
    //   50: iload_3
    //   51: dup_x1
    //   52: invokevirtual charAt : (I)C
    //   55: iload_2
    //   56: ixor
    //   57: i2c
    //   58: iinc #3, -1
    //   61: castore
    //   62: iload_3
    //   63: iflt -> 86
    //   66: aload_1
    //   67: aload_0
    //   68: iload_3
    //   69: dup_x1
    //   70: invokevirtual charAt : (I)C
    //   73: iload #4
    //   75: iinc #3, -1
    //   78: ixor
    //   79: i2c
    //   80: castore
    //   81: iload_3
    //   82: goto -> 45
    //   85: athrow
    //   86: new java/lang/String
    //   89: dup
    //   90: aload_1
    //   91: invokespecial <init> : ([C)V
    //   94: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	95	0	s	Ljava/lang/String;
  }
  
  public static String ALLATORIxDEMO(String s) {
    // Byte code:
    //   0: iconst_3
    //   1: iconst_5
    //   2: ixor
    //   3: iconst_4
    //   4: ishl
    //   5: iconst_3
    //   6: iconst_5
    //   7: ixor
    //   8: iconst_1
    //   9: ishl
    //   10: ixor
    //   11: iconst_4
    //   12: iconst_3
    //   13: ishl
    //   14: iconst_3
    //   15: ixor
    //   16: iconst_2
    //   17: iconst_5
    //   18: ixor
    //   19: iconst_4
    //   20: ishl
    //   21: iconst_2
    //   22: iconst_5
    //   23: ixor
    //   24: ixor
    //   25: aload_0
    //   26: checkcast java/lang/String
    //   29: dup
    //   30: astore_0
    //   31: invokevirtual length : ()I
    //   34: dup
    //   35: newarray char
    //   37: iconst_1
    //   38: dup
    //   39: pop2
    //   40: swap
    //   41: iconst_1
    //   42: isub
    //   43: dup_x2
    //   44: istore_3
    //   45: astore_1
    //   46: istore #4
    //   48: dup_x2
    //   49: pop2
    //   50: istore_2
    //   51: iflt -> 91
    //   54: aload_1
    //   55: aload_0
    //   56: iload_3
    //   57: dup_x1
    //   58: invokevirtual charAt : (I)C
    //   61: iinc #3, -1
    //   64: iload_2
    //   65: ixor
    //   66: i2c
    //   67: castore
    //   68: iload_3
    //   69: iflt -> 91
    //   72: aload_1
    //   73: aload_0
    //   74: iload_3
    //   75: iinc #3, -1
    //   78: dup_x1
    //   79: invokevirtual charAt : (I)C
    //   82: iload #4
    //   84: ixor
    //   85: i2c
    //   86: castore
    //   87: iload_3
    //   88: goto -> 51
    //   91: new java/lang/String
    //   94: dup
    //   95: aload_1
    //   96: invokespecial <init> : ([C)V
    //   99: areturn
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	100	0	s	Ljava/lang/String;
  }
  
  public String IIiIiIiIIi(String url) {
    // Byte code:
    //   0: new d/sb
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Ld/pb;)V
    //   8: astore_2
    //   9: ldc '~u'
    //   11: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   14: invokestatic IiIIiIIIii : (Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_3
    //   18: iconst_0
    //   19: dup
    //   20: istore #4
    //   22: aload_2
    //   23: invokevirtual size : ()I
    //   26: if_icmpge -> 115
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: iconst_0
    //   37: aload_1
    //   38: invokevirtual insert : (ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc 'j361j'
    //   43: invokestatic ALLATORIxDEMO : (Ljava/lang/String;)Ljava/lang/String;
    //   46: invokestatic IiIIiIIIii : (Ljava/lang/String;)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload_2
    //   53: iload #4
    //   55: invokevirtual get : (I)Ljava/lang/Object;
    //   58: checkcast java/lang/String
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokestatic get : (Ljava/lang/CharSequence;)Lcom/github/kevinsawicki/http/HttpRequest;
    //   70: invokevirtual code : ()I
    //   73: dup
    //   74: istore #5
    //   76: sipush #200
    //   79: if_icmpne -> 104
    //   82: aload_2
    //   83: iload #4
    //   85: invokevirtual get : (I)Ljava/lang/Object;
    //   88: checkcast java/lang/String
    //   91: astore_3
    //   92: goto -> 104
    //   95: nop
    //   96: athrow
    //   97: astore #5
    //   99: aload #5
    //   101: invokevirtual printStackTrace : ()V
    //   104: iinc #4, 1
    //   107: iload #4
    //   109: aload_2
    //   110: goto -> 23
    //   113: nop
    //   114: athrow
    //   115: aload_3
    //   116: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #27	-> 0
    //   #218	-> 9
    //   #148	-> 18
    //   #111	-> 29
    //   #126	-> 76
    //   #77	-> 82
    //   #315	-> 92
    //   #209	-> 97
    //   #309	-> 99
    //   #148	-> 104
    //   #256	-> 115
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	117	0	this	Ld/pb;
    //   0	117	1	url	Ljava/lang/String;
    //   9	108	2	iiiIiiIiII	Ljava/util/ArrayList;
    //   18	99	3	iiiIiiIiII	Ljava/lang/String;
    //   20	97	4	iiiIiiIiII	I
    //   74	43	5	iiiIiiIiII	I
    //   99	18	5	iiiIiiIiII	Ljava/lang/Exception;
    // Exception table:
    //   from	to	target	type
    //   29	92	97	java/lang/Exception
  }
}


/* Location:              C:\Users\zyh\Desktop\ThinkphpGUI-1.3-SNAPSHOT.jar!\d\pb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */