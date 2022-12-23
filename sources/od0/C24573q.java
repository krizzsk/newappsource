package od0;

import com.google.gson.Gson;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import p359ag.C13450g;
import p359ag.C13452i;

/* renamed from: od0.q */
public final class C24573q {

    /* renamed from: d */
    public static final Gson f62300d = new Gson();

    /* renamed from: a */
    public SessionEvent f62301a;

    /* renamed from: b */
    public int f62302b;

    /* renamed from: c */
    public C13452i f62303c;

    public C24573q(String str, int i) {
        this.f62303c = (C13452i) f62300d.fromJson(str, C13452i.class);
        this.f62302b = i;
    }

    /* renamed from: a */
    public final String mo60845a(SessionAttribute sessionAttribute) {
        C13450g I = this.f62303c.mo40351I(sessionAttribute.toString());
        if (I != null) {
            return I.mo40326B();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C24573q)) {
            return false;
        }
        C24573q qVar = (C24573q) obj;
        if (this.f62301a.equals(qVar.f62301a) && this.f62303c.equals(qVar.f62303c)) {
            return true;
        }
        return false;
    }

    public C24573q(SessionEvent sessionEvent, C13452i iVar) {
        this.f62301a = sessionEvent;
        this.f62303c = iVar;
        iVar.mo40348E(SessionAttribute.TIMESTAMP.toString(), Long.valueOf(System.currentTimeMillis()));
    }
}
