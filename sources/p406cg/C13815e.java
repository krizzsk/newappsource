package p406cg;

import com.google.android.play.core.assetpacks.C14321t2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p025b6.C1492e;
import p060d6.C4397l;
import p070e4.C4549d;
import p157l6.C5630b;
import p172m9.C5720b;
import p195o6.C5998c;
import p208p6.C6095c;
import p232r4.C6242b;
import p257t3.C6557a;
import p311x6.C7160a;
import p320y3.C7292f;
import p320y3.C7309w;
import p320y3.C7310x;
import p404ce.C13791f;
import p404ce.C13806s;
import p434dd.C16552f0;
import p434dd.C16577s;
import p462eh.C16821b;
import p462eh.C16822c;
import p584jl.C17885a;
import p627lg.C18208g;
import p767rg.C19264d;

/* renamed from: cg.e */
public final class C13815e implements C13821j, C13791f, C6095c, C16552f0, C16577s, C16821b {

    /* renamed from: b */
    public static final /* synthetic */ C13815e f34002b = new C13815e();

    /* renamed from: a */
    public static void m34482a(C4549d dVar, C6242b bVar) {
        boolean z;
        Object obj;
        if (bVar != null) {
            C6242b bVar2 = bVar;
            while (true) {
                if (bVar2 == null) {
                    z = false;
                    break;
                } else if (bVar2 instanceof C7309w) {
                    z = true;
                    break;
                } else {
                    bVar2 = (C6242b) bVar2.f19694c;
                }
            }
            if (!z) {
                while (true) {
                    C6242b bVar3 = (C6242b) bVar.f19694c;
                    if (bVar3 == null) {
                        break;
                    }
                    bVar = bVar3;
                }
                if (((C6557a) dVar).f20372r) {
                    obj = new C7292f();
                } else {
                    obj = new C7310x();
                }
                if (((C6242b) bVar.f19694c) == null) {
                    bVar.f19694c = obj;
                    return;
                }
                throw new IllegalStateException("Next converter has been already set");
            }
            return;
        }
        throw new IllegalArgumentException("cannot process empty chain");
    }

    /* renamed from: b */
    public boolean mo22169b(Object obj, File file, File file2) {
        try {
            if (!((Boolean) C5720b.m14047O(Class.forName("dalvik.system.DexFile"), file.getPath())).booleanValue()) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new LinkedHashSet();
    }

    /* renamed from: h */
    public C4397l mo20049h(C4397l lVar, C1492e eVar) {
        C7160a.C7162b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((C5998c) lVar.get()).f19162b.f19172a.f19174a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = C7160a.f22239a;
        if (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) {
            bVar = null;
        } else {
            bVar = new C7160a.C7162b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        }
        if (bVar != null && bVar.f22242a == 0 && bVar.f22243b == bVar.f22244c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new C5630b(bArr);
    }

    /* renamed from: j */
    public void mo22175j(C16822c cVar) {
        int i;
        boolean z;
        boolean z2;
        String str = cVar.f43783a;
        int i2 = cVar.f43788f;
        int length = str.length();
        boolean z3 = true;
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (true) {
                if (charAt < '0' || charAt > '9') {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 || i2 >= length) {
                    break;
                }
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = cVar.f43783a.charAt(cVar.f43788f);
            char charAt3 = cVar.f43783a.charAt(cVar.f43788f + 1);
            if (charAt2 < '0' || charAt2 > '9') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (charAt3 < '0' || charAt3 > '9') {
                    z3 = false;
                }
                if (z3) {
                    cVar.mo49496e((char) C16530d.m42011d(charAt3, -48, (charAt2 - '0') * 10, 130));
                    cVar.f43788f += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
        }
        char b = cVar.mo49493b();
        int z4 = C5720b.m14075z(cVar.f43783a, cVar.f43788f, 0);
        if (z4 != 0) {
            if (z4 == 1) {
                cVar.mo49496e(230);
                cVar.f43789g = 1;
            } else if (z4 == 2) {
                cVar.mo49496e(239);
                cVar.f43789g = 2;
            } else if (z4 == 3) {
                cVar.mo49496e(238);
                cVar.f43789g = 3;
            } else if (z4 == 4) {
                cVar.mo49496e(240);
                cVar.f43789g = 4;
            } else if (z4 == 5) {
                cVar.mo49496e(231);
                cVar.f43789g = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(z4)));
            }
        } else if (C5720b.m14070u(b)) {
            cVar.mo49496e(235);
            cVar.mo49496e((char) ((b - 128) + 1));
            cVar.f43788f++;
        } else {
            cVar.mo49496e((char) (b + 1));
            cVar.f43788f++;
        }
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C19264d((C18208g) sVar.mo314b(C18208g.class));
    }

    public /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C14321t2.f36057b);
        C17885a.m44409K0(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
