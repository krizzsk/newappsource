package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2440z;
import com.facebook.login.LoginTargetApp;
import kotlin.Metadata;
import mf0.C24362h;
import p130j2.C5367a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CustomTabMainActivity extends Activity {

    /* renamed from: d */
    public static final String f8401d = C24362h.m61216k(".extra_action", "CustomTabMainActivity");

    /* renamed from: e */
    public static final String f8402e = C24362h.m61216k(".extra_params", "CustomTabMainActivity");

    /* renamed from: f */
    public static final String f8403f = C24362h.m61216k(".extra_chromePackage", "CustomTabMainActivity");

    /* renamed from: g */
    public static final String f8404g = C24362h.m61216k(".extra_url", "CustomTabMainActivity");

    /* renamed from: h */
    public static final String f8405h = C24362h.m61216k(".extra_targetApp", "CustomTabMainActivity");

    /* renamed from: i */
    public static final String f8406i = C24362h.m61216k(".action_refresh", "CustomTabMainActivity");

    /* renamed from: j */
    public static final String f8407j = C24362h.m61216k(".no_activity_exception", "CustomTabMainActivity");

    /* renamed from: b */
    public boolean f8408b = true;

    /* renamed from: c */
    public CustomTabMainActivity$onCreate$redirectReceiver$1 f8409c;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    public /* synthetic */ class C2275a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8410a;

        static {
            int[] iArr = new int[LoginTargetApp.values().length];
            iArr[LoginTargetApp.INSTAGRAM.ordinal()] = 1;
            f8410a = iArr;
        }
    }

    /* renamed from: a */
    public final void mo11880a(int i, Intent intent) {
        Bundle bundle;
        CustomTabMainActivity$onCreate$redirectReceiver$1 customTabMainActivity$onCreate$redirectReceiver$1 = this.f8409c;
        if (customTabMainActivity$onCreate$redirectReceiver$1 != null) {
            C5367a.m13473a(this).mo21148d(customTabMainActivity$onCreate$redirectReceiver$1);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f8404g);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                C2397f0 f0Var = C2397f0.f8630a;
                bundle = C2397f0.m6298G(parse.getQuery());
                bundle.putAll(C2397f0.m6298G(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            C2440z zVar = C2440z.f8743a;
            Intent intent2 = getIntent();
            C24362h.m61210e(intent2, "intent");
            Intent f = C2440z.m6401f(intent2, bundle, (FacebookException) null);
            if (f != null) {
                intent = f;
            }
            setResult(i, intent);
        } else {
            C2440z zVar2 = C2440z.f8743a;
            Intent intent3 = getIntent();
            C24362h.m61210e(intent3, "intent");
            setResult(i, C2440z.m6401f(intent3, (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            java.lang.String r0 = com.facebook.CustomTabActivity.f8397c
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r1 = r1.getAction()
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r9.setResult(r1)
            r9.finish()
            return
        L_0x001b:
            if (r10 != 0) goto L_0x0123
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = f8401d
            java.lang.String r10 = r10.getStringExtra(r0)
            if (r10 != 0) goto L_0x002a
            return
        L_0x002a:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r2 = f8402e
            android.os.Bundle r0 = r0.getBundleExtra(r2)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r3 = f8403f
            java.lang.String r2 = r2.getStringExtra(r3)
            com.facebook.login.LoginTargetApp$a r3 = com.facebook.login.LoginTargetApp.Companion
            android.content.Intent r4 = r9.getIntent()
            java.lang.String r5 = f8405h
            java.lang.String r4 = r4.getStringExtra(r5)
            r3.getClass()
            com.facebook.login.LoginTargetApp[] r3 = com.facebook.login.LoginTargetApp.values()
            int r5 = r3.length
            r6 = 0
        L_0x0053:
            if (r6 >= r5) goto L_0x0064
            r7 = r3[r6]
            int r6 = r6 + 1
            java.lang.String r8 = r7.toString()
            boolean r8 = mf0.C24362h.m61206a(r8, r4)
            if (r8 == 0) goto L_0x0053
            goto L_0x0066
        L_0x0064:
            com.facebook.login.LoginTargetApp r7 = com.facebook.login.LoginTargetApp.FACEBOOK
        L_0x0066:
            int[] r3 = com.facebook.CustomTabMainActivity.C2275a.f8410a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 != r4) goto L_0x0077
            com.facebook.internal.t r3 = new com.facebook.internal.t
            r3.<init>(r10, r0)
            goto L_0x007c
        L_0x0077:
            com.facebook.internal.d r3 = new com.facebook.internal.d
            r3.<init>(r10, r0)
        L_0x007c:
            boolean r10 = p262t8.C6606a.m15601b(r3)
            if (r10 == 0) goto L_0x0083
            goto L_0x00f8
        L_0x0083:
            java.util.concurrent.locks.ReentrantLock r10 = com.facebook.login.C2468a.f8843d     // Catch:{ all -> 0x00f4 }
            r10.lock()     // Catch:{ all -> 0x00f4 }
            t.k r0 = com.facebook.login.C2468a.f8842c     // Catch:{ all -> 0x00f4 }
            r5 = 0
            com.facebook.login.C2468a.f8842c = r5     // Catch:{ all -> 0x00f4 }
            r10.unlock()     // Catch:{ all -> 0x00f4 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x00f4 }
            java.lang.String r6 = "android.intent.action.VIEW"
            r10.<init>(r6)     // Catch:{ all -> 0x00f4 }
            java.lang.String r6 = "android.support.customtabs.extra.SESSION"
            if (r0 == 0) goto L_0x00be
            android.content.ComponentName r7 = r0.f20325c     // Catch:{ all -> 0x00f4 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x00f4 }
            r10.setPackage(r7)     // Catch:{ all -> 0x00f4 }
            a.a r7 = r0.f20324b     // Catch:{ all -> 0x00f4 }
            android.os.IBinder r7 = r7.asBinder()     // Catch:{ all -> 0x00f4 }
            android.app.PendingIntent r0 = r0.f20326d     // Catch:{ all -> 0x00f4 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x00f4 }
            r8.<init>()     // Catch:{ all -> 0x00f4 }
            p067e1.C4494j.m11720b(r8, r6, r7)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x00bb
            java.lang.String r7 = "android.support.customtabs.extra.SESSION_ID"
            r8.putParcelable(r7, r0)     // Catch:{ all -> 0x00f4 }
        L_0x00bb:
            r10.putExtras(r8)     // Catch:{ all -> 0x00f4 }
        L_0x00be:
            boolean r0 = r10.hasExtra(r6)     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00cf
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            p067e1.C4494j.m11720b(r0, r6, r5)     // Catch:{ all -> 0x00f4 }
            r10.putExtras(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00cf:
            java.lang.String r0 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
            r10.putExtra(r0, r4)     // Catch:{ all -> 0x00f4 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            r10.putExtras(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "androidx.browser.customtabs.extra.SHARE_STATE"
            r10.putExtra(r0, r1)     // Catch:{ all -> 0x00f4 }
            t.h r0 = new t.h     // Catch:{ all -> 0x00f4 }
            r0.<init>(r10)     // Catch:{ all -> 0x00f4 }
            android.content.Intent r10 = r0.f20317a     // Catch:{ all -> 0x00f4 }
            r10.setPackage(r2)     // Catch:{ all -> 0x00f4 }
            android.net.Uri r10 = r3.f8625a     // Catch:{ ActivityNotFoundException -> 0x00f2 }
            r0.mo22620a(r9, r10)     // Catch:{ ActivityNotFoundException -> 0x00f2 }
            r10 = 1
            goto L_0x00f9
        L_0x00f2:
            goto L_0x00f8
        L_0x00f4:
            r10 = move-exception
            p262t8.C6606a.m15600a(r3, r10)
        L_0x00f8:
            r10 = 0
        L_0x00f9:
            r9.f8408b = r1
            if (r10 != 0) goto L_0x010e
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = f8407j
            android.content.Intent r10 = r10.putExtra(r0, r4)
            r9.setResult(r1, r10)
            r9.finish()
            return
        L_0x010e:
            com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1 r10 = new com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1
            r10.<init>(r9)
            r9.f8409c = r10
            j2.a r0 = p130j2.C5367a.m13473a(r9)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = com.facebook.CustomTabActivity.f8397c
            r1.<init>(r2)
            r0.mo21146b(r10, r1)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    public final void onNewIntent(Intent intent) {
        C24362h.m61211f(intent, "intent");
        super.onNewIntent(intent);
        if (C24362h.m61206a(f8406i, intent.getAction())) {
            C5367a.m13473a(this).mo21147c(new Intent(CustomTabActivity.f8398d));
            mo11880a(-1, intent);
        } else if (C24362h.m61206a(CustomTabActivity.f8397c, intent.getAction())) {
            mo11880a(-1, intent);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f8408b) {
            mo11880a(0, (Intent) null);
        }
        this.f8408b = true;
    }
}
