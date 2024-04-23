package group2.bicycle_village.common.dto;

public class ProductDTO {
    private long productSeq;
    private String Name;
    private long parentProduct;

    public ProductDTO() {}

    public ProductDTO(long productSeq, String name, long parentProduct) {
        this.productSeq = productSeq;
        this.Name = name;
    }

    public long getProductSeq() {
        return productSeq;
    }

    public void setProductSeq(long productSeq) {
        this.productSeq = productSeq;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public long getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(long parentProduct) {
        this.parentProduct = parentProduct;
    }
}
