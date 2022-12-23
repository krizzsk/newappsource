package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C2846m;
import com.fyber.inneractive.sdk.model.vast.C2847n;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.d */
public class C2801d implements Comparator<C2846m> {

    /* renamed from: a */
    public int f9672a;

    /* renamed from: b */
    public int f9673b;

    /* renamed from: c */
    public int f9674c;

    public C2801d(int i, int i2, int i3) {
        this.f9672a = i;
        this.f9673b = i2;
        this.f9674c = i3;
    }

    /* renamed from: a */
    public final Integer mo13591a(String str) {
        C2847n nVar;
        HashMap hashMap = (HashMap) C2847n.f9799f;
        if (hashMap.containsKey(str)) {
            nVar = (C2847n) hashMap.get(str);
        } else {
            nVar = C2847n.UNKNOWN;
        }
        if (nVar == C2847n.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (nVar == C2847n.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (nVar == C2847n.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C2846m mVar = (C2846m) obj;
        C2846m mVar2 = (C2846m) obj2;
        if (!TextUtils.equals("VPAID", mVar2.f9793f)) {
            if (!TextUtils.equals("VPAID", mVar.f9793f)) {
                Integer num = mVar.f9792e;
                if (num == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                Integer num2 = mVar2.f9792e;
                if (num2 == null) {
                    i2 = 0;
                } else {
                    i2 = num2.intValue();
                }
                int i7 = this.f9672a;
                if (i2 <= i7 || i > i7) {
                    if (i <= i7 || i2 > i7) {
                        int compareTo = mo13591a(mVar2.f9791d).compareTo(mo13591a(mVar.f9791d));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (i >= i2) {
                            if (i <= i2) {
                                Integer num3 = mVar.f9789b;
                                if (num3 == null) {
                                    i3 = 0;
                                } else {
                                    i3 = num3.intValue();
                                }
                                Integer num4 = mVar.f9790c;
                                if (num4 == null) {
                                    i4 = 0;
                                } else {
                                    i4 = num4.intValue();
                                }
                                Integer num5 = mVar2.f9789b;
                                if (num5 == null) {
                                    i5 = 0;
                                } else {
                                    i5 = num5.intValue();
                                }
                                Integer num6 = mVar2.f9790c;
                                if (num6 == null) {
                                    i6 = 0;
                                } else {
                                    i6 = num6.intValue();
                                }
                                int i8 = i3 * i4;
                                int i9 = i5 * i6;
                                int i11 = this.f9673b * this.f9674c;
                                int abs = Math.abs(i8 - i11);
                                int abs2 = Math.abs(i9 - i11);
                                if (abs >= abs2) {
                                    if (abs > abs2) {
                                        return 1;
                                    }
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
