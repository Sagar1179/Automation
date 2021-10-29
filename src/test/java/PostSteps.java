import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("User should be logged in and should be present on his wall");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println("I type the message in the box");
    }

    @And("Click on the post button")
    public void clickOnThePostButton() {
        System.out.println("Click on the post button");
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("the message should get posted");
    }

    @When("User supply the youtube link in the text box")
    public void userSupplyTheYoutubeLinkInTheTextBox() {
        System.out.println("User supply the youtube link in the text box");
    }

    @Then("Then video should get posted on the user wall")
    public void thenVideoShouldGetPostedOnTheUserWall() {
        System.out.println("Then video should get posted on the user wall");
    }

    @And("the video should have proper thumbnail.")
    public void theVideoShouldHaveProperThumbnail() {
        System.out.println("the video should have proper thumbnail.");
    }
}
