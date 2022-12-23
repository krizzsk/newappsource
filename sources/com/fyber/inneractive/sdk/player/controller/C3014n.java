package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.mraid.C2859a0;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3764d;

/* renamed from: com.fyber.inneractive.sdk.player.controller.n */
public class C3014n extends C3764d.C3775k {

    /* renamed from: a */
    public final /* synthetic */ C3009k f10314a;

    public C3014n(C3009k kVar) {
        this.f10314a = kVar;
    }

    /* renamed from: a */
    public void mo13917a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C3009k kVar = this.f10314a;
        kVar.getClass();
        sb.append(IAlog.m9899a((Object) kVar));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.m9902a(sb.toString(), new Object[0]);
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.mo13941a(str, str2);
        }
    }

    /* renamed from: b */
    public void mo13919b() {
        C2836c f;
        C3009k kVar = this.f10314a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onClickedAndOpen", IAlog.m9899a((Object) kVar));
        this.f10314a.mo13885a("2");
        C3009k kVar2 = this.f10314a;
        if (kVar2.f10293g != null) {
            C2948c cVar = kVar2.f10287a;
            if (!(cVar == null || (f = cVar.mo13748f()) == null)) {
                this.f10314a.f10287a.mo13740a((C3652i) f, VideoClickOrigin.COMPANION, C2850q.EVENT_CLICK);
            }
            IAlog.m9900a(1, (Exception) null, "AD_CLICKED", new Object[0]);
            this.f10314a.f10293g.mo13945g();
        }
    }

    /* renamed from: a */
    public C3677d0.C3678a mo13910a(String str, C3721p0 p0Var) {
        C2836c f;
        C3009k kVar = this.f10314a;
        kVar.getClass();
        IAlog.m9902a("%sweb view callback: onClicked", IAlog.m9899a((Object) kVar));
        this.f10314a.mo13885a("2");
        C3009k kVar2 = this.f10314a;
        if (kVar2.f10293g == null) {
            return new C3677d0.C3678a(C3677d0.C3680c.FAILED, new Exception("mListener is null, internal SDK fatal error"), StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        }
        C2948c cVar = kVar2.f10287a;
        if (!(cVar == null || (f = cVar.mo13748f()) == null)) {
            this.f10314a.f10287a.mo13740a((C3652i) f, VideoClickOrigin.COMPANION, C2850q.EVENT_CLICK);
        }
        IAlog.m9900a(1, (Exception) null, "AD_CLICKED", new Object[0]);
        return this.f10314a.f10293g.mo13939a(str, p0Var);
    }

    /* renamed from: b */
    public void mo13920b(C3764d dVar) {
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.mo13953r();
        }
    }

    /* renamed from: a */
    public void mo13911a() {
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.mo13947j();
        }
    }

    /* renamed from: a */
    public boolean mo13918a(String str) {
        View endCardView = this.f10314a.f10290d.getEndCardView();
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert == null) {
            return false;
        }
        listenert.mo13940a(endCardView, str);
        return true;
    }

    /* renamed from: a */
    public void mo13912a(InneractiveUnitController.AdDisplayError adDisplayError) {
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.onPlayerError();
        }
    }

    /* renamed from: a */
    public void mo13913a(C3764d dVar) {
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.mo13953r();
        }
    }

    /* renamed from: a */
    public void mo13914a(C3764d dVar, C2859a0 a0Var) {
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.mo13948k();
        }
    }

    /* renamed from: a */
    public void mo13915a(C3764d dVar, boolean z) {
        C3009k kVar = this.f10314a;
        kVar.getClass();
        IAlog.m9902a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.m9899a((Object) kVar), Boolean.valueOf(z));
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null && z) {
            listenert.mo13946h();
        }
    }

    /* renamed from: a */
    public void mo13916a(C3764d dVar, boolean z, Orientation orientation) {
        C3009k kVar = this.f10314a;
        kVar.getClass();
        IAlog.m9902a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.m9899a((Object) kVar), Boolean.valueOf(z), orientation.toString());
        ListenerT listenert = this.f10314a.f10293g;
        if (listenert != null) {
            listenert.mo13943a(z, orientation);
        }
    }
}
