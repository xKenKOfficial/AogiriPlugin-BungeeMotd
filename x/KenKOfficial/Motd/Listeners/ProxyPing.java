package x.KenKOfficial.Motd.Listeners;

import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.api.ServerPing;
import x.KenKOfficial.Motd.Basic.Main;
import x.KenKOfficial.Motd.Utils.ChatUtil;
import net.md_5.bungee.api.event.ProxyPingEvent;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.md_5.bungee.api.plugin.Listener;

public class ProxyPing implements Listener
{
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ String MOTD_2;
    private static final /* synthetic */ String MOTD_1;
    private static final /* synthetic */ String PREFIX;
    
    private static void ll() {
        (I = new String[ProxyPing.l[6]])[ProxyPing.l[0]] = I("C10Cw1cnVBNK8Qg92j3Kiw==", "MUrMp");
        ProxyPing.I[ProxyPing.l[1]] = l("8MPHG2WG6PI=", "ufFAR");
        ProxyPing.I[ProxyPing.l[2]] = I("jCvYAUisfEa8loIy/zATbg==", "PZdfk");
        ProxyPing.I[ProxyPing.l[3]] = Il("HBMfDgAU", "lazhi");
        ProxyPing.I[ProxyPing.l[4]] = l("fKLVn/c1V1A=", "TYDii");
        ProxyPing.I[ProxyPing.l[5]] = I("83lYsqvAsPw=", "dgQuv");
    }
    
    private static String I(final String IllIlIlllllllll, final String lIlIlIlllllllll) {
        try {
            final SecretKeySpec lIIllIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIllIlllllllll = Cipher.getInstance("Blowfish");
            IIIllIlllllllll.init(ProxyPing.l[2], lIIllIlllllllll);
            return new String(IIIllIlllllllll.doFinal(Base64.getDecoder().decode(IllIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIlllllllll) {
            lllIlIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String Il(String llIlIllllllllll, final String IlIlIllllllllll) {
        llIlIllllllllll = new String(Base64.getDecoder().decode(llIlIllllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIIlIllllllllll = new StringBuilder();
        final char[] IIIlIllllllllll = IlIlIllllllllll.toCharArray();
        int lllIIllllllllll = ProxyPing.l[0];
        final byte lIIIIllllllllll = (Object)llIlIllllllllll.toCharArray();
        final int IIIIIllllllllll = lIIIIllllllllll.length;
        byte lllllIlllllllll = (byte)ProxyPing.l[0];
        while (Ill(lllllIlllllllll, IIIIIllllllllll)) {
            final char IIllIllllllllll = lIIIIllllllllll[lllllIlllllllll];
            lIIlIllllllllll.append((char)(IIllIllllllllll ^ IIIlIllllllllll[lllIIllllllllll % IIIlIllllllllll.length]));
            "".length();
            ++lllIIllllllllll;
            ++lllllIlllllllll;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIlIllllllllll);
    }
    
    private static String l(final String lllIIIlllllllll, final String IIIlIIlllllllll) {
        try {
            final SecretKeySpec IIllIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIIlllllllll.getBytes(StandardCharsets.UTF_8)), ProxyPing.l[7]), "DES");
            final Cipher llIlIIlllllllll = Cipher.getInstance("DES");
            llIlIIlllllllll.init(ProxyPing.l[2], IIllIIlllllllll);
            return new String(llIlIIlllllllll.doFinal(Base64.getDecoder().decode(lllIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIIlllllllll) {
            IlIlIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIl(final Object IlllllIllllllll) {
        return IlllllIllllllll != null;
    }
    
    @EventHandler(priority = 64)
    public void onPing(final ProxyPingEvent lIIllllllllllll) {
        final ServerPing IIIllllllllllll = lIIllllllllllll.getResponse();
        IIIllllllllllll.setDescription(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(ProxyPing.MOTD_1.replace(ProxyPing.I[ProxyPing.l[0]], ProxyPing.PREFIX)).append(ProxyPing.I[ProxyPing.l[1]]).append(ProxyPing.MOTD_2.replace(ProxyPing.I[ProxyPing.l[2]], ProxyPing.PREFIX)))));
        if (lIl(Main.favicon)) {
            IIIllllllllllll.setFavicon(Main.favicon);
        }
        lIIllllllllllll.setResponse(IIIllllllllllll);
    }
    
    private static boolean Ill(final int lIIIIIlllllllll, final int IIIIIIlllllllll) {
        return lIIIIIlllllllll < IIIIIIlllllllll;
    }
    
    private static void IIl() {
        (l = new int[8])[0] = ((103 + 115 - 172 + 178 ^ 87 + 55 + 13 + 43) & (133 + 31 - 124 + 95 ^ 141 + 1 - 20 + 39 ^ -" ".length()) & (((0x58 ^ 0x2D ^ (0x64 ^ 0x71)) & (0x7A ^ 0x5C ^ (0x40 ^ 0x6) ^ -" ".length())) ^ -" ".length()));
        ProxyPing.l[1] = " ".length();
        ProxyPing.l[2] = "  ".length();
        ProxyPing.l[3] = "   ".length();
        ProxyPing.l[4] = (0x31 ^ 0x27 ^ (0x3A ^ 0x28));
        ProxyPing.l[5] = (0x26 ^ 0x3E ^ (0xC ^ 0x11));
        ProxyPing.l[6] = (0x8B ^ 0x9B ^ (0x24 ^ 0x32));
        ProxyPing.l[7] = (0x1C ^ 0x46 ^ (0x7A ^ 0x28));
    }
    
    static {
        IIl();
        ll();
        PREFIX = Main.getPlugin().getConfiguration().getString(ProxyPing.I[ProxyPing.l[3]]);
        MOTD_1 = Main.getPlugin().getConfiguration().getString(ProxyPing.I[ProxyPing.l[4]]);
        MOTD_2 = Main.getPlugin().getConfiguration().getString(ProxyPing.I[ProxyPing.l[5]]);
    }
}
