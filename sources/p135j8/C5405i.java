package p135j8;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import mf0.C24362h;
import p009a8.C0115o;

/* renamed from: j8.i */
public final class C5405i {

    /* renamed from: a */
    public final Long f17746a;

    /* renamed from: b */
    public Long f17747b;

    /* renamed from: c */
    public UUID f17748c;

    /* renamed from: d */
    public int f17749d;

    /* renamed from: e */
    public Long f17750e;

    /* renamed from: f */
    public C5407k f17751f;

    public C5405i(Long l, Long l2) {
        UUID randomUUID = UUID.randomUUID();
        C24362h.m61210e(randomUUID, "randomUUID()");
        this.f17746a = l;
        this.f17747b = l2;
        this.f17748c = randomUUID;
    }

    /* renamed from: a */
    public final void mo21171a() {
        long j;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C0115o.m210a()).edit();
        Long l = this.f17746a;
        long j2 = 0;
        if (l == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", j);
        Long l2 = this.f17747b;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j2);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f17749d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f17748c.toString());
        edit.apply();
        C5407k kVar = this.f17751f;
        if (kVar != null && kVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(C0115o.m210a()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", kVar.f17755a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", kVar.f17756b);
            edit2.apply();
        }
    }
}
