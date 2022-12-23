package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.view.menu.C0307m;
import androidx.transition.AutoTransition;
import androidx.transition.C1328g;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.C13897a;
import com.google.android.material.internal.ParcelableSparseArray;

public final class NavigationBarPresenter implements C0300j {

    /* renamed from: b */
    public C14103d f35120b;

    /* renamed from: c */
    public boolean f35121c = false;

    /* renamed from: d */
    public int f35122d;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14088a();

        /* renamed from: b */
        public int f35123b;

        /* renamed from: c */
        public ParcelableSparseArray f35124c;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        public class C14088a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f35123b);
            parcel.writeParcelable(this.f35124c, 0);
        }

        public SavedState(Parcel parcel) {
            this.f35123b = parcel.readInt();
            this.f35124c = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    /* renamed from: b */
    public final void mo1049b(C0291f fVar, boolean z) {
    }

    /* renamed from: d */
    public final boolean mo1045d(C0295h hVar) {
        return false;
    }

    /* renamed from: e */
    public final void mo1051e(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            C14103d dVar = this.f35120b;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.f35123b;
            int size = dVar.f35191C.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = dVar.f35191C.getItem(i2);
                if (i == item.getItemId()) {
                    dVar.f35198h = i;
                    dVar.f35199i = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f35120b.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f35124c;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            int i3 = 0;
            while (i3 < parcelableSparseArray.size()) {
                int keyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                if (state != null) {
                    sparseArray.put(keyAt, new C13897a(context, state));
                    i3++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            C14103d dVar2 = this.f35120b;
            dVar2.getClass();
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (dVar2.f35208r.indexOfKey(keyAt2) < 0) {
                    dVar2.f35208r.append(keyAt2, sparseArray.get(keyAt2));
                }
            }
            C14096a[] aVarArr = dVar2.f35197g;
            if (aVarArr != null) {
                for (C14096a aVar : aVarArr) {
                    aVar.setBadge(dVar2.f35208r.get(aVar.getId()));
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo1052f(C0307m mVar) {
        return false;
    }

    /* renamed from: g */
    public final Parcelable mo1053g() {
        SavedState savedState = new SavedState();
        savedState.f35123b = this.f35120b.getSelectedItemId();
        SparseArray<C13897a> badgeDrawables = this.f35120b.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < badgeDrawables.size()) {
            int keyAt = badgeDrawables.keyAt(i);
            C13897a valueAt = badgeDrawables.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.f34269f.f34240a);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        savedState.f35124c = parcelableSparseArray;
        return savedState;
    }

    public final int getId() {
        return this.f35122d;
    }

    /* renamed from: h */
    public final boolean mo1047h(C0295h hVar) {
        return false;
    }

    /* renamed from: i */
    public final void mo1054i(boolean z) {
        AutoTransition autoTransition;
        if (!this.f35121c) {
            if (z) {
                this.f35120b.mo42038b();
                return;
            }
            C14103d dVar = this.f35120b;
            C0291f fVar = dVar.f35191C;
            if (fVar != null && dVar.f35197g != null) {
                int size = fVar.size();
                if (size != dVar.f35197g.length) {
                    dVar.mo42038b();
                    return;
                }
                int i = dVar.f35198h;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = dVar.f35191C.getItem(i2);
                    if (item.isChecked()) {
                        dVar.f35198h = item.getItemId();
                        dVar.f35199i = i2;
                    }
                }
                if (!(i == dVar.f35198h || (autoTransition = dVar.f35192b) == null)) {
                    C1328g.m3633a(dVar, autoTransition);
                }
                boolean f = C14103d.m35102f(dVar.f35196f, dVar.f35191C.mo1118l().size());
                for (int i3 = 0; i3 < size; i3++) {
                    dVar.f35190B.f35121c = true;
                    dVar.f35197g[i3].setLabelVisibilityMode(dVar.f35196f);
                    dVar.f35197g[i3].setShifting(f);
                    dVar.f35197g[i3].mo1009c((C0295h) dVar.f35191C.getItem(i3));
                    dVar.f35190B.f35121c = false;
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo1055j() {
        return false;
    }

    /* renamed from: k */
    public final void mo1075k(Context context, C0291f fVar) {
        this.f35120b.f35191C = fVar;
    }
}
