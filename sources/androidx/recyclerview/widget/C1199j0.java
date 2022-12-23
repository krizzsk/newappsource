package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.j0 */
public final class C1199j0 {

    /* renamed from: a */
    public final C1201b f4522a;

    /* renamed from: b */
    public C1200a f4523b = new C1200a();

    /* renamed from: androidx.recyclerview.widget.j0$a */
    public static class C1200a {

        /* renamed from: a */
        public int f4524a = 0;

        /* renamed from: b */
        public int f4525b;

        /* renamed from: c */
        public int f4526c;

        /* renamed from: d */
        public int f4527d;

        /* renamed from: e */
        public int f4528e;

        /* renamed from: a */
        public final boolean mo5084a() {
            int i;
            int i2;
            int i3;
            int i4 = this.f4524a;
            int i5 = 2;
            if ((i4 & 7) != 0) {
                int i6 = this.f4527d;
                int i7 = this.f4525b;
                if (i6 > i7) {
                    i3 = 1;
                } else if (i6 == i7) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
                if (((i3 << 0) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 112) != 0) {
                int i8 = this.f4527d;
                int i9 = this.f4526c;
                if (i8 > i9) {
                    i2 = 1;
                } else if (i8 == i9) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                if (((i2 << 4) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 1792) != 0) {
                int i11 = this.f4528e;
                int i12 = this.f4525b;
                if (i11 > i12) {
                    i = 1;
                } else if (i11 == i12) {
                    i = 2;
                } else {
                    i = 4;
                }
                if (((i << 8) & i4) == 0) {
                    return false;
                }
            }
            if ((i4 & 28672) != 0) {
                int i13 = this.f4528e;
                int i14 = this.f4526c;
                if (i13 > i14) {
                    i5 = 1;
                } else if (i13 != i14) {
                    i5 = 4;
                }
                if ((i4 & (i5 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j0$b */
    public interface C1201b {
        /* renamed from: a */
        int mo4903a(View view);

        /* renamed from: b */
        int mo4904b();

        /* renamed from: c */
        int mo4905c();

        /* renamed from: d */
        View mo4906d(int i);

        /* renamed from: e */
        int mo4907e(View view);
    }

    public C1199j0(C1201b bVar) {
        this.f4522a = bVar;
    }

    /* renamed from: a */
    public final View mo5082a(int i, int i2, int i3, int i4) {
        int i5;
        int b = this.f4522a.mo4904b();
        int c = this.f4522a.mo4905c();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View d = this.f4522a.mo4906d(i);
            int a = this.f4522a.mo4903a(d);
            int e = this.f4522a.mo4907e(d);
            C1200a aVar = this.f4523b;
            aVar.f4525b = b;
            aVar.f4526c = c;
            aVar.f4527d = a;
            aVar.f4528e = e;
            if (i3 != 0) {
                aVar.f4524a = i3 | 0;
                if (aVar.mo5084a()) {
                    return d;
                }
            }
            if (i4 != 0) {
                C1200a aVar2 = this.f4523b;
                aVar2.f4524a = i4 | 0;
                if (aVar2.mo5084a()) {
                    view = d;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public final boolean mo5083b(View view) {
        C1200a aVar = this.f4523b;
        int b = this.f4522a.mo4904b();
        int c = this.f4522a.mo4905c();
        int a = this.f4522a.mo4903a(view);
        int e = this.f4522a.mo4907e(view);
        aVar.f4525b = b;
        aVar.f4526c = c;
        aVar.f4527d = a;
        aVar.f4528e = e;
        C1200a aVar2 = this.f4523b;
        aVar2.f4524a = 24579 | 0;
        return aVar2.mo5084a();
    }
}
