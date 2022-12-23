package mobi.lab.veriff.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import mobi.lab.veriff.util.C24452e;
import mobi.lab.veriff.util.C24465j;

@Deprecated
public class VeriffStatusUpdatesService extends IntentService {

    /* renamed from: a */
    private static final C24465j f61865a = C24465j.m61536a(VeriffStatusUpdatesService.class);

    /* renamed from: b */
    private static final String f61866b = "VeriffStatusUpdatesService.EXTRA_STATUS_CODE";

    /* renamed from: c */
    private static final String f61867c = "VeriffStatusUpdatesService.EXTRA_SESSION_TOKEN";

    /* renamed from: d */
    private static final String f61868d = "VeriffStatusUpdatesService.WAKELOCK_KEY";

    /* renamed from: e */
    private static volatile PowerManager.WakeLock f61869e;

    static {
        Class<VeriffStatusUpdatesService> cls = VeriffStatusUpdatesService.class;
        Class<VeriffStatusUpdatesService> cls2 = VeriffStatusUpdatesService.class;
        Class<VeriffStatusUpdatesService> cls3 = VeriffStatusUpdatesService.class;
    }

    public VeriffStatusUpdatesService() {
        super("VeriffStatusUpdatesService");
    }

    /* renamed from: a */
    private static PowerManager.WakeLock m61480a(Context context) {
        if (f61869e == null) {
            f61869e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, f61868d);
        }
        return f61869e;
    }

    public static void startInternal(Context context, int i, String str) {
        f61865a.mo60705d("start internal");
        Bundle bundle = new Bundle();
        bundle.putInt(f61866b, i);
        bundle.putString(f61867c, str);
        Intent intent = new Intent("me.veriff.STATUS_UPDATE");
        intent.putExtras(bundle);
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }

    public final void onHandleIntent(Intent intent) {
        int intExtra;
        C24465j jVar = f61865a;
        jVar.mo60705d("onHandleIntent started");
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    Bundle extras = intent.getExtras();
                    String str = f61867c;
                    if (extras.containsKey(str)) {
                        String string = intent.getExtras().getString(str, (String) null);
                        Bundle extras2 = intent.getExtras();
                        String str2 = f61866b;
                        if (extras2.containsKey(str2) && (intExtra = intent.getIntExtra(str2, Integer.MAX_VALUE)) != Integer.MAX_VALUE) {
                            jVar.mo60705d("onHandleIntent() - Internal status code handled");
                            onStatusChanged(string, intExtra);
                        }
                        C24452e.m61502a(m61480a(this));
                        f61865a.mo60705d("onHandleIntent done");
                        return;
                    }
                }
            } catch (Error e) {
                f61865a.mo60708e("onHandleIntent", e);
            } catch (Throwable th) {
                C24452e.m61502a(m61480a(this));
                throw th;
            }
        }
        jVar.mo60705d("Not enough data in the intent - don't know what to do..");
        C24452e.m61502a(m61480a(this));
    }

    public void onStatusChanged(String str, int i) {
    }
}
