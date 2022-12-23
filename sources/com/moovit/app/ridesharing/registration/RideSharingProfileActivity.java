package com.moovit.app.ridesharing.registration;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c70.C13753f;
import com.google.android.gms.common.Scopes;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p259t5.C6592b;
import p428cv.C16499a;
import p428cv.C16500b;
import p471eq.C16850a;
import p527gy.C17261e;
import p737pv.C19031u;
import p737pv.C19032v;

public class RideSharingProfileActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f39360Y = 0;

    /* renamed from: U */
    public final C15255a f39361U = new C15255a();

    /* renamed from: X */
    public ListItemView f39362X;

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingProfileActivity$a */
    public class C15255a extends BroadcastReceiver {
        public C15255a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                RideSharingProfileActivity rideSharingProfileActivity = RideSharingProfileActivity.this;
                int i = RideSharingProfileActivity.f39360Y;
                rideSharingProfileActivity.mo45773y2();
            }
        }
    }

    /* renamed from: E1 */
    public final void mo44504E1(Bundle bundle, String str) {
        if ("PAYMENT_METHOD_ERROR_ALERT_DIALOG_TAG".equals(str)) {
            finish();
        } else {
            super.mo44504E1(bundle, str);
        }
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C17261e.m43267h(this, this.f39361U);
    }

    /* renamed from: V1 */
    public final void mo44513V1(CollectionHashMap.ArrayListHashMap arrayListHashMap, Map map) {
        C19032v vVar;
        boolean z;
        RideSharingRegistrationSteps rideSharingRegistrationSteps = null;
        if (arrayListHashMap.containsKey("missingSteps")) {
            vVar = (C19032v) arrayListHashMap.mo47003d("missingSteps");
        } else {
            vVar = null;
        }
        if (vVar != null) {
            rideSharingRegistrationSteps = vVar.f48401m;
        }
        if (rideSharingRegistrationSteps != null) {
            if (!rideSharingRegistrationSteps.f42980e || rideSharingRegistrationSteps.f42977b || rideSharingRegistrationSteps.f42978c || rideSharingRegistrationSteps.f42979d) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                startActivity(RideSharingRegistrationActivity.m39024z2(this, RideSharingRegistrationType.PURCHASE, rideSharingRegistrationSteps, Scopes.PROFILE));
                finish();
                return;
            }
        }
        super.mo44513V1(arrayListHashMap, map);
    }

    /* renamed from: X1 */
    public final void mo44515X1(CollectionHashMap.ArrayListHashMap arrayListHashMap) {
        ((C16500b) arrayListHashMap.mo47003d("braintreeCustomerToken")).getClass();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        if (!isFinishing()) {
            setContentView((int) R.layout.ride_sharing_profile_activity);
            ((ListItemView) findViewById(R.id.profile_section)).getAccessoryView().setOnClickListener(new C16850a(this, 18));
            mo45773y2();
            C17261e.m43266g(this, this.f39361U);
            ListItemView listItemView = (ListItemView) findViewById(R.id.credit_card);
            this.f39362X = listItemView;
            listItemView.setOnClickListener(new C6592b(this, 24));
            this.f39362X.setIcon(0);
            this.f39362X.setTitle((int) R.string.unknown);
            this.f39362X.setSubtitle((CharSequence) null);
            this.f39362X.setAccessoryText((int) R.string.action_change);
        }
    }

    /* renamed from: i1 */
    public final Collection<C13753f<?>> mo44524i1() {
        C16499a aVar = new C16499a(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        C13753f fVar = new C13753f("braintreeCustomerToken", aVar, requestOptions);
        C19031u uVar = new C19031u(mo44548x1());
        RequestOptions requestOptions2 = new RequestOptions();
        requestOptions2.f42909f = true;
        return Arrays.asList(new C13753f[]{fVar, new C13753f("missingSteps", uVar, requestOptions2)});
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("PAYMENT_METHOD_ERROR_ALERT_DIALOG_TAG".equals(str)) {
            if (i != -1) {
                finish();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ed, code lost:
        if (com.google.i18n.phonenumbers.PhoneNumberUtil.m36289z(r0, r1).equals(com.google.i18n.phonenumbers.PhoneNumberUtil.m36289z(r2, r1)) == false) goto L_0x02ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45773y2() {
        /*
            r13 = this;
            java.lang.String r0 = "USER_ACCOUNT"
            java.lang.Object r0 = r13.mo44537r1(r0)
            com.moovit.app.useraccount.manager.UserAccountManager r0 = (com.moovit.app.useraccount.manager.UserAccountManager) r0
            gy.e r0 = r0.mo46575f()
            gy.d r0 = r0.mo49805e()
            r1 = 2131363571(0x7f0a06f3, float:1.8346955E38)
            android.view.View r1 = r13.findViewById(r1)
            com.moovit.design.view.list.ListItemView r1 = (com.moovit.design.view.list.ListItemView) r1
            java.lang.String r2 = r0.mo49804a()
            boolean r2 = p977zz.C20964s0.m49090h(r2)
            java.lang.String r3 = "-"
            if (r2 == 0) goto L_0x0027
            r2 = r3
            goto L_0x002b
        L_0x0027:
            java.lang.String r2 = r0.mo49804a()
        L_0x002b:
            r1.setTitle((java.lang.CharSequence) r2)
            r1 = 2131362797(0x7f0a03ed, float:1.8345385E38)
            android.view.View r1 = r13.findViewById(r1)
            com.moovit.design.view.list.ListItemView r1 = (com.moovit.design.view.list.ListItemView) r1
            java.lang.String r2 = r0.f44606e
            boolean r2 = p977zz.C20964s0.m49090h(r2)
            if (r2 == 0) goto L_0x0041
            r2 = r3
            goto L_0x0043
        L_0x0041:
            java.lang.String r2 = r0.f44606e
        L_0x0043:
            r1.setTitle((java.lang.CharSequence) r2)
            java.lang.String r1 = r0.f44607f
            boolean r1 = p977zz.C20964s0.m49090h(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0051
            goto L_0x02ef
        L_0x0051:
            java.lang.String r0 = r0.f44607f
            java.util.List r1 = ba0.C7568e.m17314d(r13)
            int r4 = ba0.C7568e.m17315e(r13)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r4)
            ba0.a r1 = (ba0.C7564a) r1
            java.lang.String r4 = r1.f23054c
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r4 = ba0.C7568e.m17318h(r0, r4)
            if (r4 != 0) goto L_0x006e
        L_0x006b:
            r2 = r0
            goto L_0x02ef
        L_0x006e:
            com.google.i18n.phonenumbers.PhoneNumberUtil r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36283j()
            java.lang.String r1 = r1.f23054c
            r0.getClass()
            boolean r5 = r4.mo43848j()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00a6
            int r5 = r4.mo43838b()
            java.lang.String r8 = r0.mo43764q(r5)
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r5 = r0.mo43762m(r5, r8)
            if (r5 != 0) goto L_0x008e
            goto L_0x009e
        L_0x008e:
            java.lang.String r8 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36284n(r4)
            java.util.List r5 = r5.mo43806l()
            com.google.i18n.phonenumbers.Phonemetadata$NumberFormat r5 = r0.mo43753a(r8, r5)
            if (r5 == 0) goto L_0x009e
            r5 = 1
            goto L_0x009f
        L_0x009e:
            r5 = 0
        L_0x009f:
            if (r5 != 0) goto L_0x00a6
            java.lang.String r0 = r4.mo43844g()
            goto L_0x006b
        L_0x00a6:
            boolean r5 = r4.mo43845h()
            if (r5 != 0) goto L_0x00b3
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            java.lang.String r0 = r0.mo43755e(r4, r1)
            goto L_0x006b
        L_0x00b3:
            int[] r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.C14561a.f36751a
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource r8 = r4.mo43839c()
            int r8 = r8.ordinal()
            r5 = r5[r8]
            if (r5 == r6) goto L_0x02cd
            r8 = 2
            java.lang.String r9 = ""
            if (r5 == r8) goto L_0x0205
            r1 = 3
            if (r5 == r1) goto L_0x01f9
            int r1 = r4.mo43838b()
            java.lang.String r1 = r0.mo43764q(r1)
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r5 = r0.mo43761l(r1)
            if (r5 != 0) goto L_0x00f7
            java.util.logging.Logger r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.f36725h
            java.util.logging.Level r8 = java.util.logging.Level.WARNING
            java.lang.String r9 = "Invalid or missing region code ("
            java.lang.StringBuilder r9 = p379.C13555b.m33972k(r9)
            if (r1 != 0) goto L_0x00e6
            java.lang.String r10 = "null"
            goto L_0x00e7
        L_0x00e6:
            r10 = r1
        L_0x00e7:
            r9.append(r10)
            java.lang.String r10 = ") provided."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r5.log(r8, r9)
            goto L_0x0108
        L_0x00f7:
            java.lang.String r5 = r5.mo43803i()
            int r8 = r5.length()
            if (r8 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            java.lang.String r2 = "~"
            java.lang.String r2 = r5.replace(r2, r9)
        L_0x0108:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            java.lang.String r5 = r0.mo43755e(r4, r5)
            if (r2 == 0) goto L_0x0244
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0118
            goto L_0x0244
        L_0x0118:
            java.lang.String r8 = r4.mo43844g()
            java.lang.String r8 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36288y(r8)
            boolean r9 = r8.startsWith(r2)
            if (r9 == 0) goto L_0x013b
            int r2 = r2.length()     // Catch:{ NumberParseException -> 0x013b }
            java.lang.String r2 = r8.substring(r2)     // Catch:{ NumberParseException -> 0x013b }
            com.google.i18n.phonenumbers.Phonenumber$PhoneNumber r8 = new com.google.i18n.phonenumbers.Phonenumber$PhoneNumber     // Catch:{ NumberParseException -> 0x013b }
            r8.<init>()     // Catch:{ NumberParseException -> 0x013b }
            r0.mo43752A(r2, r1, r7, r8)     // Catch:{ NumberParseException -> 0x013b }
            boolean r2 = r0.mo43766s(r8)     // Catch:{ NumberParseException -> 0x013b }
            goto L_0x013c
        L_0x013b:
            r2 = 0
        L_0x013c:
            if (r2 == 0) goto L_0x0140
            goto L_0x0244
        L_0x0140:
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r1 = r0.mo43761l(r1)
            java.lang.String r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36284n(r4)
            java.util.List r1 = r1.mo43806l()
            com.google.i18n.phonenumbers.Phonemetadata$NumberFormat r1 = r0.mo43753a(r2, r1)
            if (r1 != 0) goto L_0x0154
            goto L_0x0244
        L_0x0154:
            java.lang.String r2 = r1.mo43775f()
            java.lang.String r8 = "$1"
            int r9 = r2.indexOf(r8)
            if (r9 > 0) goto L_0x0162
            goto L_0x0244
        L_0x0162:
            java.lang.String r2 = r2.substring(r7, r9)
            java.lang.String r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36288y(r2)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0172
            goto L_0x0244
        L_0x0172:
            com.google.i18n.phonenumbers.Phonemetadata$NumberFormat$Builder r2 = new com.google.i18n.phonenumbers.Phonemetadata$NumberFormat$Builder
            r2.<init>()
            r2.mo43791s(r1)
            r2.mo43771b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            r1.add(r2)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            int r5 = r4.mo43838b()
            java.lang.String r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36284n(r4)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> r7 = r0.f36745b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r7 = r7.containsKey(r9)
            if (r7 != 0) goto L_0x019e
            r5 = r6
            goto L_0x0244
        L_0x019e:
            java.lang.String r7 = r0.mo43764q(r5)
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r7 = r0.mo43762m(r5, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 20
            r9.<init>(r10)
            com.google.i18n.phonenumbers.Phonemetadata$NumberFormat r1 = r0.mo43753a(r6, r1)
            if (r1 != 0) goto L_0x01b7
            r9.append(r6)
            goto L_0x01ed
        L_0x01b7:
            com.google.i18n.phonenumbers.Phonemetadata$NumberFormat$Builder r10 = new com.google.i18n.phonenumbers.Phonemetadata$NumberFormat$Builder
            r10.<init>()
            r10.mo43791s(r1)
            java.lang.String r1 = r1.mo43775f()
            int r11 = r1.length()
            if (r11 <= 0) goto L_0x01e6
            java.lang.String r11 = r7.mo43803i()
            int r12 = r11.length()
            if (r12 <= 0) goto L_0x01e3
            java.lang.String r12 = "$NP"
            java.lang.String r1 = r1.replace(r12, r11)
            java.lang.String r11 = "$FG"
            java.lang.String r1 = r1.replace(r11, r8)
            r10.mo43786p(r1)
            goto L_0x01e6
        L_0x01e3:
            r10.mo43771b()
        L_0x01e6:
            java.lang.String r0 = r0.mo43757g(r6, r10, r2)
            r9.append(r0)
        L_0x01ed:
            com.google.i18n.phonenumbers.PhoneNumberUtil.m36286u(r4, r7, r2, r9)
            com.google.i18n.phonenumbers.PhoneNumberUtil.m36279B(r5, r2, r9)
            java.lang.String r0 = r9.toString()
            goto L_0x02d3
        L_0x01f9:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL
            java.lang.String r0 = r0.mo43755e(r4, r1)
            java.lang.String r0 = r0.substring(r6)
            goto L_0x02d3
        L_0x0205:
            boolean r2 = r0.mo43767t(r1)
            if (r2 != 0) goto L_0x0230
            java.util.logging.Logger r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.f36725h
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Trying to format number from invalid region "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = ". International formatting applied."
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r2.log(r5, r1)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL
            java.lang.String r0 = r0.mo43755e(r4, r1)
            goto L_0x02d3
        L_0x0230:
            int r2 = r4.mo43838b()
            java.lang.String r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36284n(r4)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> r8 = r0.f36745b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            boolean r8 = r8.containsKey(r10)
            if (r8 != 0) goto L_0x0247
        L_0x0244:
            r0 = r5
            goto L_0x02d3
        L_0x0247:
            java.lang.String r8 = " "
            if (r2 != r6) goto L_0x026c
            java.util.HashSet r6 = r0.f36747d
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x0279
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r8)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            java.lang.String r0 = r0.mo43755e(r4, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x02d3
        L_0x026c:
            int r6 = r0.mo43759i(r1)
            if (r2 != r6) goto L_0x0279
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            java.lang.String r0 = r0.mo43755e(r4, r1)
            goto L_0x02d3
        L_0x0279:
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r1 = r0.mo43761l(r1)
            java.lang.String r6 = r1.mo43798d()
            boolean r10 = r1.mo43792A()
            if (r10 == 0) goto L_0x028c
            java.lang.String r9 = r1.mo43810p()
            goto L_0x0299
        L_0x028c:
            java.util.regex.Pattern r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.f36731n
            java.util.regex.Matcher r1 = r1.matcher(r6)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x0299
            r9 = r6
        L_0x0299:
            java.lang.String r1 = r0.mo43764q(r2)
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata r1 = r0.mo43762m(r2, r1)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL
            java.lang.String r0 = r0.mo43756f(r5, r1, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            com.google.i18n.phonenumbers.PhoneNumberUtil.m36286u(r4, r1, r6, r5)
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x02c5
            java.lang.StringBuilder r0 = r5.insert(r7, r8)
            java.lang.StringBuilder r0 = r0.insert(r7, r2)
            java.lang.StringBuilder r0 = r0.insert(r7, r8)
            r0.insert(r7, r9)
            goto L_0x02c8
        L_0x02c5:
            com.google.i18n.phonenumbers.PhoneNumberUtil.m36279B(r2, r6, r5)
        L_0x02c8:
            java.lang.String r0 = r5.toString()
            goto L_0x02d3
        L_0x02cd:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL
            java.lang.String r0 = r0.mo43755e(r4, r1)
        L_0x02d3:
            java.lang.String r2 = r4.mo43844g()
            if (r0 == 0) goto L_0x006b
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x006b
            java.util.Map<java.lang.Character, java.lang.Character> r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.f36727j
            java.lang.String r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36289z(r0, r1)
            java.lang.String r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.m36289z(r2, r1)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x006b
        L_0x02ef:
            r0 = 2131363770(0x7f0a07ba, float:1.8347358E38)
            android.view.View r0 = r13.findViewById(r0)
            com.moovit.design.view.list.ListItemView r0 = (com.moovit.design.view.list.ListItemView) r0
            boolean r1 = p977zz.C20964s0.m49090h(r2)
            if (r1 == 0) goto L_0x02ff
            goto L_0x0300
        L_0x02ff:
            r3 = r2
        L_0x0300:
            r0.setTitle((java.lang.CharSequence) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.registration.RideSharingProfileActivity.mo45773y2():void");
    }
}
