package p280v1;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p280v1.C6842e;
import p304x.C7038d0;

/* renamed from: v1.b */
public final class C6839b extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C6841d f21182a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6839b(InputConnection inputConnection, C7038d0 d0Var) {
        super(inputConnection, false);
        this.f21182a = d0Var;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C6842e eVar;
        C6841d dVar = this.f21182a;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            eVar = new C6842e(new C6842e.C6843a(inputContentInfo));
        } else {
            eVar = null;
        }
        if (((C7038d0) dVar).mo23297a(eVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
