package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.C14051e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.material.internal.b */
public final class C14045b<T extends C14051e<T>> {

    /* renamed from: a */
    public final HashMap f34978a = new HashMap();

    /* renamed from: b */
    public final HashSet f34979b = new HashSet();

    /* renamed from: c */
    public C14046a f34980c;

    /* renamed from: d */
    public boolean f34981d;

    /* renamed from: e */
    public boolean f34982e;

    /* renamed from: com.google.android.material.internal.b$a */
    public interface C14046a {
    }

    /* renamed from: a */
    public final boolean mo41853a(C14051e<T> eVar) {
        int id = eVar.getId();
        if (this.f34979b.contains(Integer.valueOf(id))) {
            return false;
        }
        C14051e eVar2 = (C14051e) this.f34978a.get(Integer.valueOf(mo41855c()));
        if (eVar2 != null) {
            mo41857e(eVar2, false);
        }
        boolean add = this.f34979b.add(Integer.valueOf(id));
        if (!eVar.isChecked()) {
            eVar.setChecked(true);
        }
        return add;
    }

    /* renamed from: b */
    public final ArrayList mo41854b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f34979b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C14051e) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final int mo41855c() {
        if (!this.f34981d || this.f34979b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f34979b.iterator().next()).intValue();
    }

    /* renamed from: d */
    public final void mo41856d() {
        C14046a aVar = this.f34980c;
        if (aVar != null) {
            new HashSet(this.f34979b);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.C13943d dVar = chipGroup.f34532h;
            if (dVar != null) {
                chipGroup.f34533i.mo41854b(chipGroup);
                ChipGroup.C13941b bVar = (ChipGroup.C13941b) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f34533i.f34981d) {
                    bVar.getClass();
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo41857e(C14051e<T> eVar, boolean z) {
        int id = eVar.getId();
        if (!this.f34979b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (!z || this.f34979b.size() != 1 || !this.f34979b.contains(Integer.valueOf(id))) {
            boolean remove = this.f34979b.remove(Integer.valueOf(id));
            if (eVar.isChecked()) {
                eVar.setChecked(false);
            }
            return remove;
        }
        eVar.setChecked(true);
        return false;
    }
}
