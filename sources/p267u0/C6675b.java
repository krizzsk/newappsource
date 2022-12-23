package p267u0;

import com.google.android.play.core.assetpacks.C14272h1;
import com.google.android.play.core.assetpacks.C14276i1;

/* renamed from: u0.b */
public final class C6675b implements C14272h1 {

    /* renamed from: b */
    public int f20756b;

    /* renamed from: c */
    public final Object f20757c = new Object[256];

    public /* synthetic */ C6675b(int i) {
    }

    /* renamed from: a */
    public final void mo22845a(Object obj) {
        int i = this.f20756b;
        Object[] objArr = (Object[]) this.f20757c;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f20756b = i + 1;
        }
    }

    public final Object zza() {
        ((C14276i1) this.f20757c).mo42840b(this.f20756b).f35864c.f35837d = 5;
        return null;
    }
}
