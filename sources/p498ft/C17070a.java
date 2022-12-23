package p498ft;

import com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup;
import r00.C19215g;

/* renamed from: ft.a */
public final class C17070a {

    /* renamed from: a */
    public static final C17071a f44253a = new C17071a();

    /* renamed from: ft.a$a */
    public static final class C17071a extends C19215g<Integer> {

        /* renamed from: ft.a$a$a */
        public /* synthetic */ class C17072a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f44254a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup[] r0 = com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup r1 = com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup.GROUP_A     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup r1 = com.tranzmate.moovit.protocol.conf.MVSmartComponentRandomABTestingGroup.GROUP_B     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f44254a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p498ft.C17070a.C17071a.C17072a.<clinit>():void");
            }
        }

        public C17071a() {
            super("SMART_COMPONENT_RANDOM_TEST", 0);
        }

        /* renamed from: b */
        public final Object mo49672b(String str) {
            int i = C17072a.f44254a[MVSmartComponentRandomABTestingGroup.valueOf(str).ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    i2 = 0;
                } else {
                    i2 = 2;
                }
            }
            return Integer.valueOf(i2);
        }
    }
}
