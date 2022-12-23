package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.measurement.C2825i;
import com.fyber.inneractive.sdk.util.C3745x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.metadata.MediationMetaData;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.e */
public class C2838e {

    /* renamed from: a */
    public String f9757a;

    /* renamed from: b */
    public List<String> f9758b = new ArrayList();

    /* renamed from: c */
    public List<C2843j> f9759c = new ArrayList();

    /* renamed from: d */
    public List<C2825i> f9760d = new ArrayList();

    /* renamed from: a */
    public final void mo13640a(Node node) {
        C2825i iVar;
        Node d = C3745x0.m10014d(node, "AdVerifications");
        if (d != null) {
            Iterator it = ((ArrayList) C3745x0.m10013c(d, "Verification")).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    iVar = null;
                } else {
                    C2825i iVar2 = new C2825i();
                    iVar2.f9702e = C3745x0.m10012b(node2, "vendor");
                    Node d2 = C3745x0.m10014d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        iVar2.f9704g = true;
                        try {
                            iVar2.f9703f = C3745x0.m10011a(d2);
                            iVar2.f9699b = C3745x0.m10012b(d2, "apiFramework");
                            iVar2.f9698a = new URL(iVar2.f9703f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = C3745x0.m10014d(node2, "TrackingEvents");
                    if (d3 != null) {
                        Iterator it2 = ((ArrayList) C3745x0.m10013c(d3, "Tracking")).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            C2849p a = C2849p.m7072a(node3);
                            if (node3 != null && a.f9804a.equalsIgnoreCase("verificationNotExecuted")) {
                                iVar2.mo13615a(C2850q.EVENT_VERIFICATION_NOT_EXECUTED, a.f9805b);
                            }
                        }
                    }
                    Node d4 = C3745x0.m10014d(node2, "VerificationParameters");
                    if (d4 != null) {
                        iVar2.f9701d = C3745x0.m10011a(d4);
                    }
                    iVar = iVar2;
                }
                if (iVar != null) {
                    IAlog.m9902a("Verification Found - %s", iVar.toString());
                    this.f9760d.add(iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo13641b(Node node) {
        Iterator it;
        C2843j jVar;
        C2839f fVar;
        Iterator it2;
        Iterator it3;
        C2846m mVar;
        Node node2 = node;
        if (node2 != null) {
            Node d = C3745x0.m10014d(node2, "AdSystem");
            if (d != null) {
                C3745x0.m10012b(d, MediationMetaData.KEY_VERSION);
                C3745x0.m10011a(d);
            }
            Node d2 = C3745x0.m10014d(node2, "Error");
            if (d2 != null) {
                String a = C3745x0.m10011a(d2);
                if (!TextUtils.isEmpty(a)) {
                    this.f9757a = a;
                }
            }
            Iterator it4 = ((ArrayList) C3745x0.m10013c(node2, "Impression")).iterator();
            while (it4.hasNext()) {
                String a2 = C3745x0.m10011a((Node) it4.next());
                if (!TextUtils.isEmpty(a2)) {
                    this.f9758b.add(a2);
                }
            }
            Node d3 = C3745x0.m10014d(node2, "Creatives");
            if (d3 != null) {
                Iterator it5 = ((ArrayList) C3745x0.m10013c(d3, "Creative")).iterator();
                while (it5.hasNext()) {
                    Node node3 = (Node) it5.next();
                    if (node3 == null) {
                        it = it5;
                        jVar = null;
                    } else {
                        C2843j jVar2 = new C2843j();
                        C3745x0.m10012b(node3, "AdID");
                        C3745x0.m10012b(node3, "id");
                        C3745x0.m10010a(node3, "sequence");
                        Node d4 = C3745x0.m10014d(node3, "Linear");
                        if (d4 != null) {
                            C2845l lVar = new C2845l();
                            Node d5 = C3745x0.m10014d(d4, "MediaFiles");
                            if (d5 != null) {
                                ArrayList arrayList = (ArrayList) C3745x0.m10013c(d5, "MediaFile");
                                if (!arrayList.isEmpty()) {
                                    lVar.f9783a = new ArrayList();
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        Node node4 = (Node) it6.next();
                                        if (node4 == null) {
                                            it3 = it5;
                                            it2 = it6;
                                            mVar = null;
                                        } else {
                                            it3 = it5;
                                            mVar = new C2846m();
                                            it2 = it6;
                                            mVar.f9788a = C3745x0.m10012b(node4, "delivery");
                                            mVar.f9789b = C3745x0.m10010a(node4, "width");
                                            mVar.f9790c = C3745x0.m10010a(node4, "height");
                                            mVar.f9791d = C3745x0.m10012b(node4, "type");
                                            C3745x0.m10012b(node4, "id");
                                            mVar.f9793f = C3745x0.m10012b(node4, "apiFramework");
                                            mVar.f9792e = C3745x0.m10010a(node4, "bitrate");
                                            String b = C3745x0.m10012b(node4, "maintainAspectRatio");
                                            if (!TextUtils.isEmpty(b)) {
                                                try {
                                                    Boolean.valueOf(b);
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                            String b2 = C3745x0.m10012b(node4, "scalable");
                                            if (!TextUtils.isEmpty(b2)) {
                                                try {
                                                    Boolean.valueOf(b2);
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            mVar.f9794g = C3745x0.m10011a(node4);
                                        }
                                        if (mVar != null) {
                                            lVar.f9783a.add(mVar);
                                        }
                                        it5 = it3;
                                        it6 = it2;
                                    }
                                }
                            }
                            it = it5;
                            Node d6 = C3745x0.m10014d(d4, "VideoClicks");
                            if (d6 != null) {
                                lVar.f9785c = C3745x0.m10011a(C3745x0.m10014d(d6, "ClickThrough"));
                                ArrayList arrayList2 = (ArrayList) C3745x0.m10013c(d6, "ClickTracking");
                                if (!arrayList2.isEmpty()) {
                                    lVar.f9786d = new ArrayList();
                                    Iterator it7 = arrayList2.iterator();
                                    while (it7.hasNext()) {
                                        String a3 = C3745x0.m10011a((Node) it7.next());
                                        if (!TextUtils.isEmpty(a3)) {
                                            lVar.f9786d.add(a3);
                                        }
                                    }
                                }
                            }
                            Node d7 = C3745x0.m10014d(d4, "TrackingEvents");
                            if (d7 != null) {
                                ArrayList arrayList3 = (ArrayList) C3745x0.m10013c(d7, "Tracking");
                                if (!arrayList3.isEmpty()) {
                                    lVar.f9784b = new ArrayList();
                                    Iterator it8 = arrayList3.iterator();
                                    while (it8.hasNext()) {
                                        C2849p a4 = C2849p.m7072a((Node) it8.next());
                                        if (a4 != null) {
                                            lVar.f9784b.add(a4);
                                        }
                                    }
                                }
                            }
                            Node d8 = C3745x0.m10014d(d4, "Duration");
                            if (d8 != null) {
                                lVar.f9787e = C3745x0.m10011a(d8);
                            }
                            jVar2.f9781a = lVar;
                        } else {
                            it = it5;
                        }
                        Node d9 = C3745x0.m10014d(node3, "CompanionAds");
                        if (d9 != null) {
                            List<Node> c = C3745x0.m10013c(d9, "Companion");
                            jVar2.f9782b = new ArrayList();
                            Iterator it9 = ((ArrayList) c).iterator();
                            while (it9.hasNext()) {
                                Node node5 = (Node) it9.next();
                                if (node5 == null) {
                                    fVar = null;
                                } else {
                                    fVar = new C2839f();
                                    fVar.f9761a = C3745x0.m10010a(node5, "width");
                                    fVar.f9762b = C3745x0.m10010a(node5, "height");
                                    fVar.f9763c = C3745x0.m10012b(node5, "id");
                                    C3745x0.m10012b(node5, "apiFramework");
                                    C3745x0.m10010a(node5, "expandedWidth");
                                    C3745x0.m10010a(node5, "expandedHeight");
                                    Node d11 = C3745x0.m10014d(node5, "StaticResource");
                                    if (d11 != null) {
                                        C2842i iVar = new C2842i();
                                        iVar.f9779a = C3745x0.m10012b(d11, "creativeType");
                                        iVar.f9780b = C3745x0.m10011a(d11);
                                        fVar.f9764d = iVar;
                                    }
                                    Node d12 = C3745x0.m10014d(node5, "HTMLResource");
                                    if (d12 != null) {
                                        fVar.f9766f = C3745x0.m10011a(d12);
                                    }
                                    Node d13 = C3745x0.m10014d(node5, "IFrameResource");
                                    if (d13 != null) {
                                        fVar.f9765e = C3745x0.m10011a(d13);
                                    }
                                    Node d14 = C3745x0.m10014d(node5, "CompanionClickThrough");
                                    if (d14 != null) {
                                        fVar.f9767g = C3745x0.m10011a(d14);
                                    }
                                    ArrayList arrayList4 = (ArrayList) C3745x0.m10013c(node5, "CompanionClickTracking");
                                    if (arrayList4.size() > 0) {
                                        fVar.f9768h = new ArrayList();
                                        Iterator it10 = arrayList4.iterator();
                                        while (it10.hasNext()) {
                                            String a5 = C3745x0.m10011a((Node) it10.next());
                                            if (!TextUtils.isEmpty(a5)) {
                                                fVar.f9768h.add(a5);
                                            }
                                        }
                                    }
                                    Node d15 = C3745x0.m10014d(node5, "TrackingEvents");
                                    if (d15 != null) {
                                        ArrayList arrayList5 = (ArrayList) C3745x0.m10013c(d15, "Tracking");
                                        if (!arrayList5.isEmpty()) {
                                            fVar.f9770j = new ArrayList();
                                            Iterator it11 = arrayList5.iterator();
                                            while (it11.hasNext()) {
                                                C2849p a6 = C2849p.m7072a((Node) it11.next());
                                                if (a6 != null) {
                                                    fVar.f9770j.add(a6);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (fVar != null) {
                                    jVar2.f9782b.add(fVar);
                                }
                            }
                        }
                        jVar = jVar2;
                    }
                    if (jVar != null) {
                        this.f9759c.add(jVar);
                    }
                    it5 = it;
                }
            }
            Node d16 = C3745x0.m10014d(node2, "Extensions");
            if (d16 != null) {
                Iterator it12 = ((ArrayList) C3745x0.m10013c(d16, "Extension")).iterator();
                while (it12.hasNext()) {
                    Node node6 = (Node) it12.next();
                    if ("AdVerifications".equalsIgnoreCase(C3745x0.m10012b(node6, "type"))) {
                        mo13640a(node6);
                    }
                }
            }
            mo13640a(node);
        }
    }
}
