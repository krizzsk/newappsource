package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ClientInfo;
import p263t9.C6607a;

/* renamed from: com.google.android.datatransport.cct.internal.b */
public final class C3863b extends ClientInfo {

    /* renamed from: a */
    public final ClientInfo.ClientType f13381a;

    /* renamed from: b */
    public final C6607a f13382b;

    public C3863b(ClientInfo.ClientType clientType, C6607a aVar) {
        this.f13381a = clientType;
        this.f13382b = aVar;
    }

    /* renamed from: a */
    public final C6607a mo15755a() {
        return this.f13382b;
    }

    /* renamed from: b */
    public final ClientInfo.ClientType mo15756b() {
        return this.f13381a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f13381a;
        if (clientType != null ? clientType.equals(clientInfo.mo15756b()) : clientInfo.mo15756b() == null) {
            C6607a aVar = this.f13382b;
            if (aVar == null) {
                if (clientInfo.mo15755a() == null) {
                    return true;
                }
            } else if (aVar.equals(clientInfo.mo15755a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        ClientInfo.ClientType clientType = this.f13381a;
        int i2 = 0;
        if (clientType == null) {
            i = 0;
        } else {
            i = clientType.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C6607a aVar = this.f13382b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ClientInfo{clientType=");
        k.append(this.f13381a);
        k.append(", androidClientInfo=");
        k.append(this.f13382b);
        k.append("}");
        return k.toString();
    }
}
