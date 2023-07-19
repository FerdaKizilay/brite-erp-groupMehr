package com.brite.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "src/test/resources/feature",
        glue = "com/brite/step_definition",
        dryRun =false,
        tags = "@US03AC2",
        publish = true //generating a report with public link
        //, monochrome=true



)
public class CukesRunner { }


