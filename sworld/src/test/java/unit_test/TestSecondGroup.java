package unit_test;

import clothes.Buttons;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSecondGroup {
    @Test(groups = "positive")
    public void shouldShowParticularListOfTVChannels() {
        String[] expectedTvChannels = {"TV1000", "FOX", "Sony Sci-fi", "DiscoveryTV" };
        String[] actualTvChannels = {"TV1000", "FOX", "Sony Sci-fi", "DiscoveryTV" };
        Assert.assertEquals(expectedTvChannels, actualTvChannels, "The arrays of strings should match");

    }


    @Test(groups = "positive")
    public void shouldShowListOfTVChannels() {
        String[] expectedTVChannels = {"TV1000", "FOX", "Sony Sci-fi", "DiscoveryTV" };
        String[] actualTVChannels = {"DiscoveryTV", "Sony Sci-fi", "FOX", "TV1000" };
        Assert.assertEqualsNoOrder(expectedTVChannels, actualTVChannels,
                "The arrays of strings should contain the same channels");

    }

    @Test(groups = "negative")
    public void shouldReturnThatSleevesHaveButtons() {
        Buttons shirtButtons = new Buttons(true);
        boolean haveSleevesButtons = shirtButtons.getHaveSleevesButtons();
        System.out.println(haveSleevesButtons);
        if (!haveSleevesButtons) {
            Assert.fail("Sleeves should have buttons");
        }
    }

    @Test(groups = "negative")
    public void shouldReadFromFile() {
        try {
            File userfile = new File("C:\\Users\\AnastasiaBabanskay\\sfile.txt");
            Scanner filescanner = new Scanner(userfile);
            ArrayList<String> dataFromFile = new ArrayList<>();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file doesn't exist. Create a file first");
        }

    }

}

