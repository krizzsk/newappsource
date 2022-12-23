package p081f3;

import android.annotation.SuppressLint;
import androidx.work.ExistingWorkPolicy;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p092g3.C4759g;
import p092g3.C4763k;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: f3.n */
public abstract class C4669n {
    /* renamed from: a */
    public void mo20185a(C4658i iVar) {
        List singletonList = Collections.singletonList(iVar);
        C4763k kVar = (C4763k) this;
        if (!singletonList.isEmpty()) {
            new C4759g(kVar, (String) null, ExistingWorkPolicy.KEEP, singletonList, 0).mo20273e();
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: b */
    public void mo20186b(String str, ExistingWorkPolicy existingWorkPolicy, C4658i iVar) {
        new C4759g((C4763k) this, str, existingWorkPolicy, Collections.singletonList(iVar)).mo20273e();
    }

    /* renamed from: c */
    public abstract JSONObject mo20187c();

    /* renamed from: d */
    public abstract String mo20188d();
}
