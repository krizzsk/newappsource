package p544hr;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.Profile;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.app.MoovitAppApplication;
import com.moovit.carpool.CarpoolDriver;
import com.tranzmate.R;
import ga0.C12713m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p009a8.C0127w;
import p803ss.C19522a;
import p977zz.C20927a0;

/* renamed from: hr.a */
public class C17480a extends C15682c<MoovitActivity> implements C12713m.C12714a {

    /* renamed from: t */
    public static String f45011t = C17480a.class.getName();

    /* renamed from: n */
    public boolean f45012n = false;

    /* renamed from: o */
    public boolean f45013o = false;

    /* renamed from: p */
    public CarpoolDriver f45014p;

    /* renamed from: q */
    public String f45015q;

    /* renamed from: r */
    public int f45016r;

    /* renamed from: s */
    public C12713m f45017s;

    public C17480a() {
        super(MoovitActivity.class);
    }

    /* renamed from: a1 */
    public final void mo39510a1() {
        C12713m mVar = this.f45017s;
        if (mVar != null && mVar.getActivity() != null) {
            this.f45017s.dismiss();
            this.f45017s = null;
        }
    }

    /* renamed from: d */
    public final void mo39511d(int i, int i2, String str) {
        String str2;
        C12713m mVar = this.f45017s;
        if (!(mVar == null || mVar.getActivity() == null)) {
            this.f45017s.dismiss();
            this.f45017s = null;
        }
        if (isAdded()) {
            this.f45016r = i;
            if (i == i2 - 1) {
                str = " ";
            }
            this.f45015q = str;
            Object[] objArr = new Object[1];
            Parcelable.Creator<Profile> creator = Profile.CREATOR;
            Profile profile = C0127w.f369d.mo282a().f373c;
            if (profile == null || TextUtils.isEmpty(profile.f8446c)) {
                str2 = getString(R.string.carpool_message_chooser_prefix_default_name);
            } else {
                String str3 = profile.f8448e;
                if (TextUtils.isEmpty(str3)) {
                    str2 = profile.f8446c;
                } else {
                    str2 = String.format("%1$s %2$s", new Object[]{profile.f8446c, Character.valueOf(str3.charAt(0))});
                }
            }
            objArr[0] = str2;
            String format = String.format("%1$s %2$s", new Object[]{getString(R.string.carpool_message_chooser_prefix, objArr), this.f45015q});
            this.f45015q = format;
            C20927a0.m49017l(requireContext(), C20927a0.m49013h(format, Collections.singletonList(this.f45014p.f40878e)));
        }
    }

    /* renamed from: e2 */
    public final void mo46792e2(Bundle bundle) {
        super.mo46792e2(bundle);
        this.f45014p = (CarpoolDriver) getArguments().getParcelable("driver");
        if (bundle != null) {
            this.f45015q = bundle.getString("chosenSmsTemplate");
            this.f45016r = bundle.getInt("chosenSmsTemplatePosition");
            this.f45012n = bundle.getBoolean("smsPending");
            this.f45013o = bundle.getBoolean("smsPendingOfferTemplate");
        }
        if (bundle != null) {
            C12713m mVar = (C12713m) getFragmentManager().mo3923A("MessageChooserDialogTag");
            this.f45017s = mVar;
            if (mVar != null) {
                mVar.setTargetFragment(this, 1001);
            }
        }
    }

    /* renamed from: m2 */
    public final void mo49951m2(boolean z) {
        if (!isResumed()) {
            this.f45012n = true;
            this.f45013o = z;
        } else if (!z) {
            C20927a0.m49017l(requireContext(), C20927a0.m49013h((String) null, Collections.singletonList(this.f45014p.f40878e)));
        } else if (this.f45017s == null) {
            Resources resources = getResources();
            String[] stringArray = resources.getStringArray(R.array.carpool_message_chooser_messages);
            String e = C19522a.f49619f.mo19759a(C19522a.m46888a(MoovitAppApplication.m37038x()).f49620a);
            Object[] objArr = new Object[1];
            if (TextUtils.isEmpty(e)) {
                e = "...";
            }
            objArr[0] = e;
            String string = getString(R.string.carpool_message_chooser_call_me_message, objArr);
            String string2 = resources.getString(R.string.carpool_message_chooser_custom_message);
            ArrayList arrayList = new ArrayList(Arrays.asList(stringArray));
            arrayList.add(string);
            arrayList.add(string2);
            String string3 = getString(R.string.send);
            String string4 = getString(R.string.carpool_message_chooser_header);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("com.moovit.view.dialogs.StringPickerDialogFragment_strings_extra", arrayList);
            bundle.putString("com.moovit.view.dialogs.StringPickerDialogFragment_header_title_extra", string4);
            bundle.putString("com.moovit.view.dialogs.StringPickerDialogFragment_pick_action_title_extra", string3);
            C12713m mVar = new C12713m();
            mVar.setArguments(bundle);
            this.f45017s = mVar;
            mVar.setTargetFragment(this, 1001);
            this.f45017s.show(getFragmentManager(), "MessageChooserDialogTag");
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f45012n) {
            this.f45012n = false;
            mo49951m2(this.f45013o);
            this.f45013o = false;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("chosenSmsTemplate", this.f45015q);
        bundle.putInt("chosenSmsTemplatePosition", this.f45016r);
        bundle.putBoolean("smsPending", this.f45012n);
        bundle.putBoolean("smsPendingOfferTemplate", this.f45013o);
    }
}
