package Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {

        @Then("^I should see the userform page$")
        public void iShouldSeeTheUserPage() throws Throwable{
            // Write code here that turns the phrase abo)ve into concrete actions
            System.out.println("I should see userform page");
        }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Execute I navigate to the login page");

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on login button");

    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is " +username + " and password is "+password);
    }
}

