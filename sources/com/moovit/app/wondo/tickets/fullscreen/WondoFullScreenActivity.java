package com.moovit.app.wondo.tickets.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ce0.C21100e;
import com.appboy.Constants;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenView;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.model.UriImage;
import com.tranzmate.R;
import p310x5.C7159d;
import p543hq.C17474b;
import p583jk.C17884p;
import p665mv.C18467c;
import p977zz.C20944i0;

public class WondoFullScreenActivity extends MoovitAppActivity implements WondoFullScreenView.C15651a {
    /* renamed from: y2 */
    public static Intent m39967y2(Context context, WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
        Intent intent = new Intent(context, WondoFullScreenActivity.class);
        C21100e.m49373x(wondoFullScreenDisplayInfo, "displayInfo");
        intent.putExtra("displayInfo", wondoFullScreenDisplayInfo);
        return intent;
    }

    /* renamed from: A0 */
    public final void mo46677A0(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
        if (wondoFullScreenDisplayInfo.f40713e != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_full_screen_primary_action_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, wondoFullScreenDisplayInfo.f40711c);
            aVar.mo49939g(AnalyticsAttributeKey.QUERY_STRING, wondoFullScreenDisplayInfo.f40712d);
            aVar.mo49944l(AnalyticsAttributeKey.URI, ((AppDeepLink) wondoFullScreenDisplayInfo.f40713e.f52693b).f40998c);
            mo44545v2(aVar.mo49933a());
            ((AppDeepLink) wondoFullScreenDisplayInfo.f40713e.f52693b).mo46946c(this);
            finish();
        }
    }

    /* renamed from: A2 */
    public final void mo46678A2() {
        WondoFullScreenDisplayInfo z2 = mo46680z2();
        if (z2 == null) {
            finish();
            return;
        }
        WondoFullScreenView wondoFullScreenView = (WondoFullScreenView) findViewById(R.id.wondo_full_screen_view);
        ImageView imageView = (ImageView) wondoFullScreenView.findViewById(R.id.image);
        C17884p.m44354Y(imageView).mo51642v(z2.f40710b).mo51628o0(z2.f40710b).mo10850T(imageView);
        ((TextView) wondoFullScreenView.findViewById(R.id.title)).setText(z2.f40711c);
        ((TextView) wondoFullScreenView.findViewById(R.id.subtitle)).setText(z2.f40712d);
        Button button = (Button) wondoFullScreenView.findViewById(R.id.action);
        C20944i0<String, AppDeepLink> i0Var = z2.f40713e;
        if (i0Var != null) {
            button.setText((CharSequence) i0Var.f52692a);
            button.setOnClickListener(new C7159d(2, this, z2));
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
        Button button2 = (Button) wondoFullScreenView.findViewById(R.id.secondary_action);
        C20944i0<String, AppDeepLink> i0Var2 = z2.f40714f;
        if (i0Var2 != null) {
            button2.setText((CharSequence) i0Var2.f52692a);
            button2.setOnClickListener(new C18467c(1, this, z2));
            button2.setVisibility(0);
            return;
        }
        button2.setVisibility(8);
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo46678A2();
    }

    /* renamed from: e */
    public final void mo46679e(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
        if (wondoFullScreenDisplayInfo.f40714f != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_full_screen_secondary_action_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, wondoFullScreenDisplayInfo.f40711c);
            aVar.mo49939g(AnalyticsAttributeKey.QUERY_STRING, wondoFullScreenDisplayInfo.f40712d);
            aVar.mo49944l(AnalyticsAttributeKey.URI, ((AppDeepLink) wondoFullScreenDisplayInfo.f40714f.f52693b).f40998c);
            mo44545v2(aVar.mo49933a());
            ((AppDeepLink) wondoFullScreenDisplayInfo.f40714f.f52693b).mo46946c(this);
            finish();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_full_screen_activity);
        mo46678A2();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        Uri uri;
        C17474b.C17475a m1 = super.mo19762m1();
        WondoFullScreenDisplayInfo z2 = mo46680z2();
        if (z2 != null) {
            C20944i0<String, AppDeepLink> i0Var = z2.f40713e;
            Uri uri2 = null;
            if (i0Var != null) {
                uri = ((AppDeepLink) i0Var.f52693b).f40998c;
            } else {
                uri = null;
            }
            C20944i0<String, AppDeepLink> i0Var2 = z2.f40714f;
            if (i0Var2 != null) {
                uri2 = ((AppDeepLink) i0Var2.f52693b).f40998c;
            }
            m1.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, z2.f40711c);
            m1.mo49939g(AnalyticsAttributeKey.QUERY_STRING, z2.f40712d);
            m1.mo49944l(AnalyticsAttributeKey.ACTION, uri);
            m1.mo49944l(AnalyticsAttributeKey.SECONDARY_ACTION, uri2);
        }
        return m1;
    }

    /* renamed from: z2 */
    public final WondoFullScreenDisplayInfo mo46680z2() {
        C20944i0 i0Var;
        C20944i0 i0Var2;
        WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo = (WondoFullScreenDisplayInfo) getIntent().getParcelableExtra("displayInfo");
        if (wondoFullScreenDisplayInfo != null) {
            return wondoFullScreenDisplayInfo;
        }
        Uri data = getIntent().getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("i");
            String queryParameter2 = data.getQueryParameter(Constants.APPBOY_PUSH_TITLE_KEY);
            String queryParameter3 = data.getQueryParameter("st");
            String queryParameter4 = data.getQueryParameter("at");
            String queryParameter5 = data.getQueryParameter("au");
            String queryParameter6 = data.getQueryParameter("sat");
            String queryParameter7 = data.getQueryParameter("sau");
            if (!(queryParameter == null || queryParameter2 == null || queryParameter3 == null)) {
                if (queryParameter4 == null || queryParameter5 == null) {
                    i0Var = null;
                } else {
                    i0Var = new C20944i0(queryParameter4, new AppDeepLink("com.tranzmate", Uri.parse(queryParameter5)));
                }
                if (queryParameter6 == null || queryParameter7 == null) {
                    i0Var2 = null;
                } else {
                    i0Var2 = new C20944i0(queryParameter6, new AppDeepLink("com.tranzmate", Uri.parse(queryParameter7)));
                }
                return new WondoFullScreenDisplayInfo(UriImage.m40912c(queryParameter, new String[0]), queryParameter2, queryParameter3, i0Var, i0Var2);
            }
        }
        return null;
    }
}
