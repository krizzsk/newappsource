package l30;

import b40.C1472a;
import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.micromobility.ride.MicroMobilityRide;
import java.util.Set;

/* renamed from: l30.d */
public final /* synthetic */ class C5571d implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ Object f18236b;

    /* renamed from: c */
    public final /* synthetic */ Object f18237c;

    /* renamed from: d */
    public final /* synthetic */ Object f18238d;

    public /* synthetic */ C5571d(String str, String str2, Set set) {
        this.f18236b = str;
        this.f18237c = str2;
        this.f18238d = set;
    }

    public final Task then(Object obj) {
        String str = (String) this.f18236b;
        String str2 = (String) this.f18237c;
        MicroMobilityRide microMobilityRide = (MicroMobilityRide) C13723g.m34286g(((C1472a) obj).f5348a, new C5576h(str, str2, (Set) this.f18238d));
        if (microMobilityRide != null) {
            return Tasks.forResult(microMobilityRide);
        }
        return Tasks.forException(new ApplicationBugException(C25541a.m63882l("Couldn't find ride history with service id= ", str, ", item id=", str2)));
    }
}
