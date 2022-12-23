package p305x0;

import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: x0.b */
public final class C7129b {

    /* renamed from: a */
    public final ArrayList<ConstraintWidget> f22147a = new ArrayList<>();

    /* renamed from: b */
    public C7130a f22148b = new C7130a();

    /* renamed from: c */
    public C0697d f22149c;

    /* renamed from: x0.b$a */
    public static class C7130a {

        /* renamed from: a */
        public ConstraintWidget.DimensionBehaviour f22150a;

        /* renamed from: b */
        public ConstraintWidget.DimensionBehaviour f22151b;

        /* renamed from: c */
        public int f22152c;

        /* renamed from: d */
        public int f22153d;

        /* renamed from: e */
        public int f22154e;

        /* renamed from: f */
        public int f22155f;

        /* renamed from: g */
        public int f22156g;

        /* renamed from: h */
        public boolean f22157h;

        /* renamed from: i */
        public boolean f22158i;

        /* renamed from: j */
        public int f22159j;
    }

    /* renamed from: x0.b$b */
    public interface C7131b {
    }

    public C7129b(C0697d dVar) {
        this.f22149c = dVar;
    }

    /* renamed from: a */
    public final boolean mo23379a(int i, ConstraintWidget constraintWidget, C7131b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C7130a aVar = this.f22148b;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f2405V;
        aVar.f22150a = dimensionBehaviourArr[0];
        boolean z5 = true;
        aVar.f22151b = dimensionBehaviourArr[1];
        aVar.f22152c = constraintWidget.mo2807u();
        this.f22148b.f22153d = constraintWidget.mo2802o();
        C7130a aVar2 = this.f22148b;
        aVar2.f22158i = false;
        aVar2.f22159j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar2.f22150a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z = true;
        } else {
            z = false;
        }
        if (aVar2.f22151b == dimensionBehaviour2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || constraintWidget.f2409Z <= BitmapDescriptorFactory.HUE_RED) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || constraintWidget.f2409Z <= BitmapDescriptorFactory.HUE_RED) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 && constraintWidget.f2450u[0] == 4) {
            aVar2.f22150a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.f2450u[1] == 4) {
            aVar2.f22151b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((ConstraintLayout.C0737b) bVar).mo3200b(constraintWidget, aVar2);
        constraintWidget.mo2788R(this.f22148b.f22154e);
        constraintWidget.mo2785O(this.f22148b.f22155f);
        C7130a aVar3 = this.f22148b;
        constraintWidget.f2389F = aVar3.f22157h;
        int i2 = aVar3.f22156g;
        constraintWidget.f2417d0 = i2;
        if (i2 <= 0) {
            z5 = false;
        }
        constraintWidget.f2389F = z5;
        aVar3.f22159j = 0;
        return aVar3.f22158i;
    }

    /* renamed from: b */
    public final void mo23380b(C0697d dVar, int i, int i2, int i3) {
        int i4 = dVar.f2419e0;
        int i5 = dVar.f2421f0;
        dVar.f2419e0 = 0;
        dVar.f2421f0 = 0;
        dVar.mo2788R(i2);
        dVar.mo2785O(i3);
        if (i4 < 0) {
            dVar.f2419e0 = 0;
        } else {
            dVar.f2419e0 = i4;
        }
        if (i5 < 0) {
            dVar.f2421f0 = 0;
        } else {
            dVar.f2421f0 = i5;
        }
        C0697d dVar2 = this.f22149c;
        dVar2.f2530z0 = i;
        dVar2.mo2833U();
    }

    /* renamed from: c */
    public final void mo23381c(C0697d dVar) {
        this.f22147a.clear();
        int size = dVar.f21718w0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.f21718w0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f2405V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                this.f22147a.add(constraintWidget);
            }
        }
        dVar.f2529y0.f22163b = true;
    }
}
