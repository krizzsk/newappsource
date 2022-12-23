package p242s1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import mf0.C24362h;
import th0.C25003h;

/* renamed from: s1.k0 */
public final class C6371k0 implements C25003h<View> {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f20023a;

    public C6371k0(ViewGroup viewGroup) {
        this.f20023a = viewGroup;
    }

    public final Iterator<View> iterator() {
        ViewGroup viewGroup = this.f20023a;
        C24362h.m61211f(viewGroup, "<this>");
        return new C6374l0(viewGroup);
    }
}
