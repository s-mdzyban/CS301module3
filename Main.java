import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(
                FigletFont.convertOneLine("Hello CS301")
                     //  String asciiArt = FigletFont.convertOneLine("Hello CS301");
        //System.out.println(asciiArt);
        );
    }   
}
