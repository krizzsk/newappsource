package com.moovit.app.mot.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.List;
import p146k6.C5515t;
import p169m6.C5710d;
import p583jk.C17884p;
import r10.C19220d;
import y10.C20690e;

public class MotActivationView extends FrameLayout {

    /* renamed from: b */
    public final List<ImageView> f39098b;

    /* renamed from: c */
    public final TextView f39099c;

    public MotActivationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo45633a(MotActivation motActivation, int i) {
        this.f39099c.setText(motActivation.mo45529f());
        Image c = motActivation.mo45525c();
        if (c != null) {
            C17884p.m44354Y(this.f39099c).mo51642v(c).mo51628o0(c).mo10848R(new C20690e(this.f39099c, UiUtils.Edge.LEFT));
        } else {
            C15780a.m40271d(this.f39099c, UiUtils.Edge.LEFT, (Drawable) null);
        }
        Image image = motActivation.f38991h;
        if (image == null) {
            image = new ResourceImage(R.drawable.img_bg_ticket_default, new String[0]);
        }
        int g = UiUtils.m40248g(getContext(), 8.0f);
        int i2 = 0;
        for (ImageView next : this.f39098b) {
            int i3 = i2 + 1;
            if (i2 >= i) {
                next.setVisibility(4);
            } else {
                next.setVisibility(0);
                ((C19220d) C17884p.m44354Y(next).mo51642v(image).mo10866g0(C5710d.m14021g()).mo22738w(R.drawable.img_bg_ticket_placeholder).mo51628o0(image).mo22717H(new C5515t(g), true)).mo10850T(next);
            }
            i2 = i3;
        }
    }

    public void setActivation(MotActivation motActivation) {
        mo45633a(motActivation, 1);
    }

    public MotActivationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setMinimumHeight(UiUtils.m40249h(context.getResources(), 206.0f));
        int h = UiUtils.m40249h(context.getResources(), 8.0f);
        setPadding(h, h, h, h);
        LayoutInflater.from(context).inflate(R.layout.mot_activation_view, this, true);
        this.f39098b = Arrays.asList(new ImageView[]{(ImageView) findViewById(R.id.confirmation_img_3), (ImageView) findViewById(R.id.confirmation_img_2), (ImageView) findViewById(R.id.confirmation_img_1)});
        this.f39099c = (TextView) findViewById(R.id.agency);
    }
}
