package com.moovit.app.tod.shuttle.model;

import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/shuttle/model/TodSubscriptionProposal;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class TodSubscriptionProposal implements Parcelable {

    /* renamed from: b */
    public final String f40437b;

    public TodSubscriptionProposal(String str) {
        C24362h.m61211f(str, "id");
        this.f40437b = str;
    }

    public String getId() {
        return this.f40437b;
    }
}
