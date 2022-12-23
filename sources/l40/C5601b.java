package l40;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import f30.C4677d;
import java.util.UUID;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p824tp.C19722a0;
import p824tp.C19731i;

/* renamed from: l40.b */
public final class C5601b {

    /* renamed from: a */
    public final Context f18333a;

    /* renamed from: b */
    public final String f18334b = UUID.randomUUID().toString();

    /* renamed from: c */
    public final FirebaseAnalytics f18335c;

    /* renamed from: d */
    public final C19722a0 f18336d;

    /* renamed from: e */
    public long f18337e;

    /* renamed from: l40.b$a */
    public static class C5602a extends C13712f {

        /* renamed from: c */
        public final String f18338c;

        /* renamed from: d */
        public final C19722a0 f18339d;

        public C5602a(Context context, C19722a0 a0Var, String str) {
            super(context);
            C21100e.m49373x(str, "tag");
            this.f18338c = str;
            C21100e.m49373x(a0Var, "userContext");
            this.f18339d = a0Var;
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            return C4677d.m11988a(this.f33791b, this.f18339d, this.f18338c);
        }
    }

    public C5601b(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f18333a = applicationContext;
        this.f18335c = FirebaseAnalytics.getInstance(applicationContext);
        this.f18336d = (C19722a0) applicationContext.getSystemService("user_context");
        this.f18337e = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo21425a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f18337e;
        Bundle b = C25541a.m63872b("type", "start");
        b.putString("item_id", this.f18334b);
        b.putLong(InAppMessageBase.DURATION, elapsedRealtime);
        this.f18335c.mo43247a(b, "graph_build");
        if (this.f18336d != null) {
            C19731i.m47197a(this.f18333a).f50172b.mo42913b(new C5602a(this.f18333a, this.f18336d, this.f18334b + "___start:" + elapsedRealtime), true);
        }
        this.f18337e = SystemClock.elapsedRealtime();
    }
}
