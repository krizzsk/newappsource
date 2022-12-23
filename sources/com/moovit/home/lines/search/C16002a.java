package com.moovit.home.lines.search;

import android.database.Cursor;
import android.database.DataSetObserver;
import ce0.C21100e;
import com.moovit.home.lines.search.C16004b;
import com.moovit.home.lines.search.C16007c;
import p178n2.C5833n;

/* renamed from: com.moovit.home.lines.search.a */
public final class C16002a extends C5833n<C16004b.C16006b> {

    /* renamed from: b */
    public final C16007c.C16008a f41654b;

    /* renamed from: com.moovit.home.lines.search.a$a */
    public class C16003a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ C16007c.C16008a f41655a;

        public C16003a(C16007c.C16008a aVar) {
            this.f41655a = aVar;
        }

        public final void onInvalidated() {
            super.onInvalidated();
            this.f41655a.f41684g.f50418b.unregisterDataSetObserver(this);
            C16002a.this.f4103a.mo21690a();
        }
    }

    public C16002a(C16007c.C16008a aVar) {
        C21100e.m49373x(aVar, "result");
        this.f41654b = aVar;
        aVar.f41684g.f50418b.registerDataSetObserver(new C16003a(aVar));
    }

    /* renamed from: a */
    public final Cursor mo48159a(int i) {
        if (this.f41654b.f41684g.f50418b.moveToPosition(i)) {
            return this.f41654b.f41684g.f50418b;
        }
        throw new IllegalStateException(C16759e.m42349e("Couldn't move cursor to position ", i));
    }

    /* renamed from: b */
    public final int mo48160b(int i) {
        boolean z = false;
        if (i == this.f41654b.f41682e[0]) {
            z = true;
        }
        if (z) {
            throw new IllegalStateException("The position represent twitter feeds item.");
        } else if (!mo48161c(i)) {
            return i - this.f41654b.f41682e[3];
        } else {
            throw new IllegalStateException("The position represent recent item.");
        }
    }

    /* renamed from: c */
    public final boolean mo48161c(int i) {
        C16007c.C16008a aVar = this.f41654b;
        int i2 = aVar.f41682e[1];
        int size = aVar.f41683f.size() + i2;
        if (i2 > i || i > size) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (((r14 - r7) - 1) == (r1.f41683f.size() - 1)) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (mo48159a(mo48160b(r14 + 1)).isNull(r7.f50396a) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo48162d(int r14, int r15) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15 - r14
            r2 = 1
            int r1 = r1 + r2
            r0.<init>(r1)
        L_0x0009:
            if (r14 > r15) goto L_0x0195
            com.moovit.home.lines.search.c$a r1 = r13.f41654b
            int[] r1 = r1.f41682e
            r3 = 0
            r1 = r1[r3]
            if (r14 != r1) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r4 = 2
            r5 = 4
            r6 = 3
            if (r1 == 0) goto L_0x001e
            r3 = 7
            goto L_0x0081
        L_0x001e:
            boolean r1 = r13.mo48161c(r14)
            if (r1 == 0) goto L_0x003f
            com.moovit.home.lines.search.c$a r1 = r13.f41654b
            int[] r7 = r1.f41682e
            r7 = r7[r2]
            if (r14 != r7) goto L_0x002e
            r8 = 1
            goto L_0x002f
        L_0x002e:
            r8 = 0
        L_0x002f:
            if (r8 == 0) goto L_0x0032
            goto L_0x0081
        L_0x0032:
            int r3 = r14 - r7
            int r3 = r3 - r2
            java.util.List<zz.i0<com.moovit.home.lines.search.SearchLineItem, u00.h$i>> r1 = r1.f41683f
            int r1 = r1.size()
            int r1 = r1 - r2
            if (r3 != r1) goto L_0x0080
            goto L_0x007e
        L_0x003f:
            com.moovit.home.lines.search.c$a r1 = r13.f41654b
            int[] r1 = r1.f41682e
            r1 = r1[r4]
            if (r14 != r1) goto L_0x0048
            r3 = 1
        L_0x0048:
            if (r3 == 0) goto L_0x004c
            r3 = 1
            goto L_0x0081
        L_0x004c:
            int r1 = r13.mo48160b(r14)
            android.database.Cursor r3 = r13.mo48159a(r1)
            com.moovit.home.lines.search.c$a r7 = r13.f41654b
            u00.h$j r7 = r7.f41684g
            u00.h$h r7 = r7.f50419c
            int r8 = r7.f50396a
            boolean r8 = r3.isNull(r8)
            if (r8 == 0) goto L_0x0064
            r3 = 2
            goto L_0x0081
        L_0x0064:
            int r3 = r3.getCount()
            int r3 = r3 - r2
            if (r1 != r3) goto L_0x006c
            goto L_0x007e
        L_0x006c:
            int r1 = r14 + 1
            int r1 = r13.mo48160b(r1)
            android.database.Cursor r1 = r13.mo48159a(r1)
            int r3 = r7.f50396a
            boolean r1 = r1.isNull(r3)
            if (r1 == 0) goto L_0x0080
        L_0x007e:
            r3 = 4
            goto L_0x0081
        L_0x0080:
            r3 = 3
        L_0x0081:
            com.moovit.home.lines.search.c$a r1 = r13.f41654b
            u00.h$j r1 = r1.f41684g
            int r1 = r1.f50417a
            if (r1 == r4) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            if (r3 == r6) goto L_0x0092
            if (r3 == r5) goto L_0x0090
        L_0x008e:
            r1 = r3
            goto L_0x0093
        L_0x0090:
            r1 = 6
            goto L_0x0093
        L_0x0092:
            r1 = 5
        L_0x0093:
            switch(r1) {
                case 0: goto L_0x013a;
                case 1: goto L_0x013a;
                case 2: goto L_0x013a;
                case 3: goto L_0x00ab;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00ab;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0191
        L_0x0098:
            com.moovit.home.lines.search.b$b r12 = new com.moovit.home.lines.search.b$b
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r12
            r4 = r1
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r12)
            goto L_0x0191
        L_0x00ab:
            boolean r3 = r13.mo48161c(r14)
            java.lang.String r4 = "The position represent recent header instead of search line item"
            if (r3 == 0) goto L_0x00d1
            if (r14 == 0) goto L_0x00cb
            com.moovit.home.lines.search.c$a r3 = r13.f41654b
            java.util.List<zz.i0<com.moovit.home.lines.search.SearchLineItem, u00.h$i>> r5 = r3.f41683f
            int[] r3 = r3.f41682e
            r3 = r3[r2]
            int r3 = r14 - r3
            int r3 = r3 - r2
            java.lang.Object r3 = r5.get(r3)
            zz.i0 r3 = (p977zz.C20944i0) r3
            F r3 = r3.f52692a
            com.moovit.home.lines.search.SearchLineItem r3 = (com.moovit.home.lines.search.SearchLineItem) r3
            goto L_0x00e3
        L_0x00cb:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r4)
            throw r14
        L_0x00d1:
            int r3 = r13.mo48160b(r14)
            android.database.Cursor r3 = r13.mo48159a(r3)
            com.moovit.home.lines.search.c$a r5 = r13.f41654b
            u00.h$j r5 = r5.f41684g
            u00.h$h r5 = r5.f50419c
            com.moovit.home.lines.search.SearchLineItem r3 = u00.C19826h.m47293l(r3, r5)
        L_0x00e3:
            r8 = r3
            boolean r9 = r13.mo48161c(r14)
            com.moovit.home.lines.search.c$a r3 = r13.f41654b
            java.util.Map<com.moovit.network.model.ServerId, com.moovit.servicealerts.LineServiceAlertDigest> r3 = r3.f41685h
            com.moovit.network.model.ServerId r5 = r8.f41637b
            java.lang.Object r3 = r3.get(r5)
            r10 = r3
            com.moovit.servicealerts.LineServiceAlertDigest r10 = (com.moovit.servicealerts.LineServiceAlertDigest) r10
            boolean r3 = r13.mo48161c(r14)
            if (r3 == 0) goto L_0x0119
            if (r14 == 0) goto L_0x0113
            com.moovit.home.lines.search.c$a r3 = r13.f41654b
            java.util.List<zz.i0<com.moovit.home.lines.search.SearchLineItem, u00.h$i>> r4 = r3.f41683f
            int[] r3 = r3.f41682e
            r3 = r3[r2]
            int r3 = r14 - r3
            int r3 = r3 - r2
            java.lang.Object r3 = r4.get(r3)
            zz.i0 r3 = (p977zz.C20944i0) r3
            S r3 = r3.f52693b
            u00.h$i r3 = (u00.C19826h.C19835i) r3
            goto L_0x012b
        L_0x0113:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r4)
            throw r14
        L_0x0119:
            int r3 = r13.mo48160b(r14)
            android.database.Cursor r3 = r13.mo48159a(r3)
            com.moovit.home.lines.search.c$a r4 = r13.f41654b
            u00.h$j r4 = r4.f41684g
            u00.h$h r4 = r4.f50419c
            u00.h$i r3 = u00.C19826h.m47294m(r3, r4)
        L_0x012b:
            r11 = r3
            com.moovit.home.lines.search.b$b r12 = new com.moovit.home.lines.search.b$b
            r6 = 0
            r7 = 0
            r3 = r12
            r4 = r1
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r12)
            goto L_0x0191
        L_0x013a:
            r3 = 0
            if (r1 != r4) goto L_0x0180
            com.moovit.MoovitApplication<?, ?, ?> r4 = com.moovit.MoovitApplication.f37317k
            com.moovit.home.lines.search.c$a r5 = r13.f41654b
            s00.d r5 = r5.f41680c
            int r6 = r13.mo48160b(r14)
            android.database.Cursor r6 = r13.mo48159a(r6)
            com.moovit.home.lines.search.c$a r7 = r13.f41654b
            u00.h$j r7 = r7.f41684g
            u00.h$h r7 = r7.f50419c
            int r8 = r7.f50397b
            int r8 = r6.getInt(r8)
            com.moovit.network.model.ServerId r9 = new com.moovit.network.model.ServerId
            r9.<init>(r8)
            com.moovit.database.DbEntityRef r8 = com.moovit.database.DbEntityRef.newTransitTypeRef(r9)
            r8.resolve(r4, r5)
            int r9 = r7.f50398c
            boolean r9 = r6.isNull(r9)
            if (r9 != 0) goto L_0x017d
            int r3 = r7.f50398c
            int r3 = r6.getInt(r3)
            com.moovit.network.model.ServerId r6 = new com.moovit.network.model.ServerId
            r6.<init>(r3)
            com.moovit.database.DbEntityRef r3 = com.moovit.database.DbEntityRef.newAgencyRef((com.moovit.network.model.ServerId) r6)
            r3.resolve(r4, r5)
        L_0x017d:
            r7 = r3
            r6 = r8
            goto L_0x0182
        L_0x0180:
            r6 = r3
            r7 = r6
        L_0x0182:
            com.moovit.home.lines.search.b$b r12 = new com.moovit.home.lines.search.b$b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r12
            r4 = r1
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r12)
        L_0x0191:
            int r14 = r14 + 1
            goto L_0x0009
        L_0x0195:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.home.lines.search.C16002a.mo48162d(int, int):java.util.ArrayList");
    }
}
