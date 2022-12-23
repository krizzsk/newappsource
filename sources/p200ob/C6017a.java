package p200ob;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p126ib.C5334b;

/* renamed from: ob.a */
public final class C6017a extends C5334b {

    /* renamed from: o */
    public static final Pattern f19232o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    public static final Pattern f19233p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m */
    public final StringBuilder f19234m = new StringBuilder();

    /* renamed from: n */
    public final ArrayList<String> f19235n = new ArrayList<>();

    /* renamed from: h */
    public static long m14506h(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + j;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong += Long.parseLong(group4);
        }
        return parseLong * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p126ib.C5336d mo21119g(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 32
            long[] r2 = new long[r2]
            ub.r r3 = new ub.r
            r4 = r22
            r5 = r23
            r3.<init>(r4, r5)
            r4 = 0
            r5 = 0
        L_0x0016:
            java.lang.String r6 = r3.mo22985d()
            if (r6 == 0) goto L_0x026f
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0023
            goto L_0x0016
        L_0x0023:
            java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x025b }
            java.lang.String r6 = r3.mo22985d()
            if (r6 != 0) goto L_0x002e
            goto L_0x026f
        L_0x002e:
            java.util.regex.Pattern r7 = f19232o
            java.util.regex.Matcher r7 = r7.matcher(r6)
            boolean r8 = r7.matches()
            if (r8 == 0) goto L_0x024d
            r6 = 1
            long r8 = m14506h(r7, r6)
            int r10 = r2.length
            if (r5 != r10) goto L_0x0048
            int r10 = r5 * 2
            long[] r2 = java.util.Arrays.copyOf(r2, r10)
        L_0x0048:
            int r10 = r5 + 1
            r2[r5] = r8
            r5 = 6
            long r7 = m14506h(r7, r5)
            int r9 = r2.length
            if (r10 != r9) goto L_0x005a
            int r9 = r10 * 2
            long[] r2 = java.util.Arrays.copyOf(r2, r9)
        L_0x005a:
            int r9 = r10 + 1
            r2[r10] = r7
            java.lang.StringBuilder r7 = r0.f19234m
            r7.setLength(r4)
            java.util.ArrayList<java.lang.String> r7 = r0.f19235n
            r7.clear()
            java.lang.String r7 = r3.mo22985d()
        L_0x006c:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00c2
            java.lang.StringBuilder r8 = r0.f19234m
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0081
            java.lang.StringBuilder r8 = r0.f19234m
            java.lang.String r10 = "<br>"
            r8.append(r10)
        L_0x0081:
            java.lang.StringBuilder r8 = r0.f19234m
            java.util.ArrayList<java.lang.String> r10 = r0.f19235n
            java.lang.String r7 = r7.trim()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            java.util.regex.Pattern r12 = f19233p
            java.util.regex.Matcher r7 = r12.matcher(r7)
            r12 = 0
        L_0x0095:
            boolean r13 = r7.find()
            if (r13 == 0) goto L_0x00b5
            java.lang.String r13 = r7.group()
            r10.add(r13)
            int r14 = r7.start()
            int r14 = r14 - r12
            int r13 = r13.length()
            int r15 = r14 + r13
            java.lang.String r5 = ""
            r11.replace(r14, r15, r5)
            int r12 = r12 + r13
            r5 = 6
            goto L_0x0095
        L_0x00b5:
            java.lang.String r5 = r11.toString()
            r8.append(r5)
            java.lang.String r7 = r3.mo22985d()
            r5 = 6
            goto L_0x006c
        L_0x00c2:
            java.lang.StringBuilder r5 = r0.f19234m
            java.lang.String r5 = r5.toString()
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            r7 = 0
            r8 = 0
        L_0x00ce:
            java.util.ArrayList<java.lang.String> r10 = r0.f19235n
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x00eb
            java.util.ArrayList<java.lang.String> r10 = r0.f19235n
            java.lang.Object r10 = r10.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "\\{\\\\an[1-9]\\}"
            boolean r11 = r10.matches(r11)
            if (r11 == 0) goto L_0x00e8
            r7 = r10
            goto L_0x00eb
        L_0x00e8:
            int r8 = r8 + 1
            goto L_0x00ce
        L_0x00eb:
            ib.a$a r8 = new ib.a$a
            r8.<init>()
            r8.f17606a = r5
            if (r7 != 0) goto L_0x00fe
            ib.a r5 = r8.mo21116a()
            r19 = r2
            r20 = r3
            goto L_0x0241
        L_0x00fe:
            int r5 = r7.hashCode()
            java.lang.String r10 = "{\\an9}"
            java.lang.String r11 = "{\\an8}"
            java.lang.String r12 = "{\\an7}"
            java.lang.String r13 = "{\\an6}"
            java.lang.String r14 = "{\\an5}"
            java.lang.String r15 = "{\\an4}"
            java.lang.String r4 = "{\\an3}"
            java.lang.String r6 = "{\\an2}"
            java.lang.String r0 = "{\\an1}"
            r16 = 8
            r17 = 7
            r18 = -1
            r19 = r2
            r2 = 2
            switch(r5) {
                case -685620710: goto L_0x016b;
                case -685620679: goto L_0x0163;
                case -685620648: goto L_0x015b;
                case -685620617: goto L_0x0153;
                case -685620586: goto L_0x014b;
                case -685620555: goto L_0x0143;
                case -685620524: goto L_0x013b;
                case -685620493: goto L_0x0132;
                case -685620462: goto L_0x012a;
                default: goto L_0x0129;
            }
        L_0x0129:
            goto L_0x0173
        L_0x012a:
            boolean r5 = r7.equals(r10)
            if (r5 == 0) goto L_0x0173
            r5 = 5
            goto L_0x0174
        L_0x0132:
            boolean r5 = r7.equals(r11)
            if (r5 == 0) goto L_0x0173
            r5 = 8
            goto L_0x0174
        L_0x013b:
            boolean r5 = r7.equals(r12)
            if (r5 == 0) goto L_0x0173
            r5 = 2
            goto L_0x0174
        L_0x0143:
            boolean r5 = r7.equals(r13)
            if (r5 == 0) goto L_0x0173
            r5 = 4
            goto L_0x0174
        L_0x014b:
            boolean r5 = r7.equals(r14)
            if (r5 == 0) goto L_0x0173
            r5 = 7
            goto L_0x0174
        L_0x0153:
            boolean r5 = r7.equals(r15)
            if (r5 == 0) goto L_0x0173
            r5 = 1
            goto L_0x0174
        L_0x015b:
            boolean r5 = r7.equals(r4)
            if (r5 == 0) goto L_0x0173
            r5 = 3
            goto L_0x0174
        L_0x0163:
            boolean r5 = r7.equals(r6)
            if (r5 == 0) goto L_0x0173
            r5 = 6
            goto L_0x0174
        L_0x016b:
            boolean r5 = r7.equals(r0)
            if (r5 == 0) goto L_0x0173
            r5 = 0
            goto L_0x0174
        L_0x0173:
            r5 = -1
        L_0x0174:
            r20 = r3
            if (r5 == 0) goto L_0x018d
            r3 = 1
            if (r5 == r3) goto L_0x018d
            if (r5 == r2) goto L_0x018d
            r2 = 3
            if (r5 == r2) goto L_0x0189
            r2 = 4
            if (r5 == r2) goto L_0x0189
            r2 = 5
            if (r5 == r2) goto L_0x0189
            r8.f17614i = r3
            goto L_0x0190
        L_0x0189:
            r2 = 2
            r8.f17614i = r2
            goto L_0x0190
        L_0x018d:
            r2 = 0
            r8.f17614i = r2
        L_0x0190:
            int r2 = r7.hashCode()
            switch(r2) {
                case -685620710: goto L_0x01d9;
                case -685620679: goto L_0x01d1;
                case -685620648: goto L_0x01c9;
                case -685620617: goto L_0x01c1;
                case -685620586: goto L_0x01b9;
                case -685620555: goto L_0x01b0;
                case -685620524: goto L_0x01a8;
                case -685620493: goto L_0x01a0;
                case -685620462: goto L_0x0198;
                default: goto L_0x0197;
            }
        L_0x0197:
            goto L_0x01e1
        L_0x0198:
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x01e1
            r5 = 5
            goto L_0x01e2
        L_0x01a0:
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x01e1
            r5 = 4
            goto L_0x01e2
        L_0x01a8:
            boolean r0 = r7.equals(r12)
            if (r0 == 0) goto L_0x01e1
            r5 = 3
            goto L_0x01e2
        L_0x01b0:
            boolean r0 = r7.equals(r13)
            if (r0 == 0) goto L_0x01e1
            r5 = 8
            goto L_0x01e2
        L_0x01b9:
            boolean r0 = r7.equals(r14)
            if (r0 == 0) goto L_0x01e1
            r5 = 7
            goto L_0x01e2
        L_0x01c1:
            boolean r0 = r7.equals(r15)
            if (r0 == 0) goto L_0x01e1
            r5 = 6
            goto L_0x01e2
        L_0x01c9:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x01e1
            r5 = 2
            goto L_0x01e2
        L_0x01d1:
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x01e1
            r5 = 1
            goto L_0x01e2
        L_0x01d9:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x01e1
            r5 = 0
            goto L_0x01e2
        L_0x01e1:
            r5 = -1
        L_0x01e2:
            if (r5 == 0) goto L_0x01fb
            r0 = 1
            if (r5 == r0) goto L_0x01fb
            r2 = 2
            if (r5 == r2) goto L_0x01fb
            r2 = 3
            if (r5 == r2) goto L_0x01f6
            r2 = 4
            if (r5 == r2) goto L_0x01f6
            r2 = 5
            if (r5 == r2) goto L_0x01f6
            r8.f17612g = r0
            goto L_0x01f9
        L_0x01f6:
            r0 = 0
            r8.f17612g = r0
        L_0x01f9:
            r0 = 2
            goto L_0x01fe
        L_0x01fb:
            r0 = 2
            r8.f17612g = r0
        L_0x01fe:
            int r2 = r8.f17614i
            r3 = 1064011039(0x3f6b851f, float:0.92)
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1034147594(0x3da3d70a, float:0.08)
            if (r2 == 0) goto L_0x021c
            r6 = 1
            if (r2 == r6) goto L_0x0219
            if (r2 != r0) goto L_0x0213
            r0 = 1064011039(0x3f6b851f, float:0.92)
            goto L_0x021f
        L_0x0213:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0219:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x021f
        L_0x021c:
            r0 = 1034147594(0x3da3d70a, float:0.08)
        L_0x021f:
            r8.f17613h = r0
            int r0 = r8.f17612g
            if (r0 == 0) goto L_0x0235
            r2 = 1
            if (r0 == r2) goto L_0x0232
            r2 = 2
            if (r0 != r2) goto L_0x022c
            goto L_0x0238
        L_0x022c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0232:
            r3 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0238
        L_0x0235:
            r3 = 1034147594(0x3da3d70a, float:0.08)
        L_0x0238:
            r8.f17610e = r3
            r0 = 0
            r8.f17611f = r0
            ib.a r5 = r8.mo21116a()
        L_0x0241:
            r1.add(r5)
            ib.a r0 = p126ib.C5332a.f17588r
            r1.add(r0)
            r5 = r9
            r2 = r19
            goto L_0x0268
        L_0x024d:
            r20 = r3
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "Skipping invalid timing: "
            r0.concat(r6)
            goto L_0x0268
        L_0x025b:
            r20 = r3
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "Skipping invalid index: "
            r0.concat(r6)
        L_0x0268:
            r0 = r21
            r3 = r20
            r4 = 0
            goto L_0x0016
        L_0x026f:
            r0 = 0
            ib.a[] r0 = new p126ib.C5332a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            ib.a[] r0 = (p126ib.C5332a[]) r0
            long[] r1 = java.util.Arrays.copyOf(r2, r5)
            ob.b r2 = new ob.b
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p200ob.C6017a.mo21119g(byte[], int, boolean):ib.d");
    }
}
