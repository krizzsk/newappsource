package qg0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.places.Place;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: qg0.q */
public final class C24768q {

    /* renamed from: k */
    public static final C24768q f62665k = new C24768q(false, false, false, false, false, new C24768q(false, false, false, false, false, (C24768q) null, false, (C24768q) null, (C24768q) null, false, Place.TYPE_SUBLOCALITY_LEVEL_1), false, (C24768q) null, (C24768q) null, false, 988);

    /* renamed from: a */
    public final boolean f62666a;

    /* renamed from: b */
    public final boolean f62667b;

    /* renamed from: c */
    public final boolean f62668c;

    /* renamed from: d */
    public final boolean f62669d;

    /* renamed from: e */
    public final boolean f62670e;

    /* renamed from: f */
    public final C24768q f62671f;

    /* renamed from: g */
    public final boolean f62672g;

    /* renamed from: h */
    public final C24768q f62673h;

    /* renamed from: i */
    public final C24768q f62674i;

    /* renamed from: j */
    public final boolean f62675j;

    /* renamed from: qg0.q$a */
    public /* synthetic */ class C24769a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62676a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr[Variance.INVARIANT.ordinal()] = 2;
            f62676a = iArr;
        }
    }

    public C24768q(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C24768q qVar, boolean z6, C24768q qVar2, C24768q qVar3, boolean z7, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        qVar = (i & 32) != 0 ? null : qVar;
        z6 = (i & 64) != 0 ? true : z6;
        qVar2 = (i & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? qVar : qVar2;
        qVar3 = (i & 256) != 0 ? qVar : qVar3;
        z7 = (i & 512) != 0 ? false : z7;
        this.f62666a = z;
        this.f62667b = z2;
        this.f62668c = z3;
        this.f62669d = z4;
        this.f62670e = z5;
        this.f62671f = qVar;
        this.f62672g = z6;
        this.f62673h = qVar2;
        this.f62674i = qVar3;
        this.f62675j = z7;
    }
}
