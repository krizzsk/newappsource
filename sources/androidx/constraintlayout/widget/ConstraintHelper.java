package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;
import p002a1.C0041c;
import p002a1.C0042d;
import p292w0.C6960a;
import p292w0.C6961b;

public abstract class ConstraintHelper extends View {

    /* renamed from: b */
    public int[] f2997b = new int[32];

    /* renamed from: c */
    public int f2998c;

    /* renamed from: d */
    public Context f2999d;

    /* renamed from: e */
    public C6961b f3000e;

    /* renamed from: f */
    public String f3001f;

    /* renamed from: g */
    public String f3002g;

    /* renamed from: h */
    public View[] f3003h = null;

    /* renamed from: i */
    public HashMap<Integer, String> f3004i = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f2999d = context;
        mo2868n((AttributeSet) null);
    }

    /* renamed from: e */
    public final void mo3154e(String str) {
        if (str != null && str.length() != 0 && this.f2999d != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int l = mo3161l(trim);
            if (l != 0) {
                this.f3004i.put(Integer.valueOf(l), trim);
                mo3155f(l);
            }
        }
    }

    /* renamed from: f */
    public final void mo3155f(int i) {
        if (i != getId()) {
            int i2 = this.f2998c + 1;
            int[] iArr = this.f2997b;
            if (i2 > iArr.length) {
                this.f2997b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2997b;
            int i3 = this.f2998c;
            iArr2[i3] = i;
            this.f2998c = i3 + 1;
        }
    }

    /* renamed from: g */
    public final void mo3156g(String str) {
        if (str != null && str.length() != 0 && this.f2999d != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f3029Y) && childAt.getId() != -1) {
                        mo3155f(childAt.getId());
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2997b, this.f2998c);
    }

    /* renamed from: h */
    public final void mo3158h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo3159i((ConstraintLayout) parent);
        }
    }

    /* renamed from: i */
    public final void mo3159i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2998c; i++) {
            View viewById = constraintLayout.getViewById(this.f2997b[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo2901j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public final int mo3160k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2999d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo3161l(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = mo3160k(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0041c.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f2999d.getResources().getIdentifier(str, "id", this.f2999d.getPackageName());
        }
        return i;
    }

    /* renamed from: m */
    public final View[] mo3162m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f3003h;
        if (viewArr == null || viewArr.length != this.f2998c) {
            this.f3003h = new View[this.f2998c];
        }
        for (int i = 0; i < this.f2998c; i++) {
            this.f3003h[i] = constraintLayout.getViewById(this.f2997b[i]);
        }
        return this.f3003h;
    }

    /* renamed from: n */
    public void mo2868n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3001f = string;
                    setIds(string);
                } else if (index == C0042d.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3002g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    public void mo2873o(C0738a.C0739a aVar, C6961b bVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        C0738a.C0741b bVar2 = aVar.f3121e;
        int[] iArr = bVar2.f3183j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f3185k0;
            if (str != null) {
                if (str.length() > 0) {
                    C0738a.C0741b bVar3 = aVar.f3121e;
                    String[] split = bVar3.f3185k0.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i2 = 0;
                    for (String trim : split) {
                        int l = mo3161l(trim.trim());
                        if (l != 0) {
                            iArr2[i2] = l;
                            i2++;
                        }
                    }
                    if (i2 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i2);
                    }
                    bVar3.f3183j0 = iArr2;
                } else {
                    aVar.f3121e.f3183j0 = null;
                }
            }
        }
        bVar.mo23204b();
        if (aVar.f3121e.f3183j0 != null) {
            while (true) {
                int[] iArr3 = aVar.f3121e.f3183j0;
                if (i < iArr3.length) {
                    ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr3[i]);
                    if (constraintWidget != null) {
                        bVar.mo23203a(constraintWidget);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3001f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3002g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* renamed from: p */
    public void mo2875p(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: q */
    public void mo2902q() {
    }

    /* renamed from: r */
    public void mo2903r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public void mo2918s(C6960a aVar, SparseArray sparseArray) {
        aVar.mo23204b();
        for (int i = 0; i < this.f2998c; i++) {
            aVar.mo23203a((ConstraintWidget) sparseArray.get(this.f2997b[i]));
        }
    }

    public void setIds(String str) {
        this.f3001f = str;
        if (str != null) {
            int i = 0;
            this.f2998c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo3154e(str.substring(i));
                    return;
                } else {
                    mo3154e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f3002g = str;
        if (str != null) {
            int i = 0;
            this.f2998c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo3156g(str.substring(i));
                    return;
                } else {
                    mo3156g(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3001f = null;
        this.f2998c = 0;
        for (int f : iArr) {
            mo3155f(f);
        }
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f3001f == null) {
            mo3155f(i);
        }
    }

    /* renamed from: t */
    public final void mo3168t() {
        if (this.f3000e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f3064q0 = this.f3000e;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2999d = context;
        mo2868n(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2999d = context;
        mo2868n(attributeSet);
    }
}
