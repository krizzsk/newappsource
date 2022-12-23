package com.moovit.design.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.moovit.commons.view.TextureVideoHelper;
import com.moovit.image.model.Image;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.Locale;
import p620kx.C18155a;
import p977zz.C20964s0;
import w00.C20264e;
import w00.C20266g;

public final class AlertDialogFragment extends C0942l {

    /* renamed from: c */
    public static final /* synthetic */ int f41324c = 0;

    /* renamed from: b */
    public String f41325b;

    public static class VideoHelper extends TextureVideoHelper {

        /* renamed from: h */
        public final TextureView f41326h;

        public VideoHelper(TextureView textureView, Uri uri) {
            super(textureView.getContext(), uri, true);
            this.f41326h = textureView;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f41326h.getLayoutParams();
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            String str = C20964s0.f52718a;
            String format = String.format((Locale) null, "H,%s:%s", objArr);
            if (!format.equals(layoutParams.f3011G)) {
                layoutParams.height = 0;
                layoutParams.f3011G = format;
                this.f41326h.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.moovit.design.dialog.AlertDialogFragment$a */
    public static final class C15856a {

        /* renamed from: a */
        public final Resources f41327a;

        /* renamed from: b */
        public final Bundle f41328b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C15856a(Context context) {
            this(context.getResources());
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        }

        /* renamed from: a */
        public final C15856a mo47672a(CharSequence charSequence, String str) {
            if (charSequence == null) {
                this.f41328b.remove(str);
                return this;
            }
            this.f41328b.putCharSequence(str, charSequence);
            return this;
        }

        /* renamed from: b */
        public final AlertDialogFragment mo47673b() {
            AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
            Bundle bundle = this.f41328b;
            bundle.getCharSequence("positiveButton");
            bundle.getCharSequence("negativeButton");
            bundle.getCharSequence("neutralButton");
            alertDialogFragment.setArguments(bundle);
            return alertDialogFragment;
        }

        /* renamed from: c */
        public final void mo47674c(boolean z) {
            this.f41328b.putBoolean("cancelable", z);
        }

        /* renamed from: d */
        public final void mo47675d(boolean z) {
            this.f41328b.putBoolean("cancelableOnTouchOutside", z);
        }

        /* renamed from: e */
        public final C15856a mo47676e(int i, boolean z) {
            this.f41328b.remove("image");
            if (i == 0) {
                this.f41328b.remove("imageResId");
                return this;
            }
            this.f41328b.putBoolean("adjustImageBounds", z);
            this.f41328b.putInt("imageResId", i);
            return this;
        }

        /* renamed from: f */
        public final C15856a mo47677f(Image image) {
            this.f41328b.remove("imageResId");
            if (image == null) {
                this.f41328b.remove("image");
                return this;
            }
            this.f41328b.putBoolean("adjustImageBounds", false);
            this.f41328b.putParcelable("image", image);
            return this;
        }

        /* renamed from: g */
        public final C15856a mo47678g(int i) {
            return mo47679h(i == 0 ? null : this.f41327a.getText(i));
        }

        /* renamed from: h */
        public final C15856a mo47679h(CharSequence charSequence) {
            return mo47672a(charSequence, InAppMessageBase.MESSAGE);
        }

        /* renamed from: i */
        public final C15856a mo47680i(int i) {
            CharSequence charSequence;
            if (i == 0) {
                charSequence = null;
            } else {
                charSequence = this.f41327a.getText(i);
            }
            return mo47672a(charSequence, "negativeButton");
        }

        /* renamed from: j */
        public final C15856a mo47681j(int i) {
            CharSequence charSequence;
            if (i == 0) {
                charSequence = null;
            } else {
                charSequence = this.f41327a.getText(i);
            }
            return mo47672a(charSequence, "positiveButton");
        }

        /* renamed from: k */
        public final C15856a mo47682k(String str) {
            if (str == null) {
                this.f41328b.remove("tag");
                return this;
            }
            this.f41328b.putString("tag", str);
            return this;
        }

        /* renamed from: l */
        public final C15856a mo47683l(int i) {
            return mo47684m(i == 0 ? null : this.f41327a.getText(i));
        }

        /* renamed from: m */
        public final C15856a mo47684m(CharSequence charSequence) {
            return mo47672a(charSequence, "title");
        }

        public C15856a(Resources resources) {
            C21100e.m49373x(resources, "resources");
            this.f41327a = resources;
            this.f41328b = new Bundle();
        }
    }

    /* renamed from: com.moovit.design.dialog.AlertDialogFragment$b */
    public interface C15857b {
        /* renamed from: E1 */
        void mo44504E1(Bundle bundle, String str);

        /* renamed from: V0 */
        void mo19423V0(Bundle bundle, String str);

        /* renamed from: t0 */
        boolean mo19430t0(String str, int i, Bundle bundle);
    }

    /* renamed from: H1 */
    public final C15857b mo47670H1() {
        Fragment targetFragment = getTargetFragment();
        Fragment parentFragment = getParentFragment();
        FragmentActivity activity = getActivity();
        if (targetFragment instanceof C15857b) {
            return (C15857b) targetFragment;
        }
        if (parentFragment instanceof C15857b) {
            return (C15857b) parentFragment;
        }
        if (activity instanceof C15857b) {
            return (C15857b) activity;
        }
        return null;
    }

    /* renamed from: I1 */
    public final void mo47671I1(Button button, CharSequence charSequence, int i) {
        if (charSequence != null) {
            button.setText(charSequence);
            button.setVisibility(0);
            button.setOnClickListener(new C18155a(this, i, 1));
            return;
        }
        button.setVisibility(8);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C15857b H1 = mo47670H1();
        if (H1 != null) {
            H1.mo44504E1(requireArguments(), this.f41325b);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C20266g.ThemeOverlay_Moovit_AlertDialog);
        Bundle requireArguments = requireArguments();
        this.f41325b = requireArguments.getString("tag");
        setCancelable(requireArguments.getBoolean("cancelable", true));
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean containsKey = arguments.containsKey("positiveButton");
            boolean containsKey2 = arguments.containsKey("negativeButton");
            boolean containsKey3 = arguments.containsKey("neutralButton");
            boolean z = arguments.getBoolean("cancelableOnTouchOutside", isCancelable());
            int i = arguments.getInt("themeOverlay");
            C15858a aVar = new C15858a(requireContext(), getTheme());
            Resources.Theme theme = aVar.getContext().getTheme();
            if (containsKey && containsKey2 && containsKey3) {
                theme.applyStyle(C20266g.ThemeOverlay_Moovit_AlertDialog_Buttons_TripleButtons, true);
            }
            if (i != 0) {
                theme.applyStyle(i, true);
            }
            aVar.setCanceledOnTouchOutside(z);
            return aVar;
        }
        throw new IllegalStateException(C25541a.m63880j("Missing arguments for ", AlertDialogFragment.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C20264e.alert_dialog_layout, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C15857b H1 = mo47670H1();
        if (H1 != null) {
            H1.mo19423V0(requireArguments(), this.f41325b);
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            super.onViewCreated(r14, r15)
            android.os.Bundle r15 = r13.getArguments()
            if (r15 == 0) goto L_0x015d
            java.lang.String r0 = "tag"
            java.lang.String r0 = r15.getString(r0)
            r13.f41325b = r0
            java.lang.String r0 = "imageResId"
            int r0 = r15.getInt(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.moovit.image.model.ResourceImage r2 = new com.moovit.image.model.ResourceImage
            java.lang.String[] r3 = new java.lang.String[r1]
            r2.<init>(r0, r3)
            goto L_0x002b
        L_0x0022:
            java.lang.String r0 = "image"
            android.os.Parcelable r0 = r15.getParcelable(r0)
            r2 = r0
            com.moovit.image.model.Image r2 = (com.moovit.image.model.Image) r2
        L_0x002b:
            java.lang.String r0 = "adjustImageBounds"
            boolean r0 = r15.getBoolean(r0)
            java.lang.String r3 = "video"
            android.os.Parcelable r3 = r15.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r4 = "title"
            java.lang.CharSequence r4 = r15.getCharSequence(r4)
            java.lang.String r5 = "message"
            java.lang.CharSequence r5 = r15.getCharSequence(r5)
            java.lang.String r6 = "isMessageCentered"
            r7 = 1
            boolean r6 = r15.getBoolean(r6, r7)
            java.lang.String r7 = "isMessageLinkify"
            boolean r7 = r15.getBoolean(r7, r1)
            java.lang.String r8 = "positiveButton"
            java.lang.CharSequence r8 = r15.getCharSequence(r8)
            java.lang.String r9 = "negativeButton"
            java.lang.CharSequence r9 = r15.getCharSequence(r9)
            java.lang.String r10 = "neutralButton"
            java.lang.CharSequence r15 = r15.getCharSequence(r10)
            int r10 = w00.C20263d.media
            android.view.View r10 = r14.findViewById(r10)
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            int r11 = w00.C20263d.media_space
            android.view.View r11 = r14.findViewById(r11)
            r12 = 8
            if (r2 == 0) goto L_0x00a2
            int r3 = w00.C20264e.alert_dialog_media_image
            r10.setLayoutResource(r3)
            android.view.View r3 = r10.inflate()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            c20.C13744a.m34301c(r3, r2, r12)
            r3.setAdjustViewBounds(r0)
            if (r0 == 0) goto L_0x008c
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L_0x008e
        L_0x008c:
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE
        L_0x008e:
            r3.setScaleType(r2)
            if (r0 == 0) goto L_0x009e
            int r0 = w00.C20263d.top_guideline
            android.view.View r0 = r14.findViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r0.setGuidelineBegin(r1)
        L_0x009e:
            r11.setVisibility(r1)
            goto L_0x00d7
        L_0x00a2:
            if (r3 == 0) goto L_0x00d1
            int r0 = w00.C20264e.alert_dialog_media_video
            r10.setLayoutResource(r0)
            android.view.View r0 = r10.inflate()
            android.view.TextureView r0 = (android.view.TextureView) r0
            com.moovit.design.dialog.AlertDialogFragment$VideoHelper r2 = new com.moovit.design.dialog.AlertDialogFragment$VideoHelper
            r2.<init>(r0, r3)
            r0.setSurfaceTextureListener(r2)
            androidx.lifecycle.p r0 = r13.getViewLifecycleOwner()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.mo4224a(r2)
            int r0 = w00.C20263d.top_guideline
            android.view.View r0 = r14.findViewById(r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r0.setGuidelineBegin(r1)
            r11.setVisibility(r1)
            goto L_0x00d7
        L_0x00d1:
            r11.setVisibility(r12)
            r10.setVisibility(r12)
        L_0x00d7:
            int r0 = w00.C20263d.title_space
            android.view.View r0 = r14.findViewById(r0)
            int r2 = w00.C20263d.title
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 1
            p242s1.C6333d0.m15030r(r2, r3)
            r10 = 2
            if (r4 == 0) goto L_0x00f3
            r2.setText(r4)
            r0.setVisibility(r1)
            goto L_0x00fc
        L_0x00f3:
            android.view.View[] r4 = new android.view.View[r10]
            r4[r1] = r2
            r4[r3] = r0
            com.moovit.commons.utils.UiUtils.m40238F(r12, r4)
        L_0x00fc:
            int r0 = w00.C20263d.content_space
            android.view.View r0 = r14.findViewById(r0)
            int r2 = w00.C20263d.content
            android.view.View r2 = r14.findViewById(r2)
            int r3 = w00.C20263d.message
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r7 == 0) goto L_0x0119
            android.text.method.MovementMethod r4 = android.text.method.LinkMovementMethod.getInstance()
            r3.setMovementMethod(r4)
        L_0x0119:
            if (r6 != 0) goto L_0x0125
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r4)
            r4 = 5
            r3.setTextAlignment(r4)
        L_0x0125:
            if (r5 == 0) goto L_0x012e
            r3.setText(r5)
            r0.setVisibility(r1)
            goto L_0x0138
        L_0x012e:
            android.view.View[] r3 = new android.view.View[r10]
            r3[r1] = r2
            r1 = 1
            r3[r1] = r0
            com.moovit.commons.utils.UiUtils.m40238F(r12, r3)
        L_0x0138:
            int r0 = w00.C20263d.positive_button
            android.view.View r0 = r14.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1 = -1
            r13.mo47671I1(r0, r8, r1)
            int r0 = w00.C20263d.negative_button
            android.view.View r0 = r14.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1 = -2
            r13.mo47671I1(r0, r9, r1)
            int r0 = w00.C20263d.neutral_button
            android.view.View r14 = r14.findViewById(r0)
            android.widget.Button r14 = (android.widget.Button) r14
            r0 = -3
            r13.mo47671I1(r14, r15, r0)
            return
        L_0x015d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Missing arguments for "
            java.lang.Class<com.moovit.design.dialog.AlertDialogFragment> r0 = com.moovit.design.dialog.AlertDialogFragment.class
            java.lang.String r15 = p379.C25541a.m63880j(r15, r0)
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.design.dialog.AlertDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
