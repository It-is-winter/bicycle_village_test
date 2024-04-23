package group2.bicycle_village.common.dto;

public class UserDTO {
    private int userSeq;
    private String userId;
    private String userPwd;
    private String userName;
    private String nickname;
    private String userEmail;
    private String userGender;
    private String userTel;
    private String regDate;
    private String editDate;
    private int status;

    public UserDTO() {}

    public UserDTO(int userSeq, String userId, String userPwd, String userName, String nickname, String userTel, String regDate, String editDate, int status) {
        this.userSeq = userSeq;
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.nickname = nickname;
        this.userTel = userTel;
        this.regDate = regDate;
        this.editDate = editDate;
        this.status = status;
    }

    public UserDTO(int userSeq, String userId, String userPwd, String userName, String nickname, String userEmail, String userGender, String userTel, String regDate, String editDate, int status) {
        this(userSeq, userId, userPwd, userName, nickname, userTel, regDate, editDate, status);
        this.userEmail = userEmail;
        this.userGender = userGender;
    }

    public int getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(int userSeq) {
        this.userSeq = userSeq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
