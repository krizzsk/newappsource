package androidx.legacy.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;
import p001a0.C0016g;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b */
    public final ArrayList<C0979a> f3868b = new ArrayList<>();

    /* renamed from: c */
    public TabHost.OnTabChangeListener f3869c;

    /* renamed from: d */
    public boolean f3870d;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0978a();

        /* renamed from: b */
        public String f3871b;

        /* renamed from: androidx.legacy.app.FragmentTabHost$SavedState$a */
        public static class C0978a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("FragmentTabHost.SavedState{");
            k.append(Integer.toHexString(System.identityHashCode(this)));
            k.append(" curTab=");
            return C0016g.m31o(k, this.f3871b, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3871b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3871b = parcel.readString();
        }
    }

    /* renamed from: androidx.legacy.app.FragmentTabHost$a */
    public static final class C0979a {
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    public final void mo4210a(String str) {
        if (this.f3868b.size() <= 0) {
            throw new IllegalStateException(C25541a.m63881k("No tab known for tag ", str));
        }
        this.f3868b.get(0).getClass();
        throw null;
    }

    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f3868b.size() > 0) {
            this.f3868b.get(0).getClass();
            throw null;
        }
        this.f3870d = true;
        mo4210a(currentTabTag);
        throw null;
    }

    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3870d = false;
    }

    @Deprecated
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3871b);
    }

    @Deprecated
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3871b = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public final void onTabChanged(String str) {
        if (!this.f3870d) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f3869c;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
                return;
            }
            return;
        }
        mo4210a(str);
        throw null;
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3869c = onTabChangeListener;
    }

    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
