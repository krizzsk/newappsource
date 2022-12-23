package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C3745x0;
import org.w3c.dom.Node;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.model.vast.p */
public class C2849p {

    /* renamed from: a */
    public String f9804a;

    /* renamed from: b */
    public String f9805b;

    /* renamed from: a */
    public static C2849p m7072a(Node node) {
        if (node == null) {
            return null;
        }
        C2849p pVar = new C2849p();
        pVar.f9804a = C3745x0.m10012b(node, "event");
        pVar.f9805b = C3745x0.m10011a(node);
        return pVar;
    }

    public String toString() {
        StringBuilder n = C13437d.m33708n("VTracking: ", " name:");
        n.append(this.f9804a);
        n.append(" url:");
        n.append(this.f9805b);
        return n.toString();
    }
}
