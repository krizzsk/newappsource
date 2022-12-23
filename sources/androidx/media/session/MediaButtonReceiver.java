package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p015v4.media.MediaBrowserCompat;
import java.util.List;
import java.util.Objects;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C1083a extends MediaBrowserCompat.C0148b {

        /* renamed from: c */
        public final Context f4081c;

        /* renamed from: d */
        public final Intent f4082d;

        /* renamed from: e */
        public final BroadcastReceiver.PendingResult f4083e;

        /* renamed from: f */
        public MediaBrowserCompat f4084f;

        public C1083a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f4081c = context;
            this.f4082d = intent;
            this.f4083e = pendingResult;
        }

        /* renamed from: a */
        public final void mo4383a() {
            Messenger messenger;
            MediaBrowserCompat.C0151c cVar = this.f4084f.f416a;
            MediaBrowserCompat.C0155g gVar = cVar.f429f;
            if (!(gVar == null || (messenger = cVar.f430g) == null)) {
                try {
                    gVar.mo546a(7, (Bundle) null, messenger);
                } catch (RemoteException unused) {
                }
            }
            cVar.f425b.disconnect();
            this.f4083e.finish();
        }
    }

    /* renamed from: a */
    public static ComponentName m2933a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder l = C13555b.m33973l("Expected 1 service that handles ", str, ", found ");
            l.append(queryIntentServices.size());
            throw new IllegalStateException(l.toString());
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName a = m2933a(context, "android.intent.action.MEDIA_BUTTON");
        if (a != null) {
            intent.setComponent(a);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } else {
            ComponentName a2 = m2933a(context, "android.media.browse.MediaBrowserService");
            if (a2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C1083a aVar = new C1083a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar);
                aVar.f4084f = mediaBrowserCompat;
                mediaBrowserCompat.f416a.f425b.connect();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }
}
