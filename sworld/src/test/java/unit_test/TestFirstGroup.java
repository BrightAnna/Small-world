package unit_test;

import clothes.Shirt;
import enums.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestFirstGroup {
    @Test(groups = "positive")
    public void shouldReturnShirtColor() {
        Shirt shirtColor = new Shirt(ShirtColor.BLACK);
        Assert.assertEquals(shirtColor.getColor(), ShirtColor.BLACK, "The color of the shirt should match");

    }

    @Test(groups = "negative")
    public void shouldReturnAnotherShirtColor() {
        Shirt shirtColor = new Shirt(ShirtColor.BROWN);
        ShirtColor unexpectedColor = ShirtColor.BLACK;
        ShirtColor actualColor = shirtColor.getColor();
        Assert.assertNotEquals(actualColor, unexpectedColor, "The color of the shirt should not match");
    }

    @Test(groups = "positive")
    public void shouldReturnShirtMaterial() {
        Shirt shirtMaterial = new Shirt(ShirtMaterial.COTTON);
        Assert.assertTrue(shirtMaterial.getMaterial() == ShirtMaterial.COTTON,
                "The material of the shirt should match");
    }

    @Test(groups = "negative")
    public void shouldReturnShirtMaterialNegative() {
        Shirt shirtMaterial = new Shirt(ShirtMaterial.COTTON);
        ShirtMaterial unexpectedMaterial = ShirtMaterial.LINEN;
        ShirtMaterial actualMaterial = shirtMaterial.getMaterial();
        Assert.assertTrue(actualMaterial != unexpectedMaterial,
                "The material of the shirt should not match");
    }

    @Test(groups = "negative")
    public void shouldReturnAnotherShirtMaterial() {
        Shirt shirtMaterial = new Shirt(ShirtMaterial.COTTON);
        ShirtMaterial expectedMaterial = ShirtMaterial.LINEN;
        ShirtMaterial actualMaterial = shirtMaterial.getMaterial();
        Assert.assertFalse(actualMaterial == expectedMaterial,
                "The material of the shirt should not match");

    }

}




