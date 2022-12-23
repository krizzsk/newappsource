package p399bw;

import a00.C13382a;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.appcompat.widget.C0416i1;
import androidx.fragment.app.FragmentActivity;
import c00.C13717b;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import i00.C17522a;
import p297w5.C6996c;
import p455dy.C16753e;
import p543hq.C17474b;
import p567iq.C17635b;

/* renamed from: bw.b */
public class C13697b extends C15676b<MoovitActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f33757n = 0;

    /* renamed from: h */
    public EditText f33758h;

    /* renamed from: i */
    public SearchLocationItem f33759i;

    /* renamed from: j */
    public C13699c f33760j;

    /* renamed from: k */
    public Handler f33761k;

    /* renamed from: l */
    public boolean f33762l;

    /* renamed from: m */
    public final C0416i1 f33763m = new C0416i1(this, 13);

    /* renamed from: bw.b$a */
    public class C13698a extends C17522a {

        /* renamed from: b */
        public final /* synthetic */ View f33764b;

        public C13698a(View view) {
            this.f33764b = view;
        }

        public final void afterTextChanged(Editable editable) {
            this.f33764b.setEnabled(!editable.toString().trim().isEmpty());
        }
    }

    public C13697b() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo40565S1() {
        UiUtils.m40252k(getDialog().findViewById(R.id.save_button));
        C16753e n = C16753e.m42310n(getActivity());
        String obj = this.f33758h.getText().toString();
        LocationDescriptor g = SearchLocationItem.m39103g(this.f33759i);
        if (getResources().getString(R.string.dashboard_favorites_home).equalsIgnoreCase(obj)) {
            n.getClass();
            n.mo49449z(new LocationFavorite(g, obj));
        } else if (getResources().getString(R.string.dashboard_favorites_work).equalsIgnoreCase(obj)) {
            n.getClass();
            n.mo49430A(new LocationFavorite(g, obj));
        } else {
            n.mo49433g(g, obj);
        }
        this.f33762l = true;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "save_clicked");
        mo22564R1(aVar.mo49933a());
        if (C13382a.m33671g(getActivity())) {
            ((ViewAnimator) getDialog().findViewById(R.id.root)).showNext();
            this.f33761k.postDelayed(this.f33763m, 1500);
            return;
        }
        dismissAllowingStateLoss();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C13699c) {
            this.f33760j = (C13699c) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33759i = (SearchLocationItem) mo46752K1().getParcelable("location_item");
        this.f33761k = new Handler(Looper.getMainLooper());
        this.f33762l = false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.add_smart_location_layout, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        this.f33760j = null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        int i;
        super.onDismiss(dialogInterface);
        C13700d dVar = C13700d.f33766e;
        if (!this.f33762l) {
            i = C13700d.f33765d.mo19759a(dVar.f33769c).intValue() + 1;
        } else {
            i = 0;
        }
        C13700d.f33765d.mo49545d(dVar.f33769c, Integer.valueOf(i));
        C13699c cVar = this.f33760j;
        if (cVar != null) {
            cVar.mo40566b(this.f33759i);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f33761k.removeCallbacks(this.f33763m);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "frequently_used_location_popup");
        mo22564R1(aVar.mo49933a());
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "frequently_used_location_popup");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13382a.m33674j(view.findViewById(R.id.description_container), ((TextView) view.findViewById(R.id.title)).getText(), ((TextView) view.findViewById(R.id.subtitle)).getText());
        View findViewById = view.findViewById(R.id.save_button);
        findViewById.setOnClickListener(new C6996c(this, 29));
        ImagesOrTextsView imagesOrTextsView = (ImagesOrTextsView) view.findViewById(R.id.location_description);
        if (!C13717b.m34258e(this.f33759i.f39461f)) {
            imagesOrTextsView.setItems(this.f33759i.f39461f);
            imagesOrTextsView.setVisibility(0);
        } else {
            imagesOrTextsView.setVisibility(8);
        }
        EditText editText = (EditText) view.findViewById(R.id.location_name);
        this.f33758h = editText;
        editText.setText(this.f33759i.f39460e);
        EditText editText2 = this.f33758h;
        editText2.setSelection(editText2.length());
        this.f33758h.addTextChangedListener(new C13698a(findViewById));
        this.f33758h.setOnEditorActionListener(new C13696a(this, 0));
    }
}
