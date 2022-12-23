package p921xq;

import android.os.SystemClock;
import ce0.C21100e;
import com.appboy.models.outgoing.AttributionData;
import com.moovit.MoovitApplication;
import java.util.concurrent.TimeUnit;
import p583jk.C17884p;

/* renamed from: xq.a */
public abstract class C20554a<A> {

    /* renamed from: h */
    public static final long f51987h = TimeUnit.HOURS.toMillis(1);

    /* renamed from: i */
    public static final long f51988i = TimeUnit.MINUTES.toMillis(45);

    /* renamed from: a */
    public final boolean f51989a;

    /* renamed from: b */
    public final String f51990b;

    /* renamed from: c */
    public final String f51991c;

    /* renamed from: d */
    public final String f51992d;

    /* renamed from: e */
    public final String f51993e;

    /* renamed from: f */
    public final A f51994f;

    /* renamed from: g */
    public final long f51995g = SystemClock.elapsedRealtime();

    /* renamed from: xq.a$a */
    public interface C20555a<I, O> {
        /* renamed from: a */
        Boolean mo44726a(MoovitApplication moovitApplication, C20556b bVar, Object obj);

        /* renamed from: b */
        Boolean mo44727b(C20558d dVar, Object obj);

        /* renamed from: c */
        Boolean mo44728c(MoovitApplication moovitApplication, C20557c cVar, Object obj);
    }

    public C20554a(boolean z, String str, String str2, String str3, String str4, A a) {
        this.f51989a = z;
        C21100e.m49373x(str, "adInitiator");
        this.f51990b = str;
        C21100e.m49373x(str2, "adUnitIdKey");
        this.f51991c = str2;
        C21100e.m49373x(str3, "adUnitId");
        this.f51992d = str3;
        C21100e.m49373x(str4, "adId");
        this.f51993e = str4;
        C21100e.m49373x(a, AttributionData.CREATIVE_KEY);
        this.f51994f = a;
    }

    /* renamed from: a */
    public abstract <I, O> O mo52755a(MoovitApplication<?, ?, ?> moovitApplication, C20555a<I, O> aVar, I i);

    /* renamed from: b */
    public abstract String mo52756b();

    /* renamed from: c */
    public abstract String mo52757c();

    /* renamed from: d */
    public abstract String mo52758d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20554a)) {
            return false;
        }
        C20554a aVar = (C20554a) obj;
        if (!this.f51992d.equals(aVar.f51992d) || !this.f51993e.equals(aVar.f51993e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f51992d), C17884p.m44335F(this.f51993e));
    }
}
