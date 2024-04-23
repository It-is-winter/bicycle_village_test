package group2.bicycle_village.common.dto;

public class ProductDTO {
    private int productSeq;
    private String Name;

    public ProductDTO() {}

    public ProductDTO(int productSeq, String name) {
        this.productSeq = productSeq;
        this.Name = name;
    }

    public int getProductSeq() {
        return productSeq;
    }

    public void setProductSeq(int productSeq) {
        this.productSeq = productSeq;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
