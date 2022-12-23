package com.moovit.p421qr;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import b70.C13574a;
import b70.C13575b;
import b70.C13576c;
import com.google.android.gms.tasks.Tasks;
import com.google.zxing.EncodeHintType;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14737e;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import java.util.EnumMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p054d0.C4291k0;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p806sv.C19562a;

/* renamed from: com.moovit.qr.QRCodeImageView */
public class QRCodeImageView extends AppCompatImageView {

    /* renamed from: f */
    public static final /* synthetic */ int f42887f = 0;

    /* renamed from: b */
    public final C13576c f42888b;

    /* renamed from: c */
    public final EnumMap f42889c;

    /* renamed from: d */
    public String f42890d;

    /* renamed from: e */
    public C16414a f42891e;

    /* renamed from: com.moovit.qr.QRCodeImageView$a */
    public interface C16414a {
    }

    public QRCodeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final void mo49144c(boolean z) {
        C16414a aVar = this.f42891e;
        if (aVar != null) {
            C19562a aVar2 = (C19562a) ((C4291k0) aVar).f15212c;
            String str = C19562a.f49725p;
            aVar2.mo51911S1();
            if (!z) {
                Toast.makeText(aVar2.getContext(), R.string.ride_sharing_qr_code_ticket_generation_error, 1).show();
                aVar2.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: d */
    public final void mo49145d() {
        String str = this.f42890d;
        ExecutorService executorService = MoovitExecutors.SINGLE;
        C13576c cVar = this.f42888b;
        int width = getWidth();
        int height = getHeight();
        EnumMap enumMap = this.f42889c;
        cVar.getClass();
        Tasks.call(executorService, new C13575b(cVar, str, width, height, enumMap)).addOnCompleteListener(new C14737e(this, 4));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f42890d = bundle.getString("qrText");
            parcelable = bundle.getParcelable("parent");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parent", super.onSaveInstanceState());
        bundle.putString("qrText", this.f42890d);
        return bundle;
    }

    public void setListener(C16414a aVar) {
        this.f42891e = aVar;
    }

    public void setQRCode(String str) {
        this.f42890d = str;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (!C6333d0.C6340g.m15076c(this)) {
            UiUtils.m40259r(this, new C13574a(this));
        } else {
            mo49145d();
        }
    }

    public QRCodeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42888b = new C13576c();
        this.f42889c = new EnumMap(EncodeHintType.class);
    }
}
