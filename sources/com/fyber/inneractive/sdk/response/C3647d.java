package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.flow.vast.C2796a;
import com.fyber.inneractive.sdk.flow.vast.C2799c;
import com.fyber.inneractive.sdk.flow.vast.C2802e;
import com.fyber.inneractive.sdk.measurement.C2825i;
import com.fyber.inneractive.sdk.model.vast.C2837d;
import com.fyber.inneractive.sdk.model.vast.C2839f;
import com.fyber.inneractive.sdk.model.vast.C2846m;
import com.fyber.inneractive.sdk.model.vast.C2848o;
import com.fyber.inneractive.sdk.model.vast.C2851r;
import com.fyber.inneractive.sdk.model.vast.C2853s;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.response.d */
public class C3647d extends C3645b {

    /* renamed from: e */
    public C3650g f12736e;

    /* renamed from: f */
    public C2702y f12737f;

    /* renamed from: g */
    public C2837d f12738g;

    /* renamed from: h */
    public List<C2837d> f12739h = new ArrayList();

    /* renamed from: i */
    public int f12740i;

    /* renamed from: j */
    public C2851r f12741j;

    /* renamed from: a */
    public C3648e mo13323a() {
        C3650g gVar = new C3650g();
        this.f12732a = gVar;
        this.f12736e = gVar;
        return gVar;
    }

    /* renamed from: b */
    public void mo15292b(String str) throws C2802e, Exception {
        C2848o oVar;
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    oVar = C2848o.m7071a(firstChild);
                } else {
                    IAlog.m9902a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                oVar = null;
            }
            try {
                if (this.f12741j == null) {
                    this.f12741j = new C2851r(oVar.f9802a);
                } else {
                    C2851r rVar = new C2851r(oVar.f9802a);
                    if (rVar.compareTo(this.f12741j) >= 0) {
                        this.f12741j = rVar;
                    }
                }
            } catch (C2851r.C2852a unused) {
            }
            List<C2837d> list = oVar.f9803b;
            if (list == null || list.size() == 0) {
                IAlog.m9902a("Vast response parser: no ads found in model. aborting", new Object[0]);
                throw new C2802e("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
            }
            C2837d dVar = list.get(0);
            C2853s sVar = dVar.f9755b;
            if (sVar != null) {
                IAlog.m9902a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f12739h.size()));
                int size = this.f12739h.size();
                int i = this.f12740i;
                if (size < i) {
                    this.f12739h.add(dVar);
                    String str2 = sVar.f9830e;
                    if (TextUtils.isEmpty(str2)) {
                        IAlog.m9902a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new C2802e("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    } else if (C3677d0.m9925f(str2)) {
                        String a = C3725r.m9981a(str2, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, 5);
                        if (!TextUtils.isEmpty(a)) {
                            this.f12736e.f12775G.put(str2, a);
                            mo15292b(a);
                            return;
                        }
                        throw new C2802e("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                    } else {
                        IAlog.m9902a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                        throw new C2802e("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                    }
                } else {
                    IAlog.m9902a("Vast response parser: too many vast wrappers! Only %dallowed. stopping", Integer.valueOf(i));
                    throw new C2802e("VastErrorTooManyWrappers", C13437d.m33707l(C13555b.m33972k("More than "), this.f12740i, " found"));
                }
            } else if (dVar.f9756c != null) {
                this.f12738g = dVar;
            } else {
                throw new C2802e("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
        } catch (Exception e) {
            IAlog.m9902a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new C2802e("VastErrorInvalidFile", e.getMessage());
        }
    }

    /* renamed from: b */
    public boolean mo13325b() {
        return true;
    }

    /* renamed from: a */
    public void mo13324a(String str, C2702y yVar) throws Exception {
        this.f12737f = yVar;
        if (yVar == null || yVar.f9427f == null) {
            this.f12732a.f12751i = "ErrorConfigurationMismatch";
            return;
        }
        this.f12736e.f12770B = System.currentTimeMillis();
        this.f12740i = IAConfigManager.f9202J.f9221i.f9360c;
        this.f12736e.getClass();
        try {
            mo15292b(str);
            mo15291a(this.f12738g, this.f12739h);
        } catch (InterruptedException e) {
            throw e;
        } catch (C2802e e2) {
            this.f12736e.f12751i = e2.getMessage();
            this.f12736e.f12752j = e2.getCause().getMessage();
        } catch (Exception e3) {
            this.f12736e.f12752j = String.format("%s", new Object[]{e3.getMessage()});
            C3650g gVar = this.f12736e;
            gVar.f12751i = "VastErrorInvalidFile";
            gVar.f12766x = e3;
            if (IAlog.f12814a == 2) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo15291a(C2837d dVar, List<C2837d> list) throws C2802e {
        C2796a aVar = new C2796a();
        int intValue = this.f12737f.f9427f.f9249c.intValue();
        int intValue2 = this.f12737f.f9427f.f9248b.intValue();
        int intValue3 = this.f12737f.f9427f.f9253g.intValue();
        aVar.f9649a = intValue;
        aVar.f9650b = intValue2;
        aVar.f9651c = intValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f12737f.f9427f.f9256j)) {
            aVar.f9652d = true;
        }
        if (this.f12737f.f9427f.f9257k.contains(2)) {
            aVar.f9653e = true;
        }
        try {
            C2851r rVar = this.f12741j;
            this.f12736e.f12771C = aVar.mo13582a(dVar, list, rVar != null ? rVar.f9829b : "");
        } catch (C2802e e) {
            C3650g gVar = this.f12736e;
            gVar.getClass();
            gVar.f12751i = e.getMessage();
        }
        C3650g gVar2 = this.f12736e;
        Map<C2846m, C2799c> map = aVar.f9654f;
        gVar2.getClass();
        if (map != null) {
            gVar2.f12772D.putAll(map);
        }
        C3650g gVar3 = this.f12736e;
        List<C2839f> list2 = aVar.f9655g;
        gVar3.getClass();
        if (list2 != null) {
            gVar3.f12773E.addAll(list2);
        }
        C3650g gVar4 = this.f12736e;
        List<C2825i> list3 = aVar.f9657i;
        gVar4.getClass();
        if (list3 != null) {
            gVar4.f12774F.addAll(list3);
        }
        if (IAlog.f12814a == 2) {
            Map<C2846m, C2799c> map2 = aVar.f9654f;
            if (map2.size() > 0) {
                IAlog.m9905d(" VParser: Unsupported media files:", new Object[0]);
                for (C2846m next : map2.keySet()) {
                    IAlog.m9905d("VParser: %s", next);
                    IAlog.m9905d("VParser: reason = %s", map2.get(next));
                }
                return;
            }
            IAlog.m9905d("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
