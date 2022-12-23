package p811tc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import p787sc.C19444a;
import p811tc.C19659n;

/* renamed from: tc.m */
public final class C19658m extends C19659n.C19665f {

    /* renamed from: b */
    public final /* synthetic */ List f49924b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f49925c;

    public C19658m(ArrayList arrayList, Matrix matrix) {
        this.f49924b = arrayList;
        this.f49925c = matrix;
    }

    /* renamed from: a */
    public final void mo52030a(Matrix matrix, C19444a aVar, int i, Canvas canvas) {
        for (C19659n.C19665f a : this.f49924b) {
            a.mo52030a(this.f49925c, aVar, i, canvas);
        }
    }
}
