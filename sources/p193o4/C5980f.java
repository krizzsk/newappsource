package p193o4;

import android.widget.FrameLayout;

/* renamed from: o4.f */
public final class C5980f {

    /* renamed from: a */
    public int f19125a;

    /* renamed from: b */
    public final Object f19126b;

    /* renamed from: c */
    public Object f19127c;

    public /* synthetic */ C5980f(int i, FrameLayout frameLayout, String str) {
        this.f19126b = frameLayout;
        this.f19125a = i;
        this.f19127c = str;
    }

    public /* synthetic */ C5980f(C5983i iVar) {
        this.f19126b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:205:0x00aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0156 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21970a(java.util.List r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r1.f19127c = r0
            r0 = 0
            r1.f19125a = r0
        L_0x0009:
            int r0 = r1.f19125a
            java.lang.Object r2 = r1.f19127c
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x0480
            java.lang.Object r0 = r1.f19127c
            java.util.List r0 = (java.util.List) r0
            int r2 = r1.f19125a
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            n4.d r2 = (p180n4.C5855d) r2
            boolean r0 = r2 instanceof p180n4.C5857f
            java.lang.String r3 = "RuntimeException in Action for tag ["
            java.lang.String r4 = "ActionException in Action for tag ["
            java.lang.String r5 = "]"
            r6 = 1
            if (r0 == 0) goto L_0x0376
            java.lang.Object r0 = r1.f19126b
            r7 = r0
            o4.i r7 = (p193o4.C5983i) r7
            r0 = r2
            n4.f r0 = (p180n4.C5857f) r0
            r7.getClass()
            org.xml.sax.helpers.LocatorImpl r8 = r0.f18843c
            r7.f19142f = r8
            java.lang.String r8 = r0.f18841a
            java.lang.String r9 = r0.f18842b
            org.xml.sax.helpers.AttributesImpl r10 = r0.f18848d
            if (r8 == 0) goto L_0x004a
            int r0 = r8.length()
            if (r0 >= r6) goto L_0x004b
        L_0x004a:
            r8 = r9
        L_0x004b:
            o4.d r0 = r7.f19141e
            java.util.ArrayList<java.lang.String> r0 = r0.f19124a
            r0.add(r8)
            o4.d r0 = r7.f19145i
            if (r0 == 0) goto L_0x0063
            java.util.Stack<java.util.List<m4.b>> r0 = r7.f19144h
            java.util.Vector r6 = p193o4.C5983i.f19136j
            r0.add(r6)
            r22 = r3
            r18 = r4
            goto L_0x036c
        L_0x0063:
            o4.d r0 = r7.f19141e
            o4.k r6 = r7.f19137a
            o4.l r6 = (p193o4.C5986l) r6
            java.util.HashMap<o4.e, java.util.List<m4.b>> r9 = r6.f19146e
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0073:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00b3
            java.lang.Object r11 = r9.next()
            o4.e r11 = (p193o4.C5979e) r11
            r11.getClass()
            int r12 = r0.mo21965c()
            int r13 = r11.mo21965c()
            if (r12 == r13) goto L_0x008d
            goto L_0x00a2
        L_0x008d:
            int r12 = r11.mo21965c()
            r13 = 0
        L_0x0092:
            if (r13 >= r12) goto L_0x00a7
            java.lang.String r14 = r11.mo21963a(r13)
            java.lang.String r15 = r0.mo21963a(r13)
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 != 0) goto L_0x00a4
        L_0x00a2:
            r12 = 0
            goto L_0x00a8
        L_0x00a4:
            int r13 = r13 + 1
            goto L_0x0092
        L_0x00a7:
            r12 = 1
        L_0x00a8:
            if (r12 == 0) goto L_0x0073
            java.util.HashMap<o4.e, java.util.List<m4.b>> r9 = r6.f19146e
            java.lang.Object r9 = r9.get(r11)
            java.util.List r9 = (java.util.List) r9
            goto L_0x00b4
        L_0x00b3:
            r9 = 0
        L_0x00b4:
            if (r9 == 0) goto L_0x00bc
            r22 = r3
            r18 = r4
            goto L_0x02b8
        L_0x00bc:
            java.util.HashMap<o4.e, java.util.List<m4.b>> r9 = r6.f19146e
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
            r11 = 0
            r12 = 0
        L_0x00c8:
            boolean r13 = r9.hasNext()
            java.lang.String r14 = "*"
            if (r13 == 0) goto L_0x015e
            java.lang.Object r13 = r9.next()
            o4.e r13 = (p193o4.C5979e) r13
            int r15 = r13.mo21965c()
            r22 = r3
            r3 = 1
            if (r15 <= r3) goto L_0x00ec
            r3 = 0
            java.lang.String r3 = r13.mo21963a(r3)
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x00ec
            r3 = 1
            goto L_0x00ed
        L_0x00ec:
            r3 = 0
        L_0x00ed:
            if (r3 == 0) goto L_0x0152
            if (r0 != 0) goto L_0x00f2
            goto L_0x0143
        L_0x00f2:
            java.util.ArrayList<java.lang.String> r3 = r13.f19124a
            int r3 = r3.size()
            java.util.ArrayList<java.lang.String> r14 = r0.f19124a
            int r14 = r14.size()
            if (r3 == 0) goto L_0x0143
            if (r14 != 0) goto L_0x0103
            goto L_0x0143
        L_0x0103:
            if (r3 > r14) goto L_0x0107
            r15 = r3
            goto L_0x0108
        L_0x0107:
            r15 = r14
        L_0x0108:
            r16 = 1
            r17 = 0
            r18 = r4
            r4 = 1
        L_0x010f:
            if (r4 > r15) goto L_0x013c
            r16 = r9
            java.util.ArrayList<java.lang.String> r9 = r13.f19124a
            r19 = r13
            int r13 = r3 - r4
            java.lang.Object r9 = r9.get(r13)
            java.lang.String r9 = (java.lang.String) r9
            java.util.ArrayList<java.lang.String> r13 = r0.f19124a
            r20 = r3
            int r3 = r14 - r4
            java.lang.Object r3 = r13.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0140
            int r17 = r17 + 1
            int r4 = r4 + 1
            r9 = r16
            r13 = r19
            r3 = r20
            goto L_0x010f
        L_0x013c:
            r16 = r9
            r19 = r13
        L_0x0140:
            r3 = r17
            goto L_0x014c
        L_0x0143:
            r18 = r4
            r16 = r9
            r19 = r13
            r17 = 0
            r3 = 0
        L_0x014c:
            if (r3 <= r11) goto L_0x0156
            r11 = r3
            r12 = r19
            goto L_0x0156
        L_0x0152:
            r18 = r4
            r16 = r9
        L_0x0156:
            r3 = r22
            r9 = r16
            r4 = r18
            goto L_0x00c8
        L_0x015e:
            r22 = r3
            r18 = r4
            if (r12 == 0) goto L_0x016d
            java.util.HashMap<o4.e, java.util.List<m4.b>> r3 = r6.f19146e
            java.lang.Object r3 = r3.get(r12)
            java.util.List r3 = (java.util.List) r3
            goto L_0x016e
        L_0x016d:
            r3 = 0
        L_0x016e:
            r9 = r3
            if (r9 == 0) goto L_0x0173
            goto L_0x02b8
        L_0x0173:
            java.util.HashMap<o4.e, java.util.List<m4.b>> r3 = r6.f19146e
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r9 = 0
        L_0x017f:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01ec
            java.lang.Object r11 = r3.next()
            o4.e r11 = (p193o4.C5979e) r11
            java.lang.String r12 = r11.mo21964b()
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x01e7
            if (r0 != 0) goto L_0x0198
            goto L_0x01d7
        L_0x0198:
            java.util.ArrayList<java.lang.String> r12 = r11.f19124a
            int r12 = r12.size()
            java.util.ArrayList<java.lang.String> r13 = r0.f19124a
            int r13 = r13.size()
            if (r12 == 0) goto L_0x01d7
            if (r13 != 0) goto L_0x01a9
            goto L_0x01d7
        L_0x01a9:
            if (r12 > r13) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r12 = r13
        L_0x01ad:
            r13 = 0
            r15 = 0
        L_0x01af:
            if (r13 >= r12) goto L_0x01d4
            r16 = r3
            java.util.ArrayList<java.lang.String> r3 = r11.f19124a
            java.lang.Object r3 = r3.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            r17 = r12
            java.util.ArrayList<java.lang.String> r12 = r0.f19124a
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            boolean r3 = r3.equalsIgnoreCase(r12)
            if (r3 == 0) goto L_0x01da
            int r15 = r15 + 1
            int r13 = r13 + 1
            r3 = r16
            r12 = r17
            goto L_0x01af
        L_0x01d4:
            r16 = r3
            goto L_0x01da
        L_0x01d7:
            r16 = r3
            r15 = 0
        L_0x01da:
            int r3 = r11.mo21965c()
            int r3 = r3 + -1
            if (r15 != r3) goto L_0x01e9
            if (r15 <= r4) goto L_0x01e9
            r9 = r11
            r4 = r15
            goto L_0x01e9
        L_0x01e7:
            r16 = r3
        L_0x01e9:
            r3 = r16
            goto L_0x017f
        L_0x01ec:
            if (r9 == 0) goto L_0x01f7
            java.util.HashMap<o4.e, java.util.List<m4.b>> r3 = r6.f19146e
            java.lang.Object r3 = r3.get(r9)
            java.util.List r3 = (java.util.List) r3
            goto L_0x01f8
        L_0x01f7:
            r3 = 0
        L_0x01f8:
            r9 = r3
            if (r9 == 0) goto L_0x01fd
            goto L_0x02b8
        L_0x01fd:
            java.util.HashMap<o4.e, java.util.List<m4.b>> r3 = r6.f19146e
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r9 = 0
        L_0x0209:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x02a7
            java.lang.Object r11 = r3.next()
            o4.e r11 = (p193o4.C5979e) r11
            java.lang.String r12 = r11.mo21964b()
            int r13 = r11.mo21965c()
            r15 = 1
            if (r13 <= r15) goto L_0x0226
            r13 = 0
            java.lang.String r13 = r11.mo21963a(r13)
            goto L_0x0227
        L_0x0226:
            r13 = 0
        L_0x0227:
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x02a1
            boolean r12 = r14.equals(r13)
            if (r12 == 0) goto L_0x02a1
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r13 = r11.f19124a
            r12.<init>(r13)
            int r13 = r12.size()
            r15 = 2
            if (r13 <= r15) goto L_0x024e
            r13 = 0
            r12.remove(r13)
            int r13 = r12.size()
            int r13 = r13 + -1
            r12.remove(r13)
        L_0x024e:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r12)
            if (r0 != 0) goto L_0x025e
            r12 = 0
            r19 = r3
            r17 = r11
            goto L_0x0293
        L_0x025e:
            java.lang.String r12 = r0.mo21966d()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.Iterator r16 = r13.iterator()
        L_0x026b:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0287
            java.lang.Object r17 = r16.next()
            r19 = r3
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            r17 = r11
            java.lang.String r11 = "["
            p379.C16530d.m42019l(r15, r11, r3, r5)
            r11 = r17
            r3 = r19
            goto L_0x026b
        L_0x0287:
            r19 = r3
            r17 = r11
            java.lang.String r3 = r15.toString()
            boolean r12 = r12.contains(r3)
        L_0x0293:
            if (r12 == 0) goto L_0x029a
            int r3 = r13.size()
            goto L_0x029b
        L_0x029a:
            r3 = 0
        L_0x029b:
            if (r3 <= r4) goto L_0x02a3
            r4 = r3
            r9 = r17
            goto L_0x02a3
        L_0x02a1:
            r19 = r3
        L_0x02a3:
            r3 = r19
            goto L_0x0209
        L_0x02a7:
            if (r9 == 0) goto L_0x02b2
            java.util.HashMap<o4.e, java.util.List<m4.b>> r3 = r6.f19146e
            java.lang.Object r3 = r3.get(r9)
            java.util.List r3 = (java.util.List) r3
            goto L_0x02b3
        L_0x02b2:
            r3 = 0
        L_0x02b3:
            r9 = r3
            if (r9 == 0) goto L_0x02b7
            goto L_0x02b8
        L_0x02b7:
            r9 = 0
        L_0x02b8:
            if (r9 != 0) goto L_0x02e2
            o4.h r3 = r7.f19138b
            java.util.ArrayList<m4.h> r4 = r7.f19139c
            int r4 = r4.size()
            r6 = 0
        L_0x02c3:
            if (r6 >= r4) goto L_0x02e1
            java.util.ArrayList<m4.h> r9 = r7.f19139c
            java.lang.Object r9 = r9.get(r6)
            m4.h r9 = (p168m4.C5690h) r9
            boolean r11 = r9.mo21540q(r0, r3)
            if (r11 == 0) goto L_0x02de
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 1
            r0.<init>(r3)
            r0.add(r9)
            r9 = r0
            goto L_0x02e2
        L_0x02de:
            int r6 = r6 + 1
            goto L_0x02c3
        L_0x02e1:
            r9 = 0
        L_0x02e2:
            if (r9 == 0) goto L_0x0342
            java.util.Stack<java.util.List<m4.b>> r0 = r7.f19144h
            r0.add(r9)
            java.util.Iterator r3 = r9.iterator()
        L_0x02ed:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x036c
            java.lang.Object r0 = r3.next()
            m4.b r0 = (p168m4.C5684b) r0
            o4.h r4 = r7.f19138b     // Catch:{ ActionException -> 0x031d, RuntimeException -> 0x02ff }
            r0.mo170m(r4, r8, r10)     // Catch:{ ActionException -> 0x031d, RuntimeException -> 0x02ff }
            goto L_0x02ed
        L_0x02ff:
            r0 = move-exception
            o4.d r4 = r7.f19141e
            r4.getClass()
            o4.d r6 = new o4.d
            r6.<init>()
            java.util.ArrayList<java.lang.String> r9 = r6.f19124a
            java.util.ArrayList<java.lang.String> r4 = r4.f19124a
            r9.addAll(r4)
            r7.f19145i = r6
            o4.a r4 = r7.f19140d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = r22
            goto L_0x033a
        L_0x031d:
            r0 = move-exception
            o4.d r4 = r7.f19141e
            r4.getClass()
            o4.d r6 = new o4.d
            r6.<init>()
            java.util.ArrayList<java.lang.String> r9 = r6.f19124a
            java.util.ArrayList<java.lang.String> r4 = r4.f19124a
            r9.addAll(r4)
            r7.f19145i = r6
            o4.a r4 = r7.f19140d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r9 = r18
        L_0x033a:
            java.lang.String r6 = p379.C13715c.m34245k(r6, r9, r8, r5)
            r4.mo21727f(r6, r0)
            goto L_0x02ed
        L_0x0342:
            java.util.Stack<java.util.List<m4.b>> r0 = r7.f19144h
            java.util.Vector r3 = p193o4.C5983i.f19136j
            r0.add(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "no applicable action for ["
            r0.append(r3)
            r0.append(r8)
            java.lang.String r3 = "], current ElementPath  is ["
            r0.append(r3)
            o4.d r3 = r7.f19141e
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            o4.a r3 = r7.f19140d
            r3.mo21722a(r0)
        L_0x036c:
            java.lang.Object r0 = r1.f19126b
            o4.i r0 = (p193o4.C5983i) r0
            o4.h r0 = r0.f19138b
            r0.mo21973m(r2)
            goto L_0x037a
        L_0x0376:
            r22 = r3
            r18 = r4
        L_0x037a:
            boolean r0 = r2 instanceof p180n4.C5852a
            if (r0 == 0) goto L_0x03e7
            java.lang.Object r0 = r1.f19126b
            o4.i r0 = (p193o4.C5983i) r0
            o4.h r0 = r0.f19138b
            r0.mo21973m(r2)
            java.lang.Object r0 = r1.f19126b
            r3 = r0
            o4.i r3 = (p193o4.C5983i) r3
            r0 = r2
            n4.a r0 = (p180n4.C5852a) r0
            r3.getClass()
            org.xml.sax.helpers.LocatorImpl r4 = r0.f18843c
            r3.f19142f = r4
            java.lang.String r0 = r0.f18840d
            if (r0 == 0) goto L_0x039e
            java.lang.String r0 = r0.trim()
        L_0x039e:
            java.util.Stack<java.util.List<m4.b>> r4 = r3.f19144h
            java.lang.Object r4 = r4.peek()
            java.util.List r4 = (java.util.List) r4
            if (r0 == 0) goto L_0x03e7
            java.lang.String r6 = r0.trim()
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x03e7
            if (r4 != 0) goto L_0x03b5
            goto L_0x03e7
        L_0x03b5:
            java.util.Iterator r4 = r4.iterator()
        L_0x03b9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03e7
            java.lang.Object r0 = r4.next()
            r7 = r0
            m4.b r7 = (p168m4.C5684b) r7
            o4.h r0 = r3.f19138b     // Catch:{ ActionException -> 0x03cc }
            r7.mo21538n(r0, r6)     // Catch:{ ActionException -> 0x03cc }
            goto L_0x03b9
        L_0x03cc:
            r0 = move-exception
            o4.a r8 = r3.f19140d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Exception in end() methd for action ["
            r9.append(r10)
            r9.append(r7)
            r9.append(r5)
            java.lang.String r7 = r9.toString()
            r8.mo21727f(r7, r0)
            goto L_0x03b9
        L_0x03e7:
            boolean r0 = r2 instanceof p180n4.C5853b
            if (r0 == 0) goto L_0x0478
            java.lang.Object r0 = r1.f19126b
            o4.i r0 = (p193o4.C5983i) r0
            o4.h r0 = r0.f19138b
            r0.mo21973m(r2)
            java.lang.Object r0 = r1.f19126b
            r3 = r0
            o4.i r3 = (p193o4.C5983i) r3
            n4.b r2 = (p180n4.C5853b) r2
            r3.getClass()
            org.xml.sax.helpers.LocatorImpl r0 = r2.f18843c
            r3.f19142f = r0
            java.lang.String r0 = r2.f18841a
            java.lang.String r2 = r2.f18842b
            java.util.Stack<java.util.List<m4.b>> r4 = r3.f19144h
            java.lang.Object r4 = r4.pop()
            java.util.List r4 = (java.util.List) r4
            o4.d r6 = r3.f19145i
            if (r6 == 0) goto L_0x041e
            o4.d r0 = r3.f19141e
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0463
            r0 = 0
            r3.f19145i = r0
            goto L_0x0463
        L_0x041e:
            java.util.Vector r6 = p193o4.C5983i.f19136j
            if (r4 == r6) goto L_0x0463
            if (r0 == 0) goto L_0x042d
            int r6 = r0.length()
            r7 = 1
            if (r6 >= r7) goto L_0x042c
            goto L_0x042d
        L_0x042c:
            r2 = r0
        L_0x042d:
            if (r4 != 0) goto L_0x0430
            goto L_0x0463
        L_0x0430:
            java.util.Iterator r4 = r4.iterator()
        L_0x0434:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0463
            java.lang.Object r0 = r4.next()
            m4.b r0 = (p168m4.C5684b) r0
            o4.h r6 = r3.f19138b     // Catch:{ ActionException -> 0x0451, RuntimeException -> 0x0446 }
            r0.mo171o(r6, r2)     // Catch:{ ActionException -> 0x0451, RuntimeException -> 0x0446 }
            goto L_0x0434
        L_0x0446:
            r0 = move-exception
            o4.a r6 = r3.f19140d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r22
            goto L_0x045b
        L_0x0451:
            r0 = move-exception
            o4.a r6 = r3.f19140d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r18
        L_0x045b:
            java.lang.String r7 = p379.C13715c.m34245k(r7, r8, r2, r5)
            r6.mo21727f(r7, r0)
            goto L_0x0434
        L_0x0463:
            o4.d r0 = r3.f19141e
            java.util.ArrayList<java.lang.String> r2 = r0.f19124a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0478
            java.util.ArrayList<java.lang.String> r0 = r0.f19124a
            int r2 = r0.size()
            int r2 = r2 + -1
            r0.remove(r2)
        L_0x0478:
            int r0 = r1.f19125a
            int r0 = r0 + 1
            r1.f19125a = r0
            goto L_0x0009
        L_0x0480:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o4.C5980f.mo21970a(java.util.List):void");
    }
}
