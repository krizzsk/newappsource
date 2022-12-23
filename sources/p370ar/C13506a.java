package p370ar;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import com.google.android.play.core.assetpacks.C14325u2;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mf0.C24361g;
import mf0.C24368m;
import n00.C18501g;
import p221q6.C6181b;
import p221q6.C6197n;
import p389bl.C13637c;
import p434dd.C16552f0;
import p434dd.C16571p;
import p584jl.C17885a;
import p626lf.C18201b;
import zj0.C25539d;

/* renamed from: ar.a */
public final class C13506a implements C6197n, C16552f0, C16571p, zzef, C18501g, C25539d {

    /* renamed from: c */
    public static final C13506a f33421c = new C13506a(0);

    /* renamed from: b */
    public int f33422b;

    public /* synthetic */ C13506a(int i) {
        this.f33422b = i;
    }

    /* renamed from: a */
    public int mo21181a(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            byte b = bArr[i4];
            if ((b & 252) == 72) {
                int i5 = i4 + 3;
                byte b2 = bArr[i5];
                if ((b2 & 3) == 1) {
                    int i6 = i4 + 1;
                    int i7 = i4 + 2;
                    int i8 = (((((b & 3) << 24) | ((bArr[i6] & 255) << 16)) | ((bArr[i7] & 255) << 8)) | (b2 & 252)) - ((this.f33422b + i4) - i);
                    bArr[i4] = (byte) (72 | ((i8 >>> 24) & 3));
                    bArr[i6] = (byte) (i8 >>> 16);
                    bArr[i7] = (byte) (i8 >>> 8);
                    bArr[i5] = (byte) (i8 | (bArr[i5] & 3));
                }
            }
            i4 += 4;
        }
        int i9 = i4 - i;
        this.f33422b += i9;
        return i9;
    }

    /* renamed from: e */
    public boolean mo22170e(ClassLoader classLoader, File file, File file2, boolean z) {
        switch (this.f33422b) {
            case 2:
                return C24368m.m61238o(classLoader, file, file2, z, new C18201b(), "zip", new C6181b());
            default:
                return C24368m.m61238o(classLoader, file, file2, z, new C24361g(), "path", new C24368m());
        }
    }

    /* renamed from: f */
    public void mo22171f(ClassLoader classLoader, HashSet hashSet) {
        switch (this.f33422b) {
            case 2:
                C24368m.m61237m(classLoader, hashSet);
                return;
            default:
                C13637c.m34062S(classLoader, hashSet, new C18201b());
                return;
        }
    }

    public /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C14325u2.f36074b);
        C17885a.m44409K0(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
