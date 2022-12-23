package com.moovit.app.wondo.tickets.fullscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.tranzmate.R;

public class WondoFullScreenView extends ConstraintLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f40690h = 0;

    /* renamed from: com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenView$a */
    public interface C15651a {
        /* renamed from: A0 */
        void mo46677A0(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo);

        /* renamed from: e */
        void mo46679e(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo);
    }

    public WondoFullScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WondoFullScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.wondo_full_screen_view, this, true);
    }
}
