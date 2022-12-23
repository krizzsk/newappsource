package p862vf;

import com.moovit.image.ImageProviderFragment;
import java.util.concurrent.Callable;
import l30.C5577i;

/* renamed from: vf.e */
public final /* synthetic */ class C20121e implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f51049b;

    /* renamed from: c */
    public final /* synthetic */ Object f51050c;

    public /* synthetic */ C20121e(Object obj, int i) {
        this.f51049b = i;
        this.f51050c = obj;
    }

    public final Object call() {
        switch (this.f51049b) {
            case 0:
                return ((C20122f) this.f51050c).mo52366a("firebase");
            case 1:
                return ImageProviderFragment.m40784m2((ImageProviderFragment) this.f51050c);
            default:
                return C5577i.m13787c(((C5577i) this.f51050c).f18277a);
        }
    }
}
