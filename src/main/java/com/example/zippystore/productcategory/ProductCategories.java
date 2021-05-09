package com.example.zippystore.productcategory;

import javax.persistence.*;

@Entity
@Table(name = "tblProductCategory")
public class ProductCategories {

    @Id
    @SequenceGenerator(
            name = "product_category_sequence",
            sequenceName = "product_category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_category_sequence"
    )
    @Column(name = "product_category_id")
    private Long productCategoryId;

    @Column(name = "product_category_name")
    private String productCategoryName;

    public ProductCategories() {
    }

    public ProductCategories(Long productCategoryId, String productCategoryName) {
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}
