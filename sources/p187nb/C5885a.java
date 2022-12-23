package p187nb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p126ib.C5334b;
import p277ub.C6774a0;
import p277ub.C6803r;
import p583jk.C17875h;
import p624ld.C18187b;

/* renamed from: nb.a */
public final class C5885a extends C5334b {

    /* renamed from: r */
    public static final Pattern f18911r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m */
    public final boolean f18912m;

    /* renamed from: n */
    public final C5886b f18913n;

    /* renamed from: o */
    public LinkedHashMap f18914o;

    /* renamed from: p */
    public float f18915p = -3.4028235E38f;

    /* renamed from: q */
    public float f18916q = -3.4028235E38f;

    public C5885a(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f18912m = false;
            this.f18913n = null;
            return;
        }
        this.f18912m = true;
        int i = C6774a0.f20959a;
        String str = new String(list.get(0), C18187b.f46429c);
        C17875h.m44301k(str.startsWith("Format:"));
        C5886b a = C5886b.m14346a(str);
        a.getClass();
        this.f18913n = a;
        mo21759i(new C6803r(list.get(1)));
    }

    /* renamed from: h */
    public static int m14342h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() != j) {
                    if (((Long) arrayList.get(size)).longValue() < j) {
                        i = size + 1;
                        break;
                    }
                } else {
                    return size;
                }
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    /* renamed from: j */
    public static long m14343j(String str) {
        Matcher matcher = f18911r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = C6774a0.f20959a;
        long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e3 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ef A[Catch:{ RuntimeException -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p126ib.C5336d mo21119g(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ub.r r3 = new ub.r
            r4 = r22
            r5 = r23
            r3.<init>(r4, r5)
            boolean r4 = r0.f18912m
            if (r4 != 0) goto L_0x001c
            r0.mo21759i(r3)
        L_0x001c:
            boolean r4 = r0.f18912m
            if (r4 == 0) goto L_0x0023
            nb.b r4 = r0.f18913n
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.lang.String r6 = r3.mo22985d()
            if (r6 == 0) goto L_0x027e
            java.lang.String r7 = "Format:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0037
            nb.b r4 = p187nb.C5886b.m14346a(r6)
            goto L_0x0024
        L_0x0037:
            java.lang.String r7 = "Dialogue:"
            boolean r8 = r6.startsWith(r7)
            if (r8 == 0) goto L_0x0272
            if (r4 != 0) goto L_0x004e
            int r7 = r6.length()
            if (r7 == 0) goto L_0x0272
            java.lang.String r7 = "Skipping dialogue line before complete format: "
            r7.concat(r6)
            goto L_0x0272
        L_0x004e:
            boolean r7 = r6.startsWith(r7)
            p583jk.C17875h.m44301k(r7)
            r7 = 9
            java.lang.String r7 = r6.substring(r7)
            int r8 = r4.f18921e
            java.lang.String r9 = ","
            java.lang.String[] r7 = r7.split(r9, r8)
            int r8 = r7.length
            int r9 = r4.f18921e
            if (r8 == r9) goto L_0x0075
            int r7 = r6.length()
            if (r7 == 0) goto L_0x0272
            java.lang.String r7 = "Skipping dialogue line with fewer columns than format: "
            r7.concat(r6)
            goto L_0x0272
        L_0x0075:
            int r8 = r4.f18917a
            r8 = r7[r8]
            long r8 = m14343j(r8)
            java.lang.String r10 = "Skipping invalid timing: "
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0093
            int r7 = r6.length()
            if (r7 == 0) goto L_0x0272
            r10.concat(r6)
            goto L_0x0272
        L_0x0093:
            int r13 = r4.f18918b
            r13 = r7[r13]
            long r13 = m14343j(r13)
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x00aa
            int r7 = r6.length()
            if (r7 == 0) goto L_0x0272
            r10.concat(r6)
            goto L_0x0272
        L_0x00aa:
            java.util.LinkedHashMap r6 = r0.f18914o
            r10 = -1
            if (r6 == 0) goto L_0x00c0
            int r11 = r4.f18919c
            if (r11 == r10) goto L_0x00c0
            r11 = r7[r11]
            java.lang.String r11 = r11.trim()
            java.lang.Object r6 = r6.get(r11)
            nb.c r6 = (p187nb.C5887c) r6
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            int r11 = r4.f18920d
            r7 = r7[r11]
            java.util.regex.Pattern r11 = p187nb.C5887c.C5889b.f18939a
            java.util.regex.Matcher r11 = r11.matcher(r7)
            r12 = -1
            r15 = 0
        L_0x00cd:
            boolean r16 = r11.find()
            r5 = 1
            if (r16 == 0) goto L_0x0105
            java.lang.String r10 = r11.group(r5)
            r10.getClass()
            android.graphics.PointF r16 = p187nb.C5887c.C5889b.m14350a(r10)     // Catch:{ RuntimeException -> 0x00e3 }
            if (r16 == 0) goto L_0x00e3
            r15 = r16
        L_0x00e3:
            java.util.regex.Pattern r5 = p187nb.C5887c.C5889b.f18942d     // Catch:{ RuntimeException -> 0x0102 }
            java.util.regex.Matcher r5 = r5.matcher(r10)     // Catch:{ RuntimeException -> 0x0102 }
            boolean r10 = r5.find()     // Catch:{ RuntimeException -> 0x0102 }
            if (r10 == 0) goto L_0x00fc
            r10 = 1
            java.lang.String r5 = r5.group(r10)     // Catch:{ RuntimeException -> 0x0102 }
            r5.getClass()     // Catch:{ RuntimeException -> 0x0102 }
            int r5 = p187nb.C5887c.m14347a(r5)     // Catch:{ RuntimeException -> 0x0102 }
            goto L_0x00fd
        L_0x00fc:
            r5 = -1
        L_0x00fd:
            r10 = -1
            if (r5 == r10) goto L_0x0103
            r12 = r5
            goto L_0x00cd
        L_0x0102:
        L_0x0103:
            r10 = -1
            goto L_0x00cd
        L_0x0105:
            nb.c$b r5 = new nb.c$b
            java.util.regex.Pattern r5 = p187nb.C5887c.C5889b.f18939a
            java.util.regex.Matcher r5 = r5.matcher(r7)
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replaceAll(r7)
            java.lang.String r7 = "\n"
            java.lang.String r10 = "\\N"
            java.lang.String r5 = r5.replace(r10, r7)
            java.lang.String r10 = "\\n"
            java.lang.String r5 = r5.replace(r10, r7)
            java.lang.String r7 = "\\h"
            java.lang.String r10 = " "
            java.lang.String r5 = r5.replace(r7, r10)
            float r7 = r0.f18915p
            float r10 = r0.f18916q
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r5)
            ib.a$a r5 = new ib.a$a
            r5.<init>()
            r5.f17606a = r11
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r6 == 0) goto L_0x01d1
            java.lang.Integer r0 = r6.f18924c
            r17 = r3
            if (r0 == 0) goto L_0x015f
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r3 = r6.f18924c
            int r3 = r3.intValue()
            r0.<init>(r3)
            int r3 = r11.length()
            r18 = r4
            r19 = r13
            r4 = 33
            r13 = 0
            r11.setSpan(r0, r13, r3, r4)
            goto L_0x0163
        L_0x015f:
            r18 = r4
            r19 = r13
        L_0x0163:
            float r0 = r6.f18925d
            int r3 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x0173
            int r3 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x0173
            float r0 = r0 / r10
            r5.f17616k = r0
            r0 = 1
            r5.f17615j = r0
        L_0x0173:
            boolean r0 = r6.f18926e
            if (r0 == 0) goto L_0x018c
            boolean r3 = r6.f18927f
            if (r3 == 0) goto L_0x018c
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 3
            r0.<init>(r3)
            int r3 = r11.length()
            r4 = 33
            r13 = 0
            r11.setSpan(r0, r13, r3, r4)
            goto L_0x01b0
        L_0x018c:
            r4 = 33
            r13 = 0
            if (r0 == 0) goto L_0x019f
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 1
            r0.<init>(r3)
            int r3 = r11.length()
            r11.setSpan(r0, r13, r3, r4)
            goto L_0x01b0
        L_0x019f:
            boolean r0 = r6.f18927f
            if (r0 == 0) goto L_0x01b0
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r3 = 2
            r0.<init>(r3)
            int r3 = r11.length()
            r11.setSpan(r0, r13, r3, r4)
        L_0x01b0:
            boolean r0 = r6.f18928g
            if (r0 == 0) goto L_0x01c0
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            int r3 = r11.length()
            r11.setSpan(r0, r13, r3, r4)
        L_0x01c0:
            boolean r0 = r6.f18929h
            if (r0 == 0) goto L_0x01d7
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            int r3 = r11.length()
            r11.setSpan(r0, r13, r3, r4)
            goto L_0x01d7
        L_0x01d1:
            r17 = r3
            r18 = r4
            r19 = r13
        L_0x01d7:
            r0 = -1
            if (r12 == r0) goto L_0x01dc
            r0 = r12
            goto L_0x01e0
        L_0x01dc:
            if (r6 == 0) goto L_0x01e0
            int r0 = r6.f18923b
        L_0x01e0:
            switch(r0) {
                case 1: goto L_0x01eb;
                case 2: goto L_0x01e8;
                case 3: goto L_0x01e5;
                case 4: goto L_0x01eb;
                case 5: goto L_0x01e8;
                case 6: goto L_0x01e5;
                case 7: goto L_0x01eb;
                case 8: goto L_0x01e8;
                case 9: goto L_0x01e5;
                default: goto L_0x01e3;
            }
        L_0x01e3:
            r3 = 0
            goto L_0x01ed
        L_0x01e5:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01ed
        L_0x01e8:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01ed
        L_0x01eb:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x01ed:
            r5.f17608c = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case 1: goto L_0x01fb;
                case 2: goto L_0x01f9;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01fb;
                case 5: goto L_0x01f9;
                case 6: goto L_0x01f7;
                case 7: goto L_0x01fb;
                case 8: goto L_0x01f9;
                case 9: goto L_0x01f7;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01fc
        L_0x01f7:
            r4 = 2
            goto L_0x01fc
        L_0x01f9:
            r4 = 1
            goto L_0x01fc
        L_0x01fb:
            r4 = 0
        L_0x01fc:
            r5.f17614i = r4
            switch(r0) {
                case 1: goto L_0x0206;
                case 2: goto L_0x0206;
                case 3: goto L_0x0206;
                case 4: goto L_0x0204;
                case 5: goto L_0x0204;
                case 6: goto L_0x0204;
                case 7: goto L_0x0202;
                case 8: goto L_0x0202;
                case 9: goto L_0x0202;
                default: goto L_0x0201;
            }
        L_0x0201:
            goto L_0x0207
        L_0x0202:
            r3 = 0
            goto L_0x0207
        L_0x0204:
            r3 = 1
            goto L_0x0207
        L_0x0206:
            r3 = 2
        L_0x0207:
            r5.f17612g = r3
            if (r15 == 0) goto L_0x0221
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0221
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0221
            float r0 = r15.x
            float r0 = r0 / r7
            r5.f17613h = r0
            float r0 = r15.y
            float r0 = r0 / r10
            r5.f17610e = r0
            r0 = 0
            r5.f17611f = r0
            goto L_0x0256
        L_0x0221:
            r0 = 1064514355(0x3f733333, float:0.95)
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1028443341(0x3d4ccccd, float:0.05)
            r10 = 1
            r11 = 2
            if (r4 == 0) goto L_0x023c
            if (r4 == r10) goto L_0x0239
            if (r4 == r11) goto L_0x0235
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x023f
        L_0x0235:
            r4 = 1064514355(0x3f733333, float:0.95)
            goto L_0x023f
        L_0x0239:
            r4 = 1056964608(0x3f000000, float:0.5)
            goto L_0x023f
        L_0x023c:
            r4 = 1028443341(0x3d4ccccd, float:0.05)
        L_0x023f:
            r5.f17613h = r4
            if (r3 == 0) goto L_0x024e
            if (r3 == r10) goto L_0x024b
            if (r3 == r11) goto L_0x0251
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x0251
        L_0x024b:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0251
        L_0x024e:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
        L_0x0251:
            r5.f17610e = r0
            r0 = 0
            r5.f17611f = r0
        L_0x0256:
            ib.a r0 = r5.mo21116a()
            int r3 = m14342h(r8, r2, r1)
            r4 = r19
            int r4 = m14342h(r4, r2, r1)
        L_0x0264:
            if (r3 >= r4) goto L_0x0276
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x0264
        L_0x0272:
            r17 = r3
            r18 = r4
        L_0x0276:
            r0 = r21
            r3 = r17
            r4 = r18
            goto L_0x0024
        L_0x027e:
            nb.d r0 = new nb.d
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p187nb.C5885a.mo21119g(byte[], int, boolean):ib.d");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21759i(p277ub.C6803r r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
        L_0x0004:
            java.lang.String r0 = r26.mo22985d()
            if (r0 == 0) goto L_0x02a0
            java.lang.String r3 = "[Script Info]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            r4 = 91
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0070
        L_0x0017:
            java.lang.String r0 = r26.mo22985d()
            if (r0 == 0) goto L_0x0004
            int r3 = r2.f21040c
            int r8 = r2.f21039b
            int r3 = r3 - r8
            if (r3 == 0) goto L_0x002c
            byte[] r3 = r2.f21038a
            byte r3 = r3[r8]
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 == r4) goto L_0x0004
        L_0x002c:
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            if (r3 == r5) goto L_0x0036
            goto L_0x0017
        L_0x0036:
            r3 = r0[r7]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.play.core.appupdate.C14226d.m35341H0(r3)
            r3.getClass()
            java.lang.String r8 = "playresx"
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x0061
            java.lang.String r8 = "playresy"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x0054
            goto L_0x0017
        L_0x0054:
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x006e }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x006e }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x006e }
            r1.f18916q = r0     // Catch:{ NumberFormatException -> 0x006e }
            goto L_0x0017
        L_0x0061:
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x006e }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x006e }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x006e }
            r1.f18915p = r0     // Catch:{ NumberFormatException -> 0x006e }
            goto L_0x0017
        L_0x006e:
            goto L_0x0017
        L_0x0070:
            java.lang.String r3 = "[V4+ Styles]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x028e
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r8 = 0
        L_0x007e:
            r9 = r8
        L_0x007f:
            java.lang.String r10 = r26.mo22985d()
            if (r10 == 0) goto L_0x028a
            int r0 = r2.f21040c
            int r11 = r2.f21039b
            int r0 = r0 - r11
            if (r0 == 0) goto L_0x0094
            byte[] r0 = r2.f21038a
            byte r0 = r0[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L_0x028a
        L_0x0094:
            java.lang.String r0 = "Format:"
            boolean r0 = r10.startsWith(r0)
            java.lang.String r11 = ","
            r12 = 6
            r13 = 3
            r14 = -1
            if (r0 == 0) goto L_0x015c
            r0 = 7
            java.lang.String r9 = r10.substring(r0)
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r11)
            r10 = 0
            r11 = -1
            r17 = -1
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1
        L_0x00ba:
            int r15 = r9.length
            if (r10 >= r15) goto L_0x014c
            r15 = r9[r10]
            java.lang.String r15 = r15.trim()
            java.lang.String r15 = com.google.android.play.core.appupdate.C14226d.m35341H0(r15)
            r15.getClass()
            int r16 = r15.hashCode()
            switch(r16) {
                case -1178781136: goto L_0x0121;
                case -1026963764: goto L_0x0115;
                case -192095652: goto L_0x010a;
                case -70925746: goto L_0x00ff;
                case 3029637: goto L_0x00f4;
                case 3373707: goto L_0x00e9;
                case 366554320: goto L_0x00de;
                case 1767875043: goto L_0x00d3;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x012c
        L_0x00d3:
            java.lang.String r0 = "alignment"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00dc
            goto L_0x012c
        L_0x00dc:
            r0 = 7
            goto L_0x012d
        L_0x00de:
            java.lang.String r0 = "fontsize"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00e7
            goto L_0x012c
        L_0x00e7:
            r0 = 6
            goto L_0x012d
        L_0x00e9:
            java.lang.String r0 = "name"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00f2
            goto L_0x012c
        L_0x00f2:
            r0 = 5
            goto L_0x012d
        L_0x00f4:
            java.lang.String r0 = "bold"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00fd
            goto L_0x012c
        L_0x00fd:
            r0 = 4
            goto L_0x012d
        L_0x00ff:
            java.lang.String r0 = "primarycolour"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0108
            goto L_0x012c
        L_0x0108:
            r0 = 3
            goto L_0x012d
        L_0x010a:
            java.lang.String r0 = "strikeout"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0113
            goto L_0x012c
        L_0x0113:
            r0 = 2
            goto L_0x012d
        L_0x0115:
            java.lang.String r0 = "underline"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x011f
            goto L_0x012c
        L_0x011f:
            r0 = 1
            goto L_0x012d
        L_0x0121:
            java.lang.String r0 = "italic"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r0 = 0
            goto L_0x012d
        L_0x012c:
            r0 = -1
        L_0x012d:
            switch(r0) {
                case 0: goto L_0x0145;
                case 1: goto L_0x0142;
                case 2: goto L_0x013f;
                case 3: goto L_0x013c;
                case 4: goto L_0x0139;
                case 5: goto L_0x0137;
                case 6: goto L_0x0134;
                case 7: goto L_0x0131;
                default: goto L_0x0130;
            }
        L_0x0130:
            goto L_0x0147
        L_0x0131:
            r17 = r10
            goto L_0x0147
        L_0x0134:
            r19 = r10
            goto L_0x0147
        L_0x0137:
            r11 = r10
            goto L_0x0147
        L_0x0139:
            r20 = r10
            goto L_0x0147
        L_0x013c:
            r18 = r10
            goto L_0x0147
        L_0x013f:
            r23 = r10
            goto L_0x0147
        L_0x0142:
            r22 = r10
            goto L_0x0147
        L_0x0145:
            r21 = r10
        L_0x0147:
            int r10 = r10 + 1
            r0 = 7
            goto L_0x00ba
        L_0x014c:
            if (r11 == r14) goto L_0x007e
            nb.c$a r0 = new nb.c$a
            int r9 = r9.length
            r15 = r0
            r16 = r11
            r24 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r9 = r0
            goto L_0x007f
        L_0x015c:
            java.lang.String r0 = "Style:"
            boolean r15 = r10.startsWith(r0)
            if (r15 == 0) goto L_0x0284
            if (r9 != 0) goto L_0x0173
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0284
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            r0.concat(r10)
            goto L_0x0284
        L_0x0173:
            java.lang.String r15 = "'"
            boolean r0 = r10.startsWith(r0)
            p583jk.C17875h.m44301k(r0)
            java.lang.String r0 = r10.substring(r12)
            java.lang.String[] r11 = android.text.TextUtils.split(r0, r11)
            int r0 = r11.length
            int r12 = r9.f18938i
            if (r0 == r12) goto L_0x01a1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0[r7] = r12
            int r11 = r11.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0[r6] = r11
            r0[r5] = r10
            java.lang.String r10 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            p277ub.C6774a0.m15950j(r10, r0)
            goto L_0x027c
        L_0x01a1:
            nb.c r12 = new nb.c     // Catch:{ RuntimeException -> 0x025e }
            int r0 = r9.f18930a     // Catch:{ RuntimeException -> 0x025e }
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r17 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            int r0 = r9.f18931b     // Catch:{ RuntimeException -> 0x025e }
            if (r0 == r14) goto L_0x01bc
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            int r0 = p187nb.C5887c.m14347a(r0)     // Catch:{ RuntimeException -> 0x025e }
            r18 = r0
            goto L_0x01be
        L_0x01bc:
            r18 = -1
        L_0x01be:
            int r0 = r9.f18932c     // Catch:{ RuntimeException -> 0x025e }
            if (r0 == r14) goto L_0x01cf
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            java.lang.Integer r0 = p187nb.C5887c.m14349c(r0)     // Catch:{ RuntimeException -> 0x025e }
            r19 = r0
            goto L_0x01d1
        L_0x01cf:
            r19 = r8
        L_0x01d1:
            int r0 = r9.f18933d     // Catch:{ RuntimeException -> 0x025e }
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r0 == r14) goto L_0x0209
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r4 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            float r13 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x01e3 }
            goto L_0x0206
        L_0x01e3:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ RuntimeException -> 0x025e }
            int r0 = r0.length()     // Catch:{ RuntimeException -> 0x025e }
            int r0 = r0 + 29
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x025e }
            r6.<init>(r0)     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = "Failed to parse font size: '"
            r6.append(r0)     // Catch:{ RuntimeException -> 0x025e }
            r6.append(r4)     // Catch:{ RuntimeException -> 0x025e }
            r6.append(r15)     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r6.toString()     // Catch:{ RuntimeException -> 0x025e }
            p277ub.C6776b0.m15968a(r0, r5)     // Catch:{ RuntimeException -> 0x025e }
        L_0x0206:
            r20 = r13
            goto L_0x020c
        L_0x0209:
            r20 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x020c:
            int r0 = r9.f18934e     // Catch:{ RuntimeException -> 0x025e }
            if (r0 == r14) goto L_0x021d
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            boolean r0 = p187nb.C5887c.m14348b(r0)     // Catch:{ RuntimeException -> 0x025e }
            r21 = r0
            goto L_0x021f
        L_0x021d:
            r21 = 0
        L_0x021f:
            int r0 = r9.f18935f     // Catch:{ RuntimeException -> 0x025e }
            if (r0 == r14) goto L_0x0230
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            boolean r0 = p187nb.C5887c.m14348b(r0)     // Catch:{ RuntimeException -> 0x025e }
            r22 = r0
            goto L_0x0232
        L_0x0230:
            r22 = 0
        L_0x0232:
            int r0 = r9.f18936g     // Catch:{ RuntimeException -> 0x025e }
            if (r0 == r14) goto L_0x0243
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            boolean r0 = p187nb.C5887c.m14348b(r0)     // Catch:{ RuntimeException -> 0x025e }
            r23 = r0
            goto L_0x0245
        L_0x0243:
            r23 = 0
        L_0x0245:
            int r0 = r9.f18937h     // Catch:{ RuntimeException -> 0x025e }
            if (r0 == r14) goto L_0x0256
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x025e }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x025e }
            boolean r0 = p187nb.C5887c.m14348b(r0)     // Catch:{ RuntimeException -> 0x025e }
            r24 = r0
            goto L_0x0258
        L_0x0256:
            r24 = 0
        L_0x0258:
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RuntimeException -> 0x025e }
            goto L_0x027d
        L_0x025e:
            r0 = move-exception
            int r4 = r10.length()
            int r4 = r4 + 36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Skipping malformed 'Style:' line: '"
            r5.append(r4)
            r5.append(r10)
            r5.append(r15)
            java.lang.String r4 = r5.toString()
            p277ub.C6776b0.m15968a(r4, r0)
        L_0x027c:
            r12 = r8
        L_0x027d:
            if (r12 == 0) goto L_0x0284
            java.lang.String r0 = r12.f18922a
            r3.put(r0, r12)
        L_0x0284:
            r4 = 91
            r5 = 2
            r6 = 1
            goto L_0x007f
        L_0x028a:
            r1.f18914o = r3
            goto L_0x0004
        L_0x028e:
            java.lang.String r3 = "[V4 Styles]"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0298
            goto L_0x0004
        L_0x0298:
            java.lang.String r3 = "[Events]"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0004
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187nb.C5885a.mo21759i(ub.r):void");
    }
}
