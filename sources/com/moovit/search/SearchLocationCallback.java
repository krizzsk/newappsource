package com.moovit.search;

import android.os.Parcelable;
import com.moovit.transit.LocationDescriptor;
import java.util.HashSet;
import java.util.List;

public interface SearchLocationCallback extends Parcelable {
    /* renamed from: I0 */
    int mo23880I0();

    /* renamed from: N */
    void mo23881N(HashSet hashSet);

    /* renamed from: g0 */
    int mo23883g0();

    /* renamed from: h0 */
    List mo23884h0();

    /* renamed from: h1 */
    void mo23885h1(SearchLocationActivity searchLocationActivity, String str, LocationDescriptor locationDescriptor, SearchAction searchAction);

    /* renamed from: l0 */
    void mo23886l0(SearchLocationActivity searchLocationActivity, C7606b bVar);
}
