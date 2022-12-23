package l40;

import android.util.SparseIntArray;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import s40.C6467f;
import s40.C6469g;

/* renamed from: l40.d */
public final class C5605d {

    /* renamed from: a */
    public final File f18351a;

    /* renamed from: b */
    public char[] f18352b = new char[1000];

    /* renamed from: c */
    public byte[] f18353c = new byte[2000];

    /* renamed from: l40.d$a */
    public static abstract class C5606a {
    }

    /* renamed from: l40.d$b */
    public static abstract class C5607b {
    }

    /* renamed from: l40.d$c */
    public static abstract class C5608c {
        /* renamed from: a */
        public void mo21442a() {
        }

        /* renamed from: b */
        public void mo21443b() {
        }

        /* renamed from: c */
        public void mo21444c() {
        }

        /* renamed from: d */
        public void mo21445d() {
        }

        /* renamed from: e */
        public void mo21446e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo21447f() {
        }

        /* renamed from: g */
        public void mo21448g(int i, int i2) {
        }

        /* renamed from: h */
        public void mo21449h() {
        }

        /* renamed from: i */
        public abstract void mo21450i(int i, int i2, int i3, String str, String str2, String str3, byte b);

        /* renamed from: j */
        public abstract void mo21451j(int i, String str, int i2, int i3, String str2, String str3, int i4);

        /* renamed from: k */
        public void mo21452k() {
        }

        /* renamed from: l */
        public void mo21453l(byte b, String str) {
        }

        /* renamed from: m */
        public void mo21454m() {
        }
    }

    /* renamed from: l40.d$d */
    public static abstract class C5609d {
    }

    /* renamed from: l40.d$e */
    public static abstract class C5610e {
        /* renamed from: a */
        public void mo21455a(int i) {
        }

        /* renamed from: b */
        public void mo21456b() {
        }

        /* renamed from: c */
        public abstract void mo21457c(int[] iArr, int i, int i2);

        /* renamed from: d */
        public abstract int[] mo21458d(int i);

        /* renamed from: e */
        public abstract void mo21459e(int i);
    }

    /* renamed from: l40.d$f */
    public static abstract class C5611f {
    }

    /* renamed from: l40.d$g */
    public static abstract class C5612g {
    }

    /* renamed from: l40.d$h */
    public static abstract class C5613h {
    }

    /* renamed from: l40.d$i */
    public static abstract class C5614i {
        /* renamed from: a */
        public abstract void mo21460a(String str, int i, int i2, int i3, int i4, int i5, String str2);

        /* renamed from: b */
        public void mo21461b() {
        }

        /* renamed from: c */
        public void mo21462c() {
        }

        /* renamed from: d */
        public void mo21463d() {
        }

        /* renamed from: e */
        public void mo21464e(String[] strArr, int i, int i2) {
        }

        /* renamed from: f */
        public void mo21465f() {
        }

        /* renamed from: g */
        public void mo21466g() {
        }

        /* renamed from: h */
        public void mo21467h(String str, int i, int i2, int i3, int i4) {
        }

        /* renamed from: i */
        public void mo21468i(int i) {
        }

        /* renamed from: j */
        public void mo21469j() {
        }

        /* renamed from: k */
        public void mo21470k(String str) {
        }

        /* renamed from: l */
        public void mo21471l(int i, String[] strArr) {
        }

        /* renamed from: m */
        public abstract void mo21472m(int i);
    }

    /* renamed from: l40.d$j */
    public static abstract class C5615j {
    }

    /* renamed from: l40.d$k */
    public static abstract class C5616k {
        /* renamed from: a */
        public abstract int[] mo21473a(int i, int i2, int i3);

        /* renamed from: b */
        public abstract void mo21474b(int i);

        /* renamed from: c */
        public void mo21475c(int[] iArr, int i) {
        }

        /* renamed from: d */
        public void mo21476d(int i) {
        }

        /* renamed from: e */
        public abstract void mo21477e(int i, int i2, int i3, long j);

        /* renamed from: f */
        public abstract boolean mo21478f(int i, int i2, int i3);

        /* renamed from: g */
        public int[] mo21479g(int i, int i2) {
            return null;
        }
    }

    public C5605d(File file) {
        this.f18351a = file;
    }

    /* renamed from: f */
    public static void m13824f(C5616k kVar, DataInput dataInput, int[] iArr, int[] iArr2, int[] iArr3) throws IOException {
        int readInt = dataInput.readInt();
        if (iArr2 != null) {
            readInt = iArr2[readInt];
        }
        kVar.mo21476d(readInt);
        int readInt2 = dataInput.readInt();
        kVar.mo21474b(readInt2);
        for (int i = 0; i < readInt2; i++) {
            int readInt3 = dataInput.readInt();
            int readInt4 = dataInput.readInt();
            if (iArr3 != null) {
                readInt3 = iArr3[readInt3];
            }
            int[] a = kVar.mo21473a(i, readInt3, readInt4);
            if (a == null) {
                dataInput.skipBytes(readInt4 * 4);
            } else {
                for (int i2 = 0; i2 < readInt4; i2++) {
                    a[i2] = dataInput.readInt();
                }
            }
            if (a != null) {
                kVar.mo21475c(a, i);
            }
        }
        int readInt5 = dataInput.readInt();
        for (int i3 = 0; i3 < readInt5; i3++) {
            int readInt6 = dataInput.readInt();
            int readInt7 = dataInput.readInt();
            int readInt8 = dataInput.readInt();
            int readInt9 = dataInput.readInt();
            if (iArr != null) {
                readInt7 = iArr[readInt7];
            }
            int i4 = readInt7;
            if (kVar.mo21478f(readInt6, i4, readInt8)) {
                for (int i5 = 0; i5 < readInt9; i5++) {
                    C5616k kVar2 = kVar;
                    int i6 = readInt6;
                    int i7 = i4;
                    kVar2.mo21477e(i6, i7, dataInput.readInt(), dataInput.readLong());
                }
            } else {
                dataInput.skipBytes(readInt9 * 12);
            }
            int readInt10 = dataInput.readInt();
            int[] g = kVar.mo21479g(readInt6, readInt10);
            if (g != null) {
                for (int i8 = 0; i8 < readInt10; i8++) {
                    g[i8] = dataInput.readInt();
                }
            } else {
                dataInput.skipBytes(readInt10 * 4);
            }
        }
    }

    /* renamed from: a */
    public final DataInputStream mo21433a(String str) throws IOException {
        return new DataInputStream(new BufferedInputStream(new FileInputStream(new File(this.f18351a, str)), SQLiteDatabase.OPEN_PRIVATECACHE));
    }

    /* renamed from: b */
    public final void mo21434b(C5608c cVar) throws IOException {
        byte b;
        C5608c cVar2 = cVar;
        int[] h = mo21439h("line_ids.dat");
        DataInputStream a = mo21433a("lines.dat");
        a.readInt();
        int readInt = a.readInt();
        cVar.mo21442a();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = a.readInt();
            cVar.mo21451j(readInt2, mo21441j(a, a.readInt()), a.readInt(), a.readInt(), mo21440i(a), mo21440i(a), a.readInt());
            int readInt3 = a.readInt();
            cVar.mo21447f();
            for (int i2 = 0; i2 < readInt3; i2++) {
                cVar2.mo21446e(a.readInt(), a.readInt());
            }
            cVar.mo21443b();
            int readInt4 = a.readInt();
            cVar.mo21449h();
            for (int i3 = 0; i3 < readInt4; i3++) {
                cVar2.mo21448g(a.readInt(), a.readInt());
            }
            cVar.mo21444c();
            int readInt5 = a.readInt();
            cVar.mo21454m();
            for (int i4 = 0; i4 < readInt5; i4++) {
                cVar2.mo21453l(a.readByte(), mo21441j(a, a.readInt()));
            }
            int readInt6 = a.readInt();
            cVar.mo21452k();
            int i5 = 0;
            while (i5 < readInt6) {
                int i6 = h[a.readInt()];
                String i7 = mo21440i(a);
                String j = mo21441j(a, a.readInt());
                String i8 = mo21440i(a);
                if (readInt5 > 0) {
                    b = a.readByte();
                } else {
                    b = -1;
                }
                int i9 = i5;
                int i11 = i5;
                String str = j;
                int i12 = readInt6;
                String str2 = i8;
                cVar.mo21450i(readInt2, i6, i9, i7, str, str2, b);
                i5 = i11 + 1;
                readInt6 = i12;
                readInt5 = readInt5;
            }
        }
        cVar.mo21445d();
        a.close();
    }

    /* renamed from: c */
    public final void mo21435c(C5610e eVar, int[] iArr, int[] iArr2) throws IOException {
        int i;
        DataInputStream a = mo21433a("patterns.dat");
        int readInt = a.readInt();
        eVar.mo21459e(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            if (iArr == null) {
                i = i2;
            } else {
                i = iArr[i2];
            }
            eVar.mo21455a(i);
            int readInt2 = a.readInt();
            int[] d = eVar.mo21458d(readInt2);
            if (d == null) {
                a.skipBytes(readInt2 * 4);
            } else {
                for (int i3 = 0; i3 < readInt2; i3++) {
                    int readInt3 = a.readInt();
                    if (iArr2 != null) {
                        readInt3 = iArr2[readInt3];
                    }
                    d[i3] = readInt3;
                }
                eVar.mo21457c(d, i, readInt2);
            }
        }
        eVar.mo21456b();
        a.close();
    }

    /* renamed from: d */
    public final void mo21436d(C6469g.C6470a aVar) throws IOException {
        int[] h = mo21439h("service_ids.dat");
        DataInputStream a = mo21433a("services.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            byte readByte = a.readByte();
            int readInt2 = a.readInt();
            int readInt3 = a.readInt();
            int i2 = h[i];
            aVar.f20206d = i2;
            int i3 = aVar.f20203a;
            if (readInt2 <= i3 && i3 <= readInt3 && (readByte & aVar.f20204b) != 0) {
                aVar.f20205c.put(i2, true);
            }
            int readInt4 = a.readInt();
            for (int i4 = 0; i4 < readInt4; i4++) {
                if (aVar.f20203a == a.readInt()) {
                    aVar.f20205c.put(aVar.f20206d, true);
                }
            }
            int readInt5 = a.readInt();
            for (int i5 = 0; i5 < readInt5; i5++) {
                if (aVar.f20203a == a.readInt()) {
                    aVar.f20205c.put(aVar.f20206d, false);
                }
            }
        }
        a.close();
    }

    /* renamed from: e */
    public final void mo21437e(C5614i iVar) throws IOException {
        int[] h = mo21439h("stop_ids.dat");
        DataInputStream a = mo21433a("stops.dat");
        int readInt = a.readInt();
        iVar.mo21472m(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = a.readInt();
            String j = mo21441j(a, a.readInt());
            C5614i iVar2 = iVar;
            iVar2.mo21460a(mo21440i(a), h[i], readInt2, a.readInt(), a.readInt(), a.readInt(), j);
            int readInt3 = a.readInt();
            int readInt4 = a.readInt();
            String[] strArr = new String[readInt4];
            for (int i2 = 0; i2 < readInt4; i2++) {
                strArr[i2] = mo21441j(a, a.readInt());
            }
            iVar.mo21471l(readInt3, strArr);
            int readInt5 = a.readInt();
            iVar.mo21465f();
            for (int i3 = 0; i3 < readInt5; i3++) {
                int readInt6 = a.readInt();
                int readInt7 = a.readInt();
                int readInt8 = a.readInt();
                String[] strArr2 = new String[readInt8];
                for (int i4 = 0; i4 < readInt8; i4++) {
                    strArr2[i4] = mo21441j(a, a.readInt());
                }
                iVar.mo21464e(strArr2, readInt6, readInt7);
            }
            iVar.mo21461b();
            int readInt9 = a.readInt();
            iVar.mo21466g();
            for (int i5 = 0; i5 < readInt9; i5++) {
                C5614i iVar3 = iVar;
                iVar3.mo21467h(mo21441j(a, a.readInt()), a.readInt(), a.readInt(), a.readInt(), a.readInt());
            }
            iVar.mo21462c();
            int readInt10 = a.readInt();
            for (int i6 = 0; i6 < readInt10; i6++) {
                a.readInt();
            }
            int readInt11 = a.readInt();
            for (int i7 = 0; i7 < readInt11; i7++) {
                iVar.mo21470k(mo21440i(a));
                int readInt12 = a.readInt();
                iVar.mo21469j();
                for (int i8 = 0; i8 < readInt12; i8++) {
                    iVar.mo21468i(a.readInt());
                }
            }
            int readInt13 = a.readInt();
            for (int i9 = 0; i9 < readInt13; i9++) {
                a.readInt();
                mo21441j(a, a.readInt());
                a.readInt();
                a.readInt();
                a.readInt();
                mo21441j(a, a.readInt());
                a.readInt();
                mo21441j(a, a.readInt());
                mo21441j(a, a.readInt());
            }
        }
        iVar.mo21463d();
        a.close();
    }

    /* renamed from: g */
    public final void mo21438g(C6467f.C6468a aVar) throws IOException {
        int[] h = mo21439h("line_ids.dat");
        int[] h2 = mo21439h("pattern_ids.dat");
        DataInputStream a = mo21433a("trip_frequencies.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            int i2 = h[a.readInt()];
            int readInt2 = a.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                int readInt3 = a.readInt();
                int readInt4 = a.readInt();
                aVar.f20202c = readInt3;
                if (readInt3 == aVar.f20200a) {
                    aVar.f20201b = new SparseIntArray(readInt4);
                }
                for (int i4 = 0; i4 < readInt4; i4++) {
                    int i5 = h2[a.readInt()];
                    int readInt5 = a.readInt();
                    if (aVar.f20202c == aVar.f20200a) {
                        aVar.f20201b.put(i5, readInt5);
                    }
                }
            }
        }
        a.close();
    }

    /* renamed from: h */
    public final int[] mo21439h(String str) throws IOException {
        DataInputStream a = mo21433a(str);
        int readInt = a.readInt();
        int[] iArr = new int[readInt];
        for (int i = 0; i < readInt; i++) {
            iArr[i] = a.readInt();
        }
        a.close();
        return iArr;
    }

    /* renamed from: i */
    public final String mo21440i(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        if (readInt < 0) {
            return null;
        }
        return mo21441j(dataInputStream, readInt);
    }

    /* renamed from: j */
    public final String mo21441j(DataInputStream dataInputStream, int i) throws IOException {
        char[] cArr = this.f18352b;
        if (i > cArr.length) {
            int max = Math.max(cArr.length * 2, i);
            this.f18352b = new char[max];
            this.f18353c = new byte[(max * 2)];
        }
        dataInputStream.readFully(this.f18353c, 0, i * 2);
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = this.f18353c;
            int i3 = i2 << 1;
            byte b = bArr[i3];
            this.f18352b[i2] = (char) ((bArr[i3 + 1] & 255) | (b << 8));
        }
        return new String(this.f18352b, 0, i);
    }
}
