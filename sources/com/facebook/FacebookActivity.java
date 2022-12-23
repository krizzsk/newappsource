package com.facebook;

import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import mf0.C24362h;
import p262t8.C6606a;
import p300w8.C7002a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public class FacebookActivity extends FragmentActivity {

    /* renamed from: x */
    public Fragment f8412x;

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(str, "prefix");
                C24362h.m61211f(printWriter, "writer");
                int i = C7002a.f21778a;
                if (!C24362h.m61206a((Object) null, Boolean.TRUE)) {
                    super.dump(str, fileDescriptor, printWriter, strArr);
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C24362h.m61211f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f8412x;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [com.facebook.internal.m, androidx.fragment.app.Fragment, androidx.fragment.app.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.content.Intent r5 = r4.getIntent()
            boolean r0 = p009a8.C0115o.m217h()
            if (r0 != 0) goto L_0x0023
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "applicationContext"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.Class<a8.o> r1 = p009a8.C0115o.class
            monitor-enter(r1)
            p009a8.C0115o.m221l(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)
            goto L_0x0023
        L_0x0020:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L_0x0023:
            int r0 = com.facebook.common.C2361d.com_facebook_activity_layout
            r4.setContentView((int) r0)
            java.lang.String r5 = r5.getAction()
            java.lang.String r0 = "PassThrough"
            boolean r5 = mf0.C24362h.m61206a(r0, r5)
            if (r5 == 0) goto L_0x005d
            android.content.Intent r5 = r4.getIntent()
            com.facebook.internal.z r0 = com.facebook.internal.C2440z.f8743a
            java.lang.String r0 = "requestIntent"
            mf0.C24362h.m61210e(r5, r0)
            android.os.Bundle r5 = com.facebook.internal.C2440z.m6406m(r5)
            com.facebook.FacebookException r5 = com.facebook.internal.C2440z.m6404j(r5)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "intent"
            mf0.C24362h.m61210e(r0, r1)
            r1 = 0
            android.content.Intent r5 = com.facebook.internal.C2440z.m6401f(r0, r1, r5)
            r0 = 0
            r4.setResult(r0, r5)
            r4.finish()
            return
        L_0x005d:
            android.content.Intent r5 = r4.getIntent()
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            java.lang.String r1 = "supportFragmentManager"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = "SingleFragment"
            androidx.fragment.app.Fragment r2 = r0.mo3923A(r1)
            if (r2 != 0) goto L_0x00a1
            java.lang.String r5 = r5.getAction()
            java.lang.String r2 = "FacebookDialogFragment"
            boolean r5 = mf0.C24362h.m61206a(r2, r5)
            r2 = 1
            if (r5 == 0) goto L_0x008b
            com.facebook.internal.m r5 = new com.facebook.internal.m
            r5.<init>()
            r5.setRetainInstance(r2)
            r5.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r1)
            goto L_0x00a0
        L_0x008b:
            com.facebook.login.i r5 = new com.facebook.login.i
            r5.<init>()
            r5.setRetainInstance(r2)
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r0)
            int r0 = com.facebook.common.C2360c.com_facebook_fragment_container
            r3.mo4041e(r0, r5, r1, r2)
            r3.mo4040d()
        L_0x00a0:
            r2 = r5
        L_0x00a1:
            r4.f8412x = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookActivity.onCreate(android.os.Bundle):void");
    }
}
