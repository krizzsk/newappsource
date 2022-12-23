package p081f3;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p081f3.C4670o;

/* renamed from: f3.i */
public final class C4658i extends C4670o {

    /* renamed from: f3.i$a */
    public static final class C4659a extends C4670o.C4671a<C4659a, C4658i> {
        public C4659a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f15909c.f19085d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: c */
        public final C4670o mo20180c() {
            if (!this.f15907a || Build.VERSION.SDK_INT < 23 || !this.f15909c.f19091j.f15879c) {
                return new C4658i(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: d */
        public final C4670o.C4671a mo20181d() {
            return this;
        }
    }

    public C4658i(C4659a aVar) {
        super(aVar.f15908b, aVar.f15909c, aVar.f15910d);
    }
}
