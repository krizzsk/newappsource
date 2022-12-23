package p835uc;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p242s1.C6315a;
import p255t1.C6531g;

/* renamed from: uc.e */
public final class C19882e extends C6315a {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f50496a;

    public C19882e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f50496a = baseTransientBottomBar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
        super.onInitializeAccessibilityNodeInfo(view, gVar);
        gVar.mo22634a(1048576);
        gVar.f20334a.setDismissable(true);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.f50496a.mo42225b();
        return true;
    }
}
