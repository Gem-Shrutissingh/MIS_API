package com.qa.mis.stepdefinitions;

import com.qa.mis.commonUtils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.HashMap;

public class FormsSteps {
    int status;
    @Given("^Set endpoint \"(.*)\" and method \"(.*)\"$")
    public void Login(String url, String method) throws Exception {
        HashMap<String,String> token=new HashMap<String,String>();
        token.put("Authorization", Utils.getAuthorization());
        status = Utils.loginUser(url, method,token).getStatus();
    }

    @Then("Verify status code {int}")
    public void check_status_code(int Expected) {
        Utils.verifyStatusCode(Expected, status);
    }
    @Given("^Set the endpoint \"(.*)\" and method \"(.*)\"$")
    public void hitApiWithoutPayload(String url, String method) throws Exception {
        HashMap<String,String> token=new HashMap<String,String>();
        System.out.println(Utils.getToken());
        token.put("Authorization", Utils.getAuthorization());
        token.put("UserAbrhs",Utils.getUser());
        token.put("Token",Utils.getToken());
        status = Utils.hitApiWithOutPayload(url, method,token).getStatus();
    }

    @Given("^Set the endpoint \"(.*)\" , method \"(.*)\" and \"(.*)\"$")
    public void hitApiWithPayload(String url, String method,String sampleName) throws Exception {
        HashMap<String,String> token=new HashMap<String,String>();
        System.out.println(Utils.getToken());
        token.put("Authorization", Utils.getAuthorization());
        token.put("UserAbrhs",Utils.getUser());
        token.put("Token",Utils.getToken());
        status = Utils.hitApiWithPayload(url, method,token,sampleName).getStatus();
    }
}
