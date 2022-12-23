package p457ec;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.C13924b;
import p242s1.C6315a;
import p255t1.C6531g;

/* renamed from: ec.e */
public final class C16805e extends C6315a {

    /* renamed from: a */
    public final /* synthetic */ C13924b f43760a;

    public C16805e(C13924b bVar) {
        this.f43760a = bVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
        super.onInitializeAccessibilityNodeInfo(view, gVar);
        if (this.f43760a.f34423j) {
            gVar.mo22634a(1048576);
            gVar.f20334a.setDismissable(true);
            return;
        }
        gVar.f20334a.setDismissable(false);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            C13924b bVar = this.f43760a;
            if (bVar.f34423j) {
                bVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
