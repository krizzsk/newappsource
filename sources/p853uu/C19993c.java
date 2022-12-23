package p853uu;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import p435de.C16596f;

/* renamed from: uu.c */
public final /* synthetic */ class C19993c implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ MotQrCodeViewerActivity f50832b;

    /* renamed from: c */
    public final /* synthetic */ String f50833c;

    /* renamed from: d */
    public final /* synthetic */ ServerId f50834d;

    public /* synthetic */ C19993c(MotQrCodeViewerActivity motQrCodeViewerActivity, String str, ServerId serverId) {
        this.f50832b = motQrCodeViewerActivity;
        this.f50833c = str;
        this.f50834d = serverId;
    }

    public final void onFailure(Exception exc) {
        MotQrCodeViewerActivity motQrCodeViewerActivity = this.f50832b;
        String str = this.f50833c;
        ServerId serverId = this.f50834d;
        int i = MotQrCodeViewerActivity.f39075X;
        motQrCodeViewerActivity.getClass();
        C16596f a = C16596f.m42113a();
        a.mo49363b("priceReference: " + str);
        a.mo49363b("activationId: " + serverId);
        a.mo49364c(new ApplicationBugException("Unable to load activations!", exc));
        motQrCodeViewerActivity.f39076U.setVisibility(0);
    }
}
