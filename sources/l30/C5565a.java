package l30;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.Polyline;
import com.moovit.image.model.Image;
import com.moovit.map.C16281i;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import k00.C17988b;
import o20.C18708n;
import p304x.C7071l0;
import p693nz.C18659h;

/* renamed from: l30.a */
public final /* synthetic */ class C5565a implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ int f18188b;

    /* renamed from: c */
    public final /* synthetic */ Object f18189c;

    /* renamed from: d */
    public final /* synthetic */ Parcelable f18190d;

    public /* synthetic */ C5565a(Object obj, Parcelable parcelable, int i) {
        this.f18188b = i;
        this.f18189c = obj;
        this.f18190d = parcelable;
    }

    public final Object then(Task task) {
        switch (this.f18188b) {
            case 0:
                C5577i iVar = (C5577i) this.f18189c;
                ServerId serverId = (ServerId) this.f18190d;
                iVar.getClass();
                if (task.isSuccessful()) {
                    return task;
                }
                return iVar.mo21402b().onSuccessTask(MoovitExecutors.COMPUTATION, new C7071l0(serverId, 12));
            default:
                C5585p pVar = (C5585p) this.f18189c;
                Image image = (Image) this.f18190d;
                C18659h<String, Polyline> hVar = C5585p.f18297h;
                pVar.getClass();
                Context context = pVar.f18302a;
                String f = ((LocationDescriptor) task.getResult()).mo24313f();
                if (image == null) {
                    return Tasks.forResult(C16281i.m41513i(context, 0, C17988b.m44611b(0, context), f));
                }
                return Tasks.call(MoovitExecutors.f37327IO, new C18708n(context, image, f));
        }
    }
}
