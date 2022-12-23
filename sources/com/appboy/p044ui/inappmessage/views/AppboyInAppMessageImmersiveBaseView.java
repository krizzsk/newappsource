package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.models.MessageButton;
import com.appboy.p044ui.R$dimen;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.p044ui.inappmessage.IInAppMessageImmersiveView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.List;
import p304x.C7099r1;
import p316y.C7229u;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageImmersiveBaseView */
public abstract class AppboyInAppMessageImmersiveBaseView extends AppboyInAppMessageBaseView implements IInAppMessageImmersiveView {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageImmersiveBaseView.class);

    public AppboyInAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setLargerCloseButtonClickArea$1(View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.com_appboy_in_app_message_close_button_click_area_width);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R$dimen.com_appboy_in_app_message_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) view.getParent()).setTouchDelegate(new TouchDelegate(rect, view));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !AppboyInAppMessageManager.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract /* synthetic */ View getMessageCloseButtonView();

    public abstract TextView getMessageHeaderTextView();

    public abstract TextView getMessageTextView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !AppboyInAppMessageManager.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        if (StringUtils.isNullOrBlank(getMessageTextView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        if (StringUtils.isNullOrBlank(getMessageHeaderTextView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(Integer num) {
        InAppMessageViewUtils.setFrameColor(getFrameView(), num);
    }

    public void setLargerCloseButtonClickArea(View view) {
        if (view == null || view.getParent() == null) {
            AppboyLogger.m5459w(TAG, "Cannot increase click area for view if view and/or parent are null.");
        } else if (view.getParent() instanceof View) {
            ((View) view.getParent()).post(new C7229u(8, this, view));
        }
    }

    public void setMessageButtons(List<MessageButton> list) {
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(list.size()), list);
    }

    public void setMessageCloseButtonColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageCloseButtonView(), i);
    }

    public void setMessageHeaderText(String str) {
        getMessageHeaderTextView().setText(str);
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        InAppMessageViewUtils.setTextAlignment(getMessageHeaderTextView(), textAlign);
    }

    public void setMessageHeaderTextColor(int i) {
        InAppMessageViewUtils.setTextViewColor(getMessageHeaderTextView(), i);
    }

    public void setupDirectionalNavigation(int i) {
        List<View> messageButtonViews = getMessageButtonViews(i);
        View messageCloseButtonView = getMessageCloseButtonView();
        int id = messageCloseButtonView.getId();
        if (i == 0) {
            messageCloseButtonView.setNextFocusUpId(id);
            messageCloseButtonView.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusRightId(id);
            messageCloseButtonView.setNextFocusLeftId(id);
        } else if (i == 1) {
            View view = messageButtonViews.get(0);
            int id2 = view.getId();
            view.setNextFocusLeftId(id);
            view.setNextFocusRightId(id);
            view.setNextFocusUpId(id);
            view.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusUpId(id2);
            messageCloseButtonView.setNextFocusDownId(id2);
            messageCloseButtonView.setNextFocusRightId(id2);
            messageCloseButtonView.setNextFocusLeftId(id2);
            messageCloseButtonView = view;
            id = id2;
        } else if (i != 2) {
            String str = TAG;
            AppboyLogger.m5459w(str, "Cannot setup directional navigation. Got unsupported number of buttons: " + i);
        } else {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            int id3 = view2.getId();
            int id4 = view3.getId();
            view2.setNextFocusLeftId(id4);
            view2.setNextFocusRightId(id4);
            view2.setNextFocusUpId(id);
            view2.setNextFocusDownId(id);
            view3.setNextFocusLeftId(id3);
            view3.setNextFocusRightId(id3);
            view3.setNextFocusUpId(id);
            view3.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusUpId(id3);
            messageCloseButtonView.setNextFocusDownId(id3);
            messageCloseButtonView.setNextFocusRightId(id3);
            messageCloseButtonView.setNextFocusLeftId(id4);
            messageCloseButtonView = view2;
            id = id3;
        }
        setNextFocusUpId(id);
        setNextFocusDownId(id);
        setNextFocusRightId(id);
        setNextFocusLeftId(id);
        if (Build.VERSION.SDK_INT >= 26) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        messageCloseButtonView.post(new C7099r1(messageCloseButtonView, 4));
    }
}
