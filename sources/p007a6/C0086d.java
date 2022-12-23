package p007a6;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: a6.d */
public final class C0086d {

    /* renamed from: a */
    public final byte[] f241a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f242b;

    /* renamed from: c */
    public C0085c f243c;

    /* renamed from: d */
    public int f244d = 0;

    /* renamed from: a */
    public final boolean mo189a() {
        return this.f243c.f231b != 0;
    }

    /* renamed from: b */
    public final C0085c mo190b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f242b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo189a()) {
            return this.f243c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) mo191c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f243c.f231b = 1;
            } else {
                this.f243c.f235f = mo194f();
                this.f243c.f236g = mo194f();
                int c = mo191c();
                C0085c cVar = this.f243c;
                if ((c & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cVar.f237h = z4;
                cVar.f238i = (int) Math.pow(2.0d, (double) ((c & 7) + 1));
                this.f243c.f239j = mo191c();
                C0085c cVar2 = this.f243c;
                mo191c();
                cVar2.getClass();
                if (this.f243c.f237h && !mo189a()) {
                    C0085c cVar3 = this.f243c;
                    cVar3.f230a = mo193e(cVar3.f238i);
                    C0085c cVar4 = this.f243c;
                    cVar4.f240k = cVar4.f230a[cVar4.f239j];
                }
            }
            if (!mo189a()) {
                boolean z5 = false;
                while (!z5 && !mo189a() && this.f243c.f232c <= Integer.MAX_VALUE) {
                    int c2 = mo191c();
                    if (c2 == 33) {
                        int c3 = mo191c();
                        if (c3 == 1) {
                            mo195g();
                        } else if (c3 == 249) {
                            this.f243c.f233d = new C0084b();
                            mo191c();
                            int c4 = mo191c();
                            C0084b bVar = this.f243c.f233d;
                            int i2 = (c4 & 28) >> 2;
                            bVar.f225g = i2;
                            if (i2 == 0) {
                                bVar.f225g = 1;
                            }
                            if ((c4 & 1) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bVar.f224f = z;
                            int f = mo194f();
                            if (f < 2) {
                                f = 10;
                            }
                            C0084b bVar2 = this.f243c.f233d;
                            bVar2.f227i = f * 10;
                            bVar2.f226h = mo191c();
                            mo191c();
                        } else if (c3 == 254) {
                            mo195g();
                        } else if (c3 != 255) {
                            mo195g();
                        } else {
                            mo192d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i3 = 0; i3 < 11; i3++) {
                                sb2.append((char) this.f241a[i3]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    mo192d();
                                    byte[] bArr = this.f241a;
                                    if (bArr[0] == 1) {
                                        byte b = bArr[1];
                                        byte b2 = bArr[2];
                                        this.f243c.getClass();
                                    }
                                    if (this.f244d <= 0) {
                                        break;
                                    }
                                } while (mo189a());
                            } else {
                                mo195g();
                            }
                        }
                    } else if (c2 == 44) {
                        C0085c cVar5 = this.f243c;
                        if (cVar5.f233d == null) {
                            cVar5.f233d = new C0084b();
                        }
                        this.f243c.f233d.f219a = mo194f();
                        this.f243c.f233d.f220b = mo194f();
                        this.f243c.f233d.f221c = mo194f();
                        this.f243c.f233d.f222d = mo194f();
                        int c5 = mo191c();
                        if ((c5 & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int pow = (int) Math.pow(2.0d, (double) ((c5 & 7) + 1));
                        C0084b bVar3 = this.f243c.f233d;
                        if ((c5 & 64) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar3.f223e = z3;
                        if (z2) {
                            bVar3.f229k = mo193e(pow);
                        } else {
                            bVar3.f229k = null;
                        }
                        this.f243c.f233d.f228j = this.f242b.position();
                        mo191c();
                        mo195g();
                        if (!mo189a()) {
                            C0085c cVar6 = this.f243c;
                            cVar6.f232c++;
                            cVar6.f234e.add(cVar6.f233d);
                        }
                    } else if (c2 != 59) {
                        this.f243c.f231b = 1;
                    } else {
                        z5 = true;
                    }
                }
                C0085c cVar7 = this.f243c;
                if (cVar7.f232c < 0) {
                    cVar7.f231b = 1;
                }
            }
            return this.f243c;
        }
    }

    /* renamed from: c */
    public final int mo191c() {
        try {
            return this.f242b.get() & 255;
        } catch (Exception unused) {
            this.f243c.f231b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void mo192d() {
        int c = mo191c();
        this.f244d = c;
        if (c > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.f244d;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.f242b.get(this.f241a, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    this.f243c.f231b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final int[] mo193e(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f242b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            this.f243c.f231b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final int mo194f() {
        return this.f242b.getShort();
    }

    /* renamed from: g */
    public final void mo195g() {
        int c;
        do {
            c = mo191c();
            this.f242b.position(Math.min(this.f242b.position() + c, this.f242b.limit()));
        } while (c > 0);
    }
}
