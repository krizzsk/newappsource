package p501fw;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;

/* renamed from: fw.j */
public final class C17112j extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C17113k f44285b;

    public C17112j(C17113k kVar) {
        this.f44285b = kVar;
    }

    public final void onClick(View view) {
        C17113k kVar = this.f44285b;
        kVar.startActivity(WebViewActivity.m18168y2(kVar.requireActivity(), this.f44285b.getString(R.string.privacy_url), this.f44285b.getString(R.string.privacy_policy)));
    }
}
