package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "stepsdefinitions",
        features = "src/test/resources/features/prueba_sqa_1.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PruebaSQA1 {
}
