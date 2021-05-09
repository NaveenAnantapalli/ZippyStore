package com.example.zippystore.merchantproductmapping;

import com.example.zippystore.merchant.Merchants;
import com.example.zippystore.product.Products;

import javax.persistence.*;

@Entity
@Table(name = "tblMerchantProductMapping")
public class MerchantProductMappings {

    @Id
    @SequenceGenerator(
            name = "merchantproduct_sequence",
            sequenceName = "merchantproduct_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "merchantproduct_sequence"
    )
    @Column(name = "mapping_id")
    private Long mappingId;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Products productId;

    @OneToOne
    @JoinColumn(name = "merchant_id")
    private Merchants merchantId;

    @Column(name = "weights")
    private String weights;

    public MerchantProductMappings() {
    }

}
