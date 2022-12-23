package com.moovit.app.home.tab;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.ads.AdSource;
import com.tranzmate.R;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum HomeTabUi implements Parcelable {
    DASHBOARD(R.string.tab_directions, R.drawable.wdg_bottom_bar_directions, "dashboard_clicked", "direction_tab_tap", AdSource.DASHBOARD_BANNER, R.string.voice_over_home_tab_hint),
    NEARBY(R.string.tab_map, R.drawable.wdg_bottom_bar_nearby_tab, "map_view_clicked", "station_tab_tap", AdSource.NEARBY_BANNER, R.string.voice_over_stations_tab_hint),
    LINES(R.string.tab_lines, R.drawable.wdg_bottom_bar_lines_tab, "lines_clicked", "lines_tab_tap", AdSource.LINES_BANNER, R.string.voice_over_lines_tab_hint),
    WALLET(R.string.tab_wallet, R.drawable.wdg_bottom_bar_wallet_tab, "wallet_clicked", "wallet_tab_tap", (String) null, 0),
    WONDO_NEARBY(R.string.tab_map_wondo, R.drawable.wdg_bottom_bar_nearby_wondo_tab, "map_view_clicked", "station_tab_tap", (String) null, 0);
    
    public static final C19577c<HomeTabUi> CODER = null;
    public static final Parcelable.Creator<HomeTabUi> CREATOR = null;
    public final AdSource adSource;
    public final String analyticTabButtonType;
    public final int contentDescriptionResId;
    public final int iconResId;
    public final String marketingTabButtonType;
    public final int textResId;

    /* renamed from: com.moovit.app.home.tab.HomeTabUi$a */
    public class C15013a implements Parcelable.Creator<HomeTabUi> {
        public final Object createFromParcel(Parcel parcel) {
            return (HomeTabUi) C19612n.m46981v(parcel, HomeTabUi.CODER);
        }

        public final Object[] newArray(int i) {
            return new HomeTabUi[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        HomeTabUi homeTabUi;
        HomeTabUi homeTabUi2;
        HomeTabUi homeTabUi3;
        HomeTabUi homeTabUi4;
        HomeTabUi homeTabUi5;
        CODER = new C19577c<>(HomeTabUi.class, homeTabUi, homeTabUi2, homeTabUi3, homeTabUi5, homeTabUi4);
        CREATOR = new C15013a();
    }

    private HomeTabUi(int i, int i2, String str, String str2, AdSource adSource2, int i3) {
        this.textResId = i;
        this.iconResId = i2;
        C21100e.m49373x(str, "analyticTabButtonType");
        this.analyticTabButtonType = str;
        C21100e.m49373x(str2, "marketingTabButtonType");
        this.marketingTabButtonType = str2;
        this.adSource = adSource2;
        this.contentDescriptionResId = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
