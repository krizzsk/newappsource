package com.moovit.app.servicealerts;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.design.view.list.ListItemExtraBottomView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.servicealerts.ServiceAlertDigestView;
import com.moovit.servicealerts.TwitterServiceAlertFeedListItemView;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import j80.C12774c;
import j80.C12786g;
import ja0.C12793c;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mf0.C24361g;
import o00.C18676l;
import o00.C18681n;
import p039c7.C1800c;
import p073e7.C4585c;
import p244s3.C6447v;
import p304x.C7038d0;
import p496fr.C17065b;
import p824tp.C19728f;
import p824tp.C19731i;
import p872vp.C20195b;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20964s0;
import q00.C19047a;
import x00.C20440a;

public class ServiceAlertFragment extends C15682c<MoovitActivity> {

    /* renamed from: x */
    public static final /* synthetic */ int f39556x = 0;

    /* renamed from: n */
    public C19728f f39557n;

    /* renamed from: o */
    public C12786g f39558o;

    /* renamed from: p */
    public final C4585c f39559p = new C4585c(this, 24);

    /* renamed from: q */
    public final C4051q f39560q = new C4051q(this, 29);

    /* renamed from: r */
    public final C4052r f39561r = new C4052r(this, 18);

    /* renamed from: s */
    public final C1800c f39562s = new C1800c(this, 21);

    /* renamed from: t */
    public SwipeRefreshLayout f39563t;

    /* renamed from: u */
    public RecyclerView f39564u;

    /* renamed from: v */
    public ServiceAlertsUiConfig f39565v;

    /* renamed from: w */
    public final C15308d f39566w = new C15308d();

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$a */
    public static class C15305a extends C18676l.C18678b<LineServiceAlertDigest> {

        /* renamed from: d */
        public final TransitAgency f39572d;

        /* renamed from: e */
        public final Map<ServerId, String> f39573e;

        /* renamed from: f */
        public final Map<ServerId, SearchLineItem> f39574f;

        public C15305a(TransitAgency transitAgency, List<LineServiceAlertDigest> list, Map<ServerId, String> map, Map<ServerId, SearchLineItem> map2) {
            super((CharSequence) null, list);
            C21100e.m49373x(transitAgency, "agency");
            this.f39572d = transitAgency;
            C21100e.m49373x(map, "feedByLineGroupId");
            this.f39573e = map;
            C21100e.m49373x(map2, "searchLineItems");
            this.f39574f = map2;
        }
    }

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$b */
    public static class C15306b extends C18676l.C18678b<C12774c> {

        /* renamed from: d */
        public final boolean f39575d;

        /* renamed from: e */
        public final TransitAgency f39576e;

        public C15306b(boolean z, TransitAgency transitAgency, List<C12774c> list) {
            super((CharSequence) null, list);
            this.f39575d = z;
            C21100e.m49373x(transitAgency, "agency");
            this.f39576e = transitAgency;
        }
    }

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$c */
    public static class C15307c extends C18676l.C18678b<C12774c> {
        public C15307c(List<C12774c> list) {
            super((CharSequence) null, list);
        }
    }

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$d */
    public class C15308d extends C18676l<Object, C18676l.C18679c<?>, C12797f> {
        public C15308d() {
        }

        /* renamed from: z */
        public static void m39159z(C12797f fVar, TransitAgency transitAgency) {
            TransitType transitType = transitAgency.f23674d.get();
            ListItemView listItemView = (ListItemView) fVar.itemView;
            listItemView.setTitle((CharSequence) transitAgency.f23673c);
            listItemView.setAccessoryText(transitType.f23758c);
            C13382a.m33674j(listItemView, transitAgency.f23673c, transitType.mo24433b(fVar.mo39638e()));
        }

        /* renamed from: m */
        public final int mo40090m(int i, int i2) {
            int i3;
            C18676l.C18679c n = mo51052n(i);
            if (n instanceof C15310f) {
                i3 = 3;
            } else if (n instanceof C15311g) {
                i3 = 7;
            } else if ((n instanceof C15307c) || (n instanceof C15306b)) {
                i3 = 4;
            } else if (n instanceof C15305a) {
                C15305a aVar = (C15305a) n;
                if (aVar.f39573e.containsKey(((LineServiceAlertDigest) aVar.get(i2)).f23185b.f23206d)) {
                    i3 = 6;
                } else {
                    i3 = 5;
                }
            } else {
                StringBuilder k = C13555b.m33972k("Unknown item view type: ");
                k.append(n.getClass().getSimpleName());
                throw new IllegalStateException(k.toString());
            }
            if (i2 == n.mo40089e() - 1) {
                return i3 | SQLiteDatabase.OPEN_FULLMUTEX;
            }
            return i3;
        }

        /* renamed from: p */
        public final int mo23815p(int i) {
            C18676l.C18679c n = mo51052n(i);
            if ((n instanceof C15310f) || (n instanceof C15311g) || (n instanceof C15305a)) {
                return 1;
            }
            if (!(n instanceof C15306b) || !((C15306b) n).f39575d) {
                return 2;
            }
            return 1;
        }

        /* renamed from: r */
        public final boolean mo40091r(int i) {
            int i2 = i & -65537;
            return i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
        }

        /* renamed from: s */
        public final boolean mo23816s(int i) {
            return i == 1 || i == 2;
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            SearchLineItem searchLineItem;
            C12797f fVar = (C12797f) a0Var;
            C18676l.C18679c n = mo51052n(i);
            if (n instanceof C15310f) {
                C15310f fVar2 = (C15310f) n;
                ((RecyclerView) fVar.mo39639f(R.id.recycler_view)).mo4627l0(new C15309e(C19047a.m46164a(fVar.mo39638e()), fVar2.f39581b));
                fVar.itemView.setContentDescription(fVar.mo39638e().getString(R.string.service_alerts_twitter_agency, new Object[]{C20964s0.m49096n(" ", fVar2.f39581b)}));
            } else if (n instanceof C15311g) {
                C15311g gVar = (C15311g) n;
                SearchLineItem searchLineItem2 = (SearchLineItem) gVar.get(i2);
                String R = C24361g.m61148R(gVar.f39583e.get(searchLineItem2.f41637b));
                TwitterServiceAlertFeedListItemView twitterServiceAlertFeedListItemView = (TwitterServiceAlertFeedListItemView) fVar.itemView;
                twitterServiceAlertFeedListItemView.setIcon(searchLineItem2.f41641f);
                twitterServiceAlertFeedListItemView.setTitle((CharSequence) searchLineItem2.f41642g);
                twitterServiceAlertFeedListItemView.setSubtitleItems(searchLineItem2.f41643h);
                twitterServiceAlertFeedListItemView.setHandle(R);
                twitterServiceAlertFeedListItemView.setTag(R);
                twitterServiceAlertFeedListItemView.setOnClickListener(ServiceAlertFragment.this.f39561r);
            } else if (n instanceof C15307c) {
                C12774c cVar = (C12774c) ((C15307c) n).get(i2);
                ServiceAlertDigestView serviceAlertDigestView = (ServiceAlertDigestView) fVar.itemView;
                serviceAlertDigestView.setServiceAlertDigest(cVar);
                serviceAlertDigestView.setTag(cVar);
                serviceAlertDigestView.setOnClickListener(ServiceAlertFragment.this.f39559p);
                Context e = fVar.mo39638e();
                C13382a.m33674j(serviceAlertDigestView, cVar.f31575c, e.getString(cVar.f31574b.f23213b.getAccessibilityResId()), e.getString(R.string.voice_over_more_information_hint));
            } else if (n instanceof C15305a) {
                C15305a aVar = (C15305a) n;
                LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) aVar.get(i2);
                ServiceAlertAffectedLine serviceAlertAffectedLine = lineServiceAlertDigest.f23185b;
                ServerId serverId = serviceAlertAffectedLine.f23206d;
                String str = null;
                if (serverId == null) {
                    searchLineItem = null;
                } else {
                    searchLineItem = aVar.f39574f.get(serverId);
                }
                ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = (ImageOrTextSubtitleListItemView) fVar.itemView;
                if (searchLineItem != null) {
                    imageOrTextSubtitleListItemView.setIcon(searchLineItem.f41641f);
                    imageOrTextSubtitleListItemView.setTitle((CharSequence) searchLineItem.f41642g);
                    imageOrTextSubtitleListItemView.setSubtitleItems(searchLineItem.f41643h);
                    Context context = imageOrTextSubtitleListItemView.getContext();
                    int i3 = C20195b.f51234b;
                    String str2 = searchLineItem.f41638c;
                    String k = C20195b.m47767k(searchLineItem.f41643h);
                    CharSequence[] charSequenceArr = new CharSequence[4];
                    charSequenceArr[0] = str2;
                    if (!str2.equalsIgnoreCase(k)) {
                        str = k;
                    }
                    charSequenceArr[1] = str;
                    charSequenceArr[2] = context.getString(lineServiceAlertDigest.f23186c.f23213b.getAccessibilityResId());
                    charSequenceArr[3] = context.getString(R.string.voice_over_more_information_hint);
                    imageOrTextSubtitleListItemView.setContentDescription(C13382a.m33667c(charSequenceArr));
                } else {
                    imageOrTextSubtitleListItemView.setIcon(serviceAlertAffectedLine.f23205c);
                    imageOrTextSubtitleListItemView.setSubtitleItems((List<C20440a>) null);
                    imageOrTextSubtitleListItemView.setText((CharSequence) serviceAlertAffectedLine.f23204b);
                    Context context2 = imageOrTextSubtitleListItemView.getContext();
                    imageOrTextSubtitleListItemView.setContentDescription(C13382a.m33667c(serviceAlertAffectedLine.f23204b, context2.getString(lineServiceAlertDigest.f23186c.f23213b.getAccessibilityResId()), context2.getString(R.string.voice_over_more_information_hint)));
                }
                imageOrTextSubtitleListItemView.setAccessoryDrawable(lineServiceAlertDigest.f23186c.f23213b.getIconResId());
                imageOrTextSubtitleListItemView.setTag(new C20944i0(aVar.f39572d.f23672b, lineServiceAlertDigest));
                imageOrTextSubtitleListItemView.setOnClickListener(ServiceAlertFragment.this.f39560q);
                if ((fVar.getItemViewType() & -65537) == 6) {
                    ((TextView) fVar.mo39639f(R.id.twitter_handle)).setText(C24361g.m61148R(aVar.f39573e.get(serverId)));
                }
            } else if (n instanceof C15306b) {
                C12774c cVar2 = (C12774c) ((C15306b) n).get(i2);
                ServiceAlertDigestView serviceAlertDigestView2 = (ServiceAlertDigestView) fVar.itemView;
                serviceAlertDigestView2.setServiceAlertDigest(cVar2);
                serviceAlertDigestView2.setTag(cVar2);
                serviceAlertDigestView2.setOnClickListener(ServiceAlertFragment.this.f39562s);
                Context e2 = fVar.mo39638e();
                serviceAlertDigestView2.setContentDescription(C13382a.m33667c(serviceAlertDigestView2.getContentDescription(), e2.getString(cVar2.f31574b.f23213b.getAccessibilityResId()), e2.getString(R.string.voice_over_more_information_hint)));
            } else {
                StringBuilder k2 = C13555b.m33972k("Unknown item section: ");
                k2.append(n.getClass().getSimpleName());
                throw new IllegalStateException(k2.toString());
            }
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            if (fVar.getItemViewType() != 2) {
                C18676l.C18679c n = mo51052n(i);
                if (n instanceof C15310f) {
                    C15310f fVar2 = (C15310f) n;
                    ListItemView listItemView = (ListItemView) fVar.itemView;
                    listItemView.setTitle((int) R.string.twitter_news_header);
                    listItemView.setAccessoryText((CharSequence) null);
                } else if (n instanceof C15311g) {
                    TransitAgency transitAgency = ((C15311g) n).f39582d;
                    TransitType transitType = transitAgency.f23674d.get();
                    ListItemView listItemView2 = (ListItemView) fVar.itemView;
                    listItemView2.setTitle((CharSequence) transitAgency.f23673c);
                    listItemView2.setAccessoryText(transitType.f23758c);
                    C13382a.m33674j(listItemView2, transitAgency.f23673c, transitType.mo24433b(fVar.mo39638e()));
                } else if (n instanceof C15305a) {
                    m39159z(fVar, ((C15305a) n).f39572d);
                } else {
                    if (n instanceof C15306b) {
                        C15306b bVar = (C15306b) n;
                        if (bVar.f39575d) {
                            m39159z(fVar, bVar.f39576e);
                            return;
                        }
                    }
                    StringBuilder k = C13555b.m33972k("Unknown section: ");
                    k.append(n.getClass().getSimpleName());
                    throw new IllegalStateException(k.toString());
                }
            }
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            TwitterServiceAlertFeedListItemView twitterServiceAlertFeedListItemView;
            Context context = viewGroup.getContext();
            int i2 = -65537 & i;
            if (i2 == 3) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.service_alerts_twitter_handles_recycler_view, viewGroup, false);
                ((RecyclerView) inflate.findViewById(R.id.recycler_view)).setLayoutManager(new LinearLayoutManager(context, 0, false));
                twitterServiceAlertFeedListItemView = inflate;
            } else if (i2 == 4) {
                twitterServiceAlertFeedListItemView = new ServiceAlertDigestView(context, (AttributeSet) null);
            } else if (i2 == 5) {
                twitterServiceAlertFeedListItemView = new ImageOrTextSubtitleListItemView(context, (AttributeSet) null, R.attr.lineServiceAlertDigestStyle);
            } else if (i2 == 6) {
                ListItemExtraBottomView listItemExtraBottomView = new ListItemExtraBottomView(context, (AttributeSet) null, R.attr.lineServiceAlertDigestStyle);
                listItemExtraBottomView.setExtraBottomView(LayoutInflater.from(context).inflate(R.layout.twitter_handle_list_item_extra_view, listItemExtraBottomView, false));
                twitterServiceAlertFeedListItemView = listItemExtraBottomView;
            } else if (i2 == 7) {
                twitterServiceAlertFeedListItemView = new TwitterServiceAlertFeedListItemView(context, (AttributeSet) null);
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unknown item view type: ", i));
            }
            twitterServiceAlertFeedListItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C12797f(twitterServiceAlertFeedListItemView);
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            View view;
            Context context = viewGroup.getContext();
            if (i == 1) {
                view = new ListItemView(context, (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else if (i == 2) {
                view = new Space(context);
            } else {
                throw new IllegalStateException(C16759e.m42349e("Unknown section view type: ", i));
            }
            return new C12797f(view);
        }
    }

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$e */
    public class C15309e extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C19047a f39578g;

        /* renamed from: h */
        public final List<String> f39579h;

        public C15309e(C19047a aVar, List<String> list) {
            C21100e.m49373x(aVar, "configuration");
            this.f39578g = aVar;
            C21100e.m49373x(list, "agenciesHandles");
            this.f39579h = list;
        }

        public final int getItemCount() {
            return this.f39579h.size() + 1;
        }

        public final int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            int itemViewType = fVar.getItemViewType();
            if (itemViewType == 0) {
                return;
            }
            if (itemViewType == 1) {
                String str = this.f39579h.get(i - 1);
                TextView textView = (TextView) fVar.itemView;
                textView.setText(C24361g.m61148R(str));
                textView.setOnClickListener(new C17065b(5, this, str));
                return;
            }
            throw new IllegalStateException(C16759e.m42349e("TwitterAgencyHandlesAdapter unknown view type: ", itemViewType));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                view = from.inflate(R.layout.twitter_icon_list_item, viewGroup, false);
            } else if (i == 1) {
                view = from.inflate(R.layout.twitter_handle_list_item, viewGroup, false);
            } else {
                throw new IllegalStateException(C16759e.m42349e("TwitterAgencyHandlesAdapter unknown view type: ", i));
            }
            C13382a.m33672h(view);
            return new C12797f(view);
        }
    }

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$f */
    public static class C15310f implements C18676l.C18679c<List<String>> {

        /* renamed from: b */
        public final List<String> f39581b;

        public C15310f(ArrayList arrayList) {
            this.f39581b = arrayList;
        }

        /* renamed from: e */
        public final int mo40089e() {
            return 1;
        }

        public final Object getItem(int i) {
            return this.f39581b;
        }

        public final CharSequence getName() {
            return null;
        }
    }

    /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$g */
    public static class C15311g extends C18676l.C18678b<SearchLineItem> {

        /* renamed from: d */
        public final TransitAgency f39582d;

        /* renamed from: e */
        public final Map<ServerId, String> f39583e;

        public C15311g(TransitAgency transitAgency, ArrayList arrayList, Map map) {
            super((CharSequence) null, arrayList);
            C21100e.m49373x(transitAgency, "agency");
            this.f39582d = transitAgency;
            C21100e.m49373x(map, "feedByLineGroupId");
            this.f39583e = map;
        }
    }

    public ServiceAlertFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("METRO_CONTEXT");
        hashSet.add("TWITTER_SERVICE_ALERTS_FEEDS");
        hashSet.add("SEARCH_LINE_FTS");
        return hashSet;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        this.f39557n = (C19728f) mo46776J1("METRO_CONTEXT");
        this.f39558o = (C12786g) mo46776J1("TWITTER_SERVICE_ALERTS_FEEDS");
        mo45847m2(false);
    }

    /* renamed from: m2 */
    public final void mo45847m2(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null && mo46775H1()) {
            SwipeRefreshLayout swipeRefreshLayout = this.f39563t;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            C19731i.m47197a(activity).f50174d.mo39624d(z).addOnCompleteListener((Activity) activity, new C6447v(this, 3));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39565v = (ServiceAlertsUiConfig) mo46782Q1().getParcelable("uiConfig");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.service_alert_fargment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.f39563t = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(R.attr.colorSecondary, swipeRefreshLayout.getContext()));
        this.f39563t.setOnRefreshListener(new C7038d0(this, 10));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f39564u = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        RecyclerView recyclerView2 = this.f39564u;
        Context context = inflate.getContext();
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        sparseIntArray.put(2, R.drawable.divider_horizontal_full);
        sparseIntArray.put(4, R.drawable.divider_horizontal);
        sparseIntArray.put(5, R.drawable.divider_horizontal);
        sparseIntArray.put(6, R.drawable.divider_horizontal);
        sparseIntArray.put(7, R.drawable.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        this.f39564u.setAdapter(new C12793c());
        return inflate;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getView() != null && z && mo46775H1()) {
            mo45847m2(false);
        }
    }

    public static class ServiceAlertsUiConfig implements Parcelable {
        public static final Parcelable.Creator<ServiceAlertsUiConfig> CREATOR = new C15304a();

        /* renamed from: b */
        public boolean f39567b;

        /* renamed from: c */
        public boolean f39568c;

        /* renamed from: d */
        public boolean f39569d;

        /* renamed from: e */
        public boolean f39570e;

        /* renamed from: f */
        public boolean f39571f;

        /* renamed from: com.moovit.app.servicealerts.ServiceAlertFragment$ServiceAlertsUiConfig$a */
        public class C15304a implements Parcelable.Creator<ServiceAlertsUiConfig> {
            public final Object createFromParcel(Parcel parcel) {
                return new ServiceAlertsUiConfig(parcel);
            }

            public final Object[] newArray(int i) {
                return new ServiceAlertsUiConfig[i];
            }
        }

        public ServiceAlertsUiConfig() {
            this.f39567b = false;
            this.f39568c = false;
            this.f39569d = false;
            this.f39570e = false;
            this.f39571f = false;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f39567b ? 1 : 0);
            parcel.writeInt(this.f39568c ? 1 : 0);
            parcel.writeInt(this.f39569d ? 1 : 0);
            parcel.writeInt(this.f39570e ? 1 : 0);
            parcel.writeInt(this.f39571f ? 1 : 0);
        }

        public ServiceAlertsUiConfig(Parcel parcel) {
            boolean z = false;
            this.f39567b = parcel.readInt() == 1;
            this.f39568c = parcel.readInt() == 1;
            this.f39569d = parcel.readInt() == 1;
            this.f39570e = parcel.readInt() == 1;
            this.f39571f = parcel.readInt() == 1 ? true : z;
        }
    }
}
