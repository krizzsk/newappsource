package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C3745x0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import p001a0.C0016g;

/* renamed from: com.fyber.inneractive.sdk.model.vast.o */
public class C2848o {

    /* renamed from: a */
    public String f9802a;

    /* renamed from: b */
    public List<C2837d> f9803b;

    /* renamed from: a */
    public static C2848o m7071a(Node node) {
        C2837d dVar;
        C2848o oVar = new C2848o();
        oVar.f9802a = C3745x0.m10012b(node, MediationMetaData.KEY_VERSION);
        ArrayList arrayList = (ArrayList) C3745x0.m10013c(node, "Ad");
        if (!arrayList.isEmpty()) {
            oVar.f9803b = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    dVar = null;
                } else {
                    C2837d dVar2 = new C2837d();
                    dVar2.f9754a = C3745x0.m10012b(node2, "id");
                    Node d = C3745x0.m10014d(node2, "Wrapper");
                    if (d != null) {
                        dVar2.f9755b = C2853s.m7077c(d);
                    }
                    Node d2 = C3745x0.m10014d(node2, "InLine");
                    if (d2 != null) {
                        dVar2.f9756c = C2844k.m7069c(d2);
                    }
                    dVar = dVar2;
                }
                oVar.f9803b.add(dVar);
            }
        }
        return oVar;
    }

    public String toString() {
        return new StringBuilder(C0016g.m31o(C13555b.m33972k("Vast: version - "), this.f9802a, "\nAds: ")).toString();
    }
}
