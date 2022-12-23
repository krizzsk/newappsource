package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C3727s;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.model.vast.r */
public class C2851r implements Comparable<C2851r> {

    /* renamed from: a */
    public Integer[] f9828a = new Integer[0];

    /* renamed from: b */
    public final String f9829b;

    /* renamed from: com.fyber.inneractive.sdk.model.vast.r$a */
    public static class C2852a extends Exception {
    }

    public C2851r(String str) throws C2852a {
        mo13649b(str);
        mo13648a(str);
        this.f9829b = str;
    }

    /* renamed from: a */
    public final void mo13648a(String str) throws C2852a {
        ArrayList arrayList = new ArrayList();
        for (String a : str.split("\\.")) {
            arrayList.add(Integer.valueOf(C3727s.m9986a(a, 0)));
        }
        this.f9828a = (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    /* renamed from: b */
    public final void mo13649b(String str) throws C2852a {
        if (TextUtils.isEmpty(str) || !str.matches("^[0-9.]+$")) {
            throw new C2852a();
        }
    }

    public String toString() {
        return this.f9829b;
    }

    /* renamed from: a */
    public int compareTo(C2851r rVar) {
        if (rVar == null) {
            return 1;
        }
        int max = Math.max(this.f9828a.length, rVar.f9828a.length);
        int i = 0;
        while (i < max) {
            Integer[] numArr = this.f9828a;
            int intValue = numArr.length > i ? numArr[i].intValue() : 0;
            Integer[] numArr2 = rVar.f9828a;
            int intValue2 = numArr2.length > i ? numArr2[i].intValue() : 0;
            if (intValue > intValue2) {
                return 1;
            }
            if (intValue2 > intValue) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}
