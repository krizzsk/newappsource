package mobi.lab.veriff.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.TextUtils;
import com.veriff.sdk.internal.C21593eg;
import com.veriff.sdk.internal.C21639fp;
import com.veriff.sdk.internal.C21645fu;
import com.veriff.sdk.internal.C21716gg;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22060ng;
import com.veriff.sdk.internal.C22062ni;
import com.veriff.sdk.internal.C22064nk;
import com.veriff.sdk.internal.C22661wm;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24452e;
import mobi.lab.veriff.util.C24465j;
import mobi.lab.veriff.util.C24466k;
import p090g1.C4732a;

public class SendAuthenticationFlowDataToServerService extends Service {

    /* renamed from: a */
    public static final String f61853a = "SendAuthenticationFlowDataToServerService.ACTION_UPLOAD_AUTHENTICATION_FLOW_ITEM";

    /* renamed from: c */
    private static final String f61854c = "SendAuthenticationFlowDataToServerService.EXTRA_AUTHENTICATION_FLOW_SESSION_ARGS";

    /* renamed from: d */
    private static final String f61855d = "SendAuthenticationFlowDataToServerService.EXTRA_AUTHENTICATION_FLOW_SESSION_DATA";

    /* renamed from: e */
    private static final String f61856e = "SendAuthenticationFlowDataToServerService.EXTRA_AUTHENTICATION_FLOW_SESSION";

    /* renamed from: f */
    private static final String f61857f = "SendAuthenticationFlowDataToServerService.EXTRA_DOCUMENT_TYPE";

    /* renamed from: g */
    private static final C24465j f61858g = C24465j.m61536a(SendAuthenticationFlowDataToServerService.class);

    /* renamed from: h */
    private static final String f61859h = "SendAuthenticationFlowDataToServerService.WAKELOCK_KEY";

    /* renamed from: i */
    private static volatile PowerManager.WakeLock f61860i;

    /* renamed from: b */
    public C21639fp f61861b;

    /* renamed from: j */
    private C22064nk.C22065a f61862j;

    static {
        Class<SendAuthenticationFlowDataToServerService> cls = SendAuthenticationFlowDataToServerService.class;
        Class<SendAuthenticationFlowDataToServerService> cls2 = SendAuthenticationFlowDataToServerService.class;
        Class<SendAuthenticationFlowDataToServerService> cls3 = SendAuthenticationFlowDataToServerService.class;
        Class<SendAuthenticationFlowDataToServerService> cls4 = SendAuthenticationFlowDataToServerService.class;
        Class<SendAuthenticationFlowDataToServerService> cls5 = SendAuthenticationFlowDataToServerService.class;
        Class<SendAuthenticationFlowDataToServerService> cls6 = SendAuthenticationFlowDataToServerService.class;
    }

    /* renamed from: b */
    private static Intent m61476b(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, SendAuthenticationFlowDataToServerService.class);
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public IBinder onBind(Intent intent) {
        f61858g.mo60705d("onBind");
        throw new UnsupportedOperationException("Not implemented");
    }

    public void onDestroy() {
        Class<SendAuthenticationFlowDataToServerService> cls = SendAuthenticationFlowDataToServerService.class;
        f61858g.mo60705d("Terminating service: SendAuthenticationFlowDataToServerService");
        if (this.f61862j != null) {
            this.f61861b.mo54909c().mo55953b(this.f61862j);
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C24465j jVar = f61858g;
        jVar.mo60705d("onHandleIntent() start");
        if (intent != null && f61853a.equals(intent.getAction())) {
            String str = f61854c;
            if (intent.hasExtra(str)) {
                String str2 = f61855d;
                if (intent.hasExtra(str2)) {
                    C24426d dVar = (C24426d) intent.getParcelableExtra(str);
                    C21895jw jwVar = (C21895jw) intent.getParcelableExtra(str2);
                    C21593eg.f54334a.mo54610a().mo54566c().mo57035a(this, dVar).mo54571a(this);
                    startForeground(1001, C24466k.m61552a(this, dVar, jwVar, (C22661wm) intent.getParcelableExtra(f61856e), intent.getStringExtra(f61857f), this.f61861b.mo54912f().mo60691a(), dVar.mo60604g()));
                    if (this.f61861b.mo54909c().mo55950a()) {
                        m61477b(i2);
                        return 3;
                    }
                    this.f61862j = m61472a(i2);
                    this.f61861b.mo54909c().mo55949a(this.f61862j);
                    this.f61861b.mo54909c().mo55952b();
                }
            }
        }
        jVar.mo60705d("onHandleIntent() done");
        return 3;
    }

    public void onTaskRemoved(Intent intent) {
        Class<SendAuthenticationFlowDataToServerService> cls = SendAuthenticationFlowDataToServerService.class;
        f61858g.mo60705d("onTaskRemoved: SendAuthenticationFlowDataToServerService");
        super.onTaskRemoved(intent);
    }

    /* renamed from: a */
    public static synchronized boolean m61475a(Context context, String str, C24426d dVar, C21895jw jwVar, C22661wm wmVar, String str2, C21645fu fuVar) {
        boolean a;
        synchronized (SendAuthenticationFlowDataToServerService.class) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f61854c, dVar);
            bundle.putParcelable(f61855d, jwVar);
            bundle.putParcelable(f61856e, wmVar);
            bundle.putString(f61857f, str2);
            fuVar.mo54921a(C21716gg.m52900a(""));
            a = m61474a(context, str, bundle);
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m61477b(int i) {
        C24452e.m61502a(m61471a((Context) this));
        stopSelf(i);
    }

    /* renamed from: a */
    private static synchronized boolean m61474a(Context context, String str, Bundle bundle) {
        synchronized (SendAuthenticationFlowDataToServerService.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    f61858g.mo60705d("start");
                    C24452e.m61503a(m61471a(context), 120000);
                    C4732a.startForegroundService(context, m61476b(context, str, bundle));
                    return true;
                }
            }
            C24465j jVar = f61858g;
            jVar.mo60705d("start - Unable to start the service, either context and/or the action is missing - action: " + str);
            return false;
        }
    }

    /* renamed from: a */
    private static PowerManager.WakeLock m61471a(Context context) {
        if (f61860i == null) {
            f61860i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, f61859h);
        }
        return f61860i;
    }

    /* renamed from: a */
    private C22064nk.C22065a m61472a(final int i) {
        return new C22064nk.C22065a() {
            /* renamed from: a */
            public void mo55961a(C22060ng ngVar) {
            }

            /* renamed from: a */
            public void mo55962a(C22062ni niVar) {
                if (niVar.equals(C22062ni.DONE)) {
                    SendAuthenticationFlowDataToServerService.this.m61477b(i);
                }
            }
        };
    }
}
