package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e */
public final class C3185e implements C3210v.C3213c {

    /* renamed from: a */
    public final int f11324a;

    /* renamed from: b */
    public final List<C3226i> f11325b;

    public C3185e(int i, List<C3226i> list) {
        this.f11324a = i;
        if (!mo14252a(32) && list.isEmpty()) {
            list = Collections.singletonList(C3226i.m8180a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (C3059a) null));
        }
        this.f11325b = list;
    }

    /* renamed from: a */
    public SparseArray<C3210v> mo14249a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public C3210v mo14251a(int i, C3210v.C3212b bVar) {
        if (i == 2) {
            return new C3200o(new C3189i());
        }
        if (i == 3 || i == 4) {
            return new C3200o(new C3198m(bVar.f11519a));
        }
        if (i != 15) {
            if (i == 21) {
                return new C3200o(new C3197l());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C3200o(new C3195k(mo14250a(bVar)));
                }
                if (i == 89) {
                    return new C3200o(new C3187g(bVar.f11520b));
                }
                if (i != 138) {
                    if (i != 129) {
                        if (i != 130) {
                            if (i != 134) {
                                if (i != 135) {
                                    return null;
                                }
                            } else if (mo14252a(16)) {
                                return null;
                            } else {
                                return new C3204r(new C3206t());
                            }
                        }
                    }
                    return new C3200o(new C3182b(bVar.f11519a));
                }
                return new C3200o(new C3186f(bVar.f11519a));
            } else if (mo14252a(4)) {
                return null;
            } else {
                return new C3200o(new C3191j(mo14250a(bVar), mo14252a(1), mo14252a(8)));
            }
        } else if (mo14252a(2)) {
            return null;
        } else {
            return new C3200o(new C3184d(false, bVar.f11519a));
        }
    }

    /* renamed from: a */
    public final C3205s mo14250a(C3210v.C3212b bVar) {
        byte b;
        String str;
        if (mo14252a(32)) {
            return new C3205s(this.f11325b);
        }
        byte[] bArr = bVar.f11521c;
        int length = bArr.length;
        int i = 0;
        List<C3226i> list = this.f11325b;
        while (length - i > 0) {
            int i2 = i + 1;
            byte b2 = bArr[i] & 255;
            int i3 = i2 + 1;
            int i4 = (bArr[i2] & 255) + i3;
            boolean z = true;
            ArrayList arrayList = list;
            if (b2 == 134) {
                ArrayList arrayList2 = new ArrayList();
                int i5 = i3 + 1;
                byte b3 = bArr[i3] & 255 & 31;
                for (int i6 = 0; i6 < b3; i6++) {
                    String str2 = new String(bArr, i5, 3, Charset.defaultCharset());
                    int i7 = i5 + 3;
                    int i8 = i7 + 1;
                    byte b4 = bArr[i7] & 255;
                    if ((b4 & 128) != 0) {
                        b = b4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        b = 1;
                    }
                    arrayList2.add(C3226i.m8179a((String) null, str, (String) null, -1, 0, str2, b, (C3059a) null, Long.MAX_VALUE, Collections.emptyList()));
                    i5 = i8 + 2;
                    C3380a.m8505a(i5 >= 0 && i5 <= length);
                }
                arrayList = arrayList2;
            }
            if (i4 < 0 || i4 > length) {
                z = false;
            }
            C3380a.m8505a(z);
            i = i4;
            list = arrayList;
        }
        return new C3205s(list);
    }

    /* renamed from: a */
    public final boolean mo14252a(int i) {
        return (i & this.f11324a) != 0;
    }
}
