package com.moovit.home.lines.search;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p824tp.C19742t;

public class DefaultEmptySearchLineViewFactory implements EmptySearchLineViewFactory {
    public static final Parcelable.Creator<DefaultEmptySearchLineViewFactory> CREATOR = new C15990a();

    /* renamed from: com.moovit.home.lines.search.DefaultEmptySearchLineViewFactory$a */
    public class C15990a implements Parcelable.Creator<DefaultEmptySearchLineViewFactory> {
        public final Object createFromParcel(Parcel parcel) {
            return new DefaultEmptySearchLineViewFactory();
        }

        public final Object[] newArray(int i) {
            return new DefaultEmptySearchLineViewFactory[i];
        }
    }

    /* renamed from: O1 */
    public final View mo45196O1(SearchLineFragment searchLineFragment, RecyclerView recyclerView) {
        return LayoutInflater.from(searchLineFragment.getContext()).inflate(C19742t.search_lines_fragment_empty_search, recyclerView, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
