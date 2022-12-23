package p528gz;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import com.appboy.models.IInAppMessage;
import com.appboy.models.cards.Card;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import p260t6.C6599e;
import p260t6.C6602g;
import p583jk.C17884p;
import r10.C19220d;

/* renamed from: gz.a */
public final class C17266a implements IBrazeImageLoader {

    /* renamed from: a */
    public C6602g f44632a = new C6602g();

    /* renamed from: a */
    public final Bitmap mo49810a(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            return (Bitmap) ((C6599e) ((C19220d) C17884p.m44353X(context).mo10870l().mo10857a(this.f44632a).mo10859b0(str)).mo10862d0()).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage iInAppMessage, String str, BrazeViewBounds brazeViewBounds) {
        return mo49810a(context, str);
    }

    public final Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String str, BrazeViewBounds brazeViewBounds) {
        return mo49810a(context, str);
    }

    public final void renderUrlIntoCardView(Context context, Card card, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        C17884p.m44353X(context).mo10880p(str).mo10857a(this.f44632a).mo10850T(imageView);
    }

    public final void renderUrlIntoInAppMessageView(Context context, IInAppMessage iInAppMessage, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        C17884p.m44353X(context).mo10880p(str).mo10857a(this.f44632a).mo10850T(imageView);
    }

    public final void setOffline(boolean z) {
        this.f44632a = (C6602g) this.f44632a.mo22732q(z);
    }
}
