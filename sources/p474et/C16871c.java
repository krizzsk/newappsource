package p474et;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment;
import com.moovit.transit.TransitStop;
import mf0.C24362h;

/* renamed from: et.c */
public final class C16871c extends C16872d {

    /* renamed from: c */
    public final TransitStop f43881c;

    /* renamed from: d */
    public final boolean f43882d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16871c(String str, TransitStop transitStop, boolean z) {
        super(str);
        C24362h.m61211f(transitStop, "stop");
        this.f43881c = transitStop;
        this.f43882d = z;
    }

    /* renamed from: a */
    public final Fragment mo49530a(int i) {
        int i2 = StopSuggestionFragment.f38338s;
        TransitStop transitStop = this.f43881c;
        boolean z = this.f43882d;
        String str = this.f43883a;
        C24362h.m61211f(transitStop, "stop");
        C24362h.m61211f(str, "source");
        Bundle bundle = new Bundle();
        bundle.putParcelable("stop", transitStop);
        bundle.putBoolean("isFavorite", z);
        bundle.putString("source", str);
        bundle.putInt("index", i);
        StopSuggestionFragment stopSuggestionFragment = new StopSuggestionFragment();
        stopSuggestionFragment.setArguments(bundle);
        return stopSuggestionFragment;
    }
}
