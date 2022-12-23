package p239rb;

import p126ib.C5334b;
import p277ub.C6803r;

/* renamed from: rb.h */
public final class C6296h extends C5334b {

    /* renamed from: m */
    public final C6803r f19924m = new C6803r();

    /* renamed from: n */
    public final C6285a f19925n = new C6285a();

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (")".equals(p239rb.C6285a.m14884b(r10, r11)) == false) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0318 A[EDGE_INSN: B:200:0x0318->B:161:0x0318 ?: BREAK  
    EDGE_INSN: B:201:0x0318->B:161:0x0318 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p126ib.C5336d mo21119g(byte[] r21, int r22, boolean r23) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r20 = this;
            r1 = r20
            ub.r r0 = r1.f19924m
            r2 = r21
            r3 = r22
            r0.mo23005x(r3, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ub.r r2 = r1.f19924m     // Catch:{ ParserException -> 0x036e }
            p239rb.C6297i.m14903c(r2)     // Catch:{ ParserException -> 0x036e }
        L_0x0015:
            ub.r r2 = r1.f19924m
            java.lang.String r2 = r2.mo22985d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0027:
            ub.r r3 = r1.f19924m
            r4 = 3
            r5 = 2
            r6 = -1
            r7 = 0
            r8 = 1
            r9 = -1
            r10 = 0
        L_0x0030:
            if (r9 != r6) goto L_0x0052
            int r10 = r3.f21039b
            java.lang.String r9 = r3.mo22985d()
            if (r9 != 0) goto L_0x003c
            r9 = 0
            goto L_0x0030
        L_0x003c:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x0046
            r9 = 2
            goto L_0x0030
        L_0x0046:
            java.lang.String r11 = "NOTE"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L_0x0050
            r9 = 1
            goto L_0x0030
        L_0x0050:
            r9 = 3
            goto L_0x0030
        L_0x0052:
            r3.mo23007z(r10)
            if (r9 == 0) goto L_0x0368
            if (r9 != r8) goto L_0x0066
            ub.r r3 = r1.f19924m
        L_0x005b:
            java.lang.String r4 = r3.mo22985d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x005b
        L_0x0066:
            if (r9 != r5) goto L_0x0325
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x031d
            ub.r r4 = r1.f19924m
            r4.mo22985d()
            rb.a r4 = r1.f19925n
            ub.r r9 = r1.f19924m
            java.lang.StringBuilder r10 = r4.f19877b
            r10.setLength(r7)
            int r10 = r9.f21039b
        L_0x007e:
            java.lang.String r11 = r9.mo22985d()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x007e
            ub.r r11 = r4.f19876a
            byte[] r12 = r9.f21038a
            int r9 = r9.f21039b
            r11.mo23005x(r9, r12)
            ub.r r9 = r4.f19876a
            r9.mo23007z(r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x009b:
            ub.r r10 = r4.f19876a
            java.lang.StringBuilder r11 = r4.f19877b
            p239rb.C6285a.m14885c(r10)
            int r12 = r10.f21040c
            int r13 = r10.f21039b
            int r12 = r12 - r13
            r13 = 5
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            if (r12 >= r13) goto L_0x00b0
            goto L_0x0111
        L_0x00b0:
            java.lang.String r12 = r10.mo22994m(r13)
            java.lang.String r13 = "::cue"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x00bd
            goto L_0x0111
        L_0x00bd:
            int r12 = r10.f21039b
            java.lang.String r13 = p239rb.C6285a.m14884b(r10, r11)
            if (r13 != 0) goto L_0x00c6
            goto L_0x0111
        L_0x00c6:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d1
            r10.mo23007z(r12)
            r3 = r15
            goto L_0x0112
        L_0x00d1:
            java.lang.String r12 = "("
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0104
            int r12 = r10.f21039b
            int r13 = r10.f21040c
            r16 = 0
        L_0x00df:
            if (r12 >= r13) goto L_0x00f6
            if (r16 != 0) goto L_0x00f6
            byte[] r3 = r10.f21038a
            int r16 = r12 + 1
            byte r3 = r3[r12]
            char r3 = (char) r3
            r12 = 41
            if (r3 != r12) goto L_0x00f0
            r3 = 1
            goto L_0x00f1
        L_0x00f0:
            r3 = 0
        L_0x00f1:
            r12 = r16
            r16 = r3
            goto L_0x00df
        L_0x00f6:
            int r12 = r12 + -1
            int r3 = r10.f21039b
            int r12 = r12 - r3
            java.lang.String r3 = r10.mo22994m(r12)
            java.lang.String r3 = r3.trim()
            goto L_0x0105
        L_0x0104:
            r3 = 0
        L_0x0105:
            java.lang.String r10 = p239rb.C6285a.m14884b(r10, r11)
            java.lang.String r11 = ")"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0112
        L_0x0111:
            r3 = 0
        L_0x0112:
            if (r3 == 0) goto L_0x0318
            ub.r r10 = r4.f19876a
            java.lang.StringBuilder r11 = r4.f19877b
            java.lang.String r10 = p239rb.C6285a.m14884b(r10, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0124
            goto L_0x0318
        L_0x0124:
            rb.d r10 = new rb.d
            r10.<init>()
            boolean r11 = r15.equals(r3)
            if (r11 == 0) goto L_0x0130
            goto L_0x0196
        L_0x0130:
            r11 = 91
            int r11 = r3.indexOf(r11)
            if (r11 == r6) goto L_0x0155
            java.util.regex.Pattern r12 = p239rb.C6285a.f19875c
            java.lang.String r13 = r3.substring(r11)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r12.matches()
            if (r13 == 0) goto L_0x0151
            java.lang.String r12 = r12.group(r8)
            r12.getClass()
            r10.f19883d = r12
        L_0x0151:
            java.lang.String r3 = r3.substring(r7, r11)
        L_0x0155:
            int r11 = p277ub.C6774a0.f20959a
            java.lang.String r11 = "\\."
            java.lang.String[] r3 = r3.split(r11, r6)
            r11 = r3[r7]
            r12 = 35
            int r12 = r11.indexOf(r12)
            if (r12 == r6) goto L_0x0176
            java.lang.String r13 = r11.substring(r7, r12)
            r10.f19881b = r13
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)
            r10.f19880a = r11
            goto L_0x0178
        L_0x0176:
            r10.f19881b = r11
        L_0x0178:
            int r11 = r3.length
            if (r11 <= r8) goto L_0x0196
            int r11 = r3.length
            int r12 = r3.length
            if (r11 > r12) goto L_0x0181
            r12 = 1
            goto L_0x0182
        L_0x0181:
            r12 = 0
        L_0x0182:
            p583jk.C17875h.m44301k(r12)
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r3, r8, r11)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.HashSet r11 = new java.util.HashSet
            java.util.List r3 = java.util.Arrays.asList(r3)
            r11.<init>(r3)
            r10.f19882c = r11
        L_0x0196:
            r3 = 0
            r11 = 0
        L_0x0198:
            java.lang.String r12 = "}"
            if (r3 != 0) goto L_0x0303
            ub.r r3 = r4.f19876a
            int r11 = r3.f21039b
            java.lang.StringBuilder r13 = r4.f19877b
            java.lang.String r3 = p239rb.C6285a.m14884b(r3, r13)
            if (r3 == 0) goto L_0x01b2
            boolean r13 = r12.equals(r3)
            if (r13 == 0) goto L_0x01b0
            goto L_0x01b2
        L_0x01b0:
            r13 = 0
            goto L_0x01b3
        L_0x01b2:
            r13 = 1
        L_0x01b3:
            if (r13 != 0) goto L_0x02f2
            ub.r r14 = r4.f19876a
            r14.mo23007z(r11)
            ub.r r11 = r4.f19876a
            java.lang.StringBuilder r14 = r4.f19877b
            p239rb.C6285a.m14885c(r11)
            java.lang.String r6 = p239rb.C6285a.m14883a(r11, r14)
            boolean r16 = r15.equals(r6)
            if (r16 == 0) goto L_0x01cd
            goto L_0x02f2
        L_0x01cd:
            java.lang.String r7 = p239rb.C6285a.m14884b(r11, r14)
            java.lang.String r5 = ":"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x01db
            goto L_0x02f2
        L_0x01db:
            p239rb.C6285a.m14885c(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = 0
        L_0x01e4:
            java.lang.String r8 = ";"
            if (r7 != 0) goto L_0x0214
            r17 = r3
            int r3 = r11.f21039b
            r18 = r4
            java.lang.String r4 = p239rb.C6285a.m14884b(r11, r14)
            if (r4 != 0) goto L_0x01f6
            r3 = 0
            goto L_0x021c
        L_0x01f6:
            boolean r19 = r12.equals(r4)
            if (r19 != 0) goto L_0x020b
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0203
            goto L_0x020b
        L_0x0203:
            r5.append(r4)
            r3 = r17
            r4 = r18
            goto L_0x01e4
        L_0x020b:
            r11.mo23007z(r3)
            r3 = r17
            r4 = r18
            r7 = 1
            goto L_0x01e4
        L_0x0214:
            r17 = r3
            r18 = r4
            java.lang.String r3 = r5.toString()
        L_0x021c:
            if (r3 == 0) goto L_0x02f6
            boolean r4 = r15.equals(r3)
            if (r4 == 0) goto L_0x0226
            goto L_0x02f6
        L_0x0226:
            int r4 = r11.f21039b
            java.lang.String r5 = p239rb.C6285a.m14884b(r11, r14)
            boolean r7 = r8.equals(r5)
            if (r7 == 0) goto L_0x0233
            goto L_0x023c
        L_0x0233:
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x02f6
            r11.mo23007z(r4)
        L_0x023c:
            java.lang.String r4 = "color"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x024f
            r4 = 1
            int r3 = p277ub.C6775b.m15967a(r3, r4)
            r10.f19885f = r3
            r10.f19886g = r4
            goto L_0x02f6
        L_0x024f:
            r4 = 1
            java.lang.String r5 = "background-color"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0262
            int r3 = p277ub.C6775b.m15967a(r3, r4)
            r10.f19887h = r3
            r10.f19888i = r4
            goto L_0x02f6
        L_0x0262:
            java.lang.String r5 = "ruby-position"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0284
            java.lang.String r5 = "over"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0276
            r10.f19894o = r4
            goto L_0x02f6
        L_0x0276:
            java.lang.String r4 = "under"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x02f6
            r4 = 2
            r10.f19894o = r4
            goto L_0x02f7
        L_0x0284:
            r4 = 2
            java.lang.String r5 = "text-combine-upright"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02a5
            java.lang.String r5 = "all"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x02a1
            java.lang.String r5 = "digits"
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            r3 = 0
            goto L_0x02a2
        L_0x02a1:
            r3 = 1
        L_0x02a2:
            r10.f19895p = r3
            goto L_0x02f7
        L_0x02a5:
            java.lang.String r5 = "text-decoration"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02bb
            java.lang.String r5 = "underline"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02f7
            r3 = 1
            r10.f19890k = r3
            goto L_0x02f7
        L_0x02bb:
            java.lang.String r5 = "font-family"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02ca
            java.lang.String r3 = com.google.android.play.core.appupdate.C14226d.m35341H0(r3)
            r10.f19884e = r3
            goto L_0x02f7
        L_0x02ca:
            java.lang.String r5 = "font-weight"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x02de
            java.lang.String r5 = "bold"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02f7
            r5 = 1
            r10.f19891l = r5
            goto L_0x02f8
        L_0x02de:
            r5 = 1
            java.lang.String r7 = "font-style"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x02f8
            java.lang.String r6 = "italic"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x02f8
            r10.f19892m = r5
            goto L_0x02f8
        L_0x02f2:
            r17 = r3
            r18 = r4
        L_0x02f6:
            r4 = 2
        L_0x02f7:
            r5 = 1
        L_0x02f8:
            r3 = r13
            r11 = r17
            r4 = r18
            r5 = 2
            r6 = -1
            r7 = 0
            r8 = 1
            goto L_0x0198
        L_0x0303:
            r18 = r4
            r4 = 2
            r5 = 1
            boolean r3 = r12.equals(r11)
            if (r3 == 0) goto L_0x0310
            r9.add(r10)
        L_0x0310:
            r4 = r18
            r5 = 2
            r6 = -1
            r7 = 0
            r8 = 1
            goto L_0x009b
        L_0x0318:
            r0.addAll(r9)
            goto L_0x0027
        L_0x031d:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r2 = "A style block was found after the first cue."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0325:
            if (r9 != r4) goto L_0x0027
            ub.r r3 = r1.f19924m
            java.util.regex.Pattern r4 = p239rb.C6291g.f19900a
            java.lang.String r4 = r3.mo22985d()
            if (r4 != 0) goto L_0x0333
            r3 = 0
            goto L_0x0361
        L_0x0333:
            java.util.regex.Pattern r5 = p239rb.C6291g.f19900a
            java.util.regex.Matcher r6 = r5.matcher(r4)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L_0x0345
            r7 = 0
            rb.e r3 = p239rb.C6291g.m14895d(r7, r6, r3, r0)
            goto L_0x0361
        L_0x0345:
            r7 = 0
            java.lang.String r6 = r3.mo22985d()
            if (r6 != 0) goto L_0x034d
            goto L_0x0360
        L_0x034d:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x0360
            java.lang.String r4 = r4.trim()
            rb.e r3 = p239rb.C6291g.m14895d(r4, r5, r3, r0)
            goto L_0x0361
        L_0x0360:
            r3 = r7
        L_0x0361:
            if (r3 == 0) goto L_0x0027
            r2.add(r3)
            goto L_0x0027
        L_0x0368:
            rb.k r0 = new rb.k
            r0.<init>(r2)
            return r0
        L_0x036e:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            r2.<init>((com.google.android.exoplayer2.ParserException) r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p239rb.C6296h.mo21119g(byte[], int, boolean):ib.d");
    }
}
