package p100gb;

import android.os.Handler;
import com.google.android.exoplayer2.drm.C3912b;
import java.io.IOException;
import p099ga.C4879e1;
import p099ga.C4901j0;
import p265tb.C6658j;
import p265tb.C6671u;

/* renamed from: gb.o */
public interface C4987o {

    /* renamed from: gb.o$a */
    public static final class C4988a extends C4986n {
        public C4988a(Object obj) {
            super(obj, -1, -1, -1, -1);
        }

        /* renamed from: b */
        public final C4988a mo20691b(Object obj) {
            C4986n nVar;
            if (this.f16857a.equals(obj)) {
                nVar = this;
            } else {
                nVar = new C4986n(obj, this.f16858b, this.f16859c, this.f16860d, this.f16861e);
            }
            return new C4988a(nVar);
        }

        public C4988a(Object obj, long j, int i) {
            super(obj, -1, -1, j, i);
        }

        public C4988a(C4986n nVar) {
            super(nVar);
        }

        public C4988a(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j, -1);
        }
    }

    /* renamed from: gb.o$b */
    public interface C4989b {
        /* renamed from: a */
        void mo20578a(C4879e1 e1Var);
    }

    /* renamed from: a */
    void mo20682a(C4984m mVar);

    /* renamed from: b */
    void mo20616b(C4989b bVar);

    /* renamed from: c */
    C4901j0 mo20683c();

    /* renamed from: d */
    void mo20617d(C4989b bVar, C6671u uVar);

    /* renamed from: e */
    void mo20618e(C4995u uVar);

    /* renamed from: f */
    void mo20619f(Handler handler, C4995u uVar);

    /* renamed from: g */
    C4984m mo20684g(C4988a aVar, C6658j jVar, long j);

    /* renamed from: h */
    void mo20620h(C4989b bVar);

    /* renamed from: i */
    void mo20621i(Handler handler, C3912b bVar);

    /* renamed from: j */
    void mo20622j(C3912b bVar);

    /* renamed from: k */
    void mo20685k() throws IOException;

    /* renamed from: l */
    void mo20623l();

    /* renamed from: m */
    void mo20624m();

    /* renamed from: n */
    void mo20625n(C4989b bVar);
}
