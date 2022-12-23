package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C14083r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6362h;
import p242s1.C6382p0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13410k;
import p811tc.C19642a;
import p811tc.C19644c;
import p811tc.C19654k;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l */
    public static final int f34450l = C13410k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: b */
    public final ArrayList f34451b;

    /* renamed from: c */
    public final C13934e f34452c;

    /* renamed from: d */
    public final LinkedHashSet<C13933d> f34453d;

    /* renamed from: e */
    public final C13930a f34454e;

    /* renamed from: f */
    public Integer[] f34455f;

    /* renamed from: g */
    public boolean f34456g;

    /* renamed from: h */
    public boolean f34457h;

    /* renamed from: i */
    public boolean f34458i;

    /* renamed from: j */
    public final int f34459j;

    /* renamed from: k */
    public HashSet f34460k;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C13930a implements Comparator<MaterialButton> {
        public C13930a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C13931b extends C6315a {
        public C13931b() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i2 = MaterialButtonToggleGroup.f34450l;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i3 = 0;
                i = 0;
                while (true) {
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.mo41148d(i3)) {
                            i++;
                        }
                        i3++;
                    }
                }
                gVar.mo22645j(C6531g.C6534c.m15467a(0, 1, i, 1, ((MaterialButton) view).isChecked()));
            }
            i = -1;
            gVar.mo22645j(C6531g.C6534c.m15467a(0, 1, i, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C13932c {

        /* renamed from: e */
        public static final C19642a f34463e = new C19642a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: a */
        public C19644c f34464a;

        /* renamed from: b */
        public C19644c f34465b;

        /* renamed from: c */
        public C19644c f34466c;

        /* renamed from: d */
        public C19644c f34467d;

        public C13932c(C19644c cVar, C19644c cVar2, C19644c cVar3, C19644c cVar4) {
            this.f34464a = cVar;
            this.f34465b = cVar3;
            this.f34466c = cVar4;
            this.f34467d = cVar2;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface C13933d {
        /* renamed from: a */
        void mo41163a(int i);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C13934e implements MaterialButton.C13929b {
        public C13934e() {
        }
    }

    static {
        Class<MaterialButtonToggleGroup> cls = MaterialButtonToggleGroup.class;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (mo41148d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (mo41148d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && mo41148d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            materialButton.setId(C6333d0.C6338e.m15060a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f34452c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void mo41144a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton c = mo41147c(i);
                int min = Math.min(c.getStrokeWidth(), mo41147c(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = c.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    C6362h.m15171g(layoutParams, 0);
                    C6362h.m15172h(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    C6362h.m15172h(layoutParams, 0);
                }
                c.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) mo41147c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                C6362h.m15171g(layoutParams3, 0);
                C6362h.m15172h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            mo41146b(materialButton.getId(), materialButton.isChecked());
            C19654k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f34451b.add(new C13932c(shapeAppearanceModel.f49891e, shapeAppearanceModel.f49894h, shapeAppearanceModel.f49892f, shapeAppearanceModel.f49893g));
            C6333d0.m15029q(materialButton, new C13931b());
        }
    }

    /* renamed from: b */
    public final void mo41146b(int i, boolean z) {
        if (i != -1) {
            HashSet hashSet = new HashSet(this.f34460k);
            if (z && !hashSet.contains(Integer.valueOf(i))) {
                if (this.f34457h && !hashSet.isEmpty()) {
                    hashSet.clear();
                }
                hashSet.add(Integer.valueOf(i));
            } else if (!z && hashSet.contains(Integer.valueOf(i))) {
                if (!this.f34458i || hashSet.size() > 1) {
                    hashSet.remove(Integer.valueOf(i));
                }
            } else {
                return;
            }
            mo41150e(hashSet);
        }
    }

    /* renamed from: c */
    public final MaterialButton mo41147c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: d */
    public final boolean mo41148d(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f34454e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(mo41147c(i), Integer.valueOf(i));
        }
        this.f34455f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void mo41150e(Set<Integer> set) {
        HashSet hashSet = this.f34460k;
        this.f34460k = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = mo41147c(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f34456g = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f34456g = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<C13933d> it = this.f34453d.iterator();
                while (it.hasNext()) {
                    it.next().mo41163a(id);
                }
            }
        }
        invalidate();
    }

    /* renamed from: f */
    public final void mo41151f() {
        boolean z;
        C13932c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton c = mo41147c(i);
            if (c.getVisibility() != 8) {
                C19654k shapeAppearanceModel = c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C19654k.C19655a aVar = new C19654k.C19655a(shapeAppearanceModel);
                C13932c cVar2 = (C13932c) this.f34451b.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            C19644c cVar3 = cVar2.f34464a;
                            C19642a aVar2 = C13932c.f34463e;
                            cVar = new C13932c(cVar3, aVar2, cVar2.f34465b, aVar2);
                        } else if (C14083r.m35068d(this)) {
                            C19642a aVar3 = C13932c.f34463e;
                            cVar = new C13932c(aVar3, aVar3, cVar2.f34465b, cVar2.f34466c);
                        } else {
                            C19644c cVar4 = cVar2.f34464a;
                            C19644c cVar5 = cVar2.f34467d;
                            C19642a aVar4 = C13932c.f34463e;
                            cVar = new C13932c(cVar4, cVar5, aVar4, aVar4);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z) {
                        C19642a aVar5 = C13932c.f34463e;
                        cVar = new C13932c(aVar5, cVar2.f34467d, aVar5, cVar2.f34466c);
                    } else if (C14083r.m35068d(this)) {
                        C19644c cVar6 = cVar2.f34464a;
                        C19644c cVar7 = cVar2.f34467d;
                        C19642a aVar6 = C13932c.f34463e;
                        cVar = new C13932c(cVar6, cVar7, aVar6, aVar6);
                    } else {
                        C19642a aVar7 = C13932c.f34463e;
                        cVar = new C13932c(aVar7, aVar7, cVar2.f34465b, cVar2.f34466c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.mo52023c(BitmapDescriptorFactory.HUE_RED);
                } else {
                    aVar.f49903e = cVar2.f34464a;
                    aVar.f49906h = cVar2.f34467d;
                    aVar.f49904f = cVar2.f34465b;
                    aVar.f49905g = cVar2.f34466c;
                }
                c.setShapeAppearanceModel(new C19654k(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f34457h || this.f34460k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f34460k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = mo41147c(i).getId();
            if (this.f34460k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f34455f;
        if (numArr == null || i2 >= numArr.length) {
            return i2;
        }
        return numArr[i2].intValue();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f34459j;
        if (i != -1) {
            mo41150e(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f34457h) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6531g.C6533b.m15466a(1, visibleButtonCount, i, false).f20352a);
    }

    public final void onMeasure(int i, int i2) {
        mo41151f();
        mo41144a();
        super.onMeasure(i, i2);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.C13929b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f34451b.remove(indexOfChild);
        }
        mo41151f();
        mo41144a();
    }

    public void setSelectionRequired(boolean z) {
        this.f34458i = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f34457h != z) {
            this.f34457h = z;
            mo41150e(new HashSet());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f34450l
            android.content.Context r7 = p883wc.C20289a.m47861a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f34451b = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r7.<init>()
            r6.f34452c = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f34453d = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f34454e = r7
            r7 = 0
            r6.f34456g = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f34460k = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = p355ac.C13411l.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r9 = p355ac.C13411l.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = p355ac.C13411l.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f34459j = r9
            int r9 = p355ac.C13411l.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f34458i = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            java.util.WeakHashMap<android.view.View, s1.p0> r8 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15059s(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
