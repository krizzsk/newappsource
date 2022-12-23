package p435de;

import android.os.Bundle;
import java.util.Locale;
import p483fe.C16954b;
import p836ud.C19885a;

/* renamed from: de.b */
public final class C16592b implements C19885a.C19886a {

    /* renamed from: a */
    public C16954b f43238a;

    /* renamed from: b */
    public C16954b f43239b;

    /* renamed from: a */
    public final void mo49361a(int i, Bundle bundle) {
        C16954b bVar;
        String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle});
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = this.f43238a;
            } else {
                bVar = this.f43239b;
            }
            if (bVar != null) {
                bVar.mo49580a(bundle2, string);
            }
        }
    }
}
