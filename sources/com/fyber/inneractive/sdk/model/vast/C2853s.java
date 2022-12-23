package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C3745x0;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.s */
public class C2853s extends C2838e {

    /* renamed from: e */
    public String f9830e;

    /* renamed from: c */
    public static C2853s m7077c(Node node) {
        C2853s sVar = new C2853s();
        super.mo13641b(node);
        sVar.f9830e = C3745x0.m10011a(C3745x0.m10014d(node, "VASTAdTagURI"));
        return sVar;
    }
}
