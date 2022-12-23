package android.support.p015v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p015v4.media.MediaMetadataCompat;
import android.support.p015v4.media.session.C0177c;
import android.support.p015v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.session.a */
public interface C0172a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    public static abstract class C0173a extends Binder implements C0172a {
        public C0173a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        C0177c cVar = ((C0177c.C0179b) this).f487b.get();
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo570g();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            PlaybackStateCompat createFromParcel = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        C0177c cVar2 = ((C0177c.C0179b) this).f487b.get();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            MediaMetadataCompat createFromParcel2 = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo567B();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                        mo572y();
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        mo568b();
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo569e();
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo571l(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        C0177c cVar3 = ((C0177c.C0179b) this).f487b.get();
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        C0177c cVar4 = ((C0177c.C0179b) this).f487b.get();
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        C0177c cVar5 = ((C0177c.C0179b) this).f487b.get();
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        C0177c cVar6 = ((C0177c.C0179b) this).f487b.get();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
        }
    }

    /* renamed from: B */
    void mo567B() throws RemoteException;

    /* renamed from: b */
    void mo568b() throws RemoteException;

    /* renamed from: e */
    void mo569e() throws RemoteException;

    /* renamed from: g */
    void mo570g() throws RemoteException;

    /* renamed from: l */
    void mo571l(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: y */
    void mo572y() throws RemoteException;
}
