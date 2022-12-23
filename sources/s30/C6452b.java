package s30;

import aa0.C7530f;
import aa0.C7544o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import c00.C13717b;
import c20.C13744a;
import c70.C13751d;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.map.C16280h;
import com.moovit.map.MapFragment;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
import com.moovit.micromobility.nearby.MicroMobilityItemInfo;
import com.moovit.micromobility.nearby.MicroMobilityProperty;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseItemIntent;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.StyledText;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import l30.C5566a0;
import l30.C5592u;
import l30.C5597z;
import p054d0.C4273c0;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import p853uu.C19992b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p947yt.C20767b;
import q00.C19047a;
import t30.C6567h;
import t30.C6568i;

/* renamed from: s30.b */
public class C6452b extends C16280h<MoovitActivity> implements MicroMobilityIntegrationView.C4150c {

    /* renamed from: y */
    public static final /* synthetic */ int f20158y = 0;

    /* renamed from: u */
    public final C6453a f20159u = new C6453a();

    /* renamed from: v */
    public LatLonE6 f20160v;

    /* renamed from: w */
    public MicroMobilityItemInfo f20161w;

    /* renamed from: x */
    public int f20162x = C5597z.location_item;

    /* renamed from: s30.b$a */
    public class C6453a extends C20438i<C6567h, C6568i> {
        public C6453a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C6567h hVar = (C6567h) cVar;
            C6452b bVar = C6452b.this;
            bVar.f20161w = ((C6568i) gVar).f20382m;
            bVar.mo22570c2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C6567h hVar = (C6567h) cVar;
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("serviceId=");
            k.append(hVar.f20380w);
            a.mo49363b(k.toString());
            a.mo49363b("itemId=" + hVar.f20381x);
            C6452b bVar = C6452b.this;
            bVar.f20162x = C5597z.container;
            View view = bVar.getView();
            if (view == null) {
                return true;
            }
            AlertMessageView alertMessageView = (AlertMessageView) view.findViewById(C5597z.empty_view);
            int i = C13751d.f33851b;
            if (exc instanceof UserRequestError) {
                UserRequestError userRequestError = (UserRequestError) exc;
                alertMessageView.setTitle((CharSequence) userRequestError.mo49162d());
                alertMessageView.setSubtitle((CharSequence) userRequestError.mo49161c());
            } else {
                alertMessageView.setTitle((CharSequence) bVar.getString(C19746x.general_error_title));
                alertMessageView.setSubtitle((CharSequence) bVar.getString(C19746x.general_error_description));
            }
            alertMessageView.setVisibility(0);
            return true;
        }
    }

    /* renamed from: s30.b$b */
    public static /* synthetic */ class C6454b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20164a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.micromobility.MicroMobilityIntegrationFlow[] r0 = com.moovit.micromobility.MicroMobilityIntegrationFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20164a = r0
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20164a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.RESERVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20164a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.UNLOCK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s30.C6452b.C6454b.<clinit>():void");
        }
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "CONFIGURATION");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        mo22570c2();
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C19731i.m47197a(requireActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: V1 */
    public final void mo22565V1(View view, BottomSheetBehavior<?> bottomSheetBehavior) {
        View findViewById = view.findViewById(C5597z.content);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C6451a(this, view, findViewById, bottomSheetBehavior));
    }

    /* renamed from: W0 */
    public final void mo19494W0(ServerId serverId) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "view_ride_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.ID, serverId);
        mo22564R1(aVar.mo49933a());
        Context requireContext = requireContext();
        requireContext.startActivity(MicroMobilityRideActivity.m11106y2(requireContext, serverId));
        dismissAllowingStateLoss();
    }

    /* renamed from: Y1 */
    public final View mo22566Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(C5566a0.micro_mobility_bottom_sheet_dialog, viewGroup, false);
    }

    /* renamed from: Z1 */
    public final LatLonE6 mo22567Z1() {
        return this.f20160v;
    }

    /* renamed from: a2 */
    public final void mo22568a2(MapFragment mapFragment) {
    }

    /* renamed from: b2 */
    public final void mo22569b2(MapFragment mapFragment) {
    }

    /* renamed from: c2 */
    public final void mo22570c2() {
        MicroMobilityItemInfo microMobilityItemInfo;
        int i;
        View view = getView();
        if (view != null && (microMobilityItemInfo = this.f20161w) != null) {
            Image image = microMobilityItemInfo.f14898f;
            String str = microMobilityItemInfo.f14901i;
            String str2 = microMobilityItemInfo.f14899g;
            String str3 = microMobilityItemInfo.f14900h;
            List<StyledText> list = microMobilityItemInfo.f14902j;
            C13744a.m34300b((ImageView) view.findViewById(C5597z.item_image), image);
            ((TextView) view.findViewById(C5597z.service_name)).setText(str);
            UiUtils.m40234B((TextView) view.findViewById(C5597z.title_view), str2);
            UiUtils.m40234B((TextView) view.findViewById(C5597z.subtitle_view), str3);
            TextView textView = (TextView) view.findViewById(C5597z.primary_meta_data_view);
            C21100e.m49369v(1);
            UUID randomUUID = UUID.randomUUID();
            textView.setTag(C5597z.view_tag_param1, randomUUID);
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            Tasks.call(executorService, new C7544o(textView.getContext(), list)).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C5592u(0, textView, randomUUID, list));
            ((ImageView) view.findViewById(C5597z.divider)).setVisibility(0);
            MicroMobilityIntegrationItem microMobilityIntegrationItem = this.f20161w.f14903k;
            MicroMobilityIntegrationView microMobilityIntegrationView = (MicroMobilityIntegrationView) view.findViewById(C5597z.actions);
            microMobilityIntegrationView.setIntegrationItem(microMobilityIntegrationItem);
            microMobilityIntegrationView.setListener(this);
            LatLonE6 latLonE6 = this.f20161w.f14896d;
            A a = this.f40792c;
            ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = (ImageOrTextSubtitleListItemView) view.findViewById(C5597z.location_item);
            C7530f.m17272e(view.getContext(), (C19728f) mo46750H1("METRO_CONTEXT"), LocationDescriptor.m17770k(latLonE6)).onSuccessTask(executorService, new C4273c0(7, a, (C19047a) mo46750H1("CONFIGURATION"))).addOnSuccessListener((Activity) a, new C19992b(3, this, imageOrTextSubtitleListItemView, a)).addOnFailureListener((Activity) a, (OnFailureListener) new C20767b(imageOrTextSubtitleListItemView, 2));
            List<MicroMobilityProperty> list2 = this.f20161w.f14904l;
            if (C13717b.m34258e(list2)) {
                i = 0;
            } else {
                i = list2.size();
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C5597z.secondary_meta_data_container);
            UiUtils.m40250i(linearLayout, C5566a0.micro_mobility_property_view, 0, i);
            for (int i2 = 0; i2 < i; i2++) {
                ListItemView listItemView = (ListItemView) linearLayout.getChildAt(i2);
                MicroMobilityProperty microMobilityProperty = list2.get(i2);
                C21100e.m49369v(1);
                listItemView.setIcon(microMobilityProperty.f14907c);
                listItemView.setTitle((CharSequence) microMobilityProperty.f14908d);
                listItemView.setSubtitle((CharSequence) microMobilityProperty.f14909e);
                UUID randomUUID2 = UUID.randomUUID();
                listItemView.setTag(C5597z.view_tag_param1, randomUUID2);
                StyledText styledText = microMobilityProperty.f14910f;
                if (styledText != null) {
                    Tasks.call(MoovitExecutors.COMPUTATION, new C7544o(listItemView.getContext(), Collections.singletonList(styledText))).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C19992b(2, listItemView, randomUUID2, styledText));
                } else {
                    listItemView.setAccessoryView((View) null);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo19495m(MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_integration_button_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C25541a.m63892w(microMobilityIntegrationFlow));
        aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, microMobilityIntegrationItem.f14812b);
        aVar.mo49939g(AnalyticsAttributeKey.ITEM_ID, microMobilityIntegrationItem.f14813c);
        mo22564R1(aVar.mo49933a());
        A a = this.f40792c;
        int i = C6454b.f20164a[microMobilityIntegrationFlow.ordinal()];
        if (i == 1) {
            AppDeepLink appDeepLink = microMobilityIntegrationItem.f14815e;
            if (appDeepLink != null) {
                appDeepLink.mo46946c(a);
            }
        } else if (i == 2 || i == 3) {
            MicroMobilityPurchaseItemIntent microMobilityPurchaseItemIntent = new MicroMobilityPurchaseItemIntent(microMobilityIntegrationItem.f14812b, microMobilityIntegrationItem.f14813c, microMobilityIntegrationFlow);
            int i2 = MicroMobilityPurchaseActivity.f14911Y;
            Intent intent = new Intent(a, MicroMobilityPurchaseActivity.class);
            intent.putExtra("purchaseIntent", microMobilityPurchaseItemIntent);
            a.startActivity(intent);
        }
        dismissAllowingStateLoss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        String string = K1.getString("serviceId");
        String string2 = K1.getString("itemId");
        LatLonE6 latLonE6 = (LatLonE6) K1.getParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f20160v = latLonE6;
        if (string == null || string2 == null || latLonE6 == null) {
            throw new IllegalStateException("Did you use MicroMobilityBottomSheetDialog.newInstance(...)?");
        }
        A a = this.f40792c;
        C6567h hVar = new C6567h(a.mo44548x1(), string, string2);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C6567h.class, sb, "_");
        sb.append(hVar.f20380w);
        sb.append("_");
        sb.append(hVar.f20381x);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        a.mo44527k2(sb2, hVar, requestOptions, this.f20159u);
    }

    public final void onPause() {
        super.onPause();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_micro_mobility");
        MicroMobilityItemInfo microMobilityItemInfo = this.f20161w;
        if (microMobilityItemInfo != null) {
            aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, microMobilityItemInfo.f14901i);
            aVar.mo49937e(AnalyticsAttributeKey.VEHICLE_TYPE_ID, this.f20161w.f14894b);
            aVar.mo49939g(AnalyticsAttributeKey.VEHICLE_TYPE_NAME, this.f20161w.f14895c);
        }
        mo22564R1(aVar.mo49933a());
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        Bundle K1 = mo46752K1();
        String string = K1.getString("serviceId");
        String string2 = K1.getString("itemId");
        FragmentActivity requireActivity = requireActivity();
        C19731i.m47197a(requireActivity).f50173c.mo22849g(requireActivity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_micro_mobility");
        aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, string);
        aVar.mo49939g(AnalyticsAttributeKey.ITEM_ID, string2);
        mo22564R1(aVar.mo49933a());
    }
}
