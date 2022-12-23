package p253t;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import p067e1.C4494j;
import p090g1.C4732a;
import p584jl.C17885a;

/* renamed from: t.h */
public final class C6517h {

    /* renamed from: a */
    public final Intent f20317a;

    /* renamed from: t.h$a */
    public static final class C6518a {

        /* renamed from: a */
        public final Intent f20318a;

        /* renamed from: b */
        public final C17885a f20319b = new C17885a();

        /* renamed from: c */
        public boolean f20320c = true;

        public C6518a(C6522k kVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f20318a = intent;
            if (kVar != null) {
                intent.setPackage(kVar.f20325c.getPackageName());
                IBinder asBinder = kVar.f20324b.asBinder();
                PendingIntent pendingIntent = kVar.f20326d;
                Bundle bundle = new Bundle();
                C4494j.m11720b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }

        /* renamed from: a */
        public final C6517h mo22621a() {
            if (!this.f20318a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                C4494j.m11720b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                this.f20318a.putExtras(bundle);
            }
            this.f20318a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f20320c);
            Intent intent = this.f20318a;
            this.f20319b.getClass();
            intent.putExtras(new Bundle());
            this.f20318a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new C6517h(this.f20318a);
        }
    }

    public C6517h(Intent intent) {
        this.f20317a = intent;
    }

    /* renamed from: a */
    public final void mo22620a(Context context, Uri uri) {
        this.f20317a.setData(uri);
        C4732a.startActivity(context, this.f20317a, (Bundle) null);
    }
}
