package com.moovit.home.lines.search;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.transit.TransitType;
import p397bu.C13686d;
import p824tp.C19740r;
import p824tp.C19742t;

public class DefaultPagerEmptySearchLineViewFactory implements EmptySearchLineViewFactory {
    public static final Parcelable.Creator<DefaultPagerEmptySearchLineViewFactory> CREATOR = new C15991a();

    /* renamed from: com.moovit.home.lines.search.DefaultPagerEmptySearchLineViewFactory$a */
    public class C15991a implements Parcelable.Creator<DefaultPagerEmptySearchLineViewFactory> {
        public final Object createFromParcel(Parcel parcel) {
            return new DefaultPagerEmptySearchLineViewFactory();
        }

        public final Object[] newArray(int i) {
            return new DefaultPagerEmptySearchLineViewFactory[i];
        }
    }

    /* renamed from: O1 */
    public final View mo45196O1(SearchLineFragment searchLineFragment, RecyclerView recyclerView) {
        A a = searchLineFragment.f40822c;
        TransitType transitType = searchLineFragment.f41628r;
        if (transitType == null || !(a instanceof SearchLinePagerActivity)) {
            return mo45201b(searchLineFragment, recyclerView);
        }
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(C19742t.search_lines_fragment_empty_transit_type_search, recyclerView, false);
        inflate.findViewById(C19740r.search_all_lines_button).setOnClickListener(new C13686d(searchLineFragment, transitType, (SearchLinePagerActivity) a, 2));
        return inflate;
    }

    /* renamed from: b */
    public View mo45201b(SearchLineFragment searchLineFragment, RecyclerView recyclerView) {
        return LayoutInflater.from(recyclerView.getContext()).inflate(C19742t.search_lines_fragment_empty_search, recyclerView, false);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
