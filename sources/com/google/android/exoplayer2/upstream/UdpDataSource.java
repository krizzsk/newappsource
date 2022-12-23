package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import p265tb.C6651d;
import p265tb.C6657i;

public final class UdpDataSource extends C6651d {

    /* renamed from: e */
    public final int f14598e = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

    /* renamed from: f */
    public final byte[] f14599f;

    /* renamed from: g */
    public final DatagramPacket f14600g;

    /* renamed from: h */
    public Uri f14601h;

    /* renamed from: i */
    public DatagramSocket f14602i;

    /* renamed from: j */
    public MulticastSocket f14603j;

    /* renamed from: k */
    public InetAddress f14604k;

    /* renamed from: l */
    public InetSocketAddress f14605l;

    /* renamed from: m */
    public boolean f14606m;

    /* renamed from: n */
    public int f14607n;

    public static final class UdpDataSourceException extends IOException {
        public UdpDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public UdpDataSource() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f14599f = bArr;
        this.f14600g = new DatagramPacket(bArr, 0, 2000);
    }

    public final void close() {
        this.f14601h = null;
        MulticastSocket multicastSocket = this.f14603j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f14604k);
            } catch (IOException unused) {
            }
            this.f14603j = null;
        }
        DatagramSocket datagramSocket = this.f14602i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14602i = null;
        }
        this.f14604k = null;
        this.f14605l = null;
        this.f14607n = 0;
        if (this.f14606m) {
            this.f14606m = false;
            mo22822l();
        }
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws UdpDataSourceException {
        Uri uri = iVar.f20668a;
        this.f14601h = uri;
        String host = uri.getHost();
        int port = this.f14601h.getPort();
        mo22823m(iVar);
        try {
            this.f14604k = InetAddress.getByName(host);
            this.f14605l = new InetSocketAddress(this.f14604k, port);
            if (this.f14604k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f14605l);
                this.f14603j = multicastSocket;
                multicastSocket.joinGroup(this.f14604k);
                this.f14602i = this.f14603j;
            } else {
                this.f14602i = new DatagramSocket(this.f14605l);
            }
            try {
                this.f14602i.setSoTimeout(this.f14598e);
                this.f14606m = true;
                mo22824n(iVar);
                return -1;
            } catch (SocketException e) {
                throw new UdpDataSourceException(e);
            }
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2);
        }
    }

    public final Uri getUri() {
        return this.f14601h;
    }

    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f14607n == 0) {
            try {
                this.f14602i.receive(this.f14600g);
                int length = this.f14600g.getLength();
                this.f14607n = length;
                mo22821k(length);
            } catch (IOException e) {
                throw new UdpDataSourceException(e);
            }
        }
        int length2 = this.f14600g.getLength();
        int i3 = this.f14607n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f14599f, length2 - i3, bArr, i, min);
        this.f14607n -= min;
        return min;
    }
}
