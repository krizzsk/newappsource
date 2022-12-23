package com.moovit;

import android.content.Intent;
import android.os.ConditionVariable;
import androidx.core.app.JobIntentService;
import com.moovit.C14688a;
import com.moovit.car.operators.C15684a;
import java.io.IOException;
import java.util.HashSet;
import p358af.C13437d;
import p435de.C16596f;

public abstract class MoovitJobIntentService extends JobIntentService {

    /* renamed from: i */
    public final C14684a f37328i = new C14684a();

    /* renamed from: j */
    public final ConditionVariable f37329j = new ConditionVariable(false);

    /* renamed from: k */
    public C14688a f37330k;

    /* renamed from: com.moovit.MoovitJobIntentService$a */
    public class C14684a implements C14688a.C14690b {
        public C14684a() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            MoovitJobIntentService.this.f37329j.open();
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            MoovitJobIntentService.this.f37329j.open();
            MoovitJobIntentService moovitJobIntentService = MoovitJobIntentService.this;
            moovitJobIntentService.getClass();
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("MoovitJobIntentService: ");
            k.append(moovitJobIntentService.getClass().getSimpleName());
            a.mo49363b(k.toString());
            if (obj instanceof Throwable) {
                a.mo49364c((Throwable) obj);
                return;
            }
            a.mo49363b(String.valueOf(obj));
            a.mo49364c(new IOException(C13437d.m33706k("DataPart: ", str, " AppDataLoadingFailure")));
        }

        /* renamed from: d */
        public final /* synthetic */ void mo20302d(Object obj, String str) {
        }
    }

    /* renamed from: d */
    public final void mo3360d(Intent intent) {
        this.f37329j.block();
        if (this.f37330k.mo44593a()) {
            mo44581h(intent);
        }
    }

    /* renamed from: f */
    public final <T> T mo44578f(String str) {
        return this.f37330k.mo44594b(str);
    }

    /* renamed from: g */
    public HashSet mo44579g() {
        HashSet hashSet = new HashSet();
        hashSet.add("UPGRADER");
        hashSet.add("USER_CONTEXT");
        hashSet.add("USER_LOCALE_UPDATER");
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        hashSet.add("GTFS_CONFIGURATION");
        return hashSet;
    }

    public Object getSystemService(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1817785029:
                if (str.equals("user_context")) {
                    c = 0;
                    break;
                }
                break;
            case -598704137:
                if (str.equals("car_operator_provider_service")) {
                    c = 1;
                    break;
                }
                break;
            case -493109629:
                if (str.equals("twitter_service_alerts_feeds")) {
                    c = 2;
                    break;
                }
                break;
            case -433561463:
                if (str.equals("metro_context")) {
                    c = 3;
                    break;
                }
                break;
            case -168568736:
                if (str.equals("ab_testing_manager")) {
                    c = 4;
                    break;
                }
                break;
            case 635108337:
                if (str.equals("gtfs_configuration")) {
                    c = 5;
                    break;
                }
                break;
            case 1505637250:
                if (str.equals("user_configuration")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo44578f("USER_CONTEXT");
            case 1:
                return C15684a.m40087a();
            case 2:
                return mo44578f("TWITTER_SERVICE_ALERTS_FEEDS");
            case 3:
                return mo44578f("METRO_CONTEXT");
            case 4:
                return mo44578f("AB_TESTING_MANAGER");
            case 5:
                return mo44578f("GTFS_CONFIGURATION");
            case 6:
                return mo44578f("CONFIGURATION");
            default:
                return super.getSystemService(str);
        }
    }

    /* renamed from: h */
    public abstract void mo44581h(Intent intent);

    public final void onCreate() {
        super.onCreate();
        C14688a aVar = new C14688a(mo44579g(), this.f37328i);
        this.f37330k = aVar;
        if (aVar.mo44597e()) {
            this.f37329j.open();
        } else {
            this.f37329j.close();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f37330k.mo44596d();
    }
}
