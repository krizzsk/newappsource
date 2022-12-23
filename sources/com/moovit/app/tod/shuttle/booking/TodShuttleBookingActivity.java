package com.moovit.app.tod.shuttle.booking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0207b;
import c00.C13717b;
import c70.C13753f;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tod.shuttle.model.TodZone;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.AlertMessageView;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import p028ba.C1513g;
import p065e.C4413c;
import p715ox.C18855e;
import p715ox.C18856f;
import p906wz.C20436g;

public class TodShuttleBookingActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f40374l0 = 0;

    /* renamed from: U */
    public final C0207b<Intent> f40375U = registerForActivityResult(new C4413c(), new C1513g(this, 9));

    /* renamed from: X */
    public ArrayList f40376X;

    /* renamed from: Y */
    public final TodShuttleBookingState f40377Y = new TodShuttleBookingState();

    /* renamed from: Z */
    public final ArrayList f40378Z = new ArrayList();

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        ArrayList arrayList = ((C18856f) C13717b.m34256c(list)).f48007m;
        this.f40376X = arrayList;
        if (arrayList.size() == 1) {
            this.f40377Y.f40399b = (TodZone) this.f40376X.get(0);
        }
    }

    /* renamed from: W1 */
    public final void mo44514W1(CollectionHashMap.ArrayListHashMap arrayListHashMap, Map map) {
        super.mo44514W1(arrayListHashMap, map);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.error_view);
        Exception exc = (Exception) C13717b.m34256c(map.values());
        if (alertMessageView != null && (exc instanceof UserRequestError)) {
            UserRequestError userRequestError = (UserRequestError) exc;
            alertMessageView.setTitle((CharSequence) userRequestError.mo49162d());
            alertMessageView.setSubtitle((CharSequence) userRequestError.mo49161c());
            alertMessageView.setImage((int) R.drawable.img_empty_warning);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        EnumSet<E> enumSet;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_shuttle_booking_activity);
        this.f40378Z.clear();
        if (this.f40376X.size() > 1) {
            enumSet = EnumSet.allOf(TodShuttleBookingStep.class);
        } else {
            enumSet = EnumSet.complementOf(EnumSet.of(TodShuttleBookingStep.CHOOSE_ZONE));
        }
        for (E e : enumSet) {
            this.f40378Z.add(e.fragmentClass);
        }
        if (mo44529n1(R.id.fragment_container) == null) {
            mo46415y2();
        }
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        String str;
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("pi");
        } else {
            str = null;
        }
        if (str == null) {
            str = intent.getStringExtra("providerId");
        }
        if (str == null) {
            finish();
            return null;
        }
        C18855e eVar = new C18855e(mo44548x1(), str);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C18855e.class, sb, "_");
        sb.append(eVar.f48006w);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        return new C13753f<>(sb2, eVar, requestOptions);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46415y2() {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.f40378Z
            boolean r0 = r0.isEmpty()
            r1 = 2131362998(0x7f0a04b6, float:1.8345792E38)
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000e
            goto L_0x0033
        L_0x000e:
            androidx.fragment.app.Fragment r0 = r11.mo44529n1(r1)
            lx.a r0 = (p644lx.C18283a) r0
            if (r0 != 0) goto L_0x001f
            java.util.ArrayList r0 = r11.f40378Z
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x003f
        L_0x001f:
            java.util.ArrayList r4 = r11.f40378Z
            java.lang.Class r0 = r0.getClass()
            int r0 = r4.indexOf(r0)
            java.util.ArrayList r4 = r11.f40378Z
            int r4 = r4.size()
            int r4 = r4 + -1
            if (r0 != r4) goto L_0x0035
        L_0x0033:
            r0 = r3
            goto L_0x003f
        L_0x0035:
            java.util.ArrayList r4 = r11.f40378Z
            int r0 = r0 + 1
            java.lang.Object r0 = r4.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
        L_0x003f:
            if (r0 != 0) goto L_0x006b
            com.moovit.app.tod.shuttle.booking.TodShuttleBookingState r0 = r11.f40377Y
            com.moovit.app.tod.shuttle.model.TodZone r1 = r0.f40399b
            com.moovit.app.tod.shuttle.model.TodShuttleTrip r6 = r0.f40401d
            if (r1 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            androidx.activity.result.b<android.content.Intent> r9 = r11.f40375U
            com.moovit.app.tod.shuttle.booking.TodShuttleBookingInfo r10 = new com.moovit.app.tod.shuttle.booking.TodShuttleBookingInfo
            com.moovit.network.model.ServerId r3 = r1.f40447b
            long r4 = r0.f40400c
            int r7 = r0.f40402e
            int r8 = r0.f40403f
            r2 = r10
            r2.<init>(r3, r4, r6, r7, r8)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity> r1 = com.moovit.app.tod.shuttle.booking.TodShuttleBookingConfirmationActivity.class
            r0.<init>(r11, r1)
            java.lang.String r1 = "bookingInfo"
            r0.putExtra(r1, r10)
            r9.mo772a(r0)
        L_0x006a:
            return
        L_0x006b:
            androidx.fragment.app.FragmentManager r4 = r11.getSupportFragmentManager()
            androidx.fragment.app.s r4 = r4.mo3929G()
            r0.getClassLoader()
            java.lang.String r0 = r0.getName()
            androidx.fragment.app.Fragment r0 = r4.mo3992a(r0)
            lx.a r0 = (p644lx.C18283a) r0
            androidx.fragment.app.FragmentManager r4 = r11.getSupportFragmentManager()
            androidx.fragment.app.FragmentManager r5 = r11.getSupportFragmentManager()
            androidx.fragment.app.a r5 = p001a0.C0017h.m54K(r5, r5)
            r6 = 2130772037(0x7f010045, float:1.7147181E38)
            r7 = 2130772038(0x7f010046, float:1.7147183E38)
            r8 = 2130772039(0x7f010047, float:1.7147185E38)
            r9 = 2130772040(0x7f010048, float:1.7147187E38)
            r5.mo4112g(r6, r7, r8, r9)
            r5.mo4111f(r1, r0, r3)
            androidx.fragment.app.Fragment r0 = r11.mo44529n1(r1)
            lx.a r0 = (p644lx.C18283a) r0
            if (r0 == 0) goto L_0x00aa
            r5.mo4110c(r3)
            goto L_0x00bb
        L_0x00aa:
            int r0 = r4.mo3926D()
            if (r0 <= 0) goto L_0x00bb
            androidx.fragment.app.FragmentManager$j r0 = r4.mo3925C(r2)
            int r0 = r0.getId()
            r4.mo3937R(r0, r2)
        L_0x00bb:
            r5.mo4043i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.shuttle.booking.TodShuttleBookingActivity.mo46415y2():void");
    }
}
