package com.vungle.warren.model.admarkup;

import com.facebook.ads.AdSDKNotificationListener;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p001a0.C0017h;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13452i;
import p389bl.C13641g;

public final class AdMarkupV1 extends AdMarkup {
    private final String eventId;

    public AdMarkupV1(String str, String[] strArr) {
        this.eventId = str;
        this.impressions = strArr;
    }

    /* renamed from: c */
    public static AdMarkupV1 m57197c(String str) {
        ArrayList arrayList;
        String[] strArr = null;
        if (str == null) {
            return null;
        }
        try {
            C13452i iVar = (C13452i) new GsonBuilder().create().fromJson(str, C13452i.class);
            if (iVar == null) {
                return null;
            }
            if (C13641g.m34129r(iVar, AdSDKNotificationListener.IMPRESSION_EVENT)) {
                C13447d J = iVar.mo40352J(AdSDKNotificationListener.IMPRESSION_EVENT);
                J.getClass();
                arrayList = new ArrayList();
                Iterator<C13450g> it = J.mo40340s().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo40326B());
                }
            } else {
                arrayList = null;
            }
            String k = C13641g.m34123k(iVar, "event_id", (String) null);
            if (arrayList != null) {
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            return new AdMarkupV1(k, strArr);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo58243a() {
        return this.eventId;
    }

    /* renamed from: b */
    public final int mo58244b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdMarkupV1.class != obj.getClass()) {
            return false;
        }
        String str = this.eventId;
        String str2 = ((AdMarkupV1) obj).eventId;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.eventId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("    AdMarkup {eventId='");
        C25541a.m63890u(k, this.eventId, '\'', ", impression=");
        return C0017h.m57N(k, Arrays.toString(this.impressions), '}');
    }
}
