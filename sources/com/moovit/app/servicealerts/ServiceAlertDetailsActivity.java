package com.moovit.app.servicealerts;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import c00.C13717b;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.servicealerts.ServiceStatus;
import com.moovit.transit.TransitAgency;
import com.moovit.util.NonStyleModifyingUrlSpan;
import com.moovit.util.Text;
import com.moovit.util.TextFormat;
import com.tranzmate.R;
import j80.C12778f;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import mf0.C24361g;
import p455dy.C16753e;
import p496fr.C17064a;
import p567iq.C17635b;
import p688nu.C18632d;
import p756qt.C19173b;
import p824tp.C19728f;
import p858uz.C20061g;
import p872vp.C20195b;
import p898wr.C20400b;
import p926xv.C20624e;
import p926xv.C20625f;
import p977zz.C20964s0;
import u00.C19826h;

public class ServiceAlertDetailsActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f39553Y = 0;

    /* renamed from: U */
    public final StringBuilder f39554U = new StringBuilder();

    /* renamed from: X */
    public ServiceAlert f39555X;

    /* renamed from: A2 */
    public static Intent m39147A2(MoovitAppActivity moovitAppActivity, ServiceAlert serviceAlert, ServerId serverId) {
        Intent intent = new Intent(moovitAppActivity, ServiceAlertDetailsActivity.class);
        intent.putExtra("SERVICE_ALERT_DATA_EXTRA", serviceAlert);
        intent.putExtra("LINE_GROUP_ID_EXTRA", serverId);
        return intent;
    }

    /* renamed from: z2 */
    public static Intent m39148z2(Context context, ServerId serverId, String str) {
        Intent intent = new Intent(context, ServiceAlertDetailsActivity.class);
        intent.putExtra("SERVICE_ALERT_ID_EXTRA", str);
        intent.putExtra("LINE_GROUP_ID_EXTRA", serverId);
        return intent;
    }

    /* renamed from: B2 */
    public final void mo45845B2() {
        TransitAgency transitAgency;
        String str;
        boolean z;
        int i;
        SearchLineItem searchLineItem;
        ServiceAlert serviceAlert = this.f39555X;
        if (serviceAlert == null) {
            setContentView((int) R.layout.service_alert_failure_loading);
            return;
        }
        DbEntityRef<TransitAgency> dbEntityRef = serviceAlert.f23192d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (dbEntityRef == null) {
            transitAgency = null;
        } else {
            transitAgency = dbEntityRef.get();
        }
        setContentView((int) R.layout.service_alert_details);
        List<ServiceAlertAffectedLine> list = this.f39555X.f23193e;
        if (!(transitAgency == null || list == null || list.size() != 1)) {
            ImageOrTextSubtitleListItemView imageOrTextSubtitleListItemView = (ImageOrTextSubtitleListItemView) findViewById(R.id.affected_line_header);
            imageOrTextSubtitleListItemView.setVisibility(0);
            ServiceAlertAffectedLine serviceAlertAffectedLine = list.get(0);
            ServerId serverId = serviceAlertAffectedLine.f23206d;
            if (serverId != null) {
                HashSet hashSet = C19728f.f50164e;
                C19826h g = ((C20400b) C17635b.m43779f(this).mo52086d((C19728f) getSystemService("metro_context"))).mo51805g();
                g.getClass();
                searchLineItem = (SearchLineItem) g.mo52130j(this, Collections.singleton(serverId)).get(serverId);
            } else {
                searchLineItem = null;
            }
            if (searchLineItem != null) {
                imageOrTextSubtitleListItemView.setIcon(searchLineItem.f41641f);
                imageOrTextSubtitleListItemView.setTitle((CharSequence) searchLineItem.f41642g);
                imageOrTextSubtitleListItemView.setSubtitleItems(searchLineItem.f41643h);
                String k = C20195b.m47767k(searchLineItem.f41643h);
                C13382a.m33666b(this.f39554U, searchLineItem.f41642g);
                C13382a.m33666b(this.f39554U, k);
            } else {
                imageOrTextSubtitleListItemView.setIcon(serviceAlertAffectedLine.f23205c);
                imageOrTextSubtitleListItemView.setTitle((CharSequence) serviceAlertAffectedLine.f23204b);
                imageOrTextSubtitleListItemView.setSubtitle((CharSequence) transitAgency.f23673c);
                C13382a.m33666b(this.f39554U, serviceAlertAffectedLine.f23204b);
                C13382a.m33666b(this.f39554U, transitAgency.f23673c);
            }
        }
        ListItemView listItemView = (ListItemView) findViewById(R.id.status);
        ServiceAlert serviceAlert2 = this.f39555X;
        ServiceStatus serviceStatus = serviceAlert2.f23191c;
        listItemView.setIcon(serviceStatus.f23213b.getIconResId());
        listItemView.setTitle((CharSequence) serviceStatus.f23214c);
        if (!C20964s0.m49090h(serviceAlert2.f23201m)) {
            listItemView.setAccessoryView((int) R.layout.list_item_accessory_icon_button);
            listItemView.setAccessoryDrawable((int) R.drawable.ic_share_24);
            listItemView.getAccessoryView().setOnClickListener(new C17064a(6, this, serviceAlert2));
            listItemView.getAccessoryView().setContentDescription(getString(R.string.action_share));
        } else {
            listItemView.setAccessoryDrawable(0);
        }
        C13382a.m33666b(this.f39554U, getString(serviceStatus.f23213b.getAccessibilityResId()));
        ServiceAlert serviceAlert3 = this.f39555X;
        View findViewById = findViewById(R.id.service_alert_view);
        String str2 = serviceAlert3.f23197i;
        UiUtils.m40234B((TextView) findViewById.findViewById(R.id.title), str2);
        C13382a.m33666b(this.f39554U, serviceAlert3.f23197i);
        Date date = serviceAlert3.f23195g;
        Date date2 = serviceAlert3.f23196h;
        if (date == null && date2 == null) {
            str = null;
        } else {
            HashSet hashSet2 = C19728f.f50164e;
            String id = ((C19728f) getSystemService("metro_context")).f50165a.f16131f.getID();
            Formatter formatter = new Formatter();
            if (date == null || date2 == null) {
                if (date == null) {
                    date = date2;
                }
                long time = date.getTime();
                str = DateUtils.formatDateRange(this, formatter, time, time, 540689, id).toString();
            } else {
                str = DateUtils.formatDateRange(this, formatter, date.getTime(), date2.getTime(), 540689, id).toString();
            }
        }
        mo45846y2((TextView) findViewById.findViewById(R.id.time_range_view), (TextView) findViewById.findViewById(R.id.time_range_header_view), findViewById.findViewById(R.id.affected_dates_icon), str);
        if (transitAgency != null && !C13717b.m34258e(serviceAlert3.f23193e)) {
            List<ServiceAlertAffectedLine> list2 = serviceAlert3.f23193e;
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(transitAgency.f23673c);
            if (list2 != null) {
                spannableStringBuilder.append(" - ");
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    spannableStringBuilder.append(list2.get(i2).f23204b);
                    if (i2 != list2.size() - 1) {
                        spannableStringBuilder.append(", ");
                    }
                }
            }
        }
        TextView textView = (TextView) findViewById.findViewById(R.id.affected_lines);
        mo45846y2(textView, (TextView) findViewById.findViewById(R.id.affected_lines_header), findViewById.findViewById(R.id.affected_lines_icon), spannableStringBuilder);
        Button button = (Button) findViewById.findViewById(R.id.show_more_btn);
        if (textView.getVisibility() != 0) {
            button.setVisibility(8);
        } else {
            UiUtils.m40259r(textView, new C19173b(textView, 1, button));
            button.setOnClickListener(new C20624e(textView, button, C17988b.m44611b(R.drawable.ic_arrow_up_12, button.getContext()), C17988b.m44611b(R.drawable.ic_arrow_down_12, button.getContext()), 0));
        }
        Date date3 = serviceAlert3.f23194f;
        FormatTextView formatTextView = (FormatTextView) findViewById.findViewById(R.id.publication_date);
        if (date3 != null) {
            formatTextView.setArguments(DateUtils.getRelativeTimeSpanString(date3.getTime(), System.currentTimeMillis(), 86400000, 16));
            formatTextView.setVisibility(0);
            C13382a.m33666b(this.f39554U, formatTextView.getText());
        } else {
            formatTextView.setVisibility(8);
        }
        if (str2 == null || (C20964s0.m49090h(str) && C20964s0.m49090h(spannableStringBuilder))) {
            z = false;
        } else {
            z = true;
        }
        View findViewById2 = findViewById(R.id.divider);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById2.setVisibility(i);
        Text text = this.f39555X.f23198j;
        if (text != null) {
            TextView x2 = mo44549x2(R.id.description);
            C13382a.m33666b(this.f39554U, text.f23876b);
            TextFormat textFormat = text.f23877c;
            if (textFormat == TextFormat.HTML) {
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.description_container);
                frameLayout.removeView(x2);
                WebView webView = new WebView(this);
                frameLayout.addView(webView, new ViewGroup.LayoutParams(-1, -2));
                webView.setVisibility(0);
                Text.m17954b(webView, text);
            } else {
                TextFormat textFormat2 = TextFormat.PLAIN;
                if (textFormat == textFormat2) {
                    x2.setVisibility(0);
                    if (text.f23877c == textFormat2) {
                        x2.setText(text.f23876b);
                        Linkify.addLinks(x2, 1);
                    } else {
                        StringBuilder k2 = C13555b.m33972k("Attempting to display ");
                        k2.append(text.f23877c);
                        k2.append(" text in a TextView");
                        throw new IllegalArgumentException(k2.toString());
                    }
                } else {
                    StringBuilder k3 = C13555b.m33972k("Unknown or unsupported text format: ");
                    k3.append(text.f23877c);
                    throw new ApplicationBugException(k3.toString());
                }
            }
        } else {
            findViewById(R.id.description_container).setVisibility(8);
        }
        Button button2 = (Button) findViewById(R.id.more_info_link);
        String str3 = this.f39555X.f23199k;
        if (str3 == null || str3.isEmpty()) {
            button2.setVisibility(8);
        } else {
            StringBuilder sb = new StringBuilder(getString(R.string.service_alert_more_info_link_text));
            SpannableString spannableString = new SpannableString(sb);
            spannableString.setSpan(new NonStyleModifyingUrlSpan(str3), 0, sb.length(), 33);
            button2.setText(spannableString);
            button2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        ServiceAlert serviceAlert4 = this.f39555X;
        C16753e d = ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46573d();
        ServerId serverId2 = (ServerId) getIntent().getParcelableExtra("LINE_GROUP_ID_EXTRA");
        SwitchMaterial switchMaterial = (SwitchMaterial) findViewById(R.id.favorite_action);
        if (serverId2 == null || d.mo49441p(serverId2) || !serviceAlert4.mo23925b(serverId2)) {
            switchMaterial.setVisibility(8);
            C14741h hVar = new C14741h();
            hVar.mo44745a(1, mo44542u1());
            ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.SERVICE_ALERT_SCREEN_BANNER, hVar);
        } else {
            switchMaterial.setOnCheckedChangeListener(new C20625f(this, d, serviceAlert4, serverId2));
            switchMaterial.setVisibility(0);
        }
        C13382a.m33674j((FixedListView) findViewById(R.id.content), this.f39554U);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        ServiceAlert serviceAlert;
        super.mo19425e2(bundle);
        if (bundle != null) {
            serviceAlert = (ServiceAlert) bundle.getParcelable("SERVICE_ALERT_DATA_EXTRA");
        } else {
            serviceAlert = (ServiceAlert) getIntent().getParcelableExtra("SERVICE_ALERT_DATA_EXTRA");
        }
        this.f39555X = serviceAlert;
        if (serviceAlert != null) {
            mo45845B2();
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("SERVICE_ALERT_DATA_EXTRA", this.f39555X);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        String str;
        String[] strArr;
        super.mo19426h2();
        if (this.f39555X == null) {
            Intent intent = getIntent();
            if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
                str = intent.getStringExtra("SERVICE_ALERT_ID_EXTRA");
            } else {
                String queryParameter = intent.getData().getQueryParameter("alertIds");
                str = null;
                if (queryParameter != null) {
                    strArr = C20964s0.m49080A(queryParameter, ',');
                } else {
                    strArr = null;
                }
                if (!C24361g.m61154X(strArr)) {
                    str = strArr[0];
                }
            }
            if (C20964s0.m49090h(str)) {
                setContentView((int) R.layout.service_alert_failure_loading);
                return;
            }
            mo19769r2();
            C12778f fVar = C17635b.m43779f(this).f50174d;
            fVar.getClass();
            Tasks.call(MoovitExecutors.f37327IO, new C12778f.C12781c(str)).addOnCompleteListener((Activity) this, new C18632d(this, 1));
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("SEARCH_LINE_FTS");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45846y2(TextView textView, TextView textView2, View view, CharSequence charSequence) {
        if (C20964s0.m49090h(charSequence)) {
            UiUtils.m40238F(8, textView, textView2, view);
            return;
        }
        textView.setText(charSequence);
        UiUtils.m40238F(0, textView, textView2, view);
        C13382a.m33666b(this.f39554U, textView2.getText());
        C13382a.m33666b(this.f39554U, charSequence);
    }
}
