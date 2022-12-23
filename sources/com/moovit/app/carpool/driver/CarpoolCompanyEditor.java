package com.moovit.app.carpool.driver;

import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.carpool.CarpoolCompany;
import com.tranzmate.R;
import i00.C17522a;
import java.util.HashSet;
import java.util.Set;
import p977zz.C20964s0;

public class CarpoolCompanyEditor extends MoovitAppActivity {

    /* renamed from: U */
    public final C14800a f37700U = new C14800a();

    /* renamed from: X */
    public final C14801b f37701X = new C14801b();

    /* renamed from: Y */
    public TextInputLayout f37702Y;

    /* renamed from: Z */
    public TextInputLayout f37703Z;

    /* renamed from: com.moovit.app.carpool.driver.CarpoolCompanyEditor$a */
    public class C14800a extends C17522a {
        public C14800a() {
        }

        public final void afterTextChanged(Editable editable) {
            CarpoolCompanyEditor.this.supportInvalidateOptionsMenu();
        }
    }

    /* renamed from: com.moovit.app.carpool.driver.CarpoolCompanyEditor$b */
    public class C14801b extends C17522a {
        public C14801b() {
        }

        public final void afterTextChanged(Editable editable) {
            if (C20964s0.m49093k(editable)) {
                CarpoolCompanyEditor.this.f37703Z.setError((CharSequence) null);
            }
            CarpoolCompanyEditor.this.supportInvalidateOptionsMenu();
        }
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.save_action, menu);
        return true;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_company_editor_activity);
        this.f37702Y = (TextInputLayout) findViewById(R.id.company_name);
        this.f37703Z = (TextInputLayout) findViewById(R.id.company_email);
        CarpoolCompany carpoolCompany = ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46575f().mo49805e().f44613l.f40609c;
        if (carpoolCompany != null) {
            this.f37702Y.getEditText().setText(carpoolCompany.f40868b);
            this.f37703Z.getEditText().setText(carpoolCompany.f40869c);
        }
        this.f37702Y.getEditText().addTextChangedListener(this.f37700U);
        this.f37703Z.getEditText().addTextChangedListener(this.f37701X);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cd, code lost:
        r0 = r22;
        r1 = p567iq.C17635b.m43779f(r0.f44619b).f50172b;
        r2 = r0.f44622e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d9, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3 = r2.f44629b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00dc, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dd, code lost:
        r1.mo42913b(new p527gy.C17255a(r0.f44619b, r3.f44613l.f40609c), true);
        setResult(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onOptionsItemSelected(android.view.MenuItem r25) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r25.getItemId()
            r2 = 2131364065(0x7f0a08e1, float:1.8347957E38)
            if (r0 != r2) goto L_0x0106
            com.google.android.material.textfield.TextInputLayout r0 = r1.f37702Y
            android.widget.EditText r0 = r0.getEditText()
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.google.android.material.textfield.TextInputLayout r2 = r1.f37703Z
            android.widget.EditText r2 = r2.getEditText()
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            com.google.android.material.textfield.TextInputLayout r3 = r1.f37703Z
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = "input_method"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            com.google.android.material.textfield.TextInputLayout r4 = r1.f37703Z
            android.os.IBinder r4 = r4.getWindowToken()
            r5 = 0
            r3.hideSoftInputFromWindow(r4, r5)
        L_0x003d:
            boolean r3 = p977zz.C20964s0.m49093k(r2)
            if (r3 != 0) goto L_0x0052
            com.google.android.material.textfield.TextInputLayout r0 = r1.f37703Z
            r2 = 2131887501(0x7f12058d, float:1.940961E38)
            java.lang.String r2 = r1.getString(r2)
            r0.setError(r2)
        L_0x004f:
            r0 = 1
            goto L_0x0105
        L_0x0052:
            java.lang.String r3 = "save_clicked"
            r1.mo44547w2(r3)
            com.moovit.carpool.CarpoolCompany r3 = new com.moovit.carpool.CarpoolCompany
            r3.<init>(r0, r2)
            java.lang.String r0 = "USER_ACCOUNT"
            java.lang.Object r0 = r1.mo44537r1(r0)
            com.moovit.app.useraccount.manager.UserAccountManager r0 = (com.moovit.app.useraccount.manager.UserAccountManager) r0
            gy.e r0 = r0.mo46575f()
            gy.d r0 = r0.mo49805e()
            com.moovit.app.useraccount.manager.profile.UserCarpoolData r0 = r0.f44613l
            com.moovit.carpool.CarpoolCompany r0 = r0.f40609c
            boolean r0 = p977zz.C20975x0.m49118e(r3, r0)
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "USER_ACCOUNT"
            java.lang.Object r0 = r1.mo44537r1(r0)
            com.moovit.app.useraccount.manager.UserAccountManager r0 = (com.moovit.app.useraccount.manager.UserAccountManager) r0
            gy.e r0 = r0.mo46575f()
            gy.g r2 = r0.f44622e
            monitor-enter(r2)
            gy.d r15 = new gy.d     // Catch:{ all -> 0x00fd }
            gy.d r5 = r2.f44629b     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = r5.f44602a     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = r5.f44603b     // Catch:{ all -> 0x00fd }
            java.lang.String r8 = r5.f44604c     // Catch:{ all -> 0x00fd }
            android.net.Uri r9 = r5.f44605d     // Catch:{ all -> 0x00fd }
            java.lang.String r10 = r5.f44606e     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r5.f44607f     // Catch:{ all -> 0x00fd }
            int r12 = r5.f44608g     // Catch:{ all -> 0x00fd }
            int r13 = r5.f44609h     // Catch:{ all -> 0x00fd }
            com.moovit.image.model.Image r14 = r5.f44610i     // Catch:{ all -> 0x00fd }
            com.moovit.network.model.ServerId r4 = r5.f44611j     // Catch:{ all -> 0x00fd }
            gy.b r5 = r5.f44612k     // Catch:{ all -> 0x00fd }
            com.moovit.app.useraccount.manager.profile.UserCarpoolData r1 = new com.moovit.app.useraccount.manager.profile.UserCarpoolData     // Catch:{ all -> 0x00f9 }
            r16 = r5
            gy.d r5 = r2.f44629b     // Catch:{ all -> 0x00f9 }
            r22 = r0
            com.moovit.app.useraccount.manager.profile.UserCarpoolData r0 = r5.f44613l     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.f40608b     // Catch:{ all -> 0x00f9 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x00f9 }
            com.moovit.app.useraccount.manager.profile.UserRideSharingData r0 = r5.f44614m     // Catch:{ all -> 0x00f9 }
            com.moovit.app.useraccount.manager.profile.UserTodData r3 = r5.f44615n     // Catch:{ all -> 0x00f9 }
            r19 = r3
            com.moovit.app.useraccount.manager.profile.UserWondoData r3 = r5.f44616o     // Catch:{ all -> 0x00f9 }
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r5 = r5.f44617p     // Catch:{ all -> 0x00f9 }
            r21 = r5
            r5 = r15
            r23 = r15
            r15 = r4
            r17 = r1
            r18 = r0
            r20 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00f9 }
            r0 = r23
            r2.mo49807b(r0)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r2)
            r0 = r22
            android.content.Context r1 = r0.f44619b
            iq.b r1 = p567iq.C17635b.m43779f(r1)
            com.google.android.play.core.assetpacks.z0 r1 = r1.f50172b
            gy.g r2 = r0.f44622e
            monitor-enter(r2)
            gy.d r3 = r2.f44629b     // Catch:{ all -> 0x00f3 }
            monitor-exit(r2)
            com.moovit.app.useraccount.manager.profile.UserCarpoolData r2 = r3.f44613l
            gy.a r3 = new gy.a
            android.content.Context r0 = r0.f44619b
            com.moovit.carpool.CarpoolCompany r2 = r2.f40609c
            r3.<init>(r0, r2)
            r0 = 1
            r1.mo42913b(r3, r0)
            r0 = -1
            r1 = r24
            r1.setResult(r0)
            goto L_0x0100
        L_0x00f3:
            r0 = move-exception
            r1 = r24
            r3 = r0
            monitor-exit(r2)
            throw r3
        L_0x00f9:
            r0 = move-exception
            r1 = r24
            goto L_0x00fe
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            monitor-exit(r2)
            throw r0
        L_0x0100:
            r24.finish()
            goto L_0x004f
        L_0x0105:
            return r0
        L_0x0106:
            boolean r0 = super.onOptionsItemSelected(r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.driver.CarpoolCompanyEditor.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        Editable editable;
        boolean z;
        TextInputLayout textInputLayout = this.f37702Y;
        Editable editable2 = null;
        if (textInputLayout != null) {
            editable = textInputLayout.getEditText().getText();
        } else {
            editable = null;
        }
        TextInputLayout textInputLayout2 = this.f37703Z;
        if (textInputLayout2 != null) {
            editable2 = textInputLayout2.getEditText().getText();
        }
        MenuItem findItem = menu.findItem(R.id.save);
        if (C20964s0.m49090h(editable) || C20964s0.m49090h(editable2)) {
            z = false;
        } else {
            z = true;
        }
        findItem.setEnabled(z);
        return true;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("CARPOOL_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }
}
