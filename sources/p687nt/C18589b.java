package p687nt;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import j20.C17706c;
import j20.C17708e;
import java.util.Collections;
import java.util.Set;
import p039c7.C1800c;
import p090g1.C4732a;
import p115i0.C5227c;
import p297w5.C6994a;
import p316y.C7219n;
import p471eq.C16850a;
import p567iq.C17637d;
import p824tp.C19728f;

/* renamed from: nt.b */
public class C18589b extends C15676b<MoovitActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f47322n = 0;

    /* renamed from: h */
    public LocationDescriptor f47323h;

    /* renamed from: i */
    public ImageOrTextSubtitleListItemView f47324i;

    /* renamed from: j */
    public ListItemView f47325j;

    /* renamed from: k */
    public ListItemView f47326k;

    /* renamed from: l */
    public ListItemView f47327l;

    /* renamed from: m */
    public ProgressBar f47328m;

    /* renamed from: nt.b$a */
    public interface C18590a {
        /* renamed from: N0 */
        void mo50982N0(LocationDescriptor locationDescriptor);

        /* renamed from: S0 */
        void mo50983S0();

        /* renamed from: f1 */
        void mo50984f1(LocationDescriptor locationDescriptor);

        /* renamed from: r1 */
        void mo50985r1(LocationDescriptor locationDescriptor);
    }

    public C18589b() {
        super(MoovitActivity.class);
        setStyle(0, 2131952793);
    }

    /* renamed from: I1 */
    public final Set<String> mo22562I1() {
        return Collections.singleton("UI_CONFIGURATION");
    }

    /* renamed from: O1 */
    public final void mo22563O1(View view) {
        boolean z;
        this.f47324i = (ImageOrTextSubtitleListItemView) view.findViewById(R.id.address);
        this.f47328m = (ProgressBar) view.findViewById(R.id.progress_bar);
        LocationDescriptor locationDescriptor = new LocationDescriptor(this.f47323h);
        locationDescriptor.f23651f = getString(R.string.map_tapped_location);
        this.f47324i.setTag(locationDescriptor);
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), R.color.location_sheet_title_color_selector);
        if (((C17637d) mo46750H1("UI_CONFIGURATION")).f45349f != 0) {
            z = true;
        } else {
            z = false;
        }
        ListItemView listItemView = (ListItemView) view.findViewById(R.id.action_favorite);
        this.f47327l = listItemView;
        listItemView.setOnClickListener(new C1800c(this, 7));
        this.f47327l.setEnabled(false);
        this.f47325j = (ListItemView) view.findViewById(R.id.action_from);
        ListItemView listItemView2 = (ListItemView) view.findViewById(R.id.action_to);
        this.f47326k = listItemView2;
        if (z) {
            this.f47325j.setVisibility(0);
            this.f47325j.setOnClickListener(new C6994a(this, 10));
            this.f47325j.setEnabled(false);
            this.f47326k.setVisibility(0);
            this.f47326k.setOnClickListener(new C16850a(this, 9));
            this.f47326k.setEnabled(false);
        } else {
            UiUtils.m40238F(8, this.f47325j, listItemView2);
        }
        this.f47327l.postDelayed(new C7219n(12, this, colorStateList), 500);
    }

    /* renamed from: Q1 */
    public final void mo40414Q1(Bundle bundle) {
        LatLonE6 latLonE6 = (LatLonE6) getArguments().getParcelable("extra_lat_lon");
        if (latLonE6 != null) {
            this.f47323h = LocationDescriptor.m17771l(latLonE6);
            return;
        }
        throw new IllegalStateException("Did you use newInstance(...)?");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.getAttributes().dimAmount = 0.3f;
        }
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.location_dialog_fragment, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo46753L1(C18590a.class, new C5227c(14));
    }

    public final void onStart() {
        super.onStart();
        this.f47328m.setVisibility(0);
        Tasks.call(MoovitExecutors.f37327IO, new C17708e(getContext(), C19728f.m47195a(getContext()), this.f47323h, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener((Activity) getActivity(), new C18588a(this, 0));
    }
}
