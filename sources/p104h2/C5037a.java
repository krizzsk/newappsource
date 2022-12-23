package p104h2;

import android.os.Bundle;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1037q0;
import p117i2.C5260b;

/* renamed from: h2.a */
public abstract class C5037a {

    /* renamed from: h2.a$a */
    public interface C5038a<D> {
        C5260b<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C5260b<D> bVar, D d);

        void onLoaderReset(C5260b<D> bVar);
    }

    /* renamed from: a */
    public static C5039b m12866a(C1033p pVar) {
        return new C5039b(pVar, ((C1037q0) pVar).getViewModelStore());
    }

    /* renamed from: b */
    public abstract C5260b mo20760b(C5038a aVar);
}
