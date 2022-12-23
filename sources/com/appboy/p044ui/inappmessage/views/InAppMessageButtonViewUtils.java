package com.appboy.p044ui.inappmessage.views;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import com.appboy.models.MessageButton;
import com.appboy.p044ui.R$dimen;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.R$id;
import java.util.List;

/* renamed from: com.appboy.ui.inappmessage.views.InAppMessageButtonViewUtils */
public class InAppMessageButtonViewUtils {
    private static Drawable getButtonDrawable(Context context, MessageButton messageButton, int i, int i2, boolean z) {
        Drawable drawable = getDrawable(context, R$drawable.com_appboy_inappmessage_button_background);
        drawable.mutate();
        GradientDrawable gradientDrawable = (GradientDrawable) ((RippleDrawable) drawable).findDrawableByLayerId(R$id.f6844x9c3e42e5);
        if (z) {
            i = i2;
        }
        gradientDrawable.setStroke(i, messageButton.getBorderColor());
        gradientDrawable.setColor(messageButton.getBackgroundColor());
        return drawable;
    }

    private static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i);
    }

    private static void setButton(Button button, MessageButton messageButton, int i, int i2) {
        button.setText(messageButton.getText());
        button.setContentDescription(messageButton.getText());
        InAppMessageViewUtils.setTextViewColor(button, messageButton.getTextColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator((StateListAnimator) null);
        Drawable buttonDrawable = getButtonDrawable(button.getContext(), messageButton, i, i2, false);
        Drawable buttonDrawable2 = getButtonDrawable(button.getContext(), messageButton, i, i2, true);
        stateListDrawable.addState(new int[]{16842908}, buttonDrawable2);
        stateListDrawable.addState(new int[]{16842910}, buttonDrawable);
        button.setBackground(stateListDrawable);
    }

    public static void setButtons(List<View> list, List<MessageButton> list2) {
        for (int i = 0; i < list.size(); i++) {
            View view = list.get(i);
            MessageButton messageButton = list2.get(i);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_appboy_in_app_message_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R$dimen.com_appboy_in_app_message_button_border_stroke_focused);
            if (list2.size() <= i) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                setButton((Button) view, messageButton, dimensionPixelSize, dimensionPixelSize2);
            }
        }
    }
}
