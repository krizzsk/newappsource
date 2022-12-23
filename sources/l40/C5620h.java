package l40;

import ce0.C21100e;
import com.moovit.MoovitActivity;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import l40.C5599a;
import p398bv.C13693c;
import p824tp.C19728f;
import p977zz.C20932c0;

/* renamed from: l40.h */
public final class C5620h implements C5599a.C5600a {

    /* renamed from: a */
    public final ExecutorService f18357a = Executors.newSingleThreadExecutor(new C20932c0((String) null, 10));

    public C5620h(MoovitActivity moovitActivity, C5618f fVar, long j, C13693c.C13694a aVar) {
        C21100e.m49373x(moovitActivity, "activity");
        moovitActivity.mo44548x1();
        C19728f fVar2 = (C19728f) moovitActivity.mo44537r1("METRO_CONTEXT");
        C21100e.m49373x(fVar, "tripPlanner");
        Integer num = 10;
        C21100e.m49373x(num, "nextItinerariesCount");
        num.intValue();
        new ArrayList();
        new AtomicBoolean(false);
    }
}
