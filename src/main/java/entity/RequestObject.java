package entity;

public class RequestObject {

    String orgName;
    int orgId;
    int dptId;

    public RequestObject(String orgName, int orgId, int dptId) {
        this.orgName = orgName;
        this.orgId = orgId;
        this.dptId = dptId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public int getDptId() {
        return dptId;
    }

    public void setDptId(int dptId) {
        this.dptId = dptId;
    }
}
