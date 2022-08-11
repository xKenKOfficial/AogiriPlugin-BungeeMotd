package x.KenKOfficial.Motd.Utils;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChatUtil
{
    private static final /* synthetic */ int[] lIl;
    private static final /* synthetic */ String[] IIl;
    
    private static void IllIl() {
        (lIl = new int[9])[0] = ((0x3E ^ 0x76) & ~(0xF6 ^ 0xBE));
        ChatUtil.lIl[1] = " ".length();
        ChatUtil.lIl[2] = "  ".length();
        ChatUtil.lIl[3] = "   ".length();
        ChatUtil.lIl[4] = (35 + 142 - 18 + 0 ^ 11 + 79 + 56 + 9);
        ChatUtil.lIl[5] = (0x37 ^ 0x32);
        ChatUtil.lIl[6] = (0xB4 ^ 0xB2);
        ChatUtil.lIl[7] = (0xAF ^ 0xA8);
        ChatUtil.lIl[8] = (0xC ^ 0x4);
    }
    
    static {
        IllIl();
        lIlIl();
    }
    
    private static String IlIIl(final String IIlIIIIIlllllll, final String llIIIIIIlllllll) {
        try {
            final SecretKeySpec lllIIIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIl[8]), "DES");
            final Cipher IllIIIIIlllllll = Cipher.getInstance("DES");
            IllIIIIIlllllll.init(ChatUtil.lIl[2], lllIIIIIlllllll);
            return new String(IllIIIIIlllllll.doFinal(Base64.getDecoder().decode(IIlIIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIIlllllll) {
            lIlIIIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIl(String lIIIIlIIlllllll, final String IIIIIlIIlllllll) {
        lIIIIlIIlllllll = (byte)new String(Base64.getDecoder().decode(((String)lIIIIlIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIIlIIlllllll = new StringBuilder();
        final char[] llIIIlIIlllllll = IIIIIlIIlllllll.toCharArray();
        int IlIIIlIIlllllll = ChatUtil.lIl[0];
        final short IIlllIIIlllllll = (Object)((String)lIIIIlIIlllllll).toCharArray();
        final long llIllIIIlllllll = IIlllIIIlllllll.length;
        boolean IlIllIIIlllllll = ChatUtil.lIl[0] != 0;
        while (lllIl(IlIllIIIlllllll ? 1 : 0, (int)llIllIIIlllllll)) {
            final char lllIIlIIlllllll = IIlllIIIlllllll[IlIllIIIlllllll];
            IIlIIlIIlllllll.append((char)(lllIIlIIlllllll ^ llIIIlIIlllllll[IlIIIlIIlllllll % llIIIlIIlllllll.length]));
            "".length();
            ++IlIIIlIIlllllll;
            ++IlIllIIIlllllll;
            "".length();
            if (((0x5D ^ 0x4E ^ (0x73 ^ 0x2A)) & (116 + 138 - 69 + 11 ^ 117 + 118 - 216 + 123 ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(IIlIIlIIlllllll);
    }
    
    public static String fixColor(final String lIIIllIIlllllll) {
        return lIIIllIIlllllll.replaceAll(ChatUtil.IIl[ChatUtil.lIl[0]], ChatUtil.IIl[ChatUtil.lIl[1]]).replace(ChatUtil.IIl[ChatUtil.lIl[2]], ChatUtil.IIl[ChatUtil.lIl[3]]).replace(ChatUtil.IIl[ChatUtil.lIl[4]], ChatUtil.IIl[ChatUtil.lIl[5]]).replace(ChatUtil.IIl[ChatUtil.lIl[6]], ChatUtil.IIl[ChatUtil.lIl[7]]);
    }
    
    private static String IIlIl(final String llllIIIIlllllll, final String IlllIIIIlllllll) {
        try {
            final SecretKeySpec IIlIlIIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllIIIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIlIIIlllllll = Cipher.getInstance("Blowfish");
            llIIlIIIlllllll.init(ChatUtil.lIl[2], IIlIlIIIlllllll);
            return new String(llIIlIIIlllllll.doFinal(Base64.getDecoder().decode(llllIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIlIIIlllllll) {
            IlIIlIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIl(final int IIllllllIllllll, final int llIlllllIllllll) {
        return IIllllllIllllll < llIlllllIllllll;
    }
    
    private static void lIlIl() {
        (IIl = new String[ChatUtil.lIl[8]])[ChatUtil.lIl[0]] = IlIIl("HiATNq3AZTE=", "qkXxO");
        ChatUtil.IIl[ChatUtil.lIl[1]] = llIIl("w48=", "hEWEh");
        ChatUtil.IIl[ChatUtil.lIl[2]] = IlIIl("qXUajKAnrIo=", "XKYPL");
        ChatUtil.IIl[ChatUtil.lIl[3]] = IlIIl("mKI0F2C3xZE=", "YmGUK");
        ChatUtil.IIl[ChatUtil.lIl[4]] = llIIl("UWk=", "mUGIN");
        ChatUtil.IIl[ChatUtil.lIl[5]] = llIIl("w4Q=", "oSvNg");
        ChatUtil.IIl[ChatUtil.lIl[6]] = IIlIl("70+xLxaXCmY=", "Epjke");
        ChatUtil.IIl[ChatUtil.lIl[7]] = IIlIl("cc4z7BEb6Vs=", "ZebxI");
    }
}
