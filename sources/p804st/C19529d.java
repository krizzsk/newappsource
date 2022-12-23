package p804st;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;

/* renamed from: st.d */
public final class C19529d extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C19526b f49633b;

    public C19529d(C19526b bVar) {
        this.f49633b = bVar;
    }

    public final void onClick(View view) {
        this.f49633b.startActivity(WebViewActivity.m18168y2(view.getContext(), this.f49633b.getString(R.string.privacy_url), this.f49633b.getString(R.string.privacy_text)));
    }
}
