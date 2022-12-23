package com.google.android.gms.nearby.messages.audio;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import p358af.C13437d;

@Deprecated
public final class AudioBytes {
    public static final int MAX_SIZE = 10;
    private final byte[] zza;

    public AudioBytes(byte[] bArr) {
        boolean z;
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        boolean z2 = true;
        if (length <= 10) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Given byte array longer than 10 bytes, given by AudioBytes.MAX_SIZE.");
        Preconditions.checkArgument(length <= 0 ? false : z2, "Given byte array is of zero length.");
        this.zza = bArr;
    }

    public static AudioBytes from(Message message) {
        Preconditions.checkNotNull(message);
        boolean zza2 = message.zza(Message.MESSAGE_TYPE_AUDIO_BYTES);
        String type = message.getType();
        Preconditions.checkArgument(zza2, "Message type '" + type + "' is not Message.MESSAGE_TYPE_AUDIO_BYTES.");
        return new AudioBytes(message.getContent());
    }

    public byte[] getBytes() {
        return this.zza;
    }

    public Message toMessage() {
        return new Message(this.zza, Message.MESSAGE_NAMESPACE_RESERVED, Message.MESSAGE_TYPE_AUDIO_BYTES);
    }

    public String toString() {
        return C13437d.m33706k("AudioBytes [", Arrays.toString(this.zza), " ]");
    }
}
