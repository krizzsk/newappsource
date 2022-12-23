package com.moovit.app.share.proxy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.tranzmate.R;
import java.util.List;
import p375aw.C13538a;
import p435de.C16596f;

public class SharedEntityProxyActivity extends MoovitAppActivity {
    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        mo45858y2(intent);
        setIntent(intent);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.share_entity_proxy_activity);
        mo45858y2(getIntent());
    }

    /* renamed from: y2 */
    public final void mo45858y2(Intent intent) {
        String str;
        C21100e.m49373x(intent, "sharedEntityIntent");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar = new C0909a(supportFragmentManager);
        Uri data = intent.getData();
        int i = C13538a.f33464n;
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("SharedItinerary: ");
        k.append(data.toString());
        a.mo49363b(k.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", data);
        if (data.getHost().equals("i")) {
            str = "i";
        } else {
            List<String> pathSegments = data.getPathSegments();
            int size = pathSegments.size();
            if (size >= 2) {
                str = pathSegments.get(size - 2);
            } else {
                throw new IllegalArgumentException("Received a shared entity uri with less than 2 segments, uri: " + data);
            }
        }
        str.getClass();
        if (str.equals("i")) {
            SharedEntityProxyItineraryFragment sharedEntityProxyItineraryFragment = new SharedEntityProxyItineraryFragment();
            sharedEntityProxyItineraryFragment.setArguments(bundle);
            aVar.mo4111f(R.id.fragment_container, sharedEntityProxyItineraryFragment, "SharedEntityProxyFragmentTag");
            aVar.mo4040d();
            return;
        }
        throw new ApplicationBugException(C25541a.m63881k("Received a shared entity with unrecognized type: ", str));
    }
}
