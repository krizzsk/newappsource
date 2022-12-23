package p176n0;

import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import p067e1.C4493i0;
import p229r1.C6231a;

/* renamed from: n0.n */
public final /* synthetic */ class C5795n implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ int f18747a;

    /* renamed from: b */
    public final /* synthetic */ Object f18748b;

    public /* synthetic */ C5795n(Object obj, int i) {
        this.f18747a = i;
        this.f18748b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f18747a) {
            case 0:
                ((CallbackToFutureAdapter.C0673a) this.f18748b).mo2697b((SurfaceRequest.C0535e) obj);
                return;
            default:
                FragmentManager fragmentManager = (FragmentManager) this.f18748b;
                C4493i0 i0Var = (C4493i0) obj;
                if (fragmentManager.mo3932L()) {
                    boolean z = i0Var.f15575a;
                    for (Fragment next : fragmentManager.f3624c.mo4104f()) {
                        if (next != null) {
                            next.performPictureInPictureModeChanged(z);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
