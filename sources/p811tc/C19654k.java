package p811tc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p221q6.C6181b;
import p355ac.C13411l;

/* renamed from: tc.k */
public final class C19654k {

    /* renamed from: m */
    public static final C19652i f49886m = new C19652i(0.5f);

    /* renamed from: a */
    public C6181b f49887a;

    /* renamed from: b */
    public C6181b f49888b;

    /* renamed from: c */
    public C6181b f49889c;

    /* renamed from: d */
    public C6181b f49890d;

    /* renamed from: e */
    public C19644c f49891e;

    /* renamed from: f */
    public C19644c f49892f;

    /* renamed from: g */
    public C19644c f49893g;

    /* renamed from: h */
    public C19644c f49894h;

    /* renamed from: i */
    public C19646e f49895i;

    /* renamed from: j */
    public C19646e f49896j;

    /* renamed from: k */
    public C19646e f49897k;

    /* renamed from: l */
    public C19646e f49898l;

    public C19654k(C19655a aVar) {
        this.f49887a = aVar.f49899a;
        this.f49888b = aVar.f49900b;
        this.f49889c = aVar.f49901c;
        this.f49890d = aVar.f49902d;
        this.f49891e = aVar.f49903e;
        this.f49892f = aVar.f49904f;
        this.f49893g = aVar.f49905g;
        this.f49894h = aVar.f49906h;
        this.f49895i = aVar.f49907i;
        this.f49896j = aVar.f49908j;
        this.f49897k = aVar.f49909k;
        this.f49898l = aVar.f49910l;
    }

    /* renamed from: a */
    public static C19655a m47122a(Context context, int i, int i2) {
        return m47123b(context, i, i2, new C19642a((float) 0));
    }

    /* renamed from: b */
    public static C19655a m47123b(Context context, int i, int i2, C19644c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C13411l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C13411l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C13411l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C13411l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C13411l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C13411l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            C19644c e = m47126e(obtainStyledAttributes, C13411l.ShapeAppearance_cornerSize, cVar);
            C19644c e2 = m47126e(obtainStyledAttributes, C13411l.ShapeAppearance_cornerSizeTopLeft, e);
            C19644c e3 = m47126e(obtainStyledAttributes, C13411l.ShapeAppearance_cornerSizeTopRight, e);
            C19644c e4 = m47126e(obtainStyledAttributes, C13411l.ShapeAppearance_cornerSizeBottomRight, e);
            C19644c e5 = m47126e(obtainStyledAttributes, C13411l.ShapeAppearance_cornerSizeBottomLeft, e);
            C19655a aVar = new C19655a();
            C6181b I = C21100e.m49312I(i4);
            aVar.f49899a = I;
            float b = C19655a.m47129b(I);
            if (b != -1.0f) {
                aVar.mo52026f(b);
            }
            aVar.f49903e = e2;
            C6181b I2 = C21100e.m49312I(i5);
            aVar.f49900b = I2;
            float b2 = C19655a.m47129b(I2);
            if (b2 != -1.0f) {
                aVar.mo52027g(b2);
            }
            aVar.f49904f = e3;
            C6181b I3 = C21100e.m49312I(i6);
            aVar.f49901c = I3;
            float b3 = C19655a.m47129b(I3);
            if (b3 != -1.0f) {
                aVar.mo52025e(b3);
            }
            aVar.f49905g = e4;
            C6181b I4 = C21100e.m49312I(i7);
            aVar.f49902d = I4;
            float b4 = C19655a.m47129b(I4);
            if (b4 != -1.0f) {
                aVar.mo52024d(b4);
            }
            aVar.f49906h = e5;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static C19655a m47124c(Context context, AttributeSet attributeSet, int i, int i2) {
        return m47125d(context, attributeSet, i, i2, new C19642a((float) 0));
    }

    /* renamed from: d */
    public static C19655a m47125d(Context context, AttributeSet attributeSet, int i, int i2, C19644c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C13411l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C13411l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m47123b(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: e */
    public static C19644c m47126e(TypedArray typedArray, int i, C19644c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C19642a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C19652i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    /* renamed from: f */
    public final boolean mo52020f(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        Class<C19646e> cls = C19646e.class;
        if (!this.f49898l.getClass().equals(cls) || !this.f49896j.getClass().equals(cls) || !this.f49895i.getClass().equals(cls) || !this.f49897k.getClass().equals(cls)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f49891e.mo51983a(rectF);
        if (this.f49892f.mo51983a(rectF) == a && this.f49894h.mo51983a(rectF) == a && this.f49893g.mo51983a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(this.f49888b instanceof C19653j) || !(this.f49887a instanceof C19653j) || !(this.f49889c instanceof C19653j) || !(this.f49890d instanceof C19653j)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final C19654k mo52021g(float f) {
        C19655a aVar = new C19655a(this);
        aVar.mo52023c(f);
        return new C19654k(aVar);
    }

    /* renamed from: tc.k$a */
    public static final class C19655a {

        /* renamed from: a */
        public C6181b f49899a = new C19653j();

        /* renamed from: b */
        public C6181b f49900b = new C19653j();

        /* renamed from: c */
        public C6181b f49901c = new C19653j();

        /* renamed from: d */
        public C6181b f49902d = new C19653j();

        /* renamed from: e */
        public C19644c f49903e = new C19642a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: f */
        public C19644c f49904f = new C19642a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: g */
        public C19644c f49905g = new C19642a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: h */
        public C19644c f49906h = new C19642a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: i */
        public C19646e f49907i = new C19646e();

        /* renamed from: j */
        public C19646e f49908j = new C19646e();

        /* renamed from: k */
        public C19646e f49909k = new C19646e();

        /* renamed from: l */
        public C19646e f49910l = new C19646e();

        public C19655a() {
        }

        /* renamed from: b */
        public static float m47129b(C6181b bVar) {
            if (bVar instanceof C19653j) {
                return ((C19653j) bVar).f49885b;
            }
            if (bVar instanceof C19645d) {
                return ((C19645d) bVar).f49834b;
            }
            return -1.0f;
        }

        /* renamed from: a */
        public final C19654k mo52022a() {
            return new C19654k(this);
        }

        /* renamed from: c */
        public final void mo52023c(float f) {
            mo52026f(f);
            mo52027g(f);
            mo52025e(f);
            mo52024d(f);
        }

        /* renamed from: d */
        public final void mo52024d(float f) {
            this.f49906h = new C19642a(f);
        }

        /* renamed from: e */
        public final void mo52025e(float f) {
            this.f49905g = new C19642a(f);
        }

        /* renamed from: f */
        public final void mo52026f(float f) {
            this.f49903e = new C19642a(f);
        }

        /* renamed from: g */
        public final void mo52027g(float f) {
            this.f49904f = new C19642a(f);
        }

        public C19655a(C19654k kVar) {
            this.f49899a = kVar.f49887a;
            this.f49900b = kVar.f49888b;
            this.f49901c = kVar.f49889c;
            this.f49902d = kVar.f49890d;
            this.f49903e = kVar.f49891e;
            this.f49904f = kVar.f49892f;
            this.f49905g = kVar.f49893g;
            this.f49906h = kVar.f49894h;
            this.f49907i = kVar.f49895i;
            this.f49908j = kVar.f49896j;
            this.f49909k = kVar.f49897k;
            this.f49910l = kVar.f49898l;
        }
    }

    public C19654k() {
        this.f49887a = new C19653j();
        this.f49888b = new C19653j();
        this.f49889c = new C19653j();
        this.f49890d = new C19653j();
        this.f49891e = new C19642a(BitmapDescriptorFactory.HUE_RED);
        this.f49892f = new C19642a(BitmapDescriptorFactory.HUE_RED);
        this.f49893g = new C19642a(BitmapDescriptorFactory.HUE_RED);
        this.f49894h = new C19642a(BitmapDescriptorFactory.HUE_RED);
        this.f49895i = new C19646e();
        this.f49896j = new C19646e();
        this.f49897k = new C19646e();
        this.f49898l = new C19646e();
    }
}
