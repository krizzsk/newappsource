package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2840g;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.b */
public class C2798b implements Comparator<C2836c> {

    /* renamed from: a */
    public int f9659a;

    /* renamed from: b */
    public int f9660b;

    public C2798b(int i, int i2) {
        this.f9659a = i;
        this.f9660b = i2;
    }

    /* renamed from: a */
    public Integer mo13588a(C2836c cVar) {
        C2840g gVar = cVar.f9746a;
        if (gVar == C2840g.Html) {
            return 3;
        }
        if (gVar == C2840g.Iframe) {
            return 2;
        }
        if (gVar == C2840g.Static) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        C2836c cVar = (C2836c) obj;
        C2836c cVar2 = (C2836c) obj2;
        int i = cVar.f9748c * cVar.f9749d;
        int i2 = cVar2.f9748c * cVar2.f9749d;
        int i3 = this.f9659a * this.f9660b;
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i3);
        if (abs >= abs2) {
            if (abs <= abs2) {
                float floatValue = Float.valueOf((float) this.f9659a).floatValue() / Float.valueOf((float) this.f9660b).floatValue();
                float abs3 = Math.abs(floatValue - (Float.valueOf((float) cVar.f9748c).floatValue() / Float.valueOf((float) cVar.f9749d).floatValue()));
                float abs4 = Math.abs(floatValue - (Float.valueOf((float) cVar2.f9748c).floatValue() / Float.valueOf((float) cVar2.f9749d).floatValue()));
                if (abs3 >= abs4) {
                    if (abs3 <= abs4) {
                        int compareTo = mo13588a(cVar2).compareTo(mo13588a(cVar));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
