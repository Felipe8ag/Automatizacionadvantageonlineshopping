package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepsdefinitions",
        features = "src/test/Resources/Features/prueba_sqa_3.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PruebaSQA3 {
}
