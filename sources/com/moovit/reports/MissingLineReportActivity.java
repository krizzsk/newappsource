package com.moovit.reports;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import c70.C13749c;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.MoovitActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.tranzmate.moovit.protocol.Reports4_0.MVCreateReportRequest;
import com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData;
import com.tranzmate.moovit.protocol.common.MVEntityIdentifier;
import com.tranzmate.moovit.protocol.common.MVEntityType;
import com.tranzmate.moovit.protocol.common.MVUserReportCategoryType;
import com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import ga0.C12704f;
import i00.C17522a;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p453dw.C16740o;
import p824tp.C19731i;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p858uz.C20061g;
import p977zz.C20964s0;
import w40.C25764f;

public final class MissingLineReportActivity extends MoovitActivity implements C12704f.C12706b {

    /* renamed from: m0 */
    public static final /* synthetic */ int f42892m0 = 0;

    /* renamed from: U */
    public TextInputLayout f42893U;

    /* renamed from: X */
    public EditText f42894X;

    /* renamed from: Y */
    public EditText f42895Y;

    /* renamed from: Z */
    public EditText f42896Z;

    /* renamed from: l0 */
    public Button f42897l0;

    /* renamed from: com.moovit.reports.MissingLineReportActivity$a */
    public class C16415a extends C17522a {
        public C16415a() {
        }

        public final void afterTextChanged(Editable editable) {
            MissingLineReportActivity.m41815y2(MissingLineReportActivity.this);
        }
    }

    /* renamed from: com.moovit.reports.MissingLineReportActivity$b */
    public class C16416b extends C17522a {
        public C16416b() {
        }

        public final void afterTextChanged(Editable editable) {
            MissingLineReportActivity.m41815y2(MissingLineReportActivity.this);
        }
    }

    /* renamed from: com.moovit.reports.MissingLineReportActivity$c */
    public class C16417c extends C17522a {
        public C16417c() {
        }

        public final void afterTextChanged(Editable editable) {
            MissingLineReportActivity.this.f42893U.setError("");
        }
    }

    /* renamed from: com.moovit.reports.MissingLineReportActivity$d */
    public static class C16418d extends C13712f {

        /* renamed from: c */
        public final String f42901c;

        /* renamed from: d */
        public final String f42902d;

        /* renamed from: e */
        public final String f42903e;

        /* renamed from: f */
        public final LatLonE6 f42904f;

        public C16418d(Context context, String str, String str2, String str3, LatLonE6 latLonE6) {
            super(context);
            C21100e.m49373x(str, "lineNumber");
            this.f42901c = str;
            C21100e.m49373x(str2, "additionalInfo");
            this.f42902d = str2;
            this.f42903e = str3;
            this.f42904f = latLonE6;
        }

        /* renamed from: a */
        public final TBase mo21426a() {
            MVEntityIdentifier mVEntityIdentifier = new MVEntityIdentifier(MVEntityType.Line, 0);
            MVReportCreationData mVReportCreationData = new MVReportCreationData();
            mVReportCreationData.text = this.f42902d;
            mVReportCreationData.categoryUnionType = MVUserReportCategoryType.m19934o(MVUserReportLineCategoryType.MissingLine);
            mVReportCreationData.creationTime = System.currentTimeMillis();
            mVReportCreationData.mo25305m();
            mVReportCreationData.email = this.f42903e;
            mVReportCreationData.extra = this.f42901c;
            MVCreateReportRequest mVCreateReportRequest = new MVCreateReportRequest(mVEntityIdentifier, mVReportCreationData, C13749c.m34332r(this.f42904f));
            MVServerMessage mVServerMessage = new MVServerMessage();
            mVServerMessage.setField_ = MVServerMessage._Fields.USER_REPORT_CREATE_REQUEST;
            mVServerMessage.value_ = mVCreateReportRequest;
            return mVServerMessage;
        }
    }

    /* renamed from: y2 */
    public static void m41815y2(MissingLineReportActivity missingLineReportActivity) {
        boolean z;
        boolean z2;
        Editable text = missingLineReportActivity.f42895Y.getText();
        boolean z3 = false;
        if (text == null || C20964s0.m49090h(text.toString().trim())) {
            z = false;
        } else {
            z = true;
        }
        Editable text2 = missingLineReportActivity.f42896Z.getText();
        if (text2 == null || C20964s0.m49090h(text2.toString().trim())) {
            z2 = false;
        } else {
            z2 = true;
        }
        Button button = missingLineReportActivity.f42897l0;
        if (z && z2) {
            z3 = true;
        }
        button.setEnabled(z3);
    }

    /* renamed from: K */
    public final void mo39497K() {
        finish();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.missing_line_report_activity);
        String stringExtra = getIntent().getStringExtra("lineName");
        EditText editText = (EditText) findViewById(C19740r.missingLine);
        this.f42895Y = editText;
        editText.setText(stringExtra);
        this.f42895Y.addTextChangedListener(new C16415a());
        EditText editText2 = (EditText) findViewById(C19740r.additionalInfo);
        this.f42896Z = editText2;
        editText2.addTextChangedListener(new C16416b());
        this.f42893U = (TextInputLayout) findViewById(C19740r.email_container);
        EditText editText3 = (EditText) findViewById(C19740r.email);
        this.f42894X = editText3;
        editText3.addTextChangedListener(new C16417c());
        this.f42894X.setOnEditorActionListener(new C25764f(this, 2));
        Button button = (Button) findViewById(C19740r.submitButton);
        this.f42897l0 = button;
        button.setOnClickListener(new C16740o(this, 21));
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: z2 */
    public final void mo49150z2() {
        String str;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String str2 = C12704f.f31376m;
        if (supportFragmentManager.mo3923A(str2) == null) {
            Editable text = this.f42894X.getText();
            boolean h = C20964s0.m49090h(text);
            boolean k = C20964s0.m49093k(text);
            if (h || k) {
                C12704f.m32465S1(C19746x.reports_thank_you, true).show(getSupportFragmentManager(), str2);
                String obj = this.f42895Y.getText().toString();
                String obj2 = this.f42896Z.getText().toString();
                if (C20964s0.m49090h(this.f42894X.getText())) {
                    str = null;
                } else {
                    str = this.f42894X.getText().toString();
                }
                C19731i.m47197a(this).f50172b.mo42913b(new C16418d(this, obj, obj2, str, LatLonE6.m40177j(mo44542u1())), true);
                return;
            }
            this.f42893U.setError(getString(C19746x.email_error));
        }
    }
}
