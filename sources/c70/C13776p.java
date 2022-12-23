package c70;

import android.os.ConditionVariable;
import com.moovit.commons.utils.collections.CollectionHashMap;
import java.util.ArrayList;
import p241s0.C6302b;

/* renamed from: c70.p */
public final class C13776p extends C13774o {

    /* renamed from: g */
    public final ConditionVariable f33919g = new ConditionVariable();

    public C13776p(ArrayList arrayList) {
        super(arrayList);
    }

    /* renamed from: a */
    public final void mo40704a(CollectionHashMap.ArrayListHashMap arrayListHashMap, C6302b bVar) {
        this.f33919g.open();
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(true);
        this.f33919g.open();
        return cancel;
    }
}
