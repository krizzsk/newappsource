package p010a9;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.C0411h;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2373a;
import com.facebook.internal.C2401h;
import com.facebook.internal.C2408j;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0098d0;
import p009a8.C0115o;
import p019b0.C1426c;
import p336z8.C7498b;
import p336z8.C7503c;
import p584jl.C17885a;
import p626lf.C18201b;

/* renamed from: a9.a */
public final class C0132a extends ShareDialog {

    /* renamed from: a9.a$a */
    public class C0133a extends C2408j<ShareContent<?, ?>, C1426c>.C25541a {

        /* renamed from: a9.a$a$a */
        public class C0134a implements C2401h.C2402a {

            /* renamed from: a */
            public final /* synthetic */ C2373a f388a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent f389b;

            public C0134a(C2373a aVar, ShareContent shareContent) {
                this.f388a = aVar;
                this.f389b = shareContent;
            }

            /* renamed from: a */
            public final Bundle mo299a() {
                return C17885a.m44396E(this.f388a.mo12536a(), this.f389b, false);
            }

            public final Bundle getParameters() {
                return C18201b.m44915l(this.f388a.mo12536a(), this.f389b, false);
            }
        }

        public C0133a() {
            super(C0132a.this);
        }

        /* renamed from: a */
        public final boolean mo297a(ShareContent shareContent, boolean z) {
            MessageDialogFeature messageDialogFeature;
            boolean z2;
            if (shareContent != null) {
                if (ShareLinkContent.class.isAssignableFrom(shareContent.getClass())) {
                    messageDialogFeature = MessageDialogFeature.MESSAGE_DIALOG;
                } else {
                    messageDialogFeature = null;
                }
                if (messageDialogFeature == null || !C2401h.m6343a(messageDialogFeature)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final C2373a mo298b(ShareContent shareContent) {
            MessageDialogFeature messageDialogFeature;
            String str;
            C7498b.C7502d dVar = C7498b.f22975a;
            C7498b.m17202b(shareContent, C7498b.f22976b);
            C2373a a = C0132a.this.mo294a();
            C0132a.this.getClass();
            Activity b = C0132a.this.mo12563b();
            MessageDialogFeature messageDialogFeature2 = null;
            if (ShareLinkContent.class.isAssignableFrom(shareContent.getClass())) {
                messageDialogFeature = MessageDialogFeature.MESSAGE_DIALOG;
            } else {
                messageDialogFeature = null;
            }
            MessageDialogFeature messageDialogFeature3 = MessageDialogFeature.MESSAGE_DIALOG;
            if (messageDialogFeature == messageDialogFeature3) {
                str = ServerParameters.STATUS;
            } else if (messageDialogFeature == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
                str = "GenericTemplate";
            } else if (messageDialogFeature == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
                str = "MediaTemplate";
            } else {
                str = "unknown";
            }
            C2338j jVar = new C2338j((Context) b, (String) null);
            Bundle b2 = C25541a.m63872b("fb_share_dialog_content_type", str);
            b2.putString("fb_share_dialog_content_uuid", a.mo12536a().toString());
            b2.putString("fb_share_dialog_content_page_id", shareContent.f8922e);
            C0115o oVar = C0115o.f331a;
            if (C0098d0.m169b()) {
                jVar.mo12486f("fb_messenger_share_dialog_show", b2);
            }
            C0134a aVar = new C0134a(a, shareContent);
            if (ShareLinkContent.class.isAssignableFrom(shareContent.getClass())) {
                messageDialogFeature2 = messageDialogFeature3;
            }
            C2401h.m6345c(a, aVar, messageDialogFeature2);
            return a;
        }
    }

    static {
        CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    }

    public C0132a(Activity activity, int i) {
        super(activity, i);
        CallbackManagerImpl.f8585b.mo12523a(i, new C7503c(i));
    }

    /* renamed from: a */
    public final C2373a mo294a() {
        return new C2373a(this.f8656d);
    }

    /* renamed from: c */
    public final List<C2408j<ShareContent<?, ?>, C1426c>.C25541a> mo295c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0133a());
        return arrayList;
    }

    /* renamed from: f */
    public final boolean mo296f() {
        return false;
    }

    public C0132a(C0411h hVar, int i) {
        super(hVar, i);
        CallbackManagerImpl.f8585b.mo12523a(i, new C7503c(i));
    }
}
