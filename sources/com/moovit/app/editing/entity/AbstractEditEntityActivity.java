package com.moovit.app.editing.entity;

import aa0.C7546q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import b00.C13556a;
import c70.C13778r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.editing.transit.EditorChangeState;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.gallery.EmbeddedGalleryImage;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.location.AddressFragment;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import ga0.C12704f;
import i00.C17522a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import o20.C18699e;
import p241s0.C6302b;
import p304x.C7029b1;
import p395bs.C13675a;
import p395bs.C13676b;
import p395bs.C13677c;
import p395bs.C13678d;
import p395bs.C13679e;
import p425cs.C16477b;
import p543hq.C17474b;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20941h;
import p977zz.C20964s0;

public abstract class AbstractEditEntityActivity extends MoovitAppActivity implements C12704f.C12706b {

    /* renamed from: E0 */
    public static final /* synthetic */ int f37951E0 = 0;

    /* renamed from: A0 */
    public final C14857d f37952A0 = new C14857d();

    /* renamed from: B0 */
    public final C14858e f37953B0 = new C14858e();

    /* renamed from: C0 */
    public final C14859f f37954C0 = new C14859f();

    /* renamed from: D0 */
    public final C14860g f37955D0 = new C14860g();

    /* renamed from: U */
    public EditableEntityInfo f37956U;

    /* renamed from: X */
    public EditableEntityInfo f37957X;

    /* renamed from: Y */
    public MarkerZoomStyle f37958Y;

    /* renamed from: Z */
    public SparseArray<MarkerZoomStyle> f37959Z;

    /* renamed from: l0 */
    public ScrollView f37960l0;

    /* renamed from: m0 */
    public View f37961m0;

    /* renamed from: n0 */
    public MapFragment f37962n0;

    /* renamed from: o0 */
    public AddressFragment f37963o0;

    /* renamed from: p0 */
    public TextInputLayout f37964p0;

    /* renamed from: q0 */
    public TextInputLayout f37965q0;

    /* renamed from: r0 */
    public TextView f37966r0;

    /* renamed from: s0 */
    public EmbeddedGalleryFragment f37967s0;

    /* renamed from: t0 */
    public C12704f f37968t0;

    /* renamed from: u0 */
    public Object f37969u0;

    /* renamed from: v0 */
    public C6302b<EntityUpdateType, C13556a> f37970v0 = new C6302b<>(EntityUpdateType.values().length);

    /* renamed from: w0 */
    public boolean f37971w0;

    /* renamed from: x0 */
    public EditorChangeState f37972x0;

    /* renamed from: y0 */
    public boolean f37973y0;

    /* renamed from: z0 */
    public final C14856c f37974z0 = new C14856c();

    public enum EntityUpdateType {
        EDIT,
        ADD,
        REMOVE
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$a */
    public class C14854a extends C20438i<RQ, RS> {
        public C14854a() {
        }

        /* renamed from: k */
        public final void mo21408k(RQ rq, RS rs) {
            boolean z;
            AbstractEditEntityActivity abstractEditEntityActivity = AbstractEditEntityActivity.this;
            if (abstractEditEntityActivity.f37971w0 && (rs instanceof C16477b)) {
                abstractEditEntityActivity.f37957X.f37988b = ((C16477b) rs).f43072m;
            }
            if (abstractEditEntityActivity.f37957X.f37991e || abstractEditEntityActivity.f37967s0.f41477q.size() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                abstractEditEntityActivity.mo44947J2(abstractEditEntityActivity.f37967s0.f41477q);
            }
            abstractEditEntityActivity.mo44938A2(false);
        }

        /* renamed from: w */
        public final boolean mo21415w(RQ rq, Exception exc) {
            AbstractEditEntityActivity abstractEditEntityActivity = AbstractEditEntityActivity.this;
            abstractEditEntityActivity.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
            abstractEditEntityActivity.mo44545v2(aVar.mo49933a());
            C12704f fVar = abstractEditEntityActivity.f37968t0;
            if (!(fVar == null || fVar.getActivity() == null)) {
                abstractEditEntityActivity.f37968t0.dismissAllowingStateLoss();
                abstractEditEntityActivity.f37968t0 = null;
            }
            return false;
        }
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$b */
    public static /* synthetic */ class C14855b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37976a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.editing.transit.EditorChangeState[] r0 = com.moovit.app.editing.transit.EditorChangeState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37976a = r0
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37976a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.LOADED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37976a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.PENDING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37976a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.APPROVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.editing.entity.AbstractEditEntityActivity.C14855b.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$c */
    public class C14856c implements MapFragment.C16237r {
        public C14856c() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            AbstractEditEntityActivity abstractEditEntityActivity = AbstractEditEntityActivity.this;
            int i = AbstractEditEntityActivity.f37951E0;
            abstractEditEntityActivity.mo44946I2();
        }
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$d */
    public class C14857d implements CompoundButton.OnCheckedChangeListener {
        public C14857d() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            AbstractEditEntityActivity abstractEditEntityActivity = AbstractEditEntityActivity.this;
            abstractEditEntityActivity.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
            if (z) {
                str = "toggle_on_clicked";
            } else {
                str = "toggle_off_clicked";
            }
            aVar.mo49939g(analyticsAttributeKey, str);
            abstractEditEntityActivity.mo44545v2(aVar.mo49933a());
            abstractEditEntityActivity.f37957X.f37991e = z;
            abstractEditEntityActivity.mo44945H2();
        }
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$e */
    public class C14858e extends C17522a {
        public C14858e() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AbstractEditEntityActivity abstractEditEntityActivity = AbstractEditEntityActivity.this;
            abstractEditEntityActivity.f37957X.f37989c = charSequence.toString();
            abstractEditEntityActivity.f37964p0.setError("");
        }
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$f */
    public class C14859f extends C17522a {
        public C14859f() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AbstractEditEntityActivity.this.f37957X.f37992f = charSequence.toString();
        }
    }

    /* renamed from: com.moovit.app.editing.entity.AbstractEditEntityActivity$g */
    public class C14860g implements View.OnFocusChangeListener {
        public C14860g() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                UiUtils.m40252k(view);
                return;
            }
            int id = view.getId();
            if (id == R.id.name_edit) {
                AbstractEditEntityActivity abstractEditEntityActivity = AbstractEditEntityActivity.this;
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "name_clicked");
                abstractEditEntityActivity.mo44545v2(aVar.mo49933a());
            } else if (id == R.id.more_info_edit) {
                AbstractEditEntityActivity abstractEditEntityActivity2 = AbstractEditEntityActivity.this;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "more_info_clicked");
                abstractEditEntityActivity2.mo44545v2(aVar2.mo49933a());
            }
        }
    }

    /* renamed from: A2 */
    public final void mo44938A2(boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
        mo44545v2(aVar.mo49933a());
        if (!z) {
            C12704f fVar = this.f37968t0;
            if (fVar == null || fVar.getDialog() == null) {
                setResult(-1);
                finish();
                return;
            }
            this.f37968t0.mo39495T1();
        } else if (this.f37968t0 == null) {
            C12704f S1 = C12704f.m32465S1(R.string.edit_stop_pathway_pathway_updated_message_body, true);
            this.f37968t0 = S1;
            S1.show(getSupportFragmentManager(), C12704f.f31376m);
        }
    }

    /* renamed from: B2 */
    public abstract String mo44939B2();

    /* renamed from: C2 */
    public abstract EnumSet<EntityUpdateType> mo44940C2();

    /* renamed from: D2 */
    public void mo44941D2() {
    }

    /* renamed from: E2 */
    public final boolean mo44942E2() {
        boolean z;
        if (C20964s0.m49090h(C7546q.m17287a(this.f37964p0))) {
            this.f37964p0.setError(getString(R.string.edit_entity_name_required_message));
            z = false;
        } else {
            z = true;
        }
        AddressFragment addressFragment = this.f37963o0;
        if (addressFragment.f42188q != null) {
            return z;
        }
        TextView textView = addressFragment.f42186o;
        textView.setTextColor(C20941h.m49043f(R.attr.colorError, textView.getContext()));
        this.f37963o0.f42186o.setText(R.string.edit_entity_location_required_message);
        return false;
    }

    /* renamed from: F2 */
    public boolean mo44943F2() {
        return mo44944G2(false);
    }

    /* renamed from: G2 */
    public final boolean mo44944G2(boolean z) {
        if (!this.f37956U.equals(this.f37957X) || (this.f37967s0.f41477q.size() > 0 && !z)) {
            return true;
        }
        return false;
    }

    /* renamed from: H2 */
    public final void mo44945H2() {
        char c;
        if (this.f37957X.f37991e) {
            c = 0;
        } else {
            c = 8;
        }
        if (c == 0) {
            UiUtils.m40252k(this.f37961m0);
            this.f37964p0.clearFocus();
            this.f37965q0.clearFocus();
            this.f37961m0.animate().alpha(1.0f).setListener(new C13678d(this));
            return;
        }
        this.f37961m0.animate().alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C13679e(this));
    }

    /* renamed from: I2 */
    public final void mo44946I2() {
        boolean z;
        if (this.f37962n0.mo48624U2()) {
            MarkerZoomStyle markerZoomStyle = this.f37958Y;
            if (markerZoomStyle != null) {
                mo44950M2(markerZoomStyle);
            } else {
                SparseArray<MarkerZoomStyle> sparseArray = this.f37959Z;
                Object obj = this.f37969u0;
                if (obj == null || this.f37973y0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f37973y0 = false;
                if (z) {
                    if (obj != null) {
                        this.f37962n0.mo48636g3(obj);
                        this.f37969u0 = null;
                    }
                    this.f37959Z = sparseArray;
                    if (sparseArray != null) {
                        MapFragment mapFragment = this.f37962n0;
                        LatLonE6 latLonE6 = this.f37957X.f37990d;
                        mapFragment.getClass();
                        this.f37969u0 = mapFragment.mo48648p2(latLonE6, (Object) null, C18699e.m45697a(sparseArray));
                    }
                }
            }
            this.f37962n0.mo48664z2(this.f37957X.f37990d, 19.5f);
        }
    }

    /* renamed from: J2 */
    public final void mo44947J2(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EmbeddedGalleryImage embeddedGalleryImage = (EmbeddedGalleryImage) it.next();
            EntityImageUploadWorker.m40807a(this, EntityImageUploadWorker.EntityImageType.STOP, embeddedGalleryImage.f41479b, this.f37957X.f37988b.mo19751c(), embeddedGalleryImage.f41480c);
        }
    }

    /* renamed from: K */
    public final void mo39497K() {
        setResult(-1);
        finish();
    }

    /* renamed from: K2 */
    public final <RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> void mo44948K2(EntityUpdateType entityUpdateType) {
        C13556a orDefault = this.f37970v0.getOrDefault(entityUpdateType, null);
        if (orDefault != null) {
            orDefault.cancel(true);
            this.f37970v0.remove(entityUpdateType);
        }
        C13778r y2 = mo44951y2(entityUpdateType, this.f37957X);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f37970v0.put(entityUpdateType, mo44527k2("updateEntityRequest", y2, requestOptions, new C14854a()));
    }

    /* renamed from: L2 */
    public final void mo44949L2() {
        if (this.f37968t0 == null) {
            C12704f S1 = C12704f.m32465S1(R.string.edit_stop_pathway_pathway_updated_message_body, false);
            this.f37968t0 = S1;
            S1.show(getSupportFragmentManager(), C12704f.f31376m);
        }
    }

    /* renamed from: M2 */
    public final void mo44950M2(MarkerZoomStyle markerZoomStyle) {
        boolean z;
        Object obj = this.f37969u0;
        if (obj == null || this.f37973y0) {
            z = true;
        } else {
            z = false;
        }
        this.f37973y0 = false;
        if (z) {
            if (obj != null) {
                this.f37962n0.mo48636g3(obj);
                this.f37969u0 = null;
            }
            this.f37958Y = markerZoomStyle;
            if (markerZoomStyle != null) {
                this.f37969u0 = this.f37962n0.mo48646o2(this.f37957X.f37990d, (Object) null, markerZoomStyle);
            }
        }
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        if (!mo44943F2()) {
            return this instanceof AdjustAdsPreferencesActivity;
        }
        mo44530n2(new AlertDialogFragment.C15856a((Context) this).mo47681j(R.string.action_keep_editing).mo47680i(R.string.action_discard).mo47682k("discard_changes_tag").mo47678g(R.string.edit_stop_pathway_discard_changes_message).mo47673b());
        return true;
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        super.mo19421Q1(menu);
        getMenuInflater().inflate(R.menu.edit_entitiy_menu, menu);
        return true;
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.edit_entity_activity);
        Intent intent = getIntent();
        EditableEntityInfo editableEntityInfo = (EditableEntityInfo) intent.getParcelableExtra("extra_entity_info");
        this.f37956U = editableEntityInfo;
        if (editableEntityInfo != null) {
            this.f37972x0 = (EditorChangeState) intent.getParcelableExtra("extraEntityChangeState");
            this.f37971w0 = intent.getBooleanExtra("extra_entity_is_new", false);
            this.f37958Y = (MarkerZoomStyle) intent.getParcelableExtra("extra_entity_marker_zoom_style");
            this.f37959Z = intent.getExtras().getSparseParcelableArray("extra_entity_markers_zoom_style");
            if (bundle == null) {
                EditableEntityInfo editableEntityInfo2 = this.f37956U;
                this.f37957X = new EditableEntityInfo(editableEntityInfo2.f37988b, editableEntityInfo2.f37989c, editableEntityInfo2.f37990d, editableEntityInfo2.f37992f, editableEntityInfo2.f37991e);
            } else {
                this.f37957X = (EditableEntityInfo) bundle.getParcelable("extra_entity_info");
                this.f37958Y = (MarkerZoomStyle) bundle.getParcelable("extra_entity_marker_zoom_style");
                this.f37959Z = bundle.getSparseParcelableArray("extra_entity_markers_zoom_style");
            }
            mo44941D2();
            TextView textView = (TextView) findViewById(R.id.status_alert);
            this.f37966r0 = textView;
            EditorChangeState editorChangeState = this.f37972x0;
            if (editorChangeState == null) {
                textView.setVisibility(8);
            } else {
                int i2 = C14855b.f37976a[editorChangeState.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    this.f37966r0.setVisibility(8);
                } else if (i2 == 3) {
                    this.f37966r0.setVisibility(8);
                    this.f37966r0.postDelayed(new C13675a(this, R.string.edit_stop_overview_activity_pending_changes_message), 1000);
                } else if (i2 == 4) {
                    this.f37966r0.setVisibility(8);
                    this.f37966r0.postDelayed(new C13675a(this, R.string.edit_stop_overview_activity_pending_load_message), 1000);
                }
            }
            SwitchMaterial switchMaterial = (SwitchMaterial) findViewById(R.id.gone_switch);
            View findViewById = findViewById(R.id.gone_switch_divider);
            if (this.f37971w0 || !mo44940C2().contains(EntityUpdateType.REMOVE)) {
                switchMaterial.setVisibility(8);
                findViewById.setVisibility(4);
            } else {
                switchMaterial.setText(mo44939B2());
                switchMaterial.setChecked(this.f37957X.f37991e);
                switchMaterial.setOnCheckedChangeListener(this.f37952A0);
            }
            this.f37961m0 = findViewById(R.id.blocker);
            ScrollView scrollView = (ScrollView) findViewById(R.id.main_content);
            this.f37960l0 = scrollView;
            scrollView.setOnTouchListener(new C13676b(this));
            TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.name);
            this.f37964p0 = textInputLayout;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setText(this.f37957X.f37989c);
                editText.setOnFocusChangeListener(this.f37955D0);
            }
            TextInputLayout textInputLayout2 = this.f37964p0;
            textInputLayout2.getEditText().addTextChangedListener(this.f37953B0);
            MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3983z(R.id.map_fragment);
            this.f37962n0 = mapFragment;
            C20061g gVar = this.f37295D;
            C20061g gVar2 = mapFragment.f40829j;
            mapFragment.f40829j = gVar;
            mapFragment.mo46791d2(gVar2, gVar);
            this.f37962n0.mo48656t2(this.f37974z0);
            MapFragment mapFragment2 = this.f37962n0;
            MapFragment.MapFollowMode mapFollowMode = MapFragment.MapFollowMode.NONE;
            mapFragment2.mo48641l3(mapFollowMode, false);
            MapFragment mapFragment3 = this.f37962n0;
            mapFragment3.f42379s0 = false;
            if (mapFragment3.mo48624U2()) {
                mapFragment3.f42368n.mo48797l(false);
            }
            MapFragment mapFragment4 = this.f37962n0;
            if (mapFragment4.f42373p0) {
                mapFragment4.f42373p0 = false;
                mapFragment4.mo48659u3();
            }
            this.f37962n0.mo48640k3(mapFollowMode);
            this.f37962n0.mo48649p3(false, false);
            this.f37962n0.mo48651q3(false);
            findViewById(R.id.map_container).setOnClickListener(new C13677c(this));
            TextView textView2 = (TextView) findViewById(R.id.map_message);
            if (this.f37971w0) {
                i = R.string.edit_entity_new_map_message;
            } else {
                i = R.string.edit_entity_update_map_message;
            }
            textView2.setText(i);
            AddressFragment addressFragment = (AddressFragment) getSupportFragmentManager().mo3983z(R.id.address_fragment);
            this.f37963o0 = addressFragment;
            if (!this.f37971w0) {
                addressFragment.f42188q = this.f37957X.f37990d;
                addressFragment.mo48497m2();
            }
            this.f37967s0 = (EmbeddedGalleryFragment) getSupportFragmentManager().mo3983z(R.id.gallery);
            FormatTextView formatTextView = (FormatTextView) findViewById(R.id.compliance);
            String string = getString(R.string.edit_entity_photos_compliance_text_link);
            formatTextView.setArguments(string);
            C20964s0.m49105w(formatTextView, string, false, new C7029b1(this, 7));
            TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(R.id.more_info);
            this.f37965q0 = textInputLayout3;
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                editText2.setText(this.f37957X.f37992f);
                editText2.setOnFocusChangeListener(this.f37955D0);
            }
            TextInputLayout textInputLayout4 = this.f37965q0;
            textInputLayout4.getEditText().addTextChangedListener(this.f37954C0);
            this.f37968t0 = (C12704f) getSupportFragmentManager().mo3923A(C12704f.f31376m);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.extra_view_container);
            View z2 = mo44952z2(getLayoutInflater(), viewGroup);
            if (z2 != null) {
                viewGroup.addView(z2);
                viewGroup.setVisibility(0);
            }
            mo44946I2();
            mo44945H2();
            return;
        }
        throw new IllegalStateException("edit stop pathway can not initiated without am editable entity info");
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("extra_entity_info", this.f37957X);
        bundle.putParcelable("extra_entity_marker_zoom_style", this.f37958Y);
        bundle.putSparseParcelableArray("extra_entity_markers_zoom_style", this.f37959Z);
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareLowAccuracyRareUpdates();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49941i(AnalyticsAttributeKey.NEW_ENTITY, getIntent().getBooleanExtra("extra_entity_is_new", false));
        return m1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            LatLonE6 latLonE6 = (LatLonE6) intent.getParcelableExtra("extra_entity_location_on_map");
            TextView textView = this.f37963o0.f42186o;
            textView.setTextColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisLow, textView.getContext()));
            AddressFragment addressFragment = this.f37963o0;
            addressFragment.f42188q = latLonE6;
            addressFragment.mo48497m2();
            this.f37957X.f37990d = latLonE6;
            this.f37973y0 = true;
            mo44946I2();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.done) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "send_report_clicked");
        mo44545v2(aVar.mo49933a());
        if (!mo44942E2()) {
            UiUtils.m40252k(this.f37964p0);
            this.f37964p0.clearFocus();
            this.f37965q0.clearFocus();
        } else if (this.f37957X.f37991e && !this.f37956U.f37991e) {
            mo44949L2();
            mo44948K2(EntityUpdateType.REMOVE);
        } else if (this.f37971w0) {
            if (!mo44943F2()) {
                finish();
            } else {
                mo44949L2();
                mo44948K2(EntityUpdateType.ADD);
            }
        } else if (!mo44943F2() || !mo44942E2()) {
            Toast.makeText(this, R.string.edit_stop_report_not_sent_message, 1).show();
            finish();
        } else if (mo44944G2(true)) {
            mo44949L2();
            mo44948K2(EntityUpdateType.EDIT);
        } else {
            mo44947J2(this.f37967s0.f41477q);
            mo44938A2(true);
        }
        return true;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("discard_changes_tag".equals(str)) {
            if (i == -2) {
                finish();
            }
            return true;
        } else if ("delete_confirmation_tag".equals(str)) {
            if (i == -2) {
                mo44949L2();
                mo44948K2(EntityUpdateType.REMOVE);
            }
            return true;
        } else {
            super.mo19430t0(str, i, bundle);
            return true;
        }
    }

    /* renamed from: y2 */
    public abstract C13778r mo44951y2(EntityUpdateType entityUpdateType, EditableEntityInfo editableEntityInfo);

    /* renamed from: z2 */
    public View mo44952z2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }
}
