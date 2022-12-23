package z70;

import android.view.View;
import ce0.C21100e;
import java.util.List;
import o00.C18676l;
import p977zz.C20944i0;

/* renamed from: z70.e */
public final class C13327e extends C18676l.C18678b<C13321a> {

    /* renamed from: d */
    public final String f33086d;

    /* renamed from: e */
    public final C20944i0<Integer, View.OnClickListener> f33087e;

    /* renamed from: f */
    public final View f33088f;

    public C13327e(String str, String str2, List list, C20944i0 i0Var, View view) {
        super(str2, list);
        C21100e.m49373x(str, "providerId");
        this.f33086d = str;
        this.f33087e = i0Var;
        this.f33088f = view;
    }

    /* renamed from: e */
    public final int mo40089e() {
        if (this.f33088f == null) {
            return size();
        }
        return size() + 1;
    }
}
