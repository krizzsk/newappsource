package com.moovit.app.home.lines;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.home.lines.search.EmptySearchLineViewFactory;
import com.moovit.home.lines.search.SearchLineFragment;
import com.tranzmate.R;
import p297w5.C6996c;

public class LocationsEmptySearchLineViewFactory implements EmptySearchLineViewFactory {
    public static final Parcelable.Creator<LocationsEmptySearchLineViewFactory> CREATOR = new C14994a();

    /* renamed from: com.moovit.app.home.lines.LocationsEmptySearchLineViewFactory$a */
    public class C14994a implements Parcelable.Creator<LocationsEmptySearchLineViewFactory> {
        public final Object createFromParcel(Parcel parcel) {
            return new LocationsEmptySearchLineViewFactory();
        }

        public final Object[] newArray(int i) {
            return new LocationsEmptySearchLineViewFactory[i];
        }
    }

    /* renamed from: O1 */
    public final View mo45196O1(SearchLineFragment searchLineFragment, RecyclerView recyclerView) {
        View inflate = LayoutInflater.from(searchLineFragment.getContext()).inflate(R.layout.search_lines_fragment_locations_empty_search, recyclerView, false);
        inflate.findViewById(R.id.search_locations_button).setOnClickListener(new C6996c(searchLineFragment, 13));
        return inflate;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
