package p597jy;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.useraccount.profile.C15634a;
import com.moovit.app.useraccount.profile.EditProfileActivity;
import p543hq.C17474b;

/* renamed from: jy.b */
public final class C17980b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ EditProfileActivity f46065b;

    public C17980b(EditProfileActivity editProfileActivity) {
        this.f46065b = editProfileActivity;
    }

    public final void onClick(View view) {
        EditProfileActivity editProfileActivity = this.f46065b;
        int i = EditProfileActivity.f40629m0;
        editProfileActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "logout_clicked");
        editProfileActivity.mo44545v2(aVar.mo49933a());
        if (editProfileActivity.f40632Y == null) {
            Uri uri = editProfileActivity.f40634l0.mo49805e().f44605d;
            C15634a aVar2 = new C15634a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("profile_image_uri_extra", uri);
            aVar2.setArguments(bundle);
            editProfileActivity.f40632Y = aVar2;
            aVar2.show(editProfileActivity.getSupportFragmentManager(), "disconnectDialogTag");
        }
    }
}
