package s40;

import android.os.ConditionVariable;
import android.util.SparseBooleanArray;
import com.moovit.util.time.C7923a;
import java.io.IOException;
import l40.C5605d;
import q40.C6177b;

/* renamed from: s40.g */
public final class C6469g extends C6466e {

    /* renamed from: s40.g$a */
    public static class C6470a extends C5605d.C5611f {

        /* renamed from: a */
        public final int f20203a;

        /* renamed from: b */
        public final byte f20204b;

        /* renamed from: c */
        public final SparseBooleanArray f20205c;

        /* renamed from: d */
        public int f20206d = -1;

        public C6470a(byte b, int i) {
            this.f20203a = i;
            this.f20204b = b;
            this.f20205c = new SparseBooleanArray();
        }
    }

    /* renamed from: b */
    public static SparseBooleanArray m15360b(C6465d dVar, int i) throws IOException {
        ConditionVariable conditionVariable;
        int i2;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) dVar.f20185b.f19560c.get(Integer.valueOf(i));
        if (sparseBooleanArray != null) {
            return sparseBooleanArray;
        }
        C6177b bVar = dVar.f20185b;
        synchronized (bVar.f19561d) {
            conditionVariable = bVar.f19561d.get(Integer.valueOf(i));
            if (conditionVariable == null) {
                conditionVariable = new ConditionVariable(true);
                bVar.f19561d.put(Integer.valueOf(i), conditionVariable);
            }
        }
        conditionVariable.block();
        conditionVariable.close();
        try {
            SparseBooleanArray sparseBooleanArray2 = (SparseBooleanArray) dVar.f20185b.f19560c.get(Integer.valueOf(i));
            if (sparseBooleanArray2 == null) {
                int i3 = C7923a.m18011k(dVar.f20187d, i).get(7);
                switch (i3) {
                    case 1:
                        i2 = 6;
                        break;
                    case 2:
                        i2 = 0;
                        break;
                    case 3:
                        i2 = 1;
                        break;
                    case 4:
                        i2 = 2;
                        break;
                    case 5:
                        i2 = 3;
                        break;
                    case 6:
                        i2 = 4;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        throw new IllegalStateException("Unknown day of week: " + i3);
                }
                C6470a aVar = new C6470a((byte) (1 << i2), i);
                dVar.f20184a.mo21436d(aVar);
                sparseBooleanArray2 = aVar.f20205c;
                dVar.f20185b.f19560c.put(Integer.valueOf(i), sparseBooleanArray2);
            }
            return sparseBooleanArray2;
        } finally {
            dVar.f20185b.mo22159a(i);
        }
    }

    /* renamed from: a */
    public final void mo22585a(C6465d dVar) throws Exception {
        dVar.f20193j = m15360b(dVar, dVar.f20189f - 1);
        dVar.f20194k = m15360b(dVar, dVar.f20189f);
    }
}
