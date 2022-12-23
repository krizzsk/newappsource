package com.moovit.app.search.locations;

import a00.C13382a;
import aa0.C7527d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import b00.C13556a;
import b00.C13559d;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import ci0.C21211f;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.nearby.messages.Strategy;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.C15053i;
import com.moovit.app.location.mappicker.FavoriteLocationsMarkerProvider;
import com.moovit.app.location.mappicker.FavoriteStopsMarkerProvider;
import com.moovit.app.location.mappicker.RecentLocationsMarkerProvider;
import com.moovit.app.search.AbstractSearchActivity;
import com.moovit.app.search.SearchAction;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.view.list.C15819a;
import com.moovit.commons.view.list.SectionedListView;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.genies.Genie;
import com.moovit.image.model.Image;
import com.moovit.location.C16202a;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import com.moovit.search.SearchLocationMapActivity;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import je0.C23715f;
import k00.C17988b;
import m00.C18313e;
import m10.C18316a;
import p073e7.C4585c;
import p250s9.C6489b;
import p259t5.C6592b;
import p394br.C13660f;
import p455dy.C16753e;
import p495fq.C17058c;
import p543hq.C17474b;
import p583jk.C17875h;
import p669mz.C18487d;
import p824tp.C19728f;
import p858uz.C20061g;
import p878vv.C20234a;
import p878vv.C20236c;
import p878vv.C20237d;
import p878vv.C20238e;
import p906wz.C20431c;
import p906wz.C20436g;
import p924xt.C20603k;
import p944yq.C20750a;
import p977zz.C20944i0;
import p977zz.C20964s0;
import q00.C19047a;
import q00.C19053d;
import x00.C20440a;

/* renamed from: com.moovit.app.search.locations.a */
public class C15284a extends AbstractSearchActivity.C15267d {

    /* renamed from: U */
    public static final ServerId f39471U = new ServerId(-100);

    /* renamed from: X */
    public static final ServerId f39472X = new ServerId(-200);

    /* renamed from: Y */
    public static final C15053i f39473Y;

    /* renamed from: Z */
    public static final C20603k f39474Z;

    /* renamed from: l0 */
    public static final C13723g.C13724a f39475l0;

    /* renamed from: m0 */
    public static final C6489b f39476m0 = new C6489b(0);

    /* renamed from: n0 */
    public static final C13660f f39477n0 = new C13660f(2);

    /* renamed from: A */
    public C15298n f39478A;

    /* renamed from: B */
    public SectionedListView f39479B;

    /* renamed from: C */
    public View f39480C;

    /* renamed from: D */
    public C15298n f39481D;

    /* renamed from: E */
    public C13556a f39482E = null;

    /* renamed from: F */
    public C15295k f39483F = null;

    /* renamed from: G */
    public int f39484G = Strategy.TTL_SECONDS_DEFAULT;

    /* renamed from: H */
    public boolean f39485H = false;

    /* renamed from: I */
    public final C15294j f39486I = new C15294j();

    /* renamed from: J */
    public C15297m f39487J;

    /* renamed from: K */
    public C15297m f39488K;

    /* renamed from: L */
    public C15297m f39489L;

    /* renamed from: M */
    public C16753e f39490M;

    /* renamed from: N */
    public final C7527d<SearchLocationItem> f39491N = new C7527d<>(SearchLocationItem.f39456q);

    /* renamed from: O */
    public Handler f39492O;

    /* renamed from: P */
    public C15289e f39493P = new C15289e();

    /* renamed from: Q */
    public final C20750a f39494Q = new C20750a(this, 2);

    /* renamed from: R */
    public final C17058c f39495R = new C17058c(this, 4);

    /* renamed from: S */
    public C16202a.C16203a f39496S = null;

    /* renamed from: T */
    public View f39497T;

    /* renamed from: s */
    public final C15286b f39498s = new C15286b();

    /* renamed from: t */
    public final C6592b f39499t = new C6592b(this, 26);

    /* renamed from: u */
    public final C15287c f39500u = new C15287c();

    /* renamed from: v */
    public C15288d f39501v = new C15288d();

    /* renamed from: w */
    public final C20234a f39502w = new C20234a(this, 0);

    /* renamed from: x */
    public AlertMessageView f39503x;

    /* renamed from: y */
    public SectionedListView f39504y;

    /* renamed from: z */
    public View f39505z;

    /* renamed from: com.moovit.app.search.locations.a$a */
    public static /* synthetic */ class C15285a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39506a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39507b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.moovit.app.search.SearchAction[] r0 = com.moovit.app.search.SearchAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39507b = r0
                r1 = 1
                com.moovit.app.search.SearchAction r2 = com.moovit.app.search.SearchAction.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39507b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.search.SearchAction r3 = com.moovit.app.search.SearchAction.COPY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f39507b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.search.SearchAction r3 = com.moovit.app.search.SearchAction.SHOW_DETAILS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f39507b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.search.SearchAction r3 = com.moovit.app.search.SearchAction.MARK_AS_FAVORITE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.moovit.app.search.locations.SearchLocationItem$Source[] r2 = com.moovit.app.search.locations.SearchLocationItem.Source.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f39506a = r2
                com.moovit.app.search.locations.SearchLocationItem$Source r3 = com.moovit.app.search.locations.SearchLocationItem.Source.LOCATION_FAVORITE_HOME     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f39506a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.moovit.app.search.locations.SearchLocationItem$Source r2 = com.moovit.app.search.locations.SearchLocationItem.Source.LOCATION_FAVORITE_WORK     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.C15284a.C15285a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$b */
    public class C15286b extends C18313e<C20238e> {
        public C15286b() {
        }

        /* renamed from: a */
        public final void mo45697a(Object obj) {
            C15284a aVar = C15284a.this;
            aVar.f39485H = true;
            aVar.mo45827u2((C20238e) obj);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$c */
    public class C15287c implements View.OnClickListener {
        public C15287c() {
        }

        public final void onClick(View view) {
            C15284a aVar = C15284a.this;
            C15297m mVar = aVar.f39489L;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "show_on_map_clicked");
            aVar.mo46797j2(aVar2.mo49933a());
            ArrayList arrayList = new ArrayList();
            int min = Math.min(mVar.size(), 10);
            for (int i = 0; i < min; i++) {
                arrayList.add(SearchLocationItem.m39103g((SearchLocationItem) mVar.get(i)));
            }
            FragmentActivity activity = aVar.getActivity();
            int i2 = SearchLocationMapActivity.f23138p0;
            Intent intent = new Intent(activity, SearchLocationMapActivity.class);
            intent.putExtra("LOCATION_ITEM_EXTRA", C13717b.m34264k(arrayList));
            aVar.startActivityForResult(intent, 1782);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$d */
    public class C15288d extends C21211f {
        public C15288d() {
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C20237d dVar = (C20237d) cVar;
            if (!(serverException instanceof UserRequestError)) {
                return false;
            }
            C15284a aVar = C15284a.this;
            String c = ((UserRequestError) serverException).mo49161c();
            Drawable b = C17988b.m44611b(R.drawable.img_empty_error, dVar.f51759b);
            ServerId serverId = C15284a.f39471U;
            aVar.mo45828v2(c, b);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C20237d dVar = (C20237d) cVar;
            C15284a aVar = C15284a.this;
            ServerId serverId = C15284a.f39471U;
            aVar.mo45828v2(aVar.getText(R.string.request_send_error_message), C17988b.m44611b(R.drawable.img_empty_no_network, aVar.getActivity()));
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C20237d dVar = (C20237d) cVar;
            C15284a aVar = C15284a.this;
            ServerId serverId = C15284a.f39471U;
            aVar.mo45828v2(aVar.getText(R.string.response_read_error_message), C17988b.m44611b(R.drawable.img_empty_error, aVar.getActivity()));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20237d dVar = (C20237d) cVar;
            C15300b bVar = (C15300b) gVar;
            C15284a.m39110r2(C15284a.this, bVar.f39535m, bVar.f39536n);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$e */
    public class C15289e implements Runnable {
        public C15289e() {
        }

        public final void run() {
            List<T> unmodifiableList = Collections.unmodifiableList(C15284a.this.f39481D.f41251g);
            if (unmodifiableList.size() > 0) {
                T t = unmodifiableList.get(0);
                C15284a aVar = C15284a.this;
                if (t == aVar.f39489L) {
                    C18316a.f46708c.mo50767a(Genie.SHOW_ON_MAP, aVar.f39479B.findViewById(R.id.show_on_map), C15284a.this.f40822c);
                }
            }
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$f */
    public class C15290f extends C23715f {
        public C15290f() {
        }

        /* renamed from: c */
        public final void mo45833c(View view, SearchLocationItem searchLocationItem, SearchAction searchAction) {
            int intValue = ((Integer) view.getTag(R.id.view_tag_param1)).intValue();
            int intValue2 = ((Integer) view.getTag(R.id.view_tag_param2)).intValue();
            C15284a aVar = C15284a.this;
            aVar.f39486I.mo45834a(aVar.f39478A, intValue, intValue2, searchAction);
            ((AbstractSearchActivity) C15284a.this.f40822c).mo45806F2(searchLocationItem, searchAction);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$g */
    public class C15291g extends SectionedListView.C15818a {
        public C15291g() {
        }

        /* renamed from: a */
        public final void mo45032a(C15819a aVar, int i, int i2) {
            String str;
            if (i >= 0 && i2 >= 0) {
                C15297m mVar = (C15297m) aVar.mo47315x(i);
                SearchLocationItem searchLocationItem = (SearchLocationItem) mVar.get(i2);
                if (searchLocationItem != null) {
                    C15284a aVar2 = C15284a.this;
                    ServerId serverId = C15284a.f39471U;
                    aVar2.getClass();
                    if (C15284a.f39471U.equals(searchLocationItem.f39457b)) {
                        C15284a.m39108p2(C15284a.this);
                        return;
                    }
                    C15284a.this.getClass();
                    if (C15284a.f39472X.equals(searchLocationItem.f39457b)) {
                        C15284a.m39109q2(C15284a.this);
                        return;
                    }
                    C15284a.this.getClass();
                    if ("favorites_locations_section".equals(mVar.f39526d)) {
                        C15284a aVar3 = C15284a.this;
                        aVar3.getClass();
                        int i3 = C15285a.f39506a[((SearchLocationItem) mVar.get(i2)).f39466k.ordinal()];
                        if (i3 == 1) {
                            str = "fav_home_clicked";
                        } else if (i3 != 2) {
                            str = "fav_custom_clicked";
                        } else {
                            str = "fav_work_clicked";
                        }
                        C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar4.mo49939g(AnalyticsAttributeKey.TYPE, str);
                        aVar3.mo46797j2(aVar4.mo49933a());
                    } else {
                        C15284a aVar5 = C15284a.this;
                        aVar5.f39486I.mo45834a(aVar5.f39478A, i, i2, (SearchAction) null);
                    }
                    ((AbstractSearchActivity) C15284a.this.f40822c).mo45806F2(searchLocationItem, SearchAction.DEFAULT);
                }
            }
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$h */
    public class C15292h extends C23715f {
        public C15292h() {
        }

        /* renamed from: c */
        public final void mo45833c(View view, SearchLocationItem searchLocationItem, SearchAction searchAction) {
            int intValue = ((Integer) view.getTag(R.id.view_tag_param1)).intValue();
            int intValue2 = ((Integer) view.getTag(R.id.view_tag_param2)).intValue();
            C15284a aVar = C15284a.this;
            aVar.f39486I.mo45834a(aVar.f39481D, intValue, intValue2, searchAction);
            ((AbstractSearchActivity) C15284a.this.f40822c).mo45806F2(searchLocationItem, searchAction);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$i */
    public class C15293i extends SectionedListView.C15818a {
        public C15293i() {
        }

        /* renamed from: a */
        public final void mo45032a(C15819a aVar, int i, int i2) {
            SearchLocationItem searchLocationItem;
            if (i >= 0 && i2 >= 0 && (searchLocationItem = (SearchLocationItem) ((C15297m) aVar.mo47315x(i)).get(i2)) != null) {
                C15284a aVar2 = C15284a.this;
                ServerId serverId = C15284a.f39471U;
                aVar2.getClass();
                if (C15284a.f39471U.equals(searchLocationItem.f39457b)) {
                    C15284a.m39108p2(C15284a.this);
                    return;
                }
                C15284a.this.getClass();
                if (C15284a.f39472X.equals(searchLocationItem.f39457b)) {
                    C15284a.m39109q2(C15284a.this);
                    return;
                }
                C15284a aVar3 = C15284a.this;
                aVar3.f39486I.mo45834a(aVar3.f39481D, i, i2, (SearchAction) null);
                ((AbstractSearchActivity) C15284a.this.f40822c).mo45806F2(searchLocationItem, SearchAction.DEFAULT);
            }
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$j */
    public static class C15294j {

        /* renamed from: a */
        public C17474b.C17475a f39516a;

        /* renamed from: b */
        public int f39517b = 0;

        public C15294j() {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SEARCH_LOCATIONS);
            aVar.mo49941i(AnalyticsAttributeKey.IS_LOCATION_SEARCH, true);
            this.f39516a = aVar;
        }

        /* renamed from: a */
        public final void mo45834a(C15298n nVar, int i, int i2, SearchAction searchAction) {
            if (!SearchAction.MARK_AS_FAVORITE.equals(searchAction)) {
                if (SearchAction.COPY.equals(searchAction)) {
                    this.f39517b++;
                    return;
                }
                C17474b.C17475a aVar = this.f39516a;
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.NUMBER_OF_RESULTS;
                int i3 = 0;
                for (T e : Collections.unmodifiableList(nVar.f41251g)) {
                    i3 += e.mo45699e();
                }
                aVar.mo49935c(analyticsAttributeKey, i3);
                if (i != -1 && i2 != -1) {
                    C15297m mVar = (C15297m) nVar.mo47315x(i);
                    SearchLocationItem searchLocationItem = (SearchLocationItem) mVar.get(i2);
                    C17474b.C17475a aVar2 = this.f39516a;
                    aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, searchLocationItem.f39458c.name());
                    aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_ID, searchLocationItem.f39457b.mo19751c());
                    aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, searchLocationItem.f39460e);
                    AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.SELECTED_INDEX;
                    for (int i4 = 0; i4 < i; i4++) {
                        i2 += ((C15297m) nVar.mo47315x(i4)).mo45699e();
                    }
                    aVar2.mo49935c(analyticsAttributeKey2, i2);
                    aVar2.mo49941i(AnalyticsAttributeKey.SELECTED_INACCURATE, searchLocationItem.f39463h);
                    aVar2.mo49941i(AnalyticsAttributeKey.SELECTED_FROM_HISTORY, "recent_locations_section".equals(mVar.f39526d));
                    aVar2.mo49941i(AnalyticsAttributeKey.IS_SHOW_DETAILS_ACTION_CLICKED, SearchAction.SHOW_DETAILS.equals(searchAction));
                    int i5 = searchLocationItem.f39465j;
                    if (i5 != -1) {
                        this.f39516a.mo49935c(AnalyticsAttributeKey.SELECTED_GEOCODER_ID, i5);
                    }
                }
            }
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$k */
    public class C15295k extends C13559d {

        /* renamed from: e */
        public final C20238e f39518e;

        public C15295k(C20238e eVar) {
            this.f39518e = eVar;
        }

        /* renamed from: a */
        public final void mo40445a() {
            C15284a aVar = C15284a.this;
            if (aVar.f40824e && aVar.mo46783R1() != null) {
                C15284a.this.mo45827u2(this.f39518e);
            }
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$l */
    public static class C15296l {

        /* renamed from: a */
        public final View f39520a;

        /* renamed from: b */
        public final ImageView f39521b;

        /* renamed from: c */
        public final TextView f39522c;

        /* renamed from: d */
        public final TextView f39523d;

        /* renamed from: e */
        public final ImagesOrTextsView f39524e;

        /* renamed from: f */
        public final ImageView f39525f;

        public C15296l(View view) {
            C21100e.m49373x(view, "itemView");
            this.f39520a = view;
            this.f39521b = (ImageView) view.findViewById(R.id.image);
            this.f39522c = (TextView) view.findViewById(R.id.distance);
            this.f39523d = (TextView) view.findViewById(R.id.title);
            this.f39524e = (ImagesOrTextsView) view.findViewById(R.id.subtitle);
            this.f39525f = (ImageView) view.findViewById(R.id.accessory);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$m */
    public class C15297m extends C15819a.C15820a<SearchLocationItem> {

        /* renamed from: d */
        public final String f39526d;

        /* renamed from: e */
        public final C20944i0<Integer, View.OnClickListener> f39527e;

        /* renamed from: f */
        public final int f39528f;

        public C15297m(String str, String str2, int i, List list, C20944i0 i0Var) {
            super(str2, list);
            this.f39526d = str;
            this.f39527e = i0Var;
            this.f39528f = i;
        }

        /* renamed from: e */
        public final int mo45699e() {
            return Math.min(size(), this.f39528f);
        }
    }

    /* renamed from: com.moovit.app.search.locations.a$n */
    public class C15298n extends C15819a<SearchLocationItem, C15296l, C15297m, Void> {

        /* renamed from: A */
        public C23715f f39529A = null;

        /* renamed from: x */
        public Pattern f39531x = null;

        /* renamed from: y */
        public final C15299a f39532y = new C15299a();

        /* renamed from: z */
        public C17875h f39533z;

        /* renamed from: com.moovit.app.search.locations.a$n$a */
        public class C15299a implements View.OnClickListener {
            public C15299a() {
            }

            public final void onClick(View view) {
                if (C15298n.this.f39529A != null) {
                    SearchLocationItem searchLocationItem = (SearchLocationItem) view.getTag();
                    C15298n nVar = C15298n.this;
                    nVar.f39529A.mo45833c(view, searchLocationItem, nVar.f39533z.mo45816K(searchLocationItem));
                }
            }
        }

        public C15298n(Context context, C17875h hVar) {
            super(context, true, R.layout.search_location_fragment_list_item);
            C21100e.m49373x(hVar, "actionProvider");
            this.f39533z = hVar;
        }

        /* renamed from: C */
        public final int mo45033C(int i) {
            if (C20964s0.m49090h(((C15297m) mo47315x(i)).f41268c)) {
                return 4;
            }
            return 1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo45835E(java.lang.Object r9, com.moovit.commons.view.list.C15819a.C15821b r10, int r11, java.lang.Object r12, int r13) {
            /*
                r8 = this;
                com.moovit.app.search.locations.a$l r9 = (com.moovit.app.search.locations.C15284a.C15296l) r9
                com.moovit.app.search.locations.a$m r10 = (com.moovit.app.search.locations.C15284a.C15297m) r10
                com.moovit.app.search.locations.SearchLocationItem r12 = (com.moovit.app.search.locations.SearchLocationItem) r12
                com.moovit.app.search.locations.a r0 = com.moovit.app.search.locations.C15284a.this
                com.moovit.network.model.ServerId r1 = com.moovit.app.search.locations.C15284a.f39471U
                r0.getClass()
                java.lang.String r10 = r10.f39526d
                java.lang.String r0 = "actions_section"
                boolean r10 = r0.equals(r10)
                r0 = 8
                r1 = 2130970306(0x7f0406c2, float:1.7549318E38)
                if (r10 == 0) goto L_0x0089
                com.moovit.app.search.locations.a r10 = com.moovit.app.search.locations.C15284a.this
                r10.getClass()
                com.moovit.network.model.ServerId r10 = com.moovit.app.search.locations.C15284a.f39471U
                com.moovit.network.model.ServerId r11 = r12.f39457b
                boolean r10 = r10.equals(r11)
                r11 = 2130969048(0x7f0401d8, float:1.7546767E38)
                if (r10 == 0) goto L_0x0054
                android.widget.ImageView r10 = r9.f39521b
                r12 = 2131231433(0x7f0802c9, float:1.8078947E38)
                r10.setImageResource(r12)
                android.widget.TextView r10 = r9.f39522c
                r10.setVisibility(r0)
                android.widget.TextView r10 = r9.f39523d
                r12 = 2131887044(0x7f1203c4, float:1.9408684E38)
                r10.setText(r12)
                android.widget.TextView r10 = r9.f39523d
                p977zz.C20964s0.m49107y(r10, r1, r11)
                com.moovit.design.view.ImagesOrTextsView r10 = r9.f39524e
                r10.setVisibility(r0)
                android.widget.ImageView r9 = r9.f39525f
                r9.setVisibility(r0)
                goto L_0x0236
            L_0x0054:
                com.moovit.app.search.locations.a r10 = com.moovit.app.search.locations.C15284a.this
                r10.getClass()
                com.moovit.network.model.ServerId r10 = com.moovit.app.search.locations.C15284a.f39472X
                com.moovit.network.model.ServerId r12 = r12.f39457b
                boolean r10 = r10.equals(r12)
                if (r10 == 0) goto L_0x0236
                android.widget.ImageView r10 = r9.f39521b
                r12 = 2131231405(0x7f0802ad, float:1.807889E38)
                r10.setImageResource(r12)
                android.widget.TextView r10 = r9.f39522c
                r10.setVisibility(r0)
                android.widget.TextView r10 = r9.f39523d
                r12 = 2131886815(0x7f1202df, float:1.940822E38)
                r10.setText(r12)
                android.widget.TextView r10 = r9.f39523d
                p977zz.C20964s0.m49107y(r10, r1, r11)
                com.moovit.design.view.ImagesOrTextsView r10 = r9.f39524e
                r10.setVisibility(r0)
                android.widget.ImageView r9 = r9.f39525f
                r9.setVisibility(r0)
                goto L_0x0236
            L_0x0089:
                com.moovit.image.model.Image r10 = r12.f39459d
                android.widget.ImageView r2 = r9.f39521b
                r10.e r2 = p583jk.C17884p.m44354Y(r2)
                r10.d r2 = r2.mo51642v(r10)
                r10.d r10 = r2.mo51628o0(r10)
                android.widget.ImageView r2 = r9.f39521b
                r10.mo10850T(r2)
                android.widget.TextView r10 = r9.f39522c
                android.content.Context r10 = r10.getContext()
                com.moovit.commons.view.list.a$b r2 = r8.mo47315x(r11)
                com.moovit.app.search.locations.a$m r2 = (com.moovit.app.search.locations.C15284a.C15297m) r2
                java.lang.String r2 = r2.f39526d
                int r3 = r12.f39467l
                r4 = 0
                if (r3 > 0) goto L_0x00b2
                goto L_0x00c2
            L_0x00b2:
                java.lang.String r3 = "locations_section"
                boolean r3 = r3.equals(r2)
                if (r3 != 0) goto L_0x00c4
                java.lang.String r3 = "stations_section"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L_0x00c4
            L_0x00c2:
                r10 = r4
                goto L_0x00d0
            L_0x00c4:
                int r2 = r12.f39467l
                float r2 = (float) r2
                float r2 = com.moovit.util.DistanceUtils.m17936c(r10, r2)
                int r2 = (int) r2
                java.lang.String r10 = com.moovit.util.DistanceUtils.m17934a(r2, r10)
            L_0x00d0:
                android.widget.TextView r2 = r9.f39522c
                com.moovit.commons.utils.UiUtils.m40234B(r2, r10)
                java.lang.String r10 = r12.f39460e
                java.util.regex.Pattern r2 = r8.f39531x
                r3 = 1
                if (r2 == 0) goto L_0x0108
                boolean r2 = p977zz.C20964s0.m49090h(r10)
                if (r2 == 0) goto L_0x00e3
                goto L_0x0108
            L_0x00e3:
                java.util.regex.Pattern r2 = r8.f39531x
                java.util.regex.Matcher r2 = r2.matcher(r10)
                boolean r5 = r2.find()
                if (r5 != 0) goto L_0x00f0
                goto L_0x0108
            L_0x00f0:
                android.text.SpannableString r5 = new android.text.SpannableString
                r5.<init>(r10)
                android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
                r10.<init>(r3)
                int r6 = r2.start()
                int r2 = r2.end()
                r7 = 33
                r5.setSpan(r10, r6, r2, r7)
                r10 = r5
            L_0x0108:
                android.widget.TextView r2 = r9.f39523d
                com.moovit.commons.utils.UiUtils.m40234B(r2, r10)
                android.widget.TextView r10 = r9.f39523d
                r2 = 2130969025(0x7f0401c1, float:1.754672E38)
                p977zz.C20964s0.m49107y(r10, r1, r2)
                java.util.List<x00.a> r10 = r12.f39461f
                boolean r1 = c00.C13717b.m34258e(r10)
                r2 = 0
                if (r1 != 0) goto L_0x0129
                com.moovit.design.view.ImagesOrTextsView r1 = r9.f39524e
                r1.setItems(r10)
                com.moovit.design.view.ImagesOrTextsView r10 = r9.f39524e
                r10.setVisibility(r2)
                goto L_0x012e
            L_0x0129:
                com.moovit.design.view.ImagesOrTextsView r10 = r9.f39524e
                r10.setVisibility(r0)
            L_0x012e:
                jk.h r10 = r8.f39533z
                com.moovit.app.search.SearchAction r10 = r10.mo45816K(r12)
                if (r10 != 0) goto L_0x0141
                android.widget.ImageView r11 = r9.f39525f
                r11.setOnClickListener(r4)
                android.widget.ImageView r11 = r9.f39525f
                r11.setVisibility(r0)
                goto L_0x0173
            L_0x0141:
                android.widget.ImageView r0 = r9.f39525f
                int r1 = r10.getDrawableResId()
                r0.setImageResource(r1)
                android.widget.ImageView r0 = r9.f39525f
                r0.setTag(r12)
                android.widget.ImageView r0 = r9.f39525f
                r1 = 2131364674(0x7f0a0b42, float:1.8349192E38)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r0.setTag(r1, r11)
                android.widget.ImageView r11 = r9.f39525f
                r0 = 2131364675(0x7f0a0b43, float:1.8349194E38)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r11.setTag(r0, r13)
                android.widget.ImageView r11 = r9.f39525f
                com.moovit.app.search.locations.a$n$a r13 = r8.f39532y
                r11.setOnClickListener(r13)
                android.widget.ImageView r11 = r9.f39525f
                r11.setVisibility(r2)
            L_0x0173:
                android.view.View r11 = r9.f39520a
                android.content.Context r13 = r11.getContext()
                com.moovit.app.search.locations.SearchLocationItem$Type r0 = r12.f39458c
                com.moovit.app.search.locations.SearchLocationItem$Type r1 = com.moovit.app.search.locations.SearchLocationItem.Type.EVENT
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0185
                r1 = 0
                goto L_0x018e
            L_0x0185:
                android.content.Context r1 = r8.f46688b
                r4 = 1096810496(0x41600000, float:14.0)
                float r1 = com.moovit.commons.utils.UiUtils.m40246e(r1, r4)
                int r1 = (int) r1
            L_0x018e:
                com.moovit.commons.utils.C15780a.m40273f(r1, r11)
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.TOP
                r4 = 2131165969(0x7f070311, float:1.794617E38)
                if (r0 == 0) goto L_0x019a
                r5 = 0
                goto L_0x01a3
            L_0x019a:
                android.content.res.Resources r5 = r13.getResources()
                float r5 = r5.getDimension(r4)
                int r5 = (int) r5
            L_0x01a3:
                com.moovit.commons.utils.UiUtils.m40266y(r11, r1, r5)
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.BOTTOM
                if (r0 == 0) goto L_0x01ac
                r13 = 0
                goto L_0x01b5
            L_0x01ac:
                android.content.res.Resources r13 = r13.getResources()
                float r13 = r13.getDimension(r4)
                int r13 = (int) r13
            L_0x01b5:
                com.moovit.commons.utils.UiUtils.m40266y(r11, r1, r13)
                java.util.List<x00.a> r11 = r12.f39461f
                boolean r13 = c00.C13717b.m34258e(r11)
                r0 = 2
                if (r13 != 0) goto L_0x01f7
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x01ca:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L_0x01e2
                java.lang.Object r1 = r11.next()
                x00.a r1 = (x00.C20440a) r1
                boolean r4 = r1.mo52636a()
                if (r4 == 0) goto L_0x01ca
                java.lang.CharSequence r1 = r1.f51782b
                r13.append(r1)
                goto L_0x01ca
            L_0x01e2:
                android.view.View r11 = r9.f39520a
                java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
                java.lang.String r12 = r12.f39460e
                r1[r2] = r12
                int r12 = r13.length()
                if (r12 != 0) goto L_0x01f2
                java.lang.String r13 = ""
            L_0x01f2:
                r1[r3] = r13
                a00.C13382a.m33674j(r11, r1)
            L_0x01f7:
                if (r10 == 0) goto L_0x0236
                int[] r11 = com.moovit.app.search.locations.C15284a.C15285a.f39507b
                int r10 = r10.ordinal()
                r10 = r11[r10]
                if (r10 == r0) goto L_0x0228
                r11 = 3
                if (r10 == r11) goto L_0x0219
                r11 = 4
                if (r10 == r11) goto L_0x020a
                goto L_0x0236
            L_0x020a:
                android.widget.ImageView r9 = r9.f39525f
                com.moovit.app.search.locations.a r10 = com.moovit.app.search.locations.C15284a.this
                r11 = 2131889689(0x7f120e19, float:1.9414049E38)
                java.lang.String r10 = r10.getString(r11)
                r9.setContentDescription(r10)
                goto L_0x0236
            L_0x0219:
                android.widget.ImageView r9 = r9.f39525f
                com.moovit.app.search.locations.a r10 = com.moovit.app.search.locations.C15284a.this
                r11 = 2131886170(0x7f12005a, float:1.9406911E38)
                java.lang.String r10 = r10.getString(r11)
                r9.setContentDescription(r10)
                goto L_0x0236
            L_0x0228:
                android.widget.ImageView r9 = r9.f39525f
                com.moovit.app.search.locations.a r10 = com.moovit.app.search.locations.C15284a.this
                r11 = 2131889620(0x7f120dd4, float:1.9413909E38)
                java.lang.String r10 = r10.getString(r11)
                r9.setContentDescription(r10)
            L_0x0236:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.C15284a.C15298n.mo45835E(java.lang.Object, com.moovit.commons.view.list.a$b, int, java.lang.Object, int):void");
        }

        /* renamed from: F */
        public final void mo45035F(View view, C15819a.C15821b bVar, int i) {
            C15297m mVar = (C15297m) bVar;
            if (mo45033C(i) != 4) {
                ListItemView listItemView = (ListItemView) view;
                listItemView.setTitle(mVar.f41268c);
                C20944i0<Integer, View.OnClickListener> i0Var = mVar.f39527e;
                if (i0Var == null) {
                    listItemView.setAccessoryView((View) null);
                    return;
                }
                listItemView.setAccessoryView(((Integer) i0Var.f52692a).intValue());
                listItemView.getAccessoryView().setOnClickListener((View.OnClickListener) i0Var.f52693b);
            }
        }

        /* renamed from: m */
        public final Object mo45836m(View view) {
            return new C15296l(view);
        }

        /* renamed from: n */
        public final View mo45037n(int i, int i2, ViewGroup viewGroup, LayoutInflater layoutInflater) {
            if (mo45033C(i2) == 4) {
                return new Space(viewGroup.getContext());
            }
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView.setAccessoryIgnoreHorizontalPadding(true);
            return listItemView;
        }
    }

    static {
        C15053i iVar = new C15053i(2);
        f39473Y = iVar;
        C20603k kVar = new C20603k(3);
        f39474Z = kVar;
        f39475l0 = new C13723g.C13724a(new C13723g.C13725b(iVar, kVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m39108p2(com.moovit.app.search.locations.C15284a r5) {
        /*
            A r0 = r5.f40822c
            com.moovit.app.MoovitAppActivity r0 = (com.moovit.app.MoovitAppActivity) r0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0068
        L_0x0009:
            boolean r3 = p977zz.C20934d0.m49032c(r0)
            if (r3 != 0) goto L_0x001e
            com.moovit.location.a r0 = com.moovit.location.C16202a.get(r0)
            x.d0 r1 = new x.d0
            r3 = 9
            r1.<init>(r5, r3)
            r0.requestLocationPermissions((com.moovit.C15682c<?>) r5, (com.moovit.location.C16202a.C16205c<com.moovit.C15682c<?>>) r1)
            goto L_0x0068
        L_0x001e:
            com.moovit.location.a$a r3 = r5.f39496S
            if (r3 == 0) goto L_0x004d
            boolean r3 = r3.mo48507a()
            if (r3 == 0) goto L_0x0030
            com.moovit.location.a$a r3 = r5.f39496S
            boolean r3 = r3.mo48509c()
            if (r3 != 0) goto L_0x004d
        L_0x0030:
            com.moovit.location.a$a r3 = r5.f39496S
            boolean r3 = r3.mo48508b()
            if (r3 == 0) goto L_0x0043
            com.moovit.location.a$a r3 = r5.f39496S
            er.f r4 = new er.f
            r4.<init>(r5, r1)
            r3.mo48510d(r0, r4)
            goto L_0x0068
        L_0x0043:
            de.f r0 = p435de.C16596f.m42113a()
            java.lang.String r1 = "something wrong with current location, but no resolution for fix"
            r0.mo49363b(r1)
            goto L_0x0068
        L_0x004d:
            android.location.Location r0 = r5.mo46780O1()
            if (r0 != 0) goto L_0x0069
            r0 = 2131887634(0x7f120612, float:1.940988E38)
            java.lang.String r0 = r5.getString(r0)
            android.view.View r1 = r5.f39497T
            com.moovit.commons.utils.UiUtils.m40252k(r1)
            android.view.View r1 = r5.f39497T
            com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.m35158k(r2, r1, r0)
            r0.mo42259p()
        L_0x0068:
            r1 = 0
        L_0x0069:
            if (r1 == 0) goto L_0x007a
            android.content.Context r0 = r5.getContext()
            com.moovit.transit.LocationDescriptor r0 = com.moovit.transit.LocationDescriptor.m17772m(r0)
            A r5 = r5.f40822c
            com.moovit.app.search.AbstractSearchActivity r5 = (com.moovit.app.search.AbstractSearchActivity) r5
            r5.mo45804D2(r0)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.C15284a.m39108p2(com.moovit.app.search.locations.a):void");
    }

    /* renamed from: q2 */
    public static void m39109q2(C15284a aVar) {
        aVar.getClass();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "choose_map_clicked");
        aVar.mo46797j2(aVar2.mo49933a());
        aVar.startActivityForResult(MapLocationPickerActivity.m41309A2(aVar.getContext(), Arrays.asList(new MarkerProvider[]{new FavoriteLocationsMarkerProvider(), new FavoriteStopsMarkerProvider(), new RecentLocationsMarkerProvider()})), 1781);
    }

    /* renamed from: r2 */
    public static void m39110r2(C15284a aVar, List list, C20238e eVar) {
        ArrayList arrayList;
        SectionedListView sectionedListView = aVar.f39479B;
        C15819a adapter = sectionedListView.getAdapter();
        if (adapter != null) {
            adapter.f41266v.clear();
            adapter.mo47313p();
        }
        sectionedListView.f41250l.clear();
        List<T> unmodifiableList = Collections.unmodifiableList(aVar.f39481D.f41251g);
        if (!aVar.f39485H) {
            ArrayList arrayList2 = new ArrayList(4);
            aVar.mo45826s2(arrayList2, list, true);
            aVar.f39481D.mo47288G(arrayList2);
            arrayList = arrayList2;
        } else if (!unmodifiableList.contains(aVar.f39487J) || !unmodifiableList.contains(aVar.f39488K) || !unmodifiableList.contains(aVar.f39489L)) {
            ArrayList arrayList3 = new ArrayList(4);
            aVar.mo45826s2(arrayList3, list, false);
            aVar.f39481D.mo47288G(arrayList3);
            arrayList = arrayList3;
        } else {
            aVar.f39487J.addAll(C13723g.m34282c(list, f39473Y));
            aVar.f39488K.addAll(C13723g.m34282c(list, f39474Z));
            aVar.f39489L.addAll(C13723g.m34282c(list, f39475l0));
            aVar.f39481D.notifyDataSetChanged();
            arrayList = unmodifiableList;
        }
        if (eVar == null) {
            aVar.f39479B.mo47261a(arrayList.size() - 1, aVar.f39480C);
        }
        aVar.mo45829w2();
        if (eVar != null) {
            aVar.f39498s.f46703c = eVar;
        }
    }

    /* renamed from: t2 */
    public static ArrayList m39111t2(C16753e eVar) {
        ArrayList arrayList = new ArrayList();
        LocationFavorite locationFavorite = eVar.f43620d;
        if (locationFavorite != null) {
            arrayList.add(SearchLocationItem.m39101c(locationFavorite, LocationFavorite.FavoriteType.HOME));
        }
        LocationFavorite locationFavorite2 = eVar.f43621e;
        if (locationFavorite2 != null) {
            arrayList.add(SearchLocationItem.m39101c(locationFavorite2, LocationFavorite.FavoriteType.WORK));
        }
        C13720d.m34276f(eVar.mo49437k(), (C13722f) null, f39477n0, arrayList);
        return arrayList;
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getActivity()).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "USER_ACCOUNT");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        this.f39484G = ((Integer) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C19053d.f48454F)).intValue();
        this.f39490M = ((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46573d();
        if (isResumed()) {
            mo45830x2();
        }
    }

    /* renamed from: m2 */
    public final C17474b.C17475a mo45810m2() {
        C15294j jVar = this.f39486I;
        C17474b.C17475a aVar = jVar.f39516a;
        aVar.mo49935c(AnalyticsAttributeKey.UP_ARROW_COUNT, jVar.f39517b);
        return aVar;
    }

    /* renamed from: n2 */
    public final void mo45811n2() {
        C20236c f = C20236c.m47804f(getActivity());
        f.mo51499b();
        C18487d<T> dVar = f.f48438c;
        dVar.f33804b.clear();
        dVar.mo50910h();
        f.mo51498a();
        mo45830x2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45812o2(java.lang.String r6) {
        /*
            r5 = this;
            super.mo45812o2(r6)
            android.os.Handler r0 = r5.f39492O
            if (r0 == 0) goto L_0x000c
            com.moovit.app.search.locations.a$e r1 = r5.f39493P
            r0.removeCallbacks(r1)
        L_0x000c:
            android.os.Handler r0 = r5.f39492O
            com.moovit.app.search.locations.a$e r1 = r5.f39493P
            r2 = 1800(0x708, double:8.893E-321)
            r0.postDelayed(r1, r2)
            b00.a r0 = r5.f39482E
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            r0.cancel(r1)
            r5.f39482E = r2
        L_0x0020:
            com.moovit.app.search.locations.a$k r0 = r5.f39483F
            r3 = 0
            if (r0 == 0) goto L_0x002a
            r0.cancel(r3)
            r5.f39483F = r2
        L_0x002a:
            com.moovit.app.search.locations.a$b r0 = r5.f39498s
            r0.f46703c = r2
            r5.f39485H = r3
            aa0.d<com.moovit.app.search.locations.SearchLocationItem> r0 = r5.f39491N
            r0.mo23793a(r6)
            com.moovit.app.search.locations.a$n r0 = r5.f39481D
            r0.getClass()
            boolean r4 = p977zz.C20964s0.m49090h(r6)
            if (r4 != 0) goto L_0x0048
            r4 = 82
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r6, r4)     // Catch:{ all -> 0x0047 }
            goto L_0x0049
        L_0x0047:
        L_0x0048:
            r4 = r2
        L_0x0049:
            r0.f39531x = r4
            boolean r0 = p977zz.C20964s0.m49090h(r6)
            if (r0 == 0) goto L_0x009b
            com.moovit.app.search.locations.a$n r6 = r5.f39481D
            java.util.ArrayList<S> r0 = r6.f41251g
            r0.clear()
            r6.mo47313p()
            com.moovit.commons.view.list.SectionedListView r6 = r5.f39479B
            r6.setEmptyView(r2)
            com.moovit.commons.view.list.SectionedListView r6 = r5.f39479B
            r0 = 8
            r6.setVisibility(r0)
            android.os.Bundle r6 = r5.getArguments()
            if (r6 == 0) goto L_0x0078
            android.os.Bundle r6 = r5.getArguments()
            java.lang.String r0 = "emptyStateExtra"
            java.lang.String r6 = r6.getString(r0)
            goto L_0x0079
        L_0x0078:
            r6 = r2
        L_0x0079:
            if (r6 != 0) goto L_0x0084
            com.moovit.design.view.AlertMessageView r6 = r5.f39503x
            r0 = 2131888692(0x7f120a34, float:1.9412027E38)
            r6.setSubtitle((int) r0)
            goto L_0x0089
        L_0x0084:
            com.moovit.design.view.AlertMessageView r0 = r5.f39503x
            r0.setSubtitle((java.lang.CharSequence) r6)
        L_0x0089:
            com.moovit.design.view.AlertMessageView r6 = r5.f39503x
            r6.setPositiveButton((java.lang.CharSequence) r2)
            com.moovit.commons.view.list.SectionedListView r6 = r5.f39504y
            r6.setVisibility(r3)
            com.moovit.commons.view.list.SectionedListView r6 = r5.f39504y
            com.moovit.design.view.AlertMessageView r0 = r5.f39503x
            r6.setEmptyView(r0)
            return
        L_0x009b:
            vv.e r0 = new vv.e
            r0.<init>(r6, r3)
            r5.getContext()
            f00.g$a r6 = a10.C13386a.f33225e
            T r6 = r6.f43936b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00c8
            android.content.Context r6 = r5.getContext()
            tp.f r6 = p824tp.C19728f.m47195a(r6)
            vv.b r2 = new vv.b
            r2.<init>(r5, r6)
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r0 = r0.f51344a
            r6[r3] = r0
            r2.execute(r6)
            r5.f39482E = r2
            goto L_0x00dd
        L_0x00c8:
            int r6 = r5.f39484G
            if (r6 <= 0) goto L_0x00da
            com.moovit.app.search.locations.a$k r1 = new com.moovit.app.search.locations.a$k
            r1.<init>(r0)
            r5.f39483F = r1
            android.os.Handler r0 = r5.f39492O
            long r2 = (long) r6
            r0.postDelayed(r1, r2)
            goto L_0x00dd
        L_0x00da:
            r5.mo45827u2(r0)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.C15284a.mo45812o2(java.lang.String):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        SearchLocationItem d;
        if (i == 1781) {
            if (i2 == -1) {
                int i3 = MapLocationPickerActivity.f42272q0;
                LocationDescriptor locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("descriptor");
                if (locationDescriptor != null) {
                    AbstractSearchActivity abstractSearchActivity = (AbstractSearchActivity) this.f40822c;
                    abstractSearchActivity.getClass();
                    SearchLocationItem d2 = SearchLocationItem.m39102d(locationDescriptor);
                    if (d2 != null) {
                        C20236c f = C20236c.m47804f(abstractSearchActivity);
                        f.mo51499b();
                        f.f48438c.mo40645c(d2);
                    }
                    abstractSearchActivity.mo45803C2(locationDescriptor);
                }
            }
        } else if (i != 1782) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            int i4 = SearchLocationMapActivity.f23138p0;
            LocationDescriptor locationDescriptor2 = (LocationDescriptor) intent.getParcelableExtra("selected_location_extra");
            if (locationDescriptor2 != null && (d = SearchLocationItem.m39102d(locationDescriptor2)) != null) {
                ((AbstractSearchActivity) this.f40822c).mo45806F2(d, SearchAction.DEFAULT);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39487J = new C15297m("events_section", getString(R.string.search_events_section_title), 4, new ArrayList(), (C20944i0) null);
        this.f39488K = new C15297m("stations_section", getString(R.string.search_stops_section_title), 4, new ArrayList(), (C20944i0) null);
        this.f39489L = new C15297m("locations_section", getString(R.string.search_locations_section_title), Integer.MAX_VALUE, new ArrayList(), new C20944i0(Integer.valueOf(R.layout.search_location_results_action), this.f39500u));
        this.f39492O = new Handler(Looper.getMainLooper());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.search_location_fragment, viewGroup, false);
        this.f39497T = inflate.findViewById(R.id.root);
        AlertMessageView alertMessageView = (AlertMessageView) inflate.findViewById(R.id.empty_view);
        this.f39503x = alertMessageView;
        alertMessageView.setPositiveButtonClickListener(new C4585c(this, 22));
        C15298n nVar = new C15298n(context, ((AbstractSearchActivity) this.f40822c).mo45802B2());
        this.f39478A = nVar;
        nVar.f39529A = new C15290f();
        SectionedListView sectionedListView = (SectionedListView) inflate.findViewById(R.id.suggested_list);
        this.f39504y = sectionedListView;
        sectionedListView.setSectionDivider(C17988b.m44611b(R.drawable.divider_horizontal_full, sectionedListView.getContext()));
        this.f39505z = layoutInflater.inflate(R.layout.search_recent_section_empty, this.f39504y, false);
        this.f39504y.setOnItemClickListener(new C15291g());
        C15298n nVar2 = new C15298n(context, ((AbstractSearchActivity) this.f40822c).mo45809z2());
        this.f39481D = nVar2;
        nVar2.f39529A = new C15292h();
        SectionedListView sectionedListView2 = (SectionedListView) inflate.findViewById(R.id.result_list);
        this.f39479B = sectionedListView2;
        sectionedListView2.setNestedScrollingEnabled(true);
        this.f39504y.setNestedScrollingEnabled(true);
        this.f39479B.setSectionedAdapter(this.f39481D);
        SectionedListView sectionedListView3 = this.f39479B;
        sectionedListView3.setSectionDivider(C17988b.m44611b(R.drawable.divider_horizontal_full, sectionedListView3.getContext()));
        this.f39479B.setFooterDividersEnabled(true);
        C15286b bVar = this.f39498s;
        SectionedListView sectionedListView4 = this.f39479B;
        AbsListView absListView = bVar.f46702b;
        if (absListView != null) {
            absListView.setOnScrollListener((AbsListView.OnScrollListener) null);
        }
        bVar.f46702b = sectionedListView4;
        if (sectionedListView4 != null) {
            sectionedListView4.setOnScrollListener(bVar.f46704d);
        }
        this.f39479B.setOnItemClickListener(new C15293i());
        View inflate2 = layoutInflater.inflate(R.layout.search_location_results_footer, this.f39479B, false);
        this.f39480C = inflate2;
        inflate2.findViewById(R.id.choose_on_map).setOnClickListener(new C4051q(this, 28));
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        C20236c f = C20236c.m47804f(getActivity());
        f.mo51499b();
        f.f48438c.mo50904b(this.f39502w);
    }

    public final void onResume() {
        super.onResume();
        C15294j jVar = this.f39486I;
        jVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SEARCH_LOCATIONS);
        aVar.mo49941i(AnalyticsAttributeKey.IS_LOCATION_SEARCH, true);
        jVar.f39516a = aVar;
        jVar.f39517b = 0;
        C20236c f = C20236c.m47804f(getActivity());
        f.mo51499b();
        f.f48438c.mo50903a(this.f39502w);
        mo45830x2();
    }

    public final void onStart() {
        super.onStart();
        A a = this.f40822c;
        C16202a aVar = C16202a.get(a);
        aVar.addSettingsChangeListener(this.f39495R);
        aVar.requestLocationSettings().addOnSuccessListener((Activity) a, this.f39494Q);
    }

    public final void onStop() {
        super.onStop();
        C16202a.get(getContext()).removeSettingsChangeListener(this.f39495R);
        C13556a aVar = this.f39482E;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39482E = null;
        }
        C15295k kVar = this.f39483F;
        if (kVar != null) {
            kVar.cancel(false);
            this.f39483F = null;
        }
        Handler handler = this.f39492O;
        if (handler != null) {
            handler.removeCallbacks(this.f39493P);
        }
    }

    /* renamed from: s2 */
    public final void mo45826s2(ArrayList arrayList, List list, boolean z) {
        C16753e eVar;
        if (z) {
            this.f39487J.clear();
            this.f39488K.clear();
            this.f39489L.clear();
        }
        if (mo46782Q1().getBoolean("extra_enable_favorite_locations", false) && (eVar = this.f39490M) != null) {
            ArrayList<T> c = C13723g.m34282c(m39111t2(eVar), this.f39491N);
            if (!c.isEmpty()) {
                arrayList.add(new C15297m("favorites_locations_section", getString(R.string.dashboard_favorites_title), Integer.MAX_VALUE, c, (C20944i0) null));
            }
        }
        this.f39487J.addAll(C13723g.m34282c(list, f39473Y));
        if (!this.f39487J.isEmpty()) {
            arrayList.add(this.f39487J);
        }
        this.f39488K.addAll(C13723g.m34282c(list, f39474Z));
        if (!this.f39488K.isEmpty()) {
            arrayList.add(this.f39488K);
        }
        this.f39489L.addAll(C13723g.m34282c(list, f39475l0));
        if (!this.f39489L.isEmpty()) {
            arrayList.add(this.f39489L);
        }
    }

    /* renamed from: u2 */
    public final void mo45827u2(C20238e eVar) {
        C20237d dVar = new C20237d(mo46783R1(), eVar, LatLonE6.m40177j(mo46780O1()));
        StringBuilder sb = new StringBuilder();
        sb.append(C20237d.class.getName());
        sb.append(dVar.f51342w.f51344a);
        sb.append(dVar.f51342w.f51345b);
        LatLonE6 latLonE6 = dVar.f51343x;
        if (latLonE6 != null) {
            sb.append(latLonE6.toString());
        }
        this.f39482E = mo46794g2(sb.toString(), dVar, this.f39501v);
    }

    /* renamed from: v2 */
    public final void mo45828v2(CharSequence charSequence, Drawable drawable) {
        C15298n nVar = this.f39481D;
        nVar.f41251g.clear();
        nVar.mo47313p();
        this.f39485H = false;
        this.f39498s.f46703c = null;
        mo45829w2();
        this.f39503x.setSubtitle(charSequence);
        this.f39503x.setImage(drawable);
        this.f39503x.setPositiveButton((CharSequence) null);
    }

    /* renamed from: w2 */
    public final void mo45829w2() {
        this.f39504y.setEmptyView((View) null);
        this.f39504y.setVisibility(8);
        String str = C19728f.m47195a(this.f40822c).f50165a.f16129d;
        this.f39503x.setSubtitle((CharSequence) getString(R.string.search_location_empty_results, str));
        this.f39503x.setPositiveButton((int) R.string.search_map);
        this.f39479B.setVisibility(0);
        this.f39479B.setEmptyView(this.f39503x);
    }

    /* renamed from: x2 */
    public final void mo45830x2() {
        C16753e eVar;
        int i = 0;
        this.f39478A.f41267w = false;
        SectionedListView sectionedListView = this.f39504y;
        C15819a adapter = sectionedListView.getAdapter();
        if (adapter != null) {
            adapter.f41266v.clear();
            adapter.mo47313p();
        }
        sectionedListView.f41250l.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(2);
        if (getArguments().getBoolean("extra_enable_current_location", false)) {
            arrayList2.add(new SearchLocationItem(f39471U, SearchLocationItem.Type.GEOCODER, (Image) null, (String) null, (List<C20440a>) null, new LatLonE6(0, 0), false, (String) null, 0, SearchLocationItem.Source.DEFAULT, -1));
        }
        if (C13382a.m33671g(getContext())) {
            arrayList2.add(new SearchLocationItem(f39472X, SearchLocationItem.Type.GEOCODER, (Image) null, (String) null, (List<C20440a>) null, new LatLonE6(0, 0), false, (String) null, 0, SearchLocationItem.Source.DEFAULT, -1));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C15297m("actions_section", (String) null, Integer.MAX_VALUE, arrayList2, (C20944i0) null));
        }
        if (mo46782Q1().getBoolean("extra_enable_favorite_locations", false) && (eVar = this.f39490M) != null) {
            ArrayList t2 = m39111t2(eVar);
            if (C13717b.m34258e(t2)) {
                arrayList.add(new C15297m("favorites_locations_section", (String) null, Integer.MAX_VALUE, t2, (C20944i0) null));
            } else {
                arrayList.add(new C15297m("favorites_locations_section", getString(R.string.dashboard_favorites_title), Integer.MAX_VALUE, t2, (C20944i0) null));
            }
        }
        C20236c f = C20236c.m47804f(getActivity());
        f.mo51499b();
        List<T> e = f.f48438c.mo40647e();
        if (C13717b.m34258e(e)) {
            arrayList.add(new C15297m("recent_locations_section", (String) null, Integer.MAX_VALUE, e, (C20944i0) null));
        } else {
            arrayList.add(new C15297m("recent_locations_section", getString(R.string.search_recent_section_title), Integer.MAX_VALUE, e, new C20944i0(Integer.valueOf(R.layout.section_header_accessory_overflow_button), this.f39499t)));
        }
        this.f39504y.mo47261a(arrayList.size() - 1, new Space(getActivity()));
        this.f39478A.mo47288G(arrayList);
        if (arrayList.isEmpty()) {
            this.f39504y.setSectionedAdapter((C15819a<?, ?, ?, ?>) null);
        } else {
            this.f39504y.setSectionedAdapter(this.f39478A);
            this.f39504y.setFooterDividersEnabled(true);
        }
        while (true) {
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if ("recent_locations_section".equals(((C15297m) arrayList.get(i)).f39526d)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1 && ((C15297m) arrayList.get(i)).isEmpty()) {
            this.f39504y.mo47261a(i, this.f39505z);
        }
        C15298n nVar = this.f39478A;
        nVar.f41267w = true;
        nVar.notifyDataSetChanged();
    }
}
