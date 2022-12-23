package p835uc;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p242s1.C6391t;
import p242s1.C6396v0;

/* renamed from: uc.d */
public final class C19881d implements C6391t {

    /* renamed from: b */
    public final /* synthetic */ BaseTransientBottomBar f50495b;

    public C19881d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f50495b = baseTransientBottomBar;
    }

    public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
        this.f50495b.f35314g = v0Var.mo22503b();
        this.f50495b.f35315h = v0Var.mo22504c();
        this.f50495b.f35316i = v0Var.mo22505d();
        this.f50495b.mo42232i();
        return v0Var;
    }
}
