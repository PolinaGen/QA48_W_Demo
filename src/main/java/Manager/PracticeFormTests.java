package Manager;

import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import static java.sql.DriverManager.getDriver;

public class PracticeFormTests extends AppManager{

    @Test
    public void studentRagFormPositiveTest() {
        new HomePage(getDriver()).clickBtnForm();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm();
    }
}
