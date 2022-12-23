package p780rt;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.app.intro.getstarted.FirstTimeUseLogoActivity;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;

/* renamed from: rt.b */
public final class C19327b extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ FirstTimeUseLogoActivity f49181b;

    public C19327b(FirstTimeUseLogoActivity firstTimeUseLogoActivity) {
        this.f49181b = firstTimeUseLogoActivity;
    }

    public final void onClick(View view) {
        FirstTimeUseLogoActivity firstTimeUseLogoActivity = this.f49181b;
        firstTimeUseLogoActivity.startActivity(WebViewActivity.m18168y2(firstTimeUseLogoActivity, firstTimeUseLogoActivity.getString(R.string.privacy_url), this.f49181b.getString(R.string.privacy_text)));
    }
}
