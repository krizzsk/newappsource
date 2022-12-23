package com.moovit.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.facebook.ads.AdSDKNotificationListener;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p130j2.C5367a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/ads/AdListener;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class AdListener extends BroadcastReceiver {

    /* renamed from: b */
    public static final Uri f37356b = Uri.parse("moovit_ads://ad_event");

    /* renamed from: com.moovit.ads.AdListener$a */
    public static final class C14696a {
        /* renamed from: a */
        public static void m37010a(Context context, String str, String str2) {
            C5367a a = C5367a.m13473a(context);
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setData(AdListener.f37356b.buildUpon().appendPath(str).build());
            a.mo21147c(intent);
        }
    }

    /* renamed from: h */
    public static void m37005h(AdListener adListener, Context context, String str, int i) {
        String[] strArr;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            strArr = new String[]{"click", AdSDKNotificationListener.IMPRESSION_EVENT, "open", "close"};
        } else {
            strArr = null;
        }
        adListener.getClass();
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(strArr, "actions");
        IntentFilter intentFilter = new IntentFilter();
        Uri uri = f37356b;
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataAuthority(uri.getHost(), (String) null);
        if (str != null) {
            intentFilter.addDataPath('/' + str, 0);
        }
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        C5367a.m13473a(context).mo21146b(adListener, intentFilter);
    }

    /* renamed from: a */
    public abstract void mo19369a(String str);

    /* renamed from: c */
    public abstract void mo19370c(String str);

    /* renamed from: d */
    public abstract void mo19371d(String str);

    /* renamed from: g */
    public abstract void mo19372g(String str);

    public final void onReceive(Context context, Intent intent) {
        String action;
        Uri data;
        String lastPathSegment;
        if (intent != null && (action = intent.getAction()) != null && (data = intent.getData()) != null && (lastPathSegment = data.getLastPathSegment()) != null) {
            switch (action.hashCode()) {
                case 3417674:
                    if (action.equals("open")) {
                        mo19372g(lastPathSegment);
                        return;
                    }
                    return;
                case 94750088:
                    if (action.equals("click")) {
                        mo19369a(lastPathSegment);
                        return;
                    }
                    return;
                case 94756344:
                    if (action.equals("close")) {
                        mo19370c(lastPathSegment);
                        return;
                    }
                    return;
                case 120623625:
                    if (action.equals(AdSDKNotificationListener.IMPRESSION_EVENT)) {
                        mo19371d(lastPathSegment);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
