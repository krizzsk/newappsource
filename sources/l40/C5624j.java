package l40;

import android.util.SparseIntArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l40.C5605d;
import mf0.C24361g;

/* renamed from: l40.j */
public final class C5624j {

    /* renamed from: a */
    public final C5605d f18368a;

    /* renamed from: l40.j$a */
    public static class C5625a extends C5605d.C5608c {

        /* renamed from: a */
        public HashMap f18369a = new HashMap();

        /* renamed from: b */
        public final HashMap f18370b = new HashMap();

        /* renamed from: c */
        public String f18371c;

        /* renamed from: i */
        public final void mo21450i(int i, int i2, int i3, String str, String str2, String str3, byte b) {
            ((List) this.f18369a.get(this.f18371c)).add(Integer.valueOf(i2));
            this.f18370b.put(Integer.valueOf(i2), this.f18371c);
        }

        /* renamed from: j */
        public final void mo21451j(int i, String str, int i2, int i3, String str2, String str3, int i4) {
            this.f18371c = str;
            if (!this.f18369a.containsKey(str)) {
                this.f18369a.put(str, new ArrayList());
            }
        }
    }

    /* renamed from: l40.j$b */
    public static class C5626b extends C5605d.C5610e {

        /* renamed from: a */
        public int[][] f18372a;

        /* renamed from: c */
        public final void mo21457c(int[] iArr, int i, int i2) {
            this.f18372a[i] = iArr;
        }

        /* renamed from: d */
        public final int[] mo21458d(int i) {
            return new int[i];
        }

        /* renamed from: e */
        public final void mo21459e(int i) {
            this.f18372a = new int[i][];
        }
    }

    /* renamed from: l40.j$c */
    public static class C5627c extends C5605d.C5616k {

        /* renamed from: a */
        public long[] f18373a;

        /* renamed from: b */
        public int[] f18374b;

        /* renamed from: c */
        public int[] f18375c;

        /* renamed from: d */
        public int f18376d = 0;

        /* renamed from: e */
        public int f18377e;

        /* renamed from: f */
        public final SparseIntArray f18378f = new SparseIntArray(10);

        /* renamed from: g */
        public int f18379g;

        /* renamed from: a */
        public final int[] mo21473a(int i, int i2, int i3) {
            this.f18378f.put(i, i2);
            return null;
        }

        /* renamed from: b */
        public final void mo21474b(int i) {
            this.f18378f.clear();
        }

        /* renamed from: d */
        public final void mo21476d(int i) {
            this.f18377e = i;
        }

        /* renamed from: e */
        public final void mo21477e(int i, int i2, int i3, long j) {
            int i4 = this.f18376d;
            this.f18376d = i4 + 1;
            this.f18373a[i4] = j;
            this.f18374b[i4] = this.f18379g;
            this.f18375c[i4] = this.f18377e;
        }

        /* renamed from: f */
        public final boolean mo21478f(int i, int i2, int i3) {
            this.f18379g = this.f18378f.get(i);
            return true;
        }

        /* renamed from: h */
        public final void mo21485h(int i) {
            this.f18373a = new long[i];
            this.f18374b = new int[i];
            this.f18375c = new int[i];
        }
    }

    public C5624j(File file) throws IOException {
        C5605d dVar = new C5605d(file);
        this.f18368a = dVar;
        C5627c cVar = new C5627c();
        int[] h = dVar.mo21439h("service_ids.dat");
        int[] h2 = dVar.mo21439h("line_ids.dat");
        int[] h3 = dVar.mo21439h("pattern_ids.dat");
        DataInputStream a = dVar.mo21433a("trips.dat");
        a.readInt();
        int readInt = a.readInt();
        int readInt2 = a.readInt();
        cVar.mo21485h(readInt);
        for (int i = 0; i < readInt2; i++) {
            C5605d.m13824f(cVar, a, h, h2, h3);
        }
        a.close();
        this.f18368a.mo21435c(new C5626b(), (int[]) null, (int[]) null);
        C5605d dVar2 = this.f18368a;
        C5625a aVar = new C5625a();
        dVar2.mo21434b(aVar);
        long[] jArr = cVar.f18373a;
        HashMap hashMap = new HashMap(jArr.length);
        for (int i2 = 0; i2 < jArr.length; i2++) {
            hashMap.put(Long.valueOf(jArr[i2]), Integer.valueOf(i2));
        }
        int[] h4 = this.f18368a.mo21439h("stop_ids.dat");
        SparseIntArray sparseIntArray = new SparseIntArray(h4.length);
        for (int i3 = 0; i3 < h4.length; i3++) {
            sparseIntArray.put(h4[i3], i3);
        }
        int[] h5 = this.f18368a.mo21439h("line_ids.dat");
        SparseIntArray sparseIntArray2 = new SparseIntArray(h5.length);
        for (int i4 = 0; i4 < h5.length; i4++) {
            sparseIntArray2.put(h5[i4], i4);
        }
        this.f18368a.mo21439h("trips_index.dat");
        HashMap hashMap2 = new HashMap(aVar.f18369a.size());
        for (Map.Entry entry : aVar.f18369a.entrySet()) {
            hashMap2.put((String) entry.getKey(), C24361g.m61184r0((List) entry.getValue()));
        }
    }
}
