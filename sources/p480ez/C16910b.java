package p480ez;

import a00.C13382a;
import android.view.View;
import androidx.camera.core.CameraControl;
import b60.C13571b;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import com.moovit.design.view.NumericStepperView;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.gcm.popup.RemotePopup;
import com.moovit.map.C16255c;
import com.moovit.payment.account.actions.AccountActionHtmlStepFragment;
import com.moovit.payment.account.profile.C25705a;
import com.moovit.request.RequestOptions;
import com.moovit.ticketing.validation.receipt.media.C7774b;
import f10.C16930a;
import g30.C4779k;
import h60.C17342o1;
import k10.C17996b;
import k60.C18010f;
import mf0.C24362h;
import p054d0.C4279f;
import p394br.C13660f;
import p432cz.C16529d;
import p543hq.C17474b;
import p646lz.C18299a;
import w00.C20263d;
import y30.C7311a;
import y40.C25773b;

/* renamed from: ez.b */
public final /* synthetic */ class C16910b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f43925b;

    /* renamed from: c */
    public final /* synthetic */ Object f43926c;

    public /* synthetic */ C16910b(Object obj, int i) {
        this.f43925b = i;
        this.f43926c = obj;
    }

    public final void onClick(View view) {
        int i;
        CameraControl cameraControl;
        switch (this.f43925b) {
            case 0:
                MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment = (MLKitBarcodeScannerFragment) this.f43926c;
                int i2 = MLKitBarcodeScannerFragment.f40812q;
                mLKitBarcodeScannerFragment.getClass();
                boolean z = !view.isActivated();
                view.setActivated(z);
                CharSequence[] charSequenceArr = new CharSequence[1];
                if (z) {
                    i = C16529d.voiceover_flashlight_on;
                } else {
                    i = C16529d.voiceover_flashlight_off;
                }
                charSequenceArr[0] = mLKitBarcodeScannerFragment.getString(i);
                C13382a.m33665a(view, charSequenceArr);
                C4279f fVar = mLKitBarcodeScannerFragment.f40814o;
                if (!(fVar == null || (cameraControl = fVar.getCameraControl()) == null)) {
                    cameraControl.enableTorch(z);
                }
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "flashlight_clicked");
                aVar.mo49941i(AnalyticsAttributeKey.STATE, z);
                mLKitBarcodeScannerFragment.mo46797j2(aVar.mo49933a());
                return;
            case 1:
                NumericStepperView numericStepperView = (NumericStepperView) this.f43926c;
                int i3 = NumericStepperView.f41362h;
                numericStepperView.getClass();
                if (view.getId() == C20263d.add_button) {
                    numericStepperView.mo47719b(numericStepperView.f41367f + 1, true);
                    return;
                } else {
                    numericStepperView.mo47719b(numericStepperView.f41367f - 1, true);
                    return;
                }
            case 2:
                C17996b bVar = (C17996b) this.f43926c;
                int i4 = C17996b.f46078i;
                RemotePopup S1 = bVar.mo50496S1();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.PUSH_ID, S1.f41609c.f41546b);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "popup_html_action_button_type");
                bVar.mo22564R1(aVar2.mo49933a());
                bVar.dismiss();
                GcmPayload.C15923a<Void> e = C16930a.m42749a().mo49554e(bVar.f40792c);
                if (e != null) {
                    S1.f41609c.mo47976b(e);
                    return;
                }
                return;
            case 3:
                int i5 = C16255c.f42468j;
                ((C16255c) this.f43926c).dismissAllowingStateLoss();
                return;
            case 4:
                C4779k kVar = (C4779k) this.f43926c;
                int i6 = C4779k.f16146h;
                A a = kVar.f40792c;
                if (a != null && a.f37313z) {
                    MoovitApplication.f37317k.mo44571s(a.mo44550y1(), a, (C18299a) null);
                }
                kVar.dismissAllowingStateLoss();
                return;
            case 5:
                C7311a aVar3 = (C7311a) this.f43926c;
                aVar3.mo23548o2(aVar3.f22414q.getPinCode());
                return;
            case 6:
                AccountActionHtmlStepFragment accountActionHtmlStepFragment = (AccountActionHtmlStepFragment) this.f43926c;
                int i7 = AccountActionHtmlStepFragment.f63849o;
                C24362h.m61211f(accountActionHtmlStepFragment, "this$0");
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "submit_clicked");
                aVar4.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, accountActionHtmlStepFragment.mo83336p2().f63877e);
                aVar4.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, accountActionHtmlStepFragment.mo83336p2().f63875c);
                accountActionHtmlStepFragment.mo46797j2(aVar4.mo49933a());
                accountActionHtmlStepFragment.mo83596o2(new C25773b(accountActionHtmlStepFragment.mo83336p2().f63874b, accountActionHtmlStepFragment.mo83336p2().f63875c, accountActionHtmlStepFragment.mo83336p2().f63876d));
                return;
            case 7:
                C25705a aVar5 = (C25705a) this.f43926c;
                int i8 = C25705a.f64111h;
                aVar5.getClass();
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "ok_clicked");
                aVar5.mo22564R1(aVar6.mo49933a());
                aVar5.mo46753L1(C25705a.C25706a.class, new C13660f(10));
                aVar5.dismissAllowingStateLoss();
                return;
            case 8:
                int i9 = C13571b.f33523k;
                ((C13571b) this.f43926c).mo40453T1();
                return;
            case 9:
                C18010f fVar2 = (C18010f) this.f43926c;
                int i11 = C18010f.f46121u;
                fVar2.getClass();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "veriff");
                fVar2.mo46797j2(aVar7.mo49933a());
                C17342o1 o1Var = new C17342o1(fVar2.mo46783R1(), fVar2.mo50500p2().f42758b);
                RequestOptions L1 = fVar2.mo46777L1();
                L1.f42909f = true;
                fVar2.mo46793f2("veriff_get_session_url", o1Var, L1, fVar2.f46122r);
                return;
            default:
                C7774b bVar2 = (C7774b) this.f43926c;
                int i12 = C7774b.f23597v;
                bVar2.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "flip_clicked");
                bVar2.mo46797j2(aVar8.mo49933a());
                if (bVar2.f23602t.getChildCount() > 1) {
                    View childAt = bVar2.f23602t.getChildAt(0);
                    View childAt2 = bVar2.f23602t.getChildAt(1);
                    if (childAt != null && childAt2 != null) {
                        int visibility = childAt.getVisibility();
                        childAt.setVisibility(childAt2.getVisibility());
                        childAt2.setVisibility(visibility);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
