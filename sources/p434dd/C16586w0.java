package p434dd;

/* renamed from: dd.w0 */
public abstract class C16586w0 extends C16562k0 {
    public C16586w0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r7v10, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49339G(int r6, android.os.Parcel r7) throws android.os.RemoteException {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            if (r6 == r0) goto L_0x006f
            r0 = 3
            r4 = 0
            if (r6 == r0) goto L_0x000c
            return r4
        L_0x000c:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = p434dd.C16564l0.m42065a(r7, r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            android.os.IInterface r7 = r6.queryLocalInterface(r3)
            boolean r0 = r7 instanceof p434dd.C16588x0
            if (r0 == 0) goto L_0x0027
            r2 = r7
            dd.x0 r2 = (p434dd.C16588x0) r2
            goto L_0x002c
        L_0x0027:
            dd.x0 r2 = new dd.x0
            r2.<init>(r6)
        L_0x002c:
            r6 = r5
            com.google.android.play.core.assetpacks.v r6 = (com.google.android.play.core.assetpacks.C14326v) r6
            androidx.appcompat.app.r r7 = r6.f36075b
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = "clearAssetPackStorage AIDL call"
            r7.mo974a(r3, r0)
            android.content.Context r7 = r6.f36076c
            boolean r7 = p434dd.C16589y.m42106b(r7)
            if (r7 == 0) goto L_0x0066
            android.content.Context r7 = r6.f36076c
            boolean r7 = p434dd.C16589y.m42105a(r7)
            if (r7 != 0) goto L_0x0049
            goto L_0x0066
        L_0x0049:
            com.google.android.play.core.assetpacks.a0 r6 = r6.f36077d
            java.io.File r6 = r6.mo42789d()
            com.google.android.play.core.assetpacks.C14243a0.m35459g(r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            android.os.Parcel r7 = r2.mo49332G()
            r7.writeInt(r1)
            r6.writeToParcel(r7, r4)
            r6 = 4
            r2.mo49333H(r6, r7)
            goto L_0x0095
        L_0x0066:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r2.zzd(r6)
            goto L_0x0095
        L_0x006f:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = p434dd.C16564l0.m42065a(r7, r6)
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 != 0) goto L_0x007e
            goto L_0x008f
        L_0x007e:
            android.os.IInterface r0 = r7.queryLocalInterface(r3)
            boolean r2 = r0 instanceof p434dd.C16588x0
            if (r2 == 0) goto L_0x008a
            r2 = r0
            dd.x0 r2 = (p434dd.C16588x0) r2
            goto L_0x008f
        L_0x008a:
            dd.x0 r2 = new dd.x0
            r2.<init>(r7)
        L_0x008f:
            r7 = r5
            com.google.android.play.core.assetpacks.v r7 = (com.google.android.play.core.assetpacks.C14326v) r7
            r7.mo42901H(r6, r2)
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p434dd.C16586w0.mo49339G(int, android.os.Parcel):boolean");
    }
}
