package p054d0;

import androidx.camera.core.impl.C0581f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p066e0.C4449p;

/* renamed from: d0.o */
public final class C4298o {

    /* renamed from: d0.o$a */
    public static final class C4299a implements C4449p {

        /* renamed from: a */
        public final List<C0581f> f15228a;

        public C4299a(List<C0581f> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f15228a = Collections.unmodifiableList(new ArrayList(list));
        }

        public final List<C0581f> getCaptureStages() {
            return this.f15228a;
        }
    }

    /* renamed from: a */
    public static C4299a m11451a() {
        return new C4299a(Arrays.asList(new C0581f[]{new C0581f.C0582a()}));
    }
}
