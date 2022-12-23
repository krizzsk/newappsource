package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.C14044a;
import com.google.android.material.internal.C14045b;
import com.google.android.material.internal.C14051e;
import com.google.android.material.internal.FlowLayout;
import java.util.List;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13410k;

public class ChipGroup extends FlowLayout {

    /* renamed from: l */
    public static final int f34529l = C13410k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: f */
    public int f34530f;

    /* renamed from: g */
    public int f34531g;

    /* renamed from: h */
    public C13943d f34532h;

    /* renamed from: i */
    public final C14045b<Chip> f34533i;

    /* renamed from: j */
    public final int f34534j;

    /* renamed from: k */
    public final C13944e f34535k;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams() {
            super(-2, -2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    public class C13940a implements C14045b.C14046a {
        public C13940a() {
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C13941b implements C13943d {
        public C13941b(C13942c cVar) {
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface C13942c {
        /* renamed from: a */
        void mo41394a();
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C13943d {
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    public class C13944e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public ViewGroup.OnHierarchyChangeListener f34538b;

        public C13944e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    view2.setId(C6333d0.C6338e.m15060a());
                }
                C14045b<Chip> bVar = ChipGroup.this.f34533i;
                Chip chip = (Chip) view2;
                bVar.f34978a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.mo41853a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new C14044a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f34538b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                C14045b<Chip> bVar = chipGroup.f34533i;
                Chip chip = (Chip) view2;
                bVar.getClass();
                chip.setInternalOnCheckedChangeListener((C14051e.C14052a) null);
                bVar.f34978a.remove(Integer.valueOf(chip.getId()));
                bVar.f34979b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f34538b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.chipGroupStyle);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo41364a() {
        return this.f34934d;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f34533i.mo41855c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f34533i.mo41854b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f34530f;
    }

    public int getChipSpacingVertical() {
        return this.f34531g;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f34534j;
        if (i != -1) {
            C14045b<Chip> bVar = this.f34533i;
            C14051e eVar = (C14051e) bVar.f34978a.get(Integer.valueOf(i));
            if (eVar != null && bVar.mo41853a(eVar)) {
                bVar.mo41856d();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f34934d) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (this.f34533i.f34981d) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6531g.C6533b.m15466a(rowCount, i, i2, false).f20352a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f34530f != i) {
            this.f34530f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f34531g != i) {
            this.f34531g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(C13942c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((C13943d) null);
        } else {
            setOnCheckedStateChangeListener(new C13941b(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(C13943d dVar) {
        this.f34532h = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f34535k.f34538b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f34533i.f34982e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        C14045b<Chip> bVar = this.f34533i;
        if (bVar.f34981d != z) {
            bVar.f34981d = z;
            boolean z2 = !bVar.f34979b.isEmpty();
            for (C14051e e : bVar.f34978a.values()) {
                bVar.mo41857e(e, false);
            }
            if (z2) {
                bVar.mo41856d();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f34529l
            android.content.Context r9 = p883wc.C20289a.m47861a(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.b r9 = new com.google.android.material.internal.b
            r9.<init>()
            r8.f34533i = r9
            com.google.android.material.chip.ChipGroup$e r6 = new com.google.android.material.chip.ChipGroup$e
            r6.<init>()
            r8.f34535k = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = p355ac.C13411l.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r11 = p355ac.C13411l.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = p355ac.C13411l.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = p355ac.C13411l.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = p355ac.C13411l.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine((boolean) r11)
            int r11 = p355ac.C13411l.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection((boolean) r11)
            int r11 = p355ac.C13411l.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = p355ac.C13411l.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f34534j = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.f34980c = r10
            super.setOnHierarchyChangeListener(r6)
            java.util.WeakHashMap<android.view.View, s1.p0> r9 = p242s1.C6333d0.f19990a
            r9 = 1
            p242s1.C6333d0.C6337d.m15059s(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
