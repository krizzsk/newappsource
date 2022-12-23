package p828tt;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ce0.C21100e;
import com.moovit.app.intro.onboarding.OnboardingPage;
import com.moovit.commons.view.TextureVideoHelper;
import com.tranzmate.R;
import java.util.Collections;
import java.util.List;
import n00.C18491a;
import p242s1.C6333d0;
import p583jk.C17884p;

/* renamed from: tt.d */
public final class C19763d extends C18491a<View> {

    /* renamed from: b */
    public final List<OnboardingPage> f50248b;

    public C19763d(List<OnboardingPage> list) {
        C21100e.m49373x(list, "pages");
        this.f50248b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public final void mo23842a(int i, View view) {
        OnboardingPage onboardingPage = this.f50248b.get(i);
        TextureView textureView = (TextureView) view.findViewById(R.id.video);
        textureView.setVisibility(8);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        imageView.setVisibility(8);
        if (onboardingPage.f38469b != -1) {
            TextureVideoHelper textureVideoHelper = new TextureVideoHelper(view.getContext(), C17884p.m44351V(view.getContext().getResources(), onboardingPage.f38469b), false);
            textureView.setTag(textureVideoHelper);
            textureView.setSurfaceTextureListener(textureVideoHelper);
            textureView.setVisibility(0);
        } else {
            int i2 = onboardingPage.f38470c;
            if (i2 != -1) {
                imageView.setImageResource(i2);
                imageView.setVisibility(0);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(onboardingPage.f38471d);
        C6333d0.m15030r(textView, true);
        ((TextView) view.findViewById(R.id.subtitle)).setText(onboardingPage.f38472e);
    }

    /* renamed from: b */
    public final View mo45295b(ViewGroup viewGroup, int i) {
        return C13715c.m34239e(viewGroup, R.layout.onboarding_page_view, viewGroup, false);
    }

    public final void finishUpdate(ViewGroup viewGroup) {
        TextureVideoHelper textureVideoHelper;
        super.finishUpdate(viewGroup);
        View view = (View) this.f47096a.get(0);
        if (view != null && (textureVideoHelper = (TextureVideoHelper) view.findViewById(R.id.video).getTag()) != null) {
            textureVideoHelper.mo47172a();
        }
    }

    public final int getCount() {
        return this.f50248b.size();
    }
}
