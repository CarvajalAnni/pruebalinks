package co.com.p.links.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PLinksHome {

    public static final Target BTN_ELEMENTS = Target.the("Botón de opcion de elementos").located(By.xpath(""));
    public static final Target BTN_LINKS = Target.the("Botón de opcion de elementos").located(By.xpath(""));
    public static final Target LNK_CREATED = Target.the("link de status 201").located(By.xpath(""));
    public static final Target LNK_NOCONTENT = Target.the("link de status 204").located(By.xpath(""));
    public static final Target LNK_MOVED = Target.the("link de status 301").located(By.xpath(""));
    public static final Target LNK_BADREQUEST = Target.the("link de status 400").located(By.xpath(""));
    public static final Target LNK_UNAUTHORIZED = Target.the("link de status 401").located(By.xpath(""));
    public static final Target LNK_FORBIDDEN = Target.the("link de status 203").located(By.xpath(""));
    public static final Target LNK_NOTFOUND = Target.the("link de status 204").located(By.xpath(""));
}
