package p828tt;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0207b;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.C15682c;
import com.moovit.app.intro.onboarding.UserOnboardingActivity;
import com.tranzmate.R;
import p054d0.C4267a0;
import p065e.C4413c;
import p073e7.C4585c;
import p304x.C7070l;

/* renamed from: tt.h */
public class C19767h extends C15682c<UserOnboardingActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f50254p = 0;

    /* renamed from: n */
    public final C0207b<Intent> f50255n = registerForActivityResult(new C4413c(), new C7070l(this, 6));

    /* renamed from: o */
    public final C0207b<Intent> f50256o = registerForActivityResult(new C4413c(), new C4267a0(this, 4));

    public C19767h() {
        super(UserOnboardingActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.onboarding_favorites_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo46799l2(R.id.favorite_widget_home).setOnClickListener(new C4585c(this, 13));
        mo46799l2(R.id.skip_button).setOnClickListener(new C4051q(this, 17));
    }
}
