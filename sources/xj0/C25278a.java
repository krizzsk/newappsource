package xj0;

import java.lang.reflect.Array;
import je0.C23715f;
import p720pe.C18918b;

/* renamed from: xj0.a */
public abstract class C25278a {

    /* renamed from: a */
    public final int f63552a;

    /* renamed from: b */
    public final int[] f63553b = new int[4];

    /* renamed from: c */
    public final C18918b f63554c = new C18918b();

    /* renamed from: d */
    public final short[][] f63555d = ((short[][]) Array.newInstance(Short.TYPE, new int[]{12, 16}));

    /* renamed from: e */
    public final short[] f63556e = new short[12];

    /* renamed from: f */
    public final short[] f63557f = new short[12];

    /* renamed from: g */
    public final short[] f63558g = new short[12];

    /* renamed from: h */
    public final short[] f63559h = new short[12];

    /* renamed from: i */
    public final short[][] f63560i = ((short[][]) Array.newInstance(Short.TYPE, new int[]{12, 16}));

    /* renamed from: j */
    public final short[][] f63561j = ((short[][]) Array.newInstance(Short.TYPE, new int[]{4, 64}));

    /* renamed from: k */
    public final short[][] f63562k = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};

    /* renamed from: l */
    public final short[] f63563l = new short[16];

    /* renamed from: xj0.a$a */
    public abstract class C25279a {

        /* renamed from: a */
        public final short[] f63564a = new short[2];

        /* renamed from: b */
        public final short[][] f63565b = ((short[][]) Array.newInstance(Short.TYPE, new int[]{16, 8}));

        /* renamed from: c */
        public final short[][] f63566c = ((short[][]) Array.newInstance(Short.TYPE, new int[]{16, 8}));

        /* renamed from: d */
        public final short[] f63567d = new short[256];

        /* renamed from: a */
        public void mo61881a() {
            C23715f.m58229b(this.f63564a);
            int i = 0;
            while (true) {
                short[][] sArr = this.f63565b;
                if (i >= sArr.length) {
                    break;
                }
                C23715f.m58229b(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.f63565b.length; i2++) {
                C23715f.m58229b(this.f63566c[i2]);
            }
            C23715f.m58229b(this.f63567d);
        }
    }

    /* renamed from: xj0.a$b */
    public abstract class C25280b {

        /* renamed from: a */
        public final int f63568a;

        /* renamed from: b */
        public final int f63569b;

        /* renamed from: xj0.a$b$a */
        public abstract class C25281a {

            /* renamed from: a */
            public final short[] f63570a = new short[768];
        }

        public C25280b(int i, int i2) {
            this.f63568a = i;
            this.f63569b = (1 << i2) - 1;
        }
    }

    public C25278a(int i) {
        this.f63552a = (1 << i) - 1;
    }

    /* renamed from: a */
    public void mo61880a() {
        int[] iArr = this.f63553b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f63554c.f48158b = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f63555d;
            if (i2 >= sArr.length) {
                break;
            }
            C23715f.m58229b(sArr[i2]);
            i2++;
        }
        C23715f.m58229b(this.f63556e);
        C23715f.m58229b(this.f63557f);
        C23715f.m58229b(this.f63558g);
        C23715f.m58229b(this.f63559h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f63560i;
            if (i3 >= sArr2.length) {
                break;
            }
            C23715f.m58229b(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f63561j;
            if (i4 >= sArr3.length) {
                break;
            }
            C23715f.m58229b(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f63562k;
            if (i < sArr4.length) {
                C23715f.m58229b(sArr4[i]);
                i++;
            } else {
                C23715f.m58229b(this.f63563l);
                return;
            }
        }
    }
}
