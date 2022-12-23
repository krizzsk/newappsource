package com.moovit.app.help.feedback;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import c00.C13723g;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p073e7.C4584b;
import p377ay.C13547a;
import p377ay.C13550c;
import p527gy.C17259d;
import p543hq.C17474b;
import p899ws.C20401a;
import p899ws.C20403c;
import p899ws.C20404d;
import p899ws.C20405e;
import p970zs.C20889c;
import p977zz.C20944i0;
import p977zz.C20964s0;
import zendesk.core.AnonymousIdentity;
import zendesk.core.Identity;
import zendesk.core.Zendesk;

public class FeedbackFormActivity extends MoovitAppActivity {

    /* renamed from: u0 */
    public static final /* synthetic */ int f38102u0 = 0;

    /* renamed from: U */
    public CategoryType f38103U;

    /* renamed from: X */
    public FeedbackType f38104X;

    /* renamed from: Y */
    public String f38105Y;

    /* renamed from: Z */
    public ListItemView f38106Z;

    /* renamed from: l0 */
    public TextInputLayout f38107l0;

    /* renamed from: m0 */
    public EditText f38108m0;

    /* renamed from: n0 */
    public TextInputLayout f38109n0;

    /* renamed from: o0 */
    public EditText f38110o0;

    /* renamed from: p0 */
    public TextInputLayout f38111p0;

    /* renamed from: q0 */
    public EditText f38112q0;

    /* renamed from: r0 */
    public TextInputLayout f38113r0;

    /* renamed from: s0 */
    public EditText f38114s0;

    /* renamed from: t0 */
    public Button f38115t0;

    /* renamed from: y2 */
    public static Intent m37597y2(Context context, String str) {
        Intent intent = new Intent(context, FeedbackFormActivity.class);
        C21100e.m49371w(str);
        intent.putExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        intent.putExtra("categoryType", (Parcelable) null);
        intent.putExtra("feedbackType", (Parcelable) null);
        return intent;
    }

    /* renamed from: z2 */
    public static String m37598z2(Intent intent) {
        String stringExtra = intent.getStringExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        if (!C20964s0.m49090h(stringExtra)) {
            return stringExtra;
        }
        Uri data = intent.getData();
        if (data != null) {
            stringExtra = data.getQueryParameter("o");
        }
        if (C20964s0.m49090h(stringExtra)) {
            return "";
        }
        return stringExtra;
    }

    /* renamed from: A2 */
    public final void mo45046A2(CategoryType categoryType, FeedbackType feedbackType) {
        String str;
        if (categoryType != null && feedbackType != null && categoryType.isSupported() && categoryType.getFeedbackTypes().contains(feedbackType)) {
            this.f38103U = categoryType;
            this.f38104X = feedbackType;
            int descriptionHelperResId = feedbackType.getDescriptionHelperResId();
            TextInputLayout textInputLayout = this.f38113r0;
            if (descriptionHelperResId != 0) {
                str = getString(descriptionHelperResId);
            } else {
                str = null;
            }
            textInputLayout.setHelperText(str);
            mo45047B2();
        }
    }

    /* renamed from: B2 */
    public final void mo45047B2() {
        boolean z;
        Button button = this.f38115t0;
        if (C20964s0.m49092j(this.f38108m0.getText()) || C20964s0.m49092j(this.f38110o0.getText()) || C20964s0.m49092j(this.f38114s0.getText())) {
            z = false;
        } else {
            z = true;
        }
        button.setEnabled(z);
    }

    /* renamed from: C2 */
    public final void mo45048C2(boolean z) {
        if (z) {
            findViewById(R.id.progress_bar).setVisibility(0);
            this.f38115t0.setText((CharSequence) null);
            this.f38115t0.setClickable(false);
            return;
        }
        findViewById(R.id.progress_bar).setVisibility(4);
        this.f38115t0.setText(R.string.action_submit);
        this.f38115t0.setClickable(true);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        CategoryType categoryType;
        FeedbackType feedbackType;
        C13547a aVar;
        String str;
        Object obj;
        boolean z;
        String str2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.feedback_form_activity);
        ListItemView listItemView = (ListItemView) findViewById(R.id.feedback_type);
        this.f38106Z = listItemView;
        listItemView.setOnClickListener(new C4584b(this, 8));
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.name_input_layout);
        this.f38107l0 = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f38108m0 = editText;
        editText.addTextChangedListener(new C20403c(this));
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.subject_input_layout);
        this.f38111p0 = textInputLayout2;
        this.f38112q0 = textInputLayout2.getEditText();
        TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(R.id.email_input_layout);
        this.f38109n0 = textInputLayout3;
        EditText editText2 = textInputLayout3.getEditText();
        this.f38110o0 = editText2;
        editText2.addTextChangedListener(new C20404d(this));
        TextInputLayout textInputLayout4 = (TextInputLayout) findViewById(R.id.feedback_input_layout);
        this.f38113r0 = textInputLayout4;
        EditText editText3 = textInputLayout4.getEditText();
        this.f38114s0 = editText3;
        editText3.addTextChangedListener(new C20405e(this));
        Button button = (Button) findViewById(R.id.submit_feedback_button);
        this.f38115t0 = button;
        button.setOnClickListener(new C4051q(this, 9));
        Intent intent = getIntent();
        this.f38105Y = m37598z2(intent);
        boolean z2 = false;
        C20944i0 i0Var = null;
        if (bundle != null) {
            categoryType = (CategoryType) bundle.getParcelable("selectedCategoryType");
        } else {
            categoryType = (CategoryType) intent.getParcelableExtra("categoryType");
            if (categoryType == null) {
                Uri data = intent.getData();
                if (data != null) {
                    str2 = data.getQueryParameter("ctag");
                } else {
                    str2 = intent.getStringExtra("ctag");
                }
                if (str2 != null) {
                    categoryType = (CategoryType) C13723g.m34286g(Arrays.asList(CategoryType.values()), new C20401a(str2, 0));
                } else {
                    categoryType = null;
                }
            }
        }
        if (bundle != null) {
            feedbackType = (FeedbackType) bundle.getParcelable("selectedFeedbackType");
        } else {
            feedbackType = (FeedbackType) intent.getParcelableExtra("feedbackType");
            if (feedbackType == null) {
                Uri data2 = intent.getData();
                if (data2 != null) {
                    str = data2.getQueryParameter("ftag");
                } else {
                    str = intent.getStringExtra("ftag");
                }
                if (str == null || categoryType == null) {
                    feedbackType = null;
                } else {
                    List asList = Arrays.asList(FeedbackType.values());
                    if (asList != null) {
                        Iterator it = asList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            obj = it.next();
                            FeedbackType feedbackType2 = (FeedbackType) obj;
                            if (!feedbackType2.getFeedbackTypeTag().equals(str) || !categoryType.getFeedbackTypes().contains(feedbackType2)) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                    }
                    obj = null;
                    feedbackType = (FeedbackType) obj;
                }
            }
        }
        mo45046A2(categoryType, feedbackType);
        if (C20889c.m48882c(this)) {
            Identity identity = Zendesk.INSTANCE.getIdentity();
            if (identity instanceof AnonymousIdentity) {
                AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
                String name = anonymousIdentity.getName();
                String email = anonymousIdentity.getEmail();
                if (!(name == null || email == null)) {
                    i0Var = new C20944i0(name, email);
                }
            }
        }
        if (i0Var != null) {
            this.f38108m0.setText((CharSequence) i0Var.f52692a);
            this.f38110o0.setText((CharSequence) i0Var.f52693b);
            return;
        }
        UserAccountManager userAccountManager = (UserAccountManager) mo44537r1("USER_ACCOUNT");
        C17259d e = userAccountManager.mo46575f().mo49805e();
        C13550c cVar = userAccountManager.f40567b;
        synchronized (cVar) {
            aVar = cVar.f33494b;
        }
        if (aVar.f33490a != null) {
            z2 = true;
        }
        if (z2) {
            this.f38108m0.setText(e.mo49804a());
            this.f38110o0.setText(e.f44606e);
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        this.f38106Z.setSubtitleThemeTextColor(R.attr.colorOnSurface);
        FeedbackType feedbackType = this.f38104X;
        if (feedbackType != null) {
            this.f38106Z.setSubtitle(feedbackType.getNameResId());
            return;
        }
        CategoryType categoryType = this.f38103U;
        if (categoryType != null) {
            this.f38106Z.setSubtitle(categoryType.getNameResId());
        } else {
            this.f38106Z.setSubtitle((CharSequence) null);
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("selectedCategoryType", this.f38103U);
        bundle.putParcelable("selectedFeedbackType", this.f38104X);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String z2 = m37598z2(getIntent());
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49939g(AnalyticsAttributeKey.ORIGIN, z2);
        return m1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            mo45046A2((CategoryType) intent.getParcelableExtra("category_type"), (FeedbackType) intent.getParcelableExtra("feedback_type"));
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("USER_ACCOUNT");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        return s1;
    }
}
