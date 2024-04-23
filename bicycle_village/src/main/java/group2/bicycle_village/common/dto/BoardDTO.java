package group2.bicycle_village.common.dto;

public class BoardDTO {
    private long boardSeq;
    private String boardName;
    private String regDate;
    private String userNickname;
    private int category;
    private String boardCategory;
    private int isSeen;
    private String boardContent;
    private String boardAddr;
    private String boardEdit;
    private int boardCount;
    private String goodsPrice;

    UserDTO user = new UserDTO();
    private long userSeq = user.getUserSeq();

    ProductDTO product = new ProductDTO();
    private long productSeq = product.getProductSeq();

    public BoardDTO() {}

    public BoardDTO(long boardSeq, String boardName, String regDate, String userNickname, int category, String boardCategory, int isSeen, String boardContent, String boardAddr, String boardEdit, int boardCount, String goodsPrice, long userSeq, long productSeq) {
        this.boardSeq = boardSeq;
        this.boardName = boardName;
        this.regDate = regDate;
        this.userNickname = userNickname;
        this.category = category;
        this.boardCategory = boardCategory;
        this.isSeen = isSeen;
        this.boardContent = boardContent;
        this.boardAddr = boardAddr;
        this.boardEdit = boardEdit;
        this.boardCount = boardCount;
        this.goodsPrice = goodsPrice;
        this.userSeq = userSeq;
        this.productSeq = productSeq;
    }

    public long getBoardSeq() {
        return boardSeq;
    }

    public void setBoardSeq(long boardSeq) {
        this.boardSeq = boardSeq;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getBoardCategory() {
        return boardCategory;
    }

    public void setBoardCategory(String boardCategory) {
        this.boardCategory = boardCategory;
    }

    public int getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(int isSeen) {
        this.isSeen = isSeen;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public String getBoardAddr() {
        return boardAddr;
    }

    public void setBoardAddr(String boardAddr) {
        this.boardAddr = boardAddr;
    }

    public String getBoardEdit() {
        return boardEdit;
    }

    public void setBoardEdit(String boardEdit) {
        this.boardEdit = boardEdit;
    }

    public int getBoardCount() {
        return boardCount;
    }

    public void setBoardCount(int boardCount) {
        this.boardCount = boardCount;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public long getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(long userSeq) {
        this.userSeq = userSeq;
    }

    public long getProductSeq() {
        return productSeq;
    }

    public void setProductSeq(long productSeq) {
        this.productSeq = productSeq;
    }
}
