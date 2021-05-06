package com.example.zippystore.merchant;

import javax.persistence.*;

@Entity
@Table(name = "tblMerchant")
public class Merchants {

    @Id
    @SequenceGenerator(
            name = "merchant_sequence",
            sequenceName = "merchant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "merchant_sequence"
    )
    @Column(name = "merchant_id")
    private Long merchantId;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "merchant_phone_number")
    private Long merchantPhoneNumber;

    @Column(name = "merchant_store_name")
    private String merchantStoreName;

    @Column(name = "merchant_store_number")
    private Long merchantStoreNumber;

    @Column(name = "merchant_gst_number")
    private String merchantGSTNumber;

    // The overall average should be calculated and updated here
    @Column(name = "merchant_rating")
    private Float merchantRating;

    public Merchants() {
    }

    public Merchants(Long merchantId, String merchantName, Long merchantPhoneNumber, String merchantStoreName, Long merchantStoreNumber, String merchantGSTNumber, Float merchantRating) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantPhoneNumber = merchantPhoneNumber;
        this.merchantStoreName = merchantStoreName;
        this.merchantStoreNumber = merchantStoreNumber;
        this.merchantGSTNumber = merchantGSTNumber;
        this.merchantRating = merchantRating;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Long getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(Long merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public String getMerchantStoreName() {
        return merchantStoreName;
    }

    public void setMerchantStoreName(String merchantStoreName) {
        this.merchantStoreName = merchantStoreName;
    }

    public Long getMerchantStoreNumber() {
        return merchantStoreNumber;
    }

    public void setMerchantStoreNumber(Long merchantStoreNumber) {
        this.merchantStoreNumber = merchantStoreNumber;
    }

    public String getMerchantGSTNumber() {
        return merchantGSTNumber;
    }

    public void setMerchantGSTNumber(String merchantGSTNumber) {
        this.merchantGSTNumber = merchantGSTNumber;
    }

    public Float getMerchantRating() {
        return merchantRating;
    }

    public void setMerchantRating(Float merchantRating) {
        this.merchantRating = merchantRating;
    }
}
