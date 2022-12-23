package wh0;

import bf0.C21050d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import lf0.C24236l;

/* renamed from: wh0.y0 */
public interface C25232y0 extends CoroutineContext.C23827a {

    /* renamed from: j0 */
    public static final /* synthetic */ int f63505j0 = 0;

    /* renamed from: wh0.y0$a */
    public static final class C25233a {
        /* renamed from: a */
        public static /* synthetic */ C25190k0 m63328a(C25232y0 y0Var, boolean z, C25158b1 b1Var, int i) {
            boolean z2 = false;
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return y0Var.mo61770T(z, z2, b1Var);
        }
    }

    /* renamed from: wh0.y0$b */
    public static final class C25234b implements CoroutineContext.C23829b<C25232y0> {

        /* renamed from: b */
        public static final /* synthetic */ C25234b f63506b = new C25234b();
    }

    /* renamed from: T */
    C25190k0 mo61770T(boolean z, boolean z2, C24236l<? super Throwable, C21050d> lVar);

    /* renamed from: a */
    void mo61776a(CancellationException cancellationException);

    /* renamed from: i */
    CancellationException mo61782i();

    boolean isActive();

    /* renamed from: j */
    C25201o mo61784j(C25163c1 c1Var);

    /* renamed from: l */
    C25190k0 mo61785l(C24236l<? super Throwable, C21050d> lVar);

    boolean start();

    /* renamed from: v */
    boolean mo61795v();
}
