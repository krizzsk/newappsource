package zh0;

import ai0.C20998b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.flow.StateFlowImpl;
import mf0.C24368m;

/* renamed from: zh0.m */
public final class C25532m extends C20998b<StateFlowImpl<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63789a = AtomicReferenceFieldUpdater.newUpdater(C25532m.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    /* renamed from: a */
    public final boolean mo53078a(Object obj) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) obj;
        if (this._state != null) {
            return false;
        }
        this._state = C24368m.f61703o;
        return true;
    }
}
