package q40;

import android.content.Context;
import ce0.C21100e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.ApplicationBugException;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p824tp.C19728f;
import p824tp.C19731i;

/* renamed from: q40.a */
public abstract class C6176a<S> implements Callable<S>, OnCompleteListener<S> {

    /* renamed from: b */
    public final Context f19554b;

    /* renamed from: c */
    public final C19728f f19555c;

    /* renamed from: d */
    public final S f19556d;

    /* renamed from: e */
    public final AtomicBoolean f19557e = new AtomicBoolean(false);

    public C6176a(Context context, C19728f fVar, S s) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f19554b = context;
        C21100e.m49373x(fVar, "metroContext");
        this.f19555c = fVar;
        this.f19556d = s;
    }

    /* renamed from: a */
    public abstract void mo22156a(S s);

    /* renamed from: b */
    public abstract void mo22157b(S s);

    public final S call() throws Exception {
        C6178c o = C19731i.m47197a(this.f19554b).mo52086d(this.f19555c).mo51802d().mo52123o(this.f19554b);
        Context context = this.f19554b;
        C19728f fVar = this.f19555c;
        o.getClass();
        if (C6178c.m14732b(context, fVar)) {
            mo22156a(this.f19556d);
            this.f19557e.set(true);
            return this.f19556d;
        }
        throw new ApplicationBugException("GTFS data files are invalid!");
    }

    public final void onComplete(Task<S> task) {
        if (this.f19557e.get()) {
            mo22157b(this.f19556d);
        }
    }
}
