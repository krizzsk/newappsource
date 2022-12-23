package p138jb;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p126ib.C5332a;
import p138jb.C5426c;
import p274u8.C6725b;
import p277ub.C6802q;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: jb.b */
public final class C5422b extends C5426c {

    /* renamed from: g */
    public final C6803r f17828g = new C6803r();

    /* renamed from: h */
    public final C6802q f17829h = new C6802q();

    /* renamed from: i */
    public int f17830i = -1;

    /* renamed from: j */
    public final int f17831j;

    /* renamed from: k */
    public final C5424b[] f17832k;

    /* renamed from: l */
    public C5424b f17833l;

    /* renamed from: m */
    public List<C5332a> f17834m;

    /* renamed from: n */
    public List<C5332a> f17835n;

    /* renamed from: o */
    public C5425c f17836o;

    /* renamed from: p */
    public int f17837p;

    /* renamed from: jb.b$a */
    public static final class C5423a {

        /* renamed from: c */
        public static final C6725b f17838c = new C6725b(1);

        /* renamed from: a */
        public final C5332a f17839a;

        /* renamed from: b */
        public final int f17840b;

        public C5423a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            C5332a.C5333a aVar = new C5332a.C5333a();
            aVar.f17606a = spannableStringBuilder;
            aVar.f17608c = alignment;
            aVar.f17610e = f;
            aVar.f17611f = 0;
            aVar.f17612g = i;
            aVar.f17613h = f2;
            aVar.f17614i = i2;
            aVar.f17617l = -3.4028235E38f;
            if (z) {
                aVar.f17620o = i3;
                aVar.f17619n = true;
            }
            this.f17839a = aVar.mo21116a();
            this.f17840b = i4;
        }
    }

    /* renamed from: jb.b$b */
    public static final class C5424b {

        /* renamed from: A */
        public static final int[] f17841A = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: B */
        public static final boolean[] f17842B = {false, false, false, true, true, true, false};

        /* renamed from: C */
        public static final int[] f17843C;

        /* renamed from: D */
        public static final int[] f17844D = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: E */
        public static final int[] f17845E = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: F */
        public static final int[] f17846F;

        /* renamed from: w */
        public static final int f17847w = m13547c(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f17848x;

        /* renamed from: y */
        public static final int[] f17849y = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: z */
        public static final int[] f17850z = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: a */
        public final ArrayList f17851a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f17852b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f17853c;

        /* renamed from: d */
        public boolean f17854d;

        /* renamed from: e */
        public int f17855e;

        /* renamed from: f */
        public boolean f17856f;

        /* renamed from: g */
        public int f17857g;

        /* renamed from: h */
        public int f17858h;

        /* renamed from: i */
        public int f17859i;

        /* renamed from: j */
        public int f17860j;

        /* renamed from: k */
        public boolean f17861k;

        /* renamed from: l */
        public int f17862l;

        /* renamed from: m */
        public int f17863m;

        /* renamed from: n */
        public int f17864n;

        /* renamed from: o */
        public int f17865o;

        /* renamed from: p */
        public int f17866p;

        /* renamed from: q */
        public int f17867q;

        /* renamed from: r */
        public int f17868r;

        /* renamed from: s */
        public int f17869s;

        /* renamed from: t */
        public int f17870t;

        /* renamed from: u */
        public int f17871u;

        /* renamed from: v */
        public int f17872v;

        static {
            int c = m13547c(0, 0, 0, 0);
            f17848x = c;
            int c2 = m13547c(0, 0, 0, 3);
            f17843C = new int[]{c, c2, c, c, c2, c, c};
            f17846F = new int[]{c, c, c, c, c, c2, c2};
        }

        public C5424b() {
            mo21203d();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m13547c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                p583jk.C17875h.m44303n(r4, r0)
                p583jk.C17875h.m44303n(r5, r0)
                p583jk.C17875h.m44303n(r6, r0)
                p583jk.C17875h.m44303n(r7, r0)
                r0 = 255(0xff, float:3.57E-43)
                r1 = 0
                r2 = 1
                if (r7 == 0) goto L_0x0021
                if (r7 == r2) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r2) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r2) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r2) goto L_0x0032
                goto L_0x0033
            L_0x0032:
                r0 = 0
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p138jb.C5422b.C5424b.m13547c(int, int, int, int):int");
        }

        /* renamed from: a */
        public final void mo21201a(char c) {
            if (c == 10) {
                this.f17851a.add(mo21202b());
                this.f17852b.clear();
                if (this.f17866p != -1) {
                    this.f17866p = 0;
                }
                if (this.f17867q != -1) {
                    this.f17867q = 0;
                }
                if (this.f17868r != -1) {
                    this.f17868r = 0;
                }
                if (this.f17870t != -1) {
                    this.f17870t = 0;
                }
                while (true) {
                    if ((this.f17861k && this.f17851a.size() >= this.f17860j) || this.f17851a.size() >= 15) {
                        this.f17851a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f17852b.append(c);
            }
        }

        /* renamed from: b */
        public final SpannableString mo21202b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17852b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f17866p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f17866p, length, 33);
                }
                if (this.f17867q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f17867q, length, 33);
                }
                if (this.f17868r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f17869s), this.f17868r, length, 33);
                }
                if (this.f17870t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f17871u), this.f17870t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public final void mo21203d() {
            this.f17851a.clear();
            this.f17852b.clear();
            this.f17866p = -1;
            this.f17867q = -1;
            this.f17868r = -1;
            this.f17870t = -1;
            this.f17872v = 0;
            this.f17853c = false;
            this.f17854d = false;
            this.f17855e = 4;
            this.f17856f = false;
            this.f17857g = 0;
            this.f17858h = 0;
            this.f17859i = 0;
            this.f17860j = 15;
            this.f17861k = true;
            this.f17862l = 0;
            this.f17863m = 0;
            this.f17864n = 0;
            int i = f17848x;
            this.f17865o = i;
            this.f17869s = f17847w;
            this.f17871u = i;
        }

        /* renamed from: e */
        public final void mo21204e(boolean z, boolean z2) {
            if (this.f17866p != -1) {
                if (!z) {
                    this.f17852b.setSpan(new StyleSpan(2), this.f17866p, this.f17852b.length(), 33);
                    this.f17866p = -1;
                }
            } else if (z) {
                this.f17866p = this.f17852b.length();
            }
            if (this.f17867q != -1) {
                if (!z2) {
                    this.f17852b.setSpan(new UnderlineSpan(), this.f17867q, this.f17852b.length(), 33);
                    this.f17867q = -1;
                }
            } else if (z2) {
                this.f17867q = this.f17852b.length();
            }
        }

        /* renamed from: f */
        public final void mo21205f(int i, int i2) {
            if (!(this.f17868r == -1 || this.f17869s == i)) {
                this.f17852b.setSpan(new ForegroundColorSpan(this.f17869s), this.f17868r, this.f17852b.length(), 33);
            }
            if (i != f17847w) {
                this.f17868r = this.f17852b.length();
                this.f17869s = i;
            }
            if (!(this.f17870t == -1 || this.f17871u == i2)) {
                this.f17852b.setSpan(new BackgroundColorSpan(this.f17871u), this.f17870t, this.f17852b.length(), 33);
            }
            if (i2 != f17848x) {
                this.f17870t = this.f17852b.length();
                this.f17871u = i2;
            }
        }
    }

    /* renamed from: jb.b$c */
    public static final class C5425c {

        /* renamed from: a */
        public final int f17873a;

        /* renamed from: b */
        public final byte[] f17874b;

        /* renamed from: c */
        public int f17875c = 0;

        public C5425c(int i, int i2) {
            this.f17873a = i2;
            this.f17874b = new byte[((i2 * 2) - 1)];
        }
    }

    public C5422b(int i, List<byte[]> list) {
        this.f17831j = i == -1 ? 1 : i;
        if (!(list == null || (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1))) {
        }
        this.f17832k = new C5424b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f17832k[i2] = new C5424b();
        }
        this.f17833l = this.f17832k[0];
    }

    /* renamed from: e */
    public final C5429d mo21186e() {
        List<C5332a> list = this.f17834m;
        this.f17835n = list;
        list.getClass();
        return new C5429d(list);
    }

    /* renamed from: f */
    public final void mo21187f(C5426c.C5427a aVar) {
        boolean z;
        ByteBuffer byteBuffer = aVar.f13647d;
        byteBuffer.getClass();
        this.f17828g.mo23005x(byteBuffer.limit(), byteBuffer.array());
        while (true) {
            C6803r rVar = this.f17828g;
            if (rVar.f21040c - rVar.f21039b >= 3) {
                int p = rVar.mo22997p() & 7;
                int i = p & 3;
                boolean z2 = false;
                if ((p & 4) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                byte p2 = (byte) this.f17828g.mo22997p();
                byte p3 = (byte) this.f17828g.mo22997p();
                if ((i == 2 || i == 3) && z) {
                    if (i == 3) {
                        mo21198i();
                        int i2 = (p2 & 192) >> 6;
                        int i3 = this.f17830i;
                        if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                            mo21200k();
                        }
                        this.f17830i = i2;
                        byte b = p2 & 63;
                        if (b == 0) {
                            b = 64;
                        }
                        C5425c cVar = new C5425c(i2, b);
                        this.f17836o = cVar;
                        byte[] bArr = cVar.f17874b;
                        int i4 = cVar.f17875c;
                        cVar.f17875c = i4 + 1;
                        bArr[i4] = p3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        C17875h.m44301k(z2);
                        C5425c cVar2 = this.f17836o;
                        if (cVar2 != null) {
                            byte[] bArr2 = cVar2.f17874b;
                            int i5 = cVar2.f17875c;
                            int i6 = i5 + 1;
                            bArr2[i5] = p2;
                            cVar2.f17875c = i6 + 1;
                            bArr2[i6] = p3;
                        }
                    }
                    C5425c cVar3 = this.f17836o;
                    if (cVar3.f17875c == (cVar3.f17873a * 2) - 1) {
                        mo21198i();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void flush() {
        super.flush();
        this.f17834m = null;
        this.f17835n = null;
        this.f17837p = 0;
        this.f17833l = this.f17832k[0];
        mo21200k();
        this.f17836o = null;
    }

    /* renamed from: h */
    public final boolean mo21189h() {
        return this.f17834m != this.f17835n;
    }

    /* renamed from: i */
    public final void mo21198i() {
        C5425c cVar = this.f17836o;
        if (cVar != null) {
            this.f17829h.mo22976i(cVar.f17875c, cVar.f17874b);
            int f = this.f17829h.mo22973f(3);
            int f2 = this.f17829h.mo22973f(5);
            int i = 7;
            int i2 = 6;
            if (f == 7) {
                this.f17829h.mo22979l(2);
                f = this.f17829h.mo22973f(6);
            }
            if (f2 != 0 && f == this.f17831j) {
                boolean z = false;
                while (this.f17829h.mo22969b() > 0) {
                    int f3 = this.f17829h.mo22973f(8);
                    if (f3 == 16) {
                        int f4 = this.f17829h.mo22973f(8);
                        if (f4 <= 31) {
                            if (f4 > 7) {
                                if (f4 <= 15) {
                                    this.f17829h.mo22979l(8);
                                } else if (f4 <= 23) {
                                    this.f17829h.mo22979l(16);
                                } else if (f4 <= 31) {
                                    this.f17829h.mo22979l(24);
                                }
                            }
                        } else if (f4 <= 127) {
                            if (f4 == 32) {
                                this.f17833l.mo21201a(' ');
                            } else if (f4 == 33) {
                                this.f17833l.mo21201a(160);
                            } else if (f4 == 37) {
                                this.f17833l.mo21201a(8230);
                            } else if (f4 == 42) {
                                this.f17833l.mo21201a(352);
                            } else if (f4 == 44) {
                                this.f17833l.mo21201a(338);
                            } else if (f4 == 63) {
                                this.f17833l.mo21201a(376);
                            } else if (f4 == 57) {
                                this.f17833l.mo21201a(8482);
                            } else if (f4 == 58) {
                                this.f17833l.mo21201a(353);
                            } else if (f4 == 60) {
                                this.f17833l.mo21201a(339);
                            } else if (f4 != 61) {
                                switch (f4) {
                                    case 48:
                                        this.f17833l.mo21201a(9608);
                                        break;
                                    case 49:
                                        this.f17833l.mo21201a(8216);
                                        break;
                                    case 50:
                                        this.f17833l.mo21201a(8217);
                                        break;
                                    case 51:
                                        this.f17833l.mo21201a(8220);
                                        break;
                                    case 52:
                                        this.f17833l.mo21201a(8221);
                                        break;
                                    case 53:
                                        this.f17833l.mo21201a(8226);
                                        break;
                                    default:
                                        switch (f4) {
                                            case 118:
                                                this.f17833l.mo21201a(8539);
                                                break;
                                            case 119:
                                                this.f17833l.mo21201a(8540);
                                                break;
                                            case 120:
                                                this.f17833l.mo21201a(8541);
                                                break;
                                            case 121:
                                                this.f17833l.mo21201a(8542);
                                                break;
                                            case 122:
                                                this.f17833l.mo21201a(9474);
                                                break;
                                            case 123:
                                                this.f17833l.mo21201a(9488);
                                                break;
                                            case 124:
                                                this.f17833l.mo21201a(9492);
                                                break;
                                            case 125:
                                                this.f17833l.mo21201a(9472);
                                                break;
                                            case 126:
                                                this.f17833l.mo21201a(9496);
                                                break;
                                            case 127:
                                                this.f17833l.mo21201a(9484);
                                                break;
                                        }
                                }
                            } else {
                                this.f17833l.mo21201a(8480);
                            }
                            z = true;
                        } else {
                            if (f4 <= 159) {
                                if (f4 <= 135) {
                                    this.f17829h.mo22979l(32);
                                } else if (f4 <= 143) {
                                    this.f17829h.mo22979l(40);
                                } else if (f4 <= 159) {
                                    this.f17829h.mo22979l(2);
                                    this.f17829h.mo22979l(this.f17829h.mo22973f(6) * 8);
                                }
                            } else if (f4 <= 255) {
                                if (f4 == 160) {
                                    this.f17833l.mo21201a(13252);
                                } else {
                                    this.f17833l.mo21201a('_');
                                }
                                z = true;
                            }
                            i = 7;
                            i2 = 6;
                        }
                    } else if (f3 <= 31) {
                        if (f3 != 0) {
                            if (f3 == 3) {
                                this.f17834m = mo21199j();
                            } else if (f3 != 8) {
                                switch (f3) {
                                    case 12:
                                        mo21200k();
                                        break;
                                    case 13:
                                        this.f17833l.mo21201a(10);
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (f3 < 17 || f3 > 23) {
                                            if (f3 >= 24 && f3 <= 31) {
                                                this.f17829h.mo22979l(16);
                                                break;
                                            }
                                        } else {
                                            this.f17829h.mo22979l(8);
                                            break;
                                        }
                                }
                            } else {
                                C5424b bVar = this.f17833l;
                                int length = bVar.f17852b.length();
                                if (length > 0) {
                                    bVar.f17852b.delete(length - 1, length);
                                }
                            }
                        }
                    } else if (f3 <= 127) {
                        if (f3 == 127) {
                            this.f17833l.mo21201a(9835);
                        } else {
                            this.f17833l.mo21201a((char) (f3 & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
                        }
                        z = true;
                    } else {
                        if (f3 <= 159) {
                            switch (f3) {
                                case RecyclerView.C1119a0.FLAG_IGNORE:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    int i3 = f3 - 128;
                                    if (this.f17837p != i3) {
                                        this.f17837p = i3;
                                        this.f17833l = this.f17832k[i3];
                                        break;
                                    }
                                    break;
                                case 136:
                                    for (int i4 = 1; i4 <= 8; i4++) {
                                        if (this.f17829h.mo22972e()) {
                                            C5424b bVar2 = this.f17832k[8 - i4];
                                            bVar2.f17851a.clear();
                                            bVar2.f17852b.clear();
                                            bVar2.f17866p = -1;
                                            bVar2.f17867q = -1;
                                            bVar2.f17868r = -1;
                                            bVar2.f17870t = -1;
                                            bVar2.f17872v = 0;
                                        }
                                    }
                                    break;
                                case 137:
                                    for (int i5 = 1; i5 <= 8; i5++) {
                                        if (this.f17829h.mo22972e()) {
                                            this.f17832k[8 - i5].f17854d = true;
                                        }
                                    }
                                    break;
                                case 138:
                                    for (int i6 = 1; i6 <= 8; i6++) {
                                        if (this.f17829h.mo22972e()) {
                                            this.f17832k[8 - i6].f17854d = false;
                                        }
                                    }
                                    break;
                                case 139:
                                    for (int i7 = 1; i7 <= 8; i7++) {
                                        if (this.f17829h.mo22972e()) {
                                            C5424b bVar3 = this.f17832k[8 - i7];
                                            bVar3.f17854d = !bVar3.f17854d;
                                        }
                                    }
                                    break;
                                case 140:
                                    for (int i8 = 1; i8 <= 8; i8++) {
                                        if (this.f17829h.mo22972e()) {
                                            this.f17832k[8 - i8].mo21203d();
                                        }
                                    }
                                    break;
                                case 141:
                                    this.f17829h.mo22979l(8);
                                    break;
                                case 143:
                                    mo21200k();
                                    break;
                                case 144:
                                    if (this.f17833l.f17853c) {
                                        this.f17829h.mo22973f(4);
                                        this.f17829h.mo22973f(2);
                                        this.f17829h.mo22973f(2);
                                        boolean e = this.f17829h.mo22972e();
                                        boolean e2 = this.f17829h.mo22972e();
                                        this.f17829h.mo22973f(3);
                                        this.f17829h.mo22973f(3);
                                        this.f17833l.mo21204e(e, e2);
                                        break;
                                    } else {
                                        this.f17829h.mo22979l(16);
                                        break;
                                    }
                                case 145:
                                    if (this.f17833l.f17853c) {
                                        int c = C5424b.m13547c(this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2));
                                        int c2 = C5424b.m13547c(this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2));
                                        this.f17829h.mo22979l(2);
                                        C5424b.m13547c(this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), 0);
                                        this.f17833l.mo21205f(c, c2);
                                        break;
                                    } else {
                                        this.f17829h.mo22979l(24);
                                        break;
                                    }
                                case 146:
                                    if (this.f17833l.f17853c) {
                                        this.f17829h.mo22979l(4);
                                        int f5 = this.f17829h.mo22973f(4);
                                        this.f17829h.mo22979l(2);
                                        this.f17829h.mo22973f(6);
                                        C5424b bVar4 = this.f17833l;
                                        if (bVar4.f17872v != f5) {
                                            bVar4.mo21201a(10);
                                        }
                                        bVar4.f17872v = f5;
                                        break;
                                    } else {
                                        this.f17829h.mo22979l(16);
                                        break;
                                    }
                                case 151:
                                    if (this.f17833l.f17853c) {
                                        int c3 = C5424b.m13547c(this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2));
                                        this.f17829h.mo22973f(2);
                                        C5424b.m13547c(this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), this.f17829h.mo22973f(2), 0);
                                        this.f17829h.mo22972e();
                                        this.f17829h.mo22972e();
                                        this.f17829h.mo22973f(2);
                                        this.f17829h.mo22973f(2);
                                        int f6 = this.f17829h.mo22973f(2);
                                        this.f17829h.mo22979l(8);
                                        C5424b bVar5 = this.f17833l;
                                        bVar5.f17865o = c3;
                                        bVar5.f17862l = f6;
                                        break;
                                    } else {
                                        this.f17829h.mo22979l(32);
                                        break;
                                    }
                                case 152:
                                case 153:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                    int i9 = f3 - 152;
                                    C5424b bVar6 = this.f17832k[i9];
                                    this.f17829h.mo22979l(2);
                                    boolean e3 = this.f17829h.mo22972e();
                                    boolean e4 = this.f17829h.mo22972e();
                                    this.f17829h.mo22972e();
                                    int f7 = this.f17829h.mo22973f(3);
                                    boolean e5 = this.f17829h.mo22972e();
                                    int f8 = this.f17829h.mo22973f(i);
                                    int f9 = this.f17829h.mo22973f(8);
                                    int f11 = this.f17829h.mo22973f(4);
                                    int f12 = this.f17829h.mo22973f(4);
                                    this.f17829h.mo22979l(2);
                                    this.f17829h.mo22973f(i2);
                                    this.f17829h.mo22979l(2);
                                    int f13 = this.f17829h.mo22973f(3);
                                    int f14 = this.f17829h.mo22973f(3);
                                    bVar6.f17853c = true;
                                    bVar6.f17854d = e3;
                                    bVar6.f17861k = e4;
                                    bVar6.f17855e = f7;
                                    bVar6.f17856f = e5;
                                    bVar6.f17857g = f8;
                                    bVar6.f17858h = f9;
                                    bVar6.f17859i = f11;
                                    int i11 = f12 + 1;
                                    if (bVar6.f17860j != i11) {
                                        bVar6.f17860j = i11;
                                        while (true) {
                                            if ((e4 && bVar6.f17851a.size() >= bVar6.f17860j) || bVar6.f17851a.size() >= 15) {
                                                bVar6.f17851a.remove(0);
                                            }
                                        }
                                    }
                                    if (!(f13 == 0 || bVar6.f17863m == f13)) {
                                        bVar6.f17863m = f13;
                                        int i12 = f13 - 1;
                                        int i13 = C5424b.f17843C[i12];
                                        boolean z2 = C5424b.f17842B[i12];
                                        int i14 = C5424b.f17850z[i12];
                                        int i15 = C5424b.f17841A[i12];
                                        int i16 = C5424b.f17849y[i12];
                                        bVar6.f17865o = i13;
                                        bVar6.f17862l = i16;
                                    }
                                    if (!(f14 == 0 || bVar6.f17864n == f14)) {
                                        bVar6.f17864n = f14;
                                        int i17 = f14 - 1;
                                        int i18 = C5424b.f17845E[i17];
                                        int i19 = C5424b.f17844D[i17];
                                        bVar6.mo21204e(false, false);
                                        bVar6.mo21205f(C5424b.f17847w, C5424b.f17846F[i17]);
                                    }
                                    if (this.f17837p != i9) {
                                        this.f17837p = i9;
                                        this.f17833l = this.f17832k[i9];
                                        break;
                                    }
                                    break;
                            }
                        } else if (f3 <= 255) {
                            this.f17833l.mo21201a((char) (f3 & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
                        }
                        z = true;
                    }
                    i = 7;
                    i2 = 6;
                }
                if (z) {
                    this.f17834m = mo21199j();
                }
            }
            this.f17836o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p126ib.C5332a> mo21199j() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            r3 = 8
            if (r2 >= r3) goto L_0x0106
            jb.b$b[] r3 = r15.f17832k
            r3 = r3[r2]
            boolean r4 = r3.f17853c
            r5 = 1
            if (r4 == 0) goto L_0x0027
            java.util.ArrayList r4 = r3.f17851a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0025
            android.text.SpannableStringBuilder r3 = r3.f17852b
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            if (r3 != 0) goto L_0x0102
            jb.b$b[] r3 = r15.f17832k
            r3 = r3[r2]
            boolean r4 = r3.f17854d
            if (r4 == 0) goto L_0x0102
            boolean r4 = r3.f17853c
            if (r4 == 0) goto L_0x0049
            java.util.ArrayList r4 = r3.f17851a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0047
            android.text.SpannableStringBuilder r4 = r3.f17852b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r4 = 0
            goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            if (r4 == 0) goto L_0x004f
            r3 = 0
            goto L_0x00fd
        L_0x004f:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r4 = 0
        L_0x0055:
            java.util.ArrayList r7 = r3.f17851a
            int r7 = r7.size()
            if (r4 >= r7) goto L_0x0070
            java.util.ArrayList r7 = r3.f17851a
            java.lang.Object r7 = r7.get(r4)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.append(r7)
            r7 = 10
            r6.append(r7)
            int r4 = r4 + 1
            goto L_0x0055
        L_0x0070:
            android.text.SpannableString r4 = r3.mo21202b()
            r6.append(r4)
            int r4 = r3.f17862l
            r7 = 2
            if (r4 == 0) goto L_0x009a
            if (r4 == r5) goto L_0x0097
            if (r4 == r7) goto L_0x0094
            r7 = 3
            if (r4 != r7) goto L_0x0084
            goto L_0x009a
        L_0x0084:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.f17862l
            r2 = 43
            java.lang.String r3 = "Unexpected justification value: "
            java.lang.String r1 = p379.C13715c.m34241g(r2, r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x0094:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x009c
        L_0x0097:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x009c
        L_0x009a:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x009c:
            r7 = r4
            boolean r4 = r3.f17856f
            if (r4 == 0) goto L_0x00ac
            int r4 = r3.f17858h
            float r4 = (float) r4
            r8 = 1120272384(0x42c60000, float:99.0)
            float r4 = r4 / r8
            int r9 = r3.f17857g
            float r9 = (float) r9
            float r9 = r9 / r8
            goto L_0x00b9
        L_0x00ac:
            int r4 = r3.f17858h
            float r4 = (float) r4
            r8 = 1129381888(0x43510000, float:209.0)
            float r4 = r4 / r8
            int r8 = r3.f17857g
            float r8 = (float) r8
            r9 = 1116995584(0x42940000, float:74.0)
            float r9 = r8 / r9
        L_0x00b9:
            r8 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r8
            r10 = 1028443341(0x3d4ccccd, float:0.05)
            float r11 = r4 + r10
            float r9 = r9 * r8
            float r8 = r9 + r10
            int r4 = r3.f17859i
            int r9 = r4 / 3
            if (r9 != 0) goto L_0x00cf
            r9 = 0
            goto L_0x00d4
        L_0x00cf:
            if (r9 != r5) goto L_0x00d3
            r9 = 1
            goto L_0x00d4
        L_0x00d3:
            r9 = 2
        L_0x00d4:
            int r4 = r4 % 3
            if (r4 != 0) goto L_0x00db
            r4 = 0
            r10 = 0
            goto L_0x00e2
        L_0x00db:
            if (r4 != r5) goto L_0x00e0
            r4 = 1
            r10 = 1
            goto L_0x00e2
        L_0x00e0:
            r4 = 2
            r10 = 2
        L_0x00e2:
            int r12 = r3.f17865o
            int r4 = p138jb.C5422b.C5424b.f17848x
            if (r12 == r4) goto L_0x00eb
            r4 = 1
            r13 = 1
            goto L_0x00ed
        L_0x00eb:
            r4 = 0
            r13 = 0
        L_0x00ed:
            jb.b$a r14 = new jb.b$a
            int r3 = r3.f17855e
            r4 = r14
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r13
            r13 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = r14
        L_0x00fd:
            if (r3 == 0) goto L_0x0102
            r0.add(r3)
        L_0x0102:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0106:
            u8.b r2 = p138jb.C5422b.C5423a.f17838c
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
        L_0x0114:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x0128
            java.lang.Object r3 = r0.get(r1)
            jb.b$a r3 = (p138jb.C5422b.C5423a) r3
            ib.a r3 = r3.f17839a
            r2.add(r3)
            int r1 = r1 + 1
            goto L_0x0114
        L_0x0128:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p138jb.C5422b.mo21199j():java.util.List");
    }

    /* renamed from: k */
    public final void mo21200k() {
        for (int i = 0; i < 8; i++) {
            this.f17832k[i].mo21203d();
        }
    }
}
