package m40;

import android.content.Context;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Continuation;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p824tp.C19728f;
import p824tp.C19731i;
import q00.C19047a;
import s00.C19391d;

/* renamed from: m40.c */
public abstract class C5703c<R, CR> implements Continuation<R, CR> {

    /* renamed from: b */
    public final C5702b f18500b;

    /* renamed from: c */
    public final C5701a f18501c;

    /* renamed from: d */
    public final Context f18502d;

    /* renamed from: e */
    public final C13752e f18503e;

    /* renamed from: f */
    public final C19728f f18504f;

    /* renamed from: g */
    public final C19391d f18505g;

    /* renamed from: h */
    public final C19047a f18506h;

    /* renamed from: i */
    public final Time f18507i;

    /* renamed from: j */
    public final int f18508j;

    public C5703c(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time) {
        long j;
        C21100e.m49373x(bVar, "fetcher");
        this.f18500b = bVar;
        C21100e.m49373x(aVar, "cache");
        this.f18501c = aVar;
        C21100e.m49373x(eVar, "requestContext");
        this.f18502d = eVar.f33852a;
        this.f18503e = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f18504f = fVar;
        C19731i a = C19731i.m47197a(eVar.f33852a);
        a.getClass();
        this.f18505g = a.mo52085c(fVar.f50165a);
        C21100e.m49373x(aVar2, "configuration");
        this.f18506h = aVar2;
        TimeZone timeZone = fVar.f50165a.f16131f;
        if (time != null) {
            j = time.mo24631g();
        } else {
            j = System.currentTimeMillis();
        }
        SimpleDateFormat simpleDateFormat = C7925b.f23934a;
        this.f18508j = (int) ((j + ((long) timeZone.getOffset(j))) / 86400000);
        this.f18507i = time;
    }
}
