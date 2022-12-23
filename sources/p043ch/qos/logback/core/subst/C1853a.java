package p043ch.qos.logback.core.subst;

import p070e4.C4549d;
import p271u4.C6696g;

/* renamed from: ch.qos.logback.core.subst.a */
public final class C1853a {

    /* renamed from: a */
    public final C6696g f6408a;

    /* renamed from: b */
    public final C6696g f6409b;

    /* renamed from: ch.qos.logback.core.subst.a$a */
    public static /* synthetic */ class C1854a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6410a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ch.qos.logback.core.subst.Node$Type[] r0 = p043ch.qos.logback.core.subst.Node.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6410a = r0
                ch.qos.logback.core.subst.Node$Type r1 = p043ch.qos.logback.core.subst.Node.Type.LITERAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6410a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.subst.Node$Type r1 = p043ch.qos.logback.core.subst.Node.Type.VARIABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.subst.C1853a.C1854a.<clinit>():void");
        }
    }

    public C1853a(Node node, C6696g gVar, C4549d dVar) {
        this.f6408a = gVar;
        this.f6409b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p043ch.qos.logback.core.subst.Node m5230b(java.lang.String r14) throws p043ch.qos.logback.core.spi.ScanException {
        /*
            ch.qos.logback.core.subst.Tokenizer$TokenizerState r0 = p043ch.qos.logback.core.subst.Tokenizer.TokenizerState.LITERAL_STATE
            int r1 = r14.length()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            r5 = 0
        L_0x0012:
            r6 = 3
            r7 = 2
            r8 = 58
            r9 = 1
            r10 = 36
            if (r5 >= r1) goto L_0x00a3
            char r11 = r14.charAt(r5)
            int r5 = r5 + 1
            int[] r12 = p043ch.qos.logback.core.subst.Tokenizer.C1852a.f6407a
            int r13 = r0.ordinal()
            r12 = r12[r13]
            r13 = 123(0x7b, float:1.72E-43)
            if (r12 == r9) goto L_0x006f
            if (r12 == r7) goto L_0x005e
            if (r12 == r6) goto L_0x0032
            goto L_0x0012
        L_0x0032:
            if (r11 == r10) goto L_0x0052
            r0 = 45
            if (r11 == r0) goto L_0x004a
            r3.append(r8)
            if (r11 == r13) goto L_0x0041
            r3.append(r11)
            goto L_0x004f
        L_0x0041:
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
            r3.setLength(r4)
            ch.qos.logback.core.subst.Token r0 = p043ch.qos.logback.core.subst.Token.f6402d
            goto L_0x004c
        L_0x004a:
            ch.qos.logback.core.subst.Token r0 = p043ch.qos.logback.core.subst.Token.f6404f
        L_0x004c:
            r2.add(r0)
        L_0x004f:
            ch.qos.logback.core.subst.Tokenizer$TokenizerState r0 = p043ch.qos.logback.core.subst.Tokenizer.TokenizerState.LITERAL_STATE
            goto L_0x0012
        L_0x0052:
            r3.append(r8)
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
            r3.setLength(r4)
            ch.qos.logback.core.subst.Tokenizer$TokenizerState r0 = p043ch.qos.logback.core.subst.Tokenizer.TokenizerState.START_STATE
            goto L_0x0012
        L_0x005e:
            if (r11 != r13) goto L_0x0066
            ch.qos.logback.core.subst.Token r0 = p043ch.qos.logback.core.subst.Token.f6401c
            r2.add(r0)
            goto L_0x006c
        L_0x0066:
            r3.append(r10)
            r3.append(r11)
        L_0x006c:
            ch.qos.logback.core.subst.Tokenizer$TokenizerState r0 = p043ch.qos.logback.core.subst.Tokenizer.TokenizerState.LITERAL_STATE
            goto L_0x0012
        L_0x006f:
            if (r11 == r10) goto L_0x0099
            if (r11 == r8) goto L_0x008f
            if (r11 == r13) goto L_0x0083
            r6 = 125(0x7d, float:1.75E-43)
            if (r11 == r6) goto L_0x007d
            r3.append(r11)
            goto L_0x0012
        L_0x007d:
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
            ch.qos.logback.core.subst.Token r6 = p043ch.qos.logback.core.subst.Token.f6403e
            goto L_0x0088
        L_0x0083:
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
            ch.qos.logback.core.subst.Token r6 = p043ch.qos.logback.core.subst.Token.f6402d
        L_0x0088:
            r2.add(r6)
            r3.setLength(r4)
            goto L_0x0012
        L_0x008f:
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
            r3.setLength(r4)
            ch.qos.logback.core.subst.Tokenizer$TokenizerState r0 = p043ch.qos.logback.core.subst.Tokenizer.TokenizerState.DEFAULT_VAL_STATE
            goto L_0x0012
        L_0x0099:
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
            r3.setLength(r4)
            ch.qos.logback.core.subst.Tokenizer$TokenizerState r0 = p043ch.qos.logback.core.subst.Tokenizer.TokenizerState.START_STATE
            goto L_0x0012
        L_0x00a3:
            int[] r14 = p043ch.qos.logback.core.subst.Tokenizer.C1852a.f6407a
            int r0 = r0.ordinal()
            r14 = r14[r0]
            if (r14 == r9) goto L_0x00b9
            if (r14 == r7) goto L_0x00b6
            if (r14 == r6) goto L_0x00b2
            goto L_0x00bc
        L_0x00b2:
            r3.append(r8)
            goto L_0x00b9
        L_0x00b6:
            r3.append(r10)
        L_0x00b9:
            p043ch.qos.logback.core.subst.Tokenizer.m5229a(r3, r2)
        L_0x00bc:
            ch.qos.logback.core.subst.b r14 = new ch.qos.logback.core.subst.b
            r14.<init>(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00c9
            r14 = 0
            goto L_0x00cd
        L_0x00c9:
            ch.qos.logback.core.subst.Node r14 = r14.mo6690a()
        L_0x00cd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.subst.C1853a.m5230b(java.lang.String):ch.qos.logback.core.subst.Node");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        if (r2 == null) goto L_0x00d8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6689a(p043ch.qos.logback.core.subst.Node r7, java.lang.StringBuilder r8, java.util.Stack<p043ch.qos.logback.core.subst.Node> r9) throws p043ch.qos.logback.core.spi.ScanException {
        /*
            r6 = this;
        L_0x0000:
            if (r7 == 0) goto L_0x011c
            int[] r0 = p043ch.qos.logback.core.subst.C1853a.C1854a.f6410a
            ch.qos.logback.core.subst.Node$Type r1 = r7.f6396a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0111
            r2 = 2
            if (r0 == r2) goto L_0x0014
            goto L_0x0118
        L_0x0014:
            java.util.Iterator r0 = r9.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r0.next()
            ch.qos.logback.core.subst.Node r2 = (p043ch.qos.logback.core.subst.Node) r2
            ch.qos.logback.core.subst.Node$Type r4 = r7.f6396a
            if (r4 == 0) goto L_0x0032
            ch.qos.logback.core.subst.Node$Type r5 = r2.f6396a
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0032
            goto L_0x004d
        L_0x0032:
            java.lang.Object r4 = r7.f6397b
            if (r4 == 0) goto L_0x003f
            java.lang.Object r5 = r2.f6397b
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x003f
            goto L_0x004d
        L_0x003f:
            ch.qos.logback.core.subst.Node r4 = r7.f6398c
            if (r4 == 0) goto L_0x004c
            ch.qos.logback.core.subst.Node r2 = r2.f6398c
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r3 = 1
        L_0x004d:
            if (r3 == 0) goto L_0x0018
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            r9.push(r7)
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Circular variable reference detected while parsing input ["
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x0061:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r8.next()
            ch.qos.logback.core.subst.Node r0 = (p043ch.qos.logback.core.subst.Node) r0
            java.lang.String r1 = "${"
            r7.append(r1)
            java.lang.Object r1 = r0.f6397b
            ch.qos.logback.core.subst.Node r1 = (p043ch.qos.logback.core.subst.Node) r1
            java.lang.Object r1 = r1.f6397b
            java.lang.String r1 = (java.lang.String) r1
            r7.append(r1)
            java.lang.String r1 = "}"
            r7.append(r1)
            java.lang.Object r1 = r9.lastElement()
            if (r1 == r0) goto L_0x0061
            java.lang.String r0 = " --> "
            r7.append(r0)
            goto L_0x0061
        L_0x008f:
            java.lang.String r8 = "]"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
        L_0x009e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r7.f6397b
            ch.qos.logback.core.subst.Node r1 = (p043ch.qos.logback.core.subst.Node) r1
            r6.mo6689a(r1, r0, r9)
            java.lang.String r0 = r0.toString()
            u4.g r1 = r6.f6408a
            java.lang.String r1 = r1.getProperty(r0)
            if (r1 == 0) goto L_0x00b7
            goto L_0x00d8
        L_0x00b7:
            u4.g r1 = r6.f6409b
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = r1.getProperty(r0)
            if (r1 == 0) goto L_0x00c2
            goto L_0x00d8
        L_0x00c2:
            r1 = 0
            java.lang.String r2 = java.lang.System.getProperty(r0, r1)     // Catch:{ SecurityException -> 0x00c8 }
            goto L_0x00ca
        L_0x00c8:
            r2 = r1
        L_0x00ca:
            if (r2 == 0) goto L_0x00ce
        L_0x00cc:
            r1 = r2
            goto L_0x00d8
        L_0x00ce:
            java.lang.String r2 = java.lang.System.getenv(r0)     // Catch:{ SecurityException -> 0x00d3 }
            goto L_0x00d5
        L_0x00d3:
            r2 = r1
        L_0x00d5:
            if (r2 == 0) goto L_0x00d8
            goto L_0x00cc
        L_0x00d8:
            if (r1 == 0) goto L_0x00e2
            ch.qos.logback.core.subst.Node r0 = m5230b(r1)
            r6.mo6689a(r0, r8, r9)
            goto L_0x00fa
        L_0x00e2:
            ch.qos.logback.core.subst.Node r1 = r7.f6398c
            if (r1 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_IS_UNDEFINED"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.append(r0)
        L_0x00fa:
            r9.pop()
            goto L_0x0118
        L_0x00fe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6.mo6689a(r1, r0, r9)
            r9.pop()
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            goto L_0x0118
        L_0x0111:
            java.lang.Object r0 = r7.f6397b
            java.lang.String r0 = (java.lang.String) r0
            r8.append(r0)
        L_0x0118:
            ch.qos.logback.core.subst.Node r7 = r7.f6399d
            goto L_0x0000
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.subst.C1853a.mo6689a(ch.qos.logback.core.subst.Node, java.lang.StringBuilder, java.util.Stack):void");
    }
}
