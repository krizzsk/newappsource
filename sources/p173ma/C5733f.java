package p173ma;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p186na.C5884a;
import p199oa.C6016b;
import p212pa.C6107a;
import p225qa.C6218a;
import p238ra.C6279d;
import p251sa.C6496d;
import p264ta.C6629e;
import p264ta.C6634h;
import p276ua.C6763c;
import p289va.C6886a;
import p289va.C6891c;
import p289va.C6892c0;
import p289va.C6901e;
import p289va.C6927w;
import p302wa.C7004a;
import p389bl.C13641g;

/* renamed from: ma.f */
public final class C5733f implements C5739k {

    /* renamed from: b */
    public static final int[] f18595b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c */
    public static final Constructor<? extends C5735h> f18596c;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C5735h.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f18596c = constructor;
    }

    /* renamed from: a */
    public static void m14109a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C6886a());
                return;
            case 1:
                arrayList.add(new C6891c());
                return;
            case 2:
                arrayList.add(new C6901e());
                return;
            case 3:
                arrayList.add(new C5884a());
                return;
            case 4:
                Constructor<? extends C5735h> constructor = f18596c;
                if (constructor != null) {
                    try {
                        arrayList.add((C5735h) constructor.newInstance(new Object[]{0}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                } else {
                    arrayList.add(new C6016b());
                    return;
                }
            case 5:
                arrayList.add(new C6107a());
                return;
            case 6:
                arrayList.add(new C6279d());
                return;
            case 7:
                arrayList.add(new C6496d(0));
                return;
            case 8:
                arrayList.add(new C6629e());
                arrayList.add(new C6634h(0));
                return;
            case 9:
                arrayList.add(new C6763c());
                return;
            case 10:
                arrayList.add(new C6927w());
                return;
            case 11:
                arrayList.add(new C6892c0());
                return;
            case 12:
                arrayList.add(new C7004a());
                return;
            case 14:
                arrayList.add(new C6218a());
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final synchronized C5735h[] mo252b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int s = C13641g.m34130s(map);
        if (s != -1) {
            m14109a(s, arrayList);
        }
        int t = C13641g.m34131t(uri);
        if (!(t == -1 || t == s)) {
            m14109a(t, arrayList);
        }
        int[] iArr = f18595b;
        for (int i = 0; i < 14; i++) {
            int i2 = iArr[i];
            if (!(i2 == s || i2 == t)) {
                m14109a(i2, arrayList);
            }
        }
        return (C5735h[]) arrayList.toArray(new C5735h[arrayList.size()]);
    }
}
