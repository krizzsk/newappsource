package com.usebutton.sdk.internal.purchasepath;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ImageLoader;
import com.usebutton.sdk.internal.InternalCallToAction;
import com.usebutton.sdk.internal.models.InternalInstallCard;
import com.usebutton.sdk.internal.models.Text;
import com.usebutton.sdk.internal.views.ColorButton;
import com.usebutton.sdk.purchasepath.Card;

public class AppInstallCard extends Card {
    private final Uri appIconUrl;
    private final Text body;
    private final ImageLoader imageLoader;
    /* access modifiers changed from: private */
    public final Listener listener;
    private final Text primaryActionText;
    private final int primaryColor;
    private final Text secondaryActionText;
    private final Text title;

    public interface Listener {
        void onAcceptClicked(String str);

        void onDeclineClicked(String str);
    }

    public AppInstallCard(InternalInstallCard internalInstallCard, ImageLoader imageLoader2, Listener listener2) {
        this(createInternalCallToAction(internalInstallCard), internalInstallCard, imageLoader2, listener2);
    }

    private static InternalCallToAction createInternalCallToAction(InternalInstallCard internalInstallCard) {
        return new InternalCallToAction(internalInstallCard.getCtaIcon(), internalInstallCard.getCtaText().getCopy(), internalInstallCard.getCtaText().getColor());
    }

    public void onBindView(View view) {
        ColorButton colorButton = (ColorButton) view.findViewById(C12238R.C12240id.install_card_primary_action);
        Button button = (Button) view.findViewById(C12238R.C12240id.install_card_secondary_action);
        Text.applyTo((TextView) view.findViewById(C12238R.C12240id.install_card_title), this.title);
        Text.applyTo((TextView) view.findViewById(C12238R.C12240id.install_card_body), this.body);
        Text.applyTo(colorButton, this.primaryActionText);
        Text.applyTo(button, this.secondaryActionText);
        colorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AppInstallCard.this.listener.onAcceptClicked(String.valueOf(AppInstallCard.this.getKey()));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AppInstallCard.this.listener.onDeclineClicked(String.valueOf(AppInstallCard.this.getKey()));
            }
        });
        this.imageLoader.load(this.appIconUrl, (ImageView) view.findViewById(C12238R.C12240id.install_card_app_icon));
        colorButton.setColor(this.primaryColor);
    }

    public View onCreateView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(C12238R.layout.btn_view_app_install_card, viewGroup, false);
    }

    private AppInstallCard(InternalCallToAction internalCallToAction, InternalInstallCard internalInstallCard, ImageLoader imageLoader2, Listener listener2) {
        super(internalCallToAction);
        this.primaryColor = internalInstallCard.getPrimaryColor();
        this.appIconUrl = internalInstallCard.getAppIcon();
        this.title = internalInstallCard.getTitle();
        this.body = internalInstallCard.getBody();
        this.primaryActionText = internalInstallCard.getPrimaryAction();
        this.secondaryActionText = internalInstallCard.getSecondaryAction();
        this.imageLoader = imageLoader2;
        this.listener = listener2;
    }
}
