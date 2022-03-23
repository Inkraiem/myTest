package openGoogle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class TestOpenGooglejava {
    @Test
    public void testGoogle(){
        WebDriverManager.edgedriver().setup();
        EdgeDriver edge = new EdgeDriver();
        edge.get("https://www.google.com/");
    }
}
