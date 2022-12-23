package p434dd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C14278j;
import com.google.android.play.core.assetpacks.C14310r;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;

/* renamed from: dd.u0 */
public abstract class C16582u0 extends C16562k0 implements C16584v0 {
    public C16582u0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* renamed from: G */
    public final boolean mo49339G(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR);
                C14278j jVar = (C14278j) this;
                jVar.f35917c.f36012d.mo49337c(jVar.f35916b);
                C14310r.f36007g.mo977d("onStartDownload(%d)", Integer.valueOf(readInt));
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR);
                C14278j jVar2 = (C14278j) this;
                jVar2.f35917c.f36012d.mo49337c(jVar2.f35916b);
                C14310r.f36007g.mo977d("onCancelDownload(%d)", Integer.valueOf(readInt2));
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR);
                C14278j jVar3 = (C14278j) this;
                jVar3.f35917c.f36012d.mo49337c(jVar3.f35916b);
                C14310r.f36007g.mo977d("onGetSession(%d)", Integer.valueOf(readInt3));
                break;
            case 5:
                mo42843A(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C16564l0.m42065a(parcel, creator);
                Bundle bundle5 = (Bundle) C16564l0.m42065a(parcel, creator);
                C14278j jVar4 = (C14278j) this;
                jVar4.f35917c.f36012d.mo49337c(jVar4.f35916b);
                C14310r.f36007g.mo977d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt(GetBrowserSessionContextCommand.KEY_SESSION_ID)));
                break;
            case 7:
                zzd((Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C16564l0.m42065a(parcel, creator2);
                Bundle bundle7 = (Bundle) C16564l0.m42065a(parcel, creator2);
                C14278j jVar5 = (C14278j) this;
                jVar5.f35917c.f36012d.mo49337c(jVar5.f35916b);
                C14310r.f36007g.mo977d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt(GetBrowserSessionContextCommand.KEY_SESSION_ID)));
                break;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) C16564l0.m42065a(parcel, creator3);
                C14278j jVar6 = (C14278j) this;
                jVar6.f35917c.f36012d.mo49337c(jVar6.f35916b);
                C14310r.f36007g.mo977d("onNotifySessionFailed(%d)", Integer.valueOf(((Bundle) C16564l0.m42065a(parcel, creator3)).getInt(GetBrowserSessionContextCommand.KEY_SESSION_ID)));
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo42844i((Bundle) C16564l0.m42065a(parcel, creator4), (Bundle) C16564l0.m42065a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo42845m((Bundle) C16564l0.m42065a(parcel, creator5), (Bundle) C16564l0.m42065a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) C16564l0.m42065a(parcel, creator6);
                Bundle bundle10 = (Bundle) C16564l0.m42065a(parcel, creator6);
                C14278j jVar7 = (C14278j) this;
                jVar7.f35917c.f36012d.mo49337c(jVar7.f35916b);
                C14310r.f36007g.mo977d("onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) C16564l0.m42065a(parcel, creator7);
                Bundle bundle12 = (Bundle) C16564l0.m42065a(parcel, creator7);
                C14278j jVar8 = (C14278j) this;
                jVar8.f35917c.f36012d.mo49337c(jVar8.f35916b);
                C14310r.f36007g.mo977d("onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) C16564l0.m42065a(parcel, Bundle.CREATOR);
                C14278j jVar9 = (C14278j) this;
                jVar9.f35917c.f36012d.mo49337c(jVar9.f35916b);
                C14310r.f36007g.mo977d("onCancelDownloads()", new Object[0]);
                break;
            default:
                return false;
        }
        return true;
    }
}
