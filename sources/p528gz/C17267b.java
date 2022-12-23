package p528gz;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ce0.C21100e;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.p044ui.inappmessage.InAppMessageCloser;
import com.appboy.p044ui.inappmessage.InAppMessageOperation;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Map;
import p269u2.C6677a;
import p543hq.C17474b;
import p824tp.C19731i;
import p824tp.C19740r;
import p977zz.C20943i;

/* renamed from: gz.b */
public final class C17267b implements IInAppMessageManagerListener {

    /* renamed from: a */
    public final Context f44633a;

    /* renamed from: b */
    public final C6677a f44634b;

    public C17267b(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        Context applicationContext = context.getApplicationContext();
        this.f44633a = applicationContext;
        this.f44634b = C19731i.m47197a(applicationContext).f50173c;
    }

    /* renamed from: a */
    public static C17474b.C17475a m43280a(IInAppMessage iInAppMessage, AnalyticsEventKey analyticsEventKey) {
        String str;
        String str2;
        String str3;
        C17474b.C17475a aVar = new C17474b.C17475a(analyticsEventKey);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.IAM_ID;
        Map<String, String> extras = iInAppMessage.getExtras();
        String str4 = null;
        if (extras != null) {
            str = extras.get("id");
        } else {
            str = null;
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.CAMPAIGN;
        Map<String, String> extras2 = iInAppMessage.getExtras();
        if (extras2 != null) {
            str2 = extras2.get(AttributionData.CAMPAIGN_KEY);
        } else {
            str2 = null;
        }
        aVar.mo49939g(analyticsAttributeKey2, str2);
        AnalyticsAttributeKey analyticsAttributeKey3 = AnalyticsAttributeKey.IAM_TYPE;
        MessageType messageType = iInAppMessage.getMessageType();
        if (messageType != null) {
            str3 = messageType.name();
        } else {
            str3 = "unknown";
        }
        aVar.mo49939g(analyticsAttributeKey3, str3);
        AnalyticsAttributeKey analyticsAttributeKey4 = AnalyticsAttributeKey.IAM_TP;
        Map<String, String> extras3 = iInAppMessage.getExtras();
        if (extras3 != null) {
            str4 = extras3.get("TP");
        }
        aVar.mo49939g(analyticsAttributeKey4, str4);
        return aVar;
    }

    /* renamed from: b */
    public static void m43281b(TextView textView, TextAlign textAlign) {
        if (textAlign.equals(TextAlign.START)) {
            textView.setGravity(8388611);
            if (C20943i.m49051d(17)) {
                textView.setTextAlignment(5);
            }
        } else if (textAlign.equals(TextAlign.END)) {
            textView.setGravity(8388613);
            if (C20943i.m49051d(17)) {
                textView.setTextAlignment(6);
            }
        } else if (textAlign.equals(TextAlign.CENTER)) {
            textView.setGravity(17);
            if (C20943i.m49051d(17)) {
                textView.setTextAlignment(4);
            }
        }
    }

    public final void afterInAppMessageViewClosed(IInAppMessage iInAppMessage) {
        mo49811c(m43280a(iInAppMessage, AnalyticsEventKey.IAM_CLOSED).mo49933a());
    }

    public final void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        mo49811c(m43280a(iInAppMessage, AnalyticsEventKey.IAM_SHOWN).mo49933a());
    }

    public final InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage) {
        return InAppMessageOperation.DISPLAY_NOW;
    }

    public final void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage) {
    }

    public final void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        if (view != null && iInAppMessage != null) {
            TextView textView = (TextView) view.findViewById(C19740r.com_appboy_inappmessage_modal_icon);
            if (textView != null) {
                textView.setGravity(17);
                if (C20943i.m49051d(17)) {
                    textView.setTextAlignment(4);
                }
            }
            TextAlign messageTextAlign = iInAppMessage.getMessageTextAlign();
            if (messageTextAlign != null) {
                TextView textView2 = (TextView) view.findViewById(C19740r.com_appboy_inappmessage_modal_header_text);
                if (textView2 != null) {
                    m43281b(textView2, messageTextAlign);
                }
                TextView textView3 = (TextView) view.findViewById(C19740r.com_appboy_inappmessage_modal_message);
                if (textView3 != null) {
                    m43281b(textView3, messageTextAlign);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo49811c(C17474b bVar) {
        C6677a aVar = this.f44634b;
        aVar.getClass();
        C6677a.m15759j(this.f44633a, AnalyticsFlowKey.BRAZE_IAM, true, bVar);
    }

    public final boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton, InAppMessageCloser inAppMessageCloser) {
        messageButton.getText();
        C17474b.C17475a a = m43280a(iInAppMessage, AnalyticsEventKey.IAM_BUTTON_CLICK);
        a.mo49939g(AnalyticsAttributeKey.BUTTON_TEXT, messageButton.getText());
        a.mo49935c(AnalyticsAttributeKey.BUTTON_ID, messageButton.getId());
        mo49811c(a.mo49933a());
        return false;
    }

    public final boolean onInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        mo49811c(m43280a(iInAppMessage, AnalyticsEventKey.IAM_MESSAGE_CLICK).mo49933a());
        return false;
    }

    public final void onInAppMessageDismissed(IInAppMessage iInAppMessage) {
        mo49811c(m43280a(iInAppMessage, AnalyticsEventKey.IAM_DISMISSED).mo49933a());
    }

    @Deprecated
    public final boolean onInAppMessageReceived(IInAppMessage iInAppMessage) {
        return false;
    }
}
