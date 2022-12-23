package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13405f;
import p355ac.C13407h;
import p355ac.C13411l;
import p811tc.C19648g;
import p811tc.C19652i;
import p811tc.C19654k;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: h */
    public final C14210a f35698h;

    /* renamed from: i */
    public int f35699i;

    /* renamed from: j */
    public C19648g f35700j;

    /* renamed from: com.google.android.material.timepicker.RadialViewGroup$a */
    public class C14210a implements Runnable {
        public C14210a() {
        }

        public final void run() {
            RadialViewGroup.this.mo42657l();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            view.setId(C6333d0.C6338e.m15060a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f35698h);
            handler.post(this.f35698h);
        }
    }

    /* renamed from: l */
    public final void mo42657l() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C0738a aVar = new C0738a();
        aVar.mo3238e(this);
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C13405f.circle_center;
            if (id != i4 && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i5 = this.f35699i;
                C0738a.C0741b bVar = aVar.mo3240i(id2).f3121e;
                bVar.f3138A = i4;
                bVar.f3139B = i5;
                bVar.f3140C = f;
                f = (360.0f / ((float) (childCount - i))) + f;
            }
        }
        aVar.mo3236b(this);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        mo42657l();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f35698h);
            handler.post(this.f35698h);
        }
    }

    public final void setBackgroundColor(int i) {
        this.f35700j.mo52005n(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C13407h.material_radial_view_group, this);
        C19648g gVar = new C19648g();
        this.f35700j = gVar;
        C19652i iVar = new C19652i(0.5f);
        C19654k kVar = gVar.f49837b.f49861a;
        kVar.getClass();
        C19654k.C19655a aVar = new C19654k.C19655a(kVar);
        aVar.f49903e = iVar;
        aVar.f49904f = iVar;
        aVar.f49905g = iVar;
        aVar.f49906h = iVar;
        gVar.setShapeAppearanceModel(new C19654k(aVar));
        this.f35700j.mo52005n(ColorStateList.valueOf(-1));
        C19648g gVar2 = this.f35700j;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.RadialViewGroup, i, 0);
        this.f35699i = obtainStyledAttributes.getDimensionPixelSize(C13411l.RadialViewGroup_materialCircleRadius, 0);
        this.f35698h = new C14210a();
        obtainStyledAttributes.recycle();
    }
}
