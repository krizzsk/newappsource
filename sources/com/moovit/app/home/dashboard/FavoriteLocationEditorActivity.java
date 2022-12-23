package com.moovit.app.home.dashboard;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.app.useraccount.manager.favorites.LocationsGroup;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.usebutton.sdk.internal.events.Events;
import j20.C17706c;
import j20.C17708e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p455dy.C16753e;
import p471eq.C16850a;
import p543hq.C17474b;
import p567iq.C17635b;
import p733pr.C18960b;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p824tp.C19728f;
import p977zz.C20964s0;
import p977zz.C20975x0;

public class FavoriteLocationEditorActivity extends MoovitAppActivity {

    /* renamed from: s0 */
    public static final /* synthetic */ int f38158s0 = 0;

    /* renamed from: U */
    public FavoriteType f38159U;

    /* renamed from: X */
    public ActionType f38160X;

    /* renamed from: Y */
    public LocationFavorite f38161Y;

    /* renamed from: Z */
    public LocationDescriptor f38162Z;

    /* renamed from: l0 */
    public TextInputLayout f38163l0;

    /* renamed from: m0 */
    public EditText f38164m0;

    /* renamed from: n0 */
    public TextView f38165n0;

    /* renamed from: o0 */
    public View f38166o0;

    /* renamed from: p0 */
    public MapFragment f38167p0;

    /* renamed from: q0 */
    public Object f38168q0 = null;

    /* renamed from: r0 */
    public MarkerZoomStyle f38169r0;

    public enum ActionType implements Parcelable {
        ADD,
        EDIT;
        
        public static final C19577c<ActionType> CODER = null;
        public static final Parcelable.Creator<ActionType> CREATOR = null;

        /* renamed from: com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$ActionType$a */
        public class C14920a implements Parcelable.Creator<ActionType> {
            public final Object createFromParcel(Parcel parcel) {
                return (ActionType) C19612n.m46981v(parcel, ActionType.CODER);
            }

            public final Object[] newArray(int i) {
                return new ActionType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            ActionType actionType;
            ActionType actionType2;
            CODER = new C19577c<>(ActionType.class, actionType, actionType2);
            CREATOR = new C14920a();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public enum FavoriteType implements Parcelable {
        HOME(R.string.favorite_home_title, R.string.dashboard_favorites_home, R.drawable.ic_map_favorite_home_44_surface_dark, R.string.favorite_home_label, "home"),
        WORK(R.string.favorite_work_title, R.string.dashboard_favorites_work, R.drawable.ic_map_favorite_work_44_surface_dark, R.string.favorite_work_label, "work"),
        LOCATION(R.string.add_location_title, 0, R.drawable.ic_map_favorite_44_surface_dark, R.string.new_favorite_label, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
        public static final C19577c<FavoriteType> CODER = null;
        public static final Parcelable.Creator<FavoriteType> CREATOR = null;
        /* access modifiers changed from: private */
        public final int activityTitleResId;
        /* access modifiers changed from: private */
        public final String analyticsConstantType;
        /* access modifiers changed from: private */
        public final int fallbackNameResId;
        /* access modifiers changed from: private */
        public final int locationSearchHintResId;
        /* access modifiers changed from: private */
        public final int mapMarkerImageResId;

        /* renamed from: com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$FavoriteType$a */
        public class C14921a implements Parcelable.Creator<FavoriteType> {
            public final Object createFromParcel(Parcel parcel) {
                return (FavoriteType) C19612n.m46981v(parcel, FavoriteType.CODER);
            }

            public final Object[] newArray(int i) {
                return new FavoriteType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            FavoriteType favoriteType;
            FavoriteType favoriteType2;
            FavoriteType favoriteType3;
            CREATOR = new C14921a();
            CODER = new C19577c<>(FavoriteType.class, favoriteType, favoriteType2, favoriteType3);
        }

        private FavoriteType(int i, int i2, int i3, int i4, String str) {
            this.activityTitleResId = i;
            this.fallbackNameResId = i2;
            this.mapMarkerImageResId = i3;
            this.locationSearchHintResId = i4;
            this.analyticsConstantType = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$a */
    public static /* synthetic */ class C14922a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38170a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38171b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$ActionType[] r0 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38171b = r0
                r1 = 1
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$ActionType r2 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.ActionType.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f38171b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$ActionType r3 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.ActionType.EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$FavoriteType[] r2 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.FavoriteType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f38170a = r2
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$FavoriteType r3 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.FavoriteType.LOCATION     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f38170a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$FavoriteType r2 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.FavoriteType.HOME     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f38170a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.app.home.dashboard.FavoriteLocationEditorActivity$FavoriteType r1 = com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.FavoriteType.WORK     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.FavoriteLocationEditorActivity.C14922a.<clinit>():void");
        }
    }

    /* renamed from: A2 */
    public static Intent m37662A2(Context context, LocationDescriptor locationDescriptor) {
        Intent intent = new Intent(context, FavoriteLocationEditorActivity.class);
        FavoriteType favoriteType = FavoriteType.HOME;
        ActionType actionType = ActionType.ADD;
        C21100e.m49373x(locationDescriptor, "addedLocationDescriptor");
        m37667z2(intent, favoriteType, actionType, locationDescriptor);
        return intent;
    }

    /* renamed from: B2 */
    public static Intent m37663B2(MoovitActivity moovitActivity, LocationDescriptor locationDescriptor) {
        Intent intent = new Intent(moovitActivity, FavoriteLocationEditorActivity.class);
        m37667z2(intent, FavoriteType.LOCATION, ActionType.ADD, locationDescriptor);
        return intent;
    }

    /* renamed from: C2 */
    public static Intent m37664C2(Context context) {
        Intent intent = new Intent(context, FavoriteLocationEditorActivity.class);
        m37667z2(intent, FavoriteType.HOME, ActionType.EDIT, (Parcelable) null);
        return intent;
    }

    /* renamed from: D2 */
    public static Intent m37665D2(Context context) {
        Intent intent = new Intent(context, FavoriteLocationEditorActivity.class);
        m37667z2(intent, FavoriteType.WORK, ActionType.EDIT, (Parcelable) null);
        return intent;
    }

    /* renamed from: y2 */
    public static void m37666y2(FavoriteLocationEditorActivity favoriteLocationEditorActivity) {
        favoriteLocationEditorActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_edit_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.FAVORITE_TYPE, favoriteLocationEditorActivity.f38159U.analyticsConstantType);
        favoriteLocationEditorActivity.mo44545v2(aVar.mo49933a());
        favoriteLocationEditorActivity.mo45102H2();
    }

    /* renamed from: z2 */
    public static <T extends Parcelable> void m37667z2(Intent intent, FavoriteType favoriteType, ActionType actionType, T t) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("type", favoriteType);
        bundle.putParcelable(Events.PROPERTY_ACTION, actionType);
        bundle.putParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY, t);
        intent.putExtras(bundle);
    }

    /* renamed from: E2 */
    public final void mo45099E2(LocationDescriptor locationDescriptor) {
        boolean z;
        this.f38165n0.setText(locationDescriptor.mo24313f());
        this.f38165n0.setTag(locationDescriptor);
        View view = this.f38166o0;
        if (((LocationDescriptor) this.f38165n0.getTag()) != null) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        mo45103I2(locationDescriptor);
    }

    /* renamed from: F2 */
    public final void mo45100F2(LocationDescriptor locationDescriptor) {
        if (!LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b) || !LocationDescriptor.SourceType.USER_LOCATION.equals(locationDescriptor.f23648c)) {
            ExecutorService executorService = MoovitExecutors.f37327IO;
            HashSet hashSet = C19728f.f50164e;
            Tasks.call(executorService, new C17708e(this, (C19728f) getSystemService("metro_context"), locationDescriptor, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener((Activity) this, new C14943h(this, locationDescriptor));
            mo45099E2(locationDescriptor);
            return;
        }
        LatLonE6 j = LatLonE6.m40177j(C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i());
        if (j != null) {
            mo45100F2(LocationDescriptor.m17770k(j));
        }
    }

    /* renamed from: G2 */
    public final void mo45101G2() {
        String str;
        boolean z;
        LocationFavorite locationFavorite;
        LocationFavorite locationFavorite2;
        LocationDescriptor locationDescriptor = (LocationDescriptor) this.f38165n0.getTag();
        Editable text = this.f38164m0.getText();
        if (text == null) {
            str = null;
        } else {
            str = text.toString();
        }
        C16753e eVar = (C16753e) getSystemService("user_favorites_manager_service");
        int i = C14922a.f38170a[this.f38159U.ordinal()];
        if (i != 1) {
            if (i == 2) {
                eVar.getClass();
                C21100e.m49373x(locationDescriptor, "homeLocation");
                eVar.mo49449z(new LocationFavorite(locationDescriptor, str));
            } else if (i == 3) {
                eVar.getClass();
                C21100e.m49373x(locationDescriptor, "workLocation");
                eVar.mo49430A(new LocationFavorite(locationDescriptor, str));
            }
        } else if (this.f38160X.equals(ActionType.ADD)) {
            eVar.mo49433g(locationDescriptor, str);
        } else if (this.f38160X.equals(ActionType.EDIT) && (locationFavorite2 = this.f38161Y) != null) {
            eVar.getClass();
            C21100e.m49373x(locationDescriptor, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            LocationFavorite locationFavorite3 = new LocationFavorite(locationDescriptor, str);
            if (eVar.f43617a.f40592c.contains(locationFavorite2)) {
                LocationsGroup locationsGroup = eVar.f43617a;
                int indexOf = locationsGroup.f40592c.indexOf(locationFavorite2);
                if (indexOf > -1) {
                    locationsGroup.f40592c.set(indexOf, locationFavorite3);
                }
                C17635b.m43779f(eVar.f43622f).f50175e.mo52611d().mo52771o(eVar.f43622f, eVar.f43624h, eVar.f43617a.mo46585b());
                Iterator it = eVar.f43625i.iterator();
                while (it.hasNext()) {
                    ((C16753e.C16756c) it.next()).mo44788s(eVar, locationFavorite3);
                }
            }
        }
        boolean z2 = false;
        if (!this.f38160X.equals(ActionType.EDIT) || (locationFavorite = this.f38161Y) == null) {
            z = false;
        } else {
            z2 = !C20975x0.m49118e(str, locationFavorite.f40599c);
            z = !C20975x0.m49118e(locationDescriptor, (LocationDescriptor) this.f38161Y.f52687b);
        }
        boolean equals = this.f38160X.equals(ActionType.ADD);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_save_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.FAVORITE_TYPE, this.f38159U.analyticsConstantType);
        aVar.mo49941i(AnalyticsAttributeKey.IS_FIRST_TIME, equals);
        aVar.mo49941i(AnalyticsAttributeKey.LABEL_EDIT, z2);
        aVar.mo49941i(AnalyticsAttributeKey.LOCATION_EDIT, z);
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, locationDescriptor.f23647b.name());
        aVar.mo49943k(AnalyticsAttributeKey.SELECTED_ID, locationDescriptor.f23649d);
        mo44545v2(aVar.mo49933a());
        setResult(-1);
        finish();
    }

    /* renamed from: H2 */
    public final void mo45102H2() {
        String str;
        AppSearchLocationCallback appSearchLocationCallback = new AppSearchLocationCallback(this.f38159U.locationSearchHintResId, R.string.empty_location_search_history, true, true, false);
        TextView textView = this.f38165n0;
        if (textView == null || C20964s0.m49090h(textView.getText())) {
            str = null;
        } else {
            str = C20964s0.m49082C(this.f38165n0.getText());
        }
        startActivityForResult(SearchLocationActivity.m17347y2(this, appSearchLocationCallback, "favorites_editor", str), 1001);
    }

    /* renamed from: I2 */
    public final void mo45103I2(LocationDescriptor locationDescriptor) {
        LatLonE6 latLonE6;
        if (!this.f38167p0.mo48624U2()) {
            this.f38167p0.mo48656t2(new C14944i(0, this, locationDescriptor));
            return;
        }
        Object obj = this.f38168q0;
        if (obj != null) {
            this.f38167p0.mo48636g3(obj);
        }
        if (locationDescriptor.f23648c == LocationDescriptor.SourceType.USER_LOCATION) {
            latLonE6 = LatLonE6.m40177j(C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i());
        } else {
            latLonE6 = locationDescriptor.mo24310d();
        }
        if (latLonE6 != null) {
            this.f38168q0 = this.f38167p0.mo48646o2(latLonE6, latLonE6, this.f38169r0);
            this.f38167p0.mo48663x2(latLonE6);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        LocationDescriptor locationDescriptor;
        int i;
        String str;
        ActionType actionType;
        String str2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.favorite_location_editor_activity);
        Intent intent = getIntent();
        FavoriteType favoriteType = (FavoriteType) intent.getParcelableExtra("type");
        boolean z = true;
        String str3 = null;
        if (favoriteType == null) {
            Uri data = intent.getData();
            if (data != null) {
                str2 = data.getQueryParameter("ft");
            } else {
                str2 = null;
            }
            if (str2 == null) {
                favoriteType = FavoriteType.HOME;
            } else {
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != 104) {
                    if (hashCode != 108) {
                        if (hashCode == 119 && str2.equals("w")) {
                            c = 2;
                        }
                    } else if (str2.equals("l")) {
                        c = 3;
                    }
                } else if (str2.equals("h")) {
                    c = 1;
                }
                if (c == 2) {
                    favoriteType = FavoriteType.WORK;
                } else if (c != 3) {
                    favoriteType = FavoriteType.HOME;
                } else {
                    favoriteType = FavoriteType.LOCATION;
                }
            }
        }
        this.f38159U = favoriteType;
        ActionType actionType2 = (ActionType) intent.getParcelableExtra(Events.PROPERTY_ACTION);
        if (actionType2 == null) {
            if (FavoriteType.LOCATION.equals(favoriteType)) {
                actionType = ActionType.ADD;
            } else {
                actionType = ActionType.EDIT;
            }
            actionType2 = actionType;
        }
        this.f38160X = actionType2;
        Parcelable parcelableExtra = intent.getParcelableExtra(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        int i2 = C14922a.f38171b[this.f38160X.ordinal()];
        if (i2 == 1) {
            this.f38162Z = (LocationDescriptor) parcelableExtra;
        } else if (i2 == 2) {
            this.f38161Y = (LocationFavorite) parcelableExtra;
        }
        ActionType actionType3 = this.f38160X;
        ActionType actionType4 = ActionType.EDIT;
        if (actionType3.equals(actionType4)) {
            C16753e eVar = (C16753e) getSystemService("user_favorites_manager_service");
            int i3 = C14922a.f38170a[this.f38159U.ordinal()];
            if (i3 == 2) {
                this.f38161Y = eVar.f43620d;
            } else if (i3 == 3) {
                this.f38161Y = eVar.f43621e;
            }
        }
        setTitle(this.f38159U.activityTitleResId);
        this.f38169r0 = new MarkerZoomStyle(new ResourceImage(this.f38159U.mapMarkerImageResId, new String[0]));
        this.f38167p0 = (MapFragment) mo44529n1(R.id.map_fragment);
        View findViewById = findViewById(R.id.save_button);
        this.f38166o0 = findViewById;
        findViewById.setOnClickListener(new C4052r(this, 7));
        TextView textView = (TextView) findViewById(R.id.location_address);
        this.f38165n0 = textView;
        LocationFavorite locationFavorite = this.f38161Y;
        if (locationFavorite == null) {
            locationDescriptor = null;
        } else {
            locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
        }
        if (locationDescriptor != null) {
            textView.setText(locationDescriptor.mo24313f());
            this.f38165n0.setTag(locationDescriptor);
            mo45103I2(locationDescriptor);
        }
        View findViewById2 = findViewById(R.id.edit_location_address);
        if (this.f38160X.equals(actionType4)) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById2.setVisibility(i);
        if (findViewById2.getVisibility() == 0) {
            findViewById(R.id.location_address_container).setOnClickListener(new C16850a(this, 8));
        }
        this.f38163l0 = (TextInputLayout) findViewById(R.id.location_name_input);
        this.f38164m0 = (EditText) findViewById(R.id.location_name);
        LocationDescriptor locationDescriptor2 = this.f38162Z;
        if (this.f38159U.fallbackNameResId != 0) {
            str = getString(this.f38159U.fallbackNameResId);
        } else if (locationDescriptor2 != null && locationDescriptor2.f23647b.equals(LocationDescriptor.LocationType.POI)) {
            str = locationDescriptor2.f23651f;
        } else {
            str = null;
        }
        this.f38163l0.setPlaceholderText(str);
        LocationFavorite locationFavorite2 = this.f38161Y;
        if (locationFavorite2 != null) {
            str3 = locationFavorite2.f40599c;
        }
        if (this.f38160X == actionType4) {
            this.f38164m0.setText(str3);
        }
        this.f38164m0.addTextChangedListener(new C14945j(this));
        this.f38164m0.setOnEditorActionListener(new C18960b(this, 1));
        if (C20964s0.m49090h(str3) && C20964s0.m49090h(str)) {
            getWindow().setSoftInputMode(4);
            this.f38164m0.requestFocus();
        }
        View view = this.f38166o0;
        if (((LocationDescriptor) this.f38165n0.getTag()) == null) {
            z = false;
        }
        view.setEnabled(z);
        LocationDescriptor locationDescriptor3 = this.f38162Z;
        if (locationDescriptor3 != null) {
            mo45100F2(locationDescriptor3);
        }
        if ((actionType4.equals(this.f38160X) && this.f38161Y == null) || (ActionType.ADD.equals(this.f38160X) && this.f38162Z == null)) {
            mo45102H2();
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        if (!C13382a.m33671g(this)) {
            getWindow().findViewById(R.id.action_bar).requestFocus();
        }
    }

    public final Intent getParentActivityIntent() {
        return HomeActivity.m37644y2(this, (Uri) null, (HomeTab) null, 0);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        Intent intent = getIntent();
        ActionType actionType = (ActionType) intent.getParcelableExtra(Events.PROPERTY_ACTION);
        if (actionType != null) {
            m1.mo49941i(AnalyticsAttributeKey.IS_FIRST_TIME, actionType.equals(ActionType.ADD));
        }
        m1.mo49945m(AnalyticsAttributeKey.URI, intent.getDataString());
        return m1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            LocationDescriptor locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("search_result");
            if (locationDescriptor != null) {
                mo45100F2(locationDescriptor);
            }
        } else if (ActionType.EDIT.equals(this.f38160X) && this.f38161Y == null) {
            finish();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }
}
