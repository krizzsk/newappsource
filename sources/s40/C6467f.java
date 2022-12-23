package s40;

import android.os.ConditionVariable;
import android.util.SparseIntArray;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import l40.C5605d;
import p977zz.C20944i0;
import q40.C6177b;

/* renamed from: s40.f */
public final class C6467f extends C6466e {

    /* renamed from: s40.f$a */
    public static class C6468a extends C5605d.C5615j {

        /* renamed from: a */
        public final int f20200a;

        /* renamed from: b */
        public SparseIntArray f20201b;

        /* renamed from: c */
        public int f20202c = -1;

        public C6468a(int i) {
            this.f20200a = i;
        }
    }

    /* renamed from: b */
    public static SparseIntArray m15358b(C6465d dVar, int i) throws IOException {
        ConditionVariable conditionVariable;
        ServerId serverId = dVar.f20191h;
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.f20185b.f19562e.get(new C20944i0(Integer.valueOf(i), serverId));
        if (sparseIntArray != null) {
            return sparseIntArray;
        }
        C6177b bVar = dVar.f20185b;
        bVar.getClass();
        C20944i0 i0Var = new C20944i0(Integer.valueOf(i), serverId);
        synchronized (bVar.f19563f) {
            conditionVariable = bVar.f19563f.get(i0Var);
            if (conditionVariable == null) {
                conditionVariable = new ConditionVariable(true);
                bVar.f19563f.put(i0Var, conditionVariable);
            }
        }
        conditionVariable.block();
        conditionVariable.close();
        try {
            SparseIntArray sparseIntArray2 = (SparseIntArray) dVar.f20185b.f19562e.get(new C20944i0(Integer.valueOf(i), serverId));
            if (sparseIntArray2 == null) {
                if (dVar.f20192i.f19711e[dVar.f20192i.f19710d.get(dVar.f20191h.f15142b)] > 0) {
                    C5605d dVar2 = dVar.f20184a;
                    C6468a aVar = new C6468a(i);
                    dVar2.mo21438g(aVar);
                    sparseIntArray2 = aVar.f20201b;
                } else {
                    sparseIntArray2 = new SparseIntArray(0);
                }
                dVar.f20185b.f19562e.put(new C20944i0(Integer.valueOf(i), serverId), sparseIntArray2);
            }
            return sparseIntArray2;
        } finally {
            dVar.f20185b.mo22160b(i, dVar.f20191h);
        }
    }

    /* renamed from: a */
    public final void mo22585a(C6465d dVar) throws Exception {
        dVar.f20195l = m15358b(dVar, dVar.f20189f - 1);
        dVar.f20196m = m15358b(dVar, dVar.f20189f);
    }
}
