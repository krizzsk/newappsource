package p330z2;

import android.view.View;
import android.view.WindowId;

/* renamed from: z2.a0 */
public final class C7422a0 implements C7424b0 {

    /* renamed from: a */
    public final WindowId f22818a;

    public C7422a0(View view) {
        this.f22818a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7422a0) && ((C7422a0) obj).f22818a.equals(this.f22818a);
    }

    public final int hashCode() {
        return this.f22818a.hashCode();
    }
}
