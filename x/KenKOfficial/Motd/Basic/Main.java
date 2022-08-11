package x.KenKOfficial.Motd.Basic;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import net.md_5.bungee.api.plugin.Listener;
import x.KenKOfficial.Motd.Listeners.ProxyPing;
import java.io.OutputStream;
import java.io.InputStream;
import com.google.common.io.ByteStreams;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.md_5.bungee.api.Favicon;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin
{
    private static final /* synthetic */ String[] Il;
    private static final /* synthetic */ int[] ll;
    private /* synthetic */ Configuration configuration;
    private static /* synthetic */ Main plugin;
    public static /* synthetic */ Favicon favicon;
    
    private static boolean lIll(final int lllIllIIlllllll) {
        return lllIllIIlllllll == 0;
    }
    
    private static boolean Illl(final Object lIllllIIlllllll) {
        return lIllllIIlllllll != null;
    }
    
    private static boolean llll(final Object llIlllIIlllllll) {
        return llIlllIIlllllll == null;
    }
    
    private static boolean IIIIl(final Object IIIIIIlIlllllll, final Object llllllIIlllllll) {
        return IIIIIIlIlllllll != llllllIIlllllll;
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        System.out.println(Main.Il[Main.ll[0]]);
        System.out.println(this.getDescription().getName());
        System.out.println(String.valueOf(new StringBuilder().append(Main.Il[Main.ll[1]]).append(this.getDescription().getVersion())));
        System.out.println(Main.Il[Main.ll[2]]);
        System.out.println(Main.Il[Main.ll[3]]);
        System.out.println(Main.Il[Main.ll[4]]);
        System.out.println(Main.Il[Main.ll[5]]);
    }
    
    private static String lIIl(final String lllIlIlIlllllll, final String IIIllIlIlllllll) {
        try {
            final SecretKeySpec IIlllIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIllIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIllIlIlllllll = Cipher.getInstance("Blowfish");
            llIllIlIlllllll.init(Main.ll[2], IIlllIlIlllllll);
            return new String(llIllIlIlllllll.doFinal(Base64.getDecoder().decode(lllIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIlIlllllll) {
            IlIllIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIIl(String lIIlIllIlllllll, final String IIIlIllIlllllll) {
        lIIlIllIlllllll = new String(Base64.getDecoder().decode(lIIlIllIlllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllIllIlllllll = new StringBuilder();
        final char[] llIlIllIlllllll = IIIlIllIlllllll.toCharArray();
        int IlIlIllIlllllll = Main.ll[0];
        final double IIlIIllIlllllll = (Object)lIIlIllIlllllll.toCharArray();
        final String llIIIllIlllllll = (String)IIlIIllIlllllll.length;
        int IlIIIllIlllllll = Main.ll[0];
        while (lIIIl(IlIIIllIlllllll, (int)llIIIllIlllllll)) {
            final char llllIllIlllllll = IIlIIllIlllllll[IlIIIllIlllllll];
            IIllIllIlllllll.append((char)(llllIllIlllllll ^ llIlIllIlllllll[IlIlIllIlllllll % llIlIllIlllllll.length]));
            "".length();
            ++IlIlIllIlllllll;
            ++IlIIIllIlllllll;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(IIllIllIlllllll);
    }
    
    static {
        llIl();
        IlIl();
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    public Configuration getConfiguration() {
        try {
            this.configuration = ConfigurationProvider.getProvider((Class)YamlConfiguration.class).load(new File(this.getDataFolder(), Main.Il[Main.ll[13]]));
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        catch (IOException llllIlIllllllll) {
            throw new RuntimeException(llllIlIllllllll);
        }
        return this.configuration;
    }
    
    private static String lll(final String IIllIIlIlllllll, final String lIIlIIlIlllllll) {
        try {
            final SecretKeySpec llllIIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIIlIlllllll.getBytes(StandardCharsets.UTF_8)), Main.ll[8]), "DES");
            final Cipher IlllIIlIlllllll = Cipher.getInstance("DES");
            IlllIIlIlllllll.init(Main.ll[2], llllIIlIlllllll);
            return new String(IlllIIlIlllllll.doFinal(Base64.getDecoder().decode(IIllIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIlIlllllll) {
            lIllIIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIll(final int lIIlllIIlllllll) {
        return lIIlllIIlllllll != 0;
    }
    
    private void saveDefaultConfig() {
        if (lIll(this.getDataFolder().exists() ? 1 : 0)) {
            this.getDataFolder().mkdir();
            "".length();
        }
        final File llIIIIIllllllll = new File(this.getDataFolder(), Main.Il[Main.ll[20]]);
        if (lIll(llIIIIIllllllll.exists() ? 1 : 0)) {
            try {
                llIIIIIllllllll.createNewFile();
                "".length();
                Throwable IllIIIIllllllll = null;
                try {
                    final InputStream llIlIIIllllllll = this.getResourceAsStream(Main.Il[Main.ll[21]]);
                    try {
                        final OutputStream IIIIlIIllllllll = new FileOutputStream(llIIIIIllllllll);
                        try {
                            ByteStreams.copy(llIlIIIllllllll, IIIIlIIllllllll);
                            if (Illl(IIIIlIIllllllll)) {
                                IIIIlIIllllllll.close();
                                "".length();
                                if ((0x8A ^ 0x8E) == 0x0) {
                                    return;
                                }
                            }
                        }
                        finally {
                            if (Illl(IIIIlIIllllllll)) {
                                IIIIlIIllllllll.close();
                            }
                        }
                        if (Illl(llIlIIIllllllll)) {
                            llIlIIIllllllll.close();
                        }
                        if (llll(IllIIIIllllllll)) {
                            final Throwable llllIIIllllllll = IllIIIIllllllll = new Throwable();
                            "".length();
                            if ("   ".length() >= (105 + 89 - 175 + 111 ^ 118 + 29 - 72 + 59)) {
                                return;
                            }
                        }
                        else {
                            final Throwable IlllIIIllllllll = new Throwable();
                            if (IIIIl(IllIIIIllllllll, IlllIIIllllllll)) {
                                IllIIIIllllllll.addSuppressed(IlllIIIllllllll);
                            }
                        }
                        if (Illl(llIlIIIllllllll)) {
                            llIlIIIllllllll.close();
                            "".length();
                            if (((0xA8 ^ 0x9D) & ~(0x4B ^ 0x7E)) != 0x0) {
                                return;
                            }
                        }
                    }
                    finally {
                        if (llll(IllIIIIllllllll)) {
                            final Throwable lIllIIIllllllll = IllIIIIllllllll = new Throwable();
                            "".length();
                            if (((0xA0 ^ 0x92) & ~(0xBF ^ 0x8D)) >= (0x42 ^ 0x46)) {
                                return;
                            }
                        }
                        else {
                            final Throwable IIllIIIllllllll = new Throwable();
                            if (IIIIl(IllIIIIllllllll, IIllIIIllllllll)) {
                                IllIIIIllllllll.addSuppressed(IIllIIIllllllll);
                            }
                        }
                        if (Illl(llIlIIIllllllll)) {
                            llIlIIIllllllll.close();
                        }
                    }
                    if (llll(IllIIIIllllllll)) {
                        final Throwable IlIlIIIllllllll = IllIIIIllllllll = new Throwable();
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        final Throwable lIIlIIIllllllll = new Throwable();
                        if (IIIIl(IllIIIIllllllll, lIIlIIIllllllll)) {
                            IllIIIIllllllll.addSuppressed(lIIlIIIllllllll);
                        }
                        "".length();
                        if (" ".length() >= (143 + 111 - 219 + 132 ^ 151 + 158 - 263 + 117)) {
                            return;
                        }
                    }
                }
                finally {
                    if (llll(IllIIIIllllllll)) {
                        final Throwable IIIlIIIllllllll = IllIIIIllllllll = new Throwable();
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                    else {
                        final Throwable lllIIIIllllllll = new Throwable();
                        if (IIIIl(IllIIIIllllllll, lllIIIIllllllll)) {
                            IllIIIIllllllll.addSuppressed(lllIIIIllllllll);
                        }
                    }
                }
                "".length();
                if ((122 + 162 - 250 + 157 ^ 33 + 74 + 24 + 56) < "   ".length()) {
                    return;
                }
            }
            catch (IOException lIlIIIIllllllll) {
                throw new RuntimeException(Main.Il[Main.ll[22]], lIlIIIIllllllll);
            }
        }
    }
    
    private static boolean lIIIl(final int IIlIIIlIlllllll, final int llIIIIlIlllllll) {
        return IIlIIIlIlllllll < llIIIIlIlllllll;
    }
    
    protected void saveConfig() {
        try {
            ConfigurationProvider.getProvider((Class)YamlConfiguration.class).save(this.getConfiguration(), new File(this.getDataFolder(), Main.Il[Main.ll[18]]));
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        catch (IOException IllllIIllllllll) {
            throw new RuntimeException(Main.Il[Main.ll[19]], IllllIIllllllll);
        }
    }
    
    private void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.Il[Main.ll[12]]).append(this.getDescription().getName())));
        this.getProxy().getPluginManager().registerListener((Plugin)this, (Listener)new ProxyPing());
    }
    
    public static Favicon getFavicon() {
        return Main.favicon;
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.Il[Main.ll[6]]);
        System.out.println(this.getDescription().getName());
        System.out.println(String.valueOf(new StringBuilder().append(Main.Il[Main.ll[7]]).append(this.getDescription().getVersion())));
        System.out.println(Main.Il[Main.ll[8]]);
        System.out.println(Main.Il[Main.ll[9]]);
        System.out.println(Main.Il[Main.ll[10]]);
        System.out.println(Main.Il[Main.ll[11]]);
    }
    
    private static void llIl() {
        (ll = new int[24])[0] = ((0x3B ^ 0x43 ^ (0x7F ^ 0x16)) & (140 + 89 - 56 + 41 ^ 172 + 145 - 262 + 144 ^ -" ".length()));
        Main.ll[1] = " ".length();
        Main.ll[2] = "  ".length();
        Main.ll[3] = "   ".length();
        Main.ll[4] = (0x6 ^ 0x44 ^ (0x1A ^ 0x5C));
        Main.ll[5] = (0xBD ^ 0xB8);
        Main.ll[6] = (0xEF ^ 0x9B ^ (0x10 ^ 0x62));
        Main.ll[7] = (0x0 ^ 0x7);
        Main.ll[8] = (55 + 141 - 26 + 4 ^ 9 + 50 - 37 + 144);
        Main.ll[9] = (0x6A ^ 0x20 ^ (0x86 ^ 0xC5));
        Main.ll[10] = (0x81 ^ 0x8B);
        Main.ll[11] = (0x35 ^ 0x3E);
        Main.ll[12] = (0x46 ^ 0x4A);
        Main.ll[13] = (0x16 ^ 0x1B);
        Main.ll[14] = (0x46 ^ 0x48);
        Main.ll[15] = (0x1D ^ 0x12);
        Main.ll[16] = (0x9B ^ 0xB9 ^ (0x46 ^ 0x74));
        Main.ll[17] = (0x40 ^ 0x26 ^ (0xE7 ^ 0x90));
        Main.ll[18] = (54 + 35 - 38 + 96 ^ 10 + 40 - 7 + 86);
        Main.ll[19] = (0xB8 ^ 0xAB);
        Main.ll[20] = (98 + 92 - 81 + 49 ^ 74 + 117 - 105 + 52);
        Main.ll[21] = (0xDA ^ 0xB1 ^ (0xC7 ^ 0xB9));
        Main.ll[22] = (138 + 163 - 238 + 126 ^ 0 + 76 - 11 + 106);
        Main.ll[23] = (0xAD ^ 0xBA);
    }
    
    protected void reloadConfig() {
        try {
            this.configuration = ConfigurationProvider.getProvider((Class)YamlConfiguration.class).load(new File(this.getDataFolder(), Main.Il[Main.ll[14]]));
            "".length();
            if (((0x44 ^ 0x51 ^ (0x17 ^ 0x4)) & (0x57 ^ 0x5A ^ (0x5C ^ 0x57) ^ -" ".length())) != ((0x2F ^ 0x5A ^ (0x2C ^ 0x54)) & (0x57 ^ 0x2D ^ (0x13 ^ 0x64) ^ -" ".length()))) {
                return;
            }
        }
        catch (IOException IIIlIlIllllllll) {
            throw new RuntimeException(Main.Il[Main.ll[15]], IIIlIlIllllllll);
        }
        final File IIlIIlIllllllll = new File(this.getDataFolder(), Main.Il[Main.ll[16]]);
        if (IIll(IIlIIlIllllllll.exists() ? 1 : 0)) {
            try {
                final BufferedImage lllIIlIllllllll = ImageIO.read(IIlIIlIllllllll);
                "".length();
                Main.favicon = Favicon.create(lllIIlIllllllll);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return;
                }
            }
            catch (IOException IllIIlIllllllll) {
                this.getLogger().warning(Main.Il[Main.ll[17]]);
            }
        }
    }
    
    private static void IlIl() {
        (Il = new String[Main.ll[23]])[Main.ll[0]] = lll("DX9/sKTnyNQNf3+wpOfI1A1/f7Ck58jUDX9/sKTnyNQNf3+wpOfI1A1/f7Ck58jUDX9/sKTnyNQvjwmy59QPZw==", "jcdbz");
        Main.Il[Main.ll[1]] = lll("g1QV+OeqcgV9ZmBG7sVnmA==", "mGuxd");
        Main.Il[Main.ll[2]] = IIIl("Kx02LBkKByNtLA8aNywBDRQjLgcFVGJ8X0peemNfVFxwP0NECS0pF0pOcn1XUFg=", "dnBMm");
        Main.Il[Main.ll[3]] = lll("rKmowVu8dE2uQe/HqH5oUQ==", "ZUtYb");
        Main.Il[Main.ll[4]] = lIIl("D4gyTXaVFWllobsuWdmoc7SSTBndRrH2CWvQHj2V0fCm9dmnCYPQxAf6AT2nuYoi/Mtci4VBC1B2KCo/cs9xsQ==", "MmuAl");
        Main.Il[Main.ll[5]] = lIIl("oPU6iuSI7bqg9TqK5IjtuqD1OorkiO26oPU6iuSI7bqg9TqK5IjtuqD1OorkiO26oPU6iuSI7bq3SWisScm52A==", "xkTxz");
        Main.Il[Main.ll[6]] = lIIl("7uD57iP8OoTu4PnuI/w6hO7g+e4j/DqE7uD57iP8OoTu4PnuI/w6hO7g+e4j/DqE7uD57iP8OoTEE/Pz6ZKf6A==", "JItqC");
        Main.Il[Main.ll[7]] = IIIl("OwQoKwINW3o=", "laZXh");
        Main.Il[Main.ll[8]] = IIIl("Ij0dEB0DJwhRKAY6HBAFBDQIEgMMdElAW0N+UV9bXXxbA0dNKQYVE0NuWUFTWXg=", "mNiqi");
        Main.Il[Main.ll[9]] = IIIl("AgoDEQoyFg4fFicBAA==", "Foypa");
        Main.Il[Main.ll[10]] = lIIl("2TyEHOOe/eex03xDd82Ywvw0rA0sx0c/WKWoid+whPU7WW7el97I1T3spajXFu9MMpSsTajKovhHL0fSJYu9Vw==", "MQstX");
        Main.Il[Main.ll[11]] = lIIl("k9VqL0jp0cyT1WovSOnRzJPVai9I6dHMk9VqL0jp0cyT1WovSOnRzJPVai9I6dHMk9VqL0jp0cx/XGA7nQyyIg==", "NmrqL");
        Main.Il[Main.ll[12]] = lIIl("haY6iwbcewiG4iO5BR0fAnjb9RAi8XHpHNkY/j1GFlo=", "sgXia");
        Main.Il[Main.ll[13]] = lll("mp1Cg1PqutdwYr2rBCRU7Q==", "jnCgS");
        Main.Il[Main.ll[14]] = IIIl("OR8MCg49XhsBCw==", "Zpblg");
        Main.Il[Main.ll[15]] = lll("RYl1NdfVtkZEgRMTUxdMaTMtvDJgrbFZ/e3CqNvB+OA=", "FwqfJ");
        Main.Il[Main.ll[16]] = lll("4keF8RDT1QJ8WD8fFFY3vQ==", "XcyKK");
        Main.Il[Main.ll[17]] = IIIl("JQwHIBkMA1EvEw8IUSAJQwQfPxsPBBVpFRFNHCAJEAQfLlQ=", "cmqIz");
        Main.Il[Main.ll[18]] = lll("+m152nxlx6r30fXS2nCtKA==", "KqetN");
        Main.Il[Main.ll[19]] = IIIl("BDgKCT80dh8EcyI3HQ5zMjkFDTo2IxkKJzg5BQ==", "QVkkS");
        Main.Il[Main.ll[20]] = IIIl("IBwMIQokXRsqDw==", "CsbGc");
        Main.Il[Main.ll[21]] = lll("QfJfZT5CQeYvNS00IryAeg==", "ekRix");
        Main.Il[Main.ll[22]] = lll("izQj5ag7fsTL2ckEZ3g4rxifA9O+IowggNk6ybArZRMFesSSGTfY+Q==", "wghoL");
    }
}
