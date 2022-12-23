package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1245w;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import p229r1.C6235e;

/* renamed from: androidx.recyclerview.widget.a */
public final class C1160a implements C1245w.C1246a {

    /* renamed from: a */
    public C6235e f4423a = new C6235e(30);

    /* renamed from: b */
    public final ArrayList<C1162b> f4424b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C1162b> f4425c = new ArrayList<>();

    /* renamed from: d */
    public final C1161a f4426d;

    /* renamed from: e */
    public final C1245w f4427e;

    /* renamed from: f */
    public int f4428f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface C1161a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class C1162b {

        /* renamed from: a */
        public int f4429a;

        /* renamed from: b */
        public int f4430b;

        /* renamed from: c */
        public Object f4431c;

        /* renamed from: d */
        public int f4432d;

        public C1162b(Object obj, int i, int i2, int i3) {
            this.f4429a = i;
            this.f4430b = i2;
            this.f4432d = i3;
            this.f4431c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1162b)) {
                return false;
            }
            C1162b bVar = (C1162b) obj;
            int i = this.f4429a;
            if (i != bVar.f4429a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4432d - this.f4430b) == 1 && this.f4432d == bVar.f4430b && this.f4430b == bVar.f4432d) {
                return true;
            }
            if (this.f4432d != bVar.f4432d || this.f4430b != bVar.f4430b) {
                return false;
            }
            Object obj2 = this.f4431c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4431c)) {
                    return false;
                }
            } else if (bVar.f4431c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f4429a * 31) + this.f4430b) * 31) + this.f4432d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f4429a;
            if (i == 1) {
                str = ProductAction.ACTION_ADD;
            } else if (i == 2) {
                str = "rm";
            } else if (i == 4) {
                str = "up";
            } else if (i != 8) {
                str = "??";
            } else {
                str = "mv";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f4430b);
            sb.append("c:");
            sb.append(this.f4432d);
            sb.append(",p:");
            return C16530d.m42015h(sb, this.f4431c, "]");
        }
    }

    public C1160a(C1170d0 d0Var) {
        this.f4426d = d0Var;
        this.f4427e = new C1245w(this);
    }

    /* renamed from: a */
    public final boolean mo4993a(int i) {
        int size = this.f4425c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1162b bVar = this.f4425c.get(i2);
            int i3 = bVar.f4429a;
            if (i3 == 8) {
                if (mo4998f(bVar.f4432d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4430b;
                int i5 = bVar.f4432d + i4;
                while (i4 < i5) {
                    if (mo4998f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo4994b() {
        int size = this.f4425c.size();
        for (int i = 0; i < size; i++) {
            ((C1170d0) this.f4426d).mo5022a(this.f4425c.get(i));
        }
        mo5004l(this.f4425c);
        this.f4428f = 0;
    }

    /* renamed from: c */
    public final void mo4995c() {
        mo4994b();
        int size = this.f4424b.size();
        for (int i = 0; i < size; i++) {
            C1162b bVar = this.f4424b.get(i);
            int i2 = bVar.f4429a;
            if (i2 == 1) {
                ((C1170d0) this.f4426d).mo5022a(bVar);
                ((C1170d0) this.f4426d).mo5025d(bVar.f4430b, bVar.f4432d);
            } else if (i2 == 2) {
                ((C1170d0) this.f4426d).mo5022a(bVar);
                C1161a aVar = this.f4426d;
                int i3 = bVar.f4430b;
                int i4 = bVar.f4432d;
                C1170d0 d0Var = (C1170d0) aVar;
                d0Var.f4448a.mo4559Q(i3, i4, true);
                RecyclerView recyclerView = d0Var.f4448a;
                recyclerView.f4294y0 = true;
                recyclerView.f4288v0.f4351c += i4;
            } else if (i2 == 4) {
                ((C1170d0) this.f4426d).mo5022a(bVar);
                ((C1170d0) this.f4426d).mo5024c(bVar.f4430b, bVar.f4432d, bVar.f4431c);
            } else if (i2 == 8) {
                ((C1170d0) this.f4426d).mo5022a(bVar);
                ((C1170d0) this.f4426d).mo5026e(bVar.f4430b, bVar.f4432d);
            }
        }
        mo5004l(this.f4424b);
        this.f4428f = 0;
    }

    /* renamed from: d */
    public final void mo4996d(C1162b bVar) {
        int i;
        boolean z;
        int i2 = bVar.f4429a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = mo5005m(bVar.f4430b, i2);
        int i3 = bVar.f4430b;
        int i4 = bVar.f4429a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f4432d; i6++) {
            int m2 = mo5005m((i * i6) + bVar.f4430b, bVar.f4429a);
            int i7 = bVar.f4429a;
            if (i7 == 2 ? m2 != m : !(i7 == 4 && m2 == m + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i5++;
            } else {
                C1162b h = mo5000h(bVar.f4431c, i7, m, i5);
                mo4997e(h, i3);
                h.f4431c = null;
                this.f4423a.mo22236a(h);
                if (bVar.f4429a == 4) {
                    i3 += i5;
                }
                m = m2;
                i5 = 1;
            }
        }
        Object obj = bVar.f4431c;
        bVar.f4431c = null;
        this.f4423a.mo22236a(bVar);
        if (i5 > 0) {
            C1162b h2 = mo5000h(obj, bVar.f4429a, m, i5);
            mo4997e(h2, i3);
            h2.f4431c = null;
            this.f4423a.mo22236a(h2);
        }
    }

    /* renamed from: e */
    public final void mo4997e(C1162b bVar, int i) {
        ((C1170d0) this.f4426d).mo5022a(bVar);
        int i2 = bVar.f4429a;
        if (i2 == 2) {
            C1161a aVar = this.f4426d;
            int i3 = bVar.f4432d;
            C1170d0 d0Var = (C1170d0) aVar;
            d0Var.f4448a.mo4559Q(i, i3, true);
            RecyclerView recyclerView = d0Var.f4448a;
            recyclerView.f4294y0 = true;
            recyclerView.f4288v0.f4351c += i3;
        } else if (i2 == 4) {
            ((C1170d0) this.f4426d).mo5024c(i, bVar.f4432d, bVar.f4431c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: f */
    public final int mo4998f(int i, int i2) {
        int size = this.f4425c.size();
        while (i2 < size) {
            C1162b bVar = this.f4425c.get(i2);
            int i3 = bVar.f4429a;
            if (i3 == 8) {
                int i4 = bVar.f4430b;
                if (i4 == i) {
                    i = bVar.f4432d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4432d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4430b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4432d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4432d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public final boolean mo4999g() {
        return this.f4424b.size() > 0;
    }

    /* renamed from: h */
    public final C1162b mo5000h(Object obj, int i, int i2, int i3) {
        C1162b bVar = (C1162b) this.f4423a.mo22237b();
        if (bVar == null) {
            return new C1162b(obj, i, i2, i3);
        }
        bVar.f4429a = i;
        bVar.f4430b = i2;
        bVar.f4432d = i3;
        bVar.f4431c = obj;
        return bVar;
    }

    /* renamed from: i */
    public final void mo5001i(C1162b bVar) {
        this.f4425c.add(bVar);
        int i = bVar.f4429a;
        if (i == 1) {
            ((C1170d0) this.f4426d).mo5025d(bVar.f4430b, bVar.f4432d);
        } else if (i == 2) {
            C1161a aVar = this.f4426d;
            C1170d0 d0Var = (C1170d0) aVar;
            d0Var.f4448a.mo4559Q(bVar.f4430b, bVar.f4432d, false);
            d0Var.f4448a.f4294y0 = true;
        } else if (i == 4) {
            ((C1170d0) this.f4426d).mo5024c(bVar.f4430b, bVar.f4432d, bVar.f4431c);
        } else if (i == 8) {
            ((C1170d0) this.f4426d).mo5026e(bVar.f4430b, bVar.f4432d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5002j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.w r1 = r0.f4427e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f4424b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.C1160a.C1162b) r9
            int r9 = r9.f4429a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01e0
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.C1160a.C1162b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.C1160a.C1162b) r12
            int r13 = r12.f4429a
            if (r13 == r4) goto L_0x01b6
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f4432d
            int r8 = r12.f4430b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f4430b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f4432d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f4432d = r9
            androidx.recyclerview.widget.w$a r5 = r1.f4698a
            int r8 = r11.f4430b
            java.lang.Object r9 = r12.f4431c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C1160a) r5
            androidx.recyclerview.widget.a$b r4 = r5.mo5000h(r9, r6, r8, r4)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f4430b
            int r8 = r12.f4430b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f4430b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f4432d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.w$a r9 = r1.f4698a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f4431c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.C1160a) r9
            androidx.recyclerview.widget.a$b r5 = r9.mo5000h(r13, r6, r5, r8)
            int r6 = r12.f4432d
            int r6 = r6 - r8
            r12.f4432d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f4432d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.w$a r6 = r1.f4698a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.C1160a) r6
            r6.getClass()
            r12.f4431c = r10
            r1.e r6 = r6.f4423a
            r6.mo22236a(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f4430b
            int r8 = r11.f4432d
            if (r6 >= r8) goto L_0x00c6
            int r13 = r12.f4430b
            if (r13 != r6) goto L_0x00c3
            int r13 = r12.f4432d
            int r6 = r8 - r6
            if (r13 != r6) goto L_0x00c3
            r5 = 0
            goto L_0x00d2
        L_0x00c3:
            r5 = 0
            r6 = 0
            goto L_0x00d7
        L_0x00c6:
            int r13 = r12.f4430b
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d5
            int r13 = r12.f4432d
            int r6 = r6 - r8
            if (r13 != r6) goto L_0x00d5
            r5 = 1
        L_0x00d2:
            r6 = r5
            r5 = 1
            goto L_0x00d7
        L_0x00d5:
            r5 = 0
            r6 = 1
        L_0x00d7:
            int r13 = r12.f4430b
            if (r8 >= r13) goto L_0x00e0
            int r13 = r13 + -1
            r12.f4430b = r13
            goto L_0x0104
        L_0x00e0:
            int r14 = r12.f4432d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0104
            int r14 = r14 + -1
            r12.f4432d = r14
            r11.f4429a = r9
            r11.f4432d = r4
            int r3 = r12.f4432d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.w$a r3 = r1.f4698a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C1160a) r3
            r3.getClass()
            r12.f4431c = r10
            r1.e r3 = r3.f4423a
            r3.mo22236a(r12)
            goto L_0x0009
        L_0x0104:
            int r4 = r11.f4430b
            int r8 = r12.f4430b
            if (r4 > r8) goto L_0x010f
            int r8 = r8 + 1
            r12.f4430b = r8
            goto L_0x0127
        L_0x010f:
            int r13 = r12.f4432d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0127
            int r8 = r8 - r4
            androidx.recyclerview.widget.w$a r13 = r1.f4698a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.C1160a) r13
            androidx.recyclerview.widget.a$b r4 = r13.mo5000h(r10, r9, r4, r8)
            int r8 = r11.f4430b
            int r9 = r12.f4430b
            int r8 = r8 - r9
            r12.f4432d = r8
            goto L_0x0128
        L_0x0127:
            r4 = r10
        L_0x0128:
            if (r5 == 0) goto L_0x0140
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.w$a r3 = r1.f4698a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C1160a) r3
            r3.getClass()
            r11.f4431c = r10
            r1.e r3 = r3.f4423a
            r3.mo22236a(r11)
            goto L_0x0009
        L_0x0140:
            if (r6 == 0) goto L_0x0171
            if (r4 == 0) goto L_0x015a
            int r5 = r11.f4430b
            int r6 = r4.f4430b
            if (r5 <= r6) goto L_0x014f
            int r6 = r4.f4432d
            int r5 = r5 - r6
            r11.f4430b = r5
        L_0x014f:
            int r5 = r11.f4432d
            int r6 = r4.f4430b
            if (r5 <= r6) goto L_0x015a
            int r6 = r4.f4432d
            int r5 = r5 - r6
            r11.f4432d = r5
        L_0x015a:
            int r5 = r11.f4430b
            int r6 = r12.f4430b
            if (r5 <= r6) goto L_0x0165
            int r6 = r12.f4432d
            int r5 = r5 - r6
            r11.f4430b = r5
        L_0x0165:
            int r5 = r11.f4432d
            int r6 = r12.f4430b
            if (r5 <= r6) goto L_0x019f
            int r6 = r12.f4432d
            int r5 = r5 - r6
            r11.f4432d = r5
            goto L_0x019f
        L_0x0171:
            if (r4 == 0) goto L_0x0189
            int r5 = r11.f4430b
            int r6 = r4.f4430b
            if (r5 < r6) goto L_0x017e
            int r6 = r4.f4432d
            int r5 = r5 - r6
            r11.f4430b = r5
        L_0x017e:
            int r5 = r11.f4432d
            int r6 = r4.f4430b
            if (r5 < r6) goto L_0x0189
            int r6 = r4.f4432d
            int r5 = r5 - r6
            r11.f4432d = r5
        L_0x0189:
            int r5 = r11.f4430b
            int r6 = r12.f4430b
            if (r5 < r6) goto L_0x0194
            int r6 = r12.f4432d
            int r5 = r5 - r6
            r11.f4430b = r5
        L_0x0194:
            int r5 = r11.f4432d
            int r6 = r12.f4430b
            if (r5 < r6) goto L_0x019f
            int r6 = r12.f4432d
            int r5 = r5 - r6
            r11.f4432d = r5
        L_0x019f:
            r2.set(r3, r12)
            int r5 = r11.f4430b
            int r6 = r11.f4432d
            if (r5 == r6) goto L_0x01ac
            r2.set(r7, r11)
            goto L_0x01af
        L_0x01ac:
            r2.remove(r7)
        L_0x01af:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01b6:
            int r4 = r11.f4432d
            int r6 = r12.f4430b
            if (r4 >= r6) goto L_0x01be
            r5 = -1
            goto L_0x01bf
        L_0x01be:
            r5 = 0
        L_0x01bf:
            int r8 = r11.f4430b
            if (r8 >= r6) goto L_0x01c5
            int r5 = r5 + 1
        L_0x01c5:
            if (r6 > r8) goto L_0x01cc
            int r6 = r12.f4432d
            int r8 = r8 + r6
            r11.f4430b = r8
        L_0x01cc:
            int r6 = r12.f4430b
            if (r6 > r4) goto L_0x01d5
            int r8 = r12.f4432d
            int r4 = r4 + r8
            r11.f4432d = r4
        L_0x01d5:
            int r6 = r6 + r5
            r12.f4430b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01e0:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f4424b
            int r1 = r1.size()
            r2 = 0
        L_0x01e7:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f4424b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C1160a.C1162b) r3
            int r11 = r3.f4429a
            if (r11 == r4) goto L_0x02b4
            if (r11 == r9) goto L_0x025a
            if (r11 == r6) goto L_0x0202
            if (r11 == r7) goto L_0x01fd
            goto L_0x02b7
        L_0x01fd:
            r0.mo5001i(r3)
            goto L_0x02b7
        L_0x0202:
            int r11 = r3.f4430b
            int r12 = r3.f4432d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x020a:
            if (r11 >= r12) goto L_0x023e
            androidx.recyclerview.widget.a$a r5 = r0.f4426d
            androidx.recyclerview.widget.d0 r5 = (androidx.recyclerview.widget.C1170d0) r5
            androidx.recyclerview.widget.RecyclerView$a0 r5 = r5.mo5023b(r11)
            if (r5 != 0) goto L_0x022c
            boolean r5 = r0.mo4993a(r11)
            if (r5 == 0) goto L_0x021d
            goto L_0x022c
        L_0x021d:
            if (r15 != r4) goto L_0x022a
            java.lang.Object r5 = r3.f4431c
            androidx.recyclerview.widget.a$b r5 = r0.mo5000h(r5, r6, r13, r14)
            r0.mo5001i(r5)
            r13 = r11
            r14 = 0
        L_0x022a:
            r15 = 0
            goto L_0x023a
        L_0x022c:
            if (r15 != 0) goto L_0x0239
            java.lang.Object r5 = r3.f4431c
            androidx.recyclerview.widget.a$b r5 = r0.mo5000h(r5, r6, r13, r14)
            r0.mo4996d(r5)
            r13 = r11
            r14 = 0
        L_0x0239:
            r15 = 1
        L_0x023a:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x020a
        L_0x023e:
            int r5 = r3.f4432d
            if (r14 == r5) goto L_0x024f
            java.lang.Object r5 = r3.f4431c
            r3.f4431c = r10
            r1.e r11 = r0.f4423a
            r11.mo22236a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo5000h(r5, r6, r13, r14)
        L_0x024f:
            if (r15 != 0) goto L_0x0256
            r0.mo4996d(r3)
            goto L_0x02b7
        L_0x0256:
            r0.mo5001i(r3)
            goto L_0x02b7
        L_0x025a:
            int r5 = r3.f4430b
            int r11 = r3.f4432d
            int r11 = r11 + r5
            r12 = r5
            r13 = 0
            r14 = -1
        L_0x0262:
            if (r12 >= r11) goto L_0x029b
            androidx.recyclerview.widget.a$a r15 = r0.f4426d
            androidx.recyclerview.widget.d0 r15 = (androidx.recyclerview.widget.C1170d0) r15
            androidx.recyclerview.widget.RecyclerView$a0 r15 = r15.mo5023b(r12)
            if (r15 != 0) goto L_0x0283
            boolean r15 = r0.mo4993a(r12)
            if (r15 == 0) goto L_0x0275
            goto L_0x0283
        L_0x0275:
            if (r14 != r4) goto L_0x0280
            androidx.recyclerview.widget.a$b r14 = r0.mo5000h(r10, r9, r5, r13)
            r0.mo5001i(r14)
            r14 = 1
            goto L_0x0281
        L_0x0280:
            r14 = 0
        L_0x0281:
            r15 = 0
            goto L_0x0290
        L_0x0283:
            if (r14 != 0) goto L_0x028e
            androidx.recyclerview.widget.a$b r14 = r0.mo5000h(r10, r9, r5, r13)
            r0.mo4996d(r14)
            r14 = 1
            goto L_0x028f
        L_0x028e:
            r14 = 0
        L_0x028f:
            r15 = 1
        L_0x0290:
            if (r14 == 0) goto L_0x0296
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x0298
        L_0x0296:
            int r13 = r13 + 1
        L_0x0298:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0262
        L_0x029b:
            int r11 = r3.f4432d
            if (r13 == r11) goto L_0x02aa
            r3.f4431c = r10
            r1.e r11 = r0.f4423a
            r11.mo22236a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo5000h(r10, r9, r5, r13)
        L_0x02aa:
            if (r14 != 0) goto L_0x02b0
            r0.mo4996d(r3)
            goto L_0x02b7
        L_0x02b0:
            r0.mo5001i(r3)
            goto L_0x02b7
        L_0x02b4:
            r0.mo5001i(r3)
        L_0x02b7:
            int r2 = r2 + 1
            goto L_0x01e7
        L_0x02bb:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f4424b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1160a.mo5002j():void");
    }

    /* renamed from: k */
    public final void mo5003k(C1162b bVar) {
        bVar.f4431c = null;
        this.f4423a.mo22236a(bVar);
    }

    /* renamed from: l */
    public final void mo5004l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo5003k((C1162b) arrayList.get(i));
        }
        arrayList.clear();
    }

    /* renamed from: m */
    public final int mo5005m(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f4425c.size() - 1; size >= 0; size--) {
            C1162b bVar = this.f4425c.get(size);
            int i5 = bVar.f4429a;
            if (i5 == 8) {
                int i6 = bVar.f4430b;
                int i7 = bVar.f4432d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f4430b = i6 + 1;
                            bVar.f4432d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f4430b = i6 - 1;
                            bVar.f4432d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f4432d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f4432d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f4430b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f4430b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f4430b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f4432d;
                    } else if (i5 == 2) {
                        i += bVar.f4432d;
                    }
                } else if (i2 == 1) {
                    bVar.f4430b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f4430b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f4425c.size() - 1; size2 >= 0; size2--) {
            C1162b bVar2 = this.f4425c.get(size2);
            if (bVar2.f4429a == 8) {
                int i9 = bVar2.f4432d;
                if (i9 == bVar2.f4430b || i9 < 0) {
                    this.f4425c.remove(size2);
                    mo5003k(bVar2);
                }
            } else if (bVar2.f4432d <= 0) {
                this.f4425c.remove(size2);
                mo5003k(bVar2);
            }
        }
        return i;
    }
}
