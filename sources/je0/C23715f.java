package je0;

import android.view.View;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.search.SearchAction;
import com.moovit.app.search.locations.SearchLocationItem;
import java.util.Arrays;
import lh0.C24306u0;
import oh0.C24617f;

/* renamed from: je0.f */
public abstract class C23715f implements C23717h {
    /* renamed from: b */
    public static final void m58229b(short[] sArr) {
        Arrays.fill(sArr, 1024);
    }

    /* renamed from: c */
    public abstract void mo45833c(View view, SearchLocationItem searchLocationItem, SearchAction searchAction);

    /* renamed from: d */
    public abstract C24306u0 mo58949d(C24617f fVar);

    /* renamed from: f */
    public void mo58950f(C23716g gVar) {
        if (gVar != null) {
            try {
                mo58916g(gVar);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                C14226d.m35340G0(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } else {
            throw new NullPointerException("observer is null");
        }
    }

    /* renamed from: g */
    public abstract void mo58916g(C23716g gVar);
}
