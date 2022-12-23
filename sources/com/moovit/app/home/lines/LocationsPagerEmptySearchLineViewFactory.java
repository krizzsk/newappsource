package com.moovit.app.home.lines;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.home.lines.search.DefaultPagerEmptySearchLineViewFactory;
import com.moovit.home.lines.search.SearchLineFragment;
import com.tranzmate.R;
import p073e7.C4584b;

public class LocationsPagerEmptySearchLineViewFactory extends DefaultPagerEmptySearchLineViewFactory {
    public static final Parcelable.Creator<LocationsPagerEmptySearchLineViewFactory> CREATOR = new C14995a();

    /* renamed from: com.moovit.app.home.lines.LocationsPagerEmptySearchLineViewFactory$a */
    public class C14995a implements Parcelable.Creator<LocationsPagerEmptySearchLineViewFactory> {
        public final Object createFromParcel(Parcel parcel) {
            return new LocationsPagerEmptySearchLineViewFactory();
        }

        public final Object[] newArray(int i) {
            return new LocationsPagerEmptySearchLineViewFactory[i];
        }
    }

    /* renamed from: b */
    public final View mo45201b(SearchLineFragment searchLineFragment, RecyclerView recyclerView) {
        View inflate = LayoutInflater.from(searchLineFragment.getContext()).inflate(R.layout.search_lines_fragment_locations_empty_search, recyclerView, false);
        inflate.findViewById(R.id.search_locations_button).setOnClickListener(new C4584b(searchLineFragment, 14));
        return inflate;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
