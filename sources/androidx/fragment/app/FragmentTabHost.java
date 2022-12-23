package androidx.fragment.app;

import android.annotation.SuppressLint;
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
    public final ArrayList<C0903a> f3683b = new ArrayList<>();

    /* renamed from: c */
    public TabHost.OnTabChangeListener f3684c;

    /* renamed from: d */
    public boolean f3685d;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0902a();

        /* renamed from: b */
        public String f3686b;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C0902a implements Parcelable.Creator<SavedState> {
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
            return C0016g.m31o(k, this.f3686b, "}");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3686b);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3686b = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C0903a {
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
    public final C0932h0 mo4012a() {
        if (this.f3683b.size() <= 0) {
            return null;
        }
        this.f3683b.get(0).getClass();
        throw null;
    }

    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        if (this.f3683b.size() <= 0) {
            this.f3685d = true;
            mo4012a();
            return;
        }
        this.f3683b.get(0).getClass();
        throw null;
    }

    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3685d = false;
    }

    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3686b);
    }

    @Deprecated
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3686b = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public final void onTabChanged(String str) {
        if (this.f3685d) {
            mo4012a();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3684c;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3684c = onTabChangeListener;
    }

    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
