package com.moovit.search;

import android.content.Context;
import android.os.Bundle;
import ce0.C21100e;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.geo.LatLonE6;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.ThreadPoolExecutor;
import p693nz.C18659h;
import z70.C13321a;
import z70.C13327e;

/* renamed from: com.moovit.search.a */
public abstract class C7604a<R> {

    /* renamed from: a */
    public final Context f23152a;

    /* renamed from: b */
    public final String f23153b;

    /* renamed from: c */
    public final C18659h<String, C7605a> f23154c = new C18659h<>(20);

    /* renamed from: com.moovit.search.a$a */
    public static class C7605a {

        /* renamed from: a */
        public final C13327e f23155a;

        public C7605a(String str, C13327e eVar) {
            C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
            this.f23155a = eVar;
        }
    }

    public C7604a(Context context, String str) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f23152a = context;
        this.f23153b = str;
    }

    /* renamed from: a */
    public String mo23775a(String str, LatLonE6 latLonE6) {
        return str;
    }

    /* renamed from: b */
    public abstract C13327e mo23836b(Context context, String str, String str2, R r);

    /* renamed from: c */
    public abstract Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6);

    /* renamed from: d */
    public abstract Task mo23837d(ThreadPoolExecutor threadPoolExecutor, C13321a aVar);

    /* renamed from: e */
    public abstract boolean mo23777e();

    /* renamed from: f */
    public void mo23778f() {
        C21100e.m49369v(1);
        this.f23154c.clear();
    }

    /* renamed from: g */
    public void mo23838g(Bundle bundle) {
    }

    /* renamed from: h */
    public Bundle mo23839h() {
        return null;
    }
}
