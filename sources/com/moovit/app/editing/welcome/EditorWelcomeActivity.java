package com.moovit.app.editing.welcome;

import android.os.Bundle;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import p425cs.C16480e;
import p473es.C16868a;
import p543hq.C17474b;

public class EditorWelcomeActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f38007X = 0;

    /* renamed from: U */
    public final C14873a f38008U = new C14873a();

    /* renamed from: com.moovit.app.editing.welcome.EditorWelcomeActivity$a */
    public class C14873a implements View.OnClickListener {
        public C14873a() {
        }

        public final void onClick(View view) {
            EditorWelcomeActivity editorWelcomeActivity = EditorWelcomeActivity.this;
            int i = EditorWelcomeActivity.f38007X;
            editorWelcomeActivity.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
            editorWelcomeActivity.mo44545v2(aVar.mo49933a());
            editorWelcomeActivity.mo44543u2((CharSequence) null);
            editorWelcomeActivity.mo44528l2("mark_as_editor", new C16480e(editorWelcomeActivity.mo44548x1()), new C16868a(editorWelcomeActivity));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.editor_welcome_activity);
        ((AlertMessageView) findViewById(R.id.welcome)).setPositiveButtonClickListener(this.f38008U);
    }
}
