package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import mf0.C24361g;
import p003a2.C0046a;
import p003a2.C0047b;

/* renamed from: androidx.emoji2.text.n */
public final class C0857n {

    /* renamed from: a */
    public final C0047b f3540a;

    /* renamed from: b */
    public final char[] f3541b;

    /* renamed from: c */
    public final C0858a f3542c = new C0858a(1024);

    /* renamed from: d */
    public final Typeface f3543d;

    /* renamed from: androidx.emoji2.text.n$a */
    public static class C0858a {

        /* renamed from: a */
        public final SparseArray<C0858a> f3544a;

        /* renamed from: b */
        public C0848i f3545b;

        public C0858a() {
            this(1);
        }

        /* renamed from: a */
        public final void mo3641a(C0848i iVar, int i, int i2) {
            C0858a aVar;
            int a = iVar.mo3627a(i);
            SparseArray<C0858a> sparseArray = this.f3544a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a);
            }
            if (aVar == null) {
                aVar = new C0858a();
                this.f3544a.put(iVar.mo3627a(i), aVar);
            }
            if (i2 > i) {
                aVar.mo3641a(iVar, i + 1, i2);
            } else {
                aVar.f3545b = iVar;
            }
        }

        public C0858a(int i) {
            this.f3544a = new SparseArray<>(i);
        }
    }

    public C0857n(Typeface typeface, C0047b bVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        this.f3543d = typeface;
        this.f3540a = bVar;
        int a = bVar.mo24a(6);
        if (a != 0) {
            int i4 = a + bVar.f50a;
            i = bVar.f51b.getInt(bVar.f51b.getInt(i4) + i4);
        } else {
            i = 0;
        }
        this.f3541b = new char[(i * 2)];
        int a2 = bVar.mo24a(6);
        if (a2 != 0) {
            int i5 = a2 + bVar.f50a;
            i2 = bVar.f51b.getInt(bVar.f51b.getInt(i5) + i5);
        } else {
            i2 = 0;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C0848i iVar = new C0848i(this, i6);
            C0046a c = iVar.mo3629c();
            int a3 = c.mo24a(4);
            if (a3 != 0) {
                i3 = c.f51b.getInt(a3 + c.f50a);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, this.f3541b, i6 * 2);
            if (iVar.mo3628b() > 0) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61177o(z, "invalid metadata codepoint length");
            this.f3542c.mo3641a(iVar, 0, iVar.mo3628b() - 1);
        }
    }
}
