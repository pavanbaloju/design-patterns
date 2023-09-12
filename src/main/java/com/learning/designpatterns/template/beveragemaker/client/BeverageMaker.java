package com.learning.designpatterns.template.beveragemaker.client;

import com.learning.designpatterns.template.beveragemaker.concreteclasses.Coffee;
import com.learning.designpatterns.template.beveragemaker.concreteclasses.Tea;

public class BeverageMaker {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
