package wh0;

import bf0.C21050d;
import ff0.C23347a;
import java.util.concurrent.CancellationException;
import lf0.C24236l;
import wh0.C25232y0;

/* renamed from: wh0.i1 */
public final class C25185i1 extends C23347a implements C25232y0 {

    /* renamed from: c */
    public static final C25185i1 f63461c = new C25185i1();

    public C25185i1() {
        super(C25232y0.C25234b.f63506b);
    }

    /* renamed from: T */
    public final C25190k0 mo61770T(boolean z, boolean z2, C24236l<? super Throwable, C21050d> lVar) {
        return C25188j1.f63463b;
    }

    /* renamed from: a */
    public final void mo61776a(CancellationException cancellationException) {
    }

    /* renamed from: i */
    public final CancellationException mo61782i() {
        throw new IllegalStateException("This job is always active");
    }

    public final boolean isActive() {
        return true;
    }

    /* renamed from: j */
    public final C25201o mo61784j(C25163c1 c1Var) {
        return C25188j1.f63463b;
    }

    /* renamed from: l */
    public final C25190k0 mo61785l(C24236l<? super Throwable, C21050d> lVar) {
        return C25188j1.f63463b;
    }

    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
