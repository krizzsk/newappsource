package com.vungle.warren.model.admarkup;

import od0.C24545c;
import p359ag.C13450g;
import p359ag.C13452i;
import p359ag.C13453j;

public class AdMarkupV2 extends AdMarkup {
    private final String advertisementJsonObject;
    private final String placementId;

    public AdMarkupV2(C13452i iVar, String[] strArr) {
        this.impressions = strArr;
        C13450g E = iVar.mo40352J("ads").mo40329E(0);
        this.placementId = E.mo40342u().mo40351I("placement_reference_id").mo40326B();
        this.advertisementJsonObject = E.mo40342u().toString();
    }

    /* renamed from: a */
    public final String mo58243a() {
        return mo58248c().getId();
    }

    /* renamed from: b */
    public final int mo58244b() {
        return 2;
    }

    /* renamed from: c */
    public final C24545c mo58248c() {
        C24545c cVar = new C24545c(C13453j.m33762b(this.advertisementJsonObject).mo40342u());
        cVar.f62193O = this.placementId;
        cVar.f62191M = true;
        return cVar;
    }
}
