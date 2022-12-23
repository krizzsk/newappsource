package p021b2;

import android.widget.EditText;
import mf0.C24361g;

/* renamed from: b2.a */
public final class C1444a {

    /* renamed from: a */
    public final C1445a f5300a;

    /* renamed from: b2.a$a */
    public static class C1445a extends C1446b {

        /* renamed from: a */
        public final EditText f5301a;

        /* renamed from: b */
        public final C1458g f5302b;

        public C1445a(EditText editText) {
            this.f5301a = editText;
            C1458g gVar = new C1458g(editText);
            this.f5302b = gVar;
            editText.addTextChangedListener(gVar);
            if (C1447b.f5304b == null) {
                synchronized (C1447b.f5303a) {
                    if (C1447b.f5304b == null) {
                        C1447b.f5304b = new C1447b();
                    }
                }
            }
            editText.setEditableFactory(C1447b.f5304b);
        }
    }

    /* renamed from: b2.a$b */
    public static class C1446b {
    }

    public C1444a(EditText editText) {
        C24361g.m61185s(editText, "editText cannot be null");
        this.f5300a = new C1445a(editText);
    }
}
