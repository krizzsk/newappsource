package p216q1;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import p216q1.C6138e;
import p216q1.C6143f;

/* renamed from: q1.a */
public final class C6131a {

    /* renamed from: d */
    public static final String f19485d = Character.toString(8206);

    /* renamed from: e */
    public static final String f19486e = Character.toString(8207);

    /* renamed from: f */
    public static final C6131a f19487f;

    /* renamed from: g */
    public static final C6131a f19488g;

    /* renamed from: a */
    public final boolean f19489a;

    /* renamed from: b */
    public final int f19490b;

    /* renamed from: c */
    public final C6137d f19491c;

    /* renamed from: q1.a$a */
    public static class C6132a {

        /* renamed from: e */
        public static final byte[] f19492e = new byte[1792];

        /* renamed from: a */
        public final CharSequence f19493a;

        /* renamed from: b */
        public final int f19494b;

        /* renamed from: c */
        public int f19495c;

        /* renamed from: d */
        public char f19496d;

        static {
            for (int i = 0; i < 1792; i++) {
                f19492e[i] = Character.getDirectionality(i);
            }
        }

        public C6132a(CharSequence charSequence) {
            this.f19493a = charSequence;
            this.f19494b = charSequence.length();
        }

        /* renamed from: a */
        public final byte mo22100a() {
            char charAt = this.f19493a.charAt(this.f19495c - 1);
            this.f19496d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f19493a, this.f19495c);
                this.f19495c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f19495c--;
            char c = this.f19496d;
            if (c < 1792) {
                return f19492e[c];
            }
            return Character.getDirectionality(c);
        }
    }

    static {
        C6138e.C6142d dVar = C6138e.f19503c;
        f19487f = new C6131a(false, 2, dVar);
        f19488g = new C6131a(true, 2, dVar);
    }

    public C6131a(boolean z, int i, C6138e.C6142d dVar) {
        this.f19489a = z;
        this.f19490b = i;
        this.f19491c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14689a(java.lang.CharSequence r9) {
        /*
            q1.a$a r0 = new q1.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f19495c = r9
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.f19495c
            int r7 = r0.f19494b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f19493a
            char r6 = r7.charAt(r6)
            r0.f19496d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f19493a
            int r7 = r0.f19495c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f19495c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f19495c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f19495c
            int r6 = r6 + r2
            r0.f19495c = r6
            char r6 = r0.f19496d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = p216q1.C6131a.C6132a.f19492e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r9 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f19495c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.mo22100a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r9 = 1
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r9 = -1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p216q1.C6131a.m14689a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1 = r1 - 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14690b(java.lang.CharSequence r6) {
        /*
            q1.a$a r0 = new q1.a$a
            r0.<init>(r6)
            int r6 = r0.f19494b
            r0.f19495c = r6
            r6 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f19495c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.mo22100a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0029:
            if (r2 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r2 != r1) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0032:
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            r6 = 1
            goto L_0x0041
        L_0x0036:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r2 != 0) goto L_0x000c
        L_0x003f:
            r2 = r1
            goto L_0x000c
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p216q1.C6131a.m14690b(java.lang.CharSequence):int");
    }

    /* renamed from: c */
    public static C6131a m14691c() {
        Locale locale = Locale.getDefault();
        int i = C6143f.f19508a;
        boolean z = true;
        if (C6143f.C6144a.m14704a(locale) != 1) {
            z = false;
        }
        if (z) {
            return f19488g;
        }
        return f19487f;
    }

    /* renamed from: d */
    public final SpannableStringBuilder mo22099d(CharSequence charSequence, C6137d dVar) {
        boolean z;
        C6138e.C6142d dVar2;
        char c;
        C6138e.C6142d dVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b = ((C6138e.C6141c) dVar).mo22118b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f19490b & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            if (b) {
                dVar3 = C6138e.f19502b;
            } else {
                dVar3 = C6138e.f19501a;
            }
            boolean b2 = dVar3.mo22118b(charSequence, charSequence.length());
            if (!this.f19489a && (b2 || m14689a(charSequence) == 1)) {
                str = f19485d;
            } else if (!this.f19489a || (b2 && m14689a(charSequence) != -1)) {
                str = str2;
            } else {
                str = f19486e;
            }
            spannableStringBuilder.append(str);
        }
        if (b != this.f19489a) {
            if (b) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b) {
            dVar2 = C6138e.f19502b;
        } else {
            dVar2 = C6138e.f19501a;
        }
        boolean b3 = dVar2.mo22118b(charSequence, charSequence.length());
        if (!this.f19489a && (b3 || m14690b(charSequence) == 1)) {
            str2 = f19485d;
        } else if (this.f19489a && (!b3 || m14690b(charSequence) == -1)) {
            str2 = f19486e;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
