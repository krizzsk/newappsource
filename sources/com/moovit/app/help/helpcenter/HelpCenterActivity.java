package com.moovit.app.help.helpcenter;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p001a0.C0017h;
import p543hq.C17474b;
import p923xs.C20571f;

public class HelpCenterActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38123U = 0;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45061A2(android.content.Intent r9) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentManager r0 = r8.getSupportFragmentManager()
            int r1 = r0.mo3926D()
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            androidx.fragment.app.FragmentManager$j r1 = r0.mo3925C(r2)
            int r1 = r1.getId()
            r0.mo3937R(r1, r2)
        L_0x0016:
            android.net.Uri r9 = r9.getData()
            r0 = -1
            if (r9 != 0) goto L_0x001f
            goto L_0x002b
        L_0x001f:
            java.lang.String r3 = "sid"
            java.lang.String r3 = r9.getQueryParameter(r3)
            boolean r4 = p977zz.C20964s0.m49089g(r3)
            if (r4 != 0) goto L_0x002d
        L_0x002b:
            r3 = r0
            goto L_0x0031
        L_0x002d:
            long r3 = java.lang.Long.parseLong(r3)
        L_0x0031:
            r5 = 0
            java.lang.String r6 = "ownerSectionName"
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0053
            int r9 = p923xs.C20577i.f52051t
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = "ownerSectionId"
            r9.putLong(r0, r3)
            r9.putString(r6, r5)
            xs.i r0 = new xs.i
            r0.<init>()
            r0.setArguments(r9)
            r8.mo45063z2(r0, r2)
            return
        L_0x0053:
            if (r9 != 0) goto L_0x0056
            goto L_0x0062
        L_0x0056:
            java.lang.String r3 = "aid"
            java.lang.String r9 = r9.getQueryParameter(r3)
            boolean r3 = p977zz.C20964s0.m49089g(r9)
            if (r3 != 0) goto L_0x0064
        L_0x0062:
            r3 = r0
            goto L_0x0068
        L_0x0064:
            long r3 = java.lang.Long.parseLong(r9)
        L_0x0068:
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0087
            android.content.UriMatcher r9 = p923xs.C20568d.f52024u
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r0 = "articleId"
            r9.putLong(r0, r3)
            r9.putString(r6, r5)
            xs.d r0 = new xs.d
            r0.<init>()
            r0.setArguments(r9)
            r8.mo45063z2(r0, r2)
            return
        L_0x0087:
            xs.l r9 = new xs.l
            r9.<init>()
            r8.mo45063z2(r9, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.help.helpcenter.HelpCenterActivity.mo45061A2(android.content.Intent):void");
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo45061A2(intent);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.help_center_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
            supportActionBar.mo792n();
        }
        if (getSupportFragmentManager().mo3983z(R.id.fragments_container) == null) {
            mo45061A2(getIntent());
        }
    }

    /* renamed from: y2 */
    public final void mo45062y2(Long l, String str) {
        C20571f fVar;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_search_clicked");
        aVar.mo49944l(AnalyticsAttributeKey.ID, l);
        mo44545v2(aVar.mo49933a());
        if (l != null) {
            long longValue = l.longValue();
            int i = C20571f.f52035w;
            Bundle bundle = new Bundle();
            bundle.putLong("sectionId", longValue);
            bundle.putString("sectionName", str);
            fVar = new C20571f();
            fVar.setArguments(bundle);
        } else {
            int i2 = C20571f.f52035w;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("sectionId", -1);
            bundle2.putString("sectionName", (String) null);
            fVar = new C20571f();
            fVar.setArguments(bundle2);
        }
        mo45063z2(fVar, true);
    }

    /* renamed from: z2 */
    public final void mo45063z2(C15682c<HelpCenterActivity> cVar, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        K.mo4112g(R.anim.slide_fragment_enter, R.anim.slide_fragment_exit, R.anim.slide_fragment_pop_enter, R.anim.slide_fragment_pop_exit);
        K.mo4111f(R.id.fragments_container, cVar, (String) null);
        if (z) {
            K.mo4110c((String) null);
        }
        K.mo4040d();
    }
}
