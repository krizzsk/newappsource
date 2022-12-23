package com.moovit.app.tod.model;

import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0001\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodSubscription;", "Landroid/os/Parcelable;", "Lcom/moovit/app/tod/model/TodWeeklyShuttleSubscription;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class TodSubscription implements Parcelable {

    /* renamed from: b */
    public final String f40315b;

    public TodSubscription(String str) {
        this.f40315b = str;
    }

    public String getId() {
        return this.f40315b;
    }
}
