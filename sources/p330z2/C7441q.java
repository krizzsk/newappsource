package p330z2;

import android.view.View;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import p001a0.C0016g;

/* renamed from: z2.q */
public final class C7441q {

    /* renamed from: a */
    public final HashMap f22854a = new HashMap();

    /* renamed from: b */
    public View f22855b;

    /* renamed from: c */
    public final ArrayList<Transition> f22856c = new ArrayList<>();

    @Deprecated
    public C7441q() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7441q)) {
            return false;
        }
        C7441q qVar = (C7441q) obj;
        if (this.f22855b != qVar.f22855b || !this.f22854a.equals(qVar.f22854a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22854a.hashCode() + (this.f22855b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TransitionValues@");
        k.append(Integer.toHexString(hashCode()));
        k.append(":\n");
        StringBuilder t = C0016g.m36t(k.toString(), "    view = ");
        t.append(this.f22855b);
        t.append("\n");
        String k2 = C25541a.m63881k(t.toString(), "    values:");
        for (String str : this.f22854a.keySet()) {
            k2 = k2 + "    " + str + ": " + this.f22854a.get(str) + "\n";
        }
        return k2;
    }

    public C7441q(View view) {
        this.f22855b = view;
    }
}
