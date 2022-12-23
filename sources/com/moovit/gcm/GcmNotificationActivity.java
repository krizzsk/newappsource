package com.moovit.gcm;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.gcm.notification.GcmNotification;
import f10.C16931b;
import f10.C16932c;
import java.util.concurrent.atomic.AtomicBoolean;
import p054d0.C4291k0;
import p203p1.C6026b;
import p203p1.C6028c;
import p977zz.C20927a0;

public class GcmNotificationActivity extends AppCompatActivity {

    /* renamed from: x */
    public static final String f41492x;

    /* renamed from: y */
    public static final String f41493y;

    static {
        String k = C25541a.m63881k(GcmNotificationActivity.class.getName(), ".extra");
        f41492x = C25541a.m63881k(k, ".gcm_notification");
        f41493y = C25541a.m63881k(k, ".notification_id");
    }

    /* renamed from: b1 */
    public static PendingIntent m40507b1(Context context, GcmNotification gcmNotification) {
        Bundle bundle = new Bundle();
        bundle.putInt(f41493y, gcmNotification.f41525h);
        bundle.putParcelable(f41492x, gcmNotification);
        Intent intent = new Intent(context, GcmNotificationActivity.class);
        intent.putExtra("bundle", bundle);
        return PendingIntent.getActivity(context, gcmNotification.f41525h, intent, C20927a0.m49010e(268435456));
    }

    public final void onCreate(Bundle bundle) {
        C6026b bVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new C6028c(this);
        } else {
            bVar = new C6026b(this);
        }
        bVar.mo22022a();
        bVar.mo22023b(new C4291k0(atomicBoolean, 13));
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        Tasks.call(MoovitExecutors.COMPUTATION, new C16931b(this, bundleExtra.getInt(f41493y, GcmNotification.f41516j), (GcmNotification) bundleExtra.getParcelable(f41492x))).addOnCompleteListener((Activity) this, new C16932c(0, this, atomicBoolean));
    }
}
