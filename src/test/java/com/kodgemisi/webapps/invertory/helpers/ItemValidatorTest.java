package com.kodgemisi.webapps.invertory.helpers;


import com.kodgemisi.webapps.inventory.helpers.ItemValidator;

import org.junit.Assert;
import org.junit.Test;

public class ItemValidatorTest {

    @Test
    public void verifyRemoveableItem() {

        String itemRemoveable = "anyItem";
        String itemNotRemoveable = "Computer";

        Assert.assertTrue(itemRemoveable + " should be removed", ItemValidator.isItemRemoveable(itemRemoveable));
        Assert.assertFalse(itemNotRemoveable  + " should not be removed", ItemValidator.isItemRemoveable(itemNotRemoveable));
    }
}
