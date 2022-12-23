package com.moovit.app.general;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import com.facebook.internal.C2408j;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.general.userprofile.UpdateUserAction;
import com.tranzmate.R;
import com.usebutton.sdk.context.Identifiers;
import l80.C12849a;
import mf0.C24362h;
import p543hq.C17474b;
import p567iq.C17635b;
import p977zz.C20927a0;
import p977zz.C20975x0;
import q00.C19047a;

public class SpreadTheLoveActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38042U = 0;

    /* renamed from: y2 */
    public static void m37518y2(SpreadTheLoveActivity spreadTheLoveActivity, View view) {
        String str;
        spreadTheLoveActivity.getClass();
        switch (view.getId()) {
            case R.id.facebook:
                ShareLinkContent.C2501a aVar = new ShareLinkContent.C2501a();
                aVar.f8925a = Uri.parse(spreadTheLoveActivity.getString(R.string.facebook_page_browser_url));
                ShareLinkContent shareLinkContent = new ShareLinkContent(aVar);
                ShareDialog shareDialog = new ShareDialog((Activity) spreadTheLoveActivity, ShareDialog.f8964i);
                C24362h.m61211f(ShareDialog.Mode.AUTOMATIC, "mode");
                shareDialog.f8965g = true;
                shareDialog.mo12564d(shareLinkContent, C2408j.f8652f);
                spreadTheLoveActivity.mo44994z2(Identifiers.IDENTIFIER_FACEBOOK);
                return;
            case R.id.follow_us_on_instagram:
                spreadTheLoveActivity.mo44545v2(new C17474b(AnalyticsEventKey.SPREAD_THE_LOVE_SHARE_FOLLOW_ON_INSTAGRAM));
                boolean h = C20975x0.m49121h(spreadTheLoveActivity, "com.instagram.android");
                StringBuilder sb = new StringBuilder();
                sb.append(spreadTheLoveActivity.getString(R.string.instagram_base_url));
                if (h) {
                    str = "_u/";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(spreadTheLoveActivity.getString(R.string.instagram_moovit_username));
                Intent i = C20927a0.m49014i(Uri.parse(sb.toString()));
                if (h) {
                    i.setPackage("com.instagram.android");
                }
                spreadTheLoveActivity.startActivity(Intent.createChooser(i, spreadTheLoveActivity.getText(R.string.open_file_chooser)));
                return;
            case R.id.follow_us_on_twitter:
                spreadTheLoveActivity.mo44545v2(new C17474b(AnalyticsEventKey.SPREAD_THE_LOVE_SHARE_FOLLOW_ON_TWITTER));
                C19047a.C19048a aVar2 = C19047a.f48441d;
                spreadTheLoveActivity.startActivity(Intent.createChooser(C12849a.m32653a(spreadTheLoveActivity, (C19047a) spreadTheLoveActivity.getSystemService("user_configuration"), spreadTheLoveActivity.getString(R.string.open_twitter_app_username)), spreadTheLoveActivity.getText(R.string.open_file_chooser)));
                return;
            case R.id.mail_action_view:
                spreadTheLoveActivity.mo44994z2("email");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.SUBJECT", spreadTheLoveActivity.getString(R.string.spread_love_email_subject));
                intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(spreadTheLoveActivity.getString(R.string.spread_love_email_body)));
                spreadTheLoveActivity.startActivity(Intent.createChooser(intent, spreadTheLoveActivity.getString(R.string.send_mail_chooser)));
                return;
            case R.id.twitter:
                spreadTheLoveActivity.mo44994z2("twitter");
                Intent intent2 = (Intent) view.getTag();
                if (intent2 != null) {
                    C20927a0.m49017l(spreadTheLoveActivity, intent2);
                    return;
                }
                return;
            case R.id.whatsapp:
                spreadTheLoveActivity.mo44994z2("whatsapp");
                String string = spreadTheLoveActivity.getString(R.string.spread_love_share_hint);
                Intent intent3 = new Intent();
                intent3.setAction("android.intent.action.SEND");
                intent3.setPackage("com.whatsapp");
                intent3.setType("text/plain");
                intent3.putExtra("android.intent.extra.TEXT", string);
                spreadTheLoveActivity.startActivity(Intent.createChooser(intent3, spreadTheLoveActivity.getString(R.string.share_with)));
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19425e2(android.os.Bundle r10) {
        /*
            r9 = this;
            super.mo19425e2(r10)
            r10 = 2131559381(0x7f0d03d5, float:1.8744104E38)
            r9.setContentView((int) r10)
            r10 = 2131362922(0x7f0a046a, float:1.8345638E38)
            android.view.View r10 = r9.findViewById(r10)
            r0 = 8
            r1 = 1
            r2 = 0
            r3 = 6
            if (r10 == 0) goto L_0x0045
            boolean r4 = p009a8.C0115o.m217h()
            if (r4 == 0) goto L_0x0035
            java.lang.Class<com.facebook.share.model.ShareLinkContent> r4 = com.facebook.share.model.ShareLinkContent.class
            int r5 = com.facebook.share.widget.ShareDialog.f8964i
            boolean r5 = com.facebook.share.widget.ShareDialog.C2516b.m6539b(r4)
            if (r5 != 0) goto L_0x0030
            boolean r4 = com.facebook.share.widget.ShareDialog.C2516b.m6538a(r4)
            if (r4 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r4 = 0
            goto L_0x0031
        L_0x0030:
            r4 = 1
        L_0x0031:
            if (r4 == 0) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x0045
            e7.c r4 = new e7.c
            r4.<init>(r9, r3)
            r10.setOnClickListener(r4)
            r10.setVisibility(r2)
            r10 = 0
            goto L_0x0047
        L_0x0045:
            r10 = 8
        L_0x0047:
            q00.a$a r4 = q00.C19047a.f48441d
            java.lang.String r4 = "user_configuration"
            java.lang.Object r4 = r9.getSystemService(r4)
            q00.a r4 = (q00.C19047a) r4
            r5 = 2131888824(0x7f120ab8, float:1.9412294E38)
            java.lang.String r5 = r9.getString(r5)
            r00.h r6 = q00.C19053d.f48466R
            java.lang.Object r4 = r4.mo51505b(r6)
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = p977zz.C20964s0.m49090h(r4)
            r7 = 0
            if (r6 == 0) goto L_0x0068
            goto L_0x0089
        L_0x0068:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = "UTF-8"
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0077:
            r1[r2] = r5
            java.lang.String r1 = java.lang.String.format(r6, r4, r1)
            boolean r4 = android.webkit.URLUtil.isValidUrl(r1)
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = ""
            android.content.Intent r7 = com.moovit.web.WebViewActivity.m18168y2(r9, r1, r4)
        L_0x0089:
            r1 = 2131364594(0x7f0a0af2, float:1.834903E38)
            android.view.View r1 = r9.findViewById(r1)
            if (r1 == 0) goto L_0x00a3
            if (r7 == 0) goto L_0x00a3
            r1.setTag(r7)
            com.google.android.exoplayer2.ui.q r10 = new com.google.android.exoplayer2.ui.q
            r10.<init>(r9, r3)
            r1.setOnClickListener(r10)
            r1.setVisibility(r2)
            r10 = 0
        L_0x00a3:
            r1 = 2131364745(0x7f0a0b89, float:1.8349336E38)
            android.view.View r1 = r9.findViewById(r1)
            r4 = 5
            if (r1 == 0) goto L_0x00c1
            java.lang.String r5 = "com.whatsapp"
            boolean r5 = p977zz.C20975x0.m49121h(r9, r5)
            if (r5 == 0) goto L_0x00c1
            com.google.android.exoplayer2.ui.r r10 = new com.google.android.exoplayer2.ui.r
            r10.<init>(r9, r4)
            r1.setOnClickListener(r10)
            r1.setVisibility(r2)
            r10 = 0
        L_0x00c1:
            r1 = 2131363394(0x7f0a0642, float:1.8346596E38)
            android.view.View r1 = r9.findViewById(r1)
            if (r1 == 0) goto L_0x00d7
            c7.c r10 = new c7.c
            r5 = 3
            r10.<init>(r9, r5)
            r1.setOnClickListener(r10)
            r1.setVisibility(r2)
            r10 = 0
        L_0x00d7:
            r1 = 2131364329(0x7f0a09e9, float:1.8348492E38)
            android.view.View r1 = r9.findViewById(r1)
            if (r1 == 0) goto L_0x00e3
            r1.setVisibility(r10)
        L_0x00e3:
            r1 = 2131362988(0x7f0a04ac, float:1.8345772E38)
            android.view.View r1 = r9.findViewById(r1)
            if (r1 == 0) goto L_0x00f9
            w5.a r5 = new w5.a
            r5.<init>(r9, r4)
            r1.setOnClickListener(r5)
            r1.setVisibility(r2)
            r1 = 0
            goto L_0x00fb
        L_0x00f9:
            r1 = 8
        L_0x00fb:
            r4 = 2131362987(0x7f0a04ab, float:1.834577E38)
            android.view.View r4 = r9.findViewById(r4)
            if (r4 == 0) goto L_0x0110
            eq.a r1 = new eq.a
            r1.<init>(r9, r3)
            r4.setOnClickListener(r1)
            r4.setVisibility(r2)
            r1 = 0
        L_0x0110:
            r3 = 2131362956(0x7f0a048c, float:1.8345707E38)
            android.view.View r3 = r9.findViewById(r3)
            if (r3 == 0) goto L_0x011c
            r3.setVisibility(r1)
        L_0x011c:
            r3 = 2131362705(0x7f0a0391, float:1.8345198E38)
            android.view.View r3 = r9.findViewById(r3)
            if (r3 == 0) goto L_0x012d
            if (r10 != 0) goto L_0x012a
            if (r1 != 0) goto L_0x012a
            r0 = 0
        L_0x012a:
            r3.setVisibility(r0)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.general.SpreadTheLoveActivity.mo19425e2(android.os.Bundle):void");
    }

    /* renamed from: z2 */
    public final void mo44994z2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SPREAD_THE_LOVE_SHARE);
        aVar.mo49939g(AnalyticsAttributeKey.SHARE_VIA, str);
        mo44545v2(aVar.mo49933a());
        C17635b.m43779f(this).f50172b.mo42913b(new UpdateUserAction(this, UpdateUserAction.UserActionType.TELL_A_FRIEND), true);
    }
}
