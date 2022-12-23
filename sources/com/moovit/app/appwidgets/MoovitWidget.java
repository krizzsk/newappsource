package com.moovit.app.appwidgets;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.SharedPreferences;
import com.moovit.analytics.AnalyticsEventKey;
import f00.C16919g;
import java.util.ArrayList;
import java.util.List;
import p172m9.C5720b;
import p269u2.C6677a;
import p543hq.C17474b;
import p543hq.C17476c;
import p567iq.C17635b;

public abstract class MoovitWidget extends AppWidgetProvider {

    /* renamed from: a */
    public C16919g.C16923d f37609a = new C16919g.C16923d("ids");

    /* renamed from: a */
    public abstract SharedPreferences mo44775a(Context context);

    /* renamed from: b */
    public abstract AnalyticsEventKey mo44776b();

    /* renamed from: c */
    public abstract AnalyticsEventKey mo44777c();

    /* renamed from: d */
    public void mo44778d() {
    }

    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        List<Integer> e = this.f37609a.mo19759a(mo44775a(context));
        if (e != null) {
            ArrayList arrayList = new ArrayList();
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            e.removeAll(arrayList);
            this.f37609a.mo49545d(mo44775a(context), e);
        }
    }

    public final void onDisabled(Context context) {
        super.onDisabled(context);
        C16919g.C16923d dVar = this.f37609a;
        SharedPreferences a = mo44775a(context);
        dVar.getClass();
        SharedPreferences.Editor edit = a.edit();
        dVar.mo49539b(edit);
        edit.apply();
        C6677a.m15759j(context, ((C17476c) C17635b.m43779f(context).f50173c.f20758b).mo49947a(getClass()), false, new C17474b(mo44777c()));
    }

    public final void onEnabled(Context context) {
        boolean z;
        super.onEnabled(context);
        List<Integer> e = this.f37609a.mo19759a(mo44775a(context));
        int[] q = C5720b.m14066q(context, getClass());
        ArrayList arrayList = new ArrayList();
        for (int valueOf : q) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        if (e == null) {
            z = true;
        } else {
            z = false;
        }
        if (e != null) {
            arrayList.removeAll(e);
            if (arrayList.size() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int valueOf2 : q) {
            arrayList2.add(Integer.valueOf(valueOf2));
        }
        this.f37609a.mo49545d(mo44775a(context), arrayList2);
        if (z) {
            C6677a.m15759j(context, ((C17476c) C17635b.m43779f(context).f50173c.f20758b).mo49947a(getClass()), false, new C17474b(mo44776b()));
        }
    }

    public final void onRestored(Context context, int[] iArr, int[] iArr2) {
        super.onRestored(context, iArr, iArr2);
        List<Integer> e = this.f37609a.mo19759a(mo44775a(context));
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        e.removeAll(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int valueOf2 : iArr2) {
            arrayList2.add(Integer.valueOf(valueOf2));
        }
        e.addAll(arrayList2);
        this.f37609a.mo49545d(mo44775a(context), e);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
