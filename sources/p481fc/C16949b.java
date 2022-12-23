package p481fc;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import java.util.WeakHashMap;
import p141k1.C5450a;
import p221q6.C6181b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13405f;
import p355ac.C13410k;
import p355ac.C13411l;
import p811tc.C19645d;
import p811tc.C19648g;
import p811tc.C19653j;
import p811tc.C19654k;

/* renamed from: fc.b */
public final class C16949b {

    /* renamed from: t */
    public static final double f43963t = Math.cos(Math.toRadians(45.0d));

    /* renamed from: u */
    public static final ColorDrawable f43964u;

    /* renamed from: a */
    public final MaterialCardView f43965a;

    /* renamed from: b */
    public final Rect f43966b = new Rect();

    /* renamed from: c */
    public final C19648g f43967c;

    /* renamed from: d */
    public final C19648g f43968d;

    /* renamed from: e */
    public int f43969e;

    /* renamed from: f */
    public int f43970f;

    /* renamed from: g */
    public int f43971g;

    /* renamed from: h */
    public int f43972h;

    /* renamed from: i */
    public Drawable f43973i;

    /* renamed from: j */
    public Drawable f43974j;

    /* renamed from: k */
    public ColorStateList f43975k;

    /* renamed from: l */
    public ColorStateList f43976l;

    /* renamed from: m */
    public C19654k f43977m;

    /* renamed from: n */
    public ColorStateList f43978n;

    /* renamed from: o */
    public RippleDrawable f43979o;

    /* renamed from: p */
    public LayerDrawable f43980p;

    /* renamed from: q */
    public C19648g f43981q;

    /* renamed from: r */
    public boolean f43982r = false;

    /* renamed from: s */
    public boolean f43983s;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f43964u = colorDrawable;
    }

    public C16949b(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i2 = MaterialCardView.f34493p;
        this.f43965a = materialCardView;
        C19648g gVar = new C19648g(materialCardView.getContext(), attributeSet, i, i2);
        this.f43967c = gVar;
        gVar.mo52001k(materialCardView.getContext());
        gVar.mo52009q();
        C19654k kVar = gVar.f49837b.f49861a;
        kVar.getClass();
        C19654k.C19655a aVar = new C19654k.C19655a(kVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C13411l.CardView, i, C13410k.CardView);
        int i3 = C13411l.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            aVar.mo52023c(obtainStyledAttributes.getDimension(i3, BitmapDescriptorFactory.HUE_RED));
        }
        this.f43968d = new C19648g();
        mo49572g(new C19654k(aVar));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static float m42774b(C6181b bVar, float f) {
        if (bVar instanceof C19653j) {
            return (float) ((1.0d - f43963t) * ((double) f));
        }
        if (bVar instanceof C19645d) {
            return f / 2.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public final float mo49567a() {
        float b = m42774b(this.f43977m.f49887a, this.f43967c.mo52000j());
        C6181b bVar = this.f43977m.f49888b;
        C19648g gVar = this.f43967c;
        float max = Math.max(b, m42774b(bVar, gVar.f49837b.f49861a.f49892f.mo51983a(gVar.mo51997h())));
        C6181b bVar2 = this.f43977m.f49889c;
        C19648g gVar2 = this.f43967c;
        float b2 = m42774b(bVar2, gVar2.f49837b.f49861a.f49893g.mo51983a(gVar2.mo51997h()));
        C6181b bVar3 = this.f43977m.f49890d;
        C19648g gVar3 = this.f43967c;
        return Math.max(max, Math.max(b2, m42774b(bVar3, gVar3.f49837b.f49861a.f49894h.mo51983a(gVar3.mo51997h()))));
    }

    /* renamed from: c */
    public final LayerDrawable mo49568c() {
        if (this.f43979o == null) {
            this.f43981q = new C19648g(this.f43977m);
            this.f43979o = new RippleDrawable(this.f43975k, (Drawable) null, this.f43981q);
        }
        if (this.f43980p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f43979o, this.f43968d, this.f43974j});
            this.f43980p = layerDrawable;
            layerDrawable.setId(2, C13405f.mtrl_card_checked_layer_id);
        }
        return this.f43980p;
    }

    /* renamed from: d */
    public final C16948a mo49569d(Drawable drawable) {
        int i;
        int i2;
        float f;
        if (this.f43965a.getUseCompatPadding()) {
            float maxCardElevation = this.f43965a.getMaxCardElevation() * 1.5f;
            boolean h = mo49573h();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (h) {
                f = mo49567a();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            int ceil = (int) Math.ceil((double) (maxCardElevation + f));
            float maxCardElevation2 = this.f43965a.getMaxCardElevation();
            if (mo49573h()) {
                f2 = mo49567a();
            }
            i2 = (int) Math.ceil((double) (maxCardElevation2 + f2));
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C16948a(drawable, i2, i, i2, i);
    }

    /* renamed from: e */
    public final void mo49570e(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i11;
        float f;
        if (this.f43980p != null) {
            boolean z4 = false;
            if (this.f43965a.getUseCompatPadding()) {
                float maxCardElevation = this.f43965a.getMaxCardElevation() * 1.5f;
                boolean h = mo49573h();
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (h) {
                    f = mo49567a();
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                i4 = (int) Math.ceil((double) ((maxCardElevation + f) * 2.0f));
                float maxCardElevation2 = this.f43965a.getMaxCardElevation();
                if (mo49573h()) {
                    f2 = mo49567a();
                }
                i3 = (int) Math.ceil((double) ((maxCardElevation2 + f2) * 2.0f));
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i12 = this.f43971g;
            if ((i12 & 8388613) == 8388613) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i5 = ((i - this.f43969e) - this.f43970f) - i3;
            } else {
                i5 = this.f43969e;
            }
            if ((i12 & 80) == 80) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i6 = this.f43969e;
            } else {
                i6 = ((i2 - this.f43969e) - this.f43970f) - i4;
            }
            int i13 = i6;
            if ((i12 & 8388613) == 8388613) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i7 = this.f43969e;
            } else {
                i7 = ((i - this.f43969e) - this.f43970f) - i3;
            }
            if ((i12 & 80) == 80) {
                z4 = true;
            }
            if (z4) {
                i8 = ((i2 - this.f43969e) - this.f43970f) - i4;
            } else {
                i8 = this.f43969e;
            }
            MaterialCardView materialCardView = this.f43965a;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6338e.m15063d(materialCardView) == 1) {
                i11 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i11 = i5;
            }
            this.f43980p.setLayerInset(2, i11, i8, i9, i13);
        }
    }

    /* renamed from: f */
    public final void mo49571f(Drawable drawable) {
        int i;
        if (drawable != null) {
            Drawable mutate = C5450a.m13604g(drawable).mutate();
            this.f43974j = mutate;
            C5450a.C5452b.m13617h(mutate, this.f43976l);
            boolean isChecked = this.f43965a.isChecked();
            Drawable drawable2 = this.f43974j;
            if (drawable2 != null) {
                if (isChecked) {
                    i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i = 0;
                }
                drawable2.setAlpha(i);
            }
        } else {
            this.f43974j = f43964u;
        }
        LayerDrawable layerDrawable = this.f43980p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C13405f.mtrl_card_checked_layer_id, this.f43974j);
        }
    }

    /* renamed from: g */
    public final void mo49572g(C19654k kVar) {
        this.f43977m = kVar;
        this.f43967c.setShapeAppearanceModel(kVar);
        C19648g gVar = this.f43967c;
        gVar.f49859x = !gVar.mo52002l();
        C19648g gVar2 = this.f43968d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C19648g gVar3 = this.f43981q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: h */
    public final boolean mo49573h() {
        if (!this.f43965a.getPreventCornerOverlap() || !this.f43967c.mo52002l() || !this.f43965a.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo49574i() {
        boolean z;
        float f;
        boolean z2 = true;
        if (!this.f43965a.getPreventCornerOverlap() || this.f43967c.mo52002l()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !mo49573h()) {
            z2 = false;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            f = mo49567a();
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f43965a.getPreventCornerOverlap() && this.f43965a.getUseCompatPadding()) {
            f2 = (float) ((1.0d - f43963t) * ((double) this.f43965a.getCardViewRadius()));
        }
        int i = (int) (f - f2);
        MaterialCardView materialCardView = this.f43965a;
        Rect rect = this.f43966b;
        materialCardView.f2289d.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.f2286h.mo50616C(materialCardView.f2291f);
    }

    /* renamed from: j */
    public final void mo49575j() {
        if (!this.f43982r) {
            this.f43965a.setBackgroundInternal(mo49569d(this.f43967c));
        }
        this.f43965a.setForeground(mo49569d(this.f43973i));
    }
}
