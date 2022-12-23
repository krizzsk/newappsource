package n20;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.moovit.network.model.ServerId;
import g30.C4789q;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;
import p988j$.util.DesugarTimeZone;
import s00.C19393f;

/* renamed from: n20.g */
public final class C18520g implements C18322a {
    /* renamed from: a */
    public final String mo50104a() {
        return "metro_updater";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        C4665k.C4666a b = C16530d.m42009b(this, 6, timeUnit, 2, timeUnit);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.CONNECTED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) {
        C19393f.f49325q.getClass();
        C19393f.m46692b(context);
        if (Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(12) == 0) {
            return new ListenableWorker.C1379a.C1381b();
        }
        C4789q.m12122d("daily_sync", (ServerId) null, -1);
        return new ListenableWorker.C1379a.C1382c();
    }
}
