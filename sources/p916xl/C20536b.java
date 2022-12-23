package p916xl;

import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.util.Collections;
import java.util.List;
import p001a0.C0017h;
import p390bm.C13643a;
import p411cm.C13843a;
import p411cm.C13849f;
import p468en.C16842b;
import p583jk.C17873f;
import p725pj.C18926a;
import p846un.C19960b;
import p913xi.C20531d;
import p941yn.C20746a;

/* renamed from: xl.b */
public final class C20536b {

    /* renamed from: a */
    public C20746a f51928a;

    /* renamed from: b */
    public C13843a f51929b;

    /* renamed from: c */
    public C13643a f51930c;

    /* renamed from: d */
    public C16842b f51931d;

    /* renamed from: e */
    public C20531d f51932e;

    /* renamed from: f */
    public C13849f.C13850a f51933f;

    /* renamed from: g */
    public C17873f f51934g;

    /* renamed from: h */
    public C19960b f51935h;

    /* renamed from: i */
    public final String f51936i;

    /* renamed from: j */
    public final String f51937j;

    /* renamed from: k */
    public final String f51938k;

    public C20536b(String str, String str2, String str3, String str4) {
        this.f51936i = C0017h.m56M(UrlPrivacyValidator.HTTPS_SCHEME, str, "/edge/v1/", str2, "/logging/error");
        this.f51937j = str3;
        this.f51938k = str4;
    }

    /* renamed from: a */
    public final void mo52737a(C18926a aVar) {
        boolean z;
        List singletonList = Collections.singletonList(aVar);
        C20746a aVar2 = this.f51928a;
        if (aVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar2.mo40391b(new C20535a(this, singletonList));
        }
    }

    /* renamed from: b */
    public final void mo52738b(Exception exc) {
        boolean z;
        if (this.f51928a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f51934g.getClass();
            mo52737a(C17873f.m44275b(exc));
        }
    }
}
