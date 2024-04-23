package group2.bicycle_village.common.dto;

public class AlarmDTO {
    private int alarmSeq;
    private String alarmContent;
    private int isSeen;
    private String linkURL;

    UserDTO user = new UserDTO();
    private int userSeq = user.getUserSeq();

    public AlarmDTO() {}
    public AlarmDTO(int alarmSeq, String alarmContent, int seen, String linkURL) {
        this.alarmSeq = alarmSeq;
        this.alarmContent = alarmContent;
        this.isSeen = isSeen;
        this.linkURL = linkURL;
    }

    public int getAlarmSeq() {
        return alarmSeq;
    }

    public void setAlarmSeq(int alarmSeq) {
        this.alarmSeq = alarmSeq;
    }

    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    public int getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(int isSeen) {
        this.isSeen = isSeen;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }
}
