package com.brite.step_definition;

import com.brite.pages.RepairsPage;
import io.cucumber.java.en.Then;

public class US12_GizemStepDefs {

    RepairsPage repairsPage = new RepairsPage();

    @Then("Users can select all the repair orders by clicking the top checkbox.")
    public void users_can_select_all_the_repair_orders_by_clicking_the_top_checkbox() {

        repairsPage.checkBox.click();
        repairsPage.checkBox.isSelected();



    }
}
