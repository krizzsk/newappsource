package p289va;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.C0016g;
import p173ma.C5737j;
import p277ub.C6803r;
import p277ub.C6812y;

/* renamed from: va.d0 */
public interface C6896d0 {

    /* renamed from: va.d0$a */
    public static final class C6897a {

        /* renamed from: a */
        public final String f21318a;

        /* renamed from: b */
        public final byte[] f21319b;

        public C6897a(String str, byte[] bArr) {
            this.f21318a = str;
            this.f21319b = bArr;
        }
    }

    /* renamed from: va.d0$b */
    public static final class C6898b {

        /* renamed from: a */
        public final String f21320a;

        /* renamed from: b */
        public final List<C6897a> f21321b;

        /* renamed from: c */
        public final byte[] f21322c;

        public C6898b(int i, String str, ArrayList arrayList, byte[] bArr) {
            List<C6897a> list;
            this.f21320a = str;
            if (arrayList == null) {
                list = Collections.emptyList();
            } else {
                list = Collections.unmodifiableList(arrayList);
            }
            this.f21321b = list;
            this.f21322c = bArr;
        }
    }

    /* renamed from: va.d0$c */
    public interface C6899c {
        /* renamed from: a */
        C6896d0 mo23150a(int i, C6898b bVar);
    }

    /* renamed from: va.d0$d */
    public static final class C6900d {

        /* renamed from: a */
        public final String f21323a;

        /* renamed from: b */
        public final int f21324b;

        /* renamed from: c */
        public final int f21325c;

        /* renamed from: d */
        public int f21326d;

        /* renamed from: e */
        public String f21327e;

        public C6900d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        public final void mo23151a() {
            int i;
            int i2 = this.f21326d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f21324b;
            } else {
                i = i2 + this.f21325c;
            }
            this.f21326d = i;
            String str = this.f21323a;
            this.f21327e = C13715c.m34241g(C0016g.m25h(str, 11), str, i);
        }

        /* renamed from: b */
        public final void mo23152b() {
            if (this.f21326d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C6900d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i);
                sb.append("/");
                str = sb.toString();
            } else {
                str = "";
            }
            this.f21323a = str;
            this.f21324b = i2;
            this.f21325c = i3;
            this.f21326d = Integer.MIN_VALUE;
            this.f21327e = "";
        }
    }

    /* renamed from: a */
    void mo23147a(C6812y yVar, C5737j jVar, C6900d dVar);

    /* renamed from: b */
    void mo23148b(int i, C6803r rVar) throws ParserException;

    /* renamed from: c */
    void mo23149c();
}
