package com.example.zippystore.productsubcategory;

import com.example.zippystore.productcategory.ProductCategories;

import javax.persistence.*;

@Entity
@Table(name = "tblProductSubcategory")
public class ProductSubcategories {

    @Id
    @SequenceGenerator(
            name = "product_subcategory_sequence",
            sequenceName = "product_subcategory_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_subcategory_sequence"
    )
    @Column(name = "product_subcategory_id")
    private Long productSubcategoryId;

    @Column(name = "product_subcategory_name")
    private String productSubcategoryName;

    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategories productCategoriesId;

    public ProductSubcategories() {
    }

    public ProductSubcategories(Long productSubcategoryId, String productSubcategoryName) {
        this.productSubcategoryId = productSubcategoryId;
        this.productSubcategoryName = productSubcategoryName;
    }

    public Long getProductSubcategoryId() {
        return productSubcategoryId;
    }

    public void setProductSubcategoryId(Long productSubcategoryId) {
        this.productSubcategoryId = productSubcategoryId;
    }

    public String getProductSubcategoryName() {
        return productSubcategoryName;
    }

    public void setProductSubcategoryName(String productSubcategoryName) {
        this.productSubcategoryName = productSubcategoryName;
    }
}

