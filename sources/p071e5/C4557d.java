package p071e5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.appcompat.app.C0262r;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import com.airbnb.lottie.model.layer.C1896b;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import p024b5.C1482d;
import p059d5.C4377i;
import p094g5.C4811j;
import p321y4.C7315c;

/* renamed from: e5.d */
public final class C4557d extends C1894a {

    /* renamed from: A */
    public final C7315c f15700A;

    /* renamed from: B */
    public final C1896b f15701B;

    public C4557d(C1876l lVar, Layer layer, C1896b bVar) {
        super(lVar, layer);
        this.f15701B = bVar;
        C7315c cVar = new C7315c(lVar, this, new C4377i(layer.f6585a, "__container", false));
        this.f15700A = cVar;
        cVar.mo6804b(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        super.mo6805d(rectF, matrix, z);
        this.f15700A.mo6805d(rectF, this.f6620l, z);
    }

    /* renamed from: j */
    public final void mo6811j(Canvas canvas, Matrix matrix, int i) {
        this.f15700A.mo6807f(canvas, matrix, i);
    }

    /* renamed from: k */
    public final C0262r mo6812k() {
        C0262r rVar = this.f6622n.f6607w;
        if (rVar != null) {
            return rVar;
        }
        return this.f15701B.f6622n.f6607w;
    }

    /* renamed from: l */
    public final C4811j mo6813l() {
        C4811j jVar = this.f6622n.f6608x;
        if (jVar != null) {
            return jVar;
        }
        return this.f15701B.f6622n.f6608x;
    }

    /* renamed from: p */
    public final void mo6817p(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        this.f15700A.mo5839c(dVar, i, arrayList, dVar2);
    }
}
