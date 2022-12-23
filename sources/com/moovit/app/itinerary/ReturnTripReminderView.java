package com.moovit.app.itinerary;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import androidx.customview.view.AbsSavedState;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import p584jl.C17885a;

public class ReturnTripReminderView extends ListItemView {

    /* renamed from: q0 */
    public long f38521q0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15031a();

        /* renamed from: b */
        public long f38522b;

        /* renamed from: com.moovit.app.itinerary.ReturnTripReminderView$SavedState$a */
        public class C15031a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            parcel.writeLong(this.f38522b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f38522b = parcel.readLong();
        }
    }

    public ReturnTripReminderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listItemInfoBannerStyle);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setReminderTime(savedState.f38522b);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f38522b = this.f38521q0;
        return savedState;
    }

    public void setReminderTime(long j) {
        if (j >= 0) {
            this.f38521q0 = j;
            setIcon((int) R.drawable.ic_clock_24_primary);
            setTitle((int) R.string.return_trip_reminder_itinerary_set);
            String l = C7925b.m18024l(getContext(), j);
            Button button = (Button) getAccessoryView();
            C17885a.m44467v0(button, R.drawable.ic_check_mark_circ_16);
            button.setText(l);
            button.setEnabled(false);
            setEnabled(false);
        }
    }

    public ReturnTripReminderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38521q0 = -1;
        LayoutInflater.from(context).inflate(R.layout.return_trip_reminder_fragment, this, true);
        setIcon((int) R.drawable.ic_return_24_primary);
        setTitle((int) R.string.return_trip_reminder_itinerary);
    }
}
