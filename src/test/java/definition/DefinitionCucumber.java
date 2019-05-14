package definition;

import com.brainacad.HttpClientHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpResponse;
import org.junit.Assert;

import java.io.IOException;


public class DefinitionCucumber {

    private static String URL;
    private static HttpResponse response;



    @Given("I have server by url {string}")
    public void i_have_server_by_url(String url) {
        // Write code here that turns the phrase above into concrete actions
        URL = url;

    }

    @When("I send GET request on endpoint {string} and parameters {string}")
    public void i_send_GET_request_on_endpoint_and_parameters(String endpoint, String parameters) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        response = HttpClientHelper.get(URL+endpoint, parameters);

    }

    @Then("I get response status code {int}")
    public void i_get_response_status_code(int responseCode) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(String.format("Response code should be %s", responseCode),
                response.getStatusLine().getStatusCode(),responseCode);

    }


    @Then("I get response body not null")
    public void iGetResponseBodyNotNull() throws IOException {
        Assert.assertNotEquals("Body shouldn't be null", null, HttpClientHelper.getBodyFromResponse(response));
    }

    @When("I send POST request on endpoint {string} and body {string}")
    public void iSendPOSTRequestOnEndpointAndBodyNameMorpheusJobLeader(int statusCode) throws IOException {

        Assert.assertEquals(String.format("Response status code should be %s", statusCode),
                statusCode, response.getStatusLine().getStatusCode());

    }
}
