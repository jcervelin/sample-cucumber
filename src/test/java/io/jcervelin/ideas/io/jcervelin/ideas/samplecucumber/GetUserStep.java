package io.jcervelin.ideas.io.jcervelin.ideas.samplecucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.jcervelin.ideas.samplecucumber.User;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GetUserStep extends CucumberRoot {

    private ResponseEntity<String> response; // output
    private ResponseEntity<User> responseUser; // output

    @When("^the client calls /users/1$")
    public void the_client_calls_user_id() {
        responseUser = template.getForEntity("/users/1", User.class);
    }

    @Then("^the client receives user with the name \\w+")
    public void the_client_receives_user() {
        User user = responseUser.getBody();
        assertThat("The user name is: ", user.getName(), is("John"));
    }

}