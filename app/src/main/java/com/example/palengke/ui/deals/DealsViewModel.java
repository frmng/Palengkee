package com.example.palengke.ui.deals;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DealsViewModel extends ViewModel {

    private MutableLiveData<String[]> productTitles = new MutableLiveData<>();
    private MutableLiveData<String[]> productPrices = new MutableLiveData<>();
    private MutableLiveData<Integer[]> productImages = new MutableLiveData<>();
    private MutableLiveData<String[]> productQuantities = new MutableLiveData<>();

    public LiveData<String[]> getProductTitles() {
        return productTitles;
    }

    public LiveData<String[]> getProductPrices() {
        return productPrices;
    }

    public LiveData<Integer[]> getProductImages() {
        return productImages;
    }

    public LiveData<String[]> getProductQuantities() {
        return productQuantities;
    }

    public void setProductData(String[] titles, String[] prices, Integer[] images, String[] quantities) {
        productTitles.setValue(titles);
        productPrices.setValue(prices);
        productImages.setValue(images);
        productQuantities.setValue(quantities);
    }
}
