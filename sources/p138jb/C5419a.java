package p138jb;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5341h;
import p277ub.C6774a0;
import p277ub.C6803r;

/* renamed from: jb.a */
public final class C5419a extends C5426c {

    /* renamed from: A */
    public static final int[] f17791A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    public static final int[] f17792B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    public static final int[] f17793C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    public static final int[] f17794D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f17795E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f17796F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y */
    public static final int[] f17797y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f17798z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g */
    public final C6803r f17799g = new C6803r();

    /* renamed from: h */
    public final int f17800h;

    /* renamed from: i */
    public final int f17801i;

    /* renamed from: j */
    public final int f17802j;

    /* renamed from: k */
    public final long f17803k = 16000000;

    /* renamed from: l */
    public final ArrayList<C5420a> f17804l = new ArrayList<>();

    /* renamed from: m */
    public C5420a f17805m = new C5420a(0, 4);

    /* renamed from: n */
    public List<C5332a> f17806n;

    /* renamed from: o */
    public List<C5332a> f17807o;

    /* renamed from: p */
    public int f17808p;

    /* renamed from: q */
    public int f17809q;

    /* renamed from: r */
    public boolean f17810r;

    /* renamed from: s */
    public boolean f17811s;

    /* renamed from: t */
    public byte f17812t;

    /* renamed from: u */
    public byte f17813u;

    /* renamed from: v */
    public int f17814v = 0;

    /* renamed from: w */
    public boolean f17815w;

    /* renamed from: x */
    public long f17816x;

    /* renamed from: jb.a$a */
    public static final class C5420a {

        /* renamed from: a */
        public final ArrayList f17817a;

        /* renamed from: b */
        public final ArrayList f17818b;

        /* renamed from: c */
        public final StringBuilder f17819c;

        /* renamed from: d */
        public int f17820d = 15;

        /* renamed from: e */
        public int f17821e = 0;

        /* renamed from: f */
        public int f17822f = 0;

        /* renamed from: g */
        public int f17823g;

        /* renamed from: h */
        public int f17824h;

        /* renamed from: jb.a$a$a */
        public static class C5421a {

            /* renamed from: a */
            public final int f17825a;

            /* renamed from: b */
            public final boolean f17826b;

            /* renamed from: c */
            public int f17827c;

            public C5421a(int i, boolean z, int i2) {
                this.f17825a = i;
                this.f17826b = z;
                this.f17827c = i2;
            }
        }

        public C5420a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.f17817a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f17818b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.f17819c = sb;
            this.f17823g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.f17824h = i2;
        }

        /* renamed from: a */
        public final void mo21193a(char c) {
            if (this.f17819c.length() < 32) {
                this.f17819c.append(c);
            }
        }

        /* renamed from: b */
        public final void mo21194b() {
            C5421a aVar;
            int i;
            int length = this.f17819c.length();
            if (length > 0) {
                this.f17819c.delete(length - 1, length);
                int size = this.f17817a.size();
                while (true) {
                    size--;
                    if (size >= 0 && (i = (aVar = (C5421a) this.f17817a.get(size)).f17827c) == length) {
                        aVar.f17827c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public final C5332a mo21195c(int i) {
            float f;
            int i2 = this.f17821e + this.f17822f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f17818b.size(); i4++) {
                CharSequence charSequence = (CharSequence) this.f17818b.get(i4);
                int i5 = C6774a0.f20959a;
                if (charSequence.length() > i3) {
                    charSequence = charSequence.subSequence(0, i3);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append(10);
            }
            SpannableString d = mo21196d();
            int i6 = C6774a0.f20959a;
            int length = d.length();
            CharSequence charSequence2 = d;
            if (length > i3) {
                charSequence2 = d.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i3 - spannableStringBuilder.length();
            int i7 = i2 - length2;
            if (i == Integer.MIN_VALUE) {
                if (this.f17823g == 2 && (Math.abs(i7) < 3 || length2 < 0)) {
                    i = 1;
                } else if (this.f17823g != 2 || i7 <= 0) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length2;
                }
                f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i8 = this.f17820d;
            if (i8 > 7) {
                i8 = (i8 - 15) - 2;
            } else if (this.f17823g == 1) {
                i8 -= this.f17824h - 1;
            }
            C5332a.C5333a aVar = new C5332a.C5333a();
            aVar.f17606a = spannableStringBuilder;
            aVar.f17608c = Layout.Alignment.ALIGN_NORMAL;
            aVar.f17610e = (float) i8;
            aVar.f17611f = 1;
            aVar.f17613h = f;
            aVar.f17614i = i;
            return aVar.mo21116a();
        }

        /* renamed from: d */
        public final SpannableString mo21196d() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17819c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            boolean z2 = false;
            int i7 = -1;
            while (i2 < this.f17817a.size()) {
                C5421a aVar = (C5421a) this.f17817a.get(i2);
                boolean z3 = aVar.f17826b;
                int i8 = aVar.f17825a;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i7 = C5419a.f17791A[i8];
                    }
                    z2 = z;
                }
                int i9 = aVar.f17827c;
                i2++;
                if (i2 < this.f17817a.size()) {
                    i = ((C5421a) this.f17817a.get(i2)).f17827c;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i3 != -1 && !z3) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i9, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z3) {
                        i3 = i9;
                    }
                    if (i4 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i4, i9, 33);
                        i4 = -1;
                    } else if (i4 == -1 && z2) {
                        i4 = i9;
                    }
                    if (i7 != i6) {
                        if (i6 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, i9, 33);
                        }
                        i5 = i9;
                        i6 = i7;
                    }
                }
            }
            if (!(i3 == -1 || i3 == length)) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
            }
            if (!(i4 == -1 || i4 == length)) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
            }
            if (!(i5 == length || i6 == -1)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public final boolean mo21197e() {
            if (!this.f17817a.isEmpty() || !this.f17818b.isEmpty() || this.f17819c.length() != 0) {
                return false;
            }
            return true;
        }
    }

    public C5419a(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f17800h = i2;
        if (i == 1) {
            this.f17802j = 0;
            this.f17801i = 0;
        } else if (i == 2) {
            this.f17802j = 1;
            this.f17801i = 0;
        } else if (i == 3) {
            this.f17802j = 0;
            this.f17801i = 1;
        } else if (i != 4) {
            this.f17802j = 0;
            this.f17801i = 0;
        } else {
            this.f17802j = 1;
            this.f17801i = 1;
        }
        mo21192k(0);
        mo21191j();
        this.f17815w = true;
        this.f17816x = -9223372036854775807L;
    }

    /* renamed from: e */
    public final C5429d mo21186e() {
        List<C5332a> list = this.f17806n;
        this.f17807o = list;
        list.getClass();
        return new C5429d(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:203:0x0015 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21187f(p138jb.C5426c.C5427a r14) {
        /*
            r13 = this;
            java.nio.ByteBuffer r14 = r14.f13647d
            r14.getClass()
            ub.r r0 = r13.f17799g
            byte[] r1 = r14.array()
            int r14 = r14.limit()
            r0.mo23005x(r14, r1)
            r14 = 0
            r0 = 1
            r1 = 0
        L_0x0015:
            ub.r r2 = r13.f17799g
            int r3 = r2.f21040c
            int r4 = r2.f21039b
            int r3 = r3 - r4
            int r4 = r13.f17800h
            r5 = 3
            if (r3 < r4) goto L_0x02c0
            r3 = 2
            if (r4 != r3) goto L_0x0026
            r2 = -4
            goto L_0x002b
        L_0x0026:
            int r2 = r2.mo22997p()
            byte r2 = (byte) r2
        L_0x002b:
            ub.r r4 = r13.f17799g
            int r4 = r4.mo22997p()
            ub.r r6 = r13.f17799g
            int r6 = r6.mo22997p()
            r7 = r2 & 2
            if (r7 == 0) goto L_0x003c
            goto L_0x0015
        L_0x003c:
            r7 = r2 & 1
            int r8 = r13.f17801i
            if (r7 == r8) goto L_0x0043
            goto L_0x0015
        L_0x0043:
            r7 = r4 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            if (r7 != 0) goto L_0x004e
            if (r8 != 0) goto L_0x004e
            goto L_0x0015
        L_0x004e:
            boolean r9 = r13.f17810r
            r2 = r2 & 4
            r10 = 4
            if (r2 != r10) goto L_0x0061
            boolean[] r2 = f17796F
            boolean r4 = r2[r4]
            if (r4 == 0) goto L_0x0061
            boolean r2 = r2[r6]
            if (r2 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            r13.f17810r = r2
            r4 = 16
            if (r2 == 0) goto L_0x0088
            r6 = r7 & 240(0xf0, float:3.36E-43)
            if (r6 != r4) goto L_0x006e
            r6 = 1
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 == 0) goto L_0x0088
            boolean r6 = r13.f17811s
            if (r6 == 0) goto L_0x0081
            byte r6 = r13.f17812t
            if (r6 != r7) goto L_0x0081
            byte r6 = r13.f17813u
            if (r6 != r8) goto L_0x0081
            r13.f17811s = r14
            r6 = 1
            goto L_0x008b
        L_0x0081:
            r13.f17811s = r0
            r13.f17812t = r7
            r13.f17813u = r8
            goto L_0x008a
        L_0x0088:
            r13.f17811s = r14
        L_0x008a:
            r6 = 0
        L_0x008b:
            if (r6 == 0) goto L_0x008e
            goto L_0x0015
        L_0x008e:
            if (r2 != 0) goto L_0x0097
            if (r9 == 0) goto L_0x0015
            r13.mo21191j()
            goto L_0x02bd
        L_0x0097:
            if (r0 > r7) goto L_0x009f
            r2 = 15
            if (r7 > r2) goto L_0x009f
            r2 = 1
            goto L_0x00a0
        L_0x009f:
            r2 = 0
        L_0x00a0:
            r6 = 20
            r9 = 32
            if (r2 == 0) goto L_0x00a9
            r13.f17815w = r14
            goto L_0x00c4
        L_0x00a9:
            r2 = r7 & 247(0xf7, float:3.46E-43)
            if (r2 != r6) goto L_0x00af
            r2 = 1
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            if (r2 == 0) goto L_0x00c4
            if (r8 == r9) goto L_0x00c2
            r2 = 47
            if (r8 == r2) goto L_0x00c2
            switch(r8) {
                case 37: goto L_0x00c2;
                case 38: goto L_0x00c2;
                case 39: goto L_0x00c2;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            switch(r8) {
                case 41: goto L_0x00c2;
                case 42: goto L_0x00bf;
                case 43: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00c4
        L_0x00bf:
            r13.f17815w = r14
            goto L_0x00c4
        L_0x00c2:
            r13.f17815w = r0
        L_0x00c4:
            boolean r2 = r13.f17815w
            if (r2 != 0) goto L_0x00ca
            goto L_0x0015
        L_0x00ca:
            r2 = r7 & 224(0xe0, float:3.14E-43)
            if (r2 != 0) goto L_0x00d0
            r11 = 1
            goto L_0x00d1
        L_0x00d0:
            r11 = 0
        L_0x00d1:
            if (r11 == 0) goto L_0x00d8
            int r11 = r7 >> 3
            r11 = r11 & r0
            r13.f17814v = r11
        L_0x00d8:
            int r11 = r13.f17814v
            int r12 = r13.f17802j
            if (r11 != r12) goto L_0x00e0
            r11 = 1
            goto L_0x00e1
        L_0x00e0:
            r11 = 0
        L_0x00e1:
            if (r11 != 0) goto L_0x00e5
            goto L_0x0015
        L_0x00e5:
            if (r2 != 0) goto L_0x00e9
            r1 = 1
            goto L_0x00ea
        L_0x00e9:
            r1 = 0
        L_0x00ea:
            if (r1 == 0) goto L_0x029f
            r1 = r7 & 247(0xf7, float:3.46E-43)
            r2 = 17
            if (r1 != r2) goto L_0x00fa
            r11 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r11 != r12) goto L_0x00fa
            r11 = 1
            goto L_0x00fb
        L_0x00fa:
            r11 = 0
        L_0x00fb:
            if (r11 == 0) goto L_0x010b
            jb.a$a r1 = r13.f17805m
            r2 = r8 & 15
            int[] r3 = f17793C
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo21193a(r2)
            goto L_0x02bd
        L_0x010b:
            r11 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r11 != r12) goto L_0x0117
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L_0x0117
            r12 = 1
            goto L_0x0118
        L_0x0117:
            r12 = 0
        L_0x0118:
            if (r12 == 0) goto L_0x0138
            jb.a$a r1 = r13.f17805m
            r1.mo21194b()
            jb.a$a r1 = r13.f17805m
            r2 = r7 & 1
            if (r2 != 0) goto L_0x012c
            r2 = r8 & 31
            int[] r3 = f17794D
            r2 = r3[r2]
            goto L_0x0132
        L_0x012c:
            r2 = r8 & 31
            int[] r3 = f17795E
            r2 = r3[r2]
        L_0x0132:
            char r2 = (char) r2
            r1.mo21193a(r2)
            goto L_0x02bd
        L_0x0138:
            if (r1 != r2) goto L_0x0140
            r2 = r8 & 240(0xf0, float:3.36E-43)
            if (r2 != r9) goto L_0x0140
            r2 = 1
            goto L_0x0141
        L_0x0140:
            r2 = 0
        L_0x0141:
            if (r2 == 0) goto L_0x0167
            jb.a$a r1 = r13.f17805m
            r1.mo21193a(r9)
            r1 = r8 & 1
            if (r1 != r0) goto L_0x014e
            r1 = 1
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            int r2 = r8 >> 1
            r2 = r2 & 7
            jb.a$a r3 = r13.f17805m
            java.util.ArrayList r4 = r3.f17817a
            jb.a$a$a r5 = new jb.a$a$a
            java.lang.StringBuilder r3 = r3.f17819c
            int r3 = r3.length()
            r5.<init>(r2, r1, r3)
            r4.add(r5)
            goto L_0x02bd
        L_0x0167:
            r2 = r7 & 240(0xf0, float:3.36E-43)
            if (r2 != r4) goto L_0x0173
            r2 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r2 != r12) goto L_0x0173
            r2 = 1
            goto L_0x0174
        L_0x0173:
            r2 = 0
        L_0x0174:
            if (r2 == 0) goto L_0x01e1
            int[] r1 = f17797y
            r2 = r7 & 7
            r1 = r1[r2]
            r2 = r8 & 32
            if (r2 == 0) goto L_0x0182
            r2 = 1
            goto L_0x0183
        L_0x0182:
            r2 = 0
        L_0x0183:
            if (r2 == 0) goto L_0x0187
            int r1 = r1 + 1
        L_0x0187:
            jb.a$a r2 = r13.f17805m
            int r3 = r2.f17820d
            if (r1 == r3) goto L_0x01ab
            int r3 = r13.f17808p
            if (r3 == r0) goto L_0x01a7
            boolean r2 = r2.mo21197e()
            if (r2 != 0) goto L_0x01a7
            jb.a$a r2 = new jb.a$a
            int r3 = r13.f17808p
            int r5 = r13.f17809q
            r2.<init>(r3, r5)
            r13.f17805m = r2
            java.util.ArrayList<jb.a$a> r3 = r13.f17804l
            r3.add(r2)
        L_0x01a7:
            jb.a$a r2 = r13.f17805m
            r2.f17820d = r1
        L_0x01ab:
            r1 = r8 & 16
            if (r1 != r4) goto L_0x01b1
            r1 = 1
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            r2 = r8 & 1
            if (r2 != r0) goto L_0x01b8
            r2 = 1
            goto L_0x01b9
        L_0x01b8:
            r2 = 0
        L_0x01b9:
            int r3 = r8 >> 1
            r3 = r3 & 7
            jb.a$a r4 = r13.f17805m
            if (r1 == 0) goto L_0x01c4
            r5 = 8
            goto L_0x01c5
        L_0x01c4:
            r5 = r3
        L_0x01c5:
            java.util.ArrayList r6 = r4.f17817a
            jb.a$a$a r7 = new jb.a$a$a
            java.lang.StringBuilder r4 = r4.f17819c
            int r4 = r4.length()
            r7.<init>(r5, r2, r4)
            r6.add(r7)
            if (r1 == 0) goto L_0x02bd
            jb.a$a r1 = r13.f17805m
            int[] r2 = f17798z
            r2 = r2[r3]
            r1.f17821e = r2
            goto L_0x02bd
        L_0x01e1:
            r2 = 23
            r4 = 33
            if (r1 != r2) goto L_0x01ef
            if (r8 < r4) goto L_0x01ef
            r1 = 35
            if (r8 > r1) goto L_0x01ef
            r1 = 1
            goto L_0x01f0
        L_0x01ef:
            r1 = 0
        L_0x01f0:
            if (r1 == 0) goto L_0x01fa
            jb.a$a r1 = r13.f17805m
            int r8 = r8 + -32
            r1.f17822f = r8
            goto L_0x02bd
        L_0x01fa:
            if (r11 != r6) goto L_0x0202
            r1 = r8 & 240(0xf0, float:3.36E-43)
            if (r1 != r9) goto L_0x0202
            r1 = 1
            goto L_0x0203
        L_0x0202:
            r1 = 0
        L_0x0203:
            if (r1 == 0) goto L_0x02bd
            if (r8 == r9) goto L_0x029b
            r1 = 41
            if (r8 == r1) goto L_0x0297
            switch(r8) {
                case 37: goto L_0x022a;
                case 38: goto L_0x021f;
                case 39: goto L_0x0214;
                default: goto L_0x020e;
            }
        L_0x020e:
            int r1 = r13.f17808p
            if (r1 != 0) goto L_0x0235
            goto L_0x02bd
        L_0x0214:
            r13.mo21192k(r0)
            r13.f17809q = r10
            jb.a$a r1 = r13.f17805m
            r1.f17824h = r10
            goto L_0x02bd
        L_0x021f:
            r13.mo21192k(r0)
            r13.f17809q = r5
            jb.a$a r1 = r13.f17805m
            r1.f17824h = r5
            goto L_0x02bd
        L_0x022a:
            r13.mo21192k(r0)
            r13.f17809q = r3
            jb.a$a r1 = r13.f17805m
            r1.f17824h = r3
            goto L_0x02bd
        L_0x0235:
            if (r8 == r4) goto L_0x0291
            switch(r8) {
                case 44: goto L_0x0281;
                case 45: goto L_0x024c;
                case 46: goto L_0x0247;
                case 47: goto L_0x023c;
                default: goto L_0x023a;
            }
        L_0x023a:
            goto L_0x02bd
        L_0x023c:
            java.util.List r1 = r13.mo21190i()
            r13.f17806n = r1
            r13.mo21191j()
            goto L_0x02bd
        L_0x0247:
            r13.mo21191j()
            goto L_0x02bd
        L_0x024c:
            if (r1 != r0) goto L_0x02bd
            jb.a$a r1 = r13.f17805m
            boolean r1 = r1.mo21197e()
            if (r1 != 0) goto L_0x02bd
            jb.a$a r1 = r13.f17805m
            java.util.ArrayList r2 = r1.f17818b
            android.text.SpannableString r3 = r1.mo21196d()
            r2.add(r3)
            java.lang.StringBuilder r2 = r1.f17819c
            r2.setLength(r14)
            java.util.ArrayList r2 = r1.f17817a
            r2.clear()
            int r2 = r1.f17824h
            int r3 = r1.f17820d
            int r2 = java.lang.Math.min(r2, r3)
        L_0x0273:
            java.util.ArrayList r3 = r1.f17818b
            int r3 = r3.size()
            if (r3 < r2) goto L_0x02bd
            java.util.ArrayList r3 = r1.f17818b
            r3.remove(r14)
            goto L_0x0273
        L_0x0281:
            java.util.List r1 = java.util.Collections.emptyList()
            r13.f17806n = r1
            int r1 = r13.f17808p
            if (r1 == r0) goto L_0x028d
            if (r1 != r5) goto L_0x02bd
        L_0x028d:
            r13.mo21191j()
            goto L_0x02bd
        L_0x0291:
            jb.a$a r1 = r13.f17805m
            r1.mo21194b()
            goto L_0x02bd
        L_0x0297:
            r13.mo21192k(r5)
            goto L_0x02bd
        L_0x029b:
            r13.mo21192k(r3)
            goto L_0x02bd
        L_0x029f:
            jb.a$a r1 = r13.f17805m
            r2 = r7 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + -32
            int[] r3 = f17792B
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo21193a(r2)
            r1 = r8 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x02bd
            jb.a$a r1 = r13.f17805m
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + -32
            r2 = r3[r2]
            char r2 = (char) r2
            r1.mo21193a(r2)
        L_0x02bd:
            r1 = 1
            goto L_0x0015
        L_0x02c0:
            if (r1 == 0) goto L_0x02d2
            int r14 = r13.f17808p
            if (r14 == r0) goto L_0x02c8
            if (r14 != r5) goto L_0x02d2
        L_0x02c8:
            java.util.List r14 = r13.mo21190i()
            r13.f17806n = r14
            long r0 = r13.f17880e
            r13.f17816x = r0
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p138jb.C5419a.mo21187f(jb.c$a):void");
    }

    public final void flush() {
        super.flush();
        this.f17806n = null;
        this.f17807o = null;
        mo21192k(0);
        this.f17809q = 4;
        this.f17805m.f17824h = 4;
        mo21191j();
        this.f17810r = false;
        this.f17811s = false;
        this.f17812t = 0;
        this.f17813u = 0;
        this.f17814v = 0;
        this.f17815w = true;
        this.f17816x = -9223372036854775807L;
    }

    /* renamed from: g */
    public final C5341h mo21177c() throws SubtitleDecoderException {
        C5341h pollFirst;
        C5341h g = super.mo21177c();
        if (g != null) {
            return g;
        }
        long j = this.f17803k;
        boolean z = false;
        if (j != -9223372036854775807L) {
            long j2 = this.f17816x;
            if (j2 != -9223372036854775807L && this.f17880e - j2 >= j) {
                z = true;
            }
        }
        if (!z || (pollFirst = this.f17877b.pollFirst()) == null) {
            return null;
        }
        this.f17806n = Collections.emptyList();
        this.f17816x = -9223372036854775807L;
        C5341h hVar = pollFirst;
        hVar.mo21125i(this.f17880e, mo21186e(), Long.MAX_VALUE);
        return pollFirst;
    }

    /* renamed from: h */
    public final boolean mo21189h() {
        return this.f17806n != this.f17807o;
    }

    /* renamed from: i */
    public final List<C5332a> mo21190i() {
        int size = this.f17804l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C5332a c = this.f17804l.get(i2).mo21195c(Integer.MIN_VALUE);
            arrayList.add(c);
            if (c != null) {
                i = Math.min(i, c.f17597i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C5332a aVar = (C5332a) arrayList.get(i3);
            if (aVar != null) {
                if (aVar.f17597i != i) {
                    aVar = this.f17804l.get(i3).mo21195c(i);
                    aVar.getClass();
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: j */
    public final void mo21191j() {
        C5420a aVar = this.f17805m;
        aVar.f17823g = this.f17808p;
        aVar.f17817a.clear();
        aVar.f17818b.clear();
        aVar.f17819c.setLength(0);
        aVar.f17820d = 15;
        aVar.f17821e = 0;
        aVar.f17822f = 0;
        this.f17804l.clear();
        this.f17804l.add(this.f17805m);
    }

    /* renamed from: k */
    public final void mo21192k(int i) {
        int i2 = this.f17808p;
        if (i2 != i) {
            this.f17808p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f17804l.size(); i3++) {
                    this.f17804l.get(i3).f17823g = i;
                }
                return;
            }
            mo21191j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f17806n = Collections.emptyList();
            }
        }
    }

    public final void release() {
    }
}
