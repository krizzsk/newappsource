package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f4016a = 0;

    /* renamed from: b */
    public int f4017b = 0;

    /* renamed from: c */
    public int f4018c = 0;

    /* renamed from: d */
    public int f4019d = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4017b != audioAttributesImplBase.f4017b) {
            return false;
        }
        int i = this.f4018c;
        int i2 = audioAttributesImplBase.f4018c;
        int i3 = audioAttributesImplBase.f4019d;
        int i4 = 4;
        if (i3 == -1) {
            int i5 = audioAttributesImplBase.f4016a;
            int i6 = AudioAttributesCompat.f4012b;
            if ((i2 & 1) != 1) {
                if ((i2 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i4 = 0;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 2;
                            break;
                        case 11:
                            i4 = 10;
                            break;
                        case 13:
                            i4 = 1;
                            break;
                        default:
                            i4 = 3;
                            break;
                    }
                } else {
                    i4 = 6;
                }
            } else {
                i4 = 7;
            }
        } else {
            i4 = i3;
        }
        if (i4 == 6) {
            i2 |= 4;
        } else if (i4 == 7) {
            i2 |= 1;
        }
        if (i == (i2 & 273) && this.f4016a == audioAttributesImplBase.f4016a && this.f4019d == i3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4017b), Integer.valueOf(this.f4018c), Integer.valueOf(this.f4016a), Integer.valueOf(this.f4019d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4019d != -1) {
            sb.append(" stream=");
            sb.append(this.f4019d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f4016a;
        int i2 = AudioAttributesCompat.f4012b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = C16759e.m42349e("unknown usage ", i);
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f4017b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4018c).toUpperCase());
        return sb.toString();
    }
}
