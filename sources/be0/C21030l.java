package be0;

import android.content.Context;
import android.view.MotionEvent;
import xd0.C25242a;
import xd0.C25246d;
import yd0.C25287b;
import yd0.C25290d;
import yd0.C25291e;

/* renamed from: be0.l */
public final class C21030l extends C21007a<C25290d> implements C25291e {

    /* renamed from: h */
    public C25290d f52813h;

    /* renamed from: be0.l$a */
    public class C21031a implements C21032m {
        public C21031a() {
        }

        /* renamed from: a */
        public final void mo53144a(MotionEvent motionEvent) {
            C25290d dVar = C21030l.this.f52813h;
            if (dVar != null) {
                dVar.mo61894a(motionEvent);
            }
        }
    }

    public C21030l(Context context, C21012c cVar, C25246d dVar, C25242a aVar) {
        super(context, cVar, dVar, aVar);
        this.f52763e.setOnViewTouchListener(new C21031a());
    }

    /* renamed from: g */
    public final void mo53142g() {
        C21012c cVar = this.f52763e;
        cVar.f52773c.setFlags(1024, 1024);
        cVar.f52773c.getDecorView().setBackgroundColor(-16777216);
    }

    /* renamed from: j */
    public final void mo53134j(String str) {
        this.f52763e.mo53108d(str);
    }

    public final void setPresenter(C25287b bVar) {
        this.f52813h = (C25290d) bVar;
    }

    public final void setVisibility(boolean z) {
        this.f52763e.setVisibility(0);
    }
}
