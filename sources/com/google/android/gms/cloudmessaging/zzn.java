package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

final class zzn {
    private final Messenger zza;
    private final zzd zzb;

    public zzn(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zza = new Messenger(iBinder);
            this.zzb = null;
        } else if (IMessengerCompat.DESCRIPTOR.equals(interfaceDescriptor)) {
            this.zzb = new zzd(iBinder);
            this.zza = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    public final void zza(Message message) throws RemoteException {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzd = this.zzb;
        if (zzd != null) {
            zzd.zzb(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
