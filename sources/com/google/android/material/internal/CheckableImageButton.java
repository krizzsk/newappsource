package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import p114i.C5215a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p255t1.C6531g;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: h */
    public static final int[] f34926h = {16842912};

    /* renamed from: e */
    public boolean f34927e;

    /* renamed from: f */
    public boolean f34928f;

    /* renamed from: g */
    public boolean f34929g;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14037a();

        /* renamed from: b */
        public boolean f34930b;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        public class C14037a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34930b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34930b = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C14038a extends C6315a {
        public C14038a() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            gVar.f20334a.setCheckable(CheckableImageButton.this.f34928f);
            gVar.f20334a.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.imageButtonStyle);
    }

    public final boolean isChecked() {
        return this.f34927e;
    }

    public final int[] onCreateDrawableState(int i) {
        if (!this.f34927e) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f34926h);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f34930b);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f34930b = this.f34927e;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f34928f != z) {
            this.f34928f = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f34928f && this.f34927e != z) {
            this.f34927e = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f34929g = z;
    }

    public void setPressed(boolean z) {
        if (this.f34929g) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.f34927e);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34928f = true;
        this.f34929g = true;
        C6333d0.m15029q(this, new C14038a());
    }
}
