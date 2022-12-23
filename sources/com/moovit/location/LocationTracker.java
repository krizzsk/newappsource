package com.moovit.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.commons.utils.service.LooperService;
import com.moovit.location.C16202a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p435de.C16596f;
import p824tp.C19746x;
import p858uz.C20049b;
import p858uz.C20059f;
import p858uz.C20061g;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20964s0;

public abstract class LocationTracker extends LooperService implements C20059f {

    /* renamed from: g */
    public static final long f42265g;

    /* renamed from: h */
    public static final long f42266h;

    /* renamed from: i */
    public static final /* synthetic */ int f42267i = 0;

    /* renamed from: f */
    public volatile C20061g f42268f;

    /* renamed from: com.moovit.location.LocationTracker$a */
    public class C16201a implements OnCompleteListener<C16202a.C16203a> {
        public C16201a() {
        }

        public final void onComplete(Task<C16202a.C16203a> task) {
            boolean z;
            if (LocationTracker.this.f41042c != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    C16202a.C16203a result = task.getResult(ApiException.class);
                    if (result != null) {
                        result.mo48509c();
                    }
                    if (result != null) {
                        result.mo48507a();
                    }
                    if (result == null || !result.mo48507a() || !result.mo48509c()) {
                        String string = LocationTracker.this.getString(C19746x.location_services_disabled_message);
                        LocationTracker.this.getString(C19746x.location_services_disabled_action);
                        int i = LocationTracker.f42267i;
                        C20964s0.m49090h(string);
                        throw null;
                    }
                    LocationTracker locationTracker = LocationTracker.this;
                    int i2 = LocationTracker.f42267i;
                    locationTracker.getClass();
                    C20964s0.m49090h((CharSequence) null);
                    throw null;
                } catch (ApiException e) {
                    CommonStatusCodes.getStatusCodeString(e.getStatusCode());
                    LocationTracker.this.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("status_code", e.getStatusCode());
                    bundle.putString("status_code_text", CommonStatusCodes.getStatusCodeString(e.getStatusCode()));
                    bundle.putString(InAppMessageBase.MESSAGE, e.getMessage());
                    FirebaseAnalytics.getInstance(LocationTracker.this.getApplicationContext()).mo43247a(bundle, "location_not_available");
                    int statusCode = e.getStatusCode();
                    if (statusCode == 6) {
                        String string2 = LocationTracker.this.getString(C19746x.location_services_disabled_message);
                        LocationTracker.this.getString(C19746x.location_services_disabled_action);
                        C20964s0.m49090h(string2);
                        throw null;
                    } else if (statusCode != 8502) {
                        C20964s0.m49090h(LocationTracker.this.getString(C19746x.location_services_unavailable_message));
                        throw null;
                    } else {
                        C20964s0.m49090h(LocationTracker.this.getString(C19746x.location_services_disabled_message));
                        throw null;
                    }
                } catch (Throwable th) {
                    C16596f.m42113a().mo49364c(th);
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(5);
        f42265g = millis;
        f42266h = millis * 4;
        TimeUnit.MINUTES.toMillis(1);
    }

    /* renamed from: d */
    public final void mo19675d(int i, Intent intent) {
        String str;
        boolean z;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str == null) {
            str = "on_update";
        }
        if ("on_update".equals(str)) {
            LooperService.C15783a aVar = this.f41042c;
            if (aVar != null) {
                if (C20934d0.m49032c(this)) {
                    C16202a.get(this).requestLocationSettings().addOnCompleteListener((Executor) aVar, new C16201a());
                } else {
                    C20964s0.m49090h(getString(0));
                    throw null;
                }
            }
            if (this.f42268f != null) {
                z = true;
            } else {
                z = false;
            }
            boolean c = C20934d0.m49032c(this);
            if (!z && c) {
                mo48531j(false);
                long j = f42266h / 2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                throw null;
            }
        }
    }

    /* renamed from: h */
    public final void mo19676h(Message message) {
        throw null;
    }

    /* renamed from: i */
    public abstract void mo48530i();

    /* renamed from: j */
    public final void mo48531j(boolean z) {
        boolean z2;
        C20049b bVar;
        boolean z3 = true;
        if (this.f42268f != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f42268f.mo50904b(this);
            this.f42268f = null;
        }
        Intent registerReceiver = registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
            registerReceiver.getIntExtra(ServerParameters.STATUS, -1);
            if (C20943i.m49051d(28)) {
                registerReceiver.getBooleanExtra("battery_low", false);
            }
        }
        Looper looper = this.f41041b;
        if (looper == null) {
            z3 = false;
        }
        if (z3) {
            if (z) {
                C20049b bVar2 = new C20049b(this, looper);
                LocationRequest priority = LocationRequest.create().setPriority(100);
                long j = f42265g;
                bVar2.mo52309l(priority.setInterval(j).setFastestInterval(j / 2));
                bVar = bVar2;
            } else {
                C16202a aVar = C16202a.get(this);
                LocationRequest priority2 = LocationRequest.create().setPriority(100);
                long j2 = f42265g;
                bVar = aVar.createLocationSource(this, looper, priority2.setInterval(j2).setFastestInterval(j2 / 2));
            }
            this.f42268f = bVar;
            this.f42268f.mo50903a(this);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    @SuppressLint({"WakelockTimeout"})
    public final void onCreate() {
        super.onCreate();
        C20964s0.m49090h((CharSequence) null);
        throw null;
    }

    public final void onDestroy() {
        boolean z;
        super.onDestroy();
        if (this.f42268f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f42268f.mo50904b(this);
            this.f42268f = null;
        }
        throw null;
    }

    public final void onLocationChanged(Location location) {
        SystemClock.elapsedRealtime();
        mo48530i();
    }
}
